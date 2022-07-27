// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

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
        @NameInMap("codeUrl")
        public String codeUrl;

        @NameInMap("codeVersion")
        public String codeVersion;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("spec")
        public String spec;

        @NameInMap("status")
        public String status;

        @NameInMap("template")
        public String template;

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
