// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Application")
    public GetApplicationResponseBodyApplication application;

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

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setApplication(GetApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public GetApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public GetApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationResponseBodyApplication extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The current status of the Kubernetes application, which is used to determine whether the application is in a stable state. If the application is in an unstable state, related configuration operations are prohibited. Valid values:</p>
         * <br>
         * <p>*   ready: The application is in the ready state and can be changed.</p>
         * <p>*   progressive: The application is being changed.</p>
         * <p>*   pending: The application change is blocked.</p>
         * <p>*   failed: The application fails to be changed.</p>
         * <br>
         * <p>In these states, ready is a stable state and other states are unstable.</p>
         */
        @NameInMap("AppPhase")
        public String appPhase;

        /**
         * <p>The deployment type of the application. Valid values:</p>
         * <br>
         * <p>*   War: The application is deployed by using a WAR package.</p>
         * <p>*   FatJar: The application is deployed by using a JAR package.</p>
         * <p>*   Empty: The application is not deployed.</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
         */
        @NameInMap("BuildPackageId")
        public Long buildPackageId;

        /**
         * <p>The ID of the ECS cluster in which the application is deployed.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <br>
         * <p>*   0: regular Docker cluster</p>
         * <p>*   1: Swarm cluster</p>
         * <p>*   2: ECS cluster</p>
         * <p>*   3: Kubernetes cluster</p>
         * <p>*   4: cluster in which Pandora automatically registers applications</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The number of CPU cores.</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the application is a Docker application. Valid values:</p>
         * <br>
         * <p>*   false: The application is not a Docker application.</p>
         * <p>*   true: The application is a Docker application.</p>
         */
        @NameInMap("Dockerize")
        public Boolean dockerize;

        /**
         * <p>The email address of the account.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Indicates whether the port health check is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The port health check is enabled.</p>
         * <p>*   false: The port health check is disabled.</p>
         * <br>
         * <p>If the port health check is enabled, EDAS checks whether a port exists during application startup. If the port exists, the application is considered to have started.</p>
         */
        @NameInMap("EnablePortCheck")
        public Boolean enablePortCheck;

        /**
         * <p>Indicates whether the URL health check is enabled. Valid values:</p>
         * <br>
         * <p>*   true: The URL health check is enabled.</p>
         * <p>*   false: The URL health check is disabled.</p>
         * <br>
         * <p>If the URL health check is enabled, EDAS attempts to detect the specified URL during application startup. If EDAS detects the specified URL, the application is considered to have started.</p>
         */
        @NameInMap("EnableUrlCheck")
        public Boolean enableUrlCheck;

        /**
         * <p>The ID of the Internet-facing SLB instance that is bound to the application.</p>
         */
        @NameInMap("ExtSlbId")
        public String extSlbId;

        /**
         * <p>The IP address of the Internet-facing Server Load Balancer (SLB) instance that is bound to the application.</p>
         */
        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        /**
         * <p>The name of the Internet-facing SLB instance that is bound to the application.</p>
         */
        @NameInMap("ExtSlbName")
        public String extSlbName;

        @NameInMap("HaveManageAccess")
        public String haveManageAccess;

        /**
         * <p>The health check URL of the application.</p>
         */
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        /**
         * <p>The number of instances deployed with the application.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The memory size of the application instance. Unit: MB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace to which the application belongs.</p>
         */
        @NameInMap("NameSpace")
        public String nameSpace;

        /**
         * <p>The ID of the user who created the application.</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The service port of the application.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the region in which the application is deployed.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of running instances for the application.</p>
         */
        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        /**
         * <p>The ID of the internal-facing SLB instance that is bound to the application.</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The information about the internal-facing SLB instance that is bound to the application.</p>
         */
        @NameInMap("SlbInfo")
        public String slbInfo;

        /**
         * <p>The IP address of the internal-facing SLB instance that is bound to the application.</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The name of the internal-facing SLB instance that is bound to the application.</p>
         */
        @NameInMap("SlbName")
        public String slbName;

        /**
         * <p>The port of the internal-facing SLB instance that is bound to the application.</p>
         */
        @NameInMap("SlbPort")
        public Integer slbPort;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("UserId")
        public String userId;

        @NameInMap("WorkloadType")
        public String workloadType;

        public static GetApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyApplication self = new GetApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetApplicationResponseBodyApplication setAppPhase(String appPhase) {
            this.appPhase = appPhase;
            return this;
        }
        public String getAppPhase() {
            return this.appPhase;
        }

        public GetApplicationResponseBodyApplication setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public GetApplicationResponseBodyApplication setBuildPackageId(Long buildPackageId) {
            this.buildPackageId = buildPackageId;
            return this;
        }
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        public GetApplicationResponseBodyApplication setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetApplicationResponseBodyApplication setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public GetApplicationResponseBodyApplication setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public GetApplicationResponseBodyApplication setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyApplication setDockerize(Boolean dockerize) {
            this.dockerize = dockerize;
            return this;
        }
        public Boolean getDockerize() {
            return this.dockerize;
        }

        public GetApplicationResponseBodyApplication setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetApplicationResponseBodyApplication setEnablePortCheck(Boolean enablePortCheck) {
            this.enablePortCheck = enablePortCheck;
            return this;
        }
        public Boolean getEnablePortCheck() {
            return this.enablePortCheck;
        }

        public GetApplicationResponseBodyApplication setEnableUrlCheck(Boolean enableUrlCheck) {
            this.enableUrlCheck = enableUrlCheck;
            return this;
        }
        public Boolean getEnableUrlCheck() {
            return this.enableUrlCheck;
        }

        public GetApplicationResponseBodyApplication setExtSlbId(String extSlbId) {
            this.extSlbId = extSlbId;
            return this;
        }
        public String getExtSlbId() {
            return this.extSlbId;
        }

        public GetApplicationResponseBodyApplication setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public GetApplicationResponseBodyApplication setExtSlbName(String extSlbName) {
            this.extSlbName = extSlbName;
            return this;
        }
        public String getExtSlbName() {
            return this.extSlbName;
        }

        public GetApplicationResponseBodyApplication setHaveManageAccess(String haveManageAccess) {
            this.haveManageAccess = haveManageAccess;
            return this;
        }
        public String getHaveManageAccess() {
            return this.haveManageAccess;
        }

        public GetApplicationResponseBodyApplication setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public GetApplicationResponseBodyApplication setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public GetApplicationResponseBodyApplication setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public GetApplicationResponseBodyApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyApplication setNameSpace(String nameSpace) {
            this.nameSpace = nameSpace;
            return this;
        }
        public String getNameSpace() {
            return this.nameSpace;
        }

        public GetApplicationResponseBodyApplication setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetApplicationResponseBodyApplication setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetApplicationResponseBodyApplication setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetApplicationResponseBodyApplication setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public GetApplicationResponseBodyApplication setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public GetApplicationResponseBodyApplication setSlbInfo(String slbInfo) {
            this.slbInfo = slbInfo;
            return this;
        }
        public String getSlbInfo() {
            return this.slbInfo;
        }

        public GetApplicationResponseBodyApplication setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public GetApplicationResponseBodyApplication setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

        public GetApplicationResponseBodyApplication setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public GetApplicationResponseBodyApplication setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetApplicationResponseBodyApplication setWorkloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public String getWorkloadType() {
            return this.workloadType;
        }

    }

}
