// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class EnrichShrinkRequest extends TeaModel {
    /**
     * <p>Number of adult passengers (1-9)</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("adults")
    public Integer adults;

    /**
     * <p>Cabin class: ALL_CABIN: All cabin classes; Y: Economy; FC: First Class and Business Class; S: Premium Economy; YS: Economy and Premium Economy; YSC: Economy, Premium Economy, and Business Class;</p>
     * 
     * <strong>example:</strong>
     * <p>ALL_CABIN</p>
     */
    @NameInMap("cabin_class")
    public String cabinClass;

    /**
     * <p>Number of child passengers (0-9)</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("children")
    public Integer children;

    /**
     * <p>Number of infant passengers (0-9)</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("infants")
    public Integer infants;

    /**
     * <p>Trip information</p>
     */
    @NameInMap("journey_param_list")
    public String journeyParamListShrink;

    /**
     * <p>The <code>solution_id</code> returned by the Search interface</p>
     * 
     * <strong>example:</strong>
     * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
     */
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
