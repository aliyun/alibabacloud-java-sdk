// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CursorRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Matchers")
    public java.util.List<Matcher> matchers;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("StartTime")
    public String startTime;

    public static CursorRequest build(java.util.Map<String, ?> map) throws Exception {
        CursorRequest self = new CursorRequest();
        return TeaModel.build(map, self);
    }

    public CursorRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CursorRequest setMatchers(java.util.List<Matcher> matchers) {
        this.matchers = matchers;
        return this;
    }
    public java.util.List<Matcher> getMatchers() {
        return this.matchers;
    }

    public CursorRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public CursorRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CursorRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CursorRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
