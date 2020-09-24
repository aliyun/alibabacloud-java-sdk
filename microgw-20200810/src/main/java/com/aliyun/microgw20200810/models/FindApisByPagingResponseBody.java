// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindApisByPagingResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public FindApisByPagingResponseBodyData data;

    // message
    @NameInMap("message")
    public String message;

    public static FindApisByPagingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindApisByPagingResponseBody self = new FindApisByPagingResponseBody();
        return TeaModel.build(map, self);
    }

    public FindApisByPagingResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public FindApisByPagingResponseBody setData(FindApisByPagingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindApisByPagingResponseBodyData getData() {
        return this.data;
    }

    public FindApisByPagingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds extends TeaModel {
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

        public static FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds build(java.util.Map<String, ?> map) throws Exception {
            FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds self = new FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds();
            return TeaModel.build(map, self);
        }

        public FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class FindApisByPagingResponseBodyDataListAttachedServices extends TeaModel {
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
        public java.util.List<FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds> serviceEnds;

        // serviceNameInRegistry
        @NameInMap("serviceNameInRegistry")
        public String serviceNameInRegistry;

        // sourceType
        @NameInMap("sourceType")
        public Long sourceType;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static FindApisByPagingResponseBodyDataListAttachedServices build(java.util.Map<String, ?> map) throws Exception {
            FindApisByPagingResponseBodyDataListAttachedServices self = new FindApisByPagingResponseBodyDataListAttachedServices();
            return TeaModel.build(map, self);
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setIsAutoRefresh(Boolean isAutoRefresh) {
            this.isAutoRefresh = isAutoRefresh;
            return this;
        }
        public Boolean getIsAutoRefresh() {
            return this.isAutoRefresh;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setIsHealth(Boolean isHealth) {
            this.isHealth = isHealth;
            return this;
        }
        public Boolean getIsHealth() {
            return this.isHealth;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setRegistryId(String registryId) {
            this.registryId = registryId;
            return this;
        }
        public String getRegistryId() {
            return this.registryId;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setServiceEnds(java.util.List<FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds> serviceEnds) {
            this.serviceEnds = serviceEnds;
            return this;
        }
        public java.util.List<FindApisByPagingResponseBodyDataListAttachedServicesServiceEnds> getServiceEnds() {
            return this.serviceEnds;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setServiceNameInRegistry(String serviceNameInRegistry) {
            this.serviceNameInRegistry = serviceNameInRegistry;
            return this;
        }
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setSourceType(Long sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public Long getSourceType() {
            return this.sourceType;
        }

        public FindApisByPagingResponseBodyDataListAttachedServices setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class FindApisByPagingResponseBodyDataListOwneredPolicies extends TeaModel {
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

        public static FindApisByPagingResponseBodyDataListOwneredPolicies build(java.util.Map<String, ?> map) throws Exception {
            FindApisByPagingResponseBodyDataListOwneredPolicies self = new FindApisByPagingResponseBodyDataListOwneredPolicies();
            return TeaModel.build(map, self);
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setPolicyAliasName(String policyAliasName) {
            this.policyAliasName = policyAliasName;
            return this;
        }
        public String getPolicyAliasName() {
            return this.policyAliasName;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public FindApisByPagingResponseBodyDataListOwneredPolicies setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class FindApisByPagingResponseBodyDataListPublishedGateway extends TeaModel {
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

        public static FindApisByPagingResponseBodyDataListPublishedGateway build(java.util.Map<String, ?> map) throws Exception {
            FindApisByPagingResponseBodyDataListPublishedGateway self = new FindApisByPagingResponseBodyDataListPublishedGateway();
            return TeaModel.build(map, self);
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setArmsInfo(String armsInfo) {
            this.armsInfo = armsInfo;
            return this;
        }
        public String getArmsInfo() {
            return this.armsInfo;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setAutoCreateSlb(Boolean autoCreateSlb) {
            this.autoCreateSlb = autoCreateSlb;
            return this;
        }
        public Boolean getAutoCreateSlb() {
            return this.autoCreateSlb;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setEdasNamespaceId(String edasNamespaceId) {
            this.edasNamespaceId = edasNamespaceId;
            return this;
        }
        public String getEdasNamespaceId() {
            return this.edasNamespaceId;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setRuntimeOn(String runtimeOn) {
            this.runtimeOn = runtimeOn;
            return this;
        }
        public String getRuntimeOn() {
            return this.runtimeOn;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setSlb(String slb) {
            this.slb = slb;
            return this;
        }
        public String getSlb() {
            return this.slb;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setSlbAccessAddr(String slbAccessAddr) {
            this.slbAccessAddr = slbAccessAddr;
            return this;
        }
        public String getSlbAccessAddr() {
            return this.slbAccessAddr;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public FindApisByPagingResponseBodyDataListPublishedGateway setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

    }

    public static class FindApisByPagingResponseBodyDataList extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // attachedServices
        @NameInMap("attachedServices")
        public java.util.List<FindApisByPagingResponseBodyDataListAttachedServices> attachedServices;

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
        public java.util.List<FindApisByPagingResponseBodyDataListOwneredPolicies> owneredPolicies;

        // A short description of struct
        @NameInMap("publishedGateway")
        public FindApisByPagingResponseBodyDataListPublishedGateway publishedGateway;

        // status
        @NameInMap("status")
        public String status;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static FindApisByPagingResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            FindApisByPagingResponseBodyDataList self = new FindApisByPagingResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public FindApisByPagingResponseBodyDataList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public FindApisByPagingResponseBodyDataList setAttachedServices(java.util.List<FindApisByPagingResponseBodyDataListAttachedServices> attachedServices) {
            this.attachedServices = attachedServices;
            return this;
        }
        public java.util.List<FindApisByPagingResponseBodyDataListAttachedServices> getAttachedServices() {
            return this.attachedServices;
        }

        public FindApisByPagingResponseBodyDataList setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public FindApisByPagingResponseBodyDataList setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindApisByPagingResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FindApisByPagingResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindApisByPagingResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindApisByPagingResponseBodyDataList setOwneredPolicies(java.util.List<FindApisByPagingResponseBodyDataListOwneredPolicies> owneredPolicies) {
            this.owneredPolicies = owneredPolicies;
            return this;
        }
        public java.util.List<FindApisByPagingResponseBodyDataListOwneredPolicies> getOwneredPolicies() {
            return this.owneredPolicies;
        }

        public FindApisByPagingResponseBodyDataList setPublishedGateway(FindApisByPagingResponseBodyDataListPublishedGateway publishedGateway) {
            this.publishedGateway = publishedGateway;
            return this;
        }
        public FindApisByPagingResponseBodyDataListPublishedGateway getPublishedGateway() {
            return this.publishedGateway;
        }

        public FindApisByPagingResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FindApisByPagingResponseBodyDataList setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class FindApisByPagingResponseBodyData extends TeaModel {
        // list
        @NameInMap("list")
        public java.util.List<FindApisByPagingResponseBodyDataList> list;

        // totalCount
        @NameInMap("totalCount")
        public Long totalCount;

        public static FindApisByPagingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindApisByPagingResponseBodyData self = new FindApisByPagingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindApisByPagingResponseBodyData setList(java.util.List<FindApisByPagingResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<FindApisByPagingResponseBodyDataList> getList() {
            return this.list;
        }

        public FindApisByPagingResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
