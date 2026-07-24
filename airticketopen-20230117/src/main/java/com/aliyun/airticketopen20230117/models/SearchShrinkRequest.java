// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchShrinkRequest extends TeaModel {
    /**
     * <p>The number of adult passengers. Valid values: 1 to 9.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("adults")
    public Integer adults;

    /**
     * <p>The journey array.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("air_legs")
    public String airLegsShrink;

    /**
     * <p>The cabin class. Valid values: ALL_CABIN: all cabin classes. Y: economy class. FC: first class and business class. S: premium economy class. YS: economy class and premium economy class. YSC: economy class, premium economy class, and business class.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_CABIN</p>
     */
    @NameInMap("cabin_class")
    public String cabinClass;

    /**
     * <p>The number of child passengers. Valid values: 0 to 9.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("children")
    public Integer children;

    /**
     * <p>The number of infant passengers. Valid values: 0 to 9.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("infants")
    public Integer infants;

    /**
     * <p>The search control options. This parameter is optional.</p>
     */
    @NameInMap("search_control_options")
    public String searchControlOptionsShrink;

    public static SearchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchShrinkRequest self = new SearchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchShrinkRequest setAdults(Integer adults) {
        this.adults = adults;
        return this;
    }
    public Integer getAdults() {
        return this.adults;
    }

    public SearchShrinkRequest setAirLegsShrink(String airLegsShrink) {
        this.airLegsShrink = airLegsShrink;
        return this;
    }
    public String getAirLegsShrink() {
        return this.airLegsShrink;
    }

    public SearchShrinkRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public SearchShrinkRequest setChildren(Integer children) {
        this.children = children;
        return this;
    }
    public Integer getChildren() {
        return this.children;
    }

    public SearchShrinkRequest setInfants(Integer infants) {
        this.infants = infants;
        return this;
    }
    public Integer getInfants() {
        return this.infants;
    }

    public SearchShrinkRequest setSearchControlOptionsShrink(String searchControlOptionsShrink) {
        this.searchControlOptionsShrink = searchControlOptionsShrink;
        return this;
    }
    public String getSearchControlOptionsShrink() {
        return this.searchControlOptionsShrink;
    }

}
