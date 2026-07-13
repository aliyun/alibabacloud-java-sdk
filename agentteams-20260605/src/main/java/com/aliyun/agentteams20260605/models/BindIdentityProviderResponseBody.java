// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class BindIdentityProviderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BindIdentityProviderResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BindIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindIdentityProviderResponseBody self = new BindIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public BindIdentityProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BindIdentityProviderResponseBody setData(BindIdentityProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BindIdentityProviderResponseBodyData getData() {
        return this.data;
    }

    public BindIdentityProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BindIdentityProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindIdentityProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindIdentityProviderResponseBodyData extends TeaModel {
        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        @NameInMap("InstanceId")
        public String instanceId;

        public static BindIdentityProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BindIdentityProviderResponseBodyData self = new BindIdentityProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BindIdentityProviderResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public BindIdentityProviderResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
