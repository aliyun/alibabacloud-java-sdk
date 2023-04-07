// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopGroupDetailResponseBody extends TeaModel {
    /**
     * <p>The information about the desktop group.</p>
     */
    @NameInMap("Desktops")
    public GetDesktopGroupDetailResponseBodyDesktops desktops;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDesktopGroupDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDesktopGroupDetailResponseBody self = new GetDesktopGroupDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDesktopGroupDetailResponseBody setDesktops(GetDesktopGroupDetailResponseBodyDesktops desktops) {
        this.desktops = desktops;
        return this;
    }
    public GetDesktopGroupDetailResponseBodyDesktops getDesktops() {
        return this.desktops;
    }

    public GetDesktopGroupDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos extends TeaModel {
        /**
         * <p>The number of purchased cloud desktops during the scaling event. Valid values: 0 to 200.</p>
         */
        @NameInMap("BuyResAmount")
        public Integer buyResAmount;

        /**
         * <p>The type of the CRON expression that is specified for the scheduled task.</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The retention period of a cloud desktop in the desktop group after the cloud desktop is disconnected. Unit: milliseconds.</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy for the multi-session desktop group.</p>
         */
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        /**
         * <p>The maximum number of cloud desktops that the system can scale. Valid values: 0 to 200.</p>
         */
        @NameInMap("MaxResAmount")
        public Integer maxResAmount;

        /**
         * <p>The minimum number of cloud desktops. Valid values: 0 to 200.</p>
         */
        @NameInMap("MinResAmount")
        public Integer minResAmount;

        /**
         * <p>The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session desktop group. `Ratio of connected sessions = Number of connected sessions/(Total number of cloud desktops x Maximum number of sessions allowed for each cloud desktop) x 100%`. When the specified threshold is reached, new cloud desktops are automatically created. If the specified threshold is not reached, idle cloud desktops are released.</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The type of the scheduled task. Valid values:</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos build(java.util.Map<String, ?> map) throws Exception {
            GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos self = new GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos();
            return TeaModel.build(map, self);
        }

        public GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos setBuyResAmount(Integer buyResAmount) {
            this.buyResAmount = buyResAmount;
            return this;
        }
        public Integer getBuyResAmount() {
            return this.buyResAmount;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos setKeepDuration(Long keepDuration) {
            this.keepDuration = keepDuration;
            return this;
        }
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos setLoadPolicy(Integer loadPolicy) {
            this.loadPolicy = loadPolicy;
            return this;
        }
        public Integer getLoadPolicy() {
            return this.loadPolicy;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos setMaxResAmount(Integer maxResAmount) {
            this.maxResAmount = maxResAmount;
            return this;
        }
        public Integer getMaxResAmount() {
            return this.maxResAmount;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos setMinResAmount(Integer minResAmount) {
            this.minResAmount = minResAmount;
            return this;
        }
        public Integer getMinResAmount() {
            return this.minResAmount;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos setRatioThreshold(Float ratioThreshold) {
            this.ratioThreshold = ratioThreshold;
            return this;
        }
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDesktopGroupDetailResponseBodyDesktopsTimerInfos extends TeaModel {
        /**
         * <p>The CRON expression.</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Indicates whether the scheduled task is forcibly executed.</p>
         */
        @NameInMap("Forced")
        public Boolean forced;

        /**
         * <p>The status of the scheduled task.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the scheduled task.</p>
         */
        @NameInMap("TimerType")
        public Integer timerType;

        public static GetDesktopGroupDetailResponseBodyDesktopsTimerInfos build(java.util.Map<String, ?> map) throws Exception {
            GetDesktopGroupDetailResponseBodyDesktopsTimerInfos self = new GetDesktopGroupDetailResponseBodyDesktopsTimerInfos();
            return TeaModel.build(map, self);
        }

        public GetDesktopGroupDetailResponseBodyDesktopsTimerInfos setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsTimerInfos setForced(Boolean forced) {
            this.forced = forced;
            return this;
        }
        public Boolean getForced() {
            return this.forced;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsTimerInfos setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDesktopGroupDetailResponseBodyDesktopsTimerInfos setTimerType(Integer timerType) {
            this.timerType = timerType;
            return this;
        }
        public Integer getTimerType() {
            return this.timerType;
        }

    }

    public static class GetDesktopGroupDetailResponseBodyDesktops extends TeaModel {
        /**
         * <p>Indicates whether the desktop group enables auto scale-out.</p>
         */
        @NameInMap("AllowAutoSetup")
        public Integer allowAutoSetup;

        /**
         * <p>The number of reserved cloud desktops in the desktop group.</p>
         */
        @NameInMap("AllowBufferCount")
        public Integer allowBufferCount;

        /**
         * <p>The number of sessions allowed for each cloud desktop in the multi-session desktop group.</p>
         */
        @NameInMap("BindAmount")
        public Integer bindAmount;

        /**
         * <p>The number of purchased cloud desktops. Valid values: 0 to 200.</p>
         */
        @NameInMap("BuyDesktopsCount")
        public Integer buyDesktopsCount;

        /**
         * <p>The remarks on the desktop group.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The maximum duration of the session. Unit: milliseconds.</p>
         */
        @NameInMap("ConnectDuration")
        public Long connectDuration;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the desktop group was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The user who creates the desktop group.</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The category of the data disk.</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The size of the data disk.</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The ID of the desktop group.</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the desktop group.</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>The ID of the directory, which is the same as the ID of the workspace.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The type of the directory.</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>The time when the desktop group expires.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The number of vGPUs.</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The GPU specifications.</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The maximum duration of the idle session. Unit: milliseconds.</p>
         */
        @NameInMap("IdleDisconnectDuration")
        public Long idleDisconnectDuration;

        /**
         * <p>The IDs of the images.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The retention period of a cloud desktop in the desktop group after the cloud desktop is disconnected. Unit: milliseconds.</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy of the multi-session desktop group.</p>
         */
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        /**
         * <p>The maximum number of cloud desktops that the desktop group can contain.</p>
         */
        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        /**
         * <p>The memory size.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The minimum number of desktops that the desktop group must retain.</p>
         */
        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        /**
         * <p>The ID of the Apsara File Storage NAS (NAS) file system.</p>
         */
        @NameInMap("NasFileSystemID")
        public String nasFileSystemID;

        /**
         * <p>The name of the NAS file system.</p>
         */
        @NameInMap("NasFileSystemName")
        public String nasFileSystemName;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The name of the workspace.</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The type of the workspace.</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The ID of the desktop template.</p>
         */
        @NameInMap("OwnBundleId")
        public String ownBundleId;

        /**
         * <p>The name of the desktop template.</p>
         */
        @NameInMap("OwnBundleName")
        public String ownBundleName;

        /**
         * <p>The type of the desktop group.</p>
         */
        @NameInMap("OwnType")
        public Integer ownType;

        /**
         * <p>The billing method of the desktop group.</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the security policy group.</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The ID of the policy with which the desktop group is associated.</p>
         */
        @NameInMap("PolicyGroupIds")
        public java.util.List<String> policyGroupIds;

        /**
         * <p>The name of the security policy group.</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The name of the policy.</p>
         */
        @NameInMap("PolicyGroupNames")
        public java.util.List<String> policyGroupNames;

        /**
         * <p>Indicates whether data roaming is enabled.</p>
         */
        @NameInMap("ProfileFollowSwitch")
        public Boolean profileFollowSwitch;

        /**
         * <p>The session usage threshold for the multi-session desktop group that has an auto scaling policy in effect.</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The type of the resource. Currently, only Elastic Compute Service (ECS) instances are supported.</p>
         */
        @NameInMap("ResType")
        public Integer resType;

        /**
         * <p>Indicates which type of the disk used by cloud desktops in the desktop group is reset.</p>
         */
        @NameInMap("ResetType")
        public Integer resetType;

        /**
         * <p>The details of the scheduled task.</p>
         */
        @NameInMap("ScaleTimerInfos")
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos> scaleTimerInfos;

        /**
         * <p>The status of the desktop group.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The period of time before the idle cloud desktop enters the Stopped state. When the specified period of time is reached, the idle cloud desktop automatically enters the Stopped state. If an end user connects to a cloud desktop that is in the Stopped state, the cloud desktop automatically restarts. Unit: milliseconds.</p>
         */
        @NameInMap("StopDuration")
        public Long stopDuration;

        /**
         * <p>The category of the system disk.</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The size of the system disk.</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The list of scheduled time for desktop group tasks.</p>
         */
        @NameInMap("TimerInfos")
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsTimerInfos> timerInfos;

        /**
         * <p>The information about the scheduled application.</p>
         */
        @NameInMap("TimingStrategyInfo")
        public String timingStrategyInfo;

        /**
         * <p>The version number of the desktop group.</p>
         */
        @NameInMap("Version")
        public Long version;

        public static GetDesktopGroupDetailResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            GetDesktopGroupDetailResponseBodyDesktops self = new GetDesktopGroupDetailResponseBodyDesktops();
            return TeaModel.build(map, self);
        }

        public GetDesktopGroupDetailResponseBodyDesktops setAllowAutoSetup(Integer allowAutoSetup) {
            this.allowAutoSetup = allowAutoSetup;
            return this;
        }
        public Integer getAllowAutoSetup() {
            return this.allowAutoSetup;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setAllowBufferCount(Integer allowBufferCount) {
            this.allowBufferCount = allowBufferCount;
            return this;
        }
        public Integer getAllowBufferCount() {
            return this.allowBufferCount;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setBindAmount(Integer bindAmount) {
            this.bindAmount = bindAmount;
            return this;
        }
        public Integer getBindAmount() {
            return this.bindAmount;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setBuyDesktopsCount(Integer buyDesktopsCount) {
            this.buyDesktopsCount = buyDesktopsCount;
            return this;
        }
        public Integer getBuyDesktopsCount() {
            return this.buyDesktopsCount;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setConnectDuration(Long connectDuration) {
            this.connectDuration = connectDuration;
            return this;
        }
        public Long getConnectDuration() {
            return this.connectDuration;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setDataDiskSize(String dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public String getDataDiskSize() {
            return this.dataDiskSize;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setDesktopGroupName(String desktopGroupName) {
            this.desktopGroupName = desktopGroupName;
            return this;
        }
        public String getDesktopGroupName() {
            return this.desktopGroupName;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setIdleDisconnectDuration(Long idleDisconnectDuration) {
            this.idleDisconnectDuration = idleDisconnectDuration;
            return this;
        }
        public Long getIdleDisconnectDuration() {
            return this.idleDisconnectDuration;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setKeepDuration(Long keepDuration) {
            this.keepDuration = keepDuration;
            return this;
        }
        public Long getKeepDuration() {
            return this.keepDuration;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setLoadPolicy(Integer loadPolicy) {
            this.loadPolicy = loadPolicy;
            return this;
        }
        public Integer getLoadPolicy() {
            return this.loadPolicy;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setMaxDesktopsCount(Integer maxDesktopsCount) {
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }
        public Integer getMaxDesktopsCount() {
            return this.maxDesktopsCount;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setMinDesktopsCount(Integer minDesktopsCount) {
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }
        public Integer getMinDesktopsCount() {
            return this.minDesktopsCount;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setNasFileSystemID(String nasFileSystemID) {
            this.nasFileSystemID = nasFileSystemID;
            return this;
        }
        public String getNasFileSystemID() {
            return this.nasFileSystemID;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setNasFileSystemName(String nasFileSystemName) {
            this.nasFileSystemName = nasFileSystemName;
            return this;
        }
        public String getNasFileSystemName() {
            return this.nasFileSystemName;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setOwnBundleId(String ownBundleId) {
            this.ownBundleId = ownBundleId;
            return this;
        }
        public String getOwnBundleId() {
            return this.ownBundleId;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setOwnBundleName(String ownBundleName) {
            this.ownBundleName = ownBundleName;
            return this;
        }
        public String getOwnBundleName() {
            return this.ownBundleName;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setOwnType(Integer ownType) {
            this.ownType = ownType;
            return this;
        }
        public Integer getOwnType() {
            return this.ownType;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setPolicyGroupIds(java.util.List<String> policyGroupIds) {
            this.policyGroupIds = policyGroupIds;
            return this;
        }
        public java.util.List<String> getPolicyGroupIds() {
            return this.policyGroupIds;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setPolicyGroupName(String policyGroupName) {
            this.policyGroupName = policyGroupName;
            return this;
        }
        public String getPolicyGroupName() {
            return this.policyGroupName;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setPolicyGroupNames(java.util.List<String> policyGroupNames) {
            this.policyGroupNames = policyGroupNames;
            return this;
        }
        public java.util.List<String> getPolicyGroupNames() {
            return this.policyGroupNames;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setProfileFollowSwitch(Boolean profileFollowSwitch) {
            this.profileFollowSwitch = profileFollowSwitch;
            return this;
        }
        public Boolean getProfileFollowSwitch() {
            return this.profileFollowSwitch;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setRatioThreshold(Float ratioThreshold) {
            this.ratioThreshold = ratioThreshold;
            return this;
        }
        public Float getRatioThreshold() {
            return this.ratioThreshold;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setResType(Integer resType) {
            this.resType = resType;
            return this;
        }
        public Integer getResType() {
            return this.resType;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setResetType(Integer resetType) {
            this.resetType = resetType;
            return this;
        }
        public Integer getResetType() {
            return this.resetType;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setScaleTimerInfos(java.util.List<GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos> scaleTimerInfos) {
            this.scaleTimerInfos = scaleTimerInfos;
            return this;
        }
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos> getScaleTimerInfos() {
            return this.scaleTimerInfos;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setStopDuration(Long stopDuration) {
            this.stopDuration = stopDuration;
            return this;
        }
        public Long getStopDuration() {
            return this.stopDuration;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setTimerInfos(java.util.List<GetDesktopGroupDetailResponseBodyDesktopsTimerInfos> timerInfos) {
            this.timerInfos = timerInfos;
            return this;
        }
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsTimerInfos> getTimerInfos() {
            return this.timerInfos;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setTimingStrategyInfo(String timingStrategyInfo) {
            this.timingStrategyInfo = timingStrategyInfo;
            return this;
        }
        public String getTimingStrategyInfo() {
            return this.timingStrategyInfo;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
