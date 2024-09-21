// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetCarbonEmissionTrendRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C-20240119-1</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Module code.</p>
     * 
     * <strong>example:</strong>
     * <p>carbonInventory.check.scope_1_direct_ghg_emissions</p>
     */
    @NameInMap("moduleCode")
    public String moduleCode;

    /**
     * <p>Module type.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("moduleType")
    public Integer moduleType;

    /**
     * <p>Trend Type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("trendType")
    public Integer trendType;

    /**
     * <p>The list of inventory year.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("yearList")
    public java.util.List<Integer> yearList;

    public static GetCarbonEmissionTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCarbonEmissionTrendRequest self = new GetCarbonEmissionTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetCarbonEmissionTrendRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCarbonEmissionTrendRequest setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }

    public GetCarbonEmissionTrendRequest setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public Integer getModuleType() {
        return this.moduleType;
    }

    public GetCarbonEmissionTrendRequest setTrendType(Integer trendType) {
        this.trendType = trendType;
        return this;
    }
    public Integer getTrendType() {
        return this.trendType;
    }

    public GetCarbonEmissionTrendRequest setYearList(java.util.List<Integer> yearList) {
        this.yearList = yearList;
        return this;
    }
    public java.util.List<Integer> getYearList() {
        return this.yearList;
    }

}
