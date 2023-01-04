// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

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
        // IDaaS EIAM 应用apiInvoke能力启用状态
        @NameInMap("ApiInvokeStatus")
        public String apiInvokeStatus;

        // IDaaS EIAM 应用Id
        @NameInMap("ApplicationId")
        public String applicationId;

        // IDaaS EIAM 应用名称
        @NameInMap("ApplicationName")
        public String applicationName;

        // 创建应用的来源类型，标准协议 or 模板应用 or 自建应用
        @NameInMap("ApplicationSourceType")
        public String applicationSourceType;

        // 创建来源应用模板id。当且仅当创建来源为应用模板时才返回。
        @NameInMap("ApplicationTemplateId")
        public String applicationTemplateId;

        // IDaaS EIAM 应用授权类型，default or authorize_required
        @NameInMap("AuthorizationType")
        public String authorizationType;

        // IDaaS EIAM 客户端ID
        @NameInMap("ClientId")
        public String clientId;

        // IDaaS EIAM 应用创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // IDaaS EIAM 应用描述信息
        @NameInMap("Description")
        public String description;

        // IDaaS EIAM 应用支持的特性，provisioning、permission_system、api_invoke等
        @NameInMap("Features")
        public String features;

        // IDaaS EIAM 实例Id
        @NameInMap("InstanceId")
        public String instanceId;

        // IDaaS EIAM 应用图标URL地址
        @NameInMap("LogoUrl")
        public String logoUrl;

        // 托管应用模板的云产品ServiceCode。当且仅当ServiceManaged为true是返回。
        @NameInMap("ManagedServiceCode")
        public String managedServiceCode;

        // 应用模板是否被云产品托管。
        @NameInMap("ServiceManaged")
        public Boolean serviceManaged;

        // IDaaS EIAM 应用支持的sso协议类型，oidc、saml2
        @NameInMap("SsoType")
        public String ssoType;

        // IDaaS EIAM 应用状态
        @NameInMap("Status")
        public String status;

        // IDaaS EIAM 应用最近更新时间
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
