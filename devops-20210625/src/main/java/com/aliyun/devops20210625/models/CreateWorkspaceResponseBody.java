// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponseBody extends TeaModel {
    // 工作空间信息
    @NameInMap("workspace")
    public CreateWorkspaceResponseBodyWorkspace workspace;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    public static CreateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponseBody self = new CreateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponseBody setWorkspace(CreateWorkspaceResponseBodyWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }
    public CreateWorkspaceResponseBodyWorkspace getWorkspace() {
        return this.workspace;
    }

    public CreateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateWorkspaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateWorkspaceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public static class CreateWorkspaceResponseBodyWorkspace extends TeaModel {
        // 工作空间唯一标识，字符串形式，可在云效DevStudio访问空间链接中获取
        @NameInMap("id")
        public String id;

        // 工作空间名称
        @NameInMap("name")
        public String name;

        // 空间状态，枚举：CREATING-创建中, SUCCESS-运行中, FROZEN-冻结中, RECOVERING-恢复中
        @NameInMap("status")
        public String status;

        // 工作空间模板
        @NameInMap("template")
        public String template;

        // 创建者，阿里云PK
        @NameInMap("creator")
        public String creator;

        // 创建时间戳
        @NameInMap("createTime")
        public String createTime;

        public static CreateWorkspaceResponseBodyWorkspace build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyWorkspace self = new CreateWorkspaceResponseBodyWorkspace();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyWorkspace setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateWorkspaceResponseBodyWorkspace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateWorkspaceResponseBodyWorkspace setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateWorkspaceResponseBodyWorkspace setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CreateWorkspaceResponseBodyWorkspace setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateWorkspaceResponseBodyWorkspace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
