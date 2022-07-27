// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("workspace")
    public CreateWorkspaceResponseBodyWorkspace workspace;

    public static CreateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponseBody self = new CreateWorkspaceResponseBody();
        return TeaModel.build(map, self);
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

    public CreateWorkspaceResponseBody setWorkspace(CreateWorkspaceResponseBodyWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }
    public CreateWorkspaceResponseBodyWorkspace getWorkspace() {
        return this.workspace;
    }

    public static class CreateWorkspaceResponseBodyWorkspace extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("creator")
        public String creator;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("template")
        public String template;

        public static CreateWorkspaceResponseBodyWorkspace build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyWorkspace self = new CreateWorkspaceResponseBodyWorkspace();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyWorkspace setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateWorkspaceResponseBodyWorkspace setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
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

    }

}
