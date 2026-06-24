// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class Elasticsearch extends TeaModel {
    /**
     * <p>Indicates whether the new dedicated master node is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("advancedDedicateMaster")
    public Boolean advancedDedicateMaster;

    /**
     * <p>The advanced settings.</p>
     */
    @NameInMap("advancedSetting")
    public ElasticsearchAdvancedSetting advancedSetting;

    /**
     * <p>The Aliws dictionary configuration.</p>
     */
    @NameInMap("aliwsDicts")
    public java.util.List<DictInfo> aliwsDicts;

    /**
     * <p>The client node configuration.</p>
     */
    @NameInMap("clientNodeConfiguration")
    public ClientNodeConfiguration clientNodeConfiguration;

    /**
     * <p>The time when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07-13T03:58:07.253Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>Indicates whether the instance contains data nodes. Valid values:</p>
     * <ul>
     * <li>true: The instance contains data nodes.</li>
     * <li>false: The instance does not contain data nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dataNode")
    public Boolean dataNode;

    /**
     * <p>Indicates whether the instance contains legacy dedicated master nodes (deprecated).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("dedicateMaster")
    public Boolean dedicateMaster;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-abc</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The IK dictionary configuration.</p>
     */
    @NameInMap("dictList")
    public java.util.List<DictInfo> dictList;

    /**
     * <p>The private network access address of the Elasticsearch instance.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-3h4k3axh33th9****.elasticsearch.aliyuncs.com</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The elastic data node configuration.</p>
     */
    @NameInMap("elasticDataNodeConfiguration")
    public ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    /**
     * <p>Indicates whether private network access to Kibana is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableKibanaPrivateNetwork")
    public Boolean enableKibanaPrivateNetwork;

    /**
     * <p>Indicates whether public network access to Kibana is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableKibanaPublicNetwork")
    public Boolean enableKibanaPublicNetwork;

    /**
     * <p>Indicates whether the public network address of the instance is enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enablePublic")
    public Boolean enablePublic;

    /**
     * <p>The time when the instance expires. For pay-as-you-go instances, the default value is 100 years.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The YML file configuration of the instance.</p>
     */
    @NameInMap("esConfig")
    public java.util.Map<String, String> esConfig;

    /**
     * <p>The private network access whitelist configuration of the instance (deprecated).</p>
     */
    @NameInMap("esIPWhitelist")
    public java.util.List<String> esIPWhitelist;

    /**
     * <p>The instance version.</p>
     * 
     * <strong>example:</strong>
     * <p>6.3.2_with_X-Pack</p>
     */
    @NameInMap("esVersion")
    public String esVersion;

    /**
     * <p>The extension parameter settings of the instance.</p>
     */
    @NameInMap("extendConfigs")
    public java.util.List<java.util.Map<String, ?>> extendConfigs;

    /**
     * <p>Indicates whether client nodes are enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("haveClientNode")
    public Boolean haveClientNode;

    /**
     * <p>Indicates whether elastic data nodes are enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("haveElasticDataNode")
    public Boolean haveElasticDataNode;

    /**
     * <p>Indicates whether the instance contains Kibana nodes. Valid values:</p>
     * <ul>
     * <li>true: The instance contains Kibana nodes.</li>
     * <li>false: The instance does not contain Kibana nodes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("haveKibana")
    public Boolean haveKibana;

    /**
     * <p>The IK hot dictionary configuration.</p>
     */
    @NameInMap("ikHotDicts")
    public java.util.List<DictInfo> ikHotDicts;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-3h4k3axh33th9****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The Kibana node configuration.</p>
     */
    @NameInMap("kibanaConfiguration")
    public KibanaNodeConfiguration kibanaConfiguration;

    /**
     * <p>The public network access address of Kibana.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-3h4k3axh33th9****.kibana.elasticsearch.aliyuncs.com</p>
     */
    @NameInMap("kibanaDomain")
    public String kibanaDomain;

    /**
     * <p>The public network access whitelist configuration of Kibana.</p>
     */
    @NameInMap("kibanaIPWhitelist")
    public java.util.List<String> kibanaIPWhitelist;

    /**
     * <p>The public network access port of Kibana.</p>
     * 
     * <strong>example:</strong>
     * <p>5601</p>
     */
    @NameInMap("kibanaPort")
    public Long kibanaPort;

    /**
     * <p>The private network access address of Kibana.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-tl329rbpc0001****-kibana.internal.elasticsearch.aliyuncs.com</p>
     */
    @NameInMap("kibanaPrivateDomain")
    public String kibanaPrivateDomain;

    /**
     * <p>The IP whitelist configuration for private network access to Kibana.</p>
     */
    @NameInMap("kibanaPrivateIPWhitelist")
    public java.util.List<String> kibanaPrivateIPWhitelist;

    /**
     * <p>The private network access port of Kibana.</p>
     * 
     * <strong>example:</strong>
     * <p>5601</p>
     */
    @NameInMap("kibanaPrivatePort")
    public Long kibanaPrivatePort;

    /**
     * <p>The access protocol for Kibana. Valid values: HTTP and HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTPS</p>
     */
    @NameInMap("kibanaProtocol")
    public String kibanaProtocol;

    /**
     * <p>The dedicated master node configuration.</p>
     */
    @NameInMap("masterConfiguration")
    public MasterNodeConfiguration masterConfiguration;

    /**
     * <p>The network configuration of the instance.</p>
     */
    @NameInMap("networkConfig")
    public NetworkConfig networkConfig;

    /**
     * <p>The number of data nodes in the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nodeAmount")
    public Long nodeAmount;

    /**
     * <p>The data node configuration.</p>
     */
    @NameInMap("nodeSpec")
    public NodeSpec nodeSpec;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>prepaid: subscription.</li>
     * <li>postpaid: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>prepaid</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The private network access port of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>9200</p>
     */
    @NameInMap("port")
    public Long port;

    /**
     * <p>The private network address access whitelist configuration of the instance.</p>
     */
    @NameInMap("privateNetworkIpWhiteList")
    public java.util.List<String> privateNetworkIpWhiteList;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li>logEnhancement: Advanced Edition.</li>
     * <li>generalBusiness: general commercial edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>generalBusiness</p>
     */
    @NameInMap("productType")
    public String productType;

    /**
     * <p>The access protocol of the instance. Valid values: HTTP and HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <p>The public network access address of the Elasticsearch instance.</p>
     * 
     * <strong>example:</strong>
     * <p>es-cn-3h4k3axh33th9****.elasticsearch.aliyuncs.com</p>
     */
    @NameInMap("publicDomain")
    public String publicDomain;

    /**
     * <p>The public network access whitelist configuration of the instance.</p>
     */
    @NameInMap("publicIpWhitelist")
    public java.util.List<String> publicIpWhitelist;

    /**
     * <p>The public network access port of the Elasticsearch instance.</p>
     * 
     * <strong>example:</strong>
     * <p>9200</p>
     */
    @NameInMap("publicPort")
    public Long publicPort;

    /**
     * <p>The high availability configuration of the instance.</p>
     */
    @NameInMap("readWritePolicy")
    public ReadWritePolicy readWritePolicy;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzvowej3i****</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Indicates whether the instance is in the Elasticsearch service VPC. Valid values:</p>
     * <ul>
     * <li>true: The instance is in the service VPC.</li>
     * <li>false: The instance is not in the service VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("serviceVpc")
    public Boolean serviceVpc;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li>active: Normal.</li>
     * <li>activating: Taking effect.</li>
     * <li>inactive: Frozen.</li>
     * <li>invalid: Expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The synonym dictionary configuration of the instance.</p>
     */
    @NameInMap("synonymsDicts")
    public java.util.List<DictInfo> synonymsDicts;

    /**
     * <p>The instance tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The time when the instance was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-07-13T03:58:07.253Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <p>Indicates whether warm data nodes are enabled. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("warmNode")
    public Boolean warmNode;

    /**
     * <p>The warm data node configuration.</p>
     */
    @NameInMap("warmNodeConfiguration")
    public WarmNodeConfiguration warmNodeConfiguration;

    /**
     * <p>The number of zones for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("zoneCount")
    public Long zoneCount;

    /**
     * <p>The zone information of the instance.</p>
     */
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
        /**
         * <p>GC垃圾回收器名称。支持CMS和G1。</p>
         * 
         * <strong>example:</strong>
         * <p>CMS</p>
         */
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
