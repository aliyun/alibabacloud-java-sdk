// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetAreaElecConstituteRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Z-20240115-2</p>
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

    public static GetAreaElecConstituteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAreaElecConstituteRequest self = new GetAreaElecConstituteRequest();
        return TeaModel.build(map, self);
    }

    public GetAreaElecConstituteRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAreaElecConstituteRequest setYear(Integer year) {
        this.year = year;
        return this;
    }
    public Integer getYear() {
        return this.year;
    }

}
