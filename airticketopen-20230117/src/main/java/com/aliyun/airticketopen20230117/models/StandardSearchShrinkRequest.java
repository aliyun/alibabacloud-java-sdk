// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class StandardSearchShrinkRequest extends TeaModel {
    /**
     * <p>Number of adult passengers, range 1-9</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("adults")
    public Integer adults;

    /**
     * <p>Journey array. At least one of departure_city and departure_airport_list must be non-empty; when departure_airport_list has values, they must belong to the same city. At least one of arrival_city and arrival_airport_list must be non-empty; when arrival_airport_list has values, they must belong to the same city.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("air_legs")
    public String airLegsShrink;

    /**
     * <p>Defaults to ALL_CABIN if not specified. Cabin class ALL_CABIN: All cabin classes; Y: Economy class; FC: First class and Business class; S: Premium Economy class; YS: Economy class and Premium Economy class; YSC: Economy class, Premium Economy class, and Business class;</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_CABIN</p>
     */
    @NameInMap("cabin_class")
    public String cabinClass;

    /**
     * <p>Number of child passengers, range 0-9</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("children")
    public Integer children;

    /**
     * <p>Number of infant passengers, range 0-9</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("infants")
    public Integer infants;

    /**
     * <p>Search control options, optional</p>
     */
    @NameInMap("search_control_options")
    public String searchControlOptionsShrink;

    public static StandardSearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StandardSearchShrinkRequest self = new StandardSearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StandardSearchShrinkRequest setAdults(Integer adults) {
        this.adults = adults;
        return this;
    }
    public Integer getAdults() {
        return this.adults;
    }

    public StandardSearchShrinkRequest setAirLegsShrink(String airLegsShrink) {
        this.airLegsShrink = airLegsShrink;
        return this;
    }
    public String getAirLegsShrink() {
        return this.airLegsShrink;
    }

    public StandardSearchShrinkRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public StandardSearchShrinkRequest setChildren(Integer children) {
        this.children = children;
        return this;
    }
    public Integer getChildren() {
        return this.children;
    }

    public StandardSearchShrinkRequest setInfants(Integer infants) {
        this.infants = infants;
        return this;
    }
    public Integer getInfants() {
        return this.infants;
    }

    public StandardSearchShrinkRequest setSearchControlOptionsShrink(String searchControlOptionsShrink) {
        this.searchControlOptionsShrink = searchControlOptionsShrink;
        return this;
    }
    public String getSearchControlOptionsShrink() {
        return this.searchControlOptionsShrink;
    }

}
