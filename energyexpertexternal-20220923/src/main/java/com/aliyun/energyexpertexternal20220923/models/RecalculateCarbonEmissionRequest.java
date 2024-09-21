// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class RecalculateCarbonEmissionRequest extends TeaModel {
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
     * <p>Year of inventory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024</p>
     */
    @NameInMap("year")
    public String year;

    public static RecalculateCarbonEmissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RecalculateCarbonEmissionRequest self = new RecalculateCarbonEmissionRequest();
        return TeaModel.build(map, self);
    }

    public RecalculateCarbonEmissionRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecalculateCarbonEmissionRequest setYear(String year) {
        this.year = year;
        return this;
    }
    public String getYear() {
        return this.year;
    }

}
