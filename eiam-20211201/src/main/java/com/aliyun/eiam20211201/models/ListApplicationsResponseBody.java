// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>The list of applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListApplicationsResponseBodyApplications> applications;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setApplications(java.util.List<ListApplicationsResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsResponseBodyApplications extends TeaModel {
        /**
         * <p>Indicates how the application was created.</p>
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
         * <p>The identity type of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
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
         * <p>The source used to create the application. Valid values:</p>
         * <ul>
         * <li><p><code>urn:alibaba:idaas:app:source:template</code>: Application template.</p>
         * </li>
         * <li><p><code>urn:alibaba:idaas:app:source:standard</code>: Standard protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>urn:alibaba:idaas:app:source:standard</p>
         */
        @NameInMap("ApplicationSourceType")
        public String applicationSourceType;

        /**
         * <p>The ID of the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>apt_xxx_xxx</p>
         */
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        /**
         * <p>The client ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The time the application was created, as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>A test application</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>A string containing a JSON array of features supported by the application. Valid values:</p>
         * <ul>
         * <li><p><code>sso</code>: SSO.</p>
         * </li>
         * <li><p><code>slo</code>: SLO.</p>
         * </li>
         * <li><p><code>provision</code>: Provisioning.</p>
         * </li>
         * <li><p><code>api_invoke</code>: API invocation.</p>
         * </li>
         * <li><p><code>m2m_client</code>: M2M client.</p>
         * </li>
         * <li><p><code>resource_server</code>: Resource server.</p>
         * </li>
         * <li><p><code>other</code>: Other.</p>
         * </li>
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
         * <p>The service code of the cloud service that manages the application template.</p>
         * 
         * <strong>example:</strong>
         * <p>rpa</p>
         */
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        /**
         * <p>The unique identifier of the resource server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("ResourceServerIdentifier")
        public String resourceServerIdentifier;

        /**
         * <p>The source type of the resource server.</p>
         * 
         * <strong>example:</strong>
         * <p>urn:cloud:idaas:resourceserver:source:custom</p>
         */
        @NameInMap("ResourceServerSourceType")
        public String resourceServerSourceType;

        /**
         * <p>The status of the resource server.</p>
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

        /**
         * <p>The SSO protocol. Valid values:</p>
         * <ul>
         * <li><p><code>saml2</code>: SAML 2.0</p>
         * </li>
         * <li><p><code>oidc</code>: OpenID Connect (OIDC)</p>
         * </li>
         * <li><p><code>oauth2/m2m</code>: OAuth 2.0</p>
         * </li>
         * <li><p><code>oidc+oauth2/m2m</code>: OIDC and OAuth 2.0</p>
         * </li>
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
         * <li><p><code>enabled</code>: The application is enabled.</p>
         * </li>
         * <li><p><code>disabled</code>: The application is disabled.</p>
         * </li>
         * <li><p><code>deleted</code>: The application is soft-deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time the application was last updated, as a Unix timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListApplicationsResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsResponseBodyApplications self = new ListApplicationsResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsResponseBodyApplications setApplicationCreationType(String applicationCreationType) {
            this.applicationCreationType = applicationCreationType;
            return this;
        }
        public String getApplicationCreationType() {
            return this.applicationCreationType;
        }

        public ListApplicationsResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsResponseBodyApplications setApplicationIdentityType(String applicationIdentityType) {
            this.applicationIdentityType = applicationIdentityType;
            return this;
        }
        public String getApplicationIdentityType() {
            return this.applicationIdentityType;
        }

        public ListApplicationsResponseBodyApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListApplicationsResponseBodyApplications setApplicationSourceType(String applicationSourceType) {
            this.applicationSourceType = applicationSourceType;
            return this;
        }
        public String getApplicationSourceType() {
            return this.applicationSourceType;
        }

        public ListApplicationsResponseBodyApplications setApplicationTemplateId(String applicationTemplateId) {
            this.applicationTemplateId = applicationTemplateId;
            return this;
        }
        public String getApplicationTemplateId() {
            return this.applicationTemplateId;
        }

        public ListApplicationsResponseBodyApplications setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListApplicationsResponseBodyApplications setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationsResponseBodyApplications setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationsResponseBodyApplications setFeatures(String features) {
            this.features = features;
            return this;
        }
        public String getFeatures() {
            return this.features;
        }

        public ListApplicationsResponseBodyApplications setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationsResponseBodyApplications setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public ListApplicationsResponseBodyApplications setManagedServiceCode(String managedServiceCode) {
            this.managedServiceCode = managedServiceCode;
            return this;
        }
        public String getManagedServiceCode() {
            return this.managedServiceCode;
        }

        public ListApplicationsResponseBodyApplications setResourceServerIdentifier(String resourceServerIdentifier) {
            this.resourceServerIdentifier = resourceServerIdentifier;
            return this;
        }
        public String getResourceServerIdentifier() {
            return this.resourceServerIdentifier;
        }

        public ListApplicationsResponseBodyApplications setResourceServerSourceType(String resourceServerSourceType) {
            this.resourceServerSourceType = resourceServerSourceType;
            return this;
        }
        public String getResourceServerSourceType() {
            return this.resourceServerSourceType;
        }

        public ListApplicationsResponseBodyApplications setResourceServerStatus(String resourceServerStatus) {
            this.resourceServerStatus = resourceServerStatus;
            return this;
        }
        public String getResourceServerStatus() {
            return this.resourceServerStatus;
        }

        public ListApplicationsResponseBodyApplications setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListApplicationsResponseBodyApplications setSsoType(String ssoType) {
            this.ssoType = ssoType;
            return this;
        }
        public String getSsoType() {
            return this.ssoType;
        }

        public ListApplicationsResponseBodyApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApplicationsResponseBodyApplications setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
