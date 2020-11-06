// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class UpdateApiRequest extends TeaModel {
    // aliasName
    @NameInMap("aliasName")
    public String aliasName;

    // attachedServices
    @NameInMap("attachedServices")
    public java.util.List<UpdateApiRequestAttachedServices> attachedServices;

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
    public java.util.List<UpdateApiRequestOwneredPolicies> owneredPolicies;

    // A short description of struct
    @NameInMap("publishedGateway")
    public UpdateApiRequestPublishedGateway publishedGateway;

    // status
    @NameInMap("status")
    public String status;

    // updateDateTime
    @NameInMap("updateDateTime")
    public String updateDateTime;

    public static UpdateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiRequest self = new UpdateApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdateApiRequest setAttachedServices(java.util.List<UpdateApiRequestAttachedServices> attachedServices) {
        this.attachedServices = attachedServices;
        return this;
    }
    public java.util.List<UpdateApiRequestAttachedServices> getAttachedServices() {
        return this.attachedServices;
    }

    public UpdateApiRequest setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }
    public String getBasePath() {
        return this.basePath;
    }

    public UpdateApiRequest setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    public UpdateApiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApiRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateApiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateApiRequest setOwneredPolicies(java.util.List<UpdateApiRequestOwneredPolicies> owneredPolicies) {
        this.owneredPolicies = owneredPolicies;
        return this;
    }
    public java.util.List<UpdateApiRequestOwneredPolicies> getOwneredPolicies() {
        return this.owneredPolicies;
    }

    public UpdateApiRequest setPublishedGateway(UpdateApiRequestPublishedGateway publishedGateway) {
        this.publishedGateway = publishedGateway;
        return this;
    }
    public UpdateApiRequestPublishedGateway getPublishedGateway() {
        return this.publishedGateway;
    }

    public UpdateApiRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateApiRequest setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
        return this;
    }
    public String getUpdateDateTime() {
        return this.updateDateTime;
    }

    public static class UpdateApiRequestAttachedServicesServiceEnds extends TeaModel {
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

        public static UpdateApiRequestAttachedServicesServiceEnds build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestAttachedServicesServiceEnds self = new UpdateApiRequestAttachedServicesServiceEnds();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestAttachedServicesServiceEnds setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestAttachedServicesServiceEnds setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestAttachedServicesServiceEnds setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public UpdateApiRequestAttachedServicesServiceEnds setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public UpdateApiRequestAttachedServicesServiceEnds setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public UpdateApiRequestAttachedServicesServiceEnds setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public UpdateApiRequestAttachedServicesServiceEnds setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class UpdateApiRequestAttachedServices extends TeaModel {
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
        public java.util.List<UpdateApiRequestAttachedServicesServiceEnds> serviceEnds;

        // serviceNameInRegistry
        @NameInMap("serviceNameInRegistry")
        public String serviceNameInRegistry;

        // sourceType
        @NameInMap("sourceType")
        public Long sourceType;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static UpdateApiRequestAttachedServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestAttachedServices self = new UpdateApiRequestAttachedServices();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestAttachedServices setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public UpdateApiRequestAttachedServices setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestAttachedServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApiRequestAttachedServices setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestAttachedServices setIsAutoRefresh(Boolean isAutoRefresh) {
            this.isAutoRefresh = isAutoRefresh;
            return this;
        }
        public Boolean getIsAutoRefresh() {
            return this.isAutoRefresh;
        }

        public UpdateApiRequestAttachedServices setIsHealth(Boolean isHealth) {
            this.isHealth = isHealth;
            return this;
        }
        public Boolean getIsHealth() {
            return this.isHealth;
        }

        public UpdateApiRequestAttachedServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApiRequestAttachedServices setRegistryId(String registryId) {
            this.registryId = registryId;
            return this;
        }
        public String getRegistryId() {
            return this.registryId;
        }

        public UpdateApiRequestAttachedServices setServiceEnds(java.util.List<UpdateApiRequestAttachedServicesServiceEnds> serviceEnds) {
            this.serviceEnds = serviceEnds;
            return this;
        }
        public java.util.List<UpdateApiRequestAttachedServicesServiceEnds> getServiceEnds() {
            return this.serviceEnds;
        }

        public UpdateApiRequestAttachedServices setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public UpdateApiRequestAttachedServices setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

        public UpdateApiRequestAttachedServices setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class UpdateApiRequestOwneredPolicies extends TeaModel {
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

        public static UpdateApiRequestOwneredPolicies build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestOwneredPolicies self = new UpdateApiRequestOwneredPolicies();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestOwneredPolicies setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public UpdateApiRequestOwneredPolicies setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public UpdateApiRequestOwneredPolicies setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestOwneredPolicies setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public UpdateApiRequestOwneredPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestOwneredPolicies setPolicyAliasName(String policyAliasName) {
            this.policyAliasName = policyAliasName;
            return this;
        }
        public String getPolicyAliasName() {
            return this.policyAliasName;
        }

        public UpdateApiRequestOwneredPolicies setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public UpdateApiRequestOwneredPolicies setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public UpdateApiRequestOwneredPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public UpdateApiRequestOwneredPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public UpdateApiRequestOwneredPolicies setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public UpdateApiRequestOwneredPolicies setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public UpdateApiRequestOwneredPolicies setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public UpdateApiRequestOwneredPolicies setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public UpdateApiRequestOwneredPolicies setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class UpdateApiRequestPublishedGateway extends TeaModel {
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

        public static UpdateApiRequestPublishedGateway build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiRequestPublishedGateway self = new UpdateApiRequestPublishedGateway();
            return TeaModel.build(map, self);
        }

        public UpdateApiRequestPublishedGateway setArmsInfo(String armsInfo) {
            this.armsInfo = armsInfo;
            return this;
        }
        public String getArmsInfo() {
            return this.armsInfo;
        }

        public UpdateApiRequestPublishedGateway setAutoCreateSlb(Boolean autoCreateSlb) {
            this.autoCreateSlb = autoCreateSlb;
            return this;
        }
        public Boolean getAutoCreateSlb() {
            return this.autoCreateSlb;
        }

        public UpdateApiRequestPublishedGateway setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public UpdateApiRequestPublishedGateway setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public UpdateApiRequestPublishedGateway setEdasNamespaceId(String edasNamespaceId) {
            this.edasNamespaceId = edasNamespaceId;
            return this;
        }
        public String getEdasNamespaceId() {
            return this.edasNamespaceId;
        }

        public UpdateApiRequestPublishedGateway setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public UpdateApiRequestPublishedGateway setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateApiRequestPublishedGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApiRequestPublishedGateway setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public UpdateApiRequestPublishedGateway setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateApiRequestPublishedGateway setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public UpdateApiRequestPublishedGateway setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public UpdateApiRequestPublishedGateway setRuntimeOn(String runtimeOn) {
            this.runtimeOn = runtimeOn;
            return this;
        }
        public String getRuntimeOn() {
            return this.runtimeOn;
        }

        public UpdateApiRequestPublishedGateway setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public UpdateApiRequestPublishedGateway setSlb(String slb) {
            this.slb = slb;
            return this;
        }
        public String getSlb() {
            return this.slb;
        }

        public UpdateApiRequestPublishedGateway setSlbAccessAddr(String slbAccessAddr) {
            this.slbAccessAddr = slbAccessAddr;
            return this;
        }
        public String getSlbAccessAddr() {
            return this.slbAccessAddr;
        }

        public UpdateApiRequestPublishedGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateApiRequestPublishedGateway setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public UpdateApiRequestPublishedGateway setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

}
