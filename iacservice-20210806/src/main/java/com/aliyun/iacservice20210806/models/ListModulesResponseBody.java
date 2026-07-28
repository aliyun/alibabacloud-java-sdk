// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListModulesResponseBody extends TeaModel {
    /**
     * <p>The list of templates.</p>
     */
    @NameInMap("modules")
    public java.util.List<ListModulesResponseBodyModules> modules;

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
     * <p>C617E03B-3DD2-5F0C-A6CF-3028B499A2D5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2790</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModulesResponseBody self = new ListModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModulesResponseBody setModules(java.util.List<ListModulesResponseBodyModules> modules) {
        this.modules = modules;
        return this;
    }
    public java.util.List<ListModulesResponseBodyModules> getModules() {
        return this.modules;
    }

    public ListModulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModulesResponseBodyModulesGroupInfo extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>g-kw1a58tb5m2j7rpsa6j25</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>groupName</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-fu1a50tjdaff2lppddqsm</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>projectName</p>
         */
        @NameInMap("projectName")
        public String projectName;

        public static ListModulesResponseBodyModulesGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            ListModulesResponseBodyModulesGroupInfo self = new ListModulesResponseBodyModulesGroupInfo();
            return TeaModel.build(map, self);
        }

        public ListModulesResponseBodyModulesGroupInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListModulesResponseBodyModulesGroupInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListModulesResponseBodyModulesGroupInfo setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListModulesResponseBodyModulesGroupInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class ListModulesResponseBodyModulesTags extends TeaModel {
        /**
         * <p>The tag key of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag key of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        /**
         * <p>The tag value of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("value")
        public String value;

        public static ListModulesResponseBodyModulesTags build(java.util.Map<String, ?> map) throws Exception {
            ListModulesResponseBodyModulesTags self = new ListModulesResponseBodyModulesTags();
            return TeaModel.build(map, self);
        }

        public ListModulesResponseBodyModulesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListModulesResponseBodyModulesTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListModulesResponseBodyModulesTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListModulesResponseBodyModulesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListModulesResponseBodyModules extends TeaModel {
        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-30T02:14:16Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Indicates whether deletion protection is enabled. Deletion protection is automatically enabled when the template is associated with a node, which prevents the template from being deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>this is description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The group information.</p>
         */
        @NameInMap("groupInfo")
        public ListModulesResponseBodyModulesGroupInfo groupInfo;

        /**
         * <p>The latest version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-518855d9a058cdbd3fd6951d59</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>ModuleName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The template source. Valid values:</p>
         * <ul>
         * <li>OSS: imported from OSS.</li>
         * <li>Registry: created from a template in the template center.</li>
         * <li>ExportTask: exported from a resource export task.</li>
         * <li>Upload: uploaded as a file.</li>
         * <li>Shared: cloned from a shared template.</li>
         * <li>Editor: created by using the online editor.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The template status. Valid values:</p>
         * <ul>
         * <li>Creating: the template is being created.</li>
         * <li>Created: the template has been created. You can publish a version after the template is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of template tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListModulesResponseBodyModulesTags> tags;

        public static ListModulesResponseBodyModules build(java.util.Map<String, ?> map) throws Exception {
            ListModulesResponseBodyModules self = new ListModulesResponseBodyModules();
            return TeaModel.build(map, self);
        }

        public ListModulesResponseBodyModules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModulesResponseBodyModules setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public ListModulesResponseBodyModules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModulesResponseBodyModules setGroupInfo(ListModulesResponseBodyModulesGroupInfo groupInfo) {
            this.groupInfo = groupInfo;
            return this;
        }
        public ListModulesResponseBodyModulesGroupInfo getGroupInfo() {
            return this.groupInfo;
        }

        public ListModulesResponseBodyModules setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListModulesResponseBodyModules setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModulesResponseBodyModules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModulesResponseBodyModules setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListModulesResponseBodyModules setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListModulesResponseBodyModules setTags(java.util.List<ListModulesResponseBodyModulesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListModulesResponseBodyModulesTags> getTags() {
            return this.tags;
        }

    }

}
