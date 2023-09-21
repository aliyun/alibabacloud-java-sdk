// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateClusterShrinkRequest extends TeaModel {
    @NameInMap("ClusterDescription")
    public String clusterDescription;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("Components")
    public String componentsShrink;

    @NameInMap("HpnZone")
    public String hpnZone;

    @NameInMap("IgnoreFailedNodeTasks")
    public Boolean ignoreFailedNodeTasks;

    @NameInMap("Networks")
    public String networksShrink;

    @NameInMap("NimizVSwitches")
    public String nimizVSwitchesShrink;

    @NameInMap("NodeGroups")
    public String nodeGroupsShrink;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<CreateClusterShrinkRequestTag> tag;

    public static CreateClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterShrinkRequest self = new CreateClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterShrinkRequest setClusterDescription(String clusterDescription) {
        this.clusterDescription = clusterDescription;
        return this;
    }
    public String getClusterDescription() {
        return this.clusterDescription;
    }

    public CreateClusterShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterShrinkRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public CreateClusterShrinkRequest setHpnZone(String hpnZone) {
        this.hpnZone = hpnZone;
        return this;
    }
    public String getHpnZone() {
        return this.hpnZone;
    }

    public CreateClusterShrinkRequest setIgnoreFailedNodeTasks(Boolean ignoreFailedNodeTasks) {
        this.ignoreFailedNodeTasks = ignoreFailedNodeTasks;
        return this;
    }
    public Boolean getIgnoreFailedNodeTasks() {
        return this.ignoreFailedNodeTasks;
    }

    public CreateClusterShrinkRequest setNetworksShrink(String networksShrink) {
        this.networksShrink = networksShrink;
        return this;
    }
    public String getNetworksShrink() {
        return this.networksShrink;
    }

    public CreateClusterShrinkRequest setNimizVSwitchesShrink(String nimizVSwitchesShrink) {
        this.nimizVSwitchesShrink = nimizVSwitchesShrink;
        return this;
    }
    public String getNimizVSwitchesShrink() {
        return this.nimizVSwitchesShrink;
    }

    public CreateClusterShrinkRequest setNodeGroupsShrink(String nodeGroupsShrink) {
        this.nodeGroupsShrink = nodeGroupsShrink;
        return this;
    }
    public String getNodeGroupsShrink() {
        return this.nodeGroupsShrink;
    }

    public CreateClusterShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterShrinkRequest setTag(java.util.List<CreateClusterShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateClusterShrinkRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateClusterShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateClusterShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterShrinkRequestTag self = new CreateClusterShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateClusterShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateClusterShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
