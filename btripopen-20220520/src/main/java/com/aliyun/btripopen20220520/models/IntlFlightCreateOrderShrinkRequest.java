// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightCreateOrderShrinkRequest extends TeaModel {
    @NameInMap("async_create_order_key")
    public String asyncCreateOrderKey;

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

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_price")
    public Long orderPrice;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_list")
    public String passengerListShrink;

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
