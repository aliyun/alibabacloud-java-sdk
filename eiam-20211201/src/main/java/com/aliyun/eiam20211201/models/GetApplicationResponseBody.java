// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The returned application information.</p>
     */
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

    /**
     * <p>The request ID.</p>
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

    public static class GetApplicationResponseBodyApplicationApplicationOwner extends TeaModel {
        @NameInMap("GroupIds")
        public java.util.List<String> groupIds;

        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static GetApplicationResponseBodyApplicationApplicationOwner build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplicationApplicationOwner self = new GetApplicationResponseBodyApplicationApplicationOwner();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplicationApplicationOwner setGroupIds(java.util.List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        public GetApplicationResponseBodyApplicationApplicationOwner setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

    public static class GetApplicationResponseBodyApplicationCustomFields extends TeaModel {
        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("FieldValue")
        public String fieldValue;

        public static GetApplicationResponseBodyApplicationCustomFields build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplicationCustomFields self = new GetApplicationResponseBodyApplicationCustomFields();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplicationCustomFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetApplicationResponseBodyApplicationCustomFields setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class GetApplicationResponseBodyApplication extends TeaModel {
        /**
         * <p>The status of the Developer API feature for the application. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("ApiInvokeStatus")
        public String apiInvokeStatus;

        /**
         * <p>The application creation type.</p>
         * 
         * <strong>example:</strong>
         * <p>user_custom</p>
         */
        @NameInMap("ApplicationCreationType")
        public String applicationCreationType;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The application identity type. Valid values:</p>
         * <ul>
         * <li>application: Application.</li>
         * <li>agent: Agent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        @NameInMap("ApplicationIdentityType")
        public String applicationIdentityType;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML application</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ApplicationOwner")
        public GetApplicationResponseBodyApplicationApplicationOwner applicationOwner;

        /**
         * <p>The source from which the application was created. Valid values:</p>
         * <ul>
         * <li>urn:alibaba:idaas:app:source:template: Application template.</li>
         * <li>urn:alibaba:idaas:app:source:standard: Standard protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:app:source:template</p>
         */
        @NameInMap("ApplicationSourceType")
        public String applicationSourceType;

        /**
         * <p>The ID of the application template associated during creation. This value is returned only when the application was created from an application template.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_rpa_tdsxxx</p>
         */
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        /**
         * <p>The application visibility.</p>
         */
        @NameInMap("ApplicationVisibility")
        public java.util.List<String> applicationVisibility;

        /**
         * <p>The access authorization type of the application. Valid values:</p>
         * <ul>
         * <li>authorize_required: Explicit authorization is required for access.</li>
         * <li>default_all: All members have access permissions by default.</li>
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
         * <p>The time when the application was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CustomFields")
        public java.util.List<GetApplicationResponseBodyApplicationCustomFields> customFields;

        /**
         * <p>Indicates whether the custom Subject field in the token is enabled. After this feature is enabled, the issued Access Token changes from \&lt;clientId\&gt; to \&lt;clientId\&gt;:\&lt;client.activeSubjectUrn\&gt;, where client.activeSubjectUrn is configured in the attribute mapping of the federated identity credential of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("CustomSubjectStatus")
        public String customSubjectStatus;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>An application for test environment</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The features supported by the application, returned as a JSON array string. Valid values:</p>
         * <ul>
         * <li>sso: Single sign-on.</li>
         * <li>provision: Account synchronization.</li>
         * <li>api_invoke: API access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sso&quot;, &quot;provision&quot;]</p>
         */
        @NameInMap("Features")
        public String features;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The URL of the application logo.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg">https://img.alicdn.com/imgextra/i4/O1CN01lvYwpv1aGowQXDML9_!!6000000003303-0-tps-580-580.jpg</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>The M2MClient status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("M2MClientStatus")
        public String m2MClientStatus;

        /**
         * <p>The ServiceCode of the cloud service that manages the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>rpa</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        /**
         * <p>The unique identifier of the ResourceServer, which corresponds to the ResourceServer audience.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com">https://www.example.com</a></p>
         */
        @NameInMap("ResourceServerIdentifier")
        public String resourceServerIdentifier;

        /**
         * <p>The resource server source type.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:cloud:idaas:resourceserver:source:custom</p>
         */
        @NameInMap("ResourceServerSourceType")
        public String resourceServerSourceType;

        /**
         * <p>The ResourceServer status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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

        @NameInMap("SmartConfigCapabilities")
        public java.util.List<String> smartConfigCapabilities;

        /**
         * <p>The single sign-on protocol. Valid values:</p>
         * <ul>
         * <li>saml2: SAML 2.0 protocol.</li>
         * <li>oidc: OpenID Connect protocol.</li>
         * <li>oauth2/m2m: OAuth 2.0 protocol.</li>
         * <li>oidc+oauth2/m2m: OpenID Connect and OAuth 2.0 protocols.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>saml2</p>
         */
        @NameInMap("SsoType")
        public String ssoType;

        /**
         * <p>The application status. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the application was last updated. The value is a UNIX timestamp in milliseconds.</p>
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

        public GetApplicationResponseBodyApplication setApplicationOwner(GetApplicationResponseBodyApplicationApplicationOwner applicationOwner) {
            this.applicationOwner = applicationOwner;
            return this;
        }
        public GetApplicationResponseBodyApplicationApplicationOwner getApplicationOwner() {
            return this.applicationOwner;
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

        public GetApplicationResponseBodyApplication setCustomFields(java.util.List<GetApplicationResponseBodyApplicationCustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyApplicationCustomFields> getCustomFields() {
            return this.customFields;
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

        public GetApplicationResponseBodyApplication setSmartConfigCapabilities(java.util.List<String> smartConfigCapabilities) {
            this.smartConfigCapabilities = smartConfigCapabilities;
            return this;
        }
        public java.util.List<String> getSmartConfigCapabilities() {
            return this.smartConfigCapabilities;
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
