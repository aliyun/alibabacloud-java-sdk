// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListWorkspacesResponseBody extends TeaModel {
    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 资源限制
    @NameInMap("ResourceLimits")
    public java.util.Map<String, ?> resourceLimits;

    // 符合过滤条件的作业数量
    @NameInMap("TotalCount")
    public Long totalCount;

    // 工作空间列表
    @NameInMap("Workspaces")
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces;

    public static ListWorkspacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesResponseBody self = new ListWorkspacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkspacesResponseBody setResourceLimits(java.util.Map<String, ?> resourceLimits) {
        this.resourceLimits = resourceLimits;
        return this;
    }
    public java.util.Map<String, ?> getResourceLimits() {
        return this.resourceLimits;
    }

    public ListWorkspacesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListWorkspacesResponseBody setWorkspaces(java.util.List<ListWorkspacesResponseBodyWorkspaces> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<ListWorkspacesResponseBodyWorkspaces> getWorkspaces() {
        return this.workspaces;
    }

    public static class ListWorkspacesResponseBodyWorkspaces extends TeaModel {
        // 管理员名字
        @NameInMap("AdminNames")
        public java.util.List<String> adminNames;

        // 创建人
        @NameInMap("Creator")
        public String creator;

        // 描述
        @NameInMap("Description")
        public String description;

        // 环境，用作判断简单模式还是标准模式
        @NameInMap("EnvTypes")
        public java.util.List<String> envTypes;

        // 附加信息
        @NameInMap("ExtraInfos")
        public java.util.Map<String, ?> extraInfos;

        // 创建 UTC 时间，日期格式 iso8601
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        // 修改 UTC 时间，日期格式 iso8601
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        // 是否为默认工作空间
        @NameInMap("IsDefault")
        public Boolean isDefault;

        // 资源数目
        @NameInMap("ResourceCount")
        public Integer resourceCount;

        // 工作空间状态
        @NameInMap("Status")
        public String status;

        // 工作空间 id
        @NameInMap("WorkspaceId")
        public String workspaceId;

        // 工作空间名字
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static ListWorkspacesResponseBodyWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesResponseBodyWorkspaces self = new ListWorkspacesResponseBodyWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesResponseBodyWorkspaces setAdminNames(java.util.List<String> adminNames) {
            this.adminNames = adminNames;
            return this;
        }
        public java.util.List<String> getAdminNames() {
            return this.adminNames;
        }

        public ListWorkspacesResponseBodyWorkspaces setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkspacesResponseBodyWorkspaces setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkspacesResponseBodyWorkspaces setEnvTypes(java.util.List<String> envTypes) {
            this.envTypes = envTypes;
            return this;
        }
        public java.util.List<String> getEnvTypes() {
            return this.envTypes;
        }

        public ListWorkspacesResponseBodyWorkspaces setExtraInfos(java.util.Map<String, ?> extraInfos) {
            this.extraInfos = extraInfos;
            return this;
        }
        public java.util.Map<String, ?> getExtraInfos() {
            return this.extraInfos;
        }

        public ListWorkspacesResponseBodyWorkspaces setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListWorkspacesResponseBodyWorkspaces setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListWorkspacesResponseBodyWorkspaces setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public ListWorkspacesResponseBodyWorkspaces setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListWorkspacesResponseBodyWorkspaces setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
