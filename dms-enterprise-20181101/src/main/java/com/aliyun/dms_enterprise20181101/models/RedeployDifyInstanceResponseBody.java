// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RedeployDifyInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public RedeployDifyInstanceResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static RedeployDifyInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RedeployDifyInstanceResponseBody self = new RedeployDifyInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RedeployDifyInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RedeployDifyInstanceResponseBody setData(RedeployDifyInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RedeployDifyInstanceResponseBodyData getData() {
        return this.data;
    }

    public RedeployDifyInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RedeployDifyInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RedeployDifyInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RedeployDifyInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RedeployDifyInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RedeployDifyInstanceResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public String status;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static RedeployDifyInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RedeployDifyInstanceResponseBodyData self = new RedeployDifyInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RedeployDifyInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RedeployDifyInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RedeployDifyInstanceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
