// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListResourceExportTaskVersionsResponseBody extends TeaModel {
    /**
     * <p>The list of export task versions.</p>
     */
    @NameInMap("exportTasks")
    public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasks> exportTasks;

    /**
     * <p>The page number. Default value: 1.</p>
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
     * <p>860FDEEE-1CA3-55F3-97F6-63FC40B7962D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>72</p>
     */
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

    public static class ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule extends TeaModel {
        /**
         * <p>The module type in which the exported template is saved. Valid values:</p>
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
         * <p>The path of the state file corresponding to the module.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
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
        /**
         * <p>The name of the inclusion rule for resource export. Valid values:</p>
         * <ul>
         * <li>ResourceType: required. The resource type. Example: ALIYUN::VPC::VPC.</li>
         * <li>RegionId: required. The region to which the resource belongs. Only one region is supported. Example: ap-southeast-1.</li>
         * <li>\<ResourceType>:Id: the resource ID. Example: ALIYUN::VPC::VPC:Id.</li>
         * <li>ResourceGroupId: the resource group ID. Example: rg-1234.</li>
         * <li>ZoneId: the zone to which the resource belongs. Only one zone is supported. Example: ap-southeast-1h.</li>
         * </ul>
         * <p>Multiple filter conditions are combined by using the AND operator. A resource is matched only if all filter conditions are met.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The values of the inclusion rules for resource export.</p>
         */
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
         * <li><p>If Source is set to CloudRegistry, the format is: &quot;cloudregistry::iacservice//&quot;</p>
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
         * <p>The version of the module where the exported template is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
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
        /**
         * <p>The list of Terraform resource properties corresponding to the resource type.</p>
         */
        @NameInMap("properties")
        public java.util.List<String> properties;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Vswitch</p>
         */
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-11T02:18:50Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description.</p>
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
         * <p>4521</p>
         */
        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <p>The ID of the resource export task.</p>
         * 
         * <strong>example:</strong>
         * <p>ex-al1711jl6hd8u5crggeq6v</p>
         */
        @NameInMap("exportTaskId")
        public String exportTaskId;

        /**
         * <p>Saves the exported template as a module. If this parameter is not set, the template is automatically saved in the registry.</p>
         */
        @NameInMap("exportToModule")
        public ListResourceExportTaskVersionsResponseBodyExportTasksExportToModule exportToModule;

        /**
         * <p>The resource export version.</p>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        @NameInMap("exportVersion")
        public String exportVersion;

        /**
         * <p>The reason for the export failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Reason</p>
         */
        @NameInMap("failedReason")
        public String failedReason;

        /**
         * <p>The list of inclusion rules used when exporting resources.</p>
         */
        @NameInMap("includeRules")
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksIncludeRules> includeRules;

        /**
         * <p>The module configuration of the exported resources.</p>
         */
        @NameInMap("modules")
        public java.util.List<ListResourceExportTaskVersionsResponseBodyExportTasksModules> modules;

        /**
         * <p>The name of the export task.</p>
         * 
         * <strong>example:</strong>
         * <p>TaskName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version export status. Valid values:</p>
         * <ul>
         * <li>Queue: queued</li>
         * <li>Pending: preparing to run</li>
         * <li>Success: succeeded</li>
         * <li>Errored: failed</li>
         * <li>Canceled: canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of variables. Parameters of the exported resources are set as variables.</p>
         */
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

        public ListResourceExportTaskVersionsResponseBodyExportTasks setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
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
