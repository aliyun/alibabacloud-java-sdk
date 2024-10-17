// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunClusterShrinkRequest extends TeaModel {
    /**
     * <p>应用配置。数组元素个数N的取值范围：1~1000。</p>
     */
    @NameInMap("ApplicationConfigs")
    public String applicationConfigsShrink;

    /**
     * <p>应用列表。数组元素个数N的取值范围：1~100。</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Applications")
    public String applicationsShrink;

    /**
     * <p>引导脚本。数组元素个数N的取值范围：1~10。</p>
     */
    @NameInMap("BootstrapScripts")
    public String bootstrapScriptsShrink;

    /**
     * <p>幂等客户端TOKEN。同一个ClientToken多次调用的返回结果一致，同一个ClientToken最多只创建一个集群。</p>
     * 
     * <strong>example:</strong>
     * <p>A7D960FA-6DBA-5E07-8746-A63E3E4D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>集群名称。长度为1~128个字符，必须以大小字母或中文开头，不能以http://和https://开头。可以包含中文、英文、数字、半角冒号（:）、下划线（_）、半角句号（.）或者短划线（-）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>emrtest</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>创建的EMR集群类型。取值范围：</p>
     * <ul>
     * <li>DATALAKE：新版数据湖。</li>
     * <li>OLAP：数据分析。</li>
     * <li>DATAFLOW：实时数据流。</li>
     * <li>DATASERVING：数据服务。</li>
     * <li>CUSTOM：自定义集群。</li>
     * <li>HADOOP：旧版数据湖（不推荐使用，建议使用新版数据湖）。</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATALAKE</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>集群中的应用部署模式。取值范围：</p>
     * <ul>
     * <li>NORMAL：非高可用部署。集群1个MASTER节点。</li>
     * <li>HA：高可用部署。高可用部署要求至少3个MASTER节点。</li>
     * </ul>
     * <p>默认值：NORMAL。</p>
     * 
     * <strong>example:</strong>
     * <p>HA</p>
     */
    @NameInMap("DeployMode")
    public String deployMode;

    /**
     * <strong>example:</strong>
     * <p>Emr cluster for ETL</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("NodeAttributes")
    public String nodeAttributesShrink;

    /**
     * <p>节点组。数组元素个数N的取值范围：1~100。</p>
     * <p>
     * 
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroups")
    public String nodeGroupsShrink;

    /**
     * <p>集群的付费类型。取值范围：</p>
     * <ul>
     * <li>PayAsYouGo：后付费。</li>
     * <li>Subscription：预付费。</li>
     * </ul>
     * <p>默认值：PayAsYouGo。</p>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>区域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>EMR发行版。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EMR-5.16.0</p>
     */
    @NameInMap("ReleaseVersion")
    public String releaseVersion;

    /**
     * <p>集群所在的企业资源组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Kerberos安全模式。取值范围：</p>
     * <ul>
     * <li>NORMAL：普通模式，不开启Kerberos模式。</li>
     * <li>KERBEROS：开启Kerberos模式。</li>
     * </ul>
     * <p>默认值：NORMAL</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SecurityMode")
    public String securityMode;

    @NameInMap("SubscriptionConfig")
    public String subscriptionConfigShrink;

    /**
     * <p>标签。数组元数个数N的取值范围：0~20。</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static RunClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClusterShrinkRequest self = new RunClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunClusterShrinkRequest setApplicationConfigsShrink(String applicationConfigsShrink) {
        this.applicationConfigsShrink = applicationConfigsShrink;
        return this;
    }
    public String getApplicationConfigsShrink() {
        return this.applicationConfigsShrink;
    }

    public RunClusterShrinkRequest setApplicationsShrink(String applicationsShrink) {
        this.applicationsShrink = applicationsShrink;
        return this;
    }
    public String getApplicationsShrink() {
        return this.applicationsShrink;
    }

    public RunClusterShrinkRequest setBootstrapScriptsShrink(String bootstrapScriptsShrink) {
        this.bootstrapScriptsShrink = bootstrapScriptsShrink;
        return this;
    }
    public String getBootstrapScriptsShrink() {
        return this.bootstrapScriptsShrink;
    }

    public RunClusterShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RunClusterShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public RunClusterShrinkRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public RunClusterShrinkRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public RunClusterShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunClusterShrinkRequest setNodeAttributesShrink(String nodeAttributesShrink) {
        this.nodeAttributesShrink = nodeAttributesShrink;
        return this;
    }
    public String getNodeAttributesShrink() {
        return this.nodeAttributesShrink;
    }

    public RunClusterShrinkRequest setNodeGroupsShrink(String nodeGroupsShrink) {
        this.nodeGroupsShrink = nodeGroupsShrink;
        return this;
    }
    public String getNodeGroupsShrink() {
        return this.nodeGroupsShrink;
    }

    public RunClusterShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public RunClusterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunClusterShrinkRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public RunClusterShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunClusterShrinkRequest setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public RunClusterShrinkRequest setSubscriptionConfigShrink(String subscriptionConfigShrink) {
        this.subscriptionConfigShrink = subscriptionConfigShrink;
        return this;
    }
    public String getSubscriptionConfigShrink() {
        return this.subscriptionConfigShrink;
    }

    public RunClusterShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
