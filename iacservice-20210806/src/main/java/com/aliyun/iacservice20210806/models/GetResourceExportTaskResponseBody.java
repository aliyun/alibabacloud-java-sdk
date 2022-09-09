// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetResourceExportTaskResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("task")
    public GetResourceExportTaskResponseBodyTask task;

    public static GetResourceExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceExportTaskResponseBody self = new GetResourceExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceExportTaskResponseBody setTask(GetResourceExportTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetResourceExportTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetResourceExportTaskResponseBodyTaskExcludeRules extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("values")
        public java.util.List<String> values;

        public static GetResourceExportTaskResponseBodyTaskExcludeRules build(java.util.Map<String, ?> map) throws Exception {
            GetResourceExportTaskResponseBodyTaskExcludeRules self = new GetResourceExportTaskResponseBodyTaskExcludeRules();
            return TeaModel.build(map, self);
        }

        public GetResourceExportTaskResponseBodyTaskExcludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetResourceExportTaskResponseBodyTaskExcludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetResourceExportTaskResponseBodyTaskExportToModule extends TeaModel {
        @NameInMap("source")
        public String source;

        @NameInMap("sourcePath")
        public String sourcePath;

        @NameInMap("statePath")
        public String statePath;

        public static GetResourceExportTaskResponseBodyTaskExportToModule build(java.util.Map<String, ?> map) throws Exception {
            GetResourceExportTaskResponseBodyTaskExportToModule self = new GetResourceExportTaskResponseBodyTaskExportToModule();
            return TeaModel.build(map, self);
        }

        public GetResourceExportTaskResponseBodyTaskExportToModule setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetResourceExportTaskResponseBodyTaskExportToModule setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public GetResourceExportTaskResponseBodyTaskExportToModule setStatePath(String statePath) {
            this.statePath = statePath;
            return this;
        }
        public String getStatePath() {
            return this.statePath;
        }

    }

    public static class GetResourceExportTaskResponseBodyTaskIncludeRules extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("values")
        public java.util.List<String> values;

        public static GetResourceExportTaskResponseBodyTaskIncludeRules build(java.util.Map<String, ?> map) throws Exception {
            GetResourceExportTaskResponseBodyTaskIncludeRules self = new GetResourceExportTaskResponseBodyTaskIncludeRules();
            return TeaModel.build(map, self);
        }

        public GetResourceExportTaskResponseBodyTaskIncludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetResourceExportTaskResponseBodyTaskIncludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetResourceExportTaskResponseBodyTaskModules extends TeaModel {
        @NameInMap("source")
        public String source;

        @NameInMap("sourcePath")
        public String sourcePath;

        @NameInMap("version")
        public String version;

        public static GetResourceExportTaskResponseBodyTaskModules build(java.util.Map<String, ?> map) throws Exception {
            GetResourceExportTaskResponseBodyTaskModules self = new GetResourceExportTaskResponseBodyTaskModules();
            return TeaModel.build(map, self);
        }

        public GetResourceExportTaskResponseBodyTaskModules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetResourceExportTaskResponseBodyTaskModules setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public GetResourceExportTaskResponseBodyTaskModules setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetResourceExportTaskResponseBodyTaskVariables extends TeaModel {
        @NameInMap("properties")
        public java.util.List<String> properties;

        @NameInMap("resourceType")
        public String resourceType;

        public static GetResourceExportTaskResponseBodyTaskVariables build(java.util.Map<String, ?> map) throws Exception {
            GetResourceExportTaskResponseBodyTaskVariables self = new GetResourceExportTaskResponseBodyTaskVariables();
            return TeaModel.build(map, self);
        }

        public GetResourceExportTaskResponseBodyTaskVariables setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<String> getProperties() {
            return this.properties;
        }

        public GetResourceExportTaskResponseBodyTaskVariables setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetResourceExportTaskResponseBodyTask extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("excludeRules")
        public java.util.List<GetResourceExportTaskResponseBodyTaskExcludeRules> excludeRules;

        @NameInMap("exportTaskId")
        public String exportTaskId;

        @NameInMap("exportToModule")
        public GetResourceExportTaskResponseBodyTaskExportToModule exportToModule;

        @NameInMap("exportVersion")
        public String exportVersion;

        @NameInMap("failedReason")
        public String failedReason;

        @NameInMap("includeRules")
        public java.util.List<GetResourceExportTaskResponseBodyTaskIncludeRules> includeRules;

        @NameInMap("modules")
        public java.util.List<GetResourceExportTaskResponseBodyTaskModules> modules;

        @NameInMap("name")
        public String name;

        @NameInMap("ramRole")
        public String ramRole;

        @NameInMap("status")
        public String status;

        @NameInMap("taskOutputPath")
        public String taskOutputPath;

        @NameInMap("terraformVersion")
        public String terraformVersion;

        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        @NameInMap("variables")
        public java.util.List<GetResourceExportTaskResponseBodyTaskVariables> variables;

        public static GetResourceExportTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetResourceExportTaskResponseBodyTask self = new GetResourceExportTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetResourceExportTaskResponseBodyTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetResourceExportTaskResponseBodyTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourceExportTaskResponseBodyTask setExcludeRules(java.util.List<GetResourceExportTaskResponseBodyTaskExcludeRules> excludeRules) {
            this.excludeRules = excludeRules;
            return this;
        }
        public java.util.List<GetResourceExportTaskResponseBodyTaskExcludeRules> getExcludeRules() {
            return this.excludeRules;
        }

        public GetResourceExportTaskResponseBodyTask setExportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }
        public String getExportTaskId() {
            return this.exportTaskId;
        }

        public GetResourceExportTaskResponseBodyTask setExportToModule(GetResourceExportTaskResponseBodyTaskExportToModule exportToModule) {
            this.exportToModule = exportToModule;
            return this;
        }
        public GetResourceExportTaskResponseBodyTaskExportToModule getExportToModule() {
            return this.exportToModule;
        }

        public GetResourceExportTaskResponseBodyTask setExportVersion(String exportVersion) {
            this.exportVersion = exportVersion;
            return this;
        }
        public String getExportVersion() {
            return this.exportVersion;
        }

        public GetResourceExportTaskResponseBodyTask setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public GetResourceExportTaskResponseBodyTask setIncludeRules(java.util.List<GetResourceExportTaskResponseBodyTaskIncludeRules> includeRules) {
            this.includeRules = includeRules;
            return this;
        }
        public java.util.List<GetResourceExportTaskResponseBodyTaskIncludeRules> getIncludeRules() {
            return this.includeRules;
        }

        public GetResourceExportTaskResponseBodyTask setModules(java.util.List<GetResourceExportTaskResponseBodyTaskModules> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<GetResourceExportTaskResponseBodyTaskModules> getModules() {
            return this.modules;
        }

        public GetResourceExportTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetResourceExportTaskResponseBodyTask setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetResourceExportTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResourceExportTaskResponseBodyTask setTaskOutputPath(String taskOutputPath) {
            this.taskOutputPath = taskOutputPath;
            return this;
        }
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        public GetResourceExportTaskResponseBodyTask setTerraformVersion(String terraformVersion) {
            this.terraformVersion = terraformVersion;
            return this;
        }
        public String getTerraformVersion() {
            return this.terraformVersion;
        }

        public GetResourceExportTaskResponseBodyTask setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

        public GetResourceExportTaskResponseBodyTask setVariables(java.util.List<GetResourceExportTaskResponseBodyTaskVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetResourceExportTaskResponseBodyTaskVariables> getVariables() {
            return this.variables;
        }

    }

}
