// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class EnrichShrinkRequest extends TeaModel {
    @NameInMap("adults")
    public Integer adults;

    @NameInMap("cabin_class")
    public String cabinClass;

    @NameInMap("children")
    public Integer children;

    @NameInMap("infants")
    public Integer infants;

    @NameInMap("journey_param_list")
    public String journeyParamListShrink;

    @NameInMap("solution_id")
    public String solutionId;

    public static EnrichShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnrichShrinkRequest self = new EnrichShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnrichShrinkRequest setAdults(Integer adults) {
        this.adults = adults;
        return this;
    }
    public Integer getAdults() {
        return this.adults;
    }

    public EnrichShrinkRequest setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public String getCabinClass() {
        return this.cabinClass;
    }

    public EnrichShrinkRequest setChildren(Integer children) {
        this.children = children;
        return this;
    }
    public Integer getChildren() {
        return this.children;
    }

    public EnrichShrinkRequest setInfants(Integer infants) {
        this.infants = infants;
        return this;
    }
    public Integer getInfants() {
        return this.infants;
    }

    public EnrichShrinkRequest setJourneyParamListShrink(String journeyParamListShrink) {
        this.journeyParamListShrink = journeyParamListShrink;
        return this;
    }
    public String getJourneyParamListShrink() {
        return this.journeyParamListShrink;
    }

    public EnrichShrinkRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
