// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryApplicationStatusResponseBody extends TeaModel {
    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("AppInfo")
    public QueryApplicationStatusResponseBodyAppInfo appInfo;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryApplicationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationStatusResponseBody self = new QueryApplicationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryApplicationStatusResponseBody setAppInfo(QueryApplicationStatusResponseBodyAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public QueryApplicationStatusResponseBodyAppInfo getAppInfo() {
        return this.appInfo;
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

    public static class QueryApplicationStatusResponseBodyAppInfoApplication extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
         */
        @NameInMap("BuildPackageId")
        public Integer buildPackageId;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The number of CPU cores used by the application.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether the application is a Docker application.</p>
         */
        @NameInMap("Dockerize")
        public Boolean dockerize;

        /**
         * <p>The email address of the user who created the application.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The health check URL.</p>
         */
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        /**
         * <p>The number of application instances.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The time when the application was launched. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("LaunchTime")
        public Long launchTime;

        /**
         * <p>The memory size.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the user who created the application.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The mobile number of the user who created the application.</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The port used by the application.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of application instances that are running.</p>
         */
        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
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

    public static class QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord extends TeaModel {
        /**
         * <p>The time when the deployment record was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the deployment record.</p>
         */
        @NameInMap("DeployRecordId")
        public String deployRecordId;

        /**
         * <p>The unique ID of the ECC.</p>
         */
        @NameInMap("EccId")
        public String eccId;

        /**
         * <p>The unique ID of the ECU.</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The MD5 hash value of the deployment package.</p>
         */
        @NameInMap("PackageMd5")
        public String packageMd5;

        /**
         * <p>The version of the deployment package that was used to deploy an application in the instance group.</p>
         */
        @NameInMap("PackageVersionId")
        public String packageVersionId;

        public static QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord self = new QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
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

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setPackageMd5(String packageMd5) {
            this.packageMd5 = packageMd5;
            return this;
        }
        public String getPackageMd5() {
            return this.packageMd5;
        }

        public QueryApplicationStatusResponseBodyAppInfoDeployRecordListDeployRecord setPackageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            return this;
        }
        public String getPackageVersionId() {
            return this.packageVersionId;
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

    public static class QueryApplicationStatusResponseBodyAppInfoEccListEcc extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The status of the application instance. Valid values:</p>
         * <br>
         * <p>*   0: AGENT_OFF: indicates that the agent is offline.</p>
         * <p>*   1: STOPPED: indicates that the application is stopped.</p>
         * <p>*   3: RUNNING_BUT_URL_FAILED: indicates that the health check failed.</p>
         * <p>*   7: RUNNING: indicates that the application is running.</p>
         */
        @NameInMap("AppState")
        public Integer appState;

        /**
         * <p>The status of the container.</p>
         */
        @NameInMap("ContainerStatus")
        public String containerStatus;

        /**
         * <p>The time when the ECC was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The unique ID of the ECC.</p>
         */
        @NameInMap("EccId")
        public String eccId;

        /**
         * <p>The unique ID of the ECU.</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The ID of the instance group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The private IP address of the ECU.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The state of the latest task initiated on the application instance. Valid values:</p>
         * <br>
         * <p>*   0: UNKNOWN: indicates that the state of the latest task is unknown.</p>
         * <p>*   1: PROCESSING: indicates that the latest task is being processed.</p>
         * <p>*   2: SUCCESS: indicates that the latest task is executed.</p>
         * <p>*   3: FAILED: indicates that the latest task failed.</p>
         */
        @NameInMap("TaskState")
        public Integer taskState;

        /**
         * <p>The time when the ECC was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static QueryApplicationStatusResponseBodyAppInfoEccListEcc build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoEccListEcc self = new QueryApplicationStatusResponseBodyAppInfoEccListEcc();
            return TeaModel.build(map, self);
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

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setContainerStatus(String containerStatus) {
            this.containerStatus = containerStatus;
            return this;
        }
        public String getContainerStatus() {
            return this.containerStatus;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
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

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setTaskState(Integer taskState) {
            this.taskState = taskState;
            return this;
        }
        public Integer getTaskState() {
            return this.taskState;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEccListEcc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
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

    public static class QueryApplicationStatusResponseBodyAppInfoEcuListEcu extends TeaModel {
        /**
         * <p>The number of available CPU cores.</p>
         */
        @NameInMap("AvailableCpu")
        public Integer availableCpu;

        /**
         * <p>The size of the available memory.</p>
         */
        @NameInMap("AvailableMem")
        public Integer availableMem;

        /**
         * <p>The time when the ECU was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Indicates whether Docker is installed.</p>
         */
        @NameInMap("DockerEnv")
        public Boolean dockerEnv;

        /**
         * <p>The unique ID of the ECU. You can run the `dmidecode` command on the ECS instance to query the ECU ID.</p>
         */
        @NameInMap("EcuId")
        public String ecuId;

        /**
         * <p>The ID of the group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the last heartbeat detection was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("HeartbeatTime")
        public Long heartbeatTime;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The private IP address of the ECU.</p>
         */
        @NameInMap("IpAddr")
        public String ipAddr;

        /**
         * <p>The name of the ECU.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether the ECU is online.</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The time when the ECU was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user associated with the ECU.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static QueryApplicationStatusResponseBodyAppInfoEcuListEcu build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoEcuListEcu self = new QueryApplicationStatusResponseBodyAppInfoEcuListEcu();
            return TeaModel.build(map, self);
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

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setDockerEnv(Boolean dockerEnv) {
            this.dockerEnv = dockerEnv;
            return this;
        }
        public Boolean getDockerEnv() {
            return this.dockerEnv;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setEcuId(String ecuId) {
            this.ecuId = ecuId;
            return this;
        }
        public String getEcuId() {
            return this.ecuId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setHeartbeatTime(Long heartbeatTime) {
            this.heartbeatTime = heartbeatTime;
            return this;
        }
        public Long getHeartbeatTime() {
            return this.heartbeatTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryApplicationStatusResponseBodyAppInfoEcuListEcu setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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

    public static class QueryApplicationStatusResponseBodyAppInfoGroupListGroup extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The ID of the change process for application deployment in the instance group.</p>
         */
        @NameInMap("AppVersionId")
        public String appVersionId;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the instance group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the instance group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the instance group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the instance group. Valid values:</p>
         * <br>
         * <p>*   0: default group</p>
         * <p>*   1: self-managed group</p>
         * <p>*   2: canary release group</p>
         */
        @NameInMap("GroupType")
        public Integer groupType;

        /**
         * <p>The version of the deployment package that was used to deploy an application in the instance group.</p>
         */
        @NameInMap("PackageVersionId")
        public String packageVersionId;

        /**
         * <p>The time when the instance group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static QueryApplicationStatusResponseBodyAppInfoGroupListGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfoGroupListGroup self = new QueryApplicationStatusResponseBodyAppInfoGroupListGroup();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
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

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setGroupType(Integer groupType) {
            this.groupType = groupType;
            return this;
        }
        public Integer getGroupType() {
            return this.groupType;
        }

        public QueryApplicationStatusResponseBodyAppInfoGroupListGroup setPackageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            return this;
        }
        public String getPackageVersionId() {
            return this.packageVersionId;
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

    public static class QueryApplicationStatusResponseBodyAppInfo extends TeaModel {
        /**
         * <p>The basic information about the application.</p>
         */
        @NameInMap("Application")
        public QueryApplicationStatusResponseBodyAppInfoApplication application;

        /**
         * <p>The information about deployment records.</p>
         */
        @NameInMap("DeployRecordList")
        public QueryApplicationStatusResponseBodyAppInfoDeployRecordList deployRecordList;

        /**
         * <p>The information about elastic compute containers (ECCs).</p>
         */
        @NameInMap("EccList")
        public QueryApplicationStatusResponseBodyAppInfoEccList eccList;

        /**
         * <p>The information about elastic compute units (ECUs).</p>
         */
        @NameInMap("EcuList")
        public QueryApplicationStatusResponseBodyAppInfoEcuList ecuList;

        /**
         * <p>The information about the instance groups.</p>
         */
        @NameInMap("GroupList")
        public QueryApplicationStatusResponseBodyAppInfoGroupList groupList;

        public static QueryApplicationStatusResponseBodyAppInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationStatusResponseBodyAppInfo self = new QueryApplicationStatusResponseBodyAppInfo();
            return TeaModel.build(map, self);
        }

        public QueryApplicationStatusResponseBodyAppInfo setApplication(QueryApplicationStatusResponseBodyAppInfoApplication application) {
            this.application = application;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoApplication getApplication() {
            return this.application;
        }

        public QueryApplicationStatusResponseBodyAppInfo setDeployRecordList(QueryApplicationStatusResponseBodyAppInfoDeployRecordList deployRecordList) {
            this.deployRecordList = deployRecordList;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoDeployRecordList getDeployRecordList() {
            return this.deployRecordList;
        }

        public QueryApplicationStatusResponseBodyAppInfo setEccList(QueryApplicationStatusResponseBodyAppInfoEccList eccList) {
            this.eccList = eccList;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoEccList getEccList() {
            return this.eccList;
        }

        public QueryApplicationStatusResponseBodyAppInfo setEcuList(QueryApplicationStatusResponseBodyAppInfoEcuList ecuList) {
            this.ecuList = ecuList;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoEcuList getEcuList() {
            return this.ecuList;
        }

        public QueryApplicationStatusResponseBodyAppInfo setGroupList(QueryApplicationStatusResponseBodyAppInfoGroupList groupList) {
            this.groupList = groupList;
            return this;
        }
        public QueryApplicationStatusResponseBodyAppInfoGroupList getGroupList() {
            return this.groupList;
        }

    }

}
