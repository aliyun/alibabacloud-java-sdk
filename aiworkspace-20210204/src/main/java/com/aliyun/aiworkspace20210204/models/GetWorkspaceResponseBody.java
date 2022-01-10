// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    // 管理员账户
    @NameInMap("AdminNames")
    public java.util.List<String> adminNames;

    // 创建人
    @NameInMap("Creator")
    public String creator;

    // 描述
    @NameInMap("Description")
    public String description;

    // 显示名称
    @NameInMap("DisplayName")
    public String displayName;

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

    // 请求 id
    @NameInMap("RequestId")
    public String requestId;

    // 资源数目
    @NameInMap("ResourceCount")
    public Integer resourceCount;

    // 工作空间状态
    @NameInMap("Status")
    public String status;

    // 工作空间 id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 项目空间名称， region 内唯一
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setAdminNames(java.util.List<String> adminNames) {
        this.adminNames = adminNames;
        return this;
    }
    public java.util.List<String> getAdminNames() {
        return this.adminNames;
    }

    public GetWorkspaceResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetWorkspaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetWorkspaceResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetWorkspaceResponseBody setEnvTypes(java.util.List<String> envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    public GetWorkspaceResponseBody setExtraInfos(java.util.Map<String, ?> extraInfos) {
        this.extraInfos = extraInfos;
        return this;
    }
    public java.util.Map<String, ?> getExtraInfos() {
        return this.extraInfos;
    }

    public GetWorkspaceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetWorkspaceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetWorkspaceResponseBody setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }
    public Integer getResourceCount() {
        return this.resourceCount;
    }

    public GetWorkspaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetWorkspaceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
