// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListModulesResponseBody extends TeaModel {
    @NameInMap("modules")
    public java.util.List<ListModulesResponseBodyModules> modules;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("requestId")
    public String requestId;

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

    public static class ListModulesResponseBodyModules extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("deletionProtection")
        public Boolean deletionProtection;

        @NameInMap("description")
        public String description;

        @NameInMap("latestVersion")
        public String latestVersion;

        @NameInMap("meta")
        public java.util.Map<String, ?> meta;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("name")
        public String name;

        @NameInMap("source")
        public String source;

        @NameInMap("sourceConfig")
        public java.util.Map<String, ?> sourceConfig;

        @NameInMap("status")
        public String status;

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

    }

}
