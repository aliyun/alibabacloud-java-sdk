// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopGroupRequest extends TeaModel {
    // The users that you want to add to all types of desktop pools.
    @NameInMap("AllClassifyUsers")
    public Boolean allClassifyUsers;

    // Specifies whether to allow the system to create cloud desktops in the desktop group when you set the billing method to subscription. This parameter is required and only takes effect and when you set the ChargeType parameter to PrePaid.
    @NameInMap("AllowAutoSetup")
    public Integer allowAutoSetup;

    // Specifies whether to allow the system to reserve cloud desktops when you set the billing method to pay-as-you-go. This parameter is required and only takes effect when you set the ChargeType parameter to PostPaid.
    @NameInMap("AllowBufferCount")
    public Integer allowBufferCount;

    // Specifies whether to enable automatic payment.
    @NameInMap("AutoPay")
    public Boolean autoPay;

    // The number of sessions that are allowed for each cloud desktop in the multi-session desktop group.
    @NameInMap("BindAmount")
    public Long bindAmount;

    // The ID of the desktop template.
    @NameInMap("BundleId")
    public String bundleId;

    // The billing method of the cloud desktop.
    @NameInMap("ChargeType")
    public String chargeType;

    // The type of the desktop pool.
    @NameInMap("Classify")
    public String classify;

    // The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but make sure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence of a request](~~25693~~).
    @NameInMap("ClientToken")
    public String clientToken;

    // The remarks on the desktop group.
    @NameInMap("Comments")
    public String comments;

    @NameInMap("ConnectDuration")
    public Long connectDuration;

    // The default number of cloud desktops that you want the system to create when you create the desktop group. Default value: 1.
    @NameInMap("DefaultInitDesktopCount")
    public Integer defaultInitDesktopCount;

    // The name of the desktop group.
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    // The ID of the directory.
    @NameInMap("DirectoryId")
    public String directoryId;

    // The users that are authorized to use the desktop group.
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    // The ID of the NAS file system.
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("IdleDisconnectDuration")
    public Long idleDisconnectDuration;

    // The retention period during which the cloud desktop remains connected after the regular user disconnects from the cloud desktop. Unit: ms.
    @NameInMap("KeepDuration")
    public Long keepDuration;

    // The load balancing policy of the multi-session desktop group.
    @NameInMap("LoadPolicy")
    public Long loadPolicy;

    // The maximum number of cloud desktops that the desktop group can contain.
    @NameInMap("MaxDesktopsCount")
    public Integer maxDesktopsCount;

    // The minimum number of cloud desktops that the desktop group must retain when you set the billing method to subscription. This parameter is required and only takes effect and when you set the ChargeType parameter to PrePaid. The value of the MinDesktopsCount parameter ranges from 0 to the value of the MaxDesktopsCount parameter. Default value: 1.
    @NameInMap("MinDesktopsCount")
    public Integer minDesktopsCount;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The type of the desktop group.
    @NameInMap("OwnType")
    public Integer ownType;

    // The subscription duration of the cloud desktop that you want to purchase. The unit is specified by the PeriodUnit parameter. The Period parameter is required and only takes effect when you set the ChargeType parameter to PrePaid.
    // 
    // *   Valid values if you set the PeriodUnit parameter to Month:
    // 
    //     *   1
    //     *   2
    //     *   3
    //     *   6
    // 
    // *   Valid values if you set the PeriodUnit parameter to Year:
    // 
    //     *   1
    //     *   2
    //     *   3
    //     *   4
    //     *   5
    @NameInMap("Period")
    public Integer period;

    // The unit of the subscription duration.
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // The ID of the policy.
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("ProfileFollowSwitch")
    public Boolean profileFollowSwitch;

    @NameInMap("RatioThreshold")
    public Float ratioThreshold;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies which type of disk used by cloud desktops in the desktop group is reset.
    @NameInMap("ResetType")
    public Long resetType;

    // The ID of the scaling policy.
    // 
    // > This parameter is unavailable.
    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    @NameInMap("StopDuration")
    public Long stopDuration;

    // Specifies whether to enable disk encryption.
    @NameInMap("VolumeEncryptionEnabled")
    public Boolean volumeEncryptionEnabled;

    // The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled. You can call the [ListKeys](~~28951~~) operation to obtain a list of KMS keys.
    @NameInMap("VolumeEncryptionKey")
    public String volumeEncryptionKey;

    // The ID of the virtual private cloud (VPC) in which you want to create the desktop group.
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopGroupRequest self = new CreateDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDesktopGroupRequest setAllClassifyUsers(Boolean allClassifyUsers) {
        this.allClassifyUsers = allClassifyUsers;
        return this;
    }
    public Boolean getAllClassifyUsers() {
        return this.allClassifyUsers;
    }

    public CreateDesktopGroupRequest setAllowAutoSetup(Integer allowAutoSetup) {
        this.allowAutoSetup = allowAutoSetup;
        return this;
    }
    public Integer getAllowAutoSetup() {
        return this.allowAutoSetup;
    }

    public CreateDesktopGroupRequest setAllowBufferCount(Integer allowBufferCount) {
        this.allowBufferCount = allowBufferCount;
        return this;
    }
    public Integer getAllowBufferCount() {
        return this.allowBufferCount;
    }

    public CreateDesktopGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateDesktopGroupRequest setBindAmount(Long bindAmount) {
        this.bindAmount = bindAmount;
        return this;
    }
    public Long getBindAmount() {
        return this.bindAmount;
    }

    public CreateDesktopGroupRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateDesktopGroupRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateDesktopGroupRequest setClassify(String classify) {
        this.classify = classify;
        return this;
    }
    public String getClassify() {
        return this.classify;
    }

    public CreateDesktopGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDesktopGroupRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public CreateDesktopGroupRequest setConnectDuration(Long connectDuration) {
        this.connectDuration = connectDuration;
        return this;
    }
    public Long getConnectDuration() {
        return this.connectDuration;
    }

    public CreateDesktopGroupRequest setDefaultInitDesktopCount(Integer defaultInitDesktopCount) {
        this.defaultInitDesktopCount = defaultInitDesktopCount;
        return this;
    }
    public Integer getDefaultInitDesktopCount() {
        return this.defaultInitDesktopCount;
    }

    public CreateDesktopGroupRequest setDesktopGroupName(String desktopGroupName) {
        this.desktopGroupName = desktopGroupName;
        return this;
    }
    public String getDesktopGroupName() {
        return this.desktopGroupName;
    }

    public CreateDesktopGroupRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public CreateDesktopGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public CreateDesktopGroupRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateDesktopGroupRequest setIdleDisconnectDuration(Long idleDisconnectDuration) {
        this.idleDisconnectDuration = idleDisconnectDuration;
        return this;
    }
    public Long getIdleDisconnectDuration() {
        return this.idleDisconnectDuration;
    }

    public CreateDesktopGroupRequest setKeepDuration(Long keepDuration) {
        this.keepDuration = keepDuration;
        return this;
    }
    public Long getKeepDuration() {
        return this.keepDuration;
    }

    public CreateDesktopGroupRequest setLoadPolicy(Long loadPolicy) {
        this.loadPolicy = loadPolicy;
        return this;
    }
    public Long getLoadPolicy() {
        return this.loadPolicy;
    }

    public CreateDesktopGroupRequest setMaxDesktopsCount(Integer maxDesktopsCount) {
        this.maxDesktopsCount = maxDesktopsCount;
        return this;
    }
    public Integer getMaxDesktopsCount() {
        return this.maxDesktopsCount;
    }

    public CreateDesktopGroupRequest setMinDesktopsCount(Integer minDesktopsCount) {
        this.minDesktopsCount = minDesktopsCount;
        return this;
    }
    public Integer getMinDesktopsCount() {
        return this.minDesktopsCount;
    }

    public CreateDesktopGroupRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateDesktopGroupRequest setOwnType(Integer ownType) {
        this.ownType = ownType;
        return this;
    }
    public Integer getOwnType() {
        return this.ownType;
    }

    public CreateDesktopGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateDesktopGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateDesktopGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateDesktopGroupRequest setProfileFollowSwitch(Boolean profileFollowSwitch) {
        this.profileFollowSwitch = profileFollowSwitch;
        return this;
    }
    public Boolean getProfileFollowSwitch() {
        return this.profileFollowSwitch;
    }

    public CreateDesktopGroupRequest setRatioThreshold(Float ratioThreshold) {
        this.ratioThreshold = ratioThreshold;
        return this;
    }
    public Float getRatioThreshold() {
        return this.ratioThreshold;
    }

    public CreateDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDesktopGroupRequest setResetType(Long resetType) {
        this.resetType = resetType;
        return this;
    }
    public Long getResetType() {
        return this.resetType;
    }

    public CreateDesktopGroupRequest setScaleStrategyId(String scaleStrategyId) {
        this.scaleStrategyId = scaleStrategyId;
        return this;
    }
    public String getScaleStrategyId() {
        return this.scaleStrategyId;
    }

    public CreateDesktopGroupRequest setStopDuration(Long stopDuration) {
        this.stopDuration = stopDuration;
        return this;
    }
    public Long getStopDuration() {
        return this.stopDuration;
    }

    public CreateDesktopGroupRequest setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
        this.volumeEncryptionEnabled = volumeEncryptionEnabled;
        return this;
    }
    public Boolean getVolumeEncryptionEnabled() {
        return this.volumeEncryptionEnabled;
    }

    public CreateDesktopGroupRequest setVolumeEncryptionKey(String volumeEncryptionKey) {
        this.volumeEncryptionKey = volumeEncryptionKey;
        return this;
    }
    public String getVolumeEncryptionKey() {
        return this.volumeEncryptionKey;
    }

    public CreateDesktopGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
