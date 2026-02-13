// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class CarbonEmissionElecSummaryItem extends TeaModel {
    /**
     * <p>Carbon Equivalent.</p>
     * 
     * <strong>example:</strong>
     * <p>1.22</p>
     */
    @NameInMap("carbonEmissionData")
    public Double carbonEmissionData;

    /**
     * <p>The price unit.</p>
     * 
     * <strong>example:</strong>
     * <p>kg</p>
     */
    @NameInMap("dataUnit")
    public String dataUnit;

    /**
     * <p>The enterprise name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The percentage of electricity consumption. Valid values: 0 to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0.22</p>
     */
    @NameInMap("ratio")
    public Double ratio;

    /**
     * <p>Electricity consumption in Kwh.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2</p>
     */
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
