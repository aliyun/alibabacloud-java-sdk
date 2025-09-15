// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightOtaSearchShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10023</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cabin_type")
    public Integer cabinType;

    /**
     * <strong>example:</strong>
     * <p>open12igetbis4o07v10B1TlOWcM00</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("search_journeys")
    public String searchJourneysShrink;

    @NameInMap("search_passenger_list")
    public String searchPassengerListShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public IntlFlightOtaSearchShrinkRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
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

    public IntlFlightOtaSearchShrinkRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

}
