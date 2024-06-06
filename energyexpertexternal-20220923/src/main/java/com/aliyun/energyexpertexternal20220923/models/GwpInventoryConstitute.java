// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GwpInventoryConstitute extends TeaModel {
    @NameInMap("byResourceType")
    public java.util.List<GwpResourceConstitute> byResourceType;

    @NameInMap("carbonEmission")
    public Double carbonEmission;

    @NameInMap("items")
    public java.util.List<GwpInventoryConstitute> items;

    @NameInMap("name")
    public String name;

    @NameInMap("percent")
    public Double percent;

    @NameInMap("resourceType")
    public Integer resourceType;

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
