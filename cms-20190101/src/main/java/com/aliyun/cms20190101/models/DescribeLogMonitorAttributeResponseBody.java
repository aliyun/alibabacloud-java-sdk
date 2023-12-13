// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorAttributeResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the log monitoring metric.</p>
     */
    @NameInMap("LogMonitor")
    public DescribeLogMonitorAttributeResponseBodyLogMonitor logMonitor;

    /**
     * <p>The returned message. If the call was successful, the value success is returned. If the call failed, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DescribeLogMonitorAttributeResponseBody setLogMonitor(DescribeLogMonitorAttributeResponseBodyLogMonitor logMonitor) {
        this.logMonitor = logMonitor;
        return this;
    }
    public DescribeLogMonitorAttributeResponseBodyLogMonitor getLogMonitor() {
        return this.logMonitor;
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

    public static class DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates extends TeaModel {
        /**
         * <p>The alias of the aggregate function.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the field in logs.</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The function that is used to aggregate the monitoring data of logs within an aggregation period. Valid values:</p>
         * <br>
         * <p>*   count: counts the number.</p>
         * <p>*   sum: calculates the total value.</p>
         * <p>*   avg: calculates the average value.</p>
         * <p>*   max: selects the maximum value.</p>
         * <p>*   min: selects the minimum value.</p>
         * <p>*   countps: calculates the counted number of the specified field divided by the total number of seconds of the aggregation period.</p>
         * <p>*   sumps: calculates the total value of the specified field divided by the total number of seconds of the aggregation period.</p>
         * <p>*   distinct: counts the number of logs where the specified field appears within the aggregation period.</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The maximum value.</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum value.</p>
         */
        @NameInMap("Min")
        public String min;

        public static DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates self = new DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates();
            return TeaModel.build(map, self);
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

        public DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
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

    }

    public static class DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter extends TeaModel {
        /**
         * <p>The name of the log field used for matching in the filter condition.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The method that is used to match the field value. Valid values:</p>
         * <br>
         * <p>*   `contain`</p>
         * <p>*   `notContain`</p>
         * <p>*   `>`: greater than</p>
         * <p>*   `<`: less than</p>
         * <p>*   `>=`: greater than or equal to</p>
         * <p>*   `<=`: less than or equal to</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The field value to be matched in the filter condition.</p>
         */
        @NameInMap("Value")
        public String value;

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

        public DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLogMonitorAttributeResponseBodyLogMonitor extends TeaModel {
        /**
         * <p>The aggregate functions.</p>
         */
        @NameInMap("Aggregates")
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates> aggregates;

        /**
         * <p>The time when the log monitoring metric was created.</p>
         * <br>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the application group.</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The dimension based on which the data is grouped. This parameter is equivalent to the GROUP BY clause in SQL statements. If no dimension is specified, all data is aggregated based on the aggregate function.</p>
         */
        @NameInMap("Groupbys")
        public java.util.List<String> groupbys;

        /**
         * <p>The ID returned by Log Service.</p>
         */
        @NameInMap("LogId")
        public Long logId;

        /**
         * <p>The extended field. The extended field allows you to perform basic operations on the aggregation results.</p>
         * <br>
         * <p>Assume that you have calculated TotalNumber and 5XXNumber by aggregating the data. TotalNumber indicates the total number of HTTP requests, and 5XXNumber indicates the number of HTTP requests whose status code is greater than 499. You can calculate the server error rate by adding the following formula to the extended field: 5XXNumber/TotalNumber\*100.</p>
         */
        @NameInMap("MetricExpress")
        public String metricExpress;

        /**
         * <p>The name of the log monitoring metric. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The name of the Log Service Logstore.</p>
         */
        @NameInMap("SlsLogstore")
        public String slsLogstore;

        /**
         * <p>The name of the Log Service project.</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        /**
         * <p>The ID of the region where the Log Service Logstore resides.</p>
         */
        @NameInMap("SlsRegionId")
        public String slsRegionId;

        /**
         * <p>The size of the tumbling window for calculation. Unit: seconds. The system performs an aggregation for each tumbling window.</p>
         */
        @NameInMap("Tumblingwindows")
        public java.util.List<String> tumblingwindows;

        /**
         * <p>The condition that is used to filter logs. The ValueFilter and ValueFilterRelation parameters are used in pair. The filter condition is equivalent to the WHERE clause in SQL statements.</p>
         * <br>
         * <p>If no filter condition is specified, all logs are processed. Assume that logs contain the Level field, which may be set to Error. If you need to calculate the number of times that logs of the Error level appear every minute, you can set the filter condition to Level=Error and count the number of logs that meet this condition.</p>
         */
        @NameInMap("ValueFilter")
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter> valueFilter;

        /**
         * <p>The logical operator that is used between log filter conditions. The ValueFilter and ValueFilterRelation parameters are used in pair. Valid values:</p>
         * <br>
         * <p>*   and</p>
         * <p>*   or</p>
         */
        @NameInMap("ValueFilterRelation")
        public String valueFilterRelation;

        public static DescribeLogMonitorAttributeResponseBodyLogMonitor build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogMonitorAttributeResponseBodyLogMonitor self = new DescribeLogMonitorAttributeResponseBodyLogMonitor();
            return TeaModel.build(map, self);
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setAggregates(java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates> aggregates) {
            this.aggregates = aggregates;
            return this;
        }
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates> getAggregates() {
            return this.aggregates;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setGroupbys(java.util.List<String> groupbys) {
            this.groupbys = groupbys;
            return this;
        }
        public java.util.List<String> getGroupbys() {
            return this.groupbys;
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

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setSlsLogstore(String slsLogstore) {
            this.slsLogstore = slsLogstore;
            return this;
        }
        public String getSlsLogstore() {
            return this.slsLogstore;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setSlsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setTumblingwindows(java.util.List<String> tumblingwindows) {
            this.tumblingwindows = tumblingwindows;
            return this;
        }
        public java.util.List<String> getTumblingwindows() {
            return this.tumblingwindows;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setValueFilter(java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter> valueFilter) {
            this.valueFilter = valueFilter;
            return this;
        }
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter> getValueFilter() {
            return this.valueFilter;
        }

        public DescribeLogMonitorAttributeResponseBodyLogMonitor setValueFilterRelation(String valueFilterRelation) {
            this.valueFilterRelation = valueFilterRelation;
            return this;
        }
        public String getValueFilterRelation() {
            return this.valueFilterRelation;
        }

    }

}
