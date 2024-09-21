// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetElecConstituteRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C-20240202-01</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Year.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("year")
    public Integer year;

    public static GetElecConstituteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetElecConstituteRequest self = new GetElecConstituteRequest();
        return TeaModel.build(map, self);
    }

    public GetElecConstituteRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetElecConstituteRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
