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
     * <p>The collection interval of the metric. Valid values:</p>
     * <ul>
     * <li><p>15</p>
     * </li>
     * <li><p>60</p>
     * </li>
     * </ul>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("CollectInterval")
    public String collectInterval;

    /**
     * <p>The description of the monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS log monitoring data.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The SLS log configuration.</p>
     */
    @NameInMap("SLSProcessConfig")
    public ModifyHybridMonitorTaskRequestSLSProcessConfig SLSProcessConfig;

    /**
     * <p>The monitoring task ID.</p>
     * <p>For information about how to obtain the monitoring task ID, see <a href="https://help.aliyun.com/document_detail/428624.html">DescribeHybridMonitorTaskList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The monitoring task name.</p>
     * <p>For information about how to obtain the monitoring task ID, see <a href="https://help.aliyun.com/document_detail/428624.html">DescribeHybridMonitorTaskList</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS_task</p>
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
         * 
         * <strong>example:</strong>
         * <p>app_service</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
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
         * <p>The alias of the arithmetic operation result of the extended field in the SLS log statistics result.</p>
         * 
         * <strong>example:</strong>
         * <p>SuccRate</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The arithmetic operation result of the extended field in the SLS log statistics result.</p>
         * 
         * <strong>example:</strong>
         * <p>success_count</p>
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
         * <p>The method used to filter parameter values in the SLS log. Valid values:</p>
         * <ul>
         * <li><code>contain</code>: contains.</li>
         * <li><code>notContain</code>: does not contain.</li>
         * <li><code>&gt;</code>: greater than.</li>
         * <li><code>&lt;</code>: less than.</li>
         * <li><code>=</code>: equal to.</li>
         * <li><code>!=</code>: not equal to.</li>
         * <li><code>&gt;=</code>: greater than or equal to.</li>
         * <li><code>&lt;=</code>: less than or equal to.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The name of the parameter to filter in the SLS log.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        /**
         * <p>The filter value of the parameter in the SLS log.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>None.</p>
         */
        @NameInMap("Filters")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters> filters;

        /**
         * <p>The relationship between multiple filter conditions. Valid values:</p>
         * <ul>
         * <li>and (default): Logs are processed only when all filter conditions are met.</li>
         * <li>or: Logs are processed when any filter condition is met.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
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
         * <p>The alias of the SLS log statistics result.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiResult</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the parameter for SLS log statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
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
         * <p>The alias of the SLS log statistics result.</p>
         * 
         * <strong>example:</strong>
         * <p>level_count</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The statistical method used to aggregate log data within a statistical period. Valid values:</p>
         * <ul>
         * <li>count: counts the number of occurrences.</li>
         * <li>sum: calculates the sum.</li>
         * <li>avg: calculates the average.</li>
         * <li>max: returns the maximum value.</li>
         * <li>min: returns the minimum value.</li>
         * <li>value: samples within the period.</li>
         * <li>countps: calculates the per-second average of the count for the specified field within the statistical period.</li>
         * <li>sumps: calculates the per-second average of the sum for the specified field within the statistical period.</li>
         * <li>distinct: calculates the number of occurrences of the specified field after deduplication within the statistical period.</li>
         * <li>distribution: calculates the number of occurrences of field values within a specified range.</li>
         * <li>percentile: calculates the distribution value of field values, such as P50.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The statistical value of the SLS log.</p>
         * <ul>
         * <li><p>If <code>Function</code> is set to <code>distribution</code>, this parameter specifies the lower limit of the statistical range. For example, to count the number of 2XX HTTP status codes, set this parameter to 200.</p>
         * </li>
         * <li><p>If <code>Function</code> is set to <code>percentile</code>, this parameter specifies the percentile of the statistical distribution. For example, 0.5 indicates P50.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Parameter1")
        public String parameter1;

        /**
         * <p>The statistical value of the SLS log.</p>
         * <blockquote>
         * <p>This parameter is required only when <code>Function</code> is set to <code>distribution</code>. It specifies the upper limit of the statistical range. For example, to count the number of 2XX HTTP status codes, set this parameter to 299.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>299</p>
         */
        @NameInMap("Parameter2")
        public String parameter2;

        /**
         * <p>The name of the parameter for SLS log statistics.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
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
         * <p>The arithmetic operation result of the extended field in the SLS log statistics result.</p>
         */
        @NameInMap("Express")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigExpress> express;

        /**
         * <p>The filter conditions for parameters in the SLS log.</p>
         */
        @NameInMap("Filter")
        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilter filter;

        /**
         * <p>Aggregates data by spatial dimension, which is equivalent to GROUP BY in SQL.</p>
         */
        @NameInMap("GroupBy")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy> groupBy;

        /**
         * <p>None.</p>
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
