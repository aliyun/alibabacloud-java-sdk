// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningConfigResponseBody extends TeaModel {
    @NameInMap("ApplicationProvisioningConfig")
    public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig applicationProvisioningConfig;

    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationProvisioningConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningConfigResponseBody self = new GetApplicationProvisioningConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningConfigResponseBody setApplicationProvisioningConfig(GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig applicationProvisioningConfig) {
        this.applicationProvisioningConfig = applicationProvisioningConfig;
        return this;
    }
    public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig getApplicationProvisioningConfig() {
        return this.applicationProvisioningConfig;
    }

    public GetApplicationProvisioningConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig extends TeaModel {
        @NameInMap("CallbackUrl")
        public String callbackUrl;

        @NameInMap("EncryptKey")
        public String encryptKey;

        @NameInMap("EncryptRequired")
        public Boolean encryptRequired;

        @NameInMap("ListenEventScopes")
        public java.util.List<String> listenEventScopes;

        public static GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig self = new GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig setCallbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }
        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig setEncryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }
        public String getEncryptKey() {
            return this.encryptKey;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig setEncryptRequired(Boolean encryptRequired) {
            this.encryptRequired = encryptRequired;
            return this;
        }
        public Boolean getEncryptRequired() {
            return this.encryptRequired;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig setListenEventScopes(java.util.List<String> listenEventScopes) {
            this.listenEventScopes = listenEventScopes;
            return this;
        }
        public java.util.List<String> getListenEventScopes() {
            return this.listenEventScopes;
        }

    }

    public static class GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("CallbackProvisioningConfig")
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig callbackProvisioningConfig;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProvisionJwksEndpoint")
        public String provisionJwksEndpoint;

        @NameInMap("ProvisionPassword")
        public Boolean provisionPassword;

        @NameInMap("ProvisionProtocolType")
        public String provisionProtocolType;

        @NameInMap("Status")
        public String status;

        public static GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig self = new GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setCallbackProvisioningConfig(GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig callbackProvisioningConfig) {
            this.callbackProvisioningConfig = callbackProvisioningConfig;
            return this;
        }
        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfigCallbackProvisioningConfig getCallbackProvisioningConfig() {
            return this.callbackProvisioningConfig;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setProvisionJwksEndpoint(String provisionJwksEndpoint) {
            this.provisionJwksEndpoint = provisionJwksEndpoint;
            return this;
        }
        public String getProvisionJwksEndpoint() {
            return this.provisionJwksEndpoint;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setProvisionPassword(Boolean provisionPassword) {
            this.provisionPassword = provisionPassword;
            return this;
        }
        public Boolean getProvisionPassword() {
            return this.provisionPassword;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setProvisionProtocolType(String provisionProtocolType) {
            this.provisionProtocolType = provisionProtocolType;
            return this;
        }
        public String getProvisionProtocolType() {
            return this.provisionProtocolType;
        }

        public GetApplicationProvisioningConfigResponseBodyApplicationProvisioningConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
