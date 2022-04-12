// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertClusterRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterType")
    public Integer clusterType;

    @NameInMap("IaasProvider")
    public String iaasProvider;

    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("NetworkMode")
    public Integer networkMode;

    @NameInMap("OversoldFactor")
    public Integer oversoldFactor;

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
