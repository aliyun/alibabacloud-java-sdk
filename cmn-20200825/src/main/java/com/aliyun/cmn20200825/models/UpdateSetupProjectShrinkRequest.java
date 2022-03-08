// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSetupProjectShrinkRequest extends TeaModel {
    // 架构id
    @NameInMap("ArchitectureId")
    public String architectureId;

    // 预计交付时间
    @NameInMap("DeliveryTime")
    public String deliveryTime;

    // 描述
    @NameInMap("Description")
    public String description;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 节点
    @NameInMap("Nodes")
    public String nodes;

    // 套餐
    @NameInMap("Packages")
    public String packagesShrink;

    // 资源一级ID
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 物理空间uId
    @NameInMap("SpaceId")
    public String spaceId;

    public static UpdateSetupProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSetupProjectShrinkRequest self = new UpdateSetupProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSetupProjectShrinkRequest setArchitectureId(String architectureId) {
        this.architectureId = architectureId;
        return this;
    }
    public String getArchitectureId() {
        return this.architectureId;
    }

    public UpdateSetupProjectShrinkRequest setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    public UpdateSetupProjectShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSetupProjectShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSetupProjectShrinkRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public UpdateSetupProjectShrinkRequest setPackagesShrink(String packagesShrink) {
        this.packagesShrink = packagesShrink;
        return this;
    }
    public String getPackagesShrink() {
        return this.packagesShrink;
    }

    public UpdateSetupProjectShrinkRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateSetupProjectShrinkRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
