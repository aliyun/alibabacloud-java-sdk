// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightListingSearchShrinkRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cabin_type")
    public Integer cabinType;

    @NameInMap("direct_only")
    public Boolean directOnly;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("language")
    public String language;

    @NameInMap("need_share_flight")
    public Boolean needShareFlight;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("out_wheel_search")
    public Boolean outWheelSearch;

    @NameInMap("query_record_id")
    public String queryRecordId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public String searchJourneysShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_mode")
    public Integer searchMode;

    @NameInMap("search_passenger_list")
    public String searchPassengerListShrink;

    @NameInMap("supplier_code")
    public String supplierCode;

    @NameInMap("token")
    public String token;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("trip_type")
    public Integer tripType;

    public static IntlFlightListingSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightListingSearchShrinkRequest self = new IntlFlightListingSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightListingSearchShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightListingSearchShrinkRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IntlFlightListingSearchShrinkRequest setCabinType(Integer cabinType) {
        this.cabinType = cabinType;
        return this;
    }
    public Integer getCabinType() {
        return this.cabinType;
    }

    public IntlFlightListingSearchShrinkRequest setDirectOnly(Boolean directOnly) {
        this.directOnly = directOnly;
        return this;
    }
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    public IntlFlightListingSearchShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightListingSearchShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public IntlFlightListingSearchShrinkRequest setNeedShareFlight(Boolean needShareFlight) {
        this.needShareFlight = needShareFlight;
        return this;
    }
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    public IntlFlightListingSearchShrinkRequest setOutWheelSearch(Boolean outWheelSearch) {
        this.outWheelSearch = outWheelSearch;
        return this;
    }
    public Boolean getOutWheelSearch() {
        return this.outWheelSearch;
    }

    public IntlFlightListingSearchShrinkRequest setQueryRecordId(String queryRecordId) {
        this.queryRecordId = queryRecordId;
        return this;
    }
    public String getQueryRecordId() {
        return this.queryRecordId;
    }

    public IntlFlightListingSearchShrinkRequest setSearchJourneysShrink(String searchJourneysShrink) {
        this.searchJourneysShrink = searchJourneysShrink;
        return this;
    }
    public String getSearchJourneysShrink() {
        return this.searchJourneysShrink;
    }

    public IntlFlightListingSearchShrinkRequest setSearchMode(Integer searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public Integer getSearchMode() {
        return this.searchMode;
    }

    public IntlFlightListingSearchShrinkRequest setSearchPassengerListShrink(String searchPassengerListShrink) {
        this.searchPassengerListShrink = searchPassengerListShrink;
        return this;
    }
    public String getSearchPassengerListShrink() {
        return this.searchPassengerListShrink;
    }

    public IntlFlightListingSearchShrinkRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

    public IntlFlightListingSearchShrinkRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public IntlFlightListingSearchShrinkRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

}
