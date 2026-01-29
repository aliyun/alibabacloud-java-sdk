// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayClusterResponseBody extends TeaModel {
    @NameInMap("rayClusters")
    public java.util.List<ListRayClusterResponseBodyRayClusters> rayClusters;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRayClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRayClusterResponseBody self = new ListRayClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRayClusterResponseBody setRayClusters(java.util.List<ListRayClusterResponseBodyRayClusters> rayClusters) {
        this.rayClusters = rayClusters;
        return this;
    }
    public java.util.List<ListRayClusterResponseBodyRayClusters> getRayClusters() {
        return this.rayClusters;
    }

    public ListRayClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRayClusterResponseBodyRayClustersHeadSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableAutoScaling")
        public Boolean enableAutoScaling;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("idleTimeoutSeconds")
        public Integer idleTimeoutSeconds;

        /**
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        public static ListRayClusterResponseBodyRayClustersHeadSpec build(java.util.Map<String, ?> map) throws Exception {
            ListRayClusterResponseBodyRayClustersHeadSpec self = new ListRayClusterResponseBodyRayClustersHeadSpec();
            return TeaModel.build(map, self);
        }

        public ListRayClusterResponseBodyRayClustersHeadSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListRayClusterResponseBodyRayClustersHeadSpec setEnableAutoScaling(Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        public ListRayClusterResponseBodyRayClustersHeadSpec setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
            this.idleTimeoutSeconds = idleTimeoutSeconds;
            return this;
        }
        public Integer getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        public ListRayClusterResponseBodyRayClustersHeadSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListRayClusterResponseBodyRayClustersHeadSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListRayClusterResponseBodyRayClustersHeadSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

    public static class ListRayClusterResponseBodyRayClustersWorkerSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>Group1</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxReplica")
        public Integer maxReplica;

        /**
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minReplica")
        public Integer minReplica;

        /**
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("workerType")
        public String workerType;

        public static ListRayClusterResponseBodyRayClustersWorkerSpec build(java.util.Map<String, ?> map) throws Exception {
            ListRayClusterResponseBodyRayClustersWorkerSpec self = new ListRayClusterResponseBodyRayClustersWorkerSpec();
            return TeaModel.build(map, self);
        }

        public ListRayClusterResponseBodyRayClustersWorkerSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListRayClusterResponseBodyRayClustersWorkerSpec setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListRayClusterResponseBodyRayClustersWorkerSpec setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public ListRayClusterResponseBodyRayClustersWorkerSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListRayClusterResponseBodyRayClustersWorkerSpec setMinReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }
        public Integer getMinReplica() {
            return this.minReplica;
        }

        public ListRayClusterResponseBodyRayClustersWorkerSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListRayClusterResponseBodyRayClustersWorkerSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public ListRayClusterResponseBodyRayClustersWorkerSpec setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

    }

    public static class ListRayClusterResponseBodyRayClusters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ray-uiulpgow9xljimm1</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>1723722279800</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>202077646755123991</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("creatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://emr-spark-ray-gateway-cn-hangzhou.aliyuncs.com?token=xxxxxxxxx">https://emr-spark-ray-gateway-cn-hangzhou.aliyuncs.com?token=xxxxxxxxx</a></p>
         */
        @NameInMap("dashboardUrl")
        public String dashboardUrl;

        /**
         * <strong>example:</strong>
         * <p>Ray Cluster for dev.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ray-1.0.0 (Ray 2.47.1, Python 3.12)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <strong>example:</strong>
         * <p>ray://emr-spark-ray-gateway-cn-hanghzou-internal.emr.aliyuncs.com:80</p>
         */
        @NameInMap("grpcEndpoint")
        public String grpcEndpoint;

        @NameInMap("headSpec")
        public ListRayClusterResponseBodyRayClustersHeadSpec headSpec;

        /**
         * <strong>example:</strong>
         * <p>ray-uiulpgow9xljimm1-xxxxxxx</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("modified")
        public Boolean modified;

        /**
         * <strong>example:</strong>
         * <p>1723722279800</p>
         */
        @NameInMap("modifiedTime")
        public Long modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>202077646755123991</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("modifierName")
        public String modifierName;

        /**
         * <strong>example:</strong>
         * <p>testRayCluster</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("networkServiceName")
        public String networkServiceName;

        /**
         * <strong>example:</strong>
         * <p>1723722279800</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("userId")
        public String userId;

        @NameInMap("workerSpec")
        public java.util.List<ListRayClusterResponseBodyRayClustersWorkerSpec> workerSpec;

        public static ListRayClusterResponseBodyRayClusters build(java.util.Map<String, ?> map) throws Exception {
            ListRayClusterResponseBodyRayClusters self = new ListRayClusterResponseBodyRayClusters();
            return TeaModel.build(map, self);
        }

        public ListRayClusterResponseBodyRayClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListRayClusterResponseBodyRayClusters setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRayClusterResponseBodyRayClusters setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListRayClusterResponseBodyRayClusters setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListRayClusterResponseBodyRayClusters setDashboardUrl(String dashboardUrl) {
            this.dashboardUrl = dashboardUrl;
            return this;
        }
        public String getDashboardUrl() {
            return this.dashboardUrl;
        }

        public ListRayClusterResponseBodyRayClusters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRayClusterResponseBodyRayClusters setDisplayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        public ListRayClusterResponseBodyRayClusters setGrpcEndpoint(String grpcEndpoint) {
            this.grpcEndpoint = grpcEndpoint;
            return this;
        }
        public String getGrpcEndpoint() {
            return this.grpcEndpoint;
        }

        public ListRayClusterResponseBodyRayClusters setHeadSpec(ListRayClusterResponseBodyRayClustersHeadSpec headSpec) {
            this.headSpec = headSpec;
            return this;
        }
        public ListRayClusterResponseBodyRayClustersHeadSpec getHeadSpec() {
            return this.headSpec;
        }

        public ListRayClusterResponseBodyRayClusters setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRayClusterResponseBodyRayClusters setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListRayClusterResponseBodyRayClusters setModified(Boolean modified) {
            this.modified = modified;
            return this;
        }
        public Boolean getModified() {
            return this.modified;
        }

        public ListRayClusterResponseBodyRayClusters setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public ListRayClusterResponseBodyRayClusters setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListRayClusterResponseBodyRayClusters setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListRayClusterResponseBodyRayClusters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRayClusterResponseBodyRayClusters setNetworkServiceName(String networkServiceName) {
            this.networkServiceName = networkServiceName;
            return this;
        }
        public String getNetworkServiceName() {
            return this.networkServiceName;
        }

        public ListRayClusterResponseBodyRayClusters setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListRayClusterResponseBodyRayClusters setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRayClusterResponseBodyRayClusters setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListRayClusterResponseBodyRayClusters setWorkerSpec(java.util.List<ListRayClusterResponseBodyRayClustersWorkerSpec> workerSpec) {
            this.workerSpec = workerSpec;
            return this;
        }
        public java.util.List<ListRayClusterResponseBodyRayClustersWorkerSpec> getWorkerSpec() {
            return this.workerSpec;
        }

    }

}
