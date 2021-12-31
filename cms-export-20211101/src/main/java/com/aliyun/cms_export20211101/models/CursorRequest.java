// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms_export20211101.models;

import com.aliyun.tea.*;

public class CursorRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Matchers")
    public java.util.List<CursorRequestMatchers> matchers;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("StartTime")
    public Long startTime;

    public static CursorRequest build(java.util.Map<String, ?> map) throws Exception {
        CursorRequest self = new CursorRequest();
        return TeaModel.build(map, self);
    }

    public CursorRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CursorRequest setMatchers(java.util.List<CursorRequestMatchers> matchers) {
        this.matchers = matchers;
        return this;
    }
    public java.util.List<CursorRequestMatchers> getMatchers() {
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

    public CursorRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class CursorRequestMatchers extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static CursorRequestMatchers build(java.util.Map<String, ?> map) throws Exception {
            CursorRequestMatchers self = new CursorRequestMatchers();
            return TeaModel.build(map, self);
        }

        public CursorRequestMatchers setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public CursorRequestMatchers setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CursorRequestMatchers setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
