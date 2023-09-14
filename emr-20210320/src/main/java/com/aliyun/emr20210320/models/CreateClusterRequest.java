// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    /**
     * <p>应用配置。数组元素个数N的取值范围：1~1000。</p>
     */
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfig> applicationConfigs;

    /**
     * <p>应用列表。数组元素个数N的取值范围：1~100。</p>
     */
    @NameInMap("Applications")
    public java.util.List<Application> applications;

    /**
     * <p>引导脚本。数组元素个数N的取值范围：1~10。</p>
     */
    @NameInMap("BootstrapScripts")
    public java.util.List<Script> bootstrapScripts;

    /**
     * <p>幂等客户端TOKEN。同一个ClientToken多次调用的返回结果一致，同一个ClientToken最多只创建一个集群。</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>集群名称。长度为1~128个字符，必须以大小字母或中文开头，不能以http://和https://开头。可以包含中文、英文、数字、半角冒号（:）、下划线（_）、半角句号（.）或者短划线（-）</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>创建的EMR集群类型。取值范围：</p>
     * <p>- DATALAKE：新版数据湖。</p>
     * <p>- OLAP：数据分析。</p>
     * <p>- DATAFLOW：实时数据流。</p>
     * <p>- DATASERVING：数据服务。</p>
     * <p>- CUSTOM：自定义集群。</p>
     * <p>- HADOOP：旧版数据湖（不推荐使用，建议使用新版数据湖）。</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>集群中的应用部署模式。取值范围：</p>
     * <p>- NORMAL：非高可用部署。集群1个MASTER节点。</p>
     * <p>- HA：高可用部署。高可用部署要求至少3个MASTER节点。</p>
     * <br>
     * <p>默认值：NORMAL。</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <p>节点属性。集群中的ECS节点基础属性。</p>
     */
    @NameInMap("NodeAttributes")
    public NodeAttributes nodeAttributes;

    /**
     * <p>节点组。数组元素个数N的取值范围：1~100。</p>
     * <p><p></p>
     */
    @NameInMap("NodeGroups")
    public java.util.List<NodeGroupConfig> nodeGroups;

    /**
     * <p>集群的付费类型。取值范围：</p>
     * <p>- PayAsYouGo：后付费。</p>
     * <p>- Subscription：预付费。</p>
     * <br>
     * <p>默认值：PayAsYouGo。</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>EMR发行版。</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>集群所在的企业资源组ID。</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Kerberos安全模式。取值范围：</p>
     * <p>- NORMAL：普通模式，不开启Kerberos模式。</p>
     * <p>- KERBEROS：开启Kerberos模式。</p>
     * <br>
     * <p>默认值：NORMAL</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    /**
     * <p>预付费配置。当PaymentType取值Subscription时该参数生效。</p>
     */
    @NameInMap("SubscriptionConfig")
    public SubscriptionConfig subscriptionConfig;

    /**
     * <p>标签。数组元数个数N的取值范围：0~20。</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tag> tags;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setApplicationConfigs(java.util.List<ApplicationConfig> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfig> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public CreateClusterRequest setApplications(java.util.List<Application> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Application> getApplications() {
        return this.applications;
    }

    public CreateClusterRequest setBootstrapScripts(java.util.List<Script> bootstrapScripts) {
        this.bootstrapScripts = bootstrapScripts;
        return this;
    }
    public java.util.List<Script> getBootstrapScripts() {
        return this.bootstrapScripts;
    }

    public CreateClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateClusterRequest setNodeAttributes(NodeAttributes nodeAttributes) {
        this.nodeAttributes = nodeAttributes;
        return this;
    }
    public NodeAttributes getNodeAttributes() {
        return this.nodeAttributes;
    }

    public CreateClusterRequest setNodeGroups(java.util.List<NodeGroupConfig> nodeGroups) {
        this.nodeGroups = nodeGroups;
        return this;
    }
    public java.util.List<NodeGroupConfig> getNodeGroups() {
        return this.nodeGroups;
    }

    public CreateClusterRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public CreateClusterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterRequest setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public CreateClusterRequest setSubscriptionConfig(SubscriptionConfig subscriptionConfig) {
        this.subscriptionConfig = subscriptionConfig;
        return this;
    }
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    public CreateClusterRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

}
