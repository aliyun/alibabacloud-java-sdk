// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setApplication(GetApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public GetApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationResponseBodyApplication extends TeaModel {
        /**
         * <p>The status of the Developer API feature. Valid values:</p>
         * <br>
         * <p>*   Enabled: The Developer API feature is enabled.</p>
         * <p>*   Disabled: The Developer API feature is disabled.</p>
         */
        @NameInMap("ApiInvokeStatus")
        public String apiInvokeStatus;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The origin of the application. Valid values:</p>
         * <br>
         * <p>*   urn:alibaba:idaas:app:source:template: The application is created based on a template.</p>
         * <p>*   urn:alibaba:idaas: The application is created based on the standard protocol.</p>
         */
        @NameInMap("ApplicationSourceType")
        public String applicationSourceType;

        /**
         * <p>The ID of the template based on which the application is created. This parameter is returned only if the application is created based on a template.</p>
         */
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        /**
         * <p>The authorization type of the EIAM application. Valid values:</p>
         * <br>
         * <p>*   authorize_required: Only the user with explicit authorization can access the application.</p>
         * <p>*   default_all: By default, all users can access the application.</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <p>The client ID of the application.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The time when the application was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The features that are supported by the application. The value is a JSON array. Valid values:</p>
         * <br>
         * <p>*   sso: The application supports SSO.</p>
         * <p>*   provision: The application supports account synchronization.</p>
         * <p>*   api_invoke: The application supports custom APIs.</p>
         */
        @NameInMap("Features")
        public String features;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The URL of the application icon.</p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>The service code of the cloud service that manages the application template.</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        /**
         * <p>Indicates whether the application template is managed by a cloud service.</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The type of the single sign-on (SSO) protocol. Valid values:</p>
         * <br>
         * <p>*   saml2: the Security Assertion Markup Language (SAML) 2.0 protocol.</p>
         * <p>*   oidc: the OpenID Connect (OIDC) protocol.</p>
         */
        @NameInMap("SsoType")
        public String ssoType;

        /**
         * <p>The status of the application. Valid values:</p>
         * <br>
         * <p>*   Enabled: The application is enabled.</p>
         * <p>*   Disabled: The application is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the application was last updated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplication self = new GetApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplication setApiInvokeStatus(String apiInvokeStatus) {
            this.apiInvokeStatus = apiInvokeStatus;
            return this;
        }
        public String getApiInvokeStatus() {
            return this.apiInvokeStatus;
        }

        public GetApplicationResponseBodyApplication setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationResponseBodyApplication setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public GetApplicationResponseBodyApplication setApplicationSourceType(String applicationSourceType) {
            this.applicationSourceType = applicationSourceType;
            return this;
        }
        public String getApplicationSourceType() {
            return this.applicationSourceType;
        }

        public GetApplicationResponseBodyApplication setApplicationTemplateId(String applicationTemplateId) {
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        public GetApplicationResponseBodyApplication setAuthorizationType(String authorizationType) {
            this.authorizationType = authorizationType;
            return this;
        }
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        public GetApplicationResponseBodyApplication setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetApplicationResponseBodyApplication setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyApplication setFeatures(String features) {
            this.features = features;
            return this;
        }
        public String getFeatures() {
            return this.features;
        }

        public GetApplicationResponseBodyApplication setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetApplicationResponseBodyApplication setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public GetApplicationResponseBodyApplication setManagedServiceCode(String managedServiceCode) {
            this.managedServiceCode = managedServiceCode;
            return this;
        }
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        public GetApplicationResponseBodyApplication setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public GetApplicationResponseBodyApplication setSsoType(String ssoType) {
            this.ssoType = ssoType;
            return this;
        }
        public String getSsoType() {
            return this.ssoType;
        }

        public GetApplicationResponseBodyApplication setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApplicationResponseBodyApplication setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
