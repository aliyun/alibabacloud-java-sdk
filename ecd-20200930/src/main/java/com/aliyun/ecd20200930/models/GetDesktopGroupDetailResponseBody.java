// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopGroupDetailResponseBody extends TeaModel {
    // The information about the desktop group.
    @NameInMap("Desktops")
    public GetDesktopGroupDetailResponseBodyDesktops desktops;

    // The ID of the request.
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
        @NameInMap("Cron")
        public String cron;

        @NameInMap("KeepDuration")
        public Long keepDuration;

        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        @NameInMap("MinResAmount")
        public Integer minResAmount;

        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        @NameInMap("Type")
        public String type;

        public static GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos build(java.util.Map<String, ?> map) throws Exception {
            GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos self = new GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos();
            return TeaModel.build(map, self);
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
        // The cron expression.
        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("Forced")
        public Boolean forced;

        // The status of the scheduled task.
        @NameInMap("Status")
        public Integer status;

        // The type of the scheduled task.
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
        // Indicates whether the desktop group enables auto scale-out.
        @NameInMap("AllowAutoSetup")
        public Integer allowAutoSetup;

        // The number of idle cloud desktops that you allow the system to reserve.
        @NameInMap("AllowBufferCount")
        public Integer allowBufferCount;

        // The number of sessions allowed for each cloud desktop in the multi-session desktop group.
        @NameInMap("BindAmount")
        public Integer bindAmount;

        // The remarks of the desktop group.
        @NameInMap("Comments")
        public String comments;

        @NameInMap("ConnectDuration")
        public Long connectDuration;

        // The number of vCPUs.
        @NameInMap("Cpu")
        public Integer cpu;

        // The time when the desktop group was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The user that creates the desktop group.
        @NameInMap("Creator")
        public String creator;

        // The data disk type.
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        // The size of the data disk.
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        // The ID of the desktop group.
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        // The name of the desktop group.
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        // The ID of the directory, which is the same as the ID of the workspace.
        @NameInMap("DirectoryId")
        public String directoryId;

        // The type of the directory.
        @NameInMap("DirectoryType")
        public String directoryType;

        // The time when the desktop group expires.
        @NameInMap("ExpiredTime")
        public String expiredTime;

        // The number of GPUs.
        @NameInMap("GpuCount")
        public Float gpuCount;

        // The GPU type.
        @NameInMap("GpuSpec")
        public String gpuSpec;

        @NameInMap("IdleDisconnectDuration")
        public Long idleDisconnectDuration;

        // The retention period after the cloud desktop is disconnected. Unit: milliseconds.
        @NameInMap("KeepDuration")
        public Long keepDuration;

        // The load balancing policy of the multi-session desktop group.
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        // The maximum number of cloud desktops that the desktop group can hold.
        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        // The memory size.
        @NameInMap("Memory")
        public Long memory;

        // The minimum number of desktops that the desktop group must retain.
        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        @NameInMap("NasFileSystemID")
        public String nasFileSystemID;

        @NameInMap("NasFileSystemName")
        public String nasFileSystemName;

        // The ID of the workspace.
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        // The name of the workspace.
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        // The type of the workspace.
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        // The ID of the desktop template.
        @NameInMap("OwnBundleId")
        public String ownBundleId;

        // The name of the desktop template.
        @NameInMap("OwnBundleName")
        public String ownBundleName;

        // The type of the desktop group.
        @NameInMap("OwnType")
        public Integer ownType;

        // The billing method of the desktop group.
        @NameInMap("PayType")
        public String payType;

        // The ID of the security policy group.
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("PolicyGroupIds")
        public java.util.List<String> policyGroupIds;

        // The name of the security policy group.
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        @NameInMap("PolicyGroupNames")
        public java.util.List<String> policyGroupNames;

        @NameInMap("ProfileFollowSwitch")
        public Boolean profileFollowSwitch;

        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        // The type of the resource.
        @NameInMap("ResType")
        public Integer resType;

        // Indicates which type of the disk used by cloud desktops in the desktop group is reset.
        @NameInMap("ResetType")
        public Integer resetType;

        @NameInMap("ScaleTimerInfos")
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos> scaleTimerInfos;

        // The payment status of the desktop group.
        @NameInMap("Status")
        public Integer status;

        @NameInMap("StopDuration")
        public Long stopDuration;

        // The type of the system disk.
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        // The size of the system disk.
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        // The list of scheduled time for desktop group tasks.
        @NameInMap("TimerInfos")
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsTimerInfos> timerInfos;

        @NameInMap("TimingStrategyInfo")
        public String timingStrategyInfo;

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
