// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryApplicationStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppInfo")
    public QueryApplicationStatusResponseBodyAppInfo appInfo;

    public static QueryApplicationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationStatusResponseBody self = new QueryApplicationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryApplicationStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryApplicationStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryApplicationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryApplicationStatusResponseBody setAppInfo(QueryApplicationStatusResponseBodyAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public QueryApplicationStatusResponseBodyAppInfo getAppInfo() {
        return this.appInfo;
    }

    public static class QueryApplicationStatusResponseBodyAppInfoEcuListEcu extends TeaModel {
        @NameInMap("EcuId")
        public String ecuId;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("DockerEnv")
        public Boolean dockerEnv;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("IpAddr")
        public String ipAddr;

        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        @NameInMap("AvailableMem")
        public Integer availableMem;

        public static QueryApplicationStatusResponseBodyAppInfoEcuListEcu build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoEcuListEcu self = new QueryApplicationStatusResponseBodyAppInfoEcuListEcu();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setAvailableCpu(Integer availableCpu) {
            this.availableCpu = availableCpu;
            return this;
        }
        public Integer getAvailableCpu() {
            return this.availableCpu;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setAvailableMem(Integer availableMem) {
            this.availableMem = availableMem;
            return this;
        }
        public Integer getAvailableMem() {
            return this.availableMem;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfoEcuList extends TeaModel {
        @NameInMap("Ecu")
        public java.util.List<QueryApplicationStatusResponseBodyAppInfoEcuListEcu> ecu;

        public static QueryApplicationStatusResponseBodyAppInfoEcuList build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoEcuList self = new QueryApplicationStatusResponseBodyAppInfoEcuList();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuList setEcu(java.util.List<QueryApplicationStatusResponseBodyAppInfoEcuListEcu> ecu) {
            this.ecu = ecu;
            return this;
        }
        public java.util.List<QueryApplicationStatusResponseBodyAppInfoEcuListEcu> getEcu() {
            return this.ecu;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfoEccListEcc extends TeaModel {
        @NameInMap("EccId")
        public String eccId;

        @NameInMap("EcuId")
        public String ecuId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppState")
        public Integer appState;

        @NameInMap("TaskState")
        public Integer taskState;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ContainerStatus")
        public String containerStatus;

        public static QueryApplicationStatusResponseBodyAppInfoEccListEcc build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoEccListEcc self = new QueryApplicationStatusResponseBodyAppInfoEccListEcc();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setEccId(String eccId) {
            this.eccId = eccId;
            return this;
        }
        public String getEccId() {
            return this.eccId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setAppState(Integer appState) {
            this.appState = appState;
            return this;
        }
        public Integer getAppState() {
            return this.appState;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setTaskState(Integer taskState) {
            this.taskState = taskState;
            return this;
        }
        public Integer getTaskState() {
            return this.taskState;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setContainerStatus(String containerStatus) {
            this.containerStatus = containerStatus;
            return this;
        }
        public String getContainerStatus() {
            return this.containerStatus;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfoEccList extends TeaModel {
        @NameInMap("Ecc")
        public java.util.List<QueryApplicationStatusResponseBodyAppInfoEccListEcc> ecc;

        public static QueryApplicationStatusResponseBodyAppInfoEccList build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoEccList self = new QueryApplicationStatusResponseBodyAppInfoEccList();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoEccList setEcc(java.util.List<QueryApplicationStatusResponseBodyAppInfoEccListEcc> ecc) {
            this.ecc = ecc;
            return this;
        }
        public java.util.List<QueryApplicationStatusResponseBodyAppInfoEccListEcc> getEcc() {
            return this.ecc;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfoGroupListGroup extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("PackageVersionId")
        public String packageVersionId;

        @NameInMap("AppVersionId")
        public String appVersionId;

        @NameInMap("GroupType")
        public Integer groupType;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static QueryApplicationStatusResponseBodyAppInfoGroupListGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoGroupListGroup self = new QueryApplicationStatusResponseBodyAppInfoGroupListGroup();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setPackageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            return this;
        }
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setGroupType(Integer groupType) {
            this.groupType = groupType;
            return this;
        }
        public Integer getGroupType() {
            return this.groupType;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfoGroupList extends TeaModel {
        @NameInMap("Group")
        public java.util.List<QueryApplicationStatusResponseBodyAppInfoGroupListGroup> group;

        public static QueryApplicationStatusResponseBodyAppInfoGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoGroupList self = new QueryApplicationStatusResponseBodyAppInfoGroupList();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupList setGroup(java.util.List<QueryApplicationStatusResponseBodyAppInfoGroupListGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<QueryApplicationStatusResponseBodyAppInfoGroupListGroup> getGroup() {
            return this.group;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord extends TeaModel {
        @NameInMap("DeployRecordId")
        public String deployRecordId;

        @NameInMap("EccId")
        public String eccId;

        @NameInMap("EcuId")
        public String ecuId;

        @NameInMap("PackageVersionId")
        public String packageVersionId;

        @NameInMap("PackageMd5")
        public String packageMd5;

        @NameInMap("CreateTime")
        public Long createTime;

        public static QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord self = new QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setDeployRecordId(String deployRecordId) {
            this.deployRecordId = deployRecordId;
            return this;
        }
        public String getDeployRecordId() {
            return this.deployRecordId;
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setEccId(String eccId) {
            this.eccId = eccId;
            return this;
        }
        public String getEccId() {
            return this.eccId;
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setPackageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            return this;
        }
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setPackageMd5(String packageMd5) {
            this.packageMd5 = packageMd5;
            return this;
        }
        public String getPackageMd5() {
            return this.packageMd5;
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfoDeployRecordList extends TeaModel {
        @NameInMap("DeployRecord")
        public java.util.List<QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord> deployRecord;

        public static QueryApplicationStatusResponseBodyAppInfoDeployRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoDeployRecordList self = new QueryApplicationStatusResponseBodyAppInfoDeployRecordList();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordList setDeployRecord(java.util.List<QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord> deployRecord) {
            this.deployRecord = deployRecord;
            return this;
        }
        public java.util.List<QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord> getDeployRecord() {
            return this.deployRecord;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfoApplication extends TeaModel {
        @NameInMap("ApplicationId")
        public String applicationId;

        @NameInMap("BuildPackageId")
        public Integer buildPackageId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Dockerize")
        public Boolean dockerize;

        @NameInMap("Email")
        public String email;

        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("LaunchTime")
        public Long launchTime;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        @NameInMap("UserId")
        public String userId;

        public static QueryApplicationStatusResponseBodyAppInfoApplication build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoApplication self = new QueryApplicationStatusResponseBodyAppInfoApplication();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setBuildPackageId(Integer buildPackageId) {
            this.buildPackageId = buildPackageId;
            return this;
        }
        public Integer getBuildPackageId() {
            return this.buildPackageId;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setDockerize(Boolean dockerize) {
            this.dockerize = dockerize;
            return this;
        }
        public Boolean getDockerize() {
            return this.dockerize;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setLaunchTime(Long launchTime) {
            this.launchTime = launchTime;
            return this;
        }
        public Long getLaunchTime() {
            return this.launchTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public QueryApplicationStatusResponseBodyAppInfoApplication setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryApplicationStatusResponseBodyAppInfo extends TeaModel {
        @NameInMap("EcuList")
        public QueryApplicationStatusResponseBodyAppInfoEcuList ecuList;

        @NameInMap("EccList")
        public QueryApplicationStatusResponseBodyAppInfoEccList eccList;

        @NameInMap("GroupList")
        public QueryApplicationStatusResponseBodyAppInfoGroupList groupList;

        @NameInMap("DeployRecordList")
        public QueryApplicationStatusResponseBodyAppInfoDeployRecordList deployRecordList;

        @NameInMap("Application")
        public QueryApplicationStatusResponseBodyAppInfoApplication application;

        public static QueryApplicationStatusResponseBodyAppInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfo self = new QueryApplicationStatusResponseBodyAppInfo();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfo setEcuList(QueryApplicationStatusResponseBodyAppInfoEcuList ecuList) {
            this.ecuList = ecuList;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoEcuList getEcuList() {
            return this.ecuList;
        }

        public QueryApplicationStatusResponseBodyAppInfo setEccList(QueryApplicationStatusResponseBodyAppInfoEccList eccList) {
            this.eccList = eccList;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoEccList getEccList() {
            return this.eccList;
        }

        public QueryApplicationStatusResponseBodyAppInfo setGroupList(QueryApplicationStatusResponseBodyAppInfoGroupList groupList) {
            this.groupList = groupList;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoGroupList getGroupList() {
            return this.groupList;
        }

        public QueryApplicationStatusResponseBodyAppInfo setDeployRecordList(QueryApplicationStatusResponseBodyAppInfoDeployRecordList deployRecordList) {
            this.deployRecordList = deployRecordList;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoDeployRecordList getDeployRecordList() {
            return this.deployRecordList;
        }

        public QueryApplicationStatusResponseBodyAppInfo setApplication(QueryApplicationStatusResponseBodyAppInfoApplication application) {
            this.application = application;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoApplication getApplication() {
            return this.application;
        }

    }

}
