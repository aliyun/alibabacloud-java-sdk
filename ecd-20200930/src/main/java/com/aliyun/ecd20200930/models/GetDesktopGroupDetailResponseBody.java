// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopGroupDetailResponseBody extends TeaModel {
    /**
     * <p>The information about the cloud computer pool.</p>
     */
    @NameInMap("Desktops")
    public GetDesktopGroupDetailResponseBodyDesktops desktops;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The number of cloud computers that you purchase in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BuyResAmount")
        public Integer buyResAmount;

        /**
         * <p>The cron expression for the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The duration that is retained after the session is disconnected. Unit: milliseconds. Valid values: 180000 to 345600000. That is, the session can be retained for 3 to 5760 minutes (4 days). If you specify the value to 0, the session is permanently retained.</p>
         * <p>When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can still access data of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>600000</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy of the multi-session cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: depth-first</li>
         * <li>1: breadth-first</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LoadPolicy")
        public Integer loadPolicy;

        /**
         * <p>The maximum number of cloud computers in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxResAmount")
        public Integer maxResAmount;

        /**
         * <p>The minimum number of cloud computers in the cloud computer pool. This parameter is one of the auto scaling parameters. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinResAmount")
        public Integer minResAmount;

        /**
         * <p>The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session cloud computer pool. To calculate the ratio of connected sessions, use the following formula:</p>
         * <p><code>Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%</code></p>
         * <p>If the ratio of connected sessions is greater than the specified value, new cloud computers are created. If the ratio of connected sessions is smaller than the specified value, idle cloud computers are deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The type of the scheduled task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>drop: decline policy</li>
         * <li>normal: normal policy</li>
         * <li>peak: peak hour policy</li>
         * <li>rise: rise policy</li>
         * </ul>
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
         * <p>Indicates whether the scheduled task is forcibly executed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Forced")
        public Boolean forced;

        /**
         * <p>The status of the cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: enabled</li>
         * <li>2: disabled</li>
         * <li>3: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the scheduled task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: scheduled reset</li>
         * <li>2: scheduled startup</li>
         * <li>3: scheduled stop</li>
         * <li>4: scheduled restart</li>
         * </ul>
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
         * <p>Indicates whether cloud computers can be automatically created in the subscription cloud computer pool.</p>
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
         * <p>The number of cloud computers that is allowed to be reserved in the pay-as-you-go cloud computer pool. Valid values:</p>
         * <ul>
         * <li>0: does not allow the system to reserve cloud computers.</li>
         * <li>N: allows the system to reserve N cloud computers. (1≤ N ≤ 100)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllowBufferCount")
        public Integer allowBufferCount;

        /**
         * <p>The number of concurrent sessions that is allowed for each cloud computer in a multi-session cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindAmount")
        public Integer bindAmount;

        /**
         * <ul>
         * <li>This parameter has different meanings based on the billing method of the cloud computer pool. For a subscription pool, this parameter indicates the number of cloud computers that you purchase in the pool. Valid values: 0 to 200.</li>
         * <li>For a pay-as-you-go pool, this parameter indicates the minimum number of cloud computers that you can create in the pool. Default value: 1. Valid values: 0 to <code>MaxDesktopsCount</code>.</li>
         * </ul>
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
         * <p>for students</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The maximum period of time during which the session is connected. When the specified maximum period of time is reached, the session is automatically disconnected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("ConnectDuration")
        public Long connectDuration;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the desktop group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-06T08:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The Alibaba Cloud account that creates the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>155177335370****</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The category of the user disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <p>The user disk capacity. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DataDiskSize")
        public String dataDiskSize;

        /**
         * <p>The ID of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-3uiojcc0j4kh7****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The name of the cloud computer pool that is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>DesktopGroupDemo</p>
         */
        @NameInMap("DesktopGroupName")
        public String desktopGroupName;

        /**
         * <p>The ID of the directory or office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The type of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>The time when the subscription cloud computer pool expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The number of vGPUs.</p>
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
         * <p>After an end user connects to a cloud computer, the session is established. If the system does not detect any inputs from the keyboard or mouse within the specified period of time, the session is closed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900000</p>
         */
        @NameInMap("IdleDisconnectDuration")
        public Long idleDisconnectDuration;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The amount of time to retain a session after it is disconnected. Unit: milliseconds. Valid values: 180000 to 345600000. That is, the session can be retained for 3 to 5760 minutes (4 days). If you specify the value to 0, the session is permanently retained.</p>
         * <p>When a session is disconnected, take note of the following situations: If an end user does not resume the session within the specified duration, the session is closed and all unsaved data is cleared. If the end user resumes the session within the specified duration, the end user can still access data of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("KeepDuration")
        public Long keepDuration;

        /**
         * <p>The load balancing policy of the multi-session cloud computer pool.</p>
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
        public Integer loadPolicy;

        /**
         * <p>The maximum number of cloud computers that can be housed in the pay-as-you-go cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The maximum number of cloud computers that can be automatically created in the subscription cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        /**
         * <p>The ID of the Apsara File Storage NAS (NAS) file system for the user data roaming feature.</p>
         * 
         * <strong>example:</strong>
         * <p>0783b4****</p>
         */
        @NameInMap("NasFileSystemID")
        public String nasFileSystemID;

        /**
         * <p>The name of the NAS file system for the user data roaming feature.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("NasFileSystemName")
        public String nasFileSystemName;

        /**
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-990541****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The name of the office network in which the cloud computer pool resides.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The office network type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PERSONAL: individual office network</li>
         * <li>SIMPLE: convenience office network</li>
         * <li>AD_CONNECTOR: enterprise Active Directory (AD) office network</li>
         * <li>RAM: Resource Access Management (RAM)-based office network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The ID of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>b-1se9fb37r5tfq****</p>
         */
        @NameInMap("OwnBundleId")
        public String ownBundleId;

        /**
         * <p>The name of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>BundleDemo</p>
         */
        @NameInMap("OwnBundleName")
        public String ownBundleName;

        /**
         * <p>The type of the cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: individual (single session)</li>
         * <li>1: shared (multiple sessions)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OwnType")
        public Integer ownType;

        /**
         * <p>The billing method.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PostPaid: pay-as-you-go.</p>
         * </li>
         * <li><p>PrePaid: subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the policy that is associated with the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-9cktlowtxfl6****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The IDs of policies that are associated with the cloud computer pool.</p>
         */
        @NameInMap("PolicyGroupIds")
        public java.util.List<String> policyGroupIds;

        /**
         * <p>The name of the policy that is associated with the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("PolicyGroupName")
        public String policyGroupName;

        /**
         * <p>The names of policies that are associated with the cloud computer pool.</p>
         */
        @NameInMap("PolicyGroupNames")
        public java.util.List<String> policyGroupNames;

        /**
         * <p>Indicates whether user data roaming is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ProfileFollowSwitch")
        public Boolean profileFollowSwitch;

        /**
         * <p>The threshold for the ratio of connected sessions. This parameter is the condition that triggers auto scaling in a multi-session cloud computer pool. To calculate the ratio of connected sessions, use the following formula:</p>
         * <p><code>Ratio of connected sessions = Number of connected sessions/(Total number of cloud computers × Maximum number of sessions allowed for each cloud computer) × 100%</code></p>
         * <p>If the ratio of connected sessions is greater than the specified value, new cloud computers are created. If the ratio of connected sessions is smaller than the specified value, idle cloud computers are deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("RatioThreshold")
        public Float ratioThreshold;

        /**
         * <p>The type of the resource. Only Elastic Compute Service (ECS) instances are supported.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>0: ECS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResType")
        public Integer resType;

        /**
         * <p>The disk reset type of the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: does not reset disks.</li>
         * <li>1: resets only the system disk.</li>
         * <li>2: resets only the user disk.</li>
         * <li>3: resets the system disk and the user disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResetType")
        public Integer resetType;

        /**
         * <p>Details of the scheduled tasks.</p>
         */
        @NameInMap("ScaleTimerInfos")
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsScaleTimerInfos> scaleTimerInfos;

        /**
         * <p>The payment status of the cloud computer pool.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: unpaid</li>
         * <li>1: paid</li>
         * <li>2: overdue or expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The period of time before the idle cloud computer enters the Stopped state. If the specified value is reached, the cloud computer is automatically stopped. If an end user connects to the stopped cloud computer, the cloud computer automatically starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>180000</p>
         */
        @NameInMap("StopDuration")
        public Long stopDuration;

        /**
         * <p>The category of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <p>The system disk capacity. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The list of scheduled points in time for desktop group tasks.</p>
         */
        @NameInMap("TimerInfos")
        public java.util.List<GetDesktopGroupDetailResponseBodyDesktopsTimerInfos> timerInfos;

        /**
         * <p>The information about the scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("TimingStrategyInfo")
        public String timingStrategyInfo;

        /**
         * <p>The version number of the cloud computer pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
