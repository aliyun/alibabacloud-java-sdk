// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutLogMonitorRequest extends TeaModel {
    /**
     * <p>The aggregation logic.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Aggregates")
    public java.util.List<PutLogMonitorRequestAggregates> aggregates;

    /**
     * <p>The ID of the application group.</p>
     * 
     * <strong>example:</strong>
     * <p>7301****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The dimension based on which the data is grouped. This parameter is equivalent to the GROUP BY clause in SQL statements. If no dimension is specified, all data is aggregated based on the aggregate function.</p>
     */
    @NameInMap("Groupbys")
    public java.util.List<PutLogMonitorRequestGroupbys> groupbys;

    /**
     * <p>The ID of the log monitoring metric.</p>
     * 
     * <strong>example:</strong>
     * <p>16****</p>
     */
    @NameInMap("LogId")
    public String logId;

    /**
     * <p>The extended field. The extended field allows you to perform basic operations on the aggregation results.</p>
     * <p>For example, you have calculated TotalNumber and 5XXNumber by aggregating the data. TotalNumber indicates the total number of HTTP requests, and 5XXNumber indicates the number of HTTP requests whose status code is greater than 499. You can calculate the server error rate by adding the following formula to the extended field: 5XXNumber/TotalNumber\*100.</p>
     * <p>JSON format: {&quot;extend&quot;:{&quot;errorPercent&quot;:&quot;5XXNumber/TotalNumber\*100&quot;}}. Description:</p>
     * <ul>
     * <li>extend: required.</li>
     * <li>errorPercent: the alias of the field generated in the calculation result. You can specify the alias as needed.</li>
     * <li>5XXNumber/TotalNumber\*100: the calculation expression.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;extend&quot;:{&quot;errorPercent&quot;:&quot;5XXNumber/TotalNumber*100&quot;}}</p>
     */
    @NameInMap("MetricExpress")
    public String metricExpress;

    /**
     * <p>The metric name. For more information about the metrics for cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the Simple Log Service Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("SlsLogstore")
    public String slsLogstore;

    /**
     * <p>The name of the Simple Log Service project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("SlsProject")
    public String slsProject;

    /**
     * <p>The region in which the Simple Log Service project resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    /**
     * <p>The size of the tumbling window for calculation. Unit: seconds. CloudMonitor performs aggregation for each tumbling window.</p>
     * 
     * <strong>example:</strong>
     * <p>60,300</p>
     */
    @NameInMap("Tumblingwindows")
    public String tumblingwindows;

    /**
     * <p>The unit.</p>
     * 
     * <strong>example:</strong>
     * <p>Percent</p>
     */
    @NameInMap("Unit")
    public String unit;

    /**
     * <p>The condition that is used to filter logs. The ValueFilter and ValueFilterRelation parameters are used in pair. The filter condition is equivalent to the WHERE clause in SQL statements. If no filter condition is specified, all logs are processed. For example, logs contain the Level and Error fields. If you need to calculate the number of times that logs of the Error level appear every minute, you can set the filter condition to Level=Error and count the number of logs that meet this condition.</p>
     */
    @NameInMap("ValueFilter")
    public java.util.List<PutLogMonitorRequestValueFilter> valueFilter;

    /**
     * <p>The logical operator that is used between log filter conditions. Valid values:</p>
     * <ul>
     * <li>and</li>
     * <li>or</li>
     * </ul>
     * <blockquote>
     * <p> The ValueFilterRelation and <code>ValueFilter.N.Key</code> parameters must be used in pair.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("ValueFilterRelation")
    public String valueFilterRelation;

    public static PutLogMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLogMonitorRequest self = new PutLogMonitorRequest();
        return TeaModel.build(map, self);
    }

    public PutLogMonitorRequest setAggregates(java.util.List<PutLogMonitorRequestAggregates> aggregates) {
        this.aggregates = aggregates;
        return this;
    }
    public java.util.List<PutLogMonitorRequestAggregates> getAggregates() {
        return this.aggregates;
    }

    public PutLogMonitorRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PutLogMonitorRequest setGroupbys(java.util.List<PutLogMonitorRequestGroupbys> groupbys) {
        this.groupbys = groupbys;
        return this;
    }
    public java.util.List<PutLogMonitorRequestGroupbys> getGroupbys() {
        return this.groupbys;
    }

    public PutLogMonitorRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public PutLogMonitorRequest setMetricExpress(String metricExpress) {
        this.metricExpress = metricExpress;
        return this;
    }
    public String getMetricExpress() {
        return this.metricExpress;
    }

    public PutLogMonitorRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public PutLogMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutLogMonitorRequest setSlsLogstore(String slsLogstore) {
        this.slsLogstore = slsLogstore;
        return this;
    }
    public String getSlsLogstore() {
        return this.slsLogstore;
    }

    public PutLogMonitorRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

    public PutLogMonitorRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public PutLogMonitorRequest setTumblingwindows(String tumblingwindows) {
        this.tumblingwindows = tumblingwindows;
        return this;
    }
    public String getTumblingwindows() {
        return this.tumblingwindows;
    }

    public PutLogMonitorRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public PutLogMonitorRequest setValueFilter(java.util.List<PutLogMonitorRequestValueFilter> valueFilter) {
        this.valueFilter = valueFilter;
        return this;
    }
    public java.util.List<PutLogMonitorRequestValueFilter> getValueFilter() {
        return this.valueFilter;
    }

    public PutLogMonitorRequest setValueFilterRelation(String valueFilterRelation) {
        this.valueFilterRelation = valueFilterRelation;
        return this;
    }
    public String getValueFilterRelation() {
        return this.valueFilterRelation;
    }

    public static class PutLogMonitorRequestAggregates extends TeaModel {
        /**
         * <p>The alias of the aggregate function. Valid values of N: 1 to 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Count</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the field to be aggregated. Valid values of N: 1 to 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sourceCount</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The function that is used to aggregate log data within a statistical period. Valid values of N: 1 to 10. Valid values:</p>
         * <ul>
         * <li>count: counts the number.</li>
         * <li>sum: calculates the total value.</li>
         * <li>avg: calculates the average value.</li>
         * <li>max: calculates the maximum value.</li>
         * <li>min: calculates the minimum value.</li>
         * <li>countps: calculates the number of values of the specified field divided by the total number of seconds within a statistical period.</li>
         * <li>sumps: calculates the sum of the values of the specified field divided by the total number of seconds within a statistical period.</li>
         * <li>distinct: calculates the number of unique values of the specified field within a statistical period.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("Function")
        public String function;

        public static PutLogMonitorRequestAggregates build(java.util.Map<String, ?> map) throws Exception {
            PutLogMonitorRequestAggregates self = new PutLogMonitorRequestAggregates();
            return TeaModel.build(map, self);
        }

        public PutLogMonitorRequestAggregates setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public PutLogMonitorRequestAggregates setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public PutLogMonitorRequestAggregates setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

    }

    public static class PutLogMonitorRequestGroupbys extends TeaModel {
        /**
         * <p>The alias of the dimension based on which the data is grouped. Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the field that is specified as the dimension. Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static PutLogMonitorRequestGroupbys build(java.util.Map<String, ?> map) throws Exception {
            PutLogMonitorRequestGroupbys self = new PutLogMonitorRequestGroupbys();
            return TeaModel.build(map, self);
        }

        public PutLogMonitorRequestGroupbys setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public PutLogMonitorRequestGroupbys setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

    public static class PutLogMonitorRequestValueFilter extends TeaModel {
        /**
         * <p>The name of the log field that is used for matching in the filter condition. Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>lh_source</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The method that is used to match the field value. Valid values of N: 1 to 10. Valid values:</p>
         * <ul>
         * <li><code>contain</code>: contains</li>
         * <li><code>notContain</code>: does not contain</li>
         * <li><code>&gt;</code>: greater than</li>
         * <li><code>&lt;</code>: less than</li>
         * <li><code>&gt;=</code>: greater than or equal to</li>
         * <li><code>&lt;=</code>: less than or equal to</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contain</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The field value to be matched in the filter condition. Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutLogMonitorRequestValueFilter build(java.util.Map<String, ?> map) throws Exception {
            PutLogMonitorRequestValueFilter self = new PutLogMonitorRequestValueFilter();
            return TeaModel.build(map, self);
        }

        public PutLogMonitorRequestValueFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PutLogMonitorRequestValueFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public PutLogMonitorRequestValueFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
