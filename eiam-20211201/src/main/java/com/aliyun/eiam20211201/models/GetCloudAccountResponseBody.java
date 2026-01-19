// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudAccountResponseBody extends TeaModel {
    @NameInMap("CloudAccount")
    public GetCloudAccountResponseBodyCloudAccount cloudAccount;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAccountResponseBody self = new GetCloudAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAccountResponseBody setCloudAccount(GetCloudAccountResponseBodyCloudAccount cloudAccount) {
        this.cloudAccount = cloudAccount;
        return this;
    }
    public GetCloudAccountResponseBodyCloudAccount getCloudAccount() {
        return this.cloudAccount;
    }

    public GetCloudAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AuthenticationFail.NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>There is no permission.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason self = new GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult extends TeaModel {
        @NameInMap("ErrorReason")
        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason errorReason;

        /**
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        public static GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult self = new GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult setErrorReason(GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason errorReason) {
            this.errorReason = errorReason;
            return this;
        }
        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason getErrorReason() {
            return this.errorReason;
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult setLastCheckTime(Long lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public Long getLastCheckTime() {
            return this.lastCheckTime;
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig extends TeaModel {
        /**
         * <p>受众标识</p>
         * 
         * <strong>example:</strong>
         * <p>urn:cloud:idaas:sts:xxx:xxx</p>
         */
        @NameInMap("Audience")
        public String audience;

        /**
         * <p>授权服务ID</p>
         * 
         * <strong>example:</strong>
         * <p>iauths_system</p>
         */
        @NameInMap("AuthorizationServerId")
        public String authorizationServerId;

        /**
         * <p>Issuer。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2">https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>验签公钥端点</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/jwks">https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2/jwks</a></p>
         */
        @NameInMap("OidcJwksEndpoint")
        public String oidcJwksEndpoint;

        public static GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig self = new GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig setAudience(String audience) {
            this.audience = audience;
            return this;
        }
        public String getAudience() {
            return this.audience;
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig setAuthorizationServerId(String authorizationServerId) {
            this.authorizationServerId = authorizationServerId;
            return this;
        }
        public String getAuthorizationServerId() {
            return this.authorizationServerId;
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig setOidcJwksEndpoint(String oidcJwksEndpoint) {
            this.oidcJwksEndpoint = oidcJwksEndpoint;
            return this;
        }
        public String getOidcJwksEndpoint() {
            return this.oidcJwksEndpoint;
        }

    }

    public static class GetCloudAccountResponseBodyCloudAccount extends TeaModel {
        /**
         * <p>云账号外部唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("CloudAccountExternalId")
        public String cloudAccountExternalId;

        /**
         * <p>云账号状态</p>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("CloudAccountHealth")
        public String cloudAccountHealth;

        @NameInMap("CloudAccountHealthCheckResult")
        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult cloudAccountHealthCheckResult;

        /**
         * <p>云账号ID</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>云账号名称</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_xxxx</p>
         */
        @NameInMap("CloudAccountName")
        public String cloudAccountName;

        /**
         * <p>云账号提供商配置</p>
         */
        @NameInMap("CloudAccountProviderConfig")
        public GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig cloudAccountProviderConfig;

        /**
         * <p>云账号提供商名称</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-eiam-oidc-provider</p>
         */
        @NameInMap("CloudAccountProviderName")
        public String cloudAccountProviderName;

        /**
         * <p>云账号类别</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("CloudAccountVendorType")
        public String cloudAccountVendorType;

        /**
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>云账号描述</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1649830227000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetCloudAccountResponseBodyCloudAccount build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountResponseBodyCloudAccount self = new GetCloudAccountResponseBodyCloudAccount();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountResponseBodyCloudAccount setCloudAccountExternalId(String cloudAccountExternalId) {
            this.cloudAccountExternalId = cloudAccountExternalId;
            return this;
        }
        public String getCloudAccountExternalId() {
            return this.cloudAccountExternalId;
        }

        public GetCloudAccountResponseBodyCloudAccount setCloudAccountHealth(String cloudAccountHealth) {
            this.cloudAccountHealth = cloudAccountHealth;
            return this;
        }
        public String getCloudAccountHealth() {
            return this.cloudAccountHealth;
        }

        public GetCloudAccountResponseBodyCloudAccount setCloudAccountHealthCheckResult(GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult cloudAccountHealthCheckResult) {
            this.cloudAccountHealthCheckResult = cloudAccountHealthCheckResult;
            return this;
        }
        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult getCloudAccountHealthCheckResult() {
            return this.cloudAccountHealthCheckResult;
        }

        public GetCloudAccountResponseBodyCloudAccount setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public GetCloudAccountResponseBodyCloudAccount setCloudAccountName(String cloudAccountName) {
            this.cloudAccountName = cloudAccountName;
            return this;
        }
        public String getCloudAccountName() {
            return this.cloudAccountName;
        }

        public GetCloudAccountResponseBodyCloudAccount setCloudAccountProviderConfig(GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig cloudAccountProviderConfig) {
            this.cloudAccountProviderConfig = cloudAccountProviderConfig;
            return this;
        }
        public GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig getCloudAccountProviderConfig() {
            return this.cloudAccountProviderConfig;
        }

        public GetCloudAccountResponseBodyCloudAccount setCloudAccountProviderName(String cloudAccountProviderName) {
            this.cloudAccountProviderName = cloudAccountProviderName;
            return this;
        }
        public String getCloudAccountProviderName() {
            return this.cloudAccountProviderName;
        }

        public GetCloudAccountResponseBodyCloudAccount setCloudAccountVendorType(String cloudAccountVendorType) {
            this.cloudAccountVendorType = cloudAccountVendorType;
            return this;
        }
        public String getCloudAccountVendorType() {
            return this.cloudAccountVendorType;
        }

        public GetCloudAccountResponseBodyCloudAccount setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCloudAccountResponseBodyCloudAccount setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCloudAccountResponseBodyCloudAccount setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCloudAccountResponseBodyCloudAccount setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
