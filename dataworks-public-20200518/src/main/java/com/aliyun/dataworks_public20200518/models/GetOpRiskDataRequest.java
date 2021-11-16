// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetOpRiskDataRequest extends TeaModel {
    @NameInMap("Date")
    public String date;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RiskType")
    public String riskType;

    public static GetOpRiskDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpRiskDataRequest self = new GetOpRiskDataRequest();
        return TeaModel.build(map, self);
    }

    public GetOpRiskDataRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetOpRiskDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetOpRiskDataRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetOpRiskDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOpRiskDataRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

}
