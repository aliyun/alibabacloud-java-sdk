// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CursorShrinkRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Matchers")
    public String matchersShrink;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("StartTime")
    public String startTime;

    public static CursorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CursorShrinkRequest self = new CursorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CursorShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CursorShrinkRequest setMatchersShrink(String matchersShrink) {
        this.matchersShrink = matchersShrink;
        return this;
    }
    public String getMatchersShrink() {
        return this.matchersShrink;
    }

    public CursorShrinkRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public CursorShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CursorShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CursorShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
