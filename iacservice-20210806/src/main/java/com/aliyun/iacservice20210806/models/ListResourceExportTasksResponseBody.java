// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTasksResponseBody extends TeaModel {
    /**
     * <p>The list of export tasks.</p>
     */
    @NameInMap("exportTasks")
    public java.util.List<ListResourceExportTasksResponseBodyExportTasks> exportTasks;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65287CB9-AC46-5FE7-B785-0106C159DA42</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The module type to which the exported template is saved. Valid values:</p>
         * <ul>
         * <li>OSS: OSS</li>
         * <li>Registry: Terraform Registry.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The path where the template content is saved.</p>
         * <ul>
         * <li><p>If Source is set to Registry, the format is: &quot;cloudregistry::iacservice//&quot;</p>
         * </li>
         * <li><p>If Source is set to OSS, the format is: &quot;oss::https://.oss-ap-southeast-1.aliyuncs.com/xxx.zip&quot;.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss::https://.oss-cn-hangzhou.aliyuncs.com/xxx.zip</p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <p>The path where the template state file is saved.</p>
         * 
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
         * <p>The name of the include rule for resource export. Valid values:</p>
         * <ul>
         * <li>ResourceType: required. The resource type, such as ALIYUN::VPC::VPC.</li>
         * <li>RegionId: required. The region to which the resource belongs. Only one region is supported, such as ap-southeast-1.</li>
         * <li>\<ResourceType>:Id: the resource ID, such as ALIYUN::VPC::VPC:Id.</li>
         * <li>ResourceGroupId: the resource group ID, such as rg-1234.</li>
         * <li>ZoneId: the zone to which the resource belongs. Only one zone is supported, such as ap-southeast-1h.</li>
         * </ul>
         * <p>By default, the relationship between multiple filter conditions is AND. A resource is considered matched only when all filter conditions are met.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The values of the include rules for resource export.</p>
         */
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
         * <p>The module type where the exported template is stored. Two formats are supported: CloudRegistry and OSS. If the ExportToModule parameter is specified, both formats are returned. Otherwise, only CloudRegistry is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The download URL of the module where the exported template is stored.</p>
         * <ul>
         * <li><p>If Source is set to CloudRegistry, the format is: &quot;cloudregistry::iacservice/<exportTaskId>/<Provider Name>&quot;</p>
         * </li>
         * <li><p>If Source is set to OSS, the format is: &quot;oss::https://<BucketName>.oss-ap-southeast-1.aliyuncs.com/xxx.zip&quot;.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss::https://.oss-cn-hangzhou.aliyuncs.com/xxx.zip</p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <p>The version of the module where the exported template is stored.</p>
         * 
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
        /**
         * <p>The list of Terraform resource properties corresponding to the resource type.</p>
         */
        @NameInMap("properties")
        public java.util.List<String> properties;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::VSwitch</p>
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-02-20T02:10:06Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>this is description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The execution duration.</p>
         * 
         * <strong>example:</strong>
         * <p>4243</p>
         */
        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <p>The export status. Valid values:</p>
         * <ul>
         * <li>Queue: queued</li>
         * <li>Pending: preparing to run</li>
         * <li>Success: succeeded</li>
         * <li>Errored: failed</li>
         * <li>Canceled: canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("exportStatus")
        public String exportStatus;

        /**
         * <p>The ID of the resource export task.</p>
         * 
         * <strong>example:</strong>
         * <p>ex-kw1a1ol8c0pngjav17q8eri</p>
         */
        @NameInMap("exportTaskId")
        public String exportTaskId;

        /**
         * <p>The module to which the exported template is saved. If this parameter is not set, the template is automatically saved in the Registry.</p>
         */
        @NameInMap("exportToModule")
        public ListResourceExportTasksResponseBodyExportTasksExportToModule exportToModule;

        /**
         * <p>The export version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("exportVersion")
        public String exportVersion;

        /**
         * <p>The values of the include rules for resource export.</p>
         */
        @NameInMap("includeRules")
        public java.util.List<ListResourceExportTasksResponseBodyExportTasksIncludeRules> includeRules;

        /**
         * <p>The module configuration of the exported resources.</p>
         */
        @NameInMap("modules")
        public java.util.List<ListResourceExportTasksResponseBodyExportTasksModules> modules;

        /**
         * <p>The name of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Available: available</li>
         * <li>Running: running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of variables. The parameters of the exported resources are set as variables.</p>
         */
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
