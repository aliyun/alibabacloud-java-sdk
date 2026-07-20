// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopListSearchShrinkRequest extends TeaModel {
    /**
     * <p>The business travel order ID. Required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002027205317939247</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>The external order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3985893777358602240</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>Specifies whether external polling is enabled. When enabled, the external frontend controls polling to reduce the response time of a single search. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("out_wheel_search")
    public Boolean outWheelSearch;

    /**
     * <p>The rebooking group key returned by the consultation API.</p>
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
     * <p>The list of journeys selected for rebooking.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public String searchJourneysShrink;

    /**
     * <p>The list of passengers selected for rebooking.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("selected_passengers")
    public String selectedPassengersShrink;

    /**
     * <p>The query record token for external polling.</p>
     * 
     * <strong>example:</strong>
     * <p>0305b8203a7767626f911d97a91a9473</p>
     */
    @NameInMap("token")
    public String token;

    public static IntlFlightReShopListSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopListSearchShrinkRequest self = new IntlFlightReShopListSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopListSearchShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public IntlFlightReShopListSearchShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightReShopListSearchShrinkRequest setOutWheelSearch(Boolean outWheelSearch) {
        this.outWheelSearch = outWheelSearch;
        return this;
    }
    public Boolean getOutWheelSearch() {
        return this.outWheelSearch;
    }

    public IntlFlightReShopListSearchShrinkRequest setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
        this.passengerJourneyGroupKey = passengerJourneyGroupKey;
        return this;
    }
    public String getPassengerJourneyGroupKey() {
        return this.passengerJourneyGroupKey;
    }

    public IntlFlightReShopListSearchShrinkRequest setReShopReasonCode(String reShopReasonCode) {
        this.reShopReasonCode = reShopReasonCode;
        return this;
    }
    public String getReShopReasonCode() {
        return this.reShopReasonCode;
    }

    public IntlFlightReShopListSearchShrinkRequest setSearchJourneysShrink(String searchJourneysShrink) {
        this.searchJourneysShrink = searchJourneysShrink;
        return this;
    }
    public String getSearchJourneysShrink() {
        return this.searchJourneysShrink;
    }

    public IntlFlightReShopListSearchShrinkRequest setSelectedPassengersShrink(String selectedPassengersShrink) {
        this.selectedPassengersShrink = selectedPassengersShrink;
        return this;
    }
    public String getSelectedPassengersShrink() {
        return this.selectedPassengersShrink;
    }

    public IntlFlightReShopListSearchShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
