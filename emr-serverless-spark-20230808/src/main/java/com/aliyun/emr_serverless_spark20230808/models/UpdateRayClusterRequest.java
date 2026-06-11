// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateRayClusterRequest extends TeaModel {
    /**
     * <p>Description of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Ray Cluster for dev.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Ray engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>ray-1.0.0 (Ray 2.47.1, Python 3.12)</p>
     */
    @NameInMap("displayReleaseVersion")
    public String displayReleaseVersion;

    /**
     * <p>The extra parameters. This must be in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extraParam")
    public String extraParam;

    /**
     * <p>The information about the head node of the Ray cluster.</p>
     */
    @NameInMap("headSpec")
    public UpdateRayClusterRequestHeadSpec headSpec;

    /**
     * <p>The name of the Ray cluster. The name must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>myRayCluster</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the network service.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("networkServiceName")
    public String networkServiceName;

    @NameInMap("volumeIds")
    public java.util.List<String> volumeIds;

    /**
     * <p>The information about the worker nodes of the Ray cluster. You can specify up to 50 groups.</p>
     */
    @NameInMap("workerSpec")
    public java.util.List<UpdateRayClusterRequestWorkerSpec> workerSpec;

    public static UpdateRayClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRayClusterRequest self = new UpdateRayClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRayClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRayClusterRequest setDisplayReleaseVersion(String displayReleaseVersion) {
        this.displayReleaseVersion = displayReleaseVersion;
        return this;
    }
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    public UpdateRayClusterRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public UpdateRayClusterRequest setHeadSpec(UpdateRayClusterRequestHeadSpec headSpec) {
        this.headSpec = headSpec;
        return this;
    }
    public UpdateRayClusterRequestHeadSpec getHeadSpec() {
        return this.headSpec;
    }

    public UpdateRayClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRayClusterRequest setNetworkServiceName(String networkServiceName) {
        this.networkServiceName = networkServiceName;
        return this;
    }
    public String getNetworkServiceName() {
        return this.networkServiceName;
    }

    public UpdateRayClusterRequest setVolumeIds(java.util.List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }
    public java.util.List<String> getVolumeIds() {
        return this.volumeIds;
    }

    public UpdateRayClusterRequest setWorkerSpec(java.util.List<UpdateRayClusterRequestWorkerSpec> workerSpec) {
        this.workerSpec = workerSpec;
        return this;
    }
    public java.util.List<UpdateRayClusterRequestWorkerSpec> getWorkerSpec() {
        return this.workerSpec;
    }

    public static class UpdateRayClusterRequestHeadSpec extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <p>Specifies whether to enable automatic scaling.</p>
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
         * <p>The idle timeout in seconds for workers. This parameter is effective only when automatic scaling is enabled.</p>
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

        public static UpdateRayClusterRequestHeadSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateRayClusterRequestHeadSpec self = new UpdateRayClusterRequestHeadSpec();
            return TeaModel.build(map, self);
        }

        public UpdateRayClusterRequestHeadSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public UpdateRayClusterRequestHeadSpec setEnableAutoScaling(Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        public UpdateRayClusterRequestHeadSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public UpdateRayClusterRequestHeadSpec setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
            this.idleTimeoutSeconds = idleTimeoutSeconds;
            return this;
        }
        public Integer getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        public UpdateRayClusterRequestHeadSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public UpdateRayClusterRequestHeadSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

    }

    public static class UpdateRayClusterRequestWorkerSpec extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
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
         * <p>The name of the worker group.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkerGroup1</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The maximum number of workers. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxReplica")
        public Integer maxReplica;

        /**
         * <p>The memory size. Unit: Gi.</p>
         * 
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The minimum number of workers. The minimum value is 1. This value must be less than or equal to maxReplica.</p>
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
         * <p>The number of workers. The minimum value is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The type of worker.</p>
         * 
         * <strong>example:</strong>
         * <p>CPU</p>
         */
        @NameInMap("workerType")
        public String workerType;

        public static UpdateRayClusterRequestWorkerSpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateRayClusterRequestWorkerSpec self = new UpdateRayClusterRequestWorkerSpec();
            return TeaModel.build(map, self);
        }

        public UpdateRayClusterRequestWorkerSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public UpdateRayClusterRequestWorkerSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public UpdateRayClusterRequestWorkerSpec setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateRayClusterRequestWorkerSpec setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public UpdateRayClusterRequestWorkerSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public UpdateRayClusterRequestWorkerSpec setMinReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }
        public Integer getMinReplica() {
            return this.minReplica;
        }

        public UpdateRayClusterRequestWorkerSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public UpdateRayClusterRequestWorkerSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public UpdateRayClusterRequestWorkerSpec setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

    }

}
