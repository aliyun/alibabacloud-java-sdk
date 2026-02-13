// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GwpInventoryConstitute extends TeaModel {
    /**
     * <p>Grouped by inventory resource type, this data reveals emissions details for each category. It serves the &quot;By type&quot; analysis in the composition breakdown. A nested structure is employed: total carbon emissions are organized first by inventory type, forming a two-level hierarchy, with the innermost level \&quot;byResource\&quot; currently empty.</p>
     */
    @NameInMap("byResourceType")
    public java.util.List<GwpResourceConstitute> byResourceType;

    /**
     * <p>Emission quantity</p>
     * 
     * <strong>example:</strong>
     * <p>1009.976265540000000000000000000000</p>
     */
    @NameInMap("carbonEmission")
    public Double carbonEmission;

    /**
     * <p>Organized hierarchically, it cascades from high to low: flow-&gt; process-&gt; inventory level. Employed for &quot;By inventory&quot; analysis in compositional breakdowns, the innermost layer of this nested structure is empty.</p>
     */
    @NameInMap("items")
    public java.util.List<GwpInventoryConstitute> items;

    /**
     * <p>Name</p>
     * 
     * <strong>example:</strong>
     * <p>Acquisition of Raw Materials</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Percentage of emissions, for example 100.00 means 100.00%.</p>
     * 
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("percent")
    public Double percent;

    /**
     * <p>Resouce type of inventory.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("resourceType")
    public Integer resourceType;

    /**
     * <p>Unit</p>
     * 
     * <strong>example:</strong>
     * <p>kgCO₂e/kg</p>
     */
    @NameInMap("unit")
    public String unit;

    public static GwpInventoryConstitute build(java.util.Map<String, ?> map) throws Exception {
        GwpInventoryConstitute self = new GwpInventoryConstitute();
        return TeaModel.build(map, self);
    }

    public GwpInventoryConstitute setByResourceType(java.util.List<GwpResourceConstitute> byResourceType) {
        this.byResourceType = byResourceType;
        return this;
    }
    public java.util.List<GwpResourceConstitute> getByResourceType() {
        return this.byResourceType;
    }

    public GwpInventoryConstitute setCarbonEmission(Double carbonEmission) {
        this.carbonEmission = carbonEmission;
        return this;
    }
    public Double getCarbonEmission() {
        return this.carbonEmission;
    }

    public GwpInventoryConstitute setItems(java.util.List<GwpInventoryConstitute> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GwpInventoryConstitute> getItems() {
        return this.items;
    }

    public GwpInventoryConstitute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GwpInventoryConstitute setPercent(Double percent) {
        this.percent = percent;
        return this;
    }
    public Double getPercent() {
        return this.percent;
    }

    public GwpInventoryConstitute setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public Integer getResourceType() {
        return this.resourceType;
    }

    public GwpInventoryConstitute setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
