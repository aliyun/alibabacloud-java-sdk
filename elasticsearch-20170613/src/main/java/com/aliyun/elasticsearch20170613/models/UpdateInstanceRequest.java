// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The client node configuration.</p>
     */
    @NameInMap("clientNodeConfiguration")
    public ClientNodeConfiguration clientNodeConfiguration;

    /**
     * <p>The elastic node configuration.</p>
     */
    @NameInMap("elasticDataNodeConfiguration")
    public ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    /**
     * <p>The index node configuration. This parameter is supported only by AI engine instances.</p>
     */
    @NameInMap("indexNodeConfiguration")
    public IndexNodeConfiguration indexNodeConfiguration;

    /**
     * <p>The edition type. Valid values:</p>
     * <ul>
     * <li>x-pack: Commercial Edition.</li>
     * <li>advanced: Advanced Edition.</li>
     * <li>IS: Advanced Edition with Indexing Service enabled.</li>
     * <li>community: Basic Edition.<blockquote>
     * <p>To create an Advanced Edition instance with OpenStore enabled, you must also enable Indexing Service.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("instanceCategory")
    public String instanceCategory;

    /**
     * <p>The Kibana node configuration.</p>
     */
    @NameInMap("kibanaConfiguration")
    public KibanaNodeConfiguration kibanaConfiguration;

    /**
     * <p>The dedicated master node configuration.</p>
     */
    @NameInMap("masterConfiguration")
    public MasterNodeConfiguration masterConfiguration;

    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("nodeAmount")
    public Integer nodeAmount;

    /**
     * <p>The data node configuration.</p>
     */
    @NameInMap("nodeSpec")
    public NodeSpec nodeSpec;

    /**
     * <p>The search node configuration. This parameter is supported only by AI engine instances.</p>
     */
    @NameInMap("searchNodeConfiguration")
    public SearchNodeConfiguration searchNodeConfiguration;

    /**
     * <p>The update type. Valid values:</p>
     * <ul>
     * <li>normal: In-place update.</li>
     * <li>blue_green: Blue-green update.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>blue_green</p>
     */
    @NameInMap("updateType")
    public String updateType;

    /**
     * <p>The warm data node configuration.</p>
     */
    @NameInMap("warmNodeConfiguration")
    public WarmNodeConfiguration warmNodeConfiguration;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to force a restart. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("force")
    public Boolean force;

    /**
     * <p>The configuration change type. Valid values:</p>
     * <ul>
     * <li>upgrade: Upgrades the configuration. This is the default value.</li>
     * <li>downgrade: Downgrades the configuration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>upgrade</p>
     */
    @NameInMap("orderActionType")
    public String orderActionType;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setClientNodeConfiguration(ClientNodeConfiguration clientNodeConfiguration) {
        this.clientNodeConfiguration = clientNodeConfiguration;
        return this;
    }
    public ClientNodeConfiguration getClientNodeConfiguration() {
        return this.clientNodeConfiguration;
    }

    public UpdateInstanceRequest setElasticDataNodeConfiguration(ElasticDataNodeConfiguration elasticDataNodeConfiguration) {
        this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
        return this;
    }
    public ElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
        return this.elasticDataNodeConfiguration;
    }

    public UpdateInstanceRequest setIndexNodeConfiguration(IndexNodeConfiguration indexNodeConfiguration) {
        this.indexNodeConfiguration = indexNodeConfiguration;
        return this;
    }
    public IndexNodeConfiguration getIndexNodeConfiguration() {
        return this.indexNodeConfiguration;
    }

    public UpdateInstanceRequest setInstanceCategory(String instanceCategory) {
        this.instanceCategory = instanceCategory;
        return this;
    }
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    public UpdateInstanceRequest setKibanaConfiguration(KibanaNodeConfiguration kibanaConfiguration) {
        this.kibanaConfiguration = kibanaConfiguration;
        return this;
    }
    public KibanaNodeConfiguration getKibanaConfiguration() {
        return this.kibanaConfiguration;
    }

    public UpdateInstanceRequest setMasterConfiguration(MasterNodeConfiguration masterConfiguration) {
        this.masterConfiguration = masterConfiguration;
        return this;
    }
    public MasterNodeConfiguration getMasterConfiguration() {
        return this.masterConfiguration;
    }

    public UpdateInstanceRequest setNodeAmount(Integer nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }
    public Integer getNodeAmount() {
        return this.nodeAmount;
    }

    public UpdateInstanceRequest setNodeSpec(NodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }
    public NodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    public UpdateInstanceRequest setSearchNodeConfiguration(SearchNodeConfiguration searchNodeConfiguration) {
        this.searchNodeConfiguration = searchNodeConfiguration;
        return this;
    }
    public SearchNodeConfiguration getSearchNodeConfiguration() {
        return this.searchNodeConfiguration;
    }

    public UpdateInstanceRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

    public UpdateInstanceRequest setWarmNodeConfiguration(WarmNodeConfiguration warmNodeConfiguration) {
        this.warmNodeConfiguration = warmNodeConfiguration;
        return this;
    }
    public WarmNodeConfiguration getWarmNodeConfiguration() {
        return this.warmNodeConfiguration;
    }

    public UpdateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateInstanceRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public UpdateInstanceRequest setOrderActionType(String orderActionType) {
        this.orderActionType = orderActionType;
        return this;
    }
    public String getOrderActionType() {
        return this.orderActionType;
    }

}
