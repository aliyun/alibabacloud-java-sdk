// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopOtaSearchShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("out_wheel_search")
    public Boolean outWheelSearch;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_journey_group_key")
    public String passengerJourneyGroupKey;

    @NameInMap("re_shop_reason_code")
    public String reShopReasonCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public String searchJourneysShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public String selectedPassengersShrink;

    @NameInMap("token")
    public String token;

    public static IntlFlightReShopOtaSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopOtaSearchShrinkRequest self = new IntlFlightReShopOtaSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopOtaSearchShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopOtaSearchShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopOtaSearchShrinkRequest setOutWheelSearch(Boolean outWheelSearch) {
        this.outWheelSearch = outWheelSearch;
        return this;
    }
    public Boolean getOutWheelSearch() {
        return this.outWheelSearch;
    }

    public IntlFlightReShopOtaSearchShrinkRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightReShopOtaSearchShrinkRequest setReShopReasonCode(String reShopReasonCode) {
        this.reShopReasonCode = reShopReasonCode;
        return this;
    }
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    public IntlFlightReShopOtaSearchShrinkRequest setSearchJourneysShrink(String searchJourneysShrink) {
        this.searchJourneysShrink = searchJourneysShrink;
        return this;
    }
    public String getSearchJourneysShrink() {
        return this.searchJourneysShrink;
    }

    public IntlFlightReShopOtaSearchShrinkRequest setSelectedPassengersShrink(String selectedPassengersShrink) {
        this.selectedPassengersShrink = selectedPassengersShrink;
        return this;
    }
    public String getSelectedPassengersShrink() {
        return this.selectedPassengersShrink;
    }

    public IntlFlightReShopOtaSearchShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
