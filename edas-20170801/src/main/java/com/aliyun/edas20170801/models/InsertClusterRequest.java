// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterRequest extends TeaModel {
    /**
     * <p>The name of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>****_product_test2</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The type of the cluster. Valid values:</p>
     * <ul>
     * <li>2: Elastic Compute Service (ECS) cluster</li>
     * <li>3: self-managed Kubernetes cluster in Enterprise Distributed Application Service (EDAS)</li>
     * <li>5: Kubernetes cluster</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ClusterType")
    public Integer clusterType;

    /**
     * <p>The provider of Infrastructure as a Service (IaaS) resources that are used in the cluster.</p>
     * <p>When you use Alibaba Cloud, set the value to <code>ALIYUN</code>. The value is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
     */
    @NameInMap("IaasProvider")
    public String iaasProvider;

    /**
     * <p>The ID of the custom namespace. The ID is in the <code>physical region ID:custom namespace identifier</code> format. Example: <code>cn-hangzhou:test</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:td****</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The network type of the cluster. Valid values:</p>
     * <ul>
     * <li>1: classic network</li>
     * <li>2: virtual private cloud (VPC)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NetworkMode")
    public Integer networkMode;

    /**
     * <p><strong>This parameter is deprecated.</strong> The CPU overcommit ratio supported by a Docker cluster. Valid values:</p>
     * <ul>
     * <li>2: 1:2, which means that resources are overcommitted by 1:2.</li>
     * <li>4: 1:4, which means that resources are overcommitted by 1:4.</li>
     * <li>8: 1:8, which means that resources are overcommitted by 1:8.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OversoldFactor")
    public Integer oversoldFactor;

    /**
     * <p>The ID of the VPC. This parameter is required if you set the NetworkMode parameter to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zef6ob8mrlzv8x3q****</p>
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
