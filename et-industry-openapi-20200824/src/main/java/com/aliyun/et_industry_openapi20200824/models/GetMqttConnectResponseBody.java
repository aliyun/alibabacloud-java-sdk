// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class GetMqttConnectResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public GetMqttConnectResponseBodyAccessDeniedDetail accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMqttConnectResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMqttConnectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqttConnectResponseBody self = new GetMqttConnectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqttConnectResponseBody setAccessDeniedDetail(GetMqttConnectResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public GetMqttConnectResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetMqttConnectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMqttConnectResponseBody setData(GetMqttConnectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMqttConnectResponseBodyData getData() {
        return this.data;
    }

    public GetMqttConnectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMqttConnectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMqttConnectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqttConnectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMqttConnectResponseBodyAccessDeniedDetail extends TeaModel {
        @NameInMap("AuthAction")
        public String authAction;

        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        @NameInMap("NoPermissionType")
        public String noPermissionType;

        @NameInMap("PolicyType")
        public String policyType;

        public static GetMqttConnectResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            GetMqttConnectResponseBodyAccessDeniedDetail self = new GetMqttConnectResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public GetMqttConnectResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public GetMqttConnectResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public GetMqttConnectResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public GetMqttConnectResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public GetMqttConnectResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public GetMqttConnectResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public GetMqttConnectResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class GetMqttConnectResponseBodyData extends TeaModel {
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("QosLevel")
        public Integer qosLevel;

        @NameInMap("ServerUri")
        public String serverUri;

        @NameInMap("Token")
        public String token;

        public static GetMqttConnectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMqttConnectResponseBodyData self = new GetMqttConnectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMqttConnectResponseBodyData setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetMqttConnectResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetMqttConnectResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetMqttConnectResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMqttConnectResponseBodyData setQosLevel(Integer qosLevel) {
            this.qosLevel = qosLevel;
            return this;
        }
        public Integer getQosLevel() {
            return this.qosLevel;
        }

        public GetMqttConnectResponseBodyData setServerUri(String serverUri) {
            this.serverUri = serverUri;
            return this;
        }
        public String getServerUri() {
            return this.serverUri;
        }

        public GetMqttConnectResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
