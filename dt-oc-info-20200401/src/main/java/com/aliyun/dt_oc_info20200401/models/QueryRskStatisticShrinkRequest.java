// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryRskStatisticShrinkRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("OneCompId")
    public String oneCompIdShrink;

    @NameInMap("RskType")
    public String rskTypeShrink;

    @NameInMap("StartDate")
    public String startDate;

    public static QueryRskStatisticShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRskStatisticShrinkRequest self = new QueryRskStatisticShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryRskStatisticShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryRskStatisticShrinkRequest setOneCompIdShrink(String oneCompIdShrink) {
        this.oneCompIdShrink = oneCompIdShrink;
        return this;
    }
    public String getOneCompIdShrink() {
        return this.oneCompIdShrink;
    }

    public QueryRskStatisticShrinkRequest setRskTypeShrink(String rskTypeShrink) {
        this.rskTypeShrink = rskTypeShrink;
        return this;
    }
    public String getRskTypeShrink() {
        return this.rskTypeShrink;
    }

    public QueryRskStatisticShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
