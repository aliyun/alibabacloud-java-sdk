// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudAccountResponseBody extends TeaModel {
    /**
     * <p>The details of the Alibaba Cloud account.</p>
     */
    @NameInMap("CloudAccount")
    public GetCloudAccountResponseBodyCloudAccount cloudAccount;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>AuthenticationFail.NoPermission</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The description of the error.</p>
         * 
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
        /**
         * <p>The reason for the fault. This field returns a value when the health check status is unhealthy.</p>
         */
        @NameInMap("ErrorReason")
        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResultErrorReason errorReason;

        /**
         * <p>The time of the last check. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastCheckTime")
        public Long lastCheckTime;

        /**
         * <p>The result of the health check for the cloud account. Valid values:</p>
         * <ul>
         * <li><p>success: The health check was successful.</p>
         * </li>
         * <li><p>failed: The health check failed.</p>
         * </li>
         * </ul>
         * 
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
         * <p>The audience identity.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:cloud:idaas:sts:xxx:xxx</p>
         */
        @NameInMap("Audience")
        public String audience;

        /**
         * <p>The ID of the authorization server.</p>
         * 
         * <strong>example:</strong>
         * <p>iauths_system</p>
         */
        @NameInMap("AuthorizationServerId")
        public String authorizationServerId;

        /**
         * <p>The issuer.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2">https://xxxxx.aliyunidaas.com/api/v2/iauths_system/oauth2</a></p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The public key endpoint for signature verification.</p>
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
         * <p>The unique external ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("CloudAccountExternalId")
        public String cloudAccountExternalId;

        /**
         * <p>The health status of the Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><p>healthy: Healthy.</p>
         * </li>
         * <li><p>unhealthy: Unhealthy.</p>
         * </li>
         * <li><p>unknown: Unknown.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        @NameInMap("CloudAccountHealth")
        public String cloudAccountHealth;

        /**
         * <p>The health check result for the cloud account.</p>
         */
        @NameInMap("CloudAccountHealthCheckResult")
        public GetCloudAccountResponseBodyCloudAccountCloudAccountHealthCheckResult cloudAccountHealthCheckResult;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>The name of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_xxxx</p>
         */
        @NameInMap("CloudAccountName")
        public String cloudAccountName;

        /**
         * <p>The configuration of the identity provider.</p>
         */
        @NameInMap("CloudAccountProviderConfig")
        public GetCloudAccountResponseBodyCloudAccountCloudAccountProviderConfig cloudAccountProviderConfig;

        /**
         * <p>The name of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-eiam-oidc-provider</p>
         */
        @NameInMap("CloudAccountProviderName")
        public String cloudAccountProviderName;

        /**
         * <p>The type of the Alibaba Cloud account. The valid value is:</p>
         * <ul>
         * <li>alibaba_cloud: Alibaba Cloud</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
         */
        @NameInMap("CloudAccountVendorType")
        public String cloudAccountVendorType;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time of the last update. The value is a UNIX timestamp in milliseconds.</p>
         * 
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
