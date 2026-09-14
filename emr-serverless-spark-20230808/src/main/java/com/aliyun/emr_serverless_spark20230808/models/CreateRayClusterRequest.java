// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateRayClusterRequest extends TeaModel {
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
     * <p>The parameters of the Ray cluster head node.</p>
     */
    @NameInMap("headSpec")
    public CreateRayClusterRequestHeadSpec headSpec;

    /**
     * <p>The name of the Ray cluster. The name must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testRayCluster</p>
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
     * <p>The list of managed directory IDs to mount.</p>
     */
    @NameInMap("volumeIds")
    public java.util.List<String> volumeIds;

    /**
     * <p>The parameters of the Ray cluster worker nodes. A maximum of 50 groups are supported.</p>
     */
    @NameInMap("workerSpec")
    public java.util.List<CreateRayClusterRequestWorkerSpec> workerSpec;

    public static CreateRayClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRayClusterRequest self = new CreateRayClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateRayClusterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRayClusterRequest setDisplayReleaseVersion(String displayReleaseVersion) {
        this.displayReleaseVersion = displayReleaseVersion;
        return this;
    }
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    public CreateRayClusterRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public CreateRayClusterRequest setHeadSpec(CreateRayClusterRequestHeadSpec headSpec) {
        this.headSpec = headSpec;
        return this;
    }
    public CreateRayClusterRequestHeadSpec getHeadSpec() {
        return this.headSpec;
    }

    public CreateRayClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRayClusterRequest setNetworkServiceName(String networkServiceName) {
        this.networkServiceName = networkServiceName;
        return this;
    }
    public String getNetworkServiceName() {
        return this.networkServiceName;
    }

    public CreateRayClusterRequest setVolumeIds(java.util.List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }
    public java.util.List<String> getVolumeIds() {
        return this.volumeIds;
    }

    public CreateRayClusterRequest setWorkerSpec(java.util.List<CreateRayClusterRequestWorkerSpec> workerSpec) {
        this.workerSpec = workerSpec;
        return this;
    }
    public java.util.List<CreateRayClusterRequestWorkerSpec> getWorkerSpec() {
        return this.workerSpec;
    }

    public static class CreateRayClusterRequestHeadSpecGftConfig extends TeaModel {
        /**
         * <p>The Redis password.</p>
         * 
         * <strong>example:</strong>
         * <p>redispasswd</p>
         */
        @NameInMap("redisPassword")
        public String redisPassword;

        /**
         * <p>The Redis URL.</p>
         * 
         * <strong>example:</strong>
         * <p>10.12.3.4:6379</p>
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

        public static CreateRayClusterRequestHeadSpecGftConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateRayClusterRequestHeadSpecGftConfig self = new CreateRayClusterRequestHeadSpecGftConfig();
            return TeaModel.build(map, self);
        }

        public CreateRayClusterRequestHeadSpecGftConfig setRedisPassword(String redisPassword) {
            this.redisPassword = redisPassword;
            return this;
        }
        public String getRedisPassword() {
            return this.redisPassword;
        }

        public CreateRayClusterRequestHeadSpecGftConfig setRedisUrl(String redisUrl) {
            this.redisUrl = redisUrl;
            return this;
        }
        public String getRedisUrl() {
            return this.redisUrl;
        }

        public CreateRayClusterRequestHeadSpecGftConfig setRedisUsername(String redisUsername) {
            this.redisUsername = redisUsername;
            return this;
        }
        public String getRedisUsername() {
            return this.redisUsername;
        }

    }

    public static class CreateRayClusterRequestHeadSpec extends TeaModel {
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
         * <p>Specifies whether to enable automatic scaling for workers.</p>
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
         * <p>MY_ENV=hello\nMY_ENV2=hello2</p>
         */
        @NameInMap("env")
        public String env;

        /**
         * <p>The GCS Fault Tolerance configuration.</p>
         */
        @NameInMap("gftConfig")
        public CreateRayClusterRequestHeadSpecGftConfig gftConfig;

        /**
         * <p>Specifies whether to enable GCS Fault Tolerance.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("gftEnabled")
        public Boolean gftEnabled;

        /**
         * <p>The GPU model.</p>
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
         * <p>The memory size. Unit: Gi.</p>
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
         * <p>The Ray node startup parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>--num-cpus=0 --num-gpus=0</p>
         */
        @NameInMap("rayStartParams")
        public String rayStartParams;

        public static CreateRayClusterRequestHeadSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateRayClusterRequestHeadSpec self = new CreateRayClusterRequestHeadSpec();
            return TeaModel.build(map, self);
        }

        public CreateRayClusterRequestHeadSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public CreateRayClusterRequestHeadSpec setDisplayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        public CreateRayClusterRequestHeadSpec setEnableAutoScaling(Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        public CreateRayClusterRequestHeadSpec setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public CreateRayClusterRequestHeadSpec setGftConfig(CreateRayClusterRequestHeadSpecGftConfig gftConfig) {
            this.gftConfig = gftConfig;
            return this;
        }
        public CreateRayClusterRequestHeadSpecGftConfig getGftConfig() {
            return this.gftConfig;
        }

        public CreateRayClusterRequestHeadSpec setGftEnabled(Boolean gftEnabled) {
            this.gftEnabled = gftEnabled;
            return this;
        }
        public Boolean getGftEnabled() {
            return this.gftEnabled;
        }

        public CreateRayClusterRequestHeadSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public CreateRayClusterRequestHeadSpec setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
            this.idleTimeoutSeconds = idleTimeoutSeconds;
            return this;
        }
        public Integer getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        public CreateRayClusterRequestHeadSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public CreateRayClusterRequestHeadSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CreateRayClusterRequestHeadSpec setRayStartParams(String rayStartParams) {
            this.rayStartParams = rayStartParams;
            return this;
        }
        public String getRayStartParams() {
            return this.rayStartParams;
        }

    }

    public static class CreateRayClusterRequestWorkerSpec extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <p>The engine version. If this parameter is not specified, the value is the same as that of the head node.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-1.2.0 (Ray 2.55.1, Python 3.12)</p>
         */
        @NameInMap("displayReleaseVersion")
        public String displayReleaseVersion;

        /**
         * <p>The environment variables.</p>
         * 
         * <strong>example:</strong>
         * <p>MY_ENV=hello\nMY_ENV2=hello2</p>
         */
        @NameInMap("env")
        public String env;

        /**
         * <p>The GPU model.</p>
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
         * <p>The maximum number of workers after automatic scaling is enabled. Minimum value: 1.</p>
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
         * <p>16Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The minimum number of workers after automatic scaling is enabled. Minimum value: 1. The value must be less than or equal to maxReplica.</p>
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
         * <p>The Ray node startup parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>--num-cpus=0 --num-gpus=0</p>
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

        public static CreateRayClusterRequestWorkerSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateRayClusterRequestWorkerSpec self = new CreateRayClusterRequestWorkerSpec();
            return TeaModel.build(map, self);
        }

        public CreateRayClusterRequestWorkerSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public CreateRayClusterRequestWorkerSpec setDisplayReleaseVersion(String displayReleaseVersion) {
            this.displayReleaseVersion = displayReleaseVersion;
            return this;
        }
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        public CreateRayClusterRequestWorkerSpec setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public CreateRayClusterRequestWorkerSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public CreateRayClusterRequestWorkerSpec setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateRayClusterRequestWorkerSpec setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public CreateRayClusterRequestWorkerSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public CreateRayClusterRequestWorkerSpec setMinReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }
        public Integer getMinReplica() {
            return this.minReplica;
        }

        public CreateRayClusterRequestWorkerSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CreateRayClusterRequestWorkerSpec setRayStartParams(String rayStartParams) {
            this.rayStartParams = rayStartParams;
            return this;
        }
        public String getRayStartParams() {
            return this.rayStartParams;
        }

        public CreateRayClusterRequestWorkerSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public CreateRayClusterRequestWorkerSpec setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

    }

}
