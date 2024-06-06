// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class CarbonEmissionElecSummaryItem extends TeaModel {
    @NameInMap("carbonEmissionData")
    public Double carbonEmissionData;

    @NameInMap("dataUnit")
    public String dataUnit;

    @NameInMap("name")
    public String name;

    @NameInMap("ratio")
    public Double ratio;

    @NameInMap("rawData")
    public Double rawData;

    public static CarbonEmissionElecSummaryItem build(java.util.Map<String, ?> map) throws Exception {
        CarbonEmissionElecSummaryItem self = new CarbonEmissionElecSummaryItem();
        return TeaModel.build(map, self);
    }

    public CarbonEmissionElecSummaryItem setCarbonEmissionData(Double carbonEmissionData) {
        this.carbonEmissionData = carbonEmissionData;
        return this;
    }
    public Double getCarbonEmissionData() {
        return this.carbonEmissionData;
    }

    public CarbonEmissionElecSummaryItem setDataUnit(String dataUnit) {
        this.dataUnit = dataUnit;
        return this;
    }
    public String getDataUnit() {
        return this.dataUnit;
    }

    public CarbonEmissionElecSummaryItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CarbonEmissionElecSummaryItem setRatio(Double ratio) {
        this.ratio = ratio;
        return this;
    }
    public Double getRatio() {
        return this.ratio;
    }

    public CarbonEmissionElecSummaryItem setRawData(Double rawData) {
        this.rawData = rawData;
        return this;
    }
    public Double getRawData() {
        return this.rawData;
    }

}
