// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic creation of cloud computers in a subscription shared cloud computer group. This parameter is required and takes effect only when <code>ChargeType</code> is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowAutoSetup")
    public Integer allowAutoSetup;

    /**
     * <p>The number of cloud computers to reserve in a pay-as-you-go shared cloud computer group. This parameter is required and takes effect only when <code>ChargeType</code> is set to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li><p>0: No cloud computers are reserved.</p>
     * </li>
     * <li><p>N: N cloud computers are reserved (1 ≤ N ≤ 100).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not reserve any cloud computers, the system must create and start one when an end user requests a connection. This process takes longer. Reserve a specific number of cloud computers to ensure a good user experience.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowBufferCount")
    public Integer allowBufferCount;

    /**
     * <p>The number of concurrent sessions that each cloud computer in a multi-session shared cloud computer group can support.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BindAmount")
    public Long bindAmount;

    /**
     * <ul>
     * <li><p>For a subscription shared cloud computer group: the number of cloud computers to purchase. Valid values: 0 to 200.</p>
     * </li>
     * <li><p>For a pay-as-you-go shared cloud computer group: the minimum number of cloud computers to create in the pool. Default value: 1. Valid values: 0 to the value of <code>MaxDesktopsCount</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BuyDesktopsCount")
    public Integer buyDesktopsCount;

    /**
     * <p>The type of the shared cloud computer group.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>teacher</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The maximum duration of a session. When the session duration reaches this value, the session is automatically disconnected. Unit: milliseconds. Valid values: 900000 (15 minutes) to 345600000 (4 days).</p>
     * 
     * <strong>example:</strong>
     * <p>900000</p>
     */
    @NameInMap("ConnectDuration")
    public Long connectDuration;

    @NameInMap("DeleteDuration")
    public Long deleteDuration;

    /**
     * <p>The ID of the shared cloud computer group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>Shared cloud desktop name.</p>
     * 
     * <strong>example:</strong>
     * <p>desktopGroupName1</p>
     */
    @NameInMap("DesktopGroupName")
    public String desktopGroupName;

    /**
     * <p>Specifies whether to disable session management.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableSessionConfig")
    public Boolean disableSessionConfig;

    /**
     * <p>The ID of the NAS file system used for user data roaming.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>04f314****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The maximum idle time for a session. If there is no keyboard or mouse input within this time, the session disconnects. Unit: milliseconds. Valid values: 360000 (6 minutes) to 3600000 (60 minutes).</p>
     * <p>Thirty seconds before the session disconnects, the end user receives a message to save their data. The end user must save their data to prevent data loss.</p>
     * <blockquote>
     * <p>This parameter is applicable only to cloud computers with an image version of 1.0.2 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>360000</p>
     */
    @NameInMap("IdleDisconnectDuration")
    public Long idleDisconnectDuration;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>desktopimage-windows-server-2016-64-ch</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The duration to keep a session active after it disconnects. Unit: milliseconds. Valid values range from 180000 (3 minutes) to 345600000 (4 days). A value of 0 means the session is always kept active.</p>
     * <p>When a session disconnects, either intentionally or unexpectedly, a timer begins. If the user fails to reconnect within this duration, the session is logged off, and any unsaved data is destroyed. If the user reconnects within this duration, they can resume the original session and access the data from before the disconnection.</p>
     * 
     * <strong>example:</strong>
     * <p>180000</p>
     */
    @NameInMap("KeepDuration")
    public Long keepDuration;

    /**
     * <p>The load balancing policy for a multi-session shared cloud computer group that contains multiple cloud computers.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LoadPolicy")
    public Long loadPolicy;

    /**
     * <p>The maximum number of cloud computers that a pay-as-you-go shared cloud computer group can contain. Valid values: 0 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxDesktopsCount")
    public Integer maxDesktopsCount;

    /**
     * <p>The maximum number of cloud computers that are automatically created in a subscription shared cloud computer group. This parameter is required and takes effect only when <code>ChargeType</code> is set to <code>PrePaid</code>. Default value: 1. Valid values: 0 to the value of <code>MaxDesktopsCount</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinDesktopsCount")
    public Integer minDesktopsCount;

    /**
     * <p>The cloud computer template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b-7t275tpgjueeu****</p>
     */
    @NameInMap("OwnBundleId")
    public String ownBundleId;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-53iyi2aar0nd6****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The list of policy group IDs.</p>
     */
    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    /**
     * <p>Specifies whether to enable user data roaming.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProfileFollowSwitch")
    public Boolean profileFollowSwitch;

    /**
     * <p>The session usage threshold. This threshold is a condition for triggering auto scaling in a multi-session shared cloud computer group. The session usage is calculated using the following formula:</p>
     * <p><code>Session usage = Number of active sessions / (Total number of cloud computers × Maximum number of sessions per cloud computer) × 100%</code></p>
     * <p>When the session usage reaches this threshold, new cloud computers are created. If the session usage is below this threshold, idle cloud computers are deleted.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0.85</p>
     */
    @NameInMap("RatioThreshold")
    public Float ratioThreshold;

    /**
     * <p>The region ID. Call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to get a list of regions that WUYING Workspace supports.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reset type for the cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResetType")
    public Long resetType;

    /**
     * <p>The ID of the auto scaling policy group.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s-kakowkdl****</p>
     */
    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    /**
     * <p>The idle shutdown time. The cloud computer automatically shuts down when it is idle for this amount of time. If a user connects to a shutdown cloud computer, it automatically starts. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300000</p>
     */
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

    public ModifyDesktopGroupRequest setBuyDesktopsCount(Integer buyDesktopsCount) {
        this.buyDesktopsCount = buyDesktopsCount;
        return this;
    }
    public Integer getBuyDesktopsCount() {
        return this.buyDesktopsCount;
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

    public ModifyDesktopGroupRequest setDeleteDuration(Long deleteDuration) {
        this.deleteDuration = deleteDuration;
        return this;
    }
    public Long getDeleteDuration() {
        return this.deleteDuration;
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
