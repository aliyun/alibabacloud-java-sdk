// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTaskVersionsResponseBody extends TeaModel {
    @NameInMap("exportTasks")
    public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasks> exportTasks;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListResourceExportTaskVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExportTaskVersionsResponseBody self = new ListResourceExportTaskVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceExportTaskVersionsResponseBody setExportTasks(java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasks> exportTasks) {
        this.exportTasks = exportTasks;
        return this;
    }
    public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasks> getExportTasks() {
        return this.exportTasks;
    }

    public ListResourceExportTaskVersionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceExportTaskVersionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceExportTaskVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceExportTaskVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("values")
        public java.util.List<String> values;

        public static ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules self = new ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule extends TeaModel {
        @NameInMap("source")
        public String source;

        @NameInMap("sourcePath")
        public String sourcePath;

        @NameInMap("statePath")
        public String statePath;

        public static ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule self = new ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule setStatePath(String statePath) {
            this.statePath = statePath;
            return this;
        }
        public String getStatePath() {
            return this.statePath;
        }

    }

    public static class ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("values")
        public java.util.List<String> values;

        public static ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules self = new ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListResourceExportTaskVersionsResponseBodyExportTasksModules extends TeaModel {
        @NameInMap("source")
        public String source;

        @NameInMap("sourcePath")
        public String sourcePath;

        @NameInMap("version")
        public String version;

        public static ListResourceExportTaskVersionsResponseBodyExportTasksModules build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTaskVersionsResponseBodyExportTasksModules self = new ListResourceExportTaskVersionsResponseBodyExportTasksModules();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksModules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksModules setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksModules setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListResourceExportTaskVersionsResponseBodyExportTasksVariables extends TeaModel {
        @NameInMap("properties")
        public java.util.List<String> properties;

        @NameInMap("resourceType")
        public String resourceType;

        public static ListResourceExportTaskVersionsResponseBodyExportTasksVariables build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTaskVersionsResponseBodyExportTasksVariables self = new ListResourceExportTaskVersionsResponseBodyExportTasksVariables();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksVariables setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<String> getProperties() {
            return this.properties;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasksVariables setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListResourceExportTaskVersionsResponseBodyExportTasks extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("excludeRules")
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules> excludeRules;

        @NameInMap("exportTaskId")
        public String exportTaskId;

        @NameInMap("exportToModule")
        public ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule exportToModule;

        @NameInMap("exportVersion")
        public String exportVersion;

        @NameInMap("failedReason")
        public String failedReason;

        @NameInMap("hasDestroy")
        public Boolean hasDestroy;

        @NameInMap("includeRules")
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules> includeRules;

        @NameInMap("modules")
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksModules> modules;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("variables")
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksVariables> variables;

        public static ListResourceExportTaskVersionsResponseBodyExportTasks build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTaskVersionsResponseBodyExportTasks self = new ListResourceExportTaskVersionsResponseBodyExportTasks();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setExcludeRules(java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules> excludeRules) {
            this.excludeRules = excludeRules;
            return this;
        }
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksExcludeRules> getExcludeRules() {
            return this.excludeRules;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setExportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }
        public String getExportTaskId() {
            return this.exportTaskId;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setExportToModule(ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule exportToModule) {
            this.exportToModule = exportToModule;
            return this;
        }
        public ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule getExportToModule() {
            return this.exportToModule;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setExportVersion(String exportVersion) {
            this.exportVersion = exportVersion;
            return this;
        }
        public String getExportVersion() {
            return this.exportVersion;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setHasDestroy(Boolean hasDestroy) {
            this.hasDestroy = hasDestroy;
            return this;
        }
        public Boolean getHasDestroy() {
            return this.hasDestroy;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setIncludeRules(java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules> includeRules) {
            this.includeRules = includeRules;
            return this;
        }
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules> getIncludeRules() {
            return this.includeRules;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setModules(java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksModules> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksModules> getModules() {
            return this.modules;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceExportTaskVersionsResponseBodyExportTasks setVariables(java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksVariables> getVariables() {
            return this.variables;
        }

    }

}
