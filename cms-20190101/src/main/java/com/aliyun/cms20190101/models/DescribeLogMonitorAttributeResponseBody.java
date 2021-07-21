// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("LogMonitor")
    public DescribeLogMonitorAttributeResponseBodyLogMonitor logMonitor;

    public static DescribeLogMonitorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogMonitorAttributeResponseBody self = new DescribeLogMonitorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogMonitorAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeLogMonitorAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogMonitorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogMonitorAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeLogMonitorAttributeResponseBody setLogMonitor(DescribeLogMonitorAttributeResponseBodyLogMonitor logMonitor) {
        this.logMonitor = logMonitor;
        return this;
    }
    public DescribeLogMonitorAttributeResponseBodyLogMonitor getLogMonitor() {
        return this.logMonitor;
    }

    public static class DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        @NameInMap("Function")
        public String function;

        @NameInMap("Alias")
        public String alias;

        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates self = new DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates();
            return TeaModel.build(map, self);
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

    public static class DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Operator")
        public String operator;

        public static DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter self = new DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter();
            return TeaModel.build(map, self);
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class DescribeLogMonitorAttributeResponseBodyLogMonitor extends TeaModel {
        @NameInMap("ValueFilterRelation")
        public String valueFilterRelation;

        @NameInMap("SlsLogstore")
        public String slsLogstore;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("LogId")
        public Long logId;

        @NameInMap("MetricExpress")
        public String metricExpress;

        @NameInMap("SlsRegionId")
        public String slsRegionId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("SlsProject")
        public String slsProject;

        @NameInMap("Aggregates")
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates> aggregates;

        @NameInMap("ValueFilter")
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter> valueFilter;

        @NameInMap("Tumblingwindows")
        public java.util.List<String> tumblingwindows;

        @NameInMap("Groupbys")
        public java.util.List<String> groupbys;

        public static DescribeLogMonitorAttributeResponseBodyLogMonitor build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMonitorAttributeResponseBodyLogMonitor self = new DescribeLogMonitorAttributeResponseBodyLogMonitor();
            return TeaModel.build(map, self);
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setValueFilterRelation(String valueFilterRelation) {
            this.valueFilterRelation = valueFilterRelation;
            return this;
        }
        public String getValueFilterRelation() {
            return this.valueFilterRelation;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setSlsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }
        public String getSlsLogstore() {
            return this.slsLogstore;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setLogId(Long logId) {
            this.logId = logId;
            return this;
        }
        public Long getLogId() {
            return this.logId;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setMetricExpress(String metricExpress) {
            this.metricExpress = metricExpress;
            return this;
        }
        public String getMetricExpress() {
            return this.metricExpress;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setSlsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setAggregates(java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates> aggregates) {
            this.aggregates = aggregates;
            return this;
        }
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates> getAggregates() {
            return this.aggregates;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setValueFilter(java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter> valueFilter) {
            this.valueFilter = valueFilter;
            return this;
        }
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter> getValueFilter() {
            return this.valueFilter;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setTumblingwindows(java.util.List<String> tumblingwindows) {
            this.tumblingwindows = tumblingwindows;
            return this;
        }
        public java.util.List<String> getTumblingwindows() {
            return this.tumblingwindows;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setGroupbys(java.util.List<String> groupbys) {
            this.groupbys = groupbys;
            return this;
        }
        public java.util.List<String> getGroupbys() {
            return this.groupbys;
        }

    }

}
