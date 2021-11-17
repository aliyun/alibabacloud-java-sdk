// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 工作空间信息
    @NameInMap("workspace")
    public GetWorkspaceResponseBodyWorkspace workspace;

    public static GetWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponseBody self = new GetWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkspaceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWorkspaceResponseBody setWorkspace(GetWorkspaceResponseBodyWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }
    public GetWorkspaceResponseBodyWorkspace getWorkspace() {
        return this.workspace;
    }

    public static class GetWorkspaceResponseBodyWorkspace extends TeaModel {
        // 代码来源URL
        @NameInMap("codeUrl")
        public String codeUrl;

        // 代码版本，支持 commitSHA、分支、标签
        @NameInMap("codeVersion")
        public String codeVersion;

        // 创建时间戳
        @NameInMap("createTime")
        public String createTime;

        // 工作空间唯一标识，字符串形式，可在云效DevStudio访问空间链接中获取
        @NameInMap("id")
        public String id;

        // 工作空间名称
        @NameInMap("name")
        public String name;

        // 机器规格
        @NameInMap("spec")
        public String spec;

        // 空间状态，枚举：CREATING-创建中, SUCCESS-运行中, FROZEN-冻结中, RECOVERING-恢复中
        @NameInMap("status")
        public String status;

        // 工作空间模板
        @NameInMap("template")
        public String template;

        // 用户阿里云PK
        @NameInMap("userId")
        public String userId;

        public static GetWorkspaceResponseBodyWorkspace build(java.util.Map<String, ?> map) throws Exception {
            GetWorkspaceResponseBodyWorkspace self = new GetWorkspaceResponseBodyWorkspace();
            return TeaModel.build(map, self);
        }

        public GetWorkspaceResponseBodyWorkspace setCodeUrl(String codeUrl) {
            this.codeUrl = codeUrl;
            return this;
        }
        public String getCodeUrl() {
            return this.codeUrl;
        }

        public GetWorkspaceResponseBodyWorkspace setCodeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }
        public String getCodeVersion() {
            return this.codeVersion;
        }

        public GetWorkspaceResponseBodyWorkspace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWorkspaceResponseBodyWorkspace setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetWorkspaceResponseBodyWorkspace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkspaceResponseBodyWorkspace setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetWorkspaceResponseBodyWorkspace setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkspaceResponseBodyWorkspace setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetWorkspaceResponseBodyWorkspace setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
