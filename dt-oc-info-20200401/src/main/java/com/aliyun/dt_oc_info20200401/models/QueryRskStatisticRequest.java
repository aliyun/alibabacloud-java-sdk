// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryRskStatisticRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OneCompId")
    public java.util.Map<String, ?> oneCompId;

    @NameInMap("RskType")
    public java.util.Map<String, ?> rskType;

    @NameInMap("StartDate")
    public String startDate;

    public static QueryRskStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRskStatisticRequest self = new QueryRskStatisticRequest();
        return TeaModel.build(map, self);
    }

    public QueryRskStatisticRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryRskStatisticRequest setOneCompId(java.util.Map<String, ?> oneCompId) {
        this.oneCompId = oneCompId;
        return this;
    }
    public java.util.Map<String, ?> getOneCompId() {
        return this.oneCompId;
    }

    public QueryRskStatisticRequest setRskType(java.util.Map<String, ?> rskType) {
        this.rskType = rskType;
        return this;
    }
    public java.util.Map<String, ?> getRskType() {
        return this.rskType;
    }

    public QueryRskStatisticRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
