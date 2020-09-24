// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetApiDetailResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.List<GetApiDetailResponseBodyData> data;

    // message
    @NameInMap("message")
    public String message;

    public static GetApiDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiDetailResponseBody self = new GetApiDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetApiDetailResponseBody setData(java.util.List<GetApiDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetApiDetailResponseBodyData> getData() {
        return this.data;
    }

    public GetApiDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetApiDetailResponseBodyDataAttachedServicesServiceEnds extends TeaModel {
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

        public static GetApiDetailResponseBodyDataAttachedServicesServiceEnds build(java.util.Map<String, ?> map) throws Exception {
            GetApiDetailResponseBodyDataAttachedServicesServiceEnds self = new GetApiDetailResponseBodyDataAttachedServicesServiceEnds();
            return TeaModel.build(map, self);
        }

        public GetApiDetailResponseBodyDataAttachedServicesServiceEnds setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetApiDetailResponseBodyDataAttachedServicesServiceEnds setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetApiDetailResponseBodyDataAttachedServicesServiceEnds setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetApiDetailResponseBodyDataAttachedServicesServiceEnds setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetApiDetailResponseBodyDataAttachedServicesServiceEnds setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetApiDetailResponseBodyDataAttachedServicesServiceEnds setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetApiDetailResponseBodyDataAttachedServicesServiceEnds setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class GetApiDetailResponseBodyDataAttachedServices extends TeaModel {
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
        public java.util.List<GetApiDetailResponseBodyDataAttachedServicesServiceEnds> serviceEnds;

        // serviceNameInRegistry
        @NameInMap("serviceNameInRegistry")
        public String serviceNameInRegistry;

        // sourceType
        @NameInMap("sourceType")
        public Long sourceType;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static GetApiDetailResponseBodyDataAttachedServices build(java.util.Map<String, ?> map) throws Exception {
            GetApiDetailResponseBodyDataAttachedServices self = new GetApiDetailResponseBodyDataAttachedServices();
            return TeaModel.build(map, self);
        }

        public GetApiDetailResponseBodyDataAttachedServices setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public GetApiDetailResponseBodyDataAttachedServices setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetApiDetailResponseBodyDataAttachedServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiDetailResponseBodyDataAttachedServices setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetApiDetailResponseBodyDataAttachedServices setIsAutoRefresh(Boolean isAutoRefresh) {
            this.isAutoRefresh = isAutoRefresh;
            return this;
        }
        public Boolean getIsAutoRefresh() {
            return this.isAutoRefresh;
        }

        public GetApiDetailResponseBodyDataAttachedServices setIsHealth(Boolean isHealth) {
            this.isHealth = isHealth;
            return this;
        }
        public Boolean getIsHealth() {
            return this.isHealth;
        }

        public GetApiDetailResponseBodyDataAttachedServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApiDetailResponseBodyDataAttachedServices setRegistryId(String registryId) {
            this.registryId = registryId;
            return this;
        }
        public String getRegistryId() {
            return this.registryId;
        }

        public GetApiDetailResponseBodyDataAttachedServices setServiceEnds(java.util.List<GetApiDetailResponseBodyDataAttachedServicesServiceEnds> serviceEnds) {
            this.serviceEnds = serviceEnds;
            return this;
        }
        public java.util.List<GetApiDetailResponseBodyDataAttachedServicesServiceEnds> getServiceEnds() {
            return this.serviceEnds;
        }

        public GetApiDetailResponseBodyDataAttachedServices setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public GetApiDetailResponseBodyDataAttachedServices setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

        public GetApiDetailResponseBodyDataAttachedServices setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class GetApiDetailResponseBodyDataOwneredPolicies extends TeaModel {
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

        public static GetApiDetailResponseBodyDataOwneredPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetApiDetailResponseBodyDataOwneredPolicies self = new GetApiDetailResponseBodyDataOwneredPolicies();
            return TeaModel.build(map, self);
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setPolicyAliasName(String policyAliasName) {
            this.policyAliasName = policyAliasName;
            return this;
        }
        public String getPolicyAliasName() {
            return this.policyAliasName;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public GetApiDetailResponseBodyDataOwneredPolicies setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class GetApiDetailResponseBodyDataPublishedGateway extends TeaModel {
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

        public static GetApiDetailResponseBodyDataPublishedGateway build(java.util.Map<String, ?> map) throws Exception {
            GetApiDetailResponseBodyDataPublishedGateway self = new GetApiDetailResponseBodyDataPublishedGateway();
            return TeaModel.build(map, self);
        }

        public GetApiDetailResponseBodyDataPublishedGateway setArmsInfo(String armsInfo) {
            this.armsInfo = armsInfo;
            return this;
        }
        public String getArmsInfo() {
            return this.armsInfo;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setAutoCreateSlb(Boolean autoCreateSlb) {
            this.autoCreateSlb = autoCreateSlb;
            return this;
        }
        public Boolean getAutoCreateSlb() {
            return this.autoCreateSlb;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setEdasNamespaceId(String edasNamespaceId) {
            this.edasNamespaceId = edasNamespaceId;
            return this;
        }
        public String getEdasNamespaceId() {
            return this.edasNamespaceId;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setRuntimeOn(String runtimeOn) {
            this.runtimeOn = runtimeOn;
            return this;
        }
        public String getRuntimeOn() {
            return this.runtimeOn;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setSlb(String slb) {
            this.slb = slb;
            return this;
        }
        public String getSlb() {
            return this.slb;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setSlbAccessAddr(String slbAccessAddr) {
            this.slbAccessAddr = slbAccessAddr;
            return this;
        }
        public String getSlbAccessAddr() {
            return this.slbAccessAddr;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public GetApiDetailResponseBodyDataPublishedGateway setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

    public static class GetApiDetailResponseBodyData extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // attachedServices
        @NameInMap("attachedServices")
        public java.util.List<GetApiDetailResponseBodyDataAttachedServices> attachedServices;

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
        public java.util.List<GetApiDetailResponseBodyDataOwneredPolicies> owneredPolicies;

        // A short description of struct
        @NameInMap("publishedGateway")
        public GetApiDetailResponseBodyDataPublishedGateway publishedGateway;

        // status
        @NameInMap("status")
        public String status;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static GetApiDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApiDetailResponseBodyData self = new GetApiDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApiDetailResponseBodyData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public GetApiDetailResponseBodyData setAttachedServices(java.util.List<GetApiDetailResponseBodyDataAttachedServices> attachedServices) {
            this.attachedServices = attachedServices;
            return this;
        }
        public java.util.List<GetApiDetailResponseBodyDataAttachedServices> getAttachedServices() {
            return this.attachedServices;
        }

        public GetApiDetailResponseBodyData setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public GetApiDetailResponseBodyData setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetApiDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetApiDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApiDetailResponseBodyData setOwneredPolicies(java.util.List<GetApiDetailResponseBodyDataOwneredPolicies> owneredPolicies) {
            this.owneredPolicies = owneredPolicies;
            return this;
        }
        public java.util.List<GetApiDetailResponseBodyDataOwneredPolicies> getOwneredPolicies() {
            return this.owneredPolicies;
        }

        public GetApiDetailResponseBodyData setPublishedGateway(GetApiDetailResponseBodyDataPublishedGateway publishedGateway) {
            this.publishedGateway = publishedGateway;
            return this;
        }
        public GetApiDetailResponseBodyDataPublishedGateway getPublishedGateway() {
            return this.publishedGateway;
        }

        public GetApiDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApiDetailResponseBodyData setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

}
