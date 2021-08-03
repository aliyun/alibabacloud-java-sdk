// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("OwnBundleId")
    public String ownBundleId;

    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    @NameInMap("KeepDuration")
    public Long keepDuration;

    @NameInMap("Comments")
    public String comments;

    @NameInMap("MinDesktopsCount")
    public Integer minDesktopsCount;

    @NameInMap("MaxDesktopsCount")
    public Integer maxDesktopsCount;

    @NameInMap("AllowAutoSetup")
    public Integer allowAutoSetup;

    @NameInMap("AllowBufferCount")
    public Integer allowBufferCount;

    public static ModifyDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopGroupRequest self = new ModifyDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public ModifyDesktopGroupRequest setOwnBundleId(String ownBundleId) {
        this.ownBundleId = ownBundleId;
        return this;
    }
    public String getOwnBundleId() {
        return this.ownBundleId;
    }

    public ModifyDesktopGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ModifyDesktopGroupRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public ModifyDesktopGroupRequest setScaleStrategyId(String scaleStrategyId) {
        this.scaleStrategyId = scaleStrategyId;
        return this;
    }
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    public ModifyDesktopGroupRequest setKeepDuration(Long keepDuration) {
        this.keepDuration = keepDuration;
        return this;
    }
    public Long getKeepDuration() {
        return this.keepDuration;
    }

    public ModifyDesktopGroupRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public ModifyDesktopGroupRequest setMinDesktopsCount(Integer minDesktopsCount) {
        this.minDesktopsCount = minDesktopsCount;
        return this;
    }
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
    }

    public ModifyDesktopGroupRequest setMaxDesktopsCount(Integer maxDesktopsCount) {
        this.maxDesktopsCount = maxDesktopsCount;
        return this;
    }
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    public ModifyDesktopGroupRequest setAllowAutoSetup(Integer allowAutoSetup) {
        this.allowAutoSetup = allowAutoSetup;
        return this;
    }
    public Integer getAllowAutoSetup() {
        return this.allowAutoSetup;
    }

    public ModifyDesktopGroupRequest setAllowBufferCount(Integer allowBufferCount) {
        this.allowBufferCount = allowBufferCount;
        return this;
    }
    public Integer getAllowBufferCount() {
        return this.allowBufferCount;
    }

}
