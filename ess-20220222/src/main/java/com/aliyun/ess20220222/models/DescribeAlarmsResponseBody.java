// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeAlarmsResponseBody extends TeaModel {
    @NameInMap("AlarmList")
    public java.util.List<DescribeAlarmsResponseBodyAlarmList> alarmList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsResponseBody self = new DescribeAlarmsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmsResponseBody setAlarmList(java.util.List<DescribeAlarmsResponseBodyAlarmList> alarmList) {
        this.alarmList = alarmList;
        return this;
    }
    public java.util.List<DescribeAlarmsResponseBodyAlarmList> getAlarmList() {
        return this.alarmList;
    }

    public DescribeAlarmsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlarmsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlarmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAlarmsResponseBodyAlarmListDimensions extends TeaModel {
        @NameInMap("DimensionKey")
        public String dimensionKey;

        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static DescribeAlarmsResponseBodyAlarmListDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListDimensions self = new DescribeAlarmsResponseBodyAlarmListDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListDimensions setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public DescribeAlarmsResponseBodyAlarmListDimensions setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmListExpressions extends TeaModel {
        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public Float threshold;

        public static DescribeAlarmsResponseBodyAlarmListExpressions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListExpressions self = new DescribeAlarmsResponseBodyAlarmListExpressions();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyAlarmListExpressions setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmList extends TeaModel {
        @NameInMap("AlarmActions")
        public java.util.List<String> alarmActions;

        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Dimensions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListDimensions> dimensions;

        @NameInMap("Effective")
        public String effective;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        @NameInMap("Expressions")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListExpressions> expressions;

        @NameInMap("ExpressionsLogicOperator")
        public String expressionsLogicOperator;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("State")
        public String state;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Threshold")
        public Float threshold;

        public static DescribeAlarmsResponseBodyAlarmList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmList self = new DescribeAlarmsResponseBodyAlarmList();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmList setAlarmActions(java.util.List<String> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }
        public java.util.List<String> getAlarmActions() {
            return this.alarmActions;
        }

        public DescribeAlarmsResponseBodyAlarmList setAlarmTaskId(String alarmTaskId) {
            this.alarmTaskId = alarmTaskId;
            return this;
        }
        public String getAlarmTaskId() {
            return this.alarmTaskId;
        }

        public DescribeAlarmsResponseBodyAlarmList setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyAlarmList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAlarmsResponseBodyAlarmList setDimensions(java.util.List<DescribeAlarmsResponseBodyAlarmListDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmListDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeAlarmsResponseBodyAlarmList setEffective(String effective) {
            this.effective = effective;
            return this;
        }
        public String getEffective() {
            return this.effective;
        }

        public DescribeAlarmsResponseBodyAlarmList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeAlarmsResponseBodyAlarmList setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeAlarmsResponseBodyAlarmList setExpressions(java.util.List<DescribeAlarmsResponseBodyAlarmListExpressions> expressions) {
            this.expressions = expressions;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmListExpressions> getExpressions() {
            return this.expressions;
        }

        public DescribeAlarmsResponseBodyAlarmList setExpressionsLogicOperator(String expressionsLogicOperator) {
            this.expressionsLogicOperator = expressionsLogicOperator;
            return this;
        }
        public String getExpressionsLogicOperator() {
            return this.expressionsLogicOperator;
        }

        public DescribeAlarmsResponseBodyAlarmList setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmsResponseBodyAlarmList setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public DescribeAlarmsResponseBodyAlarmList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlarmsResponseBodyAlarmList setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeAlarmsResponseBodyAlarmList setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeAlarmsResponseBodyAlarmList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAlarmsResponseBodyAlarmList setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyAlarmList setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
