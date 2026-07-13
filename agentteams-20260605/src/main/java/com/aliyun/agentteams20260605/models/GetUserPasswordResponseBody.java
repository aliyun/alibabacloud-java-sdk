// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetUserPasswordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUserPasswordResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserPasswordResponseBody self = new GetUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserPasswordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserPasswordResponseBody setData(GetUserPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserPasswordResponseBodyData getData() {
        return this.data;
    }

    public GetUserPasswordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserPasswordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserPasswordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUserPasswordResponseBodyData extends TeaModel {
        @NameInMap("InitialPassword")
        public String initialPassword;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        public static GetUserPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserPasswordResponseBodyData self = new GetUserPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserPasswordResponseBodyData setInitialPassword(String initialPassword) {
            this.initialPassword = initialPassword;
            return this;
        }
        public String getInitialPassword() {
            return this.initialPassword;
        }

        public GetUserPasswordResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUserPasswordResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
