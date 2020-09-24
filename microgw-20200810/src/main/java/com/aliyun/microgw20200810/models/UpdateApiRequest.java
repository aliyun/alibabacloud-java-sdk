// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateApiRequest extends TeaModel {
    // ApiQueryDTO
    @NameInMap("data")
    public UpdateApiRequestData data;

    public static UpdateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiRequest self = new UpdateApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiRequest setData(UpdateApiRequestData data) {
        this.data = data;
        return this;
    }
    public UpdateApiRequestData getData() {
        return this.data;
    }

    public static class UpdateApiRequestDataAttachedServicesServiceEnds extends TeaModel {
        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // id
        @NameInMap("id")
        public Long id;

        // ipAddress
        @NameInMap("ipAddress")
        public String ipAddress;

        // port
        @NameInMap("port")
        public String port;

        // serviceId
        @NameInMap("serviceId")
        public Long serviceId;

        // status
        @NameInMap("status")
        public Long status;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static UpdateApiRequestDataAttachedServicesServiceEnds build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestDataAttachedServicesServiceEnds self = new UpdateApiRequestDataAttachedServicesServiceEnds();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestDataAttachedServicesServiceEnds setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestDataAttachedServicesServiceEnds setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestDataAttachedServicesServiceEnds setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public UpdateApiRequestDataAttachedServicesServiceEnds setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateApiRequestDataAttachedServicesServiceEnds setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public UpdateApiRequestDataAttachedServicesServiceEnds setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public UpdateApiRequestDataAttachedServicesServiceEnds setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class UpdateApiRequestDataAttachedServices extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // description
        @NameInMap("description")
        public String description;

        // id
        @NameInMap("id")
        public Long id;

        // isAutoRefresh
        @NameInMap("isAutoRefresh")
        public Boolean isAutoRefresh;

        // isHealth
        @NameInMap("isHealth")
        public Boolean isHealth;

        // name
        @NameInMap("name")
        public String name;

        // registryId
        @NameInMap("registryId")
        public String registryId;

        // serviceEnds
        @NameInMap("serviceEnds")
        public java.util.List<UpdateApiRequestDataAttachedServicesServiceEnds> serviceEnds;

        // serviceNameInRegistry
        @NameInMap("serviceNameInRegistry")
        public String serviceNameInRegistry;

        // sourceType
        @NameInMap("sourceType")
        public Long sourceType;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static UpdateApiRequestDataAttachedServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestDataAttachedServices self = new UpdateApiRequestDataAttachedServices();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestDataAttachedServices setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public UpdateApiRequestDataAttachedServices setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestDataAttachedServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApiRequestDataAttachedServices setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestDataAttachedServices setIsAutoRefresh(Boolean isAutoRefresh) {
            this.isAutoRefresh = isAutoRefresh;
            return this;
        }
        public Boolean getIsAutoRefresh() {
            return this.isAutoRefresh;
        }

        public UpdateApiRequestDataAttachedServices setIsHealth(Boolean isHealth) {
            this.isHealth = isHealth;
            return this;
        }
        public Boolean getIsHealth() {
            return this.isHealth;
        }

        public UpdateApiRequestDataAttachedServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApiRequestDataAttachedServices setRegistryId(String registryId) {
            this.registryId = registryId;
            return this;
        }
        public String getRegistryId() {
            return this.registryId;
        }

        public UpdateApiRequestDataAttachedServices setServiceEnds(java.util.List<UpdateApiRequestDataAttachedServicesServiceEnds> serviceEnds) {
            this.serviceEnds = serviceEnds;
            return this;
        }
        public java.util.List<UpdateApiRequestDataAttachedServicesServiceEnds> getServiceEnds() {
            return this.serviceEnds;
        }

        public UpdateApiRequestDataAttachedServices setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public UpdateApiRequestDataAttachedServices setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

        public UpdateApiRequestDataAttachedServices setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class UpdateApiRequestDataOwneredPolicies extends TeaModel {
        // apiId
        @NameInMap("apiId")
        public Long apiId;

        // apiName
        @NameInMap("apiName")
        public String apiName;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // direction
        @NameInMap("direction")
        public String direction;

        // id
        @NameInMap("id")
        public Long id;

        // policyAliasName
        @NameInMap("policyAliasName")
        public String policyAliasName;

        // policyContent
        @NameInMap("policyContent")
        public String policyContent;

        // policyGroup
        @NameInMap("policyGroup")
        public String policyGroup;

        // policyId
        @NameInMap("policyId")
        public String policyId;

        // policyName
        @NameInMap("policyName")
        public String policyName;

        // priority
        @NameInMap("priority")
        public Long priority;

        // scope
        @NameInMap("scope")
        public String scope;

        // status
        @NameInMap("status")
        public Boolean status;

        // type
        @NameInMap("type")
        public Long type;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static UpdateApiRequestDataOwneredPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestDataOwneredPolicies self = new UpdateApiRequestDataOwneredPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestDataOwneredPolicies setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public UpdateApiRequestDataOwneredPolicies setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public UpdateApiRequestDataOwneredPolicies setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestDataOwneredPolicies setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public UpdateApiRequestDataOwneredPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestDataOwneredPolicies setPolicyAliasName(String policyAliasName) {
            this.policyAliasName = policyAliasName;
            return this;
        }
        public String getPolicyAliasName() {
            return this.policyAliasName;
        }

        public UpdateApiRequestDataOwneredPolicies setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public UpdateApiRequestDataOwneredPolicies setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public UpdateApiRequestDataOwneredPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public UpdateApiRequestDataOwneredPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public UpdateApiRequestDataOwneredPolicies setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public UpdateApiRequestDataOwneredPolicies setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public UpdateApiRequestDataOwneredPolicies setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public UpdateApiRequestDataOwneredPolicies setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public UpdateApiRequestDataOwneredPolicies setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class UpdateApiRequestDataPublishedGateway extends TeaModel {
        // armsInfo
        @NameInMap("armsInfo")
        public String armsInfo;

        // autoCreateSlb
        @NameInMap("autoCreateSlb")
        public Boolean autoCreateSlb;

        // basePath
        @NameInMap("basePath")
        public String basePath;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // edasNamespaceId
        @NameInMap("edasNamespaceId")
        public String edasNamespaceId;

        // gatewayType
        @NameInMap("gatewayType")
        public String gatewayType;

        // id
        @NameInMap("id")
        public Long id;

        // name
        @NameInMap("name")
        public String name;

        // podCidr
        @NameInMap("podCidr")
        public String podCidr;

        // region
        @NameInMap("region")
        public String region;

        // regionName
        @NameInMap("regionName")
        public String regionName;

        // replica
        @NameInMap("replica")
        public Long replica;

        // runtimeOn
        @NameInMap("runtimeOn")
        public String runtimeOn;

        // securityGroup
        @NameInMap("securityGroup")
        public String securityGroup;

        // slb
        @NameInMap("slb")
        public String slb;

        // slbAccessAddr
        @NameInMap("slbAccessAddr")
        public String slbAccessAddr;

        // status
        @NameInMap("status")
        public String status;

        // vpc
        @NameInMap("vpc")
        public String vpc;

        // vswitch
        @NameInMap("vswitch")
        public String vswitch;

        public static UpdateApiRequestDataPublishedGateway build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestDataPublishedGateway self = new UpdateApiRequestDataPublishedGateway();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestDataPublishedGateway setArmsInfo(String armsInfo) {
            this.armsInfo = armsInfo;
            return this;
        }
        public String getArmsInfo() {
            return this.armsInfo;
        }

        public UpdateApiRequestDataPublishedGateway setAutoCreateSlb(Boolean autoCreateSlb) {
            this.autoCreateSlb = autoCreateSlb;
            return this;
        }
        public Boolean getAutoCreateSlb() {
            return this.autoCreateSlb;
        }

        public UpdateApiRequestDataPublishedGateway setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public UpdateApiRequestDataPublishedGateway setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestDataPublishedGateway setEdasNamespaceId(String edasNamespaceId) {
            this.edasNamespaceId = edasNamespaceId;
            return this;
        }
        public String getEdasNamespaceId() {
            return this.edasNamespaceId;
        }

        public UpdateApiRequestDataPublishedGateway setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public UpdateApiRequestDataPublishedGateway setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestDataPublishedGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApiRequestDataPublishedGateway setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public UpdateApiRequestDataPublishedGateway setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateApiRequestDataPublishedGateway setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public UpdateApiRequestDataPublishedGateway setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public UpdateApiRequestDataPublishedGateway setRuntimeOn(String runtimeOn) {
            this.runtimeOn = runtimeOn;
            return this;
        }
        public String getRuntimeOn() {
            return this.runtimeOn;
        }

        public UpdateApiRequestDataPublishedGateway setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public UpdateApiRequestDataPublishedGateway setSlb(String slb) {
            this.slb = slb;
            return this;
        }
        public String getSlb() {
            return this.slb;
        }

        public UpdateApiRequestDataPublishedGateway setSlbAccessAddr(String slbAccessAddr) {
            this.slbAccessAddr = slbAccessAddr;
            return this;
        }
        public String getSlbAccessAddr() {
            return this.slbAccessAddr;
        }

        public UpdateApiRequestDataPublishedGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateApiRequestDataPublishedGateway setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public UpdateApiRequestDataPublishedGateway setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

    public static class UpdateApiRequestData extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // attachedServices
        @NameInMap("attachedServices")
        public java.util.List<UpdateApiRequestDataAttachedServices> attachedServices;

        // basePath
        @NameInMap("basePath")
        public String basePath;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // description
        @NameInMap("description")
        public String description;

        // id
        @NameInMap("id")
        public Long id;

        // name
        @NameInMap("name")
        public String name;

        // owneredPolicies
        @NameInMap("owneredPolicies")
        public java.util.List<UpdateApiRequestDataOwneredPolicies> owneredPolicies;

        // A short description of struct
        @NameInMap("publishedGateway")
        public UpdateApiRequestDataPublishedGateway publishedGateway;

        // status
        @NameInMap("status")
        public String status;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static UpdateApiRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestData self = new UpdateApiRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public UpdateApiRequestData setAttachedServices(java.util.List<UpdateApiRequestDataAttachedServices> attachedServices) {
            this.attachedServices = attachedServices;
            return this;
        }
        public java.util.List<UpdateApiRequestDataAttachedServices> getAttachedServices() {
            return this.attachedServices;
        }

        public UpdateApiRequestData setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public UpdateApiRequestData setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApiRequestData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApiRequestData setOwneredPolicies(java.util.List<UpdateApiRequestDataOwneredPolicies> owneredPolicies) {
            this.owneredPolicies = owneredPolicies;
            return this;
        }
        public java.util.List<UpdateApiRequestDataOwneredPolicies> getOwneredPolicies() {
            return this.owneredPolicies;
        }

        public UpdateApiRequestData setPublishedGateway(UpdateApiRequestDataPublishedGateway publishedGateway) {
            this.publishedGateway = publishedGateway;
            return this;
        }
        public UpdateApiRequestDataPublishedGateway getPublishedGateway() {
            return this.publishedGateway;
        }

        public UpdateApiRequestData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateApiRequestData setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

}
