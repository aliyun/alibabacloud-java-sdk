// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeGlobalDesktopsResponseBody extends TeaModel {
    @NameInMap("Desktops")
    public java.util.List<DescribeGlobalDesktopsResponseBodyDesktops> desktops;

    @NameInMap("NextToken")
    public String nextToken;

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
         * <p>客户端类型，取值：</p>
         * <br>
         * <p>- macos：Mac客户端</p>
         * <p>- ios：IOS客户端</p>
         * <p>- android：Android客户端</p>
         * <p>- html5：Web客户端</p>
         * <p>- windows：Windows客户端</p>
         * <p>- linux：Linux客户端</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>客户端状态，取值：</p>
         * <br>
         * <p>- ON：允许登录</p>
         * <p>- OFF：不允许登录</p>
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
        @NameInMap("AllowClientSetting")
        public Boolean allowClientSetting;

        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("Enforce")
        public Boolean enforce;

        @NameInMap("ExecutionTime")
        public String executionTime;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("ResetType")
        public String resetType;

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
        @NameInMap("DiskId")
        public String diskId;

        @NameInMap("DiskSize")
        public Integer diskSize;

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
        @NameInMap("Channel")
        public String channel;

        @NameInMap("CurrentAppVersion")
        public String currentAppVersion;

        @NameInMap("Force")
        public Boolean force;

        @NameInMap("NewAppVersion")
        public String newAppVersion;

        @NameInMap("Project")
        public String project;

        @NameInMap("ReleaseNote")
        public String releaseNote;

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

        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class DescribeGlobalDesktopsResponseBodyDesktopsSessions extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

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
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>支持的客户端信息</p>
         */
        @NameInMap("Clients")
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsClients> clients;

        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("DesktopStatus")
        public String desktopStatus;

        @NameInMap("DesktopTimers")
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsDesktopTimers> desktopTimers;

        @NameInMap("DesktopType")
        public String desktopType;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("Disks")
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsDisks> disks;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("FotaUpdate")
        public DescribeGlobalDesktopsResponseBodyDesktopsFotaUpdate fotaUpdate;

        @NameInMap("GpuMemory")
        public Integer gpuMemory;

        @NameInMap("HibernationBeta")
        public Boolean hibernationBeta;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("LastStartTime")
        public String lastStartTime;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("ManagementFlags")
        public java.util.List<String> managementFlags;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("RealDesktopId")
        public String realDesktopId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SessionType")
        public String sessionType;

        @NameInMap("Sessions")
        public java.util.List<DescribeGlobalDesktopsResponseBodyDesktopsSessions> sessions;

        @NameInMap("SupportHibernation")
        public Boolean supportHibernation;

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

        public DescribeGlobalDesktopsResponseBodyDesktops setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
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
