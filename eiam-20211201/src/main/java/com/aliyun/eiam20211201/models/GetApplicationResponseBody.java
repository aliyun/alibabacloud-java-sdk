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
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
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
         * <ul>
         * <li>Enabled: The Developer API feature is enabled.</li>
         * <li>Disabled: The Developer API feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("ApiInvokeStatus")
        public String apiInvokeStatus;

        /**
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("ApplicationCreationType")
        public String applicationCreationType;

        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("ApplicationIdentityType")
        public String applicationIdentityType;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML Application</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The origin of the application. Valid values:</p>
         * <ul>
         * <li>urn:alibaba:idaas:app:source:template: The application is created based on a template.</li>
         * <li>urn:alibaba:idaas: The application is created based on the standard protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:app:source:template</p>
         */
        @NameInMap("ApplicationSourceType")
        public String applicationSourceType;

        /**
         * <p>The ID of the template based on which the application is created. This parameter is returned only if the application is created based on a template.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_rpa_tdsxxx</p>
         */
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        /**
         * <p>Application visibility</p>
         */
        @NameInMap("ApplicationVisibility")
        public java.util.List<String> applicationVisibility;

        /**
         * <p>The authorization type of the EIAM application. Valid values:</p>
         * <ul>
         * <li>authorize_required: Only the user with explicit authorization can access the application.</li>
         * <li>default_all: By default, all users can access the application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>authorize_required</p>
         */
        @NameInMap("AuthorizationType")
        public String authorizationType;

        /**
         * <p>The client ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The time when the application was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CustomSubjectStatus")
        public String customSubjectStatus;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>The application is applicable to the test environment.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The features that are supported by the application. The value is a JSON array. Valid values:</p>
         * <ul>
         * <li>sso: The application supports SSO.</li>
         * <li>provision: The application supports account synchronization.</li>
         * <li>api_invoke: The application supports custom APIs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sso&quot;, &quot;provision&quot;]</p>
         */
        @NameInMap("Features")
        public String features;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The URL of the application icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg">https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>M2M client status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("M2MClientStatus")
        public String m2MClientStatus;

        /**
         * <p>The service code of the cloud service that manages the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>rpa</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        /**
         * <p>Unique identifier of the resource server</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("ResourceServerIdentifier")
        public String resourceServerIdentifier;

        /**
         * <strong>example:</strong>
         * <p>urn:cloud:idaas:resourceserver:source:custom</p>
         */
        @NameInMap("ResourceServerSourceType")
        public String resourceServerSourceType;

        /**
         * <p>Resource server status.</p>
         * 
         * <strong>example:</strong>
         * <p>disabled	enabled</p>
         */
        @NameInMap("ResourceServerStatus")
        public String resourceServerStatus;

        /**
         * <p>Indicates whether the application template is managed by a cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The type of the single sign-on (SSO) protocol. Valid values:</p>
         * <ul>
         * <li>saml2: the Security Assertion Markup Language (SAML) 2.0 protocol.</li>
         * <li>oidc: the OpenID Connect (OIDC) protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>saml2</p>
         */
        @NameInMap("SsoType")
        public String ssoType;

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li>Enabled: The application is enabled.</li>
         * <li>Disabled: The application is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the application was last updated. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
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

        public GetApplicationResponseBodyApplication setApplicationCreationType(String applicationCreationType) {
            this.applicationCreationType = applicationCreationType;
            return this;
        }
        public String getApplicationCreationType() {
            return this.applicationCreationType;
        }

        public GetApplicationResponseBodyApplication setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationResponseBodyApplication setApplicationIdentityType(String applicationIdentityType) {
            this.applicationIdentityType = applicationIdentityType;
            return this;
        }
        public String getApplicationIdentityType() {
            return this.applicationIdentityType;
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

        public GetApplicationResponseBodyApplication setApplicationVisibility(java.util.List<String> applicationVisibility) {
            this.applicationVisibility = applicationVisibility;
            return this;
        }
        public java.util.List<String> getApplicationVisibility() {
            return this.applicationVisibility;
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

        public GetApplicationResponseBodyApplication setCustomSubjectStatus(String customSubjectStatus) {
            this.customSubjectStatus = customSubjectStatus;
            return this;
        }
        public String getCustomSubjectStatus() {
            return this.customSubjectStatus;
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

        public GetApplicationResponseBodyApplication setM2MClientStatus(String m2MClientStatus) {
            this.m2MClientStatus = m2MClientStatus;
            return this;
        }
        public String getM2MClientStatus() {
            return this.m2MClientStatus;
        }

        public GetApplicationResponseBodyApplication setManagedServiceCode(String managedServiceCode) {
            this.managedServiceCode = managedServiceCode;
            return this;
        }
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        public GetApplicationResponseBodyApplication setResourceServerIdentifier(String resourceServerIdentifier) {
            this.resourceServerIdentifier = resourceServerIdentifier;
            return this;
        }
        public String getResourceServerIdentifier() {
            return this.resourceServerIdentifier;
        }

        public GetApplicationResponseBodyApplication setResourceServerSourceType(String resourceServerSourceType) {
            this.resourceServerSourceType = resourceServerSourceType;
            return this;
        }
        public String getResourceServerSourceType() {
            return this.resourceServerSourceType;
        }

        public GetApplicationResponseBodyApplication setResourceServerStatus(String resourceServerStatus) {
            this.resourceServerStatus = resourceServerStatus;
            return this;
        }
        public String getResourceServerStatus() {
            return this.resourceServerStatus;
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
