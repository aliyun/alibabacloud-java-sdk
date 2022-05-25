// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateHybridMonitorTaskRequest extends TeaModel {
    @NameInMap("AttachLabels")
    public java.util.List<CreateHybridMonitorTaskRequestAttachLabels> attachLabels;

    @NameInMap("CollectInterval")
    public String collectInterval;

    @NameInMap("CollectTargetType")
    public String collectTargetType;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SLSProcessConfig")
    public CreateHybridMonitorTaskRequestSLSProcessConfig SLSProcessConfig;

    @NameInMap("TargetUserId")
    public String targetUserId;

    @NameInMap("TargetUserIdList")
    public String targetUserIdList;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskType")
    public String taskType;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Alias")
        public String alias;

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
        @NameInMap("Operator")
        public String operator;

        @NameInMap("SLSKeyName")
        public String SLSKeyName;

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
        @NameInMap("Filters")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigFilterFilters> filters;

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
        @NameInMap("Alias")
        public String alias;

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
        @NameInMap("Express")
        public java.util.List<CreateHybridMonitorTaskRequestSLSProcessConfigExpress> express;

        @NameInMap("Filter")
        public CreateHybridMonitorTaskRequestSLSProcessConfigFilter filter;

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
