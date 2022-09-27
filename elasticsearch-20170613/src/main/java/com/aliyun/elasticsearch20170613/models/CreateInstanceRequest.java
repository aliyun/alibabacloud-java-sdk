// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("clientNodeConfiguration")
    public ClientNodeConfiguration clientNodeConfiguration;

    @NameInMap("elasticDataNodeConfiguration")
    public ElasticDataNodeConfiguration elasticDataNodeConfiguration;

    @NameInMap("esAdminPassword")
    public String esAdminPassword;

    @NameInMap("esVersion")
    public String esVersion;

    @NameInMap("instanceCategory")
    public String instanceCategory;

    @NameInMap("kibanaConfiguration")
    public KibanaNodeConfiguration kibanaConfiguration;

    @NameInMap("masterConfiguration")
    public MasterNodeConfiguration masterConfiguration;

    @NameInMap("networkConfig")
    public NetworkConfig networkConfig;

    @NameInMap("nodeAmount")
    public Integer nodeAmount;

    @NameInMap("nodeSpec")
    public NodeSpec nodeSpec;

    @NameInMap("paymentInfo")
    public PaymentInfo paymentInfo;

    @NameInMap("paymentType")
    public String paymentType;

    @NameInMap("warmNodeConfiguration")
    public WarmNodeConfiguration warmNodeConfiguration;

    @NameInMap("zoneCount")
    public Integer zoneCount;

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

}
