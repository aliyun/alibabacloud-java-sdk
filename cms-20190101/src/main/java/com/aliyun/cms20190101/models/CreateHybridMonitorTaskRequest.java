// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorTaskRequest extends TeaModel {
    /**
     * <p>The tags of the metric.</p>
     * <blockquote>
     * <p>This parameter is required only when TaskType is set to <code>aliyun_sls</code>.</p>
     * </blockquote>
     */
    @NameInMap("AttachLabels")
    public java.util.List<CreateHybridMonitorTaskRequestAttachLabels> attachLabels;

    /**
     * <p>The IDs of the accounts of other cloud providers that are connected to CloudMonitor.</p>
     */
    @NameInMap("CloudAccessId")
    public java.util.List<String> cloudAccessId;

    /**
     * <p>The collection period of the metric. Valid values:</p>
     * <ul>
     * <li>15</li>
     * <li>60 (default)</li>
     * </ul>
     * <p>Unit: seconds.</p>
     * <blockquote>
     * <p>This parameter is required only when TaskType is set to <code>aliyun_sls</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("CollectInterval")
    public String collectInterval;

    /**
     * <p>The type of the collection target for monitoring data.</p>
     * <ul>
     * <li>If TaskType is set to <code>aliyun_fc</code>, set this parameter to <code>aliyun_fc</code>.</li>
     * <li>If TaskType is set to <code>aliyun_sls</code>, set this parameter to the name of the Logstore group for SLS logs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_fc</p>
     */
    @NameInMap("CollectTargetType")
    public String collectTargetType;

    /**
     * <p>The description of the monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud product data ingestion task.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the application group.</p>
     * <p>For information about how to obtain the application group ID, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * <blockquote>
     * <p>This parameter is required only when TaskType is set to <code>aliyun_sls</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3607****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the metric repository.</p>
     * <p>For information about how to obtain the name of a metric repository, see <a href="https://help.aliyun.com/document_detail/428880.html">DescribeHybridMonitorNamespaceList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configurations of SLS logs.</p>
     * <blockquote>
     * <p>This parameter is required only when TaskType is set to <code>aliyun_sls</code>.</p>
     * </blockquote>
     */
    @NameInMap("SLSProcessConfig")
    public CreateHybridMonitorTaskRequestSLSProcessConfig SLSProcessConfig;

    /**
     * <p>The ID of the member account.</p>
     * <p>When you call this operation by using a management account, you can connect any Alibaba Cloud service of any member account in the resource directory to Hybrid Cloud Monitoring. This allows you to use the resource directory to monitor the Alibaba Cloud services of member accounts across the enterprise in a unified manner.</p>
     * <blockquote>
     * <p>This parameter is required only when TaskType is set to <code>aliyun_fc</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120886317861****</p>
     */
    @NameInMap("TargetUserId")
    public String targetUserId;

    /**
     * <p>The IDs of the member accounts. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>This parameter is required only when you call this operation by using a management account.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120886317861****</p>
     */
    @NameInMap("TargetUserIdList")
    public String targetUserIdList;

    /**
     * <p>The name of the monitoring task.</p>
     * <ul>
     * <li>If TaskType is set to <code>aliyun_fc</code>, specify the name of the data import task for the Alibaba Cloud service.</li>
     * <li>If TaskType is set to <code>aliyun_sls</code>, specify the metric name for SLS logs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyun_task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the monitoring task. Valid values:</p>
     * <ul>
     * <li>aliyun_fc: data import task for an Alibaba Cloud service.</li>
     * <li>aliyun_sls: metric for SLS logs.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun_fc</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The configuration file of the Alibaba Cloud service that is connected to Hybrid Cloud Monitoring.</p>
     * <ul>
     * <li>namespace: the namespace of the Alibaba Cloud service. For information about how to query the namespace of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a>.</li>
     * <li>metric_list: the metrics of the Alibaba Cloud service. For information about how to query the metrics of an Alibaba Cloud service, see <a href="https://help.aliyun.com/document_detail/98846.html">DescribeMetricMetaList</a>.</li>
     * </ul>
     * <p>The following example shows a sample configuration file:</p>
     * <pre><code>products:
     * - namespace: acs_ecs_dashboard
     *   metric_info:
     *   - metric_list:
     *     - cpu_total
     *     - cpu_idle
     *     - diskusage_utilization
     *     - CPUUtilization
     *     - DiskReadBPS
     *     - InternetOut
     *     - IntranetOut
     *     - cpu_system
     * - namespace: acs_rds_dashboard
     *   metric_info:
     *   - metric_list:
     *     - MySQL_QPS
     *     - MySQL_TPS
     * </code></pre>
     * <blockquote>
     * <p>This parameter is required only when TaskType is set to <code>aliyun_fc</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>products:- namespace: acs_ecs_dashboard  metric_info:  - metric_list:    - cpu_total</p>
     */
    @NameInMap("YARMConfig")
    public String YARMConfig;

    public static CreateHybridMonitorTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridMonitorTaskRequest self = new CreateHybridMonitorTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridMonitorTaskRequest setAttachLabels(java.util.List<CreateHybridMonitorTaskRequestAttachLabels> attachLabels) {
        this.attachLabels = attachLabels;
        return this;
    }
    public java.util.List<CreateHybridMonitorTaskRequestAttachLabels> getAttachLabels() {
        return this.attachLabels;
    }

    public CreateHybridMonitorTaskRequest setCloudAccessId(java.util.List<String> cloudAccessId) {
        this.cloudAccessId = cloudAccessId;
        return this;
    }
    public java.util.List<String> getCloudAccessId() {
        return this.cloudAccessId;
    }

    public CreateHybridMonitorTaskRequest setCollectInterval(String collectInterval) {
        this.collectInterval = collectInterval;
        return this;
    }
    public String getCollectInterval() {
        return this.collectInterval;
    }

    public CreateHybridMonitorTaskRequest setCollectTargetType(String collectTargetType) {
        this.collectTargetType = collectTargetType;
        return this;
    }
    public String getCollectTargetType() {
        return this.collectTargetType;
    }

    public CreateHybridMonitorTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateHybridMonitorTaskRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateHybridMonitorTaskRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateHybridMonitorTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateHybridMonitorTaskRequest setSLSProcessConfig(CreateHybridMonitorTaskRequestSLSProcessConfig SLSProcessConfig) {
        this.SLSProcessConfig = SLSProcessConfig;
        return this;
    }
    public CreateHybridMonitorTaskRequestSLSProcessConfig getSLSProcessConfig() {
        return this.SLSProcessConfig;
    }

    public CreateHybridMonitorTaskRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public CreateHybridMonitorTaskRequest setTargetUserIdList(String targetUserIdList) {
        this.targetUserIdList = targetUserIdList;
        return this;
    }
    public String getTargetUserIdList() {
        return this.targetUserIdList;
    }

    public CreateHybridMonitorTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateHybridMonitorTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateHybridMonitorTaskRequest setYARMConfig(String YARMConfig) {
        this.YARMConfig = YARMConfig;
        return this;
    }
    public String getYARMConfig() {
        return this.YARMConfig;
    }

    public static class CreateHybridMonitorTaskRequestAttachLabels extends TeaModel {
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

        public static CreateHybridMonitorTaskRequestAttachLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridMonitorTaskRequestAttachLabels self = new CreateHybridMonitorTaskRequestAttachLabels();
            return TeaModel.build(map, self);
        }

        public CreateHybridMonitorTaskRequestAttachLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateHybridMonitorTaskRequestAttachLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateHybridMonitorTaskRequestSLSProcessConfigExpress extends TeaModel {
        /**
         * <p>The alias of the arithmetic operation result on the extended fields of SLS log statistics results.</p>
         * 
         * <strong>example:</strong>
         * <p>SuccRate</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The result of arithmetic operations on the extended fields of SLS log statistics results.</p>
         * 
         * <strong>example:</strong>
         * <p>success_count</p>
         */
        @NameInMap("Express")
        public String express;

        public static CreateHybridMonitorTaskRequestSLSProcessConfigExpress build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridMonitorTaskRequestSLSProcessConfigExpress self = new CreateHybridMonitorTaskRequestSLSProcessConfigExpress();
            return TeaModel.build(map, self);
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigExpress setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigExpress setExpress(String express) {
            this.express = express;
            return this;
        }
        public String getExpress() {
            return this.express;
        }

    }

    public static class CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters extends TeaModel {
        /**
         * <p>The method used to filter parameter values in SLS logs. Valid values:</p>
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
         * <p>The name of the parameter to filter in SLS logs.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("SLSKeyName")
        public String SLSKeyName;

        /**
         * <p>The filter value of the parameter in SLS logs.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters self = new CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters();
            return TeaModel.build(map, self);
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateHybridMonitorTaskRequestSLSProcessConfigFilter extends TeaModel {
        /**
         * <p>The list of filter conditions for parameters in SLS logs.</p>
         */
        @NameInMap("Filters")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters> filters;

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

        public static CreateHybridMonitorTaskRequestSLSProcessConfigFilter build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridMonitorTaskRequestSLSProcessConfigFilter self = new CreateHybridMonitorTaskRequestSLSProcessConfigFilter();
            return TeaModel.build(map, self);
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigFilter setFilters(java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters> getFilters() {
            return this.filters;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigFilter setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

    }

    public static class CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy extends TeaModel {
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

        public static CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy self = new CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy();
            return TeaModel.build(map, self);
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

    }

    public static class CreateHybridMonitorTaskRequestSLSProcessConfigStatistics extends TeaModel {
        /**
         * <p>The alias of the SLS log statistics result.</p>
         * 
         * <strong>example:</strong>
         * <p>level_count</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>Aggregates log data within the statistical period by using the specified statistical method. Valid values:</p>
         * <ul>
         * <li>count: counts the number of occurrences.</li>
         * <li>sum: calculates the sum.</li>
         * <li>avg: calculates the average.</li>
         * <li>max: returns the maximum value.</li>
         * <li>min: returns the minimum value.</li>
         * <li>value: samples within the statistical period.</li>
         * <li>countps: calculates the average count per second for the specified field within the statistical period.</li>
         * <li>sumps: calculates the average sum per second for the specified field within the statistical period.</li>
         * <li>distinct: counts the number of occurrences of the specified field after deduplication within the statistical period.</li>
         * <li>distribution: counts the number of occurrences of field values within a specified range.</li>
         * <li>percentile: calculates the distribution value of field values, such as P50.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The statistical value of SLS logs.</p>
         * <ul>
         * <li><p>If Function is set to <code>distribution</code>, this parameter specifies the lower limit of the statistical range. For example, to count the number of 2XX HTTP status codes, set this parameter to 200.</p>
         * </li>
         * <li><p>If Function is set to <code>percentile</code>, this parameter specifies the percentile of the statistical distribution. For example, 0.5 indicates P50.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Parameter1")
        public String parameter1;

        /**
         * <p>The statistical value of SLS logs.</p>
         * <blockquote>
         * <p>This parameter is required only when Function is set to <code>distribution</code>. This parameter specifies the upper limit of the statistical range. For example, to count the number of 2XX HTTP status codes, set this parameter to 299.</p>
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

        public static CreateHybridMonitorTaskRequestSLSProcessConfigStatistics build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridMonitorTaskRequestSLSProcessConfigStatistics self = new CreateHybridMonitorTaskRequestSLSProcessConfigStatistics();
            return TeaModel.build(map, self);
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigStatistics setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigStatistics setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigStatistics setParameter1(String parameter1) {
            this.parameter1 = parameter1;
            return this;
        }
        public String getParameter1() {
            return this.parameter1;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigStatistics setParameter2(String parameter2) {
            this.parameter2 = parameter2;
            return this;
        }
        public String getParameter2() {
            return this.parameter2;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfigStatistics setSLSKeyName(String SLSKeyName) {
            this.SLSKeyName = SLSKeyName;
            return this;
        }
        public String getSLSKeyName() {
            return this.SLSKeyName;
        }

    }

    public static class CreateHybridMonitorTaskRequestSLSProcessConfig extends TeaModel {
        /**
         * <p>The result of arithmetic operations on the extended fields of SLS log statistics results.</p>
         */
        @NameInMap("Express")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigExpress> express;

        /**
         * <p>The filter conditions for parameters in SLS logs.</p>
         */
        @NameInMap("Filter")
        public CreateHybridMonitorTaskRequestSLSProcessConfigFilter filter;

        /**
         * <p>Aggregates data by spatial dimension, which is equivalent to the GROUP BY clause in SQL.</p>
         */
        @NameInMap("GroupBy")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy> groupBy;

        /**
         * <p>The method used to aggregate SLS log data.</p>
         */
        @NameInMap("Statistics")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigStatistics> statistics;

        public static CreateHybridMonitorTaskRequestSLSProcessConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateHybridMonitorTaskRequestSLSProcessConfig self = new CreateHybridMonitorTaskRequestSLSProcessConfig();
            return TeaModel.build(map, self);
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfig setExpress(java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigExpress> express) {
            this.express = express;
            return this;
        }
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigExpress> getExpress() {
            return this.express;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfig setFilter(CreateHybridMonitorTaskRequestSLSProcessConfigFilter filter) {
            this.filter = filter;
            return this;
        }
        public CreateHybridMonitorTaskRequestSLSProcessConfigFilter getFilter() {
            return this.filter;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfig setGroupBy(java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy> groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy> getGroupBy() {
            return this.groupBy;
        }

        public CreateHybridMonitorTaskRequestSLSProcessConfig setStatistics(java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigStatistics> statistics) {
            this.statistics = statistics;
            return this;
        }
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigStatistics> getStatistics() {
            return this.statistics;
        }

    }

}
