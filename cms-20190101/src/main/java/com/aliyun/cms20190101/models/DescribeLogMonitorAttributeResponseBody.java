// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeLogMonitorAttributeResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>A status code of 200 indicates a successful request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the Log Monitoring task.</p>
     */
    @NameInMap("LogMonitor")
    public DescribeLogMonitorAttributeResponseBodyLogMonitor logMonitor;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6718537-E673-4A58-8EE1-24B8B38C7AAE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The operation was successful.</p>
     * </li>
     * <li><p>false: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The alias of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>alias_******</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The original name of the field in the log.</p>
         * 
         * <strong>example:</strong>
         * <p>field_******</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The function that is used to aggregate log data in a statistical period. Valid values:</p>
         * <ul>
         * <li><p>count: Counts the number of logs.</p>
         * </li>
         * <li><p>sum: Calculates the sum of values in a field.</p>
         * </li>
         * <li><p>avg: Calculates the average of values in a field.</p>
         * </li>
         * <li><p>max: Selects the maximum value in a field.</p>
         * </li>
         * <li><p>min: Selects the minimum value in a field.</p>
         * </li>
         * <li><p>countps: Calculates the average number of logs that are generated per second in a statistical period.</p>
         * </li>
         * <li><p>sumps: Calculates the average sum of values in a field per second in a statistical period.</p>
         * </li>
         * <li><p>distinct: Counts the number of unique values in a field in a statistical period.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The key.</p>
         * 
         * <strong>example:</strong>
         * <p>key_******</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The operator that is used to match the field value. Valid values:</p>
         * <ul>
         * <li><p><code>contain</code>: contains.</p>
         * </li>
         * <li><p><code>notContain</code>: does not contain.</p>
         * </li>
         * <li><p><code>&gt;</code>: greater than.</p>
         * </li>
         * <li><p><code>&lt;</code>: less than.</p>
         * </li>
         * <li><p><code>&gt;=</code>: greater than or equal to.</p>
         * </li>
         * <li><p><code>&lt;=</code>: less than or equal to.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contain</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>value_******</p>
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
         * <p>The definitions of aggregations.</p>
         */
        @NameInMap("Aggregates")
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorAggregates> aggregates;

        /**
         * <p>The time when the task was created.</p>
         * <p>This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1678440033000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>123******</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>The dimension based on which log data is aggregated. This parameter is equivalent to the \<code>GROUP BY\\</code> clause in an SQL statement. You can specify a dimension to group monitoring data. If you do not specify this parameter, all monitoring data is aggregated based on the aggregation method.</p>
         */
        @NameInMap("Groupbys")
        public java.util.List<String> groupbys;

        /**
         * <p>The ID of the Log Monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>123******</p>
         */
        @NameInMap("LogId")
        public Long logId;

        /**
         * <p>The metric expression.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("MetricExpress")
        public String metricExpress;

        /**
         * <p>The name of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu_total_******</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The name of the Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>logstore_******</p>
         */
        @NameInMap("SlsLogstore")
        public String slsLogstore;

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>project_******</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        /**
         * <p>The ID of the region where Simple Log Service resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SlsRegionId")
        public String slsRegionId;

        /**
         * <p>The pre-aggregation window. Unit: seconds. Cloud Monitor aggregates data in the specified pre-aggregation window.</p>
         */
        @NameInMap("Tumblingwindows")
        public java.util.List<String> tumblingwindows;

        /**
         * <p>The filter conditions. This parameter is used with \<code>ValueFilterRelation\\</code>. This parameter is equivalent to the \<code>WHERE\\</code> clause in an SQL statement.</p>
         * <p>If you do not specify this parameter, all data is processed. For example, if a log contains a \<code>Level\\</code> field and you want to count the number of logs where the value of \<code>Level\\</code> is \<code>Error\\</code>, you can set the aggregation function to \<code>count\\</code> and specify a filter condition where \<code>Level\\</code> equals \<code>Error\\</code>.</p>
         */
        @NameInMap("ValueFilter")
        public java.util.List<DescribeLogMonitorAttributeResponseBodyLogMonitorValueFilter> valueFilter;

        /**
         * <p>The logical operator for the filter conditions. This parameter is used with \<code>ValueFilter\\</code>. Valid values:</p>
         * <ul>
         * <li><p>and: The logical AND operator.</p>
         * </li>
         * <li><p>or: The logical OR operator.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
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
