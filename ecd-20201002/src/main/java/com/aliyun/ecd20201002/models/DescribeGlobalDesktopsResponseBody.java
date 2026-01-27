// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeGlobalDesktopsResponseBody extends TeaModel {
    /**
     * <p>The details about the cloud computer.</p>
     */
    @NameInMap("Desktops")
    public java.util.List<DescribeGlobalDesktopsResponseBodyDesktops> desktops;

    /**
     * <p>The token used to start the next query. If NextToken is empty, it indicates that there is no next query.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJkZWZhdWx0IjpbIjIwMjItMDgtMTdUM****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4686A731-D601-548C-83E2-4CB6371E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGlobalDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalDesktopsResponseBody self = new DescribeGlobalDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalDesktopsResponseBody setDesktops(java.util.List<DescribeGlobalDesktopsResponseBodyDesktops> desktops) {
        this.desktops = desktops;
        return this;
    }
    public java.util.List<DescribeGlobalDesktopsResponseBodyDesktops> getDesktops() {
        return this.desktops;
    }

    public DescribeGlobalDesktopsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGlobalDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGlobalDesktopsResponseBodyDesktopsClients extends TeaModel {
        /**
         * <p>The client type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>html5: the web client.</li>
         * <li>android: the Android client.</li>
         * <li>linux: Linux client.</li>
         * <li>ios: the iOS client.</li>
         * <li>windows: the Windows client.</li>
         * <li>macos: the macOS client.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The status of the client.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>OFF: does not allow logon.</li>
         * <li>ON: allows logon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeGlobalDesktopsResponseBodyDesktopsClients build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopsResponseBodyDesktopsClients self = new DescribeGlobalDesktopsResponseBodyDesktopsClients();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsClients setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsClients setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers extends TeaModel {
        /**
         * <p>Whether to allow clients to set policies.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        /**
         * <p>The CRON expression for the scheduled task.</p>
         * <p>For example, a <code>0 0 4 1/1 * ?</code> indicates that the operation is executed every day from 4:00 a.m. on the first day of each month.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 0 ? * 1</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>Indicates whether to forcibly execute the scheduled task. To <code>true</code> indicates that cloud computer and connection status detection are ignored, and scheduled tasks are forcibly executed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enforce")
        public Boolean enforce;

        /**
         * <p>The task duration.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T15:59Z</p>
         */
        @NameInMap("ExecutionTime")
        public String executionTime;

        /**
         * <p>The interval at which the monitoring data was queried. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The type of the scheduled task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HIBERNATE</li>
         * <li>SHUTDOWN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SHUTDOWN</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>For a reset task, you must set the reset type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RESET_TYPE_SYSTEM: resets the system disk.</li>
         * <li>RESET_TYPE_USER_DISK: resets the data disk.</li>
         * <li>RESET_TYPE_BOTH: resets the system disk and data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RESET_TYPE_BOTH</p>
         */
        @NameInMap("ResetType")
        public String resetType;

        /**
         * <p>The type of the scheduled task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>NoOperationDisconnect: scheduled disconnection upon inactivity.</li>
         * <li>NoConnectShutdown: connectionless shutdown.</li>
         * <li>TimerBoot: scheduled start.</li>
         * <li>TimerReset: scheduled reset.</li>
         * <li>NoOperationShutdown: scheduled shutdown upon inactivity.</li>
         * <li>TimerShutdown: Stops the cloud computers on schedule.</li>
         * <li>NoOperationReboot: scheduled restart upon inactivity.</li>
         * <li>TimerReboot: scheduled restart.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoConnectShutdown</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers self = new DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers setAllowClientSetting(Boolean allowClientSetting) {
            this.allowClientSetting = allowClientSetting;
            return this;
        }
        public Boolean getAllowClientSetting() {
            return this.allowClientSetting;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers setEnforce(Boolean enforce) {
            this.enforce = enforce;
            return this;
        }
        public Boolean getEnforce() {
            return this.enforce;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers setExecutionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public String getExecutionTime() {
            return this.executionTime;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers setResetType(String resetType) {
            this.resetType = resetType;
            return this;
        }
        public String getResetType() {
            return this.resetType;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

    public static class DescribeGlobalDesktopsResponseBodyDesktopsDisks extends TeaModel {
        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-jedbpr4sl9l37****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The disk type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>SYSTEM: a system disk.</li>
         * <li>DATA: a data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        public static DescribeGlobalDesktopsResponseBodyDesktopsDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopsResponseBodyDesktopsDisks self = new DescribeGlobalDesktopsResponseBodyDesktopsDisks();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate extends TeaModel {
        /**
         * <p>Subscription Channel</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The current version number of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0-D-20220102.xxxx</p>
         */
        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        /**
         * <p>Whether to force upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Force")
        public Boolean force;

        /**
         * <p>The version number of the application after the update.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0-R-20220307.xxxx</p>
         */
        @NameInMap("NewAppVersion")
        public String newAppVersion;

        @NameInMap("NewDcdVersion")
        public String newDcdVersion;

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>testProject</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The description of the version that can be upgraded.</p>
         */
        @NameInMap("ReleaseNote")
        public String releaseNote;

        /**
         * <p>The English release note for the new image version.</p>
         * 
         * <strong>example:</strong>
         * <p>Release note</p>
         */
        @NameInMap("ReleaseNoteEn")
        public String releaseNoteEn;

        /**
         * <p>The Japanese release note for the new image version.</p>
         * 
         * <strong>example:</strong>
         * <p>リリースノート</p>
         */
        @NameInMap("ReleaseNoteJp")
        public String releaseNoteJp;

        /**
         * <p>The size of the update package for the cloud computer image. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public String size;

        public static DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate self = new DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setCurrentAppVersion(String currentAppVersion) {
            this.currentAppVersion = currentAppVersion;
            return this;
        }
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setForce(Boolean force) {
            this.force = force;
            return this;
        }
        public Boolean getForce() {
            return this.force;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setNewAppVersion(String newAppVersion) {
            this.newAppVersion = newAppVersion;
            return this;
        }
        public String getNewAppVersion() {
            return this.newAppVersion;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setNewDcdVersion(String newDcdVersion) {
            this.newDcdVersion = newDcdVersion;
            return this;
        }
        public String getNewDcdVersion() {
            return this.newDcdVersion;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setReleaseNoteEn(String releaseNoteEn) {
            this.releaseNoteEn = releaseNoteEn;
            return this;
        }
        public String getReleaseNoteEn() {
            return this.releaseNoteEn;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setReleaseNoteJp(String releaseNoteJp) {
            this.releaseNoteJp = releaseNoteJp;
            return this;
        }
        public String getReleaseNoteJp() {
            return this.releaseNoteJp;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class DescribeGlobalDesktopsResponseBodyDesktopsSessions extends TeaModel {
        /**
         * <p>End user information.</p>
         * 
         * <strong>example:</strong>
         * <p>User1</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time when the session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-07T08:23Z</p>
         */
        @NameInMap("EstablishmentTime")
        public String establishmentTime;

        public static DescribeGlobalDesktopsResponseBodyDesktopsSessions build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopsResponseBodyDesktopsSessions self = new DescribeGlobalDesktopsResponseBodyDesktopsSessions();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktopsSessions setEstablishmentTime(String establishmentTime) {
            this.establishmentTime = establishmentTime;
            return this;
        }
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

    }

    public static class DescribeGlobalDesktopsResponseBodyDesktops extends TeaModel {
        /**
         * <p>The billing method of the cloud computer pool.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go</li>
         * <li>PrePaid: subscription</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The information about the supported clients.</p>
         */
        @NameInMap("Clients")
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsClients> clients;

        /**
         * <p>The state of the endpoint connection.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Connected</li>
         * <li>Disconnecting</li>
         * <li>Pending.</li>
         * <li>Connecting.</li>
         * <li>Disconnected.</li>
         * <li>Deleting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the cloud computer was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-06T08:28Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the cloud computer share.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-3uiojcc0j4kh7****</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p>The cloud compute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsmucyy****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesktopName</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The cloud computer status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The cloud computer timer object.</p>
         */
        @NameInMap("DesktopTimers")
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers> desktopTimers;

        /**
         * <p>The cloud computer type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd.basic.large</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The network ID of the office. Same as <code>OfficeSiteId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-jedbpr4sl9l37****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsDisks> disks;

        /**
         * <p>The names of end users.</p>
         * 
         * <strong>example:</strong>
         * <p>User1</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The list of end user.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The expiration time of the cloud computer.</p>
         * <ul>
         * <li>For a cloud computer that is a package year or month, the return value is meaningful.</li>
         * <li>For pay-as-you-go cloud computers, the <code>2099-12-31T15:59Z</code> is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2021-12-31T15:59Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The information about image update.</p>
         */
        @NameInMap("FotaUpdate")
        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate;

        /**
         * <p>The GPU memory size. For GPU-accelerated cloud computers, this return value is significant. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("GpuMemory")
        public Integer gpuMemory;

        /**
         * <p>Indicates whether this is a beta version of the hibernation feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HibernationBeta")
        public Boolean hibernationBeta;

        /**
         * <p>The hostname of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-4zfb6zj728hhr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The time when the cloud desktop was last started.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-13T15:59Z</p>
         */
        @NameInMap("LastStartTime")
        public String lastStartTime;

        /**
         * <p>The region name.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The list of cloud computer status.</p>
         */
        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        /**
         * <p>The memory of the cloud computer. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <p>The IDs of the office networks.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>OS Type</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("Os")
        public String os;

        @NameInMap("OsDescription")
        public String osDescription;

        /**
         * <p>The operating system.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Linux</li>
         * <li>Windows</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The OS platform.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>Ubuntu</li>
         * <li>UOS</li>
         * <li>CentOS</li>
         * <li>Windows Server 2019</li>
         * <li>Windows Server 2016</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ubuntu</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The cloud computer policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-9cktlowtxfl6****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The type of the protocol.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>High-definition Experience (HDX)</li>
         * <li>ASP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>If a shared cloud computer is assigned a real cloud computer, the ID of the cloud computer is displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-gx2x1dhsm****</p>
         */
        @NameInMap("RealDesktopId")
        public String realDesktopId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionLocation")
        public String regionLocation;

        /**
         * <p>The type of the session.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>SINGLE_SESSION</li>
         * <li>MULTIPLE_SESSION</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SINGLE_SESSION</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>The list of session information.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsSessions> sessions;

        /**
         * <p>Indicates whether hibernation is supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: supported</li>
         * <li>false: not supported</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportHibernation")
        public Boolean supportHibernation;

        /**
         * <p>The custom cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDesktop</p>
         */
        @NameInMap("UserCustomName")
        public String userCustomName;

        public static DescribeGlobalDesktopsResponseBodyDesktops build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalDesktopsResponseBodyDesktops self = new DescribeGlobalDesktopsResponseBodyDesktops();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setClients(java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsClients> clients) {
            this.clients = clients;
            return this;
        }
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsClients> getClients() {
            return this.clients;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setDesktopTimers(java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers> desktopTimers) {
            this.desktopTimers = desktopTimers;
            return this;
        }
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers> getDesktopTimers() {
            return this.desktopTimers;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setDisks(java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsDisks> getDisks() {
            return this.disks;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setFotaUpdate(DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate) {
            this.fotaUpdate = fotaUpdate;
            return this;
        }
        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate getFotaUpdate() {
            return this.fotaUpdate;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setGpuMemory(Integer gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Integer getGpuMemory() {
            return this.gpuMemory;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setHibernationBeta(Boolean hibernationBeta) {
            this.hibernationBeta = hibernationBeta;
            return this;
        }
        public Boolean getHibernationBeta() {
            return this.hibernationBeta;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setManagementFlags(java.util.List<String> managementFlags) {
            this.managementFlags = managementFlags;
            return this;
        }
        public java.util.List<String> getManagementFlags() {
            return this.managementFlags;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setOsDescription(String osDescription) {
            this.osDescription = osDescription;
            return this;
        }
        public String getOsDescription() {
            return this.osDescription;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setRealDesktopId(String realDesktopId) {
            this.realDesktopId = realDesktopId;
            return this;
        }
        public String getRealDesktopId() {
            return this.realDesktopId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setRegionLocation(String regionLocation) {
            this.regionLocation = regionLocation;
            return this;
        }
        public String getRegionLocation() {
            return this.regionLocation;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setSessions(java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsSessions> getSessions() {
            return this.sessions;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setSupportHibernation(Boolean supportHibernation) {
            this.supportHibernation = supportHibernation;
            return this;
        }
        public Boolean getSupportHibernation() {
            return this.supportHibernation;
        }

        public DescribeGlobalDesktopsResponseBodyDesktops setUserCustomName(String userCustomName) {
            this.userCustomName = userCustomName;
            return this;
        }
        public String getUserCustomName() {
            return this.userCustomName;
        }

    }

}
