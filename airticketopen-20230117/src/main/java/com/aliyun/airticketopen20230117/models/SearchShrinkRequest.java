// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class SearchShrinkRequest extends TeaModel {
    @NameInMap("adults")
    public Integer adults;

    @NameInMap("air_legs")
    public String airLegsShrink;

    @NameInMap("cabin_class")
    public String cabinClass;

    @NameInMap("children")
    public Integer children;

    @NameInMap("infants")
    public Integer infants;

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

}
