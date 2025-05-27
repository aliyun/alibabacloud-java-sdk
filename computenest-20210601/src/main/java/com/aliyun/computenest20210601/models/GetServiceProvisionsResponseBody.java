// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceProvisionsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8C27145F-C9F4-545D-A355-DCDDAD63D548</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the services.</p>
     */
    @NameInMap("ServiceProvisions")
    public java.util.List<GetServiceProvisionsResponseBodyServiceProvisions> serviceProvisions;

    public static GetServiceProvisionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvisionsResponseBody self = new GetServiceProvisionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceProvisionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceProvisionsResponseBody setServiceProvisions(java.util.List<GetServiceProvisionsResponseBodyServiceProvisions> serviceProvisions) {
        this.serviceProvisions = serviceProvisions;
        return this;
    }
    public java.util.List<GetServiceProvisionsResponseBodyServiceProvisions> getServiceProvisions() {
        return this.serviceProvisions;
    }

    public static class GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("EnableURL")
        public String enableURL;

        @NameInMap("Status")
        public String status;

        public static GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions self = new GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions setEnableURL(String enableURL) {
            this.enableURL = enableURL;
            return this;
        }
        public String getEnableURL() {
            return this.enableURL;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation extends TeaModel {
        /**
         * <p>The name of the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateServiceLinkedRole</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The ID of the Alibaba Cloud service to which the API operation belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ApiProductId")
        public String apiProductId;

        /**
         * <p>The type of the API operation. Valid values:</p>
         * <ul>
         * <li>Open: public</li>
         * <li>Inner: private</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("ApiType")
        public String apiType;

        /**
         * <p>The ROS parameters of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;ServiceLinkedRole&quot;: &quot;AliyunServiceRoleForRdsPgsqlOnEcs&quot;, &quot;RegionId&quot;: &quot;${RegionId}&quot; }</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        public static GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation self = new GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation setApiProductId(String apiProductId) {
            this.apiProductId = apiProductId;
            return this;
        }
        public String getApiProductId() {
            return this.apiProductId;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

    }

    public static class GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles extends TeaModel {
        /**
         * <p>The information about the API operation that is used to create the RAM role.</p>
         */
        @NameInMap("ApiForCreation")
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation apiForCreation;

        /**
         * <p>Indicates whether the RAM role is created. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Created")
        public Boolean created;

        /**
         * <p>The purpose for which the RAM role is used. Default value: Default. A value of Default indicates that the RAM role is the default role of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The name of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunCSManagedVKRole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles self = new GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles setApiForCreation(GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation apiForCreation) {
            this.apiForCreation = apiForCreation;
            return this;
        }
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRolesApiForCreation getApiForCreation() {
            return this.apiForCreation;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles setCreated(Boolean created) {
            this.created = created;
            return this;
        }
        public Boolean getCreated() {
            return this.created;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

    public static class GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision extends TeaModel {
        /**
         * <p>The authorization URL of the RAM role.</p>
         * <blockquote>
         * <p>This parameter is returned if Created is set to false.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ram.console.aliyun.com/role/authorization?request=%7B%22Services%22:%5B%7B%22Service%22:%22CS%22,%22Roles%22:%5B%7B%22RoleName%22:%22AliyunCSManagedVKRole%22,%22TemplateId%22:%22AliyunCSManagedVKRole%22%7D,%7B%22RoleName%22:%22AliyunCSDefaultRole%22,%22TemplateId%22:%22Default%22%7D%5D%7D%5D,%22ReturnUrl%22:%22https://cs.console.aliyun.com/%22%7D">https://ram.console.aliyun.com/role/authorization?request={&quot;Services&quot;:[{&quot;Service&quot;:&quot;CS&quot;,&quot;Roles&quot;:[{&quot;RoleName&quot;:&quot;AliyunCSManagedVKRole&quot;,&quot;TemplateId&quot;:&quot;AliyunCSManagedVKRole&quot;},{&quot;RoleName&quot;:&quot;AliyunCSDefaultRole&quot;,&quot;TemplateId&quot;:&quot;Default&quot;}]}],&quot;ReturnUrl&quot;:&quot;https://cs.console.aliyun.com/&quot;}</a></p>
         */
        @NameInMap("AuthorizationURL")
        public String authorizationURL;

        /**
         * <p>The RAM roles of the service.</p>
         */
        @NameInMap("Roles")
        public java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles> roles;

        public static GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision self = new GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision setAuthorizationURL(String authorizationURL) {
            this.authorizationURL = authorizationURL;
            return this;
        }
        public String getAuthorizationURL() {
            return this.authorizationURL;
        }

        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision setRoles(java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsRoleProvisionRoles> getRoles() {
            return this.roles;
        }

    }

    public static class GetServiceProvisionsResponseBodyServiceProvisions extends TeaModel {
        /**
         * <p>Indicates whether automatic activation for the service is defined in the template. Valid values:</p>
         * <ul>
         * <li>true: Automatic activation for the service is defined in the template.</li>
         * <li>false: Manual activation for the service is defined in the template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoEnableService")
        public Boolean autoEnableService;

        @NameInMap("CommodityProvisions")
        public java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions> commodityProvisions;

        /**
         * <p>The URL that points to the activation page of the service.</p>
         * <blockquote>
         * <p>This parameter is returned if Status is set to Disabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://common-buy.aliyun.com/?commodityCode=sls">https://common-buy.aliyun.com/?commodityCode=sls</a></p>
         */
        @NameInMap("EnableURL")
        public String enableURL;

        /**
         * <p>The information about the RAM roles of the service. If this parameter is empty, no RAM role is associated with the service.</p>
         */
        @NameInMap("RoleProvision")
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision roleProvision;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>CS</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The activation status of the service. Valid values:</p>
         * <ul>
         * <li>Enabled: The service is activated.</li>
         * <li>Disabled: The service is not activated.</li>
         * <li>Unknown: The activation status of the service is unknown.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the service is in the Disabled or Unknown state.</p>
         * <blockquote>
         * <p>This parameter is returned if Status is set to Disabled or Unknown.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>No permission</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        public static GetServiceProvisionsResponseBodyServiceProvisions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvisionsResponseBodyServiceProvisions self = new GetServiceProvisionsResponseBodyServiceProvisions();
            return TeaModel.build(map, self);
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setAutoEnableService(Boolean autoEnableService) {
            this.autoEnableService = autoEnableService;
            return this;
        }
        public Boolean getAutoEnableService() {
            return this.autoEnableService;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setCommodityProvisions(java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions> commodityProvisions) {
            this.commodityProvisions = commodityProvisions;
            return this;
        }
        public java.util.List<GetServiceProvisionsResponseBodyServiceProvisionsCommodityProvisions> getCommodityProvisions() {
            return this.commodityProvisions;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setEnableURL(String enableURL) {
            this.enableURL = enableURL;
            return this;
        }
        public String getEnableURL() {
            return this.enableURL;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setRoleProvision(GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision roleProvision) {
            this.roleProvision = roleProvision;
            return this;
        }
        public GetServiceProvisionsResponseBodyServiceProvisionsRoleProvision getRoleProvision() {
            return this.roleProvision;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceProvisionsResponseBodyServiceProvisions setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

}
