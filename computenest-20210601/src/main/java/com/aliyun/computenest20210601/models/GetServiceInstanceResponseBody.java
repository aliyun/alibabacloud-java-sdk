// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The business status of the service instance. Valid values:</p>
     * <ul>
     * <li><p>Normal: The service instance is normal.</p>
     * </li>
     * <li><p>Renewing: The service instance is being renewed.</p>
     * </li>
     * <li><p>RenewFoiled: The renewal failed.</p>
     * </li>
     * <li><p>Expired: The service instance has expired.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BizStatus")
    public String bizStatus;

    /**
     * <p>The extra billing items of Alibaba Cloud Marketplace.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TiKVServerCount&quot;:&quot;3&quot;,&quot;package_version&quot;:&quot;yuncode5398300001&quot;,&quot;PDServerCount&quot;:&quot;3&quot;,&quot;TiDBServerCount&quot;:&quot;2&quot;}</p>
     */
    @NameInMap("Components")
    public String components;

    /**
     * <p>The time when the service instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether the service instance supports managed O\&amp;M. Valid values:</p>
     * <ul>
     * <li><p>true: The service instance supports managed O\&amp;M.</p>
     * </li>
     * <li><p>false: The service instance does not support managed O\&amp;M.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    /**
     * <p>Indicates whether Prometheus monitoring is enabled. Valid values:</p>
     * <ul>
     * <li><p>true: enabled.</p>
     * </li>
     * <li><p>false: disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <p>The time when the service instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01T12:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The URL of the Grafana dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://g.console.aliyun.com/d/xxxxxxxx-cn-mariadb/mysql-xxxxxx-xxxxxxxx-and-dashboard?orgId=355401&refresh=10s">https://g.console.aliyun.com/d/xxxxxxxx-cn-mariadb/mysql-xxxxxx-xxxxxxxx-and-dashboard?orgId=355401&amp;refresh=10s</a></p>
     */
    @NameInMap("GrafanaDashBoardUrl")
    public String grafanaDashBoardUrl;

    @NameInMap("GrantedPermission")
    public GetServiceInstanceResponseBodyGrantedPermission grantedPermission;

    /**
     * <p>Indicates whether managed O\&amp;M is enabled for the service instance. Valid values:</p>
     * <ul>
     * <li><p>true: Managed O\&amp;M is enabled for the service instance.</p>
     * </li>
     * <li><p>false: Managed O\&amp;M is not enabled for the service instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOperated")
    public Boolean isOperated;

    /**
     * <p>The time when the license expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-01T12:00:00</p>
     */
    @NameInMap("LicenseEndTime")
    public String licenseEndTime;

    /**
     * <p>The Alibaba Cloud Marketplace instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>704***59</p>
     */
    @NameInMap("MarketInstanceId")
    public String marketInstanceId;

    /**
     * <p>The name of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Database B</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network configuration.</p>
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     */
    @NameInMap("NetworkConfig")
    public GetServiceInstanceResponseBodyNetworkConfig networkConfig;

    /**
     * <p>The ID of the service instance that is managed.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("OperatedServiceInstanceId")
    public String operatedServiceInstanceId;

    /**
     * <p>The end time of the managed O\&amp;M.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-28T06:48:56Z</p>
     */
    @NameInMap("OperationEndTime")
    public String operationEndTime;

    /**
     * <p>The start time of the managed O\&amp;M.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-29T06:48:56Z</p>
     */
    @NameInMap("OperationStartTime")
    public String operationStartTime;

    /**
     * <p>The output fields returned when the service instance is created.</p>
     * <ul>
     * <li><p>In ROS mode, all output fields of the template are returned.</p>
     * </li>
     * <li><p>In Service Provider Interface (SPI) mode, the output fields from the independent software vendor (ISV) and the additional features of Compute Nest are returned.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;InstanceIds&quot;:[&quot;i-hp38ofxl0dsyfi7z****&quot;]}</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <p>The parameters that are entered for deploying the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;param&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p>Permanent: permanent.</p>
     * </li>
     * <li><p>Subscription: subscription.</p>
     * </li>
     * <li><p>PayAsYouGo: pay-as-you-go.</p>
     * </li>
     * <li><p>CustomFixTime: a custom fixed duration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    @NameInMap("PolicyNames")
    public String policyNames;

    /**
     * <p>The name of the package.</p>
     * 
     * <strong>example:</strong>
     * <p>Package 1</p>
     */
    @NameInMap("PredefinedParameterName")
    public String predefinedParameterName;

    /**
     * <p>The deployment progress of the service instance. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Progress")
    public Long progress;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of resources.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;StackId&quot;: &quot;stack-xxx&quot;}]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The details of the service.</p>
     */
    @NameInMap("Service")
    public GetServiceInstanceResponseBodyService service;

    /**
     * <p>The service instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The service type. Valid values:</p>
     * <ul>
     * <li><p>private: a service instance that is deployed in the user\&quot;s account.</p>
     * </li>
     * <li><p>managed: a service instance that is hosted in the service provider\&quot;s account.</p>
     * </li>
     * <li><p>operation: a managed service instance.</p>
     * </li>
     * <li><p>poc: a trial service instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The source of the service instance. Valid values:</p>
     * <ul>
     * <li><p>User: a Compute Nest user.</p>
     * </li>
     * <li><p>Market: Alibaba Cloud Marketplace.</p>
     * </li>
     * <li><p>Supplier: a Compute Nest service provider.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The deployment status of the service instance. Valid values:</p>
     * <ul>
     * <li><p>Created: The service instance is created.</p>
     * </li>
     * <li><p>Deploying: The service instance is being deployed.</p>
     * </li>
     * <li><p>DeployedFailed: The service instance failed to be deployed.</p>
     * </li>
     * <li><p>Deployed: The service instance is deployed.</p>
     * </li>
     * <li><p>Upgrading: The service instance is being upgraded.</p>
     * </li>
     * <li><p>Deleting: The service instance is being deleted.</p>
     * </li>
     * <li><p>Deleted: The service instance is deleted.</p>
     * </li>
     * <li><p>DeletedFailed: The service instance failed to be deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The description of the deployment status of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>deploy successfully</p>
     */
    @NameInMap("StatusDetail")
    public String statusDetail;

    /**
     * <p>The Alibaba Cloud account ID of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>158927391332*****</p>
     */
    @NameInMap("SupplierUid")
    public Long supplierUid;

    /**
     * <p>Indicates whether the trial service can be converted to a paid service.</p>
     */
    @NameInMap("SupportTrialToPrivate")
    public Boolean supportTrialToPrivate;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetServiceInstanceResponseBodyTags> tags;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The time when the service instance was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The user\&quot;s Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>130920852836****</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static GetServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceResponseBody self = new GetServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceInstanceResponseBody setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public String getBizStatus() {
        return this.bizStatus;
    }

    public GetServiceInstanceResponseBody setComponents(String components) {
        this.components = components;
        return this;
    }
    public String getComponents() {
        return this.components;
    }

    public GetServiceInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetServiceInstanceResponseBody setEnableInstanceOps(Boolean enableInstanceOps) {
        this.enableInstanceOps = enableInstanceOps;
        return this;
    }
    public Boolean getEnableInstanceOps() {
        return this.enableInstanceOps;
    }

    public GetServiceInstanceResponseBody setEnableUserPrometheus(Boolean enableUserPrometheus) {
        this.enableUserPrometheus = enableUserPrometheus;
        return this;
    }
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    public GetServiceInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetServiceInstanceResponseBody setGrafanaDashBoardUrl(String grafanaDashBoardUrl) {
        this.grafanaDashBoardUrl = grafanaDashBoardUrl;
        return this;
    }
    public String getGrafanaDashBoardUrl() {
        return this.grafanaDashBoardUrl;
    }

    public GetServiceInstanceResponseBody setGrantedPermission(GetServiceInstanceResponseBodyGrantedPermission grantedPermission) {
        this.grantedPermission = grantedPermission;
        return this;
    }
    public GetServiceInstanceResponseBodyGrantedPermission getGrantedPermission() {
        return this.grantedPermission;
    }

    public GetServiceInstanceResponseBody setIsOperated(Boolean isOperated) {
        this.isOperated = isOperated;
        return this;
    }
    public Boolean getIsOperated() {
        return this.isOperated;
    }

    public GetServiceInstanceResponseBody setLicenseEndTime(String licenseEndTime) {
        this.licenseEndTime = licenseEndTime;
        return this;
    }
    public String getLicenseEndTime() {
        return this.licenseEndTime;
    }

    public GetServiceInstanceResponseBody setMarketInstanceId(String marketInstanceId) {
        this.marketInstanceId = marketInstanceId;
        return this;
    }
    public String getMarketInstanceId() {
        return this.marketInstanceId;
    }

    public GetServiceInstanceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetServiceInstanceResponseBody setNetworkConfig(GetServiceInstanceResponseBodyNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public GetServiceInstanceResponseBodyNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public GetServiceInstanceResponseBody setOperatedServiceInstanceId(String operatedServiceInstanceId) {
        this.operatedServiceInstanceId = operatedServiceInstanceId;
        return this;
    }
    public String getOperatedServiceInstanceId() {
        return this.operatedServiceInstanceId;
    }

    public GetServiceInstanceResponseBody setOperationEndTime(String operationEndTime) {
        this.operationEndTime = operationEndTime;
        return this;
    }
    public String getOperationEndTime() {
        return this.operationEndTime;
    }

    public GetServiceInstanceResponseBody setOperationStartTime(String operationStartTime) {
        this.operationStartTime = operationStartTime;
        return this;
    }
    public String getOperationStartTime() {
        return this.operationStartTime;
    }

    public GetServiceInstanceResponseBody setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public GetServiceInstanceResponseBody setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public GetServiceInstanceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetServiceInstanceResponseBody setPolicyNames(String policyNames) {
        this.policyNames = policyNames;
        return this;
    }
    public String getPolicyNames() {
        return this.policyNames;
    }

    public GetServiceInstanceResponseBody setPredefinedParameterName(String predefinedParameterName) {
        this.predefinedParameterName = predefinedParameterName;
        return this;
    }
    public String getPredefinedParameterName() {
        return this.predefinedParameterName;
    }

    public GetServiceInstanceResponseBody setProgress(Long progress) {
        this.progress = progress;
        return this;
    }
    public Long getProgress() {
        return this.progress;
    }

    public GetServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetServiceInstanceResponseBody setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

    public GetServiceInstanceResponseBody setService(GetServiceInstanceResponseBodyService service) {
        this.service = service;
        return this;
    }
    public GetServiceInstanceResponseBodyService getService() {
        return this.service;
    }

    public GetServiceInstanceResponseBody setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public GetServiceInstanceResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetServiceInstanceResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetServiceInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetServiceInstanceResponseBody setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }
    public String getStatusDetail() {
        return this.statusDetail;
    }

    public GetServiceInstanceResponseBody setSupplierUid(Long supplierUid) {
        this.supplierUid = supplierUid;
        return this;
    }
    public Long getSupplierUid() {
        return this.supplierUid;
    }

    public GetServiceInstanceResponseBody setSupportTrialToPrivate(Boolean supportTrialToPrivate) {
        this.supportTrialToPrivate = supportTrialToPrivate;
        return this;
    }
    public Boolean getSupportTrialToPrivate() {
        return this.supportTrialToPrivate;
    }

    public GetServiceInstanceResponseBody setTags(java.util.List<GetServiceInstanceResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetServiceInstanceResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetServiceInstanceResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetServiceInstanceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetServiceInstanceResponseBody setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public static class GetServiceInstanceResponseBodyGrantedPermission extends TeaModel {
        @NameInMap("OperationEndTime")
        public String operationEndTime;

        @NameInMap("PolicyNames")
        public String policyNames;

        public static GetServiceInstanceResponseBodyGrantedPermission build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyGrantedPermission self = new GetServiceInstanceResponseBodyGrantedPermission();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyGrantedPermission setOperationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        public GetServiceInstanceResponseBodyGrantedPermission setPolicyNames(String policyNames) {
            this.policyNames = policyNames;
            return this;
        }
        public String getPolicyNames() {
            return this.policyNames;
        }

    }

    public static class GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs extends TeaModel {
        /**
         * <p>The bandwidth limit for the connection that is established in Compute Nest intranet-connected mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1536Mbps</p>
         */
        @NameInMap("ConnectBandwidth")
        public Integer connectBandwidth;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>ie-569a9be34f5534f6bc6559b5c1xxxxxx.service-51f80502802e48xxxxxx.cn-hangzhou.computenest.aliyuncs.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The IP address of the PrivateLink endpoint.</p>
         */
        @NameInMap("EndpointIps")
        public java.util.List<String> endpointIps;

        /**
         * <p>The status of the Ingress endpoint. Valid values:</p>
         * <ul>
         * <li><p>Ready: The Ingress endpoint is connected.</p>
         * </li>
         * <li><p>Pending: The Ingress endpoint is being connected.</p>
         * </li>
         * <li><p>Failed: The Ingress endpoint failed to be connected.</p>
         * </li>
         * <li><p>Deleted: The Ingress endpoint is deleted.</p>
         * </li>
         * <li><p>Deleting: The Ingress endpoint is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("IngressEndpointStatus")
        public String ingressEndpointStatus;

        /**
         * <p>The status of the network service. Valid values:</p>
         * <ul>
         * <li><p>Ready: The network service is connected.</p>
         * </li>
         * <li><p>Pending: The network service is being connected.</p>
         * </li>
         * <li><p>Failed: The network service failed to be connected.</p>
         * </li>
         * <li><p>Deleted: The network service is deleted.</p>
         * </li>
         * <li><p>Deleting: The network service is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("NetworkServiceStatus")
        public String networkServiceStatus;

        /**
         * <p>The region where the VPC of the endpoint is located when a private connection is established in Compute Nest intranet-connected mode.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The security group name.</p>
         */
        @NameInMap("SecurityGroups")
        public java.util.List<String> securityGroups;

        /**
         * <p>The vSwitch name.</p>
         */
        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1vwnn14rqpyiczj****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs self = new GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setConnectBandwidth(Integer connectBandwidth) {
            this.connectBandwidth = connectBandwidth;
            return this;
        }
        public Integer getConnectBandwidth() {
            return this.connectBandwidth;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setEndpointIps(java.util.List<String> endpointIps) {
            this.endpointIps = endpointIps;
            return this;
        }
        public java.util.List<String> getEndpointIps() {
            return this.endpointIps;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setIngressEndpointStatus(String ingressEndpointStatus) {
            this.ingressEndpointStatus = ingressEndpointStatus;
            return this;
        }
        public String getIngressEndpointStatus() {
            return this.ingressEndpointStatus;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setNetworkServiceStatus(String networkServiceStatus) {
            this.networkServiceStatus = networkServiceStatus;
            return this;
        }
        public String getNetworkServiceStatus() {
            return this.networkServiceStatus;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setSecurityGroups(java.util.List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public java.util.List<String> getSecurityGroups() {
            return this.securityGroups;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setVSwitches(java.util.List<String> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }
        public java.util.List<String> getVSwitches() {
            return this.vSwitches;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections extends TeaModel {
        /**
         * <p>The network configurations. This parameter is used for PrivateLink connections.</p>
         */
        @NameInMap("ConnectionConfigs")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs> connectionConfigs;

        /**
         * <p>The endpoint ID of the PrivateLink connection.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-m5ei37240541816b****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the PrivateZone for the custom private domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>cb7f214f80ac348d87daaeac1f35****</p>
         */
        @NameInMap("PrivateZoneId")
        public String privateZoneId;

        /**
         * <p>The custom domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.computenest.aliyuncs.com</p>
         */
        @NameInMap("PrivateZoneName")
        public String privateZoneName;

        /**
         * <p>The region ID of the endpoint for the PrivateLink connection.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections self = new GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections setConnectionConfigs(java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs> connectionConfigs) {
            this.connectionConfigs = connectionConfigs;
            return this;
        }
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs> getConnectionConfigs() {
            return this.connectionConfigs;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections setPrivateZoneId(String privateZoneId) {
            this.privateZoneId = privateZoneId;
            return this;
        }
        public String getPrivateZoneId() {
            return this.privateZoneId;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections setPrivateZoneName(String privateZoneName) {
            this.privateZoneName = privateZoneName;
            return this;
        }
        public String getPrivateZoneName() {
            return this.privateZoneName;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections extends TeaModel {
        /**
         * <p>The endpoint ID of the reverse PrivateLink connection.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-m5ei42370541816b****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        public static GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections self = new GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

    }

    public static class GetServiceInstanceResponseBodyNetworkConfig extends TeaModel {
        /**
         * <p>The endpoint ID of the PrivateLink connection.</p>
         * <blockquote>
         * <p>This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ep-m5ei37240541816b****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The information about the PrivateLink connection.</p>
         */
        @NameInMap("PrivateVpcConnections")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections> privateVpcConnections;

        /**
         * <p>The ID of the PrivateZone for the custom private domain name.</p>
         * <blockquote>
         * <p>This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cb7f214f80ac348d87daaeac1f35****</p>
         */
        @NameInMap("PrivateZoneId")
        public String privateZoneId;

        /**
         * <p>The information about the reverse PrivateLink connection.</p>
         */
        @NameInMap("ReversePrivateVpcConnections")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections> reversePrivateVpcConnections;

        public static GetServiceInstanceResponseBodyNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyNetworkConfig self = new GetServiceInstanceResponseBodyNetworkConfig();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyNetworkConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public GetServiceInstanceResponseBodyNetworkConfig setPrivateVpcConnections(java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections> privateVpcConnections) {
            this.privateVpcConnections = privateVpcConnections;
            return this;
        }
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections> getPrivateVpcConnections() {
            return this.privateVpcConnections;
        }

        public GetServiceInstanceResponseBodyNetworkConfig setPrivateZoneId(String privateZoneId) {
            this.privateZoneId = privateZoneId;
            return this;
        }
        public String getPrivateZoneId() {
            return this.privateZoneId;
        }

        public GetServiceInstanceResponseBodyNetworkConfig setReversePrivateVpcConnections(java.util.List<GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections> reversePrivateVpcConnections) {
            this.reversePrivateVpcConnections = reversePrivateVpcConnections;
            return this;
        }
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections> getReversePrivateVpcConnections() {
            return this.reversePrivateVpcConnections;
        }

    }

    public static class GetServiceInstanceResponseBodyServiceServiceInfos extends TeaModel {
        /**
         * <p>The URL of the service icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png">https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The language of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>B数据库</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The summary of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>B is an open-source distributed relational database independently designed and developed by Company A.</p>
         */
        @NameInMap("ShortDescription")
        public String shortDescription;

        public static GetServiceInstanceResponseBodyServiceServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyServiceServiceInfos self = new GetServiceInstanceResponseBodyServiceServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyServiceServiceInfos setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetServiceInstanceResponseBodyServiceServiceInfos setLocale(String locale) {
            this.locale = locale;
            return this;
        }
        public String getLocale() {
            return this.locale;
        }

        public GetServiceInstanceResponseBodyServiceServiceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceInstanceResponseBodyServiceServiceInfos setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public String getShortDescription() {
            return this.shortDescription;
        }

    }

    public static class GetServiceInstanceResponseBodyServiceUpgradableServiceInfos extends TeaModel {
        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>20241112</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static GetServiceInstanceResponseBodyServiceUpgradableServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyServiceUpgradableServiceInfos self = new GetServiceInstanceResponseBodyServiceUpgradableServiceInfos();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyServiceUpgradableServiceInfos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetServiceInstanceResponseBodyServiceUpgradableServiceInfos setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class GetServiceInstanceResponseBodyService extends TeaModel {
        /**
         * <p>The information about the service deployment configuration. The information varies based on the deployment type. The data is stored in the JSON string format.</p>
         */
        @NameInMap("DeployMetadata")
        public String deployMetadata;

        /**
         * <p>The deployment type. Valid values:</p>
         * <ul>
         * <li><p>ros: The service is deployed using ROS.</p>
         * </li>
         * <li><p>terraform: The service is deployed using Terraform.</p>
         * </li>
         * <li><p>ack: The service is deployed using ACK.</p>
         * </li>
         * <li><p>spi: The service is deployed by calling SPI.</p>
         * </li>
         * <li><p>operation: The service is deployed using Alibaba Cloud Managed Services.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The parameters related to O\&amp;M operations, including service upgrade and downgrade, Prometheus, and log configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SupportBackup&quot;:false,&quot;PrometheusConfigMap&quot;:{},&quot;ModifyParametersConfig&quot;:[{&quot;TemplateName&quot;:&quot;China edition&quot;,&quot;Operation&quot;:[{&quot;Name&quot;:&quot;Plan modification&quot;,&quot;Description&quot;:&quot;Plan modification&quot;,&quot;Type&quot;:&quot;Custom&quot;,&quot;SupportPredefinedParameters&quot;:true,&quot;EnableLogging&quot;:false},{&quot;Name&quot;:&quot;Parameter modification&quot;,&quot;Description&quot;:&quot;Parameter modification&quot;,&quot;Type&quot;:&quot;Custom&quot;,&quot;SupportPredefinedParameters&quot;:false,&quot;EnableLogging&quot;:false,&quot;Parameters&quot;:[&quot;DataDiskSize&quot;]}]}]}</p>
         */
        @NameInMap("OperationMetadata")
        public String operationMetadata;

        /**
         * <p>The time when the service was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The URL of the product documentation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("ServiceDocUrl")
        public String serviceDocUrl;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-9c8a3522528b4fe8****</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The service information.</p>
         */
        @NameInMap("ServiceInfos")
        public java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> serviceInfos;

        /**
         * <p>The URL of the product page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com">https://service-info-private.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("ServiceProductUrl")
        public String serviceProductUrl;

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><p>private: The service is deployed in the user\&quot;s account.</p>
         * </li>
         * <li><p>managed: The service is hosted in the service provider\&quot;s account.</p>
         * </li>
         * <li><p>operation: The service is an Alibaba Cloud Managed Service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The service status. Valid values:</p>
         * <ul>
         * <li><p>Draft: The service is pending registration submission.</p>
         * </li>
         * <li><p>Submitted: The registration is submitted.</p>
         * </li>
         * <li><p>Approved: The registration is approved.</p>
         * </li>
         * <li><p>Online: The service is published.</p>
         * </li>
         * <li><p>Offline: The service is unpublished.</p>
         * </li>
         * <li><p>Deleted: The service is deleted.</p>
         * </li>
         * <li><p>Launching: The service is being published.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Company A</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The URL of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("SupplierUrl")
        public String supplierUrl;

        /**
         * <p>The information about the service versions to which the service can be upgraded.</p>
         */
        @NameInMap("UpgradableServiceInfos")
        public java.util.List<GetServiceInstanceResponseBodyServiceUpgradableServiceInfos> upgradableServiceInfos;

        /**
         * <p>The list of service versions to which the service can be upgraded.</p>
         */
        @NameInMap("UpgradableServiceVersions")
        public java.util.List<String> upgradableServiceVersions;

        /**
         * <p>The upgrade metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;Type&quot;: &quot;OOS&quot;,
         *   &quot;Description&quot;: &quot;Changelog or something description&quot;,
         *   &quot;SupportUpgradeFromVersions&quot;: [1, 2],
         *   &quot;UpgradeSteps&quot;: {
         *     &quot;PreUpgradeStage&quot;: {
         *       &quot;Description&quot;: &quot;Initialize database&quot;,
         *       &quot;Type&quot;: &quot;RunCommand&quot;,
         *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
         *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
         *       &quot;CommandContent&quot;: &quot;echo hello&quot;
         *     },
         *     &quot;UpgradeStage&quot;: [{
         *       &quot;Description&quot;: &quot;Update EcsRole1 instance&quot;,
         *       &quot;Type&quot;: &quot;RunCommand&quot;,
         *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
         *       &quot;ArtifactsDownloadDirectory&quot;: &quot;/home/admin&quot;,
         *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
         *       &quot;CommandContent&quot;: &quot;echo hello&quot;
         *     }],
         *     &quot;PostUpgradeStage&quot;: {
         *       &quot;Description&quot;: &quot;Post-deployment check&quot;,
         *       &quot;Type&quot;: &quot;None/RunCommand&quot;,
         *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
         *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
         *       &quot;CommandContent&quot;: &quot;echo hello&quot;
         *     }
         *   }
         * }</p>
         */
        @NameInMap("UpgradeMetadata")
        public String upgradeMetadata;

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The custom version name defined by the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Version A</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static GetServiceInstanceResponseBodyService build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyService self = new GetServiceInstanceResponseBodyService();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyService setDeployMetadata(String deployMetadata) {
            this.deployMetadata = deployMetadata;
            return this;
        }
        public String getDeployMetadata() {
            return this.deployMetadata;
        }

        public GetServiceInstanceResponseBodyService setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetServiceInstanceResponseBodyService setOperationMetadata(String operationMetadata) {
            this.operationMetadata = operationMetadata;
            return this;
        }
        public String getOperationMetadata() {
            return this.operationMetadata;
        }

        public GetServiceInstanceResponseBodyService setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

        public GetServiceInstanceResponseBodyService setServiceDocUrl(String serviceDocUrl) {
            this.serviceDocUrl = serviceDocUrl;
            return this;
        }
        public String getServiceDocUrl() {
            return this.serviceDocUrl;
        }

        public GetServiceInstanceResponseBodyService setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public GetServiceInstanceResponseBodyService setServiceInfos(java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> serviceInfos) {
            this.serviceInfos = serviceInfos;
            return this;
        }
        public java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

        public GetServiceInstanceResponseBodyService setServiceProductUrl(String serviceProductUrl) {
            this.serviceProductUrl = serviceProductUrl;
            return this;
        }
        public String getServiceProductUrl() {
            return this.serviceProductUrl;
        }

        public GetServiceInstanceResponseBodyService setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetServiceInstanceResponseBodyService setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetServiceInstanceResponseBodyService setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public GetServiceInstanceResponseBodyService setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public GetServiceInstanceResponseBodyService setUpgradableServiceInfos(java.util.List<GetServiceInstanceResponseBodyServiceUpgradableServiceInfos> upgradableServiceInfos) {
            this.upgradableServiceInfos = upgradableServiceInfos;
            return this;
        }
        public java.util.List<GetServiceInstanceResponseBodyServiceUpgradableServiceInfos> getUpgradableServiceInfos() {
            return this.upgradableServiceInfos;
        }

        public GetServiceInstanceResponseBodyService setUpgradableServiceVersions(java.util.List<String> upgradableServiceVersions) {
            this.upgradableServiceVersions = upgradableServiceVersions;
            return this;
        }
        public java.util.List<String> getUpgradableServiceVersions() {
            return this.upgradableServiceVersions;
        }

        public GetServiceInstanceResponseBodyService setUpgradeMetadata(String upgradeMetadata) {
            this.upgradeMetadata = upgradeMetadata;
            return this;
        }
        public String getUpgradeMetadata() {
            return this.upgradeMetadata;
        }

        public GetServiceInstanceResponseBodyService setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetServiceInstanceResponseBodyService setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class GetServiceInstanceResponseBodyTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetServiceInstanceResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyTags self = new GetServiceInstanceResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetServiceInstanceResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetServiceInstanceResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
