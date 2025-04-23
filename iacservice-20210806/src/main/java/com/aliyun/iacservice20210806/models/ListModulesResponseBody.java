// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListModulesResponseBody extends TeaModel {
    @NameInMap("modules")
    public java.util.List<ListModulesResponseBodyModules> modules;

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
     * <p>C617E03B-3DD2-5F0C-A6CF-3028B499A2D5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
        @NameInMap("groupId")
        public String groupId;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("projectId")
        public String projectId;

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
        @NameInMap("key")
        public String key;

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
         * <strong>example:</strong>
         * <p>2022-01-30T02:14:16Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("deletionProtection")
        public Boolean deletionProtection;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("groupInfo")
        public ListModulesResponseBodyModulesGroupInfo groupInfo;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        /**
         * <strong>example:</strong>
         * <p>mod-518855d9a058cdbd3fd6951d59</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        @NameInMap("sourceConfig")
        public java.util.Map<String, ?> sourceConfig;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("status")
        public String status;

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

        public ListModulesResponseBodyModules setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
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

        public ListModulesResponseBodyModules setSourceConfig(java.util.Map<String, ?> sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public java.util.Map<String, ?> getSourceConfig() {
            return this.sourceConfig;
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
