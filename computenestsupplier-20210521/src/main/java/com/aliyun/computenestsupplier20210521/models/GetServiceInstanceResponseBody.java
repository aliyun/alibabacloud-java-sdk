// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceInstanceResponseBody extends TeaModel {
    /**
     * <p>The business status of the service instance. Valid values:</p>
     * <ul>
     * <li>Normal: The service instance is normal.</li>
     * <li>Renewing: The service instance is being renewed.</li>
     * <li>RenewFailed: The service instance failed to be renewed.</li>
     * <li>Expired: The service instance expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("BizStatus")
    public String bizStatus;

    /**
     * <p>The time when the service instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether the service instance supports the hosted O\&amp;M feature. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    /**
     * <p>Indicates whether the Prometheus monitoring feature is enabled on the user side.</p>
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
     * <p><a href="https://g.xxxxxx.aliyun.com/d/xxxxxxxx-cn-mariadb/mysql-xxxxxxxx-quickstart-and-dashboard?orgId=355401&refresh=10s">https://g.xxxxxx.aliyun.com/d/xxxxxxxx-cn-mariadb/mysql-xxxxxxxx-quickstart-and-dashboard?orgId=355401&amp;refresh=10s</a></p>
     */
    @NameInMap("GrafanaDashBoardUrl")
    public String grafanaDashBoardUrl;

    /**
     * <p>Indicates whether the hosted O\&amp;M feature is enabled for the service instance. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOperated")
    public Boolean isOperated;

    /**
     * <p>The license metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;renewType&quot;:&quot;MONTHLY&quot;}</p>
     */
    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    /**
     * <p>The name of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network configurations.</p>
     * <blockquote>
     * <p> This parameter is discontinued.</p>
     * </blockquote>
     */
    @NameInMap("NetworkConfig")
    public GetServiceInstanceResponseBodyNetworkConfig networkConfig;

    /**
     * <p>The ID of the service instance that is used to implement hosted O\&amp;M.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("OperatedServiceInstanceId")
    public String operatedServiceInstanceId;

    /**
     * <p>The end of the time range during which hosted O\&amp;M is implemented.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-28T06:48:56Z</p>
     */
    @NameInMap("OperationEndTime")
    public String operationEndTime;

    /**
     * <p>The beginning of the time range during which hosted O\&amp;M is implemented.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-29T06:48:56Z</p>
     */
    @NameInMap("OperationStartTime")
    public String operationStartTime;

    /**
     * <p>The outputs returned from creating the service instance.</p>
     * <ul>
     * <li>If the service is deployed by using a ROS template, all output fields of the template are returned.</li>
     * <li>If the service is deployed by calling an SPI operation, the output fields of the service provider and for the Compute Nest additional features are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;InstanceIds&quot;: [
     *             &quot;i-hp38ofxl0dsyfi7z****&quot;
     *       ]
     * }</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <p>The parameters that are specified to deploy the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;param&quot;: &quot;value&quot;
     * }</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The billing method of the service. Valid values:</p>
     * <ul>
     * <li>Permanent: Once you purchase the service, you can use it permanently.</li>
     * <li>Subscription: You purchase the service from Alibaba Cloud Marketplace and are charged for the service on a subscription basis.</li>
     * <li>PayAsYouGo: You purchase the service from Alibaba Cloud Marketplace and are charged for the service on a pay-as-you-go basis.</li>
     * <li>CustomFixTime: You are charged for the service based on a custom duration fixed by the service provider.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The package name.</p>
     * 
     * <strong>example:</strong>
     * <p>Package 1</p>
     */
    @NameInMap("PredefinedParameterName")
    public String predefinedParameterName;

    /**
     * <p>The deployment progress of the service instance. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Progress")
    public Long progress;

    /**
     * <p>The logon URL for the accounts in the resource directory corresponding to the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://signin.aliyun.com/switchRole.htm?parentAlias=1307782318217247.onaliyun.com&roleName=ResourceDirectoryAccountAccessRole">https://signin.aliyun.com/switchRole.htm?parentAlias=1307782318217247.onaliyun.com&amp;roleName=ResourceDirectoryAccountAccessRole</a></p>
     */
    @NameInMap("RdAccountLoginUrl")
    public String rdAccountLoginUrl;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzkt5buxxxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of resources.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;StackId&quot;: &quot;stack-xxx&quot;
     *       }
     * ]</p>
     */
    @NameInMap("Resources")
    public String resources;

    /**
     * <p>The information about the service to which the service instance belongs.</p>
     */
    @NameInMap("Service")
    public GetServiceInstanceResponseBodyService service;

    /**
     * <p>The ID of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The type of the service. Valid values:</p>
     * <ul>
     * <li>private: The service is a private service and is deployed within the account of a customer.</li>
     * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
     * <li>operation: The service is a hosted O\&amp;M service.</li>
     * <li>poc: The service is a trial service.</li>
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
     * <li>User: Compute Nest customer</li>
     * <li>Market: Alibaba Cloud Marketplace</li>
     * <li>Supplier: Compute Nest service provider</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The deployment state of the service instance. Valid values:</p>
     * <ul>
     * <li>Created</li>
     * <li>Deploying</li>
     * <li>DeployedFailed</li>
     * <li>Deployed</li>
     * <li>Upgrading</li>
     * <li>Deleting</li>
     * <li>Deleted</li>
     * <li>DeletedFailed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The description of the deployment state of the service instance.</p>
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
     * <p>1964460391538545</p>
     */
    @NameInMap("SupplierUid")
    public Long supplierUid;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetServiceInstanceResponseBodyTags> tags;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>模板1</p>
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
     * <p>The Alibaba Cloud account ID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
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

    public GetServiceInstanceResponseBody setIsOperated(Boolean isOperated) {
        this.isOperated = isOperated;
        return this;
    }
    public Boolean getIsOperated() {
        return this.isOperated;
    }

    public GetServiceInstanceResponseBody setLicenseMetadata(String licenseMetadata) {
        this.licenseMetadata = licenseMetadata;
        return this;
    }
    public String getLicenseMetadata() {
        return this.licenseMetadata;
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

    public GetServiceInstanceResponseBody setRdAccountLoginUrl(String rdAccountLoginUrl) {
        this.rdAccountLoginUrl = rdAccountLoginUrl;
        return this;
    }
    public String getRdAccountLoginUrl() {
        return this.rdAccountLoginUrl;
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

    public static class GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs extends TeaModel {
        /**
         * <p>The bandwidth limit for the private connection established based on the private network interconnection mode of Compute Nest.</p>
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
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The IP addresses of the endpoints for private connections.</p>
         */
        @NameInMap("EndpointIps")
        public java.util.List<String> endpointIps;

        /**
         * <p>The status of the Ingress endpoint. Valid values:</p>
         * <ul>
         * <li>Ready: The Ingress endpoint is connected.</li>
         * <li>Pending: The Ingress endpoint is being connected.</li>
         * <li>Failed: The Ingress endpoint fails to be connected.</li>
         * <li>Deleted: The Ingress endpoint is deleted.</li>
         * <li>Deleting: The Ingress endpoint is being deleted.</li>
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
         * <li>Ready: The network service is connected.</li>
         * <li>Pending: The network service is being connected.</li>
         * <li>Failed: The network service fails to be connected.</li>
         * <li>Deleted: The network service is deleted.</li>
         * <li>Deleting: The network service is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("NetworkServiceStatus")
        public String networkServiceStatus;

        /**
         * <p>The names of the security groups.</p>
         */
        @NameInMap("SecurityGroups")
        public java.util.List<String> securityGroups;

        /**
         * <p>The names of the vSwitches.</p>
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
         * <p>The network configurations, which are mainly used for the private connection.</p>
         */
        @NameInMap("ConnectionConfigs")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs> connectionConfigs;

        /**
         * <p>The ID of the endpoint for the private connection.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-m5ei37240541816b****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the endpoint service for the private connection.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-5ei07324541816bxxxx</p>
         */
        @NameInMap("EndpointServiceId")
        public String endpointServiceId;

        /**
         * <p>The custom domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.computenest.aliyuncs.com</p>
         */
        @NameInMap("PrivateZoneName")
        public String privateZoneName;

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

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections setEndpointServiceId(String endpointServiceId) {
            this.endpointServiceId = endpointServiceId;
            return this;
        }
        public String getEndpointServiceId() {
            return this.endpointServiceId;
        }

        public GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections setPrivateZoneName(String privateZoneName) {
            this.privateZoneName = privateZoneName;
            return this;
        }
        public String getPrivateZoneName() {
            return this.privateZoneName;
        }

    }

    public static class GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections extends TeaModel {
        /**
         * <p>The ID of the endpoint for the reverse private connection.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-m5ei42370541816b****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the endpoint service for the reverse private connection.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-5ei07324541816bxxxx</p>
         */
        @NameInMap("EndpointServiceId")
        public String endpointServiceId;

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

        public GetServiceInstanceResponseBodyNetworkConfigReversePrivateVpcConnections setEndpointServiceId(String endpointServiceId) {
            this.endpointServiceId = endpointServiceId;
            return this;
        }
        public String getEndpointServiceId() {
            return this.endpointServiceId;
        }

    }

    public static class GetServiceInstanceResponseBodyNetworkConfig extends TeaModel {
        /**
         * <p>The ID of the endpoint for the private connection.</p>
         * <blockquote>
         * <p> This parameter is discontinued.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ep-m5ei37240541816b****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the endpoint service for the private connection.</p>
         * <blockquote>
         * <p> This parameter is discontinued.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>epsrv-5ei07324541816bxxxx</p>
         */
        @NameInMap("EndpointServiceId")
        public String endpointServiceId;

        /**
         * <p>The information about private connections.</p>
         */
        @NameInMap("PrivateVpcConnections")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections> privateVpcConnections;

        /**
         * <p>The information about the reverse private connection.</p>
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

        public GetServiceInstanceResponseBodyNetworkConfig setEndpointServiceId(String endpointServiceId) {
            this.endpointServiceId = endpointServiceId;
            return this;
        }
        public String getEndpointServiceId() {
            return this.endpointServiceId;
        }

        public GetServiceInstanceResponseBodyNetworkConfig setPrivateVpcConnections(java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections> privateVpcConnections) {
            this.privateVpcConnections = privateVpcConnections;
            return this;
        }
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections> getPrivateVpcConnections() {
            return this.privateVpcConnections;
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
         * <p>WordPress</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>B是A公司自主设计并研发的开源分布式的关系型数据库</p>
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

    public static class GetServiceInstanceResponseBodyService extends TeaModel {
        /**
         * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
         */
        @NameInMap("DeployMetadata")
        public String deployMetadata;

        /**
         * <p>The deployment type of the service. Valid values:</p>
         * <ul>
         * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
         * <li>terraform: The service is deployed by using Terraform.</li>
         * <li>ack: The service is deployed by using Container Service for Kubernetes (ACK).</li>
         * <li>spi: The service is deployed by calling a service provider interface (SPI).</li>
         * <li>operation: The service is deployed by using a hosted O\&amp;M service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <p>The time when the service was published.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <p>The URL of the service documentation.</p>
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
         * <p>The information about the service.</p>
         */
        @NameInMap("ServiceInfos")
        public java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> serviceInfos;

        /**
         * <p>The URL of the service page.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com">https://service-info-private.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("ServiceProductUrl")
        public String serviceProductUrl;

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>private: The service is a private service and is deployed within the account of a customer.</li>
         * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
         * <li>operation: The service is a hosted O\&amp;M service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The status of the service. Valid values:</p>
         * <p>Draft: The registration request of the service is pending to be submitted.</p>
         * <p>Submitted: The registration request of the service is submitted.</p>
         * <p>Approved: The registration request of the service is approved.</p>
         * <p>Online: The service is published.</p>
         * <p>Offline: The service is unpublished.</p>
         * <p>Deleted: The service is deleted.</p>
         * <p>Launching: The service is being published.</p>
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
         * <p>Alibaba Cloud</p>
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
         * <p>The service versions that can be updated.</p>
         */
        @NameInMap("UpgradableServiceVersions")
        public java.util.List<String> upgradableServiceVersions;

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
         * <p>20231127020225</p>
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

        public GetServiceInstanceResponseBodyService setUpgradableServiceVersions(java.util.List<String> upgradableServiceVersions) {
            this.upgradableServiceVersions = upgradableServiceVersions;
            return this;
        }
        public java.util.List<String> getUpgradableServiceVersions() {
            return this.upgradableServiceVersions;
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
