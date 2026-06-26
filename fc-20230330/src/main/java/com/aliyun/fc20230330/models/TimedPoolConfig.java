// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class TimedPoolConfig extends TeaModel {
    @NameInMap("effectiveEndDate")
    public String effectiveEndDate;

    @NameInMap("effectiveStartDate")
    public String effectiveStartDate;

    @NameInMap("elasticIntervals")
    public java.util.List<ElasticInterval> elasticIntervals;

    @NameInMap("timeZone")
    public String timeZone;

    public static TimedPoolConfig build(java.util.Map<String, ?> map) throws Exception {
        TimedPoolConfig self = new TimedPoolConfig();
        return TeaModel.build(map, self);
    }

    public TimedPoolConfig setEffectiveEndDate(String effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
        return this;
    }
    public String getEffectiveEndDate() {
        return this.effectiveEndDate;
    }

    public TimedPoolConfig setEffectiveStartDate(String effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
        return this;
    }
    public String getEffectiveStartDate() {
        return this.effectiveStartDate;
    }

    public TimedPoolConfig setElasticIntervals(java.util.List<ElasticInterval> elasticIntervals) {
        this.elasticIntervals = elasticIntervals;
        return this;
    }
    public java.util.List<ElasticInterval> getElasticIntervals() {
        return this.elasticIntervals;
    }

    public TimedPoolConfig setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

}
