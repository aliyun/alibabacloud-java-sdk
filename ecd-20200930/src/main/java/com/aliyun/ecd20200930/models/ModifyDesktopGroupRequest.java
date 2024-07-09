// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyDesktopGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether cloud computers can be automatically created in the subscription cloud computer pool. This parameter takes effect and is required only if you set <code>ChargeType</code> to <code>PrePaid</code>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: false</li>
     * <li>1: true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowAutoSetup")
    public Integer allowAutoSetup;

    /**
     * <p>The number of cloud computers that can be reserved in the pay-as-you-go cloud computer pool. This parameter takes effect and is required only if you set <code>ChargeType</code> to <code>PostPaid</code>. Valid values:</p>
     * <ul>
     * <li>0: does not allow the system to reserve cloud computers.</li>
     * <li>N: allows the system to reserve N cloud computers (1≤ N ≤ 100).</li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to 0, the system must create and start cloud computers and then assign the cloud computers to end users when the end users request cloud computers. This process is time-consuming. To improve user experience, we recommend that you reserve a specific number of cloud computers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AllowBufferCount")
    public Integer allowBufferCount;

    /**
     * <p>The number of concurrent sessions that is allowed for each cloud computer in a multi-session cloud computer pool.</p>
     * <blockquote>
     * <p> This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BindAmount")
    public Long bindAmount;

    /**
     * <ul>
     * <li>This parameter has different meanings based on the billing method of the cloud computer pool. For a subscription pool, this parameter specifies the number of cloud computers to purchase in the pool. Valid values: 0 to 200.</li>
     * <li>For a pay-as-you-go pool, this parameter specifies the minimum number of cloud computers to create in the pool. Default value: 1. Valid values: 0 to <code>MaxDesktopsCount</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BuyDesktopsCount")
    public Integer buyDesktopsCount;

    /**
     * <p>The role that uses the cloud computer pool.</p>
     * <blockquote>
     * <p> This parameter is unavailable.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>teacher</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>student</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
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
     * <p>test</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The maximum period of time during which the session is connected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds. Valid values: 900000 to 345600000. That is, the session can be connected for 15 to 5,760 minutes (4 days).</p>
     * 
     * <strong>example:</strong>
     * <p>600000</p>
     */
    @NameInMap("ConnectDuration")
    public Long connectDuration;

    /**
     * <p>The ID of the cloud computer pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dg-2i8qxpv6t1a03****</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The name of the cloud computer pool.</p>
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
     * <p>The ID of the Apsara File Storage NAS (NAS) file system for the user data roaming feature.</p>
     * <blockquote>
     * <p> This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>04f314****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>After an end user connects to a cloud computer, the session is established. If the system does not detect inputs from the keyboard or mouse within the specified period of time, the session is closed. Unit: milliseconds. Valid values: 360000 to 3600000 (6 minutes to 60 minutes)</p>
     * <p>End users can receive a prompt to save data before sessions are disconnected. The system sends the prompt 30 seconds before the specified period of time is reached. To prevent data loss, end users must save the data of the sessions.</p>
     * <blockquote>
     * <p> This parameter is suitable only for cloud computers whose image version is v1.0.2 or later.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120000</p>
     */
    @NameInMap("IdleDisconnectDuration")
    public Long idleDisconnectDuration;

    /**
     * <p>The IDs of the images.</p>
     * 
     * <strong>example:</strong>
     * <p>desktopimage-windows-server-2016-64-ch</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The retention period of a session after it is disconnected. Unit: milliseconds. Valid values: 180000 to 345600000. That is, the session can be retained for 3 to 5,760 minutes (4 days) after it is disconnected. If you set this parameter to 0, the session is permanently retained after it is disconnected.</p>
     * <p>When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can continue to access data of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("KeepDuration")
    public Long keepDuration;

    /**
     * <p>The load balancing policy of the multi-session cloud computer pool.</p>
     * <blockquote>
     * <p> This parameter is unavailable.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>0: depth-first</li>
     * <li>1: breadth-first</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LoadPolicy")
    public Long loadPolicy;

    /**
     * <p>The maximum number of cloud computers that can be housed in the pay-as-you-go cloud computer pool. Valid values: 0 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxDesktopsCount")
    public Integer maxDesktopsCount;

    /**
     * <p>The maximum number of cloud computers that can be automatically created in the subscription cloud computer pool. This parameter takes effect and is required only if you set <code>ChargeType</code> to <code>PrePaid</code>. Default value: 1. Valid values: 0 to <code>MaxDesktopsCount</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinDesktopsCount")
    public Integer minDesktopsCount;

    /**
     * <p>The ID of the cloud computer template.</p>
     * 
     * <strong>example:</strong>
     * <p>b-7t275tpgjueeu****</p>
     */
    @NameInMap("OwnBundleId")
    public String ownBundleId;

    /**
     * <p>The ID of the security policy.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-53iyi2aar0nd6****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The IDs of policy groups.</p>
     */
    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    /**
     * <p>Specifies whether to enable user data roaming.</p>
     * <blockquote>
     * <p> This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ProfileFollowSwitch")
    public Boolean profileFollowSwitch;

    /**
     * <p>The threshold for the ratio of connected sessions. This parameter indicates the condition that triggers auto scaling in a multi-session cloud computer pool. The ratio of connected sessions IS calculated by using the following formula:</p>
     * <p><code>Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%</code></p>
     * <p>If the ratio of connected sessions is greater than the specified value, new cloud computers are created. If the ratio of connected sessions is smaller than the specified value, idle cloud computers are deleted.</p>
     * <blockquote>
     * <p> This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
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
     * <p>The disk reset type of cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>0: does not reset disks.</p>
     * </li>
     * <li><p>1: resets only the system disks.</p>
     * </li>
     * <li><p>2: resets only the user disks.</p>
     * </li>
     * <li><p>3: resets the system disks and user disks.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ResetType")
    public Long resetType;

    /**
     * <p>The ID of the scaling policy group.</p>
     * <blockquote>
     * <p> This parameter is unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s-kakowkdl****</p>
     */
    @NameInMap("ScaleStrategyId")
    public String scaleStrategyId;

    /**
     * <p>The period of time before the idle cloud computer enters the Stopped state. When the specified period of time is reached, the cloud computer is automatically stopped. If an end user connects to the stopped cloud computer, the cloud computer automatically starts. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>180000</p>
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
