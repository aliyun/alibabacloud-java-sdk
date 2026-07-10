// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightListingSearchV2ShrinkRequest extends TeaModel {
    @NameInMap("airline_code")
    public String airlineCode;

    @NameInMap("cabin_type_list")
    public String cabinTypeListShrink;

    @NameInMap("direct_only")
    public Boolean directOnly;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("need_multi_class_price")
    public Boolean needMultiClassPrice;

    @NameInMap("need_query_service_fee")
    public Boolean needQueryServiceFee;

    @NameInMap("need_share_flight")
    public Boolean needShareFlight;

    @NameInMap("need_y_c_best_price")
    public Boolean needYCBestPrice;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("trip_type")
    public Integer tripType;

    public static FlightListingSearchV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightListingSearchV2ShrinkRequest self = new FlightListingSearchV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightListingSearchV2ShrinkRequest setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
        return this;
    }
    public String getAirlineCode() {
        return this.airlineCode;
    }

    public FlightListingSearchV2ShrinkRequest setCabinTypeListShrink(String cabinTypeListShrink) {
        this.cabinTypeListShrink = cabinTypeListShrink;
        return this;
    }
    public String getCabinTypeListShrink() {
        return this.cabinTypeListShrink;
    }

    public FlightListingSearchV2ShrinkRequest setDirectOnly(Boolean directOnly) {
        this.directOnly = directOnly;
        return this;
    }
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    public FlightListingSearchV2ShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightListingSearchV2ShrinkRequest setNeedMultiClassPrice(Boolean needMultiClassPrice) {
        this.needMultiClassPrice = needMultiClassPrice;
        return this;
    }
    public Boolean getNeedMultiClassPrice() {
        return this.needMultiClassPrice;
    }

    public FlightListingSearchV2ShrinkRequest setNeedQueryServiceFee(Boolean needQueryServiceFee) {
        this.needQueryServiceFee = needQueryServiceFee;
        return this;
    }
    public Boolean getNeedQueryServiceFee() {
        return this.needQueryServiceFee;
    }

    public FlightListingSearchV2ShrinkRequest setNeedShareFlight(Boolean needShareFlight) {
        this.needShareFlight = needShareFlight;
        return this;
    }
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    public FlightListingSearchV2ShrinkRequest setNeedYCBestPrice(Boolean needYCBestPrice) {
        this.needYCBestPrice = needYCBestPrice;
        return this;
    }
    public Boolean getNeedYCBestPrice() {
        return this.needYCBestPrice;
    }

    public FlightListingSearchV2ShrinkRequest setSearchJourneysShrink(String searchJourneysShrink) {
        this.searchJourneysShrink = searchJourneysShrink;
        return this;
    }
    public String getSearchJourneysShrink() {
        return this.searchJourneysShrink;
    }

    public FlightListingSearchV2ShrinkRequest setSearchMode(Integer searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public Integer getSearchMode() {
        return this.searchMode;
    }

    public FlightListingSearchV2ShrinkRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

}
