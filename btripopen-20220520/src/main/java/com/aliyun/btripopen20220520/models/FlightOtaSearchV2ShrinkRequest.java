// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOtaSearchV2ShrinkRequest extends TeaModel {
    @NameInMap("cabin_type_list")
    public String cabinTypeListShrink;

    @NameInMap("direct_only")
    public Boolean directOnly;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("need_share_flight")
    public Boolean needShareFlight;

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

    public static FlightOtaSearchV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightOtaSearchV2ShrinkRequest self = new FlightOtaSearchV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlightOtaSearchV2ShrinkRequest setCabinTypeListShrink(String cabinTypeListShrink) {
        this.cabinTypeListShrink = cabinTypeListShrink;
        return this;
    }
    public String getCabinTypeListShrink() {
        return this.cabinTypeListShrink;
    }

    public FlightOtaSearchV2ShrinkRequest setDirectOnly(Boolean directOnly) {
        this.directOnly = directOnly;
        return this;
    }
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    public FlightOtaSearchV2ShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightOtaSearchV2ShrinkRequest setNeedShareFlight(Boolean needShareFlight) {
        this.needShareFlight = needShareFlight;
        return this;
    }
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    public FlightOtaSearchV2ShrinkRequest setSearchJourneysShrink(String searchJourneysShrink) {
        this.searchJourneysShrink = searchJourneysShrink;
        return this;
    }
    public String getSearchJourneysShrink() {
        return this.searchJourneysShrink;
    }

    public FlightOtaSearchV2ShrinkRequest setSearchMode(Integer searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public Integer getSearchMode() {
        return this.searchMode;
    }

    public FlightOtaSearchV2ShrinkRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

}
