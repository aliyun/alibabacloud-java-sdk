// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class SubmitRayJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("activeDeadlineSeconds")
    public Integer activeDeadlineSeconds;

    /**
     * <strong>example:</strong>
     * <p>err-1.2.0 (Ray 2.55.1, Python 3.12)</p>
     */
    @NameInMap("displayReleaseVersion")
    public String displayReleaseVersion;

    /**
     * <strong>example:</strong>
     * <p>python -c &quot;print(\&quot;hello ray job\&quot;)&quot;</p>
     */
    @NameInMap("entrypoint")
    public String entrypoint;

    /**
     * <strong>example:</strong>
     * <p>4Gi</p>
     */
    @NameInMap("entrypointMemory")
    public String entrypointMemory;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("entrypointNumCpus")
    public String entrypointNumCpus;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("entrypointNumGpus")
    public String entrypointNumGpus;

    /**
     * <strong>example:</strong>
     * <p>{&quot;fpu&quot;: 1}</p>
     */
    @NameInMap("entrypointResources")
    public String entrypointResources;

    /**
     * <strong>example:</strong>
     * <p>{&quot;userDefinedFiles&quot;: &quot;oss://mybucket/artifact/config.json,oss://mybucket/artifact/config2.json&quot;, &quot;userRequirementsFile&quot;: &quot;oss://mybucket/requirements.txt&quot;}</p>
     */
    @NameInMap("extraParam")
    public String extraParam;

    @NameInMap("headSpec")
    public SubmitRayJobRequestHeadSpec headSpec;

    /**
     * <strong>example:</strong>
     * <p>{&quot;resourceName&quot;: &quot;test&quot;}</p>
     */
    @NameInMap("metadataJson")
    public String metadataJson;

    /**
     * <strong>example:</strong>
     * <p>my-job</p>
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
     * <p>{&quot;pip&quot;:[&quot;requests==2.26.0&quot;,&quot;pendulum==2.1.2&quot;],&quot;env_vars&quot;:{&quot;KEY&quot;:&quot;VALUE&quot;}}</p>
     */
    @NameInMap("runtimeEnvJson")
    public String runtimeEnvJson;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("shutdownAfterJobFinishes")
    public Boolean shutdownAfterJobFinishes;

    /**
     * <strong>example:</strong>
     * <p>HTTPMode</p>
     */
    @NameInMap("submissionMode")
    public String submissionMode;

    @NameInMap("tags")
    public java.util.List<SubmitRayJobRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ttlSecondsAfterFinished")
    public Integer ttlSecondsAfterFinished;

    @NameInMap("volumeIds")
    public java.util.List<String> volumeIds;

    @NameInMap("workerSpec")
    public java.util.List<SubmitRayJobRequestWorkerSpec> workerSpec;

    /**
     * <strong>example:</strong>
     * <p>oss://mybucket/rayjob.zip</p>
     */
    @NameInMap("workingDir")
    public String workingDir;

    public static SubmitRayJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitRayJobRequest self = new SubmitRayJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitRayJobRequest setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }
    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public SubmitRayJobRequest setDisplayReleaseVersion(String displayReleaseVersion) {
        this.displayReleaseVersion = displayReleaseVersion;
        return this;
    }
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    public SubmitRayJobRequest setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }
    public String getEntrypoint() {
        return this.entrypoint;
    }

    public SubmitRayJobRequest setEntrypointMemory(String entrypointMemory) {
        this.entrypointMemory = entrypointMemory;
        return this;
    }
    public String getEntrypointMemory() {
        return this.entrypointMemory;
    }

    public SubmitRayJobRequest setEntrypointNumCpus(String entrypointNumCpus) {
        this.entrypointNumCpus = entrypointNumCpus;
        return this;
    }
    public String getEntrypointNumCpus() {
        return this.entrypointNumCpus;
    }

    public SubmitRayJobRequest setEntrypointNumGpus(String entrypointNumGpus) {
        this.entrypointNumGpus = entrypointNumGpus;
        return this;
    }
    public String getEntrypointNumGpus() {
        return this.entrypointNumGpus;
    }

    public SubmitRayJobRequest setEntrypointResources(String entrypointResources) {
        this.entrypointResources = entrypointResources;
        return this;
    }
    public String getEntrypointResources() {
        return this.entrypointResources;
    }

    public SubmitRayJobRequest setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public SubmitRayJobRequest setHeadSpec(SubmitRayJobRequestHeadSpec headSpec) {
        this.headSpec = headSpec;
        return this;
    }
    public SubmitRayJobRequestHeadSpec getHeadSpec() {
        return this.headSpec;
    }

    public SubmitRayJobRequest setMetadataJson(String metadataJson) {
        this.metadataJson = metadataJson;
        return this;
    }
    public String getMetadataJson() {
        return this.metadataJson;
    }

    public SubmitRayJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitRayJobRequest setNetworkServiceName(String networkServiceName) {
        this.networkServiceName = networkServiceName;
        return this;
    }
    public String getNetworkServiceName() {
        return this.networkServiceName;
    }

    public SubmitRayJobRequest setRuntimeEnvJson(String runtimeEnvJson) {
        this.runtimeEnvJson = runtimeEnvJson;
        return this;
    }
    public String getRuntimeEnvJson() {
        return this.runtimeEnvJson;
    }

    public SubmitRayJobRequest setShutdownAfterJobFinishes(Boolean shutdownAfterJobFinishes) {
        this.shutdownAfterJobFinishes = shutdownAfterJobFinishes;
        return this;
    }
    public Boolean getShutdownAfterJobFinishes() {
        return this.shutdownAfterJobFinishes;
    }

    public SubmitRayJobRequest setSubmissionMode(String submissionMode) {
        this.submissionMode = submissionMode;
        return this;
    }
    public String getSubmissionMode() {
        return this.submissionMode;
    }

    public SubmitRayJobRequest setTags(java.util.List<SubmitRayJobRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SubmitRayJobRequestTags> getTags() {
        return this.tags;
    }

    public SubmitRayJobRequest setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
        return this;
    }
    public Integer getTtlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished;
    }

    public SubmitRayJobRequest setVolumeIds(java.util.List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }
    public java.util.List<String> getVolumeIds() {
        return this.volumeIds;
    }

    public SubmitRayJobRequest setWorkerSpec(java.util.List<SubmitRayJobRequestWorkerSpec> workerSpec) {
        this.workerSpec = workerSpec;
        return this;
    }
    public java.util.List<SubmitRayJobRequestWorkerSpec> getWorkerSpec() {
        return this.workerSpec;
    }

    public SubmitRayJobRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class SubmitRayJobRequestHeadSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>true</p>
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

        public static SubmitRayJobRequestHeadSpec build(java.util.Map<String, ?> map) throws Exception {
            SubmitRayJobRequestHeadSpec self = new SubmitRayJobRequestHeadSpec();
            return TeaModel.build(map, self);
        }

        public SubmitRayJobRequestHeadSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public SubmitRayJobRequestHeadSpec setEnableAutoScaling(Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        public SubmitRayJobRequestHeadSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public SubmitRayJobRequestHeadSpec setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
            this.idleTimeoutSeconds = idleTimeoutSeconds;
            return this;
        }
        public Integer getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        public SubmitRayJobRequestHeadSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public SubmitRayJobRequestHeadSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

    }

    public static class SubmitRayJobRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>jobname</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static SubmitRayJobRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SubmitRayJobRequestTags self = new SubmitRayJobRequestTags();
            return TeaModel.build(map, self);
        }

        public SubmitRayJobRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitRayJobRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SubmitRayJobRequestWorkerSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
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
         * <strong>example:</strong>
         * <p>WorkerGroup1</p>
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
         * <p>16Gi</p>
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

        public static SubmitRayJobRequestWorkerSpec build(java.util.Map<String, ?> map) throws Exception {
            SubmitRayJobRequestWorkerSpec self = new SubmitRayJobRequestWorkerSpec();
            return TeaModel.build(map, self);
        }

        public SubmitRayJobRequestWorkerSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public SubmitRayJobRequestWorkerSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public SubmitRayJobRequestWorkerSpec setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public SubmitRayJobRequestWorkerSpec setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public SubmitRayJobRequestWorkerSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public SubmitRayJobRequestWorkerSpec setMinReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }
        public Integer getMinReplica() {
            return this.minReplica;
        }

        public SubmitRayJobRequestWorkerSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public SubmitRayJobRequestWorkerSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public SubmitRayJobRequestWorkerSpec setWorkerType(String workerType) {
            this.workerType = workerType;
            return this;
        }
        public String getWorkerType() {
            return this.workerType;
        }

    }

}
