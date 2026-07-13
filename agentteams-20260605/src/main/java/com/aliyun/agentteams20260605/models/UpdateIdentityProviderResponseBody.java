// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateIdentityProviderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpdateIdentityProviderResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIdentityProviderResponseBody self = new UpdateIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIdentityProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateIdentityProviderResponseBody setData(UpdateIdentityProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateIdentityProviderResponseBodyData getData() {
        return this.data;
    }

    public UpdateIdentityProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateIdentityProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIdentityProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateIdentityProviderResponseBodyData extends TeaModel {
        @NameInMap("BindingId")
        public Long bindingId;

        @NameInMap("IdentityProviderType")
        public String identityProviderType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoginEnabled")
        public Boolean loginEnabled;

        @NameInMap("SyncEnabled")
        public Boolean syncEnabled;

        public static UpdateIdentityProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateIdentityProviderResponseBodyData self = new UpdateIdentityProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateIdentityProviderResponseBodyData setBindingId(Long bindingId) {
            this.bindingId = bindingId;
            return this;
        }
        public Long getBindingId() {
            return this.bindingId;
        }

        public UpdateIdentityProviderResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public UpdateIdentityProviderResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateIdentityProviderResponseBodyData setLoginEnabled(Boolean loginEnabled) {
            this.loginEnabled = loginEnabled;
            return this;
        }
        public Boolean getLoginEnabled() {
            return this.loginEnabled;
        }

        public UpdateIdentityProviderResponseBodyData setSyncEnabled(Boolean syncEnabled) {
            this.syncEnabled = syncEnabled;
            return this;
        }
        public Boolean getSyncEnabled() {
            return this.syncEnabled;
        }

    }

}
