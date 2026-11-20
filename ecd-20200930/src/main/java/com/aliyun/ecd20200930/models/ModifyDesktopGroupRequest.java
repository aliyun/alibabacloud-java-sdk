// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow automatic creation of cloud desktops in a subscription shared cloud desktop. This parameter takes effect and is required only when the <code>ChargeType</code> parameter is set to <code>PrePaid</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowAutoSetup")
    public Integer allowAutoSetup;

    /**
     * <p>The number of reserved cloud desktops allowed in a pay-as-you-go shared cloud desktop. This parameter takes effect and is required only when the <code>ChargeType</code> parameter is set to <code>PostPaid</code>. Valid values: </p>
     * <ul>
     * <li>0: No reserved cloud desktops.</li>
     * <li>N: N reserved cloud desktops (1 ≤ N ≤ 100).</li>
     * </ul>
     * <blockquote>
     * <p>If no available cloud desktops are reserved, when an end user initiates a connection request, the system must first create and start a cloud desktop and then assign it to the user, which takes a relatively long time. Reserve a certain number of cloud desktops as needed to ensure the user experience.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowBufferCount")
    public Integer allowBufferCount;

    /**
     * <p>The number of concurrent sessions allowed per cloud desktop in multi-session and multi-desktop shared cloud desktops.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BindAmount")
    public Long bindAmount;

    /**
     * <ul>
     * <li>For a subscription shared cloud desktop: the number of cloud desktops to purchase. Valid values: 0 to 200.</li>
     * <li>For a pay-as-you-go shared cloud desktop: the minimum number of cloud desktops to create in the pool. Default value: 1. Valid values: 0 to the value of <code>MaxDesktopsCount</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BuyDesktopsCount")
    public Integer buyDesktopsCount;

    /**
     * <p>The type of the shared cloud desktop.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>teacher</p>
     */
    @NameInMap("Classify")
    public String classify;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The maximum duration for which a session can remain connected. When the session connection duration reaches this value, the session is automatically disconnected. Unit: milliseconds. Valid values: 900000 (15 minutes) to 345600000 (4 days).</p>
     * 
     * <strong>example:</strong>
     * <p>900000</p>
     */
    @NameInMap("ConnectDuration")
    public Long connectDuration;

    /**
     * <p>The retention period before a cloud desktop in the cloud desktop pool is automatically deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("DeleteDuration")
    public Long deleteDuration;

    /**
     * <p>The ID of the shared cloud desktop.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The name of the shared cloud desktop.</p>
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
     * <p>The ID of the NAS file system used for the user data roaming feature.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>04f314****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The maximum idle time before a user session is disconnected. If no keyboard or mouse operations are performed within this maximum duration after a user session is connected, the session is disconnected. Unit: milliseconds. Valid values: 360000 (6 minutes) to 3600000 (60 minutes).</p>
     * <p>30 seconds before this duration is reached, the end user in the session receives a prompt message to save document data. The end user must save the document data promptly to avoid data loss.</p>
     * <blockquote>
     * <p>This parameter applies only to cloud desktops with an image version of 1.0.2 or later.</p>
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
     * <p>The retention period after a session is disconnected. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
     * <p>If a session is disconnected intentionally by the user or unexpectedly due to other factors, the retention period starts from the time of disconnection. If the user does not reconnect to the session within this period, the session is logged off and unsaved data is destroyed. If the user successfully reconnects within this period, the user can enter the original session and access the data before the disconnection.</p>
     * 
     * <strong>example:</strong>
     * <p>180000</p>
     */
    @NameInMap("KeepDuration")
    public Long keepDuration;

    /**
     * <p>The load balancing policy for multi-session and multi-desktop shared cloud desktops.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LoadPolicy")
    public Long loadPolicy;

    /**
     * <p>The maximum number of cloud desktops that can be accommodated in a pay-as-you-go shared cloud desktop. Valid values: 0 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxDesktopsCount")
    public Integer maxDesktopsCount;

    /**
     * <p>The upper limit for the automatic creation of cloud desktops in a subscription shared cloud desktop. This parameter takes effect and is required only when the <code>ChargeType</code> parameter is set to <code>PrePaid</code>. Default value: 1. Valid values: 0 to the value of <code>MaxDesktopsCount</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinDesktopsCount")
    public Integer minDesktopsCount;

    /**
     * <p>The ID of the cloud desktop template.</p>
     * 
     * <strong>example:</strong>
     * <p>b-7t275tpgjueeu****</p>
     */
    @NameInMap("OwnBundleId")
    public String ownBundleId;

    /**
     * <p>The ID of the policy.</p>
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
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProfileFollowSwitch")
    public Boolean profileFollowSwitch;

    /**
     * <p>The session usage threshold, which is used as the trigger for automatic scaling of multi-session and multi-desktop shared cloud desktops. The formula for session usage is:</p>
     * <p><code>Session usage = Number of attached sessions / (Total number of cloud desktop resources × Maximum number of sessions supported per cloud desktop) × 100%</code></p>
     * <p>When the session usage reaches this threshold, new cloud desktops are created. When the session usage does not reach this threshold, excess cloud desktops are deleted.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0.85</p>
     */
    @NameInMap("RatioThreshold")
    public Float ratioThreshold;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reset type of the cloud desktop.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResetType")
    public Long resetType;

    /**
     * <p>The ID of the scaling policy group.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s-kakowkdl****</p>
     */
    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    /**
     * <p>The idle shutdown time. When the idle time of a cloud desktop reaches this value, the cloud desktop is automatically shut down. If a user connects to the cloud desktop after it is shut down, the cloud desktop is automatically started. Unit: milliseconds.</p>
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
