// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListInstanceTypesRequest extends TeaModel {
    /**
     * <p>集群ID，仅升配场景使用。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

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
     * <p>机型</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>是否变配。</p>
     */
    @NameInMap("IsModification")
    public Boolean isModification;

    /**
     * <p>节点组ID。</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>节点组类型。取值范围：</p>
     * <p>- MASTER：管理类型节点组。</p>
     * <p>- CORE：存储类型节点组。</p>
     * <p>- TASK：计算类型节点组。</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

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
     * <p>可用区ID。</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ListInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTypesRequest self = new ListInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceTypesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListInstanceTypesRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListInstanceTypesRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public ListInstanceTypesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListInstanceTypesRequest setIsModification(Boolean isModification) {
        this.isModification = isModification;
        return this;
    }
    public Boolean getIsModification() {
        return this.isModification;
    }

    public ListInstanceTypesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListInstanceTypesRequest setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public ListInstanceTypesRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListInstanceTypesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInstanceTypesRequest setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    public ListInstanceTypesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
