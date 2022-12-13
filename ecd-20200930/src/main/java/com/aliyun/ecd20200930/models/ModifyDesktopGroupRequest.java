// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopGroupRequest extends TeaModel {
    // Specifies whether to allow the system to create cloud desktops in the desktop group when you set the ChargeType parameter to PrePaid. This parameter takes effect and is required only when you set the ChargeType parameter to PrePaid. Valid values:
    // 
    // *   0: allows the system to create cloud desktops in the desktop group when you set the ChargeType parameter to PrePaid.
    // *   1: does not allow the system to create cloud desktops in the desktop group when you set the ChargeType parameter to PrePaid.
    @NameInMap("AllowAutoSetup")
    public Integer allowAutoSetup;

    // Specifies whether to allow the system to reserve cloud desktops when you set the ChargeType parameter to PostPaid. This parameter takes effect and is required only when you set the ChargeType parameter to PostPaid. Valid values: 0: does not allow the system to reserve cloud desktops when you set the ChargeType parameter to PostPaid. N: allows the system to reserve N cloud desktops when you set the ChargeType parameter to PostPaid. Valid values of N: 1 to MaxDesktopsCount.
    @NameInMap("AllowBufferCount")
    public Integer allowBufferCount;

    // The number of sessions allowed per desktop in the multi-session desktop group.
    @NameInMap("BindAmount")
    public Long bindAmount;

    // The classification of the desktop pool.
    @NameInMap("Classify")
    public String classify;

    // The description of the desktop group.
    @NameInMap("Comments")
    public String comments;

    @NameInMap("ConnectDuration")
    public Long connectDuration;

    // The ID of the desktop group.
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    // The name of the desktop group.
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    @NameInMap("DisableSessionConfig")
    public Boolean disableSessionConfig;

    // The ID of the NAS file system.
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("IdleDisconnectDuration")
    public Long idleDisconnectDuration;

    // The ID of the image.
    @NameInMap("ImageId")
    public String imageId;

    // The retention period during which the cloud desktop remains connected after the regular user disconnects from the cloud desktop. Unit: ms.
    @NameInMap("KeepDuration")
    public Long keepDuration;

    // The load balancing policy of the multi-session desktop group.
    @NameInMap("LoadPolicy")
    public Long loadPolicy;

    // The maximum number of cloud desktops that the desktop group can hold. Maximum value: 100.
    @NameInMap("MaxDesktopsCount")
    public Integer maxDesktopsCount;

    // The minimum number of cloud desktops that the desktop group must contain. This parameter takes effect and is required only when you set the ChargeType parameter to PrePaid. The value of the MinDesktopsCount parameter ranges from 0 to the value of the MaxDesktopsCount parameter. Default value: 1.
    @NameInMap("MinDesktopsCount")
    public Integer minDesktopsCount;

    // The ID of the cloud desktop template.
    @NameInMap("OwnBundleId")
    public String ownBundleId;

    // The ID of the policy.
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    @NameInMap("ProfileFollowSwitch")
    public Boolean profileFollowSwitch;

    @NameInMap("RatioThreshold")
    public Float ratioThreshold;

    // The ID of the region
    @NameInMap("RegionId")
    public String regionId;

    // Specifies which type of the disk used by cloud desktops in the desktop group is reset.
    @NameInMap("ResetType")
    public Long resetType;

    // The ID of the scaling policy group.
    // 
    // >  This parameter is unavailable.
    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    @NameInMap("StopDuration")
    public Long stopDuration;

    public static ModifyDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDesktopGroupRequest self = new ModifyDesktopGroupRequest();
        return TeaModel.build(map, self);
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

    public ModifyDesktopGroupRequest setBindAmount(Long bindAmount) {
        this.bindAmount = bindAmount;
        return this;
    }
    public Long getBindAmount() {
        return this.bindAmount;
    }

    public ModifyDesktopGroupRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public ModifyDesktopGroupRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public ModifyDesktopGroupRequest setConnectDuration(Long connectDuration) {
        this.connectDuration = connectDuration;
        return this;
    }
    public Long getConnectDuration() {
        return this.connectDuration;
    }

    public ModifyDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public ModifyDesktopGroupRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public ModifyDesktopGroupRequest setDisableSessionConfig(Boolean disableSessionConfig) {
        this.disableSessionConfig = disableSessionConfig;
        return this;
    }
    public Boolean getDisableSessionConfig() {
        return this.disableSessionConfig;
    }

    public ModifyDesktopGroupRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyDesktopGroupRequest setIdleDisconnectDuration(Long idleDisconnectDuration) {
        this.idleDisconnectDuration = idleDisconnectDuration;
        return this;
    }
    public Long getIdleDisconnectDuration() {
        return this.idleDisconnectDuration;
    }

    public ModifyDesktopGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyDesktopGroupRequest setKeepDuration(Long keepDuration) {
        this.keepDuration = keepDuration;
        return this;
    }
    public Long getKeepDuration() {
        return this.keepDuration;
    }

    public ModifyDesktopGroupRequest setLoadPolicy(Long loadPolicy) {
        this.loadPolicy = loadPolicy;
        return this;
    }
    public Long getLoadPolicy() {
        return this.loadPolicy;
    }

    public ModifyDesktopGroupRequest setMaxDesktopsCount(Integer maxDesktopsCount) {
        this.maxDesktopsCount = maxDesktopsCount;
        return this;
    }
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    public ModifyDesktopGroupRequest setMinDesktopsCount(Integer minDesktopsCount) {
        this.minDesktopsCount = minDesktopsCount;
        return this;
    }
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
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

    public ModifyDesktopGroupRequest setPolicyGroupIds(java.util.List<String> policyGroupIds) {
        this.policyGroupIds = policyGroupIds;
        return this;
    }
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    public ModifyDesktopGroupRequest setProfileFollowSwitch(Boolean profileFollowSwitch) {
        this.profileFollowSwitch = profileFollowSwitch;
        return this;
    }
    public Boolean getProfileFollowSwitch() {
        return this.profileFollowSwitch;
    }

    public ModifyDesktopGroupRequest setRatioThreshold(Float ratioThreshold) {
        this.ratioThreshold = ratioThreshold;
        return this;
    }
    public Float getRatioThreshold() {
        return this.ratioThreshold;
    }

    public ModifyDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDesktopGroupRequest setResetType(Long resetType) {
        this.resetType = resetType;
        return this;
    }
    public Long getResetType() {
        return this.resetType;
    }

    public ModifyDesktopGroupRequest setScaleStrategyId(String scaleStrategyId) {
        this.scaleStrategyId = scaleStrategyId;
        return this;
    }
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    public ModifyDesktopGroupRequest setStopDuration(Long stopDuration) {
        this.stopDuration = stopDuration;
        return this;
    }
    public Long getStopDuration() {
        return this.stopDuration;
    }

}
