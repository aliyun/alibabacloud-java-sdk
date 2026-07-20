// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopOtaSearchShrinkRequest extends TeaModel {
    /**
     * <p>The business travel order ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1017089206331988332</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>The external order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>JP2024071800000002</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>Specifies whether to enable external polling. When enabled, the external frontend controls polling, which reduces the response time (RT) of a single search. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("out_wheel_search")
    public Boolean outWheelSearch;

    /**
     * <p>The rebooking group key returned by the consultation operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
     */
    @NameInMap("passenger_journey_group_key")
    public String passengerJourneyGroupKey;

    /**
     * <p>The rebooking reason code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("re_shop_reason_code")
    public String reShopReasonCode;

    /**
     * <p>The search journeys. Only pass the journeys to be rebooked.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public String searchJourneysShrink;

    /**
     * <p>The list of selected passengers for rebooking.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public String selectedPassengersShrink;

    /**
     * <p>The query record token used for external polling.</p>
     * 
     * <strong>example:</strong>
     * <p>9960b412-cc05-4d10-b570-93372d816807</p>
     */
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
