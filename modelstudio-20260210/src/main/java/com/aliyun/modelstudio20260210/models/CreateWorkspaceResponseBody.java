// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BB521414-5D38-5E66-AA66-963B2B4200E2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    @NameInMap("workspace")
    public CreateWorkspaceResponseBodyWorkspace workspace;

    public static CreateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponseBody self = new CreateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateWorkspaceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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
        /**
         * <p>API Host。</p>
         * 
         * <strong>example:</strong>
         * <p>llm-34o9ts1dai60z5sf.cn-beijing.maas.aliyuncs.com</p>
         */
        @NameInMap("apiHost")
        public String apiHost;

        /**
         * <strong>example:</strong>
         * <p>1742785623772</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("serviceSite")
        public String serviceSite;

        /**
         * <strong>example:</strong>
         * <p>ws-ac3ef438bec22dc5</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("workspaceName")
        public String workspaceName;

        public static CreateWorkspaceResponseBodyWorkspace build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceResponseBodyWorkspace self = new CreateWorkspaceResponseBodyWorkspace();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceResponseBodyWorkspace setApiHost(String apiHost) {
            this.apiHost = apiHost;
            return this;
        }
        public String getApiHost() {
            return this.apiHost;
        }

        public CreateWorkspaceResponseBodyWorkspace setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateWorkspaceResponseBodyWorkspace setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateWorkspaceResponseBodyWorkspace setServiceSite(String serviceSite) {
            this.serviceSite = serviceSite;
            return this;
        }
        public String getServiceSite() {
            return this.serviceSite;
        }

        public CreateWorkspaceResponseBodyWorkspace setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public CreateWorkspaceResponseBodyWorkspace setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
