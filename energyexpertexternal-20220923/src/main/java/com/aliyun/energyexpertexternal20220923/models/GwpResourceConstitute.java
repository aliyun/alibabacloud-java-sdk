// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GwpResourceConstitute extends TeaModel {
    /**
     * <p>The carbon emissions. To ensure accuracy, retain 24 decimal places. We recommend that you intercept the carbon emissions.</p>
     * 
     * <strong>example:</strong>
     * <p>1009.976265540000000000000000000000</p>
     */
    @NameInMap("carbonEmission")
    public Double carbonEmission;

    /**
     * <p>Name signifies a concept with distinct layers of meaning, where the outermost layer represents the overall carbon emissions.</p>
     * 
     * <strong>example:</strong>
     * <p>Energy</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Percentage of emissions. 98.76 indicates the proportion of 98.76%.</p>
     * 
     * <strong>example:</strong>
     * <p>98.76</p>
     */
    @NameInMap("percent")
    public String percent;

    /**
     * <p>The type of the inventory. It is meaningful at the inventory layer and can be empty at other layers.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("resourceType")
    public Integer resourceType;

    /**
     * <p>unit of emissions.</p>
     * 
     * <strong>example:</strong>
     * <p>kgCO₂e/Piece(s)</p>
     */
    @NameInMap("unit")
    public String unit;

    public static GwpResourceConstitute build(java.util.Map<String, ?> map) throws Exception {
        GwpResourceConstitute self = new GwpResourceConstitute();
        return TeaModel.build(map, self);
    }

    public GwpResourceConstitute setCarbonEmission(Double carbonEmission) {
        this.carbonEmission = carbonEmission;
        return this;
    }
    public Double getCarbonEmission() {
        return this.carbonEmission;
    }

    public GwpResourceConstitute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GwpResourceConstitute setPercent(String percent) {
        this.percent = percent;
        return this;
    }
    public String getPercent() {
        return this.percent;
    }

    public GwpResourceConstitute setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public GwpResourceConstitute setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
