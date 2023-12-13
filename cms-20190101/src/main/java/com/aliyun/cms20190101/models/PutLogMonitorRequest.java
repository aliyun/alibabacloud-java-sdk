// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutLogMonitorRequest extends TeaModel {
    @NameInMap("Aggregates")
    public java.util.List<PutLogMonitorRequestAggregates> aggregates;

    /**
     * <p>The ID of the application group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Groupbys")
    public java.util.List<PutLogMonitorRequestGroupbys> groupbys;

    /**
     * <p>The ID of the log monitoring metric.</p>
     */
    @NameInMap("LogId")
    public String logId;

    /**
     * <p>The extended field. The extended field allows you to perform basic operations on the aggregation results.</p>
     * <br>
     * <p>For example, if you have calculated TotalNumber and 5XXNumber by aggregating the data. TotalNumber indicates the total number of HTTP requests, and 5XXNumber indicates the number of HTTP requests whose status code is greater than 499. You can calculate the server error rate by adding the following formula to the extended field: 5XXNumber/TotalNumber\*100.</p>
     * <br>
     * <p>JSON format: {"extend":{"errorPercent":"5XXNumber/TotalNumber\*100"}}. Description:</p>
     * <br>
     * <p>*   extend: required.</p>
     * <p>*   errorPercent: the alias of the field generated in the calculation result. You can specify the alias as needed.</p>
     * <p>*   5XXNumber/TotalNumber\*100: the calculation expression.</p>
     */
    @NameInMap("MetricExpress")
    public String metricExpress;

    /**
     * <p>The name of the metric. For more information about the metrics for cloud services, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("RegionId")
    public String regionId;

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
     * <p>The region in which the Log Service project resides.</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    /**
     * <p>The size of the tumbling window for calculation. Unit: seconds. CloudMonitor performs aggregation for each tumbling window.</p>
     */
    @NameInMap("Tumblingwindows")
    public String tumblingwindows;

    /**
     * <p>The unit.</p>
     */
    @NameInMap("Unit")
    public String unit;

    @NameInMap("ValueFilter")
    public java.util.List<PutLogMonitorRequestValueFilter> valueFilter;

    /**
     * <p>The logical operator that is used between log filter conditions. Valid values:</p>
     * <br>
     * <p>*   and</p>
     * <p>*   or</p>
     * <br>
     * <p>>  The ValueFilterRelation and `ValueFilter.N.Key` parameters must be used in pair.</p>
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
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the field to be aggregated. Valid values of N: 1 to 10.</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The function that is used to aggregate the monitoring data of logs within an aggregation period. Valid values of N: 1 to 10. Valid values:</p>
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
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the field that is specified as the dimension. Valid values of N: 1 to 10.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The method that is used to match the field value. Valid values of N: 1 to 10. Valid values:</p>
         * <br>
         * <p>*   `contain`: contains</p>
         * <p>*   `notContain`: does not contain</p>
         * <p>*   `>`: be greater than</p>
         * <p>*   `<`: be less than</p>
         * <p>*   `>=`: be greater than or equal to</p>
         * <p>*   `<=`: be less than or equal to</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The field value to be matched in the filter condition. Valid values of N: 1 to 10.</p>
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
