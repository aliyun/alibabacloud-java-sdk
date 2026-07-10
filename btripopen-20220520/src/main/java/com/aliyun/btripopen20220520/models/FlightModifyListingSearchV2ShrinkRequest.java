// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyListingSearchV2ShrinkRequest extends TeaModel {
    @NameInMap("cabin_class")
    public String cabinClassShrink;

    @NameInMap("dep_date")
    public String depDateShrink;

    @NameInMap("interface_caller_is_support_retry")
    public Boolean interfaceCallerIsSupportRetry;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("passenger_segment_relations")
    public String passengerSegmentRelationsShrink;

    @NameInMap("search_mode")
    public Integer searchMode;

    @NameInMap("search_retry_token")
    public String searchRetryToken;

    @NameInMap("selected_segments")
    public String selectedSegmentsShrink;

    @NameInMap("session_id")
    public String sessionId;

    @NameInMap("voluntary")
    public Boolean voluntary;

    public static FlightModifyListingSearchV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyListingSearchV2ShrinkRequest self = new FlightModifyListingSearchV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightModifyListingSearchV2ShrinkRequest setCabinClassShrink(String cabinClassShrink) {
        this.cabinClassShrink = cabinClassShrink;
        return this;
    }
    public String getCabinClassShrink() {
        return this.cabinClassShrink;
    }

    public FlightModifyListingSearchV2ShrinkRequest setDepDateShrink(String depDateShrink) {
        this.depDateShrink = depDateShrink;
        return this;
    }
    public String getDepDateShrink() {
        return this.depDateShrink;
    }

    public FlightModifyListingSearchV2ShrinkRequest setInterfaceCallerIsSupportRetry(Boolean interfaceCallerIsSupportRetry) {
        this.interfaceCallerIsSupportRetry = interfaceCallerIsSupportRetry;
        return this;
    }
    public Boolean getInterfaceCallerIsSupportRetry() {
        return this.interfaceCallerIsSupportRetry;
    }

    public FlightModifyListingSearchV2ShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyListingSearchV2ShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightModifyListingSearchV2ShrinkRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightModifyListingSearchV2ShrinkRequest setPassengerSegmentRelationsShrink(String passengerSegmentRelationsShrink) {
        this.passengerSegmentRelationsShrink = passengerSegmentRelationsShrink;
        return this;
    }
    public String getPassengerSegmentRelationsShrink() {
        return this.passengerSegmentRelationsShrink;
    }

    public FlightModifyListingSearchV2ShrinkRequest setSearchMode(Integer searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public Integer getSearchMode() {
        return this.searchMode;
    }

    public FlightModifyListingSearchV2ShrinkRequest setSearchRetryToken(String searchRetryToken) {
        this.searchRetryToken = searchRetryToken;
        return this;
    }
    public String getSearchRetryToken() {
        return this.searchRetryToken;
    }

    public FlightModifyListingSearchV2ShrinkRequest setSelectedSegmentsShrink(String selectedSegmentsShrink) {
        this.selectedSegmentsShrink = selectedSegmentsShrink;
        return this;
    }
    public String getSelectedSegmentsShrink() {
        return this.selectedSegmentsShrink;
    }

    public FlightModifyListingSearchV2ShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FlightModifyListingSearchV2ShrinkRequest setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

}
