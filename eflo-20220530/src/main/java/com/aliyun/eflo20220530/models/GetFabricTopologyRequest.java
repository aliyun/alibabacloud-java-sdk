// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetFabricTopologyRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-169263721924****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Lingjun network interface controller ID List</p>
     */
    @NameInMap("LniIds")
    public java.util.List<String> lniIds;

    /**
     * <p>Node ID list</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-k8i0g9fk68t7u0u2w****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Lingjun CIDR block ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-aof7****</p>
     */
    @NameInMap("VpdId")
    public String vpdId;

    public static GetFabricTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFabricTopologyRequest self = new GetFabricTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetFabricTopologyRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetFabricTopologyRequest setLniIds(java.util.List<String> lniIds) {
        this.lniIds = lniIds;
        return this;
    }
    public java.util.List<String> getLniIds() {
        return this.lniIds;
    }

    public GetFabricTopologyRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public GetFabricTopologyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetFabricTopologyRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public GetFabricTopologyRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}
