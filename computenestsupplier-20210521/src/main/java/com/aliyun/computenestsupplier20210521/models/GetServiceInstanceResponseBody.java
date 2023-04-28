// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetServiceInstanceResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("EnableInstanceOps")
    public Boolean enableInstanceOps;

    @NameInMap("EnableUserPrometheus")
    public String enableUserPrometheus;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IsOperated")
    public Boolean isOperated;

    @NameInMap("LicenseMetadata")
    public String licenseMetadata;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetworkConfig")
    public GetServiceInstanceResponseBodyNetworkConfig networkConfig;

    @NameInMap("OperatedServiceInstanceId")
    public String operatedServiceInstanceId;

    @NameInMap("OperationEndTime")
    public String operationEndTime;

    @NameInMap("OperationStartTime")
    public String operationStartTime;

    @NameInMap("Outputs")
    public String outputs;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Progress")
    public Long progress;

    @NameInMap("RdAccountLoginUrl")
    public String rdAccountLoginUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public String resources;

    @NameInMap("Service")
    public GetServiceInstanceResponseBodyService service;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Source")
    public String source;

    @NameInMap("Status")
    public String status;

    @NameInMap("StatusDetail")
    public String statusDetail;

    @NameInMap("SupplierUid")
    public Long supplierUid;

    @NameInMap("Tags")
    public java.util.List<GetServiceInstanceResponseBodyTags> tags;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("UserId")
    public Long userId;

    public static GetServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceInstanceResponseBody self = new GetServiceInstanceResponseBody();
        return TeaModel.build(map, self);
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

    public GetServiceInstanceResponseBody setEnableUserPrometheus(String enableUserPrometheus) {
        this.enableUserPrometheus = enableUserPrometheus;
        return this;
    }
    public String getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    public GetServiceInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("EndpointIps")
        public java.util.List<String> endpointIps;

        @NameInMap("IngressEndpointStatus")
        public String ingressEndpointStatus;

        @NameInMap("NetworkServiceStatus")
        public String networkServiceStatus;

        @NameInMap("SecurityGroups")
        public java.util.List<String> securityGroups;

        @NameInMap("VSwitches")
        public java.util.List<String> vSwitches;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs self = new GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs();
            return TeaModel.build(map, self);
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
        @NameInMap("ConnectionConfigs")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnectionsConnectionConfigs> connectionConfigs;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointServiceId")
        public String endpointServiceId;

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
        @NameInMap("EndpointId")
        public String endpointId;

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
        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointServiceId")
        public String endpointServiceId;

        @NameInMap("PrivateVpcConnections")
        public java.util.List<GetServiceInstanceResponseBodyNetworkConfigPrivateVpcConnections> privateVpcConnections;

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
        @NameInMap("Image")
        public String image;

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

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("PublishTime")
        public String publishTime;

        @NameInMap("ServiceDocUrl")
        public String serviceDocUrl;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceInfos")
        public java.util.List<GetServiceInstanceResponseBodyServiceServiceInfos> serviceInfos;

        @NameInMap("ServiceProductUrl")
        public String serviceProductUrl;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("SupplierUrl")
        public String supplierUrl;

        @NameInMap("UpgradableServiceVersions")
        public java.util.List<String> upgradableServiceVersions;

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
        @NameInMap("Key")
        public String key;

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
