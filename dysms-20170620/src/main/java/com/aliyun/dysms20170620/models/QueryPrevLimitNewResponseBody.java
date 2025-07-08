// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryPrevLimitNewResponseBody extends TeaModel {
    @NameInMap("HourLimit")
    public Long hourLimit;

    @NameInMap("IncreaseRate")
    public Integer increaseRate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessRate")
    public Integer successRate;

    public static QueryPrevLimitNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPrevLimitNewResponseBody self = new QueryPrevLimitNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPrevLimitNewResponseBody setHourLimit(Long hourLimit) {
        this.hourLimit = hourLimit;
        return this;
    }
    public Long getHourLimit() {
        return this.hourLimit;
    }

    public QueryPrevLimitNewResponseBody setIncreaseRate(Integer increaseRate) {
        this.increaseRate = increaseRate;
        return this;
    }
    public Integer getIncreaseRate() {
        return this.increaseRate;
    }

    public QueryPrevLimitNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPrevLimitNewResponseBody setSuccessRate(Integer successRate) {
        this.successRate = successRate;
        return this;
    }
    public Integer getSuccessRate() {
        return this.successRate;
    }

}
