// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class Elasticsearch extends TeaModel {
    @NameInMap("advancedDedicateMaster")
    public Boolean advancedDedicateMaster;

    @NameInMap("advancedSetting")
    public ElasticsearchAdvancedSetting advancedSetting;

    @NameInMap("aliwsDicts")
    public java.util.List<DictInfo> aliwsDicts;

    @NameInMap("clientNodeConfiguration")
    public ClientNodeConfiguration clientNodeConfiguration;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("dataNode")
    public Boolean dataNode;

    @NameInMap("dedicateMaster")
    public Boolean dedicateMaster;

    @NameInMap("description")
    public String description;

    @NameInMap("dictList")
    public java.util.List<DictInfo> dictList;

    @NameInMap("domain")
    public String domain;

    @NameInMap("elasticDataNodeConfiguration")
    public ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    @NameInMap("enableKibanaPrivateNetwork")
    public Boolean enableKibanaPrivateNetwork;

    @NameInMap("enableKibanaPublicNetwork")
    public Boolean enableKibanaPublicNetwork;

    @NameInMap("enablePublic")
    public Boolean enablePublic;

    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("esConfig")
    public java.util.Map<String, String> esConfig;

    @NameInMap("esIPWhitelist")
    public java.util.List<String> esIPWhitelist;

    @NameInMap("esVersion")
    public String esVersion;

    @NameInMap("extendConfigs")
    public java.util.List<java.util.Map<String, ?>> extendConfigs;

    @NameInMap("haveClientNode")
    public Boolean haveClientNode;

    @NameInMap("haveElasticDataNode")
    public Boolean haveElasticDataNode;

    @NameInMap("haveKibana")
    public Boolean haveKibana;

    @NameInMap("ikHotDicts")
    public java.util.List<DictInfo> ikHotDicts;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("kibanaConfiguration")
    public KibanaNodeConfiguration kibanaConfiguration;

    @NameInMap("kibanaDomain")
    public String kibanaDomain;

    @NameInMap("kibanaIPWhitelist")
    public java.util.List<String> kibanaIPWhitelist;

    @NameInMap("kibanaPort")
    public Long kibanaPort;

    @NameInMap("kibanaPrivateDomain")
    public String kibanaPrivateDomain;

    @NameInMap("kibanaPrivateIPWhitelist")
    public java.util.List<String> kibanaPrivateIPWhitelist;

    @NameInMap("kibanaPrivatePort")
    public Long kibanaPrivatePort;

    @NameInMap("kibanaProtocol")
    public String kibanaProtocol;

    @NameInMap("masterConfiguration")
    public MasterNodeConfiguration masterConfiguration;

    @NameInMap("networkConfig")
    public NetworkConfig networkConfig;

    @NameInMap("nodeAmount")
    public Long nodeAmount;

    @NameInMap("nodeSpec")
    public NodeSpec nodeSpec;

    @NameInMap("paymentType")
    public String paymentType;

    @NameInMap("port")
    public Long port;

    @NameInMap("privateNetworkIpWhiteList")
    public java.util.List<String> privateNetworkIpWhiteList;

    @NameInMap("productType")
    public String productType;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("publicDomain")
    public String publicDomain;

    @NameInMap("publicIpWhitelist")
    public java.util.List<String> publicIpWhitelist;

    @NameInMap("publicPort")
    public Long publicPort;

    @NameInMap("readWritePolicy")
    public ReadWritePolicy readWritePolicy;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("serviceVpc")
    public Boolean serviceVpc;

    @NameInMap("status")
    public String status;

    @NameInMap("synonymsDicts")
    public java.util.List<DictInfo> synonymsDicts;

    @NameInMap("tags")
    public java.util.List<Tag> tags;

    @NameInMap("updatedAt")
    public String updatedAt;

    @NameInMap("warmNode")
    public Boolean warmNode;

    @NameInMap("warmNodeConfiguration")
    public WarmNodeConfiguration warmNodeConfiguration;

    @NameInMap("zoneCount")
    public Long zoneCount;

    @NameInMap("zoneInfos")
    public java.util.List<ZoneInfo> zoneInfos;

    public static Elasticsearch build(java.util.Map<String, ?> map) throws Exception {
        Elasticsearch self = new Elasticsearch();
        return TeaModel.build(map, self);
    }

    public Elasticsearch setAdvancedDedicateMaster(Boolean advancedDedicateMaster) {
        this.advancedDedicateMaster = advancedDedicateMaster;
        return this;
    }
    public Boolean getAdvancedDedicateMaster() {
        return this.advancedDedicateMaster;
    }

    public Elasticsearch setAdvancedSetting(ElasticsearchAdvancedSetting advancedSetting) {
        this.advancedSetting = advancedSetting;
        return this;
    }
    public ElasticsearchAdvancedSetting getAdvancedSetting() {
        return this.advancedSetting;
    }

    public Elasticsearch setAliwsDicts(java.util.List<DictInfo> aliwsDicts) {
        this.aliwsDicts = aliwsDicts;
        return this;
    }
    public java.util.List<DictInfo> getAliwsDicts() {
        return this.aliwsDicts;
    }

    public Elasticsearch setClientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
        this.clientNodeConfiguration = clientNodeConfiguration;
        return this;
    }
    public ClientNodeConfiguration getClientNodeConfiguration() {
        return this.clientNodeConfiguration;
    }

    public Elasticsearch setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Elasticsearch setDataNode(Boolean dataNode) {
        this.dataNode = dataNode;
        return this;
    }
    public Boolean getDataNode() {
        return this.dataNode;
    }

    public Elasticsearch setDedicateMaster(Boolean dedicateMaster) {
        this.dedicateMaster = dedicateMaster;
        return this;
    }
    public Boolean getDedicateMaster() {
        return this.dedicateMaster;
    }

    public Elasticsearch setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Elasticsearch setDictList(java.util.List<DictInfo> dictList) {
        this.dictList = dictList;
        return this;
    }
    public java.util.List<DictInfo> getDictList() {
        return this.dictList;
    }

    public Elasticsearch setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public Elasticsearch setElasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
        this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
        return this;
    }
    public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
        return this.elasticDataNodeConfiguration;
    }

    public Elasticsearch setEnableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
        this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
        return this;
    }
    public Boolean getEnableKibanaPrivateNetwork() {
        return this.enableKibanaPrivateNetwork;
    }

    public Elasticsearch setEnableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
        this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
        return this;
    }
    public Boolean getEnableKibanaPublicNetwork() {
        return this.enableKibanaPublicNetwork;
    }

    public Elasticsearch setEnablePublic(Boolean enablePublic) {
        this.enablePublic = enablePublic;
        return this;
    }
    public Boolean getEnablePublic() {
        return this.enablePublic;
    }

    public Elasticsearch setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public Elasticsearch setEsConfig(java.util.Map<String, String> esConfig) {
        this.esConfig = esConfig;
        return this;
    }
    public java.util.Map<String, String> getEsConfig() {
        return this.esConfig;
    }

    public Elasticsearch setEsIPWhitelist(java.util.List<String> esIPWhitelist) {
        this.esIPWhitelist = esIPWhitelist;
        return this;
    }
    public java.util.List<String> getEsIPWhitelist() {
        return this.esIPWhitelist;
    }

    public Elasticsearch setEsVersion(String esVersion) {
        this.esVersion = esVersion;
        return this;
    }
    public String getEsVersion() {
        return this.esVersion;
    }

    public Elasticsearch setExtendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
        this.extendConfigs = extendConfigs;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
        return this.extendConfigs;
    }

    public Elasticsearch setHaveClientNode(Boolean haveClientNode) {
        this.haveClientNode = haveClientNode;
        return this;
    }
    public Boolean getHaveClientNode() {
        return this.haveClientNode;
    }

    public Elasticsearch setHaveElasticDataNode(Boolean haveElasticDataNode) {
        this.haveElasticDataNode = haveElasticDataNode;
        return this;
    }
    public Boolean getHaveElasticDataNode() {
        return this.haveElasticDataNode;
    }

    public Elasticsearch setHaveKibana(Boolean haveKibana) {
        this.haveKibana = haveKibana;
        return this;
    }
    public Boolean getHaveKibana() {
        return this.haveKibana;
    }

    public Elasticsearch setIkHotDicts(java.util.List<DictInfo> ikHotDicts) {
        this.ikHotDicts = ikHotDicts;
        return this;
    }
    public java.util.List<DictInfo> getIkHotDicts() {
        return this.ikHotDicts;
    }

    public Elasticsearch setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Elasticsearch setKibanaConfiguration(KibanaNodeConfiguration kibanaConfiguration) {
        this.kibanaConfiguration = kibanaConfiguration;
        return this;
    }
    public KibanaNodeConfiguration getKibanaConfiguration() {
        return this.kibanaConfiguration;
    }

    public Elasticsearch setKibanaDomain(String kibanaDomain) {
        this.kibanaDomain = kibanaDomain;
        return this;
    }
    public String getKibanaDomain() {
        return this.kibanaDomain;
    }

    public Elasticsearch setKibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
        this.kibanaIPWhitelist = kibanaIPWhitelist;
        return this;
    }
    public java.util.List<String> getKibanaIPWhitelist() {
        return this.kibanaIPWhitelist;
    }

    public Elasticsearch setKibanaPort(Long kibanaPort) {
        this.kibanaPort = kibanaPort;
        return this;
    }
    public Long getKibanaPort() {
        return this.kibanaPort;
    }

    public Elasticsearch setKibanaPrivateDomain(String kibanaPrivateDomain) {
        this.kibanaPrivateDomain = kibanaPrivateDomain;
        return this;
    }
    public String getKibanaPrivateDomain() {
        return this.kibanaPrivateDomain;
    }

    public Elasticsearch setKibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
        this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
        return this;
    }
    public java.util.List<String> getKibanaPrivateIPWhitelist() {
        return this.kibanaPrivateIPWhitelist;
    }

    public Elasticsearch setKibanaPrivatePort(Long kibanaPrivatePort) {
        this.kibanaPrivatePort = kibanaPrivatePort;
        return this;
    }
    public Long getKibanaPrivatePort() {
        return this.kibanaPrivatePort;
    }

    public Elasticsearch setKibanaProtocol(String kibanaProtocol) {
        this.kibanaProtocol = kibanaProtocol;
        return this;
    }
    public String getKibanaProtocol() {
        return this.kibanaProtocol;
    }

    public Elasticsearch setMasterConfiguration(MasterNodeConfiguration masterConfiguration) {
        this.masterConfiguration = masterConfiguration;
        return this;
    }
    public MasterNodeConfiguration getMasterConfiguration() {
        return this.masterConfiguration;
    }

    public Elasticsearch setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public Elasticsearch setNodeAmount(Long nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }
    public Long getNodeAmount() {
        return this.nodeAmount;
    }

    public Elasticsearch setNodeSpec(NodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }
    public NodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    public Elasticsearch setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public Elasticsearch setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public Elasticsearch setPrivateNetworkIpWhiteList(java.util.List<String> privateNetworkIpWhiteList) {
        this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
        return this;
    }
    public java.util.List<String> getPrivateNetworkIpWhiteList() {
        return this.privateNetworkIpWhiteList;
    }

    public Elasticsearch setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public Elasticsearch setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public Elasticsearch setPublicDomain(String publicDomain) {
        this.publicDomain = publicDomain;
        return this;
    }
    public String getPublicDomain() {
        return this.publicDomain;
    }

    public Elasticsearch setPublicIpWhitelist(java.util.List<String> publicIpWhitelist) {
        this.publicIpWhitelist = publicIpWhitelist;
        return this;
    }
    public java.util.List<String> getPublicIpWhitelist() {
        return this.publicIpWhitelist;
    }

    public Elasticsearch setPublicPort(Long publicPort) {
        this.publicPort = publicPort;
        return this;
    }
    public Long getPublicPort() {
        return this.publicPort;
    }

    public Elasticsearch setReadWritePolicy(ReadWritePolicy readWritePolicy) {
        this.readWritePolicy = readWritePolicy;
        return this;
    }
    public ReadWritePolicy getReadWritePolicy() {
        return this.readWritePolicy;
    }

    public Elasticsearch setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Elasticsearch setServiceVpc(Boolean serviceVpc) {
        this.serviceVpc = serviceVpc;
        return this;
    }
    public Boolean getServiceVpc() {
        return this.serviceVpc;
    }

    public Elasticsearch setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Elasticsearch setSynonymsDicts(java.util.List<DictInfo> synonymsDicts) {
        this.synonymsDicts = synonymsDicts;
        return this;
    }
    public java.util.List<DictInfo> getSynonymsDicts() {
        return this.synonymsDicts;
    }

    public Elasticsearch setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public Elasticsearch setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public Elasticsearch setWarmNode(Boolean warmNode) {
        this.warmNode = warmNode;
        return this;
    }
    public Boolean getWarmNode() {
        return this.warmNode;
    }

    public Elasticsearch setWarmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
        this.warmNodeConfiguration = warmNodeConfiguration;
        return this;
    }
    public WarmNodeConfiguration getWarmNodeConfiguration() {
        return this.warmNodeConfiguration;
    }

    public Elasticsearch setZoneCount(Long zoneCount) {
        this.zoneCount = zoneCount;
        return this;
    }
    public Long getZoneCount() {
        return this.zoneCount;
    }

    public Elasticsearch setZoneInfos(java.util.List<ZoneInfo> zoneInfos) {
        this.zoneInfos = zoneInfos;
        return this;
    }
    public java.util.List<ZoneInfo> getZoneInfos() {
        return this.zoneInfos;
    }

    public static class ElasticsearchAdvancedSetting extends TeaModel {
        @NameInMap("gcName")
        public String gcName;

        public static ElasticsearchAdvancedSetting build(java.util.Map<String, ?> map) throws Exception {
            ElasticsearchAdvancedSetting self = new ElasticsearchAdvancedSetting();
            return TeaModel.build(map, self);
        }

        public ElasticsearchAdvancedSetting setGcName(String gcName) {
            this.gcName = gcName;
            return this;
        }
        public String getGcName() {
            return this.gcName;
        }

    }

}
