// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class PutCmsWorkspaceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PutCmsWorkspaceResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PutCmsWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutCmsWorkspaceResponseBody self = new PutCmsWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public PutCmsWorkspaceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutCmsWorkspaceResponseBody setData(PutCmsWorkspaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PutCmsWorkspaceResponseBodyData getData() {
        return this.data;
    }

    public PutCmsWorkspaceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PutCmsWorkspaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutCmsWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutCmsWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutCmsWorkspaceResponseBodyData extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static PutCmsWorkspaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PutCmsWorkspaceResponseBodyData self = new PutCmsWorkspaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PutCmsWorkspaceResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public PutCmsWorkspaceResponseBodyData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

}
