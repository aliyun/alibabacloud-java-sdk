// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOtaSearchShrinkRequest extends TeaModel {
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

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("language")
    public String language;

    @NameInMap("need_share_flight")
    public Boolean needShareFlight;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public String searchJourneysShrink;

    @NameInMap("search_passenger_list")
    public String searchPassengerListShrink;

    @NameInMap("supplier_code")
    public String supplierCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("trip_type")
    public Integer tripType;

    public static IntlFlightOtaSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightOtaSearchShrinkRequest self = new IntlFlightOtaSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightOtaSearchShrinkRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightOtaSearchShrinkRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IntlFlightOtaSearchShrinkRequest setCabinType(Integer cabinType) {
        this.cabinType = cabinType;
        return this;
    }
    public Integer getCabinType() {
        return this.cabinType;
    }

    public IntlFlightOtaSearchShrinkRequest setDirectOnly(Boolean directOnly) {
        this.directOnly = directOnly;
        return this;
    }
    public Boolean getDirectOnly() {
        return this.directOnly;
    }

    public IntlFlightOtaSearchShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightOtaSearchShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public IntlFlightOtaSearchShrinkRequest setNeedShareFlight(Boolean needShareFlight) {
        this.needShareFlight = needShareFlight;
        return this;
    }
    public Boolean getNeedShareFlight() {
        return this.needShareFlight;
    }

    public IntlFlightOtaSearchShrinkRequest setSearchJourneysShrink(String searchJourneysShrink) {
        this.searchJourneysShrink = searchJourneysShrink;
        return this;
    }
    public String getSearchJourneysShrink() {
        return this.searchJourneysShrink;
    }

    public IntlFlightOtaSearchShrinkRequest setSearchPassengerListShrink(String searchPassengerListShrink) {
        this.searchPassengerListShrink = searchPassengerListShrink;
        return this;
    }
    public String getSearchPassengerListShrink() {
        return this.searchPassengerListShrink;
    }

    public IntlFlightOtaSearchShrinkRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

    public IntlFlightOtaSearchShrinkRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

}
