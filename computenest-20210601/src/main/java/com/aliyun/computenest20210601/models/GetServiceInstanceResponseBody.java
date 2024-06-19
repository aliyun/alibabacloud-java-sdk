// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetServiceInstanceResponseBody extends TeaModel {
    @NameInMap("BizStatus")
    public String bizStatus;

    /**
     * <p>云市场额外计费项。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TiKVServerCount&quot;:&quot;3&quot;,&quot;package_version&quot;:&quot;yuncode5398300001&quot;,&quot;PDServerCount&quot;:&quot;3&quot;,&quot;TiDBServerCount&quot;:&quot;2&quot;}</p>
     */
    @NameInMap("Components")
    public String components;

    /**
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUserPrometheus")
    public Boolean enableUserPrometheus;

    /**
     * <strong>example:</strong>
     * <p>2022-01-01T12:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GrafanaDashBoardUrl")
    public String grafanaDashBoardUrl;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOperated")
    public Boolean isOperated;

    /**
     * <strong>example:</strong>
     * <p>2022-01-01T12:00:00</p>
     */
    @NameInMap("LicenseEndTime")
    public String licenseEndTime;

    /**
     * <strong>example:</strong>
     * <p>704***59</p>
     */
    @NameInMap("MarketInstanceId")
    public String marketInstanceId;

    /**
     * <strong>example:</strong>
     * <p>TestName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkConfig")
    public GetServiceInstanceResponseBodyNetworkConfig networkConfig;

    /**
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("OperatedServiceInstanceId")
    public String operatedServiceInstanceId;

    /**
     * <strong>example:</strong>
     * <p>2022-01-28T06:48:56Z</p>
     */
    @NameInMap("OperationEndTime")
    public String operationEndTime;

    /**
     * <strong>example:</strong>
     * <p>2021-12-29T06:48:56Z</p>
     */
    @NameInMap("OperationStartTime")
    public String operationStartTime;

    /**
     * <strong>example:</strong>
     * <p>{&quot;InstanceIds&quot;:[&quot;i-hp38ofxl0dsyfi7z****&quot;]}</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    /**
     * <strong>example:</strong>
     * <p>{&quot;param&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>套餐名称。</p>
     * 
     * <strong>example:</strong>
     * <p>套餐一</p>
     */
    @NameInMap("PredefinedParameterName")
    public String predefinedParameterName;

    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("Progress")
    public Long progress;

    /**
     * <strong>example:</strong>
     * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;StackId&quot;: &quot;stack-xxx&quot;}]</p>
     */
    @NameInMap("Resources")
    public String resources;

    @NameInMap("Service")
    public GetServiceInstanceResponseBodyService service;

    /**
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4b17****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>Deployed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>deploy successfully</p>
     */
    @NameInMap("StatusDetail")
    public String statusDetail;

    /**
     * <strong>example:</strong>
     * <p>158927391332*****</p>
     */
    @NameInMap("SupplierUid")
    public Long supplierUid;

    @NameInMap("Tags")
    public java.util.List<GetServiceInstanceResponseBodyTags> tags;

    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>2021-05-20T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
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
        @NameInMap("ConnectBandwidth")
        public Integer connectBandwidth;

        /**
         * <p>域名名称。</p>
         * 
         * <strong>example:</strong>
         * <p>ie-569a9be34f5534f6bc6559b5c1xxxxxx.service-51f80502802e48xxxxxx.cn-hangzhou.computenest.aliyuncs.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndpointIps")
        public java.util.List<String> endpointIps;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("IngressEndpointStatus")
        public String ingressEndpointStatus;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("NetworkServiceStatus")
        public String networkServiceStatus;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecurityGroups")
        public java.util.List<String> securityGroups;

        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        /**
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
        @NameInMap("ConnectionConfigs")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs> connectionConfigs;

        /**
         * <strong>example:</strong>
         * <p>ep-m5ei37240541816b****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <strong>example:</strong>
         * <p>cb7f214f80ac348d87daaeac1f35****</p>
         */
        @NameInMap("PrivateZoneId")
        public String privateZoneId;

        /**
         * <strong>example:</strong>
         * <p>test.computenest.aliyuncs.com</p>
         */
        @NameInMap("PrivateZoneName")
        public String privateZoneName;

        /**
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
         * <strong>example:</strong>
         * <p>ep-m5ei37240541816b****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("PrivateVpcConnections")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections> privateVpcConnections;

        /**
         * <strong>example:</strong>
         * <p>cb7f214f80ac348d87daaeac1f35****</p>
         */
        @NameInMap("PrivateZoneId")
        public String privateZoneId;

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
         * <strong>example:</strong>
         * <p><a href="https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png">https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png</a></p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Locale")
        public String locale;

        @NameInMap("Name")
        public String name;

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
        @NameInMap("DeployMetadata")
        public String deployMetadata;

        /**
         * <strong>example:</strong>
         * <p>ros</p>
         */
        @NameInMap("DeployType")
        public String deployType;

        /**
         * <strong>example:</strong>
         * <p>2021-05-21T00:00:00Z</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("ServiceDocUrl")
        public String serviceDocUrl;

        /**
         * <strong>example:</strong>
         * <p>service-9c8a3522528b4fe8****</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceInfos")
        public java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> serviceInfos;

        /**
         * <strong>example:</strong>
         * <p><a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com">https://service-info-private.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("ServiceProductUrl")
        public String serviceProductUrl;

        /**
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("UpgradableServiceVersions")
        public java.util.List<String> upgradableServiceVersions;

        @NameInMap("UpgradeMetadata")
        public String upgradeMetadata;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

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
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
