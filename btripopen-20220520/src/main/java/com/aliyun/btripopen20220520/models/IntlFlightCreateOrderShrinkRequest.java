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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("async_create_order_mode")
    public Boolean asyncCreateOrderMode;

    @NameInMap("contact_info")
    public String contactInfoShrink;

    @NameInMap("cost_center")
    public String costCenterShrink;

    @NameInMap("extra_info")
    public String extraInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>open12k0lclldfdc7v10E2HaRrOr00</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>chinese</p>
     */
    @NameInMap("language")
    public String language;

    /**
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

    @NameInMap("passenger_list")
    public String passengerListShrink;

    /**
     * <strong>example:</strong>
     * <p>fcoid_deb6372db8194f1c94c23bc4fadc508d</p>
     */
    @NameInMap("render_key")
    public String renderKey;

    /**
     * <strong>example:</strong>
     * <p>120000</p>
     */
    @NameInMap("total_price_cent")
    public Long totalPriceCent;

    /**
     * <strong>example:</strong>
     * <p>12341234</p>
     */
    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

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

    public IntlFlightCreateOrderShrinkRequest setContactInfoShrink(String contactInfoShrink) {
        this.contactInfoShrink = contactInfoShrink;
        return this;
    }
    public String getContactInfoShrink() {
        return this.contactInfoShrink;
    }

    public IntlFlightCreateOrderShrinkRequest setCostCenterShrink(String costCenterShrink) {
        this.costCenterShrink = costCenterShrink;
        return this;
    }
    public String getCostCenterShrink() {
        return this.costCenterShrink;
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

    public IntlFlightCreateOrderShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
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

    public IntlFlightCreateOrderShrinkRequest setTotalPriceCent(Long totalPriceCent) {
        this.totalPriceCent = totalPriceCent;
        return this;
    }
    public Long getTotalPriceCent() {
        return this.totalPriceCent;
    }

    public IntlFlightCreateOrderShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IntlFlightCreateOrderShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
