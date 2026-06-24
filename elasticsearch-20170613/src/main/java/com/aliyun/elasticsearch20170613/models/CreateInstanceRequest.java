// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>Coordinating node configuration.</p>
     */
    @NameInMap("clientNodeConfiguration")
    public ClientNodeConfiguration clientNodeConfiguration;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>es</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Elastic node configuration.</p>
     */
    @NameInMap("elasticDataNodeConfiguration")
    public ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    /**
     * <p>The access password of the instance. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters (!@#$%^&amp;*()_+-=). The password must be 8 to 32 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Es_password</p>
     */
    @NameInMap("esAdminPassword")
    public String esAdminPassword;

    /**
     * <p>The instance version. Valid values:</p>
     * <ul>
     * <li>8.5.1_with_X-Pack</li>
     * <li>7.10_with_X-Pack</li>
     * <li>6.7_with_X-Pack</li>
     * <li>7.7_with_X-Pack</li>
     * <li>6.8_with_X-Pack</li>
     * <li>6.3_with_X-Pack</li>
     * <li>5.6_with_X-Pack</li>
     * <li>5.5.3_with_X-Pack</li>
     * </ul>
     * <blockquote>
     * <p>The versions listed above may not include all versions supported by Elasticsearch instances. You can call the <a href="https://help.aliyun.com/document_detail/254099.html">GetRegionConfiguration</a> operation to view the actually supported versions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.5.3_with_X-Pack</p>
     */
    @NameInMap("esVersion")
    public String esVersion;

    /**
     * <p>The edition type:</p>
     * <ul>
     * <li>x-pack: creates a commercial edition instance, or a kernel-enhanced edition instance without Indexing Service or OpenStore enabled.</li>
     * <li>IS: creates a kernel-enhanced edition instance with Indexing Service or OpenStore enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("instanceCategory")
    public String instanceCategory;

    /**
     * <p>Kibana node configuration.</p>
     * <blockquote>
     * <p>We strongly recommend that you enable the Kibana node.</p>
     * </blockquote>
     */
    @NameInMap("kibanaConfiguration")
    public KibanaNodeConfiguration kibanaConfiguration;

    /**
     * <p>Dedicated master node configuration.</p>
     * <blockquote>
     * <p>In the Beijing, Shanghai, Hangzhou, and Shenzhen regions, when you use createInstance to create an instance with next-generation cloud disk dedicated master nodes, you must specify the instance family with the <code>.new</code> suffix, for example, elasticsearch.sn1ne.large.new.</p>
     * </blockquote>
     */
    @NameInMap("masterConfiguration")
    public MasterNodeConfiguration masterConfiguration;

    /**
     * <p>Network configuration.</p>
     * <blockquote>
     * <p>Specifying IP whitelists is not supported when creating an instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("networkConfig")
    public NetworkConfig networkConfig;

    /**
     * <p>The number of data nodes. Valid values: 2 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("nodeAmount")
    public Integer nodeAmount;

    /**
     * <p>Data node configuration.</p>
     * <blockquote>
     * <p>In the Beijing, Shanghai, Hangzhou, and Shenzhen regions, when you use createInstance to create an instance with next-generation cloud disk data nodes, you must specify the instance family with the <code>.new</code> suffix, for example, elasticsearch.sn1ne.large.new.</p>
     * </blockquote>
     */
    @NameInMap("nodeSpec")
    public NodeSpec nodeSpec;

    /**
     * <p>The billing details of the subscription instance. This parameter is required when you create a subscription instance.</p>
     */
    @NameInMap("paymentInfo")
    public PaymentInfo paymentInfo;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>postpaid: pay-as-you-go.</li>
     * <li>prepaid: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>postpaid</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzu7tsu4n****</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Instance tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreateInstanceRequestTags> tags;

    /**
     * <p>Cold data node configuration.</p>
     */
    @NameInMap("warmNodeConfiguration")
    public WarmNodeConfiguration warmNodeConfiguration;

    /**
     * <p>The number of zones for the instance. Valid values: 1, 2, and 3. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("zoneCount")
    public Integer zoneCount;

    /**
     * <p>Used to ensure the idempotency of the request. The parameter value is generated by the client and must be unique across different requests. The value cannot exceed 64 ASCII characters.</p>
     * 
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
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyTest</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyValue</p>
         */
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
