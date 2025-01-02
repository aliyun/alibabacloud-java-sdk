// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ExtendClusterShrinkRequest extends TeaModel {
    /**
     * <p>Cluster ID</p>
     * 
     * <strong>example:</strong>
     * <p>i15b480fbd2fcdbc2869cd80</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Whether to allow skipping failed node tasks, default value is False</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    /**
     * <p>IP allocation policy combination: Each policy can only choose one type, and multiple policies can be combined</p>
     */
    @NameInMap("IpAllocationPolicy")
    public String ipAllocationPolicyShrink;

    /**
     * <p>Node Group</p>
     */
    @NameInMap("NodeGroups")
    public String nodeGroupsShrink;

    /**
     * <p>VSwitch availability zone ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-b</p>
     */
    @NameInMap("VSwitchZoneId")
    public String vSwitchZoneId;

    /**
     * <p>List of cluster subnets</p>
     */
    @NameInMap("VpdSubnets")
    public String vpdSubnetsShrink;

    public static ExtendClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtendClusterShrinkRequest self = new ExtendClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExtendClusterShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExtendClusterShrinkRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public ExtendClusterShrinkRequest setIpAllocationPolicyShrink(String ipAllocationPolicyShrink) {
        this.ipAllocationPolicyShrink = ipAllocationPolicyShrink;
        return this;
    }
    public String getIpAllocationPolicyShrink() {
        return this.ipAllocationPolicyShrink;
    }

    public ExtendClusterShrinkRequest setNodeGroupsShrink(String nodeGroupsShrink) {
        this.nodeGroupsShrink = nodeGroupsShrink;
        return this;
    }
    public String getNodeGroupsShrink() {
        return this.nodeGroupsShrink;
    }

    public ExtendClusterShrinkRequest setVSwitchZoneId(String vSwitchZoneId) {
        this.vSwitchZoneId = vSwitchZoneId;
        return this;
    }
    public String getVSwitchZoneId() {
        return this.vSwitchZoneId;
    }

    public ExtendClusterShrinkRequest setVpdSubnetsShrink(String vpdSubnetsShrink) {
        this.vpdSubnetsShrink = vpdSubnetsShrink;
        return this;
    }
    public String getVpdSubnetsShrink() {
        return this.vpdSubnetsShrink;
    }

}
