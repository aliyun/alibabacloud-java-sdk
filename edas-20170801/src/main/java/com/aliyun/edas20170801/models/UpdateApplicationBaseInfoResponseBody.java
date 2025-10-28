// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationBaseInfoResponseBody extends TeaModel {
    /**
     * <p>The applications that you want to modify.</p>
     */
    @NameInMap("Applcation")
    public UpdateApplicationBaseInfoResponseBodyApplcation applcation;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D16979DC-4D42-**************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateApplicationBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationBaseInfoResponseBody self = new UpdateApplicationBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationBaseInfoResponseBody setApplcation(UpdateApplicationBaseInfoResponseBodyApplcation applcation) {
        this.applcation = applcation;
        return this;
    }
    public UpdateApplicationBaseInfoResponseBodyApplcation getApplcation() {
        return this.applcation;
    }

    public UpdateApplicationBaseInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateApplicationBaseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateApplicationBaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateApplicationBaseInfoResponseBodyApplcation extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>c627c157-560d-43ff-<strong><strong>-</strong></strong>********</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The deployment type of the application. Valid values:</p>
         * <ul>
         * <li>War: The application is deployed by using a WAR package.</li>
         * <li>FatJar: The application is deployed by using a JAR package.</li>
         * <li>Image: The application is deployed by using an image.</li>
         * <li>If this parameter is empty, the application is not deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FatJar</p>
         */
        @NameInMap("ApplicationType")
        public String applicationType;

        /**
         * <p>The build package number of Enterprise Distributed Application Service (EDAS) Container.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("BuildPackageId")
        public Long buildPackageId;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>d7730a49-629a-47bd-<strong><strong>-f45eb01f</strong></strong></p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li>0: normal Docker cluster</li>
         * <li>1: Swarm cluster</li>
         * <li>2: ECS cluster</li>
         * <li>3: self-managed Kubernetes cluster in EDAS</li>
         * <li>4: cluster in which Pandora automatically registers applications</li>
         * <li>5: Container Service for Kubernetes (ACK) clusters</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ClusterType")
        public Integer clusterType;

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The time when the application was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1577259573911</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the application is a Docker application.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Dockerize")
        public Boolean dockerize;

        /**
         * <p>The ID of the Internet-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ace93*******</p>
         */
        @NameInMap("ExtSlbId")
        public String extSlbId;

        /**
         * <p>The IP address of the Internet-facing Server Load Balancer (SLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>39.97.XX.XX</p>
         */
        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        /**
         * <p>The name of the Internet-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ExtSlbName")
        public String extSlbName;

        /**
         * <p>The health check URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.XX.XX:8080/_etc.html">http://127.0.XX.XX:8080/_etc.html</a></p>
         */
        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        /**
         * <p>The number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The size of memory configured for an application instance. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owner of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@aliyun_XXX.com">test@aliyun_XXX.com</a></p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The port used by the application.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:****</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of running application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        /**
         * <p>The ID of the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>a3d4*******</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The IP address of the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("SlbIp")
        public String slbIp;

        /**
         * <p>The name of the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SlbName")
        public String slbName;

        /**
         * <p>The port used by the internal-facing SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("SlbPort")
        public Integer slbPort;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>edas_com***@****.***</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static UpdateApplicationBaseInfoResponseBodyApplcation build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationBaseInfoResponseBodyApplcation self = new UpdateApplicationBaseInfoResponseBodyApplcation();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setBuildPackageId(Long buildPackageId) {
            this.buildPackageId = buildPackageId;
            return this;
        }
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setDockerize(Boolean dockerize) {
            this.dockerize = dockerize;
            return this;
        }
        public Boolean getDockerize() {
            return this.dockerize;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setExtSlbId(String extSlbId) {
            this.extSlbId = extSlbId;
            return this;
        }
        public String getExtSlbId() {
            return this.extSlbId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setExtSlbName(String extSlbName) {
            this.extSlbName = extSlbName;
            return this;
        }
        public String getExtSlbName() {
            return this.extSlbName;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
