// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopGroupDetailResponseBody extends TeaModel {
    /**
     * <p>The shared cloud desktop information.</p>
     */
    @NameInMap("Desktops")
    public GetDesktopGroupDetailResponseBodyDesktops desktops;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1B5268CE-5EB3-545F-9F38-A8BCF710****</p>
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
         * <p>One of the scaling policy parameters: the number of cloud computers to purchase. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BuyResAmount")
        public Integer buyResAmount;

        /**
         * <p>The cron expression of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The retention period after a session is disconnected. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
         * <p>When a session is disconnected intentionally by the user or unexpectedly due to other factors, the retention period starts from the time of disconnection. If the user does not reconnect to the session within this retention period, the session is logged off and unsaved data is destroyed. If the user successfully reconnects within this retention period, the user can enter the original session and access the data before the disconnection.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy for multi-session shared cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        /**
         * <p>One of the scaling policy parameters: the maximum number of cloud computers. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResAmount")
        public Integer maxResAmount;

        /**
         * <p>One of the scaling policy parameters: the minimum number of cloud computers. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinResAmount")
        public Integer minResAmount;

        /**
         * <p>The session usage threshold, which is used as the trigger for automatic scaling of multi-session shared cloud computers. The session usage is calculated by using the following formula:</p>
         * <p><code>Session usage = Number of attached sessions / (Total number of cloud computers × Maximum number of sessions supported per cloud computer) × 100%</code></p>
         * <p>When the session usage reaches this threshold, new cloud computers are created. If the session usage does not reach this threshold, excess cloud computers are deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The scheduled task type.</p>
         * 
         * <strong>example:</strong>
         * <p>rise</p>
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
         * <p>The cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 58 11 ? * 2</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Specifies whether to forcibly execute the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Forced")
        public Boolean forced;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The scheduled task type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>Specifies whether automatic creation is allowed for subscription shared cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowAutoSetup")
        public Integer allowAutoSetup;

        /**
         * <p>This parameter applies only to pay-as-you-go shared cloud desktops and indicates the number of cloud desktops that are always reserved in the started and idle state for connection. Valid values:</p>
         * <ul>
         * <li>0: no reservation</li>
         * <li>N: reserve N cloud desktops (1 ≤ N ≤ 100)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowBufferCount")
        public Integer allowBufferCount;

        /**
         * <p>The number of concurrent sessions allowed per cloud desktop in multi-session shared cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BindAmount")
        public Integer bindAmount;

        /**
         * <p>This parameter applies only to subscription shared cloud computers and indicates the initial number of cloud computers purchased. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BuyDesktopsCount")
        public Integer buyDesktopsCount;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The maximum duration for a session to remain connected. When the session connection duration reaches this value, the session is automatically disconnected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        @NameInMap("ConnectDuration")
        public Long connectDuration;

        /**
         * <p>The number of vCPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The creation time. The time follows the ISO 8601 standard in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-06T08:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The Alibaba Cloud account ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>155177335370****</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The user disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The user disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The ID of the shared cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-3uiojcc0j4kh7****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the shared cloud desktop to query.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudComputerPool01</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>The directory ID (office network ID).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The directory type.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>The environment ID. This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>adifa****</p>
         */
        @NameInMap("EnvId")
        public String envId;

        /**
         * <p>The environment type. This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The expiration time of the subscription shared cloud computer. The time is in the ISO 8601 standard (UTC time).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The list of expiration times.</p>
         */
        @NameInMap("ExpiredTimes")
        public java.util.List<String> expiredTimes;

        /**
         * <p>The number of GPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The GPU specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA T4</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The maximum idle time before a user session is disconnected. If no keyboard or mouse operations are performed within this maximum duration after a user session is connected, the session is disconnected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900000</p>
         */
        @NameInMap("IdleDisconnectDuration")
        public Long idleDisconnectDuration;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The retention period after a session is disconnected. Unit: milliseconds. Valid values: 180000 (3 minutes) to 345600000 (4 days). A value of 0 indicates that the session is always retained.</p>
         * <p>When a session is disconnected intentionally by the user or unexpectedly due to other factors, the retention period starts from the time of disconnection. If the user does not reconnect to the session within this retention period, the session is logged off and unsaved data is destroyed. If the user successfully reconnects within this retention period, the user can enter the original session and access the data before the disconnection.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy for multi-session shared cloud desktops.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        /**
         * <ul>
         * <li>For pay-as-you-go shared cloud desktops, this parameter indicates the maximum number of cloud desktops that can be created.</li>
         * <li>For subscription shared cloud desktops, this parameter indicates the sum of the initially purchased cloud desktops (<code>BuyDesktopsCount</code>) and the number of cloud desktops allowed for automatic creation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <ul>
         * <li>For pay-as-you-go shared cloud desktops, this parameter indicates the minimum number of cloud desktops to create.</li>
         * <li>For subscription shared cloud desktops, this parameter is equivalent to <code>BuyDesktopsCount</code> and indicates the number of initially purchased cloud desktops.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        /**
         * <p>The ID of the NAS file system used for the user data roaming feature.</p>
         * 
         * <strong>example:</strong>
         * <p>0783b4****</p>
         */
        @NameInMap("NasFileSystemID")
        public String nasFileSystemID;

        /**
         * <p>The name of the NAS file system used for the user data roaming feature.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("NasFileSystemName")
        public String nasFileSystemName;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-990541****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The name of the office network to which the shared cloud desktop belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department Office Network</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The account system type of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The operating system type of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The ID of the cloud desktop template.</p>
         * 
         * <strong>example:</strong>
         * <p>b-1se9fb37r5tfq****</p>
         */
        @NameInMap("OwnBundleId")
        public String ownBundleId;

        /**
         * <p>The name of the cloud desktop template.</p>
         * 
         * <strong>example:</strong>
         * <p>BundleDemo</p>
         */
        @NameInMap("OwnBundleName")
        public String ownBundleName;

        /**
         * <p>The shared cloud desktop type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OwnType")
        public Integer ownType;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the policy associated with the shared cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-9cktlowtxfl6****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The list of policy IDs associated with the shared cloud computer.</p>
         */
        @NameInMap("PolicyGroupIds")
        public java.util.List<String> policyGroupIds;

        /**
         * <p>The policy name associated with the shared cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>All enabled policy</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The list of policy names associated with the shared cloud computer.</p>
         */
        @NameInMap("PolicyGroupNames")
        public java.util.List<String> policyGroupNames;

        /**
         * <p>Specifies whether to enable user data roaming.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ProfileFollowSwitch")
        public Boolean profileFollowSwitch;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The session usage threshold, which is used as the trigger condition for auto scaling of multi-session shared cloud desktops. The session usage is calculated by using the following formula:</p>
         * <p><code>Session usage = Number of attached sessions / (Total number of cloud desktop resources × Maximum number of sessions supported per cloud desktop) × 100%</code></p>
         * <p>When the session usage reaches this threshold, new cloud desktops are created. When the session usage does not reach this threshold, excess cloud desktops are deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The resource type. Currently, only ECS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResType")
        public Integer resType;

        /**
         * <p>The cloud desktop reset type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResetType")
        public Integer resetType;

        /**
         * <p>The scheduled task information.</p>
         */
        @NameInMap("ScaleTimerInfos")
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos> scaleTimerInfos;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SessionType")
        public Integer sessionType;

        /**
         * <p>The status of the shared cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The idle shutdown time. When the idle time of the cloud desktop reaches this value, the cloud desktop is automatically shut down. If a user connects after the shutdown, the cloud desktop is automatically started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("StopDuration")
        public Long stopDuration;

        /**
         * <p>The system cloud disk type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The list of scheduled times.</p>
         */
        @NameInMap("TimerInfos")
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsTimerInfos> timerInfos;

        /**
         * <p>The scheduled application information.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("TimingStrategyInfo")
        public String timingStrategyInfo;

        /**
         * <p>The version number of the shared cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

        public GetDesktopGroupDetailResponseBodyDesktops setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public GetDesktopGroupDetailResponseBodyDesktops setExpiredTimes(java.util.List<String> expiredTimes) {
            this.expiredTimes = expiredTimes;
            return this;
        }
        public java.util.List<String> getExpiredTimes() {
            return this.expiredTimes;
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

        public GetDesktopGroupDetailResponseBodyDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
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

        public GetDesktopGroupDetailResponseBodyDesktops setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
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

        public GetDesktopGroupDetailResponseBodyDesktops setSessionType(Integer sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public Integer getSessionType() {
            return this.sessionType;
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
