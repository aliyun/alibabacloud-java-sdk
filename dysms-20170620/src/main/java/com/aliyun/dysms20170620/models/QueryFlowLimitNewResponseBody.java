// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryFlowLimitNewResponseBody extends TeaModel {
    @NameInMap("DailyLimit")
    public Long dailyLimit;

    @NameInMap("HourLimit")
    public Long hourLimit;

    @NameInMap("MinuteLimit")
    public Long minuteLimit;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryFlowLimitNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowLimitNewResponseBody self = new QueryFlowLimitNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFlowLimitNewResponseBody setDailyLimit(Long dailyLimit) {
        this.dailyLimit = dailyLimit;
        return this;
    }
    public Long getDailyLimit() {
        return this.dailyLimit;
    }

    public QueryFlowLimitNewResponseBody setHourLimit(Long hourLimit) {
        this.hourLimit = hourLimit;
        return this;
    }
    public Long getHourLimit() {
        return this.hourLimit;
    }

    public QueryFlowLimitNewResponseBody setMinuteLimit(Long minuteLimit) {
        this.minuteLimit = minuteLimit;
        return this;
    }
    public Long getMinuteLimit() {
        return this.minuteLimit;
    }

    public QueryFlowLimitNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
