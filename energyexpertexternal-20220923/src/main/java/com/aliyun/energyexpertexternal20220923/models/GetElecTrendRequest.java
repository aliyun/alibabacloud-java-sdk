// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetElecTrendRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>List of years.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("yearList")
    public java.util.List<Integer> yearList;

    public static GetElecTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetElecTrendRequest self = new GetElecTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetElecTrendRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetElecTrendRequest setYearList(java.util.List<Integer> yearList) {
        this.yearList = yearList;
        return this;
    }
    public java.util.List<Integer> getYearList() {
        return this.yearList;
    }

}
