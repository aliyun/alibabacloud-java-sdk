// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterRequest extends TeaModel {
    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The type of the cluster. Valid values:</p>
     * <br>
     * <p>*   2: Elastic Compute Service (ECS) cluster</p>
     * <p>*   3: self-managed Kubernetes cluster in Enterprise Distributed Application Service (EDAS)</p>
     * <p>*   5: Kubernetes cluster</p>
     */
    @NameInMap("ClusterType")
    public Integer clusterType;

    /**
     * <p>The provider of Infrastructure as a Service (IaaS) resources that are used in the cluster.</p>
     * <br>
     * <p>When you use Alibaba Cloud, set the value to `ALIYUN`. The value is case-sensitive.</p>
     */
    @NameInMap("IaasProvider")
    public String iaasProvider;

    /**
     * <p>The ID of the custom namespace. The ID is in the `physical region ID:custom namespace identifier` format. Example: `cn-hangzhou:test`.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The network type of the cluster. Valid values:</p>
     * <br>
     * <p>*   1: classic network</p>
     * <p>*   2: virtual private cloud (VPC)</p>
     */
    @NameInMap("NetworkMode")
    public Integer networkMode;

    /**
     * <p>**This parameter is deprecated.** The CPU overcommit ratio supported by a Docker cluster. Valid values:</p>
     * <br>
     * <p>*   2: 1:2, which means that resources are overcommitted by 1:2.</p>
     * <p>*   4: 1:4, which means that resources are overcommitted by 1:4.</p>
     * <p>*   8: 1:8, which means that resources are overcommitted by 1:8.</p>
     */
    @NameInMap("OversoldFactor")
    public Integer oversoldFactor;

    /**
     * <p>The ID of the VPC. This parameter is required if you set the NetworkMode parameter to 2.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static InsertClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertClusterRequest self = new InsertClusterRequest();
        return TeaModel.build(map, self);
    }

    public InsertClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public InsertClusterRequest setClusterType(Integer clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public Integer getClusterType() {
        return this.clusterType;
    }

    public InsertClusterRequest setIaasProvider(String iaasProvider) {
        this.iaasProvider = iaasProvider;
        return this;
    }
    public String getIaasProvider() {
        return this.iaasProvider;
    }

    public InsertClusterRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertClusterRequest setNetworkMode(Integer networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public Integer getNetworkMode() {
        return this.networkMode;
    }

    public InsertClusterRequest setOversoldFactor(Integer oversoldFactor) {
        this.oversoldFactor = oversoldFactor;
        return this;
    }
    public Integer getOversoldFactor() {
        return this.oversoldFactor;
    }

    public InsertClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
