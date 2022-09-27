// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    @NameInMap("clientNodeConfiguration")
    public ClientNodeConfiguration clientNodeConfiguration;

    @NameInMap("elasticDataNodeConfiguration")
    public ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    @NameInMap("instanceCategory")
    public String instanceCategory;

    @NameInMap("kibanaConfiguration")
    public KibanaNodeConfiguration kibanaConfiguration;

    @NameInMap("masterConfiguration")
    public MasterNodeConfiguration masterConfiguration;

    @NameInMap("nodeAmount")
    public Integer nodeAmount;

    @NameInMap("nodeSpec")
    public NodeSpec nodeSpec;

    @NameInMap("warmNodeConfiguration")
    public WarmNodeConfiguration warmNodeConfiguration;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("force")
    public Boolean force;

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
