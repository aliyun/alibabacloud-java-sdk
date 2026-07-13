// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerMaxVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetWorkerMaxVersionResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetWorkerMaxVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerMaxVersionResponseBody self = new GetWorkerMaxVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkerMaxVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWorkerMaxVersionResponseBody setData(GetWorkerMaxVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkerMaxVersionResponseBodyData getData() {
        return this.data;
    }

    public GetWorkerMaxVersionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWorkerMaxVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWorkerMaxVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkerMaxVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetWorkerMaxVersionResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("VersionCode")
        public String versionCode;

        public static GetWorkerMaxVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkerMaxVersionResponseBodyData self = new GetWorkerMaxVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkerMaxVersionResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetWorkerMaxVersionResponseBodyData setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

    }

}
