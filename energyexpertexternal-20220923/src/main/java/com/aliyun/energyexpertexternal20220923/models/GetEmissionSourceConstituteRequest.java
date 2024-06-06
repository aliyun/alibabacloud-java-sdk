// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetEmissionSourceConstituteRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Module code.</p>
     */
    @NameInMap("moduleCode")
    public String moduleCode;

    /**
     * <p>Module type.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("moduleType")
    public Integer moduleType;

    /**
     * <p>Year of inventory.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("year")
    public Integer year;

    public static GetEmissionSourceConstituteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmissionSourceConstituteRequest self = new GetEmissionSourceConstituteRequest();
        return TeaModel.build(map, self);
    }

    public GetEmissionSourceConstituteRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEmissionSourceConstituteRequest setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }

    public GetEmissionSourceConstituteRequest setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public Integer getModuleType() {
        return this.moduleType;
    }

    public GetEmissionSourceConstituteRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
