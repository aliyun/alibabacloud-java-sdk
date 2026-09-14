// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateRayClusterRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Ray Cluster for dev.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The Ray DPI engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>ray-1.0.0 (Ray 2.47.1, Python 3.12)</p>
     */
    @NameInMap("displayReleaseVersion")
    public String displayReleaseVersion;

    /**
     * <p>The extra parameters. The value must be in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extraParam")
    public String extraParam;

    /**
     * <p>The Ray cluster head node information.</p>
     */
    @NameInMap("headSpec")
    public UpdateRayClusterRequestHeadSpec headSpec;

    /**
     * <p>The Ray cluster name. The name must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>myRayCluster</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The network connectivity name.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("networkServiceName")
    public String networkServiceName;

    /**
     * <p>The list of managed folder IDs to mount.</p>
     */
    @NameInMap("volumeIds")
    public java.util.List<String> volumeIds;

    /**
     * <p>The Ray cluster worker node information. A maximum of 50 groups are supported.</p>
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

    public static class UpdateRayClusterRequestHeadSpecGftConfig extends TeaModel {
        /**
         * <p>The Redis password.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("redisPassword")
        public String redisPassword;

        /**
         * <p>The Redis address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.4.5.6:6379</p>
         */
        @NameInMap("redisUrl")
        public String redisUrl;

        /**
         * <p>The Redis username.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("redisUsername")
        public String redisUsername;

        public static UpdateRayClusterRequestHeadSpecGftConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateRayClusterRequestHeadSpecGftConfig self = new UpdateRayClusterRequestHeadSpecGftConfig();
            return TeaModel.build(map, self);
        }

        public UpdateRayClusterRequestHeadSpecGftConfig setRedisPassword(String redisPassword) {
            this.redisPassword = redisPassword;
            return this;
        }
        public String getRedisPassword() {
            return this.redisPassword;
        }

        public UpdateRayClusterRequestHeadSpecGftConfig setRedisUrl(String redisUrl) {
            this.redisUrl = redisUrl;
            return this;
        }
        public String getRedisUrl() {
            return this.redisUrl;
        }

        public UpdateRayClusterRequestHeadSpecGftConfig setRedisUsername(String redisUsername) {
            this.redisUsername = redisUsername;
            return this;
        }
        public String getRedisUsername() {
            return this.redisUsername;
        }

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
         * <p>The Ray DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-1.2.0 (Ray 2.55.1, Python 3.12)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <p>Specifies whether to enable automatic scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableAutoScaling")
        public Boolean enableAutoScaling;

        /**
         * <p>The environment variables.</p>
         * 
         * <strong>example:</strong>
         * <p>MY_ENV=123456</p>
         */
        @NameInMap("env")
        public String env;

        /**
         * <p>The GCS Fault Tolerance configuration.</p>
         */
        @NameInMap("gftConfig")
        public UpdateRayClusterRequestHeadSpecGftConfig gftConfig;

        /**
         * <p>Specifies whether to enable GCS Fault Tolerance.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("gftEnabled")
        public Boolean gftEnabled;

        /**
         * <p>The GPU instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn6i-c4g1.xlarge</p>
         */
        @NameInMap("gpuSpec")
        public String gpuSpec;

        /**
         * <p>The idle timeout period of workers after automatic scaling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("idleTimeoutSeconds")
        public Integer idleTimeoutSeconds;

        /**
         * <p>The memory size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The Ray startup parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>--num-cpus=0</p>
         */
        @NameInMap("rayStartParams")
        public String rayStartParams;

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

        public UpdateRayClusterRequestHeadSpec setDisplayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        public UpdateRayClusterRequestHeadSpec setEnableAutoScaling(Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        public UpdateRayClusterRequestHeadSpec setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public UpdateRayClusterRequestHeadSpec setGftConfig(UpdateRayClusterRequestHeadSpecGftConfig gftConfig) {
            this.gftConfig = gftConfig;
            return this;
        }
        public UpdateRayClusterRequestHeadSpecGftConfig getGftConfig() {
            return this.gftConfig;
        }

        public UpdateRayClusterRequestHeadSpec setGftEnabled(Boolean gftEnabled) {
            this.gftEnabled = gftEnabled;
            return this;
        }
        public Boolean getGftEnabled() {
            return this.gftEnabled;
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

        public UpdateRayClusterRequestHeadSpec setRayStartParams(String rayStartParams) {
            this.rayStartParams = rayStartParams;
            return this;
        }
        public String getRayStartParams() {
            return this.rayStartParams;
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
         * <p>The DPI engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-1.2.0 (Ray 2.55.1, Python 3.12)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <p>The Ray environment variables.</p>
         * 
         * <strong>example:</strong>
         * <p>MY_ENV=123456</p>
         */
        @NameInMap("env")
        public String env;

        /**
         * <p>The GPU instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn6i-c4g1.xlarge</p>
         */
        @NameInMap("gpuSpec")
        public String gpuSpec;

        /**
         * <p>The worker group name.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkerGroup1</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The maximum number of workers. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxReplica")
        public Integer maxReplica;

        /**
         * <p>The memory size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The minimum number of workers. Minimum value: 1. The value must be less than or equal to maxReplica.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minReplica")
        public Integer minReplica;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>root_queue</p>
         */
        @NameInMap("queueName")
        public String queueName;

        /**
         * <p>The Ray startup parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>--num-cpus=0</p>
         */
        @NameInMap("rayStartParams")
        public String rayStartParams;

        /**
         * <p>The number of workers. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <p>The worker type.</p>
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

        public UpdateRayClusterRequestWorkerSpec setDisplayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        public UpdateRayClusterRequestWorkerSpec setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
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

        public UpdateRayClusterRequestWorkerSpec setRayStartParams(String rayStartParams) {
            this.rayStartParams = rayStartParams;
            return this;
        }
        public String getRayStartParams() {
            return this.rayStartParams;
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
