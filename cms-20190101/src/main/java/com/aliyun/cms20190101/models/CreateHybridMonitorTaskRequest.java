// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorTaskRequest extends TeaModel {
    @NameInMap("AttachLabels")
    public java.util.List<CreateHybridMonitorTaskRequestAttachLabels> attachLabels;

    /**
     * <p>The interval at which metrics are collected. Valid values:</p>
     * <br>
     * <p>*   15</p>
     * <p>*   60 (default value)</p>
     * <br>
     * <p>Unit: seconds.</p>
     * <br>
     * <p>>  This parameter is required only if the `TaskType` parameter is set to `aliyun_sls`.</p>
     */
    @NameInMap("CollectInterval")
    public String collectInterval;

    /**
     * <p>The type of the collection target.</p>
     * <br>
     * <p>*   If the `TaskType` parameter is set to `aliyun_fc`, enter `aliyun_fc`.</p>
     * <p>*   If the `TaskType` parameter is set to `aliyun_sls`, enter the name of the Logstore group.</p>
     */
    @NameInMap("CollectTargetType")
    public String collectTargetType;

    /**
     * <p>The description of the metric import task.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the application group.</p>
     * <br>
     * <p>For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     * <br>
     * <p>>  This parameter is required only if the `TaskType` parameter is set to `aliyun_sls`.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the namespace.</p>
     * <br>
     * <p>For information about how to obtain the name of a namespace, see [DescribeHybridMonitorNamespaceList](~~428880~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The configurations of the logs that are imported from Log Service.</p>
     * <br>
     * <p>>  This parameter is required only if the `TaskType` parameter is set to `aliyun_sls`.</p>
     */
    @NameInMap("SLSProcessConfig")
    public CreateHybridMonitorTaskRequestSLSProcessConfig SLSProcessConfig;

    /**
     * <p>The ID of the member account.</p>
     * <br>
     * <p>If you call API operations by using a management account, you can connect the Alibaba Cloud services that are activated for a member account in a resource directory to Hybrid Cloud Monitoring. You can use the resource directory to monitor Alibaba Cloud services across enterprise accounts.</p>
     * <br>
     * <p>>  This parameter is required only if the `TaskType` parameter is set to `aliyun_fc`.</p>
     */
    @NameInMap("TargetUserId")
    public String targetUserId;

    /**
     * <p>The IDs of the member accounts. Separate multiple member account IDs with commas (,).</p>
     * <br>
     * <p>>  This parameter is required only if you call this operation by using the management account.</p>
     */
    @NameInMap("TargetUserIdList")
    public String targetUserIdList;

    /**
     * <p>The name of the metric import task.</p>
     * <br>
     * <p>*   If the `TaskType` parameter is set to `aliyun_fc`, enter the name of the metric import task.</p>
     * <p>*   If the `TaskType` parameter is set to `aliyun_sls`, enter the name of the metric for logs imported from Log Service.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Specifies whether to create a metric import task for an Alibaba Cloud service or create a metric for logs imported from Log Service. Valid values:</p>
     * <br>
     * <p>*   aliyun_fc: creates a metric import task for an Alibaba Cloud service</p>
     * <p>*   aliyun_sls: creates a metric for logs imported from Log Service</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.</p>
     * <br>
     * <p>*   namespace: the namespace of the Alibaba Cloud service. For information about how to query the namespace of an Alibaba Cloud service, see [DescribeMetricMetaList](~~98846~~).</p>
     * <p>*   metric_list: the metrics of the Alibaba Cloud service. For information about how to query the metrics of an Alibaba Cloud service, see [DescribeMetricMetaList](~~98846~~).</p>
     * <br>
     * <p>The following code shows a sample configuration file:</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>products:</p>
     * <p>- namespace: acs_ecs_dashboard</p>
     * <p>  metric_info:</p>
     * <p>  - metric_list:</p>
     * <p>    - cpu_total</p>
     * <p>    - cpu_idle</p>
     * <p>    - diskusage_utilization</p>
     * <p>    - CPUUtilization</p>
     * <p>    - DiskReadBPS</p>
     * <p>    - InternetOut</p>
     * <p>    - IntranetOut</p>
     * <p>    - cpu_system</p>
     * <p>- namespace: acs_rds_dashboard</p>
     * <p>  metric_info:</p>
     * <p>  - metric_list:</p>
     * <p>    - MySQL_QPS</p>
     * <p>    - MySQL_TPS</p>
     * <p>```</p>
     * <br>
     * <p>>  This parameter is required only if the `TaskType` parameter is set to `aliyun_fc`.</p>
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
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tag value of the metric.</p>
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
         * <p>The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The extended field that specifies the result of basic operations that are performed on aggregation results.</p>
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
         * <p>The conditions that are used to filter logs imported from Log Service.</p>
         */
        @NameInMap("Filters")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters> filters;

        /**
         * <p>The relationship between multiple filter conditions. Valid values:</p>
         * <br>
         * <p>*   and (default value): Logs are processed only if all filter conditions are met.</p>
         * <p>*   or: Logs are processed if one of the filter conditions is met.</p>
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
         * <p>The alias of the aggregation result.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the key that is used to aggregate logs imported from Log Service.</p>
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
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Function")
        public String function;

        @NameInMap("Parameter1")
        public String parameter1;

        @NameInMap("Parameter2")
        public String parameter2;

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
         * <p>The extended fields that specify the results of basic operations that are performed on aggregation results.</p>
         */
        @NameInMap("Express")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigExpress> express;

        /**
         * <p>The conditions that are used to filter logs imported from Log Service.</p>
         */
        @NameInMap("Filter")
        public CreateHybridMonitorTaskRequestSLSProcessConfigFilter filter;

        /**
         * <p>The dimension based on which data is aggregated. This parameter is equivalent to the GROUP BY clause in SQL.</p>
         */
        @NameInMap("GroupBy")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigGroupBy> groupBy;

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
