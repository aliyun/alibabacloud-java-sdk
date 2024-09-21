// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEmissionSummaryRequest extends TeaModel {
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
     * <p>Year of inventory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("year")
    public Integer year;

    public static GetEmissionSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmissionSummaryRequest self = new GetEmissionSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetEmissionSummaryRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEmissionSummaryRequest setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }

    public GetEmissionSummaryRequest setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public Integer getModuleType() {
        return this.moduleType;
    }

    public GetEmissionSummaryRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
