// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GwpResourceConstitute extends TeaModel {
    @NameInMap("carbonEmission")
    public Double carbonEmission;

    @NameInMap("name")
    public String name;

    @NameInMap("percent")
    public String percent;

    @NameInMap("resourceType")
    public Integer resourceType;

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
