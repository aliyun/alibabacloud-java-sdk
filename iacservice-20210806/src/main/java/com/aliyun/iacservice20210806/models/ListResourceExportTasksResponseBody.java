// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTasksResponseBody extends TeaModel {
    @NameInMap("exportTasks")
    public java.util.List<ListResourceExportTasksResponseBodyExportTasks> exportTasks;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>65287CB9-AC46-5FE7-B785-0106C159DA42</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>330</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListResourceExportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExportTasksResponseBody self = new ListResourceExportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceExportTasksResponseBody setExportTasks(java.util.List<ListResourceExportTasksResponseBodyExportTasks> exportTasks) {
        this.exportTasks = exportTasks;
        return this;
    }
    public java.util.List<ListResourceExportTasksResponseBodyExportTasks> getExportTasks() {
        return this.exportTasks;
    }

    public ListResourceExportTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceExportTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceExportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceExportTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceExportTasksResponseBodyExportTasksExportToModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>alibaba/security-group/alicloud</p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("statePath")
        public String statePath;

        public static ListResourceExportTasksResponseBodyExportTasksExportToModule build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTasksResponseBodyExportTasksExportToModule self = new ListResourceExportTasksResponseBodyExportTasksExportToModule();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTasksResponseBodyExportTasksExportToModule setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListResourceExportTasksResponseBodyExportTasksExportToModule setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public ListResourceExportTasksResponseBodyExportTasksExportToModule setStatePath(String statePath) {
            this.statePath = statePath;
            return this;
        }
        public String getStatePath() {
            return this.statePath;
        }

    }

    public static class ListResourceExportTasksResponseBodyExportTasksIncludeRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ZoneId</p>
         */
        @NameInMap("key")
        public String key;

        @NameInMap("values")
        public java.util.List<String> values;

        public static ListResourceExportTasksResponseBodyExportTasksIncludeRules build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTasksResponseBodyExportTasksIncludeRules self = new ListResourceExportTasksResponseBodyExportTasksIncludeRules();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTasksResponseBodyExportTasksIncludeRules setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceExportTasksResponseBodyExportTasksIncludeRules setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class ListResourceExportTasksResponseBodyExportTasksModules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>oss::https://.oss-cn-hangzhou.aliyuncs.com/xxx.zip</p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("version")
        public String version;

        public static ListResourceExportTasksResponseBodyExportTasksModules build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTasksResponseBodyExportTasksModules self = new ListResourceExportTasksResponseBodyExportTasksModules();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTasksResponseBodyExportTasksModules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListResourceExportTasksResponseBodyExportTasksModules setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public ListResourceExportTasksResponseBodyExportTasksModules setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListResourceExportTasksResponseBodyExportTasksVariables extends TeaModel {
        @NameInMap("properties")
        public java.util.List<String> properties;

        /**
         * <strong>example:</strong>
         * <p>AliCloud::VPC::VPC</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static ListResourceExportTasksResponseBodyExportTasksVariables build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTasksResponseBodyExportTasksVariables self = new ListResourceExportTasksResponseBodyExportTasksVariables();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTasksResponseBodyExportTasksVariables setProperties(java.util.List<String> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<String> getProperties() {
            return this.properties;
        }

        public ListResourceExportTasksResponseBodyExportTasksVariables setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListResourceExportTasksResponseBodyExportTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-02-20T02:10:06Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>4243</p>
         */
        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("exportStatus")
        public String exportStatus;

        /**
         * <strong>example:</strong>
         * <p>ex-kw1a1ol8c0pngjav17q8eri</p>
         */
        @NameInMap("exportTaskId")
        public String exportTaskId;

        @NameInMap("exportToModule")
        public ListResourceExportTasksResponseBodyExportTasksExportToModule exportToModule;

        /**
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("exportVersion")
        public String exportVersion;

        @NameInMap("includeRules")
        public java.util.List<ListResourceExportTasksResponseBodyExportTasksIncludeRules> includeRules;

        @NameInMap("modules")
        public java.util.List<ListResourceExportTasksResponseBodyExportTasksModules> modules;

        /**
         * <strong>example:</strong>
         * <p>vpc_all</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("variables")
        public java.util.List<ListResourceExportTasksResponseBodyExportTasksVariables> variables;

        public static ListResourceExportTasksResponseBodyExportTasks build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExportTasksResponseBodyExportTasks self = new ListResourceExportTasksResponseBodyExportTasks();
            return TeaModel.build(map, self);
        }

        public ListResourceExportTasksResponseBodyExportTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListResourceExportTasksResponseBodyExportTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceExportTasksResponseBodyExportTasks setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public ListResourceExportTasksResponseBodyExportTasks setExportStatus(String exportStatus) {
            this.exportStatus = exportStatus;
            return this;
        }
        public String getExportStatus() {
            return this.exportStatus;
        }

        public ListResourceExportTasksResponseBodyExportTasks setExportTaskId(String exportTaskId) {
            this.exportTaskId = exportTaskId;
            return this;
        }
        public String getExportTaskId() {
            return this.exportTaskId;
        }

        public ListResourceExportTasksResponseBodyExportTasks setExportToModule(ListResourceExportTasksResponseBodyExportTasksExportToModule exportToModule) {
            this.exportToModule = exportToModule;
            return this;
        }
        public ListResourceExportTasksResponseBodyExportTasksExportToModule getExportToModule() {
            return this.exportToModule;
        }

        public ListResourceExportTasksResponseBodyExportTasks setExportVersion(String exportVersion) {
            this.exportVersion = exportVersion;
            return this;
        }
        public String getExportVersion() {
            return this.exportVersion;
        }

        public ListResourceExportTasksResponseBodyExportTasks setIncludeRules(java.util.List<ListResourceExportTasksResponseBodyExportTasksIncludeRules> includeRules) {
            this.includeRules = includeRules;
            return this;
        }
        public java.util.List<ListResourceExportTasksResponseBodyExportTasksIncludeRules> getIncludeRules() {
            return this.includeRules;
        }

        public ListResourceExportTasksResponseBodyExportTasks setModules(java.util.List<ListResourceExportTasksResponseBodyExportTasksModules> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<ListResourceExportTasksResponseBodyExportTasksModules> getModules() {
            return this.modules;
        }

        public ListResourceExportTasksResponseBodyExportTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListResourceExportTasksResponseBodyExportTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceExportTasksResponseBodyExportTasks setVariables(java.util.List<ListResourceExportTasksResponseBodyExportTasksVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListResourceExportTasksResponseBodyExportTasksVariables> getVariables() {
            return this.variables;
        }

    }

}
