// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("clientNodeConfiguration")
    public ClientNodeConfiguration clientNodeConfiguration;

    /**
     * <strong>example:</strong>
     * <p>es</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("elasticDataNodeConfiguration")
    public ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>es_password</p>
     */
    @NameInMap("esAdminPassword")
    public String esAdminPassword;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.5.3_with_X-Pack</p>
     */
    @NameInMap("esVersion")
    public String esVersion;

    /**
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("instanceCategory")
    public String instanceCategory;

    @NameInMap("kibanaConfiguration")
    public KibanaNodeConfiguration kibanaConfiguration;

    @NameInMap("masterConfiguration")
    public MasterNodeConfiguration masterConfiguration;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("networkConfig")
    public NetworkConfig networkConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("nodeAmount")
    public Integer nodeAmount;

    @NameInMap("nodeSpec")
    public NodeSpec nodeSpec;

    @NameInMap("paymentInfo")
    public PaymentInfo paymentInfo;

    /**
     * <strong>example:</strong>
     * <p>postpaid</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>rg-aekzu7tsu4nem4q</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<CreateInstanceRequestTags> tags;

    @NameInMap("warmNodeConfiguration")
    public WarmNodeConfiguration warmNodeConfiguration;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("zoneCount")
    public Integer zoneCount;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setClientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
        this.clientNodeConfiguration = clientNodeConfiguration;
        return this;
    }
    public ClientNodeConfiguration getClientNodeConfiguration() {
        return this.clientNodeConfiguration;
    }

    public CreateInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateInstanceRequest setElasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
        this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
        return this;
    }
    public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
        return this.elasticDataNodeConfiguration;
    }

    public CreateInstanceRequest setEsAdminPassword(String esAdminPassword) {
        this.esAdminPassword = esAdminPassword;
        return this;
    }
    public String getEsAdminPassword() {
        return this.esAdminPassword;
    }

    public CreateInstanceRequest setEsVersion(String esVersion) {
        this.esVersion = esVersion;
        return this;
    }
    public String getEsVersion() {
        return this.esVersion;
    }

    public CreateInstanceRequest setInstanceCategory(String instanceCategory) {
        this.instanceCategory = instanceCategory;
        return this;
    }
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    public CreateInstanceRequest setKibanaConfiguration(KibanaNodeConfiguration kibanaConfiguration) {
        this.kibanaConfiguration = kibanaConfiguration;
        return this;
    }
    public KibanaNodeConfiguration getKibanaConfiguration() {
        return this.kibanaConfiguration;
    }

    public CreateInstanceRequest setMasterConfiguration(MasterNodeConfiguration masterConfiguration) {
        this.masterConfiguration = masterConfiguration;
        return this;
    }
    public MasterNodeConfiguration getMasterConfiguration() {
        return this.masterConfiguration;
    }

    public CreateInstanceRequest setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public CreateInstanceRequest setNodeAmount(Integer nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }
    public Integer getNodeAmount() {
        return this.nodeAmount;
    }

    public CreateInstanceRequest setNodeSpec(NodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }
    public NodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    public CreateInstanceRequest setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }
    public PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public CreateInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setTags(java.util.List<CreateInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateInstanceRequestTags> getTags() {
        return this.tags;
    }

    public CreateInstanceRequest setWarmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
        this.warmNodeConfiguration = warmNodeConfiguration;
        return this;
    }
    public WarmNodeConfiguration getWarmNodeConfiguration() {
        return this.warmNodeConfiguration;
    }

    public CreateInstanceRequest setZoneCount(Integer zoneCount) {
        this.zoneCount = zoneCount;
        return this;
    }
    public Integer getZoneCount() {
        return this.zoneCount;
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateInstanceRequestTags extends TeaModel {
        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValue")
        public String tagValue;

        public static CreateInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTags self = new CreateInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public CreateInstanceRequestTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
