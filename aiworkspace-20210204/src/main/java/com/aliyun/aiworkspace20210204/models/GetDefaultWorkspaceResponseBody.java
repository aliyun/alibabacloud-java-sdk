// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetDefaultWorkspaceResponseBody extends TeaModel {
    // 任务详情 创建默认工作空间会有多个任务依次进行，如果一个任务未开始，不会显示在任务详情里。
    @NameInMap("Conditions")
    public java.util.List<GetDefaultWorkspaceResponseBodyConditions> conditions;

    // 创建人
    @NameInMap("Creator")
    public String creator;

    // 描述
    @NameInMap("Description")
    public String description;

    // 显示名称
    @NameInMap("DisplayName")
    public String displayName;

    // 环境，用作判断简单模式还是标准模式，含义见
    @NameInMap("EnvTypes")
    public java.util.List<String> envTypes;

    // 创建 UTC 时间，日期格式 iso8601
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改 UTC 时间，日期格式 iso8601
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 拥有者
    @NameInMap("Owner")
    public GetDefaultWorkspaceResponseBodyOwner owner;

    // 工作空间状态
    @NameInMap("Status")
    public String status;

    // 工作空间 ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 项目空间名称， region 内唯一
    @NameInMap("WorkspaceName")
    public String workspaceName;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetDefaultWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultWorkspaceResponseBody self = new GetDefaultWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDefaultWorkspaceResponseBody setConditions(java.util.List<GetDefaultWorkspaceResponseBodyConditions> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<GetDefaultWorkspaceResponseBodyConditions> getConditions() {
        return this.conditions;
    }

    public GetDefaultWorkspaceResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetDefaultWorkspaceResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDefaultWorkspaceResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetDefaultWorkspaceResponseBody setEnvTypes(java.util.List<String> envTypes) {
        this.envTypes = envTypes;
        return this;
    }
    public java.util.List<String> getEnvTypes() {
        return this.envTypes;
    }

    public GetDefaultWorkspaceResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetDefaultWorkspaceResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetDefaultWorkspaceResponseBody setOwner(GetDefaultWorkspaceResponseBodyOwner owner) {
        this.owner = owner;
        return this;
    }
    public GetDefaultWorkspaceResponseBodyOwner getOwner() {
        return this.owner;
    }

    public GetDefaultWorkspaceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDefaultWorkspaceResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetDefaultWorkspaceResponseBody setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetDefaultWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDefaultWorkspaceResponseBodyConditions extends TeaModel {
        // 返回码，正常是200，其他都是错误
        @NameInMap("Code")
        public Long code;

        // 消息
        @NameInMap("Message")
        public String message;

        // 类型
        @NameInMap("Type")
        public String type;

        public static GetDefaultWorkspaceResponseBodyConditions build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultWorkspaceResponseBodyConditions self = new GetDefaultWorkspaceResponseBodyConditions();
            return TeaModel.build(map, self);
        }

        public GetDefaultWorkspaceResponseBodyConditions setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public GetDefaultWorkspaceResponseBodyConditions setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDefaultWorkspaceResponseBodyConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDefaultWorkspaceResponseBodyOwner extends TeaModel {
        // 用户id
        @NameInMap("UserId")
        public String userId;

        // 用户kp
        @NameInMap("UserKp")
        public String userKp;

        // 用户名
        @NameInMap("UserName")
        public String userName;

        public static GetDefaultWorkspaceResponseBodyOwner build(java.util.Map<String, ?> map) throws Exception {
            GetDefaultWorkspaceResponseBodyOwner self = new GetDefaultWorkspaceResponseBodyOwner();
            return TeaModel.build(map, self);
        }

        public GetDefaultWorkspaceResponseBodyOwner setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetDefaultWorkspaceResponseBodyOwner setUserKp(String userKp) {
            this.userKp = userKp;
            return this;
        }
        public String getUserKp() {
            return this.userKp;
        }

        public GetDefaultWorkspaceResponseBodyOwner setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
