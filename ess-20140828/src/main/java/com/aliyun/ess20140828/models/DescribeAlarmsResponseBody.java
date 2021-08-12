// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeAlarmsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("AlarmList")
    public DescribeAlarmsResponseBodyAlarmList alarmList;

    public static DescribeAlarmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmsResponseBody self = new DescribeAlarmsResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeAlarmsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAlarmsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAlarmsResponseBody setAlarmList(DescribeAlarmsResponseBodyAlarmList alarmList) {
        this.alarmList = alarmList;
        return this;
    }
    public DescribeAlarmsResponseBodyAlarmList getAlarmList() {
        return this.alarmList;
    }

    public static class DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension extends TeaModel {
        @NameInMap("DimensionKey")
        public String dimensionKey;

        @NameInMap("DimensionValue")
        public String dimensionValue;

        public static DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension self = new DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension setDimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            return this;
        }
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmListAlarmDimensions extends TeaModel {
        @NameInMap("Dimension")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension> dimension;

        public static DescribeAlarmsResponseBodyAlarmListAlarmDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListAlarmDimensions self = new DescribeAlarmsResponseBodyAlarmListAlarmDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListAlarmDimensions setDimension(java.util.List<DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmListAlarmDimensionsDimension> getDimension() {
            return this.dimension;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmListAlarmAlarmActions extends TeaModel {
        @NameInMap("AlarmAction")
        public java.util.List<String> alarmAction;

        public static DescribeAlarmsResponseBodyAlarmListAlarmAlarmActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListAlarmAlarmActions self = new DescribeAlarmsResponseBodyAlarmListAlarmAlarmActions();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListAlarmAlarmActions setAlarmAction(java.util.List<String> alarmAction) {
            this.alarmAction = alarmAction;
            return this;
        }
        public java.util.List<String> getAlarmAction() {
            return this.alarmAction;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmListAlarm extends TeaModel {
        @NameInMap("AlarmTaskId")
        public String alarmTaskId;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("EvaluationCount")
        public Integer evaluationCount;

        @NameInMap("State")
        public String state;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("ComparisonOperator")
        public String comparisonOperator;

        @NameInMap("Effective")
        public String effective;

        @NameInMap("Description")
        public String description;

        @NameInMap("MetricType")
        public String metricType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Statistics")
        public String statistics;

        @NameInMap("Dimensions")
        public DescribeAlarmsResponseBodyAlarmListAlarmDimensions dimensions;

        @NameInMap("AlarmActions")
        public DescribeAlarmsResponseBodyAlarmListAlarmAlarmActions alarmActions;

        public static DescribeAlarmsResponseBodyAlarmListAlarm build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmListAlarm self = new DescribeAlarmsResponseBodyAlarmListAlarm();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setAlarmTaskId(String alarmTaskId) {
            this.alarmTaskId = alarmTaskId;
            return this;
        }
        public String getAlarmTaskId() {
            return this.alarmTaskId;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setEvaluationCount(Integer evaluationCount) {
            this.evaluationCount = evaluationCount;
            return this;
        }
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setComparisonOperator(String comparisonOperator) {
            this.comparisonOperator = comparisonOperator;
            return this;
        }
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setEffective(String effective) {
            this.effective = effective;
            return this;
        }
        public String getEffective() {
            return this.effective;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setMetricType(String metricType) {
            this.metricType = metricType;
            return this;
        }
        public String getMetricType() {
            return this.metricType;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setDimensions(DescribeAlarmsResponseBodyAlarmListAlarmDimensions dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public DescribeAlarmsResponseBodyAlarmListAlarmDimensions getDimensions() {
            return this.dimensions;
        }

        public DescribeAlarmsResponseBodyAlarmListAlarm setAlarmActions(DescribeAlarmsResponseBodyAlarmListAlarmAlarmActions alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }
        public DescribeAlarmsResponseBodyAlarmListAlarmAlarmActions getAlarmActions() {
            return this.alarmActions;
        }

    }

    public static class DescribeAlarmsResponseBodyAlarmList extends TeaModel {
        @NameInMap("Alarm")
        public java.util.List<DescribeAlarmsResponseBodyAlarmListAlarm> alarm;

        public static DescribeAlarmsResponseBodyAlarmList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmsResponseBodyAlarmList self = new DescribeAlarmsResponseBodyAlarmList();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmsResponseBodyAlarmList setAlarm(java.util.List<DescribeAlarmsResponseBodyAlarmListAlarm> alarm) {
            this.alarm = alarm;
            return this;
        }
        public java.util.List<DescribeAlarmsResponseBodyAlarmListAlarm> getAlarm() {
            return this.alarm;
        }

    }

}
