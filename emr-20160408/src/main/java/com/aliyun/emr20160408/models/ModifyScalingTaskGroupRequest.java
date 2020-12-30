// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingTaskGroupRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostGroupId")
    public String hostGroupId;

    @NameInMap("MinSize")
    public Integer minSize;

    @NameInMap("MaxSize")
    public Integer maxSize;

    @NameInMap("DefaultCooldown")
    public Integer defaultCooldown;

    @NameInMap("ActiveRuleCategory")
    public String activeRuleCategory;

    @NameInMap("WithGrace")
    public Boolean withGrace;

    @NameInMap("TimeoutWithGrace")
    public Long timeoutWithGrace;

    public static ModifyScalingTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingTaskGroupRequest self = new ModifyScalingTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyScalingTaskGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyScalingTaskGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyScalingTaskGroupRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyScalingTaskGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public ModifyScalingTaskGroupRequest setMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }
    public Integer getMinSize() {
        return this.minSize;
    }

    public ModifyScalingTaskGroupRequest setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public ModifyScalingTaskGroupRequest setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
        return this;
    }
    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    public ModifyScalingTaskGroupRequest setActiveRuleCategory(String activeRuleCategory) {
        this.activeRuleCategory = activeRuleCategory;
        return this;
    }
    public String getActiveRuleCategory() {
        return this.activeRuleCategory;
    }

    public ModifyScalingTaskGroupRequest setWithGrace(Boolean withGrace) {
        this.withGrace = withGrace;
        return this;
    }
    public Boolean getWithGrace() {
        return this.withGrace;
    }

    public ModifyScalingTaskGroupRequest setTimeoutWithGrace(Long timeoutWithGrace) {
        this.timeoutWithGrace = timeoutWithGrace;
        return this;
    }
    public Long getTimeoutWithGrace() {
        return this.timeoutWithGrace;
    }

}
