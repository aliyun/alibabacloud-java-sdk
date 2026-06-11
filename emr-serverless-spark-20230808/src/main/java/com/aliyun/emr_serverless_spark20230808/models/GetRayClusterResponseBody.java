// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRayClusterResponseBody extends TeaModel {
    /**
     * <p>The ID of the Ray cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>ray-k7nm8ahl5te4tg91</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>The time when the cluster was created. This is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1750327083303</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The UID of the user who created the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>202077646755523991</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The nickname of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("creatorName")
    public String creatorName;

    /**
     * <p>The URL of the Ray Dashboard for this cluster.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://emr-ray-gateway-cn-hangzhou.aliyuncs.com/workspace/w-xxxxxxxx/raycluster/ray-xxxxxx/dashboard?token=xxxxxx">https://emr-ray-gateway-cn-hangzhou.aliyuncs.com/workspace/w-xxxxxxxx/raycluster/ray-xxxxxx/dashboard?token=xxxxxx</a></p>
     */
    @NameInMap("dashboardUrl")
    public String dashboardUrl;

    /**
     * <p>The description of the Ray cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Ray Cluster for dev.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The version of the Ray engine.</p>
     * 
     * <strong>example:</strong>
     * <p>ray-1.0.0 (Ray 2.47.1, Python 3.12)</p>
     */
    @NameInMap("displayReleaseVersion")
    public String displayReleaseVersion;

    /**
     * <p>Additional parameters in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extraParam")
    public String extraParam;

    /**
     * <p>The gRPC endpoint for the internal network. You can also use the domain name in this endpoint to submit Ray jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>ray://emr-spark-ray-gateway-cn-hangzhou-internal.emr.aliyuncs.com:80</p>
     */
    @NameInMap("grpcEndpoint")
    public String grpcEndpoint;

    /**
     * <p>The configuration of the head node.</p>
     */
    @NameInMap("headSpec")
    public GetRayClusterResponseBodyHeadSpec headSpec;

    /**
     * <p>The ID of the Ray cluster node.</p>
     * 
     * <strong>example:</strong>
     * <p>ray-k7nm8ahl5te4tg93-xxxxxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The list of nodes in the Ray cluster.</p>
     */
    @NameInMap("instances")
    public java.util.List<GetRayClusterResponseBodyInstances> instances;

    /**
     * <p>The public endpoint for submitting Ray jobs.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://emr-spark-ray-gateway-cn-hangzhou.aliyuncs.com">https://emr-spark-ray-gateway-cn-hangzhou.aliyuncs.com</a></p>
     */
    @NameInMap("jobUrl")
    public String jobUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="http://emr-spark-ray-gateway-cn-hangzhou-internal.emr.aliyuncs.com">http://emr-spark-ray-gateway-cn-hangzhou-internal.emr.aliyuncs.com</a></p>
     */
    @NameInMap("jobUrlInner")
    public String jobUrlInner;

    /**
     * <p>The error message. Returned when <code>state</code> is <code>Error</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Indicates whether the configuration was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("modified")
    public Boolean modified;

    /**
     * <p>The time when the cluster was last updated. This is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1754274541693</p>
     */
    @NameInMap("modifiedTime")
    public Long modifiedTime;

    /**
     * <p>The UID of the user who last updated the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>202077646755523991</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <p>The nickname of the modifier.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("modifierName")
    public String modifierName;

    /**
     * <p>The name of the Ray cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>myRayCluster</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the network connection.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("networkServiceName")
    public String networkServiceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The time when the cluster started. This is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1750327083303</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The session state. Valid values:</p>
     * <ul>
     * <li><p>Starting: The session is starting.</p>
     * </li>
     * <li><p>Running: The session is running.</p>
     * </li>
     * <li><p>Stopping: The session is being stopped.</p>
     * </li>
     * <li><p>Stopped: The session is stopped.</p>
     * </li>
     * <li><p>Error: The session has failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The authentication token for submitting Ray jobs. Add this token to the request header in the format <code>&quot;ray-token&quot;: &quot;token&quot;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1d06484d3b424f7fa4ab7082a4076da2</p>
     */
    @NameInMap("submitToken")
    public String submitToken;

    /**
     * <p>The ID of the Alibaba Cloud account that created the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789012</p>
     */
    @NameInMap("userId")
    public String userId;

    @NameInMap("volumeIds")
    public java.util.List<String> volumeIds;

    /**
     * <p>The list of worker node group configurations.</p>
     */
    @NameInMap("workerSpec")
    public java.util.List<GetRayClusterResponseBodyWorkerSpec> workerSpec;

    public static GetRayClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRayClusterResponseBody self = new GetRayClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRayClusterResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetRayClusterResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetRayClusterResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetRayClusterResponseBody setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public GetRayClusterResponseBody setDashboardUrl(String dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
        return this;
    }
    public String getDashboardUrl() {
        return this.dashboardUrl;
    }

    public GetRayClusterResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRayClusterResponseBody setDisplayReleaseVersion(String displayReleaseVersion) {
        this.displayReleaseVersion = displayReleaseVersion;
        return this;
    }
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    public GetRayClusterResponseBody setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public GetRayClusterResponseBody setGrpcEndpoint(String grpcEndpoint) {
        this.grpcEndpoint = grpcEndpoint;
        return this;
    }
    public String getGrpcEndpoint() {
        return this.grpcEndpoint;
    }

    public GetRayClusterResponseBody setHeadSpec(GetRayClusterResponseBodyHeadSpec headSpec) {
        this.headSpec = headSpec;
        return this;
    }
    public GetRayClusterResponseBodyHeadSpec getHeadSpec() {
        return this.headSpec;
    }

    public GetRayClusterResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRayClusterResponseBody setInstances(java.util.List<GetRayClusterResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<GetRayClusterResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public GetRayClusterResponseBody setJobUrl(String jobUrl) {
        this.jobUrl = jobUrl;
        return this;
    }
    public String getJobUrl() {
        return this.jobUrl;
    }

    public GetRayClusterResponseBody setJobUrlInner(String jobUrlInner) {
        this.jobUrlInner = jobUrlInner;
        return this;
    }
    public String getJobUrlInner() {
        return this.jobUrlInner;
    }

    public GetRayClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRayClusterResponseBody setModified(Boolean modified) {
        this.modified = modified;
        return this;
    }
    public Boolean getModified() {
        return this.modified;
    }

    public GetRayClusterResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public GetRayClusterResponseBody setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public GetRayClusterResponseBody setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public GetRayClusterResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRayClusterResponseBody setNetworkServiceName(String networkServiceName) {
        this.networkServiceName = networkServiceName;
        return this;
    }
    public String getNetworkServiceName() {
        return this.networkServiceName;
    }

    public GetRayClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRayClusterResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetRayClusterResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetRayClusterResponseBody setSubmitToken(String submitToken) {
        this.submitToken = submitToken;
        return this;
    }
    public String getSubmitToken() {
        return this.submitToken;
    }

    public GetRayClusterResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetRayClusterResponseBody setVolumeIds(java.util.List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }
    public java.util.List<String> getVolumeIds() {
        return this.volumeIds;
    }

    public GetRayClusterResponseBody setWorkerSpec(java.util.List<GetRayClusterResponseBodyWorkerSpec> workerSpec) {
        this.workerSpec = workerSpec;
        return this;
    }
    public java.util.List<GetRayClusterResponseBodyWorkerSpec> getWorkerSpec() {
        return this.workerSpec;
    }

    public static class GetRayClusterResponseBodyHeadSpec extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <p>Specifies whether auto scaling is enabled for worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableAutoScaling")
        public Boolean enableAutoScaling;

        /**
         * <strong>example:</strong>
         * <p>ecs.gn6i-c4g1.xlarge</p>
         */
        @NameInMap("gpuSpec")
        public String gpuSpec;

        /**
         * <p>The idle timeout period for worker nodes, in seconds. Applies only when auto scaling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("idleTimeoutSeconds")
        public Integer idleTimeoutSeconds;

        /**
         * <p>The memory size. Unit: Gi.</p>
         * 
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        public static GetRayClusterResponseBodyHeadSpec build(java.util.Map<String, ?> map) throws Exception {
            GetRayClusterResponseBodyHeadSpec self = new GetRayClusterResponseBodyHeadSpec();
            return TeaModel.build(map, self);
        }

        public GetRayClusterResponseBodyHeadSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public GetRayClusterResponseBodyHeadSpec setEnableAutoScaling(Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        public GetRayClusterResponseBodyHeadSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public GetRayClusterResponseBodyHeadSpec setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
            this.idleTimeoutSeconds = idleTimeoutSeconds;
            return this;
        }
        public Integer getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        public GetRayClusterResponseBodyHeadSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetRayClusterResponseBodyHeadSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetRayClusterResponseBodyHeadSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

    public static class GetRayClusterResponseBodyInstances extends TeaModel {
        /**
         * <p>The exit code of the main container.</p>
         * 
         * <strong>example:</strong>
         * <p>137</p>
         */
        @NameInMap("containerExitCode")
        public Integer containerExitCode;

        /**
         * <p>The state of the main container.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("containerState")
        public String containerState;

        /**
         * <p>The status message of the main container.</p>
         * 
         * <strong>example:</strong>
         * <p>ContainerExit</p>
         */
        @NameInMap("containerStateMessage")
        public String containerStateMessage;

        /**
         * <p>Additional information about the main container state.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("containerStateReason")
        public String containerStateReason;

        /**
         * <p>The time when the node was created. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735870116167</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-uiulpgow9xljim10-head-7cgta</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The status message of the node pod.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The phase of the node pod.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("phase")
        public String phase;

        /**
         * <p>Additional information about the node.</p>
         * 
         * <strong>example:</strong>
         * <p>OOMKilled</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>The time when the node started. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1762946698000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The node type.</p>
         * 
         * <strong>example:</strong>
         * <p>Head</p>
         */
        @NameInMap("type")
        public String type;

        public static GetRayClusterResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            GetRayClusterResponseBodyInstances self = new GetRayClusterResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public GetRayClusterResponseBodyInstances setContainerExitCode(Integer containerExitCode) {
            this.containerExitCode = containerExitCode;
            return this;
        }
        public Integer getContainerExitCode() {
            return this.containerExitCode;
        }

        public GetRayClusterResponseBodyInstances setContainerState(String containerState) {
            this.containerState = containerState;
            return this;
        }
        public String getContainerState() {
            return this.containerState;
        }

        public GetRayClusterResponseBodyInstances setContainerStateMessage(String containerStateMessage) {
            this.containerStateMessage = containerStateMessage;
            return this;
        }
        public String getContainerStateMessage() {
            return this.containerStateMessage;
        }

        public GetRayClusterResponseBodyInstances setContainerStateReason(String containerStateReason) {
            this.containerStateReason = containerStateReason;
            return this;
        }
        public String getContainerStateReason() {
            return this.containerStateReason;
        }

        public GetRayClusterResponseBodyInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRayClusterResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRayClusterResponseBodyInstances setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRayClusterResponseBodyInstances setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetRayClusterResponseBodyInstances setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetRayClusterResponseBodyInstances setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetRayClusterResponseBodyInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetRayClusterResponseBodyWorkerSpec extends TeaModel {
        /**
         * <p>The number of CPU cores per worker node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>ecs.gn6i-c4g1.xlarge</p>
         */
        @NameInMap("gpuSpec")
        public String gpuSpec;

        /**
         * <p>The name of the worker node group.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkerGroup1</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The maximum number of worker nodes in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxReplica")
        public Integer maxReplica;

        /**
         * <p>The memory size per worker node. Unit: Gi.</p>
         * 
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The minimum number of worker nodes in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minReplica")
        public Integer minReplica;

        /**
         * <p>The name of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The number of worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The type of the worker node group.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("workerType")
        public String workerType;

        public static GetRayClusterResponseBodyWorkerSpec build(java.util.Map<String, ?> map) throws Exception {
            GetRayClusterResponseBodyWorkerSpec self = new GetRayClusterResponseBodyWorkerSpec();
            return TeaModel.build(map, self);
        }

        public GetRayClusterResponseBodyWorkerSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public GetRayClusterResponseBodyWorkerSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public GetRayClusterResponseBodyWorkerSpec setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetRayClusterResponseBodyWorkerSpec setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public GetRayClusterResponseBodyWorkerSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetRayClusterResponseBodyWorkerSpec setMinReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }
        public Integer getMinReplica() {
            return this.minReplica;
        }

        public GetRayClusterResponseBodyWorkerSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetRayClusterResponseBodyWorkerSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public GetRayClusterResponseBodyWorkerSpec setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

    }

}
