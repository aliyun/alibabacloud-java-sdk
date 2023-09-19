// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorTaskRequest extends TeaModel {
    /**
     * <p>The tags of the metric.</p>
     */
    @NameInMap("AttachLabels")
    public java.util.List<ModifyHybridMonitorTaskRequestAttachLabels> attachLabels;

    /**
     * <p>The collection period of the metric. Valid values:</p>
     * <br>
     * <p>*   15</p>
     * <p>*   60</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("CollectInterval")
    public String collectInterval;

    /**
     * <p>The description of the metric import task.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configurations of the logs that are imported from Log Service.</p>
     */
    @NameInMap("SLSProcessConfig")
    public ModifyHybridMonitorTaskRequestSLSProcessConfig SLSProcessConfig;

    /**
     * <p>The ID of the metric import task.</p>
     * <br>
     * <p>For information about how to obtain the ID of a metric import task, see [DescribeHybridMonitorTaskList](~~428624~~).</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the metric import task.</p>
     * <br>
     * <p>For information about how to obtain the ID of a metric import task, see [DescribeHybridMonitorTaskList](~~428624~~).</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static ModifyHybridMonitorTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridMonitorTaskRequest self = new ModifyHybridMonitorTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridMonitorTaskRequest setAttachLabels(java.util.List<ModifyHybridMonitorTaskRequestAttachLabels> attachLabels) {
        this.attachLabels = attachLabels;
        return this;
    }
    public java.util.List<ModifyHybridMonitorTaskRequestAttachLabels> getAttachLabels() {
        return this.attachLabels;
    }

    public ModifyHybridMonitorTaskRequest setCollectInterval(String collectInterval) {
        this.collectInterval = collectInterval;
        return this;
    }
    public String getCollectInterval() {
        return this.collectInterval;
    }

    public ModifyHybridMonitorTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyHybridMonitorTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHybridMonitorTaskRequest setSLSProcessConfig(ModifyHybridMonitorTaskRequestSLSProcessConfig SLSProcessConfig) {
        this.SLSProcessConfig = SLSProcessConfig;
        return this;
    }
    public ModifyHybridMonitorTaskRequestSLSProcessConfig getSLSProcessConfig() {
        return this.SLSProcessConfig;
    }

    public ModifyHybridMonitorTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyHybridMonitorTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public static class ModifyHybridMonitorTaskRequestAttachLabels extends TeaModel {
        /**
         * <p>The tag key of the metric.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag value of the metric.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyHybridMonitorTaskRequestAttachLabels build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorTaskRequestAttachLabels self = new ModifyHybridMonitorTaskRequestAttachLabels();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorTaskRequestAttachLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyHybridMonitorTaskRequestAttachLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyHybridMonitorTaskRequestSLSProcessConfigExpress extends TeaModel {
        /**
         * <p>The alias of the extended field that specifies the result of basic operations performed on aggregation results.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The extended field that specifies the result of basic operations performed on aggregation results.</p>
         */
        @NameInMap("Express")
        public String express;

        public static ModifyHybridMonitorTaskRequestSLSProcessConfigExpress build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorTaskRequestSLSProcessConfigExpress self = new ModifyHybridMonitorTaskRequestSLSProcessConfigExpress();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigExpress setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigExpress setExpress(String express) {
            this.express = express;
            return this;
        }
        public String getExpress() {
            return this.express;
        }

    }

    public static class ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters extends TeaModel {
        /**
         * <p>The method that is used to filter logs imported from Log Service. Valid values:</p>
         * <br>
         * <p>*   `contain`: contains</p>
         * <p>*   `notContain`: does not contain</p>
         * <p>*   `>`: greater than</p>
         * <p>*   `<`: less than</p>
         * <p>*   `=`: equal to</p>
         * <p>*   `! =`: not equal to</p>
         * <p>*   `>=`: greater than or equal to</p>
         * <p>*   `<=`: less than or equal to</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The name of the key that is used to filter logs imported from Log Service.</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        /**
         * <p>The value of the key that is used to filter logs imported from Log Service.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters self = new ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyHybridMonitorTaskRequestSLSProcessConfigFilter extends TeaModel {
        /**
         * <p>None</p>
         */
        @NameInMap("Filters")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters> filters;

        /**
         * <p>The relationship between multiple filter conditions. Valid values:</p>
         * <br>
         * <p>*   and (default): Logs are processed only if all filter conditions are met.</p>
         * <p>*   or: Logs are processed if one of the filter conditions is met.</p>
         */
        @NameInMap("Relation")
        public String relation;

        public static ModifyHybridMonitorTaskRequestSLSProcessConfigFilter build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorTaskRequestSLSProcessConfigFilter self = new ModifyHybridMonitorTaskRequestSLSProcessConfigFilter();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilter setFilters(java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters> getFilters() {
            return this.filters;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilter setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

    public static class ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy extends TeaModel {
        /**
         * <p>The alias of the aggregation result.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        public static ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy self = new ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

    }

    public static class ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics extends TeaModel {
        /**
         * <p>The alias of the aggregation result.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The function that is used to aggregate the log data of a statistical period. Valid values:</p>
         * <br>
         * <p>*   count: counts the number.</p>
         * <p>*   sum: calculates the total value.</p>
         * <p>*   avg: calculates the average value.</p>
         * <p>*   max: calculates the maximum value.</p>
         * <p>*   min: calculates the minimum value.</p>
         * <p>*   value: collects samples within the statistical period.</p>
         * <p>*   countps: calculates the counted number of the specified field divided by the total number of seconds within the statistical period.</p>
         * <p>*   sumps: calculates the total value of the specified field divided by the total number of seconds within the statistical period.</p>
         * <p>*   distinct: counts the number of logs where the specified field appears within the statistical period.</p>
         * <p>*   distribution: counts the number of logs that meet a specified condition within the statistical period.</p>
         * <p>*   percentile: sorts the values of the specified field in ascending order, and then returns the value that is at the specified percentile within the statistical period. Example: P50.</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
         * <br>
         * <p>*   If the `Function` parameter is set to `distribution`, this parameter specifies the lower limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 200.</p>
         * <p>*   If you set the `Function` parameter to `percentile`, this parameter specifies the percentile at which the expected value is. For example, 0.5 specifies P50.</p>
         */
        @NameInMap("Parameter1")
        public String parameter1;

        /**
         * <p>The value of the function that is used to aggregate logs imported from Log Service.</p>
         * <br>
         * <p>> This parameter must be specified when `Function` is set to `distribution`. This parameter specifies the upper limit of the statistical interval. For example, if you want to calculate the number of HTTP requests whose status code is 2XX, set this parameter to 299.</p>
         */
        @NameInMap("Parameter2")
        public String parameter2;

        /**
         * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        public static ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics self = new ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics setParameter1(String parameter1) {
            this.parameter1 = parameter1;
            return this;
        }
        public String getParameter1() {
            return this.parameter1;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics setParameter2(String parameter2) {
            this.parameter2 = parameter2;
            return this;
        }
        public String getParameter2() {
            return this.parameter2;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

    }

    public static class ModifyHybridMonitorTaskRequestSLSProcessConfig extends TeaModel {
        /**
         * <p>The extended fields that specify the results of basic operations performed on aggregation results.</p>
         */
        @NameInMap("Express")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigExpress> express;

        /**
         * <p>The conditions that are used to filter logs imported from Log Service.</p>
         */
        @NameInMap("Filter")
        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilter filter;

        /**
         * <p>The dimensions based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.</p>
         */
        @NameInMap("GroupBy")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy> groupBy;

        /**
         * <p>None</p>
         */
        @NameInMap("Statistics")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics> statistics;

        public static ModifyHybridMonitorTaskRequestSLSProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyHybridMonitorTaskRequestSLSProcessConfig self = new ModifyHybridMonitorTaskRequestSLSProcessConfig();
            return TeaModel.build(map, self);
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfig setExpress(java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigExpress> express) {
            this.express = express;
            return this;
        }
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigExpress> getExpress() {
            return this.express;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfig setFilter(ModifyHybridMonitorTaskRequestSLSProcessConfigFilter filter) {
            this.filter = filter;
            return this;
        }
        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilter getFilter() {
            return this.filter;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfig setGroupBy(java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy> groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy> getGroupBy() {
            return this.groupBy;
        }

        public ModifyHybridMonitorTaskRequestSLSProcessConfig setStatistics(java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics> statistics) {
            this.statistics = statistics;
            return this;
        }
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigStatistics> getStatistics() {
            return this.statistics;
        }

    }

}
