// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightCreateOrderShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fcoid_deb6372db8194f1c94c23bc4fadc508d</p>
     */
    @NameInMap("async_create_order_key")
    public String asyncCreateOrderKey;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("async_create_order_mode")
    public Boolean asyncCreateOrderMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZHANG/SAN</p>
     */
    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact_info")
    public String contactInfoShrink;

    @NameInMap("extra_info")
    public String extraInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>open12k0lclldfdc7v10E2HaRrOr00</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_price")
    public Long orderPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>56319a175bdf4b1898190bd7edb603b5_0</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    /**
     * <strong>example:</strong>
     * <p>F11380075736888770560</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_list")
    public String passengerListShrink;

    /**
     * <strong>example:</strong>
     * <p>fcoid_deb6372db8194f1c94c23bc4fadc508d</p>
     */
    @NameInMap("render_key")
    public String renderKey;

    public static IntlFlightCreateOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightCreateOrderShrinkRequest self = new IntlFlightCreateOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightCreateOrderShrinkRequest setAsyncCreateOrderKey(String asyncCreateOrderKey) {
        this.asyncCreateOrderKey = asyncCreateOrderKey;
        return this;
    }
    public String getAsyncCreateOrderKey() {
        return this.asyncCreateOrderKey;
    }

    public IntlFlightCreateOrderShrinkRequest setAsyncCreateOrderMode(Boolean asyncCreateOrderMode) {
        this.asyncCreateOrderMode = asyncCreateOrderMode;
        return this;
    }
    public Boolean getAsyncCreateOrderMode() {
        return this.asyncCreateOrderMode;
    }

    public IntlFlightCreateOrderShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightCreateOrderShrinkRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IntlFlightCreateOrderShrinkRequest setContactInfoShrink(String contactInfoShrink) {
        this.contactInfoShrink = contactInfoShrink;
        return this;
    }
    public String getContactInfoShrink() {
        return this.contactInfoShrink;
    }

    public IntlFlightCreateOrderShrinkRequest setExtraInfoShrink(String extraInfoShrink) {
        this.extraInfoShrink = extraInfoShrink;
        return this;
    }
    public String getExtraInfoShrink() {
        return this.extraInfoShrink;
    }

    public IntlFlightCreateOrderShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightCreateOrderShrinkRequest setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    public IntlFlightCreateOrderShrinkRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public IntlFlightCreateOrderShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightCreateOrderShrinkRequest setPassengerListShrink(String passengerListShrink) {
        this.passengerListShrink = passengerListShrink;
        return this;
    }
    public String getPassengerListShrink() {
        return this.passengerListShrink;
    }

    public IntlFlightCreateOrderShrinkRequest setRenderKey(String renderKey) {
        this.renderKey = renderKey;
        return this;
    }
    public String getRenderKey() {
        return this.renderKey;
    }

}
