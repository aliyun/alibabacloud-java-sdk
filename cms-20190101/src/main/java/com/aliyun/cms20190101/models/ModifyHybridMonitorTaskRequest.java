// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifyHybridMonitorTaskRequest extends TeaModel {
    @NameInMap("AttachLabels")
    public java.util.List<ModifyHybridMonitorTaskRequestAttachLabels> attachLabels;

    @NameInMap("CollectInterval")
    public String collectInterval;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SLSProcessConfig")
    public ModifyHybridMonitorTaskRequestSLSProcessConfig SLSProcessConfig;

    @NameInMap("TaskId")
    public String taskId;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Alias")
        public String alias;

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
        @NameInMap("Operator")
        public String operator;

        @NameInMap("SLSKeyName")
        public String SLSKeyName;

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
        @NameInMap("Filters")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigFilterFilters> filters;

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
        @NameInMap("Alias")
        public String alias;

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
        @NameInMap("Express")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigExpress> express;

        @NameInMap("Filter")
        public ModifyHybridMonitorTaskRequestSLSProcessConfigFilter filter;

        @NameInMap("GroupBy")
        public java.util.List<ModifyHybridMonitorTaskRequestSLSProcessConfigGroupBy> groupBy;

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
