// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightInventoryPriceCheckShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ZJTD</p>
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
     * <p>102000</p>
     */
    @NameInMap("order_price")
    public Long orderPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22111acaf9ea47c09ed0db6abc45be2d_0</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_list")
    public String passengerListShrink;

    /**
     * <strong>example:</strong>
     * <p>12412341234</p>
     */
    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static IntlFlightInventoryPriceCheckShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightInventoryPriceCheckShrinkRequest self = new IntlFlightInventoryPriceCheckShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightInventoryPriceCheckShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightInventoryPriceCheckShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public IntlFlightInventoryPriceCheckShrinkRequest setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    public IntlFlightInventoryPriceCheckShrinkRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public IntlFlightInventoryPriceCheckShrinkRequest setPassengerListShrink(String passengerListShrink) {
        this.passengerListShrink = passengerListShrink;
        return this;
    }
    public String getPassengerListShrink() {
        return this.passengerListShrink;
    }

    public IntlFlightInventoryPriceCheckShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public IntlFlightInventoryPriceCheckShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
