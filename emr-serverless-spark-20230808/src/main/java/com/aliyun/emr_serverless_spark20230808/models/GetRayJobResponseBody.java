// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetRayJobResponseBody extends TeaModel {
    /**
     * <p>The timeout period.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("activeDeadlineSeconds")
    public Integer activeDeadlineSeconds;

    /**
     * <p>The number of failure retries. Currently fixed at 0.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("backoffLimit")
    public Integer backoffLimit;

    /**
     * <p>The status of the corresponding Ray cluster. Valid values:</p>
     * <ul>
     * <li>Deleted: Deleted.</li>
     * <li>Submitted: Submitted but not yet created.</li>
     * <li>Pending: Being created.</li>
     * <li>Running: Running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("clusterState")
    public String clusterState;

    /**
     * <p>The nickname of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("creatorName")
    public String creatorName;

    /**
     * <p>The consumed CU resources. This value is returned 10 minutes after the cluster is released.</p>
     * 
     * <strong>example:</strong>
     * <p>1899</p>
     */
    @NameInMap("cuHours")
    public Double cuHours;

    /**
     * <p>The Ray cluster dashboard URL. When the Ray cluster is in Running state, this is the Runtime UI. After the cluster is deleted, this is the History UI. History UI is supported only in err-1.2.0 and later versions.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://emr-ray-gateway-cn-hangzhou.aliyuncs.com/workspace/w-xxxxxxxx/raycluster/ray-xxxxxx/dashboard?token=xxxxxx">https://emr-ray-gateway-cn-hangzhou.aliyuncs.com/workspace/w-xxxxxxxx/raycluster/ray-xxxxxx/dashboard?token=xxxxxx</a></p>
     */
    @NameInMap("dashboardUrl")
    public String dashboardUrl;

    /**
     * <p>The extra dashboard UI URLs. Currently empty.</p>
     */
    @NameInMap("dashboardUrlExtra")
    public java.util.List<String> dashboardUrlExtra;

    /**
     * <p>The Ray DPI engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>err-1.2.0 (Ray 2.55.1, Python 3.12)</p>
     */
    @NameInMap("displayReleaseVersion")
    public String displayReleaseVersion;

    /**
     * <p>The job duration, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2459764</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <p>The job end time. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1762949372000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The startup command.</p>
     * 
     * <strong>example:</strong>
     * <p>python main.py</p>
     */
    @NameInMap("entrypoint")
    public String entrypoint;

    /**
     * <p>The memory size requested by the entrypoint task.</p>
     * 
     * <strong>example:</strong>
     * <p>4Gi</p>
     */
    @NameInMap("entrypointMemory")
    public String entrypointMemory;

    /**
     * <p>The number of CPUs requested by the entrypoint task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("entrypointNumCpus")
    public String entrypointNumCpus;

    /**
     * <p>The number of GPUs requested by the entrypoint task.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("entrypointNumGpus")
    public String entrypointNumGpus;

    /**
     * <p>The custom resource request JSON string for the entrypoint task.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fpu&quot;: 1}</p>
     */
    @NameInMap("entrypointResources")
    public String entrypointResources;

    /**
     * <p>The extra parameters in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;userDefinedFiles&quot;: &quot;oss://mybucket/artifact/config.json,oss://mybucket/artifact/config2.json&quot;, &quot;userRequirementsFile&quot;: &quot;oss://mybucket/requirements.txt&quot;}</p>
     */
    @NameInMap("extraParam")
    public String extraParam;

    /**
     * <p>The consumed GPU hours. Currently empty.</p>
     */
    @NameInMap("guHours")
    public GetRayJobResponseBodyGuHours guHours;

    /**
     * <p>The Ray cluster head node parameters.</p>
     */
    @NameInMap("headSpec")
    public GetRayJobResponseBodyHeadSpec headSpec;

    /**
     * <p>The name of the bucket that stores logs.</p>
     * 
     * <strong>example:</strong>
     * <p>ss-ray-cn-hangzhou</p>
     */
    @NameInMap("logBucketName")
    public String logBucketName;

    /**
     * <p>The path where logs are stored.</p>
     * 
     * <strong>example:</strong>
     * <p>w-xxxxxxx/ray/logs/xxxxxx/</p>
     */
    @NameInMap("logPath")
    public String logPath;

    /**
     * <p>The execution message.</p>
     * 
     * <strong>example:</strong>
     * <p>Job finished successfully.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The job metadata JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;owner&quot;: &quot;alice&quot;}</p>
     */
    @NameInMap("metadataJson")
    public String metadataJson;

    /**
     * <p>The Ray cluster name.</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The Ray runtime environment JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pip&quot;:[&quot;requests==2.26.0&quot;,&quot;pendulum==2.1.2&quot;],&quot;env_vars&quot;:{&quot;KEY&quot;:&quot;VALUE&quot;}}</p>
     */
    @NameInMap("runtimeEnvJson")
    public String runtimeEnvJson;

    /**
     * <p>Specifies whether to automatically destroy the temporary cluster after the job finishes. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("shutdownAfterJobFinishes")
    public Boolean shutdownAfterJobFinishes;

    /**
     * <p>The start time. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1750327083303</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Submitted: Submitted.</li>
     * <li>Pending: The cluster is being created.</li>
     * <li>Running: The job is running.</li>
     * <li>Succeeded: The job succeeded.</li>
     * <li>Failed: The job failed.</li>
     * <li>Cancelling: Cancelling.</li>
     * <li>Cancelled: Cancelled.</li>
     * <li>Timeout: Timed out and cancelled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ID of the Ray Job.</p>
     * 
     * <strong>example:</strong>
     * <p>rj-xxxxxxxxxx</p>
     */
    @NameInMap("submissionId")
    public String submissionId;

    /**
     * <p>The job submission mode.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTPMode</p>
     */
    @NameInMap("submissionMode")
    public String submissionMode;

    /**
     * <p>The job submission time. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1750327082303</p>
     */
    @NameInMap("submitTime")
    public Long submitTime;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The data development task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>TSK-682e0112f6f24d9f9305b92174846985</p>
     */
    @NameInMap("taskBizId")
    public String taskBizId;

    /**
     * <p>The number of seconds to wait before destroying the cluster. This parameter takes effect only when shutdownAfterJobFinishes is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ttlSecondsAfterFinished")
    public Integer ttlSecondsAfterFinished;

    /**
     * <p>The list of managed file IDs.</p>
     */
    @NameInMap("volumeIds")
    public java.util.List<String> volumeIds;

    /**
     * <p>The Ray cluster worker node information.</p>
     */
    @NameInMap("workerSpecs")
    public java.util.List<GetRayJobResponseBodyWorkerSpecs> workerSpecs;

    /**
     * <p>The URL of the job code working directory.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://mybucket/hello.zip</p>
     */
    @NameInMap("workingDir")
    public String workingDir;

    public static GetRayJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRayJobResponseBody self = new GetRayJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRayJobResponseBody setActiveDeadlineSeconds(Integer activeDeadlineSeconds) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        return this;
    }
    public Integer getActiveDeadlineSeconds() {
        return this.activeDeadlineSeconds;
    }

    public GetRayJobResponseBody setBackoffLimit(Integer backoffLimit) {
        this.backoffLimit = backoffLimit;
        return this;
    }
    public Integer getBackoffLimit() {
        return this.backoffLimit;
    }

    public GetRayJobResponseBody setClusterState(String clusterState) {
        this.clusterState = clusterState;
        return this;
    }
    public String getClusterState() {
        return this.clusterState;
    }

    public GetRayJobResponseBody setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public GetRayJobResponseBody setCuHours(Double cuHours) {
        this.cuHours = cuHours;
        return this;
    }
    public Double getCuHours() {
        return this.cuHours;
    }

    public GetRayJobResponseBody setDashboardUrl(String dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
        return this;
    }
    public String getDashboardUrl() {
        return this.dashboardUrl;
    }

    public GetRayJobResponseBody setDashboardUrlExtra(java.util.List<String> dashboardUrlExtra) {
        this.dashboardUrlExtra = dashboardUrlExtra;
        return this;
    }
    public java.util.List<String> getDashboardUrlExtra() {
        return this.dashboardUrlExtra;
    }

    public GetRayJobResponseBody setDisplayReleaseVersion(String displayReleaseVersion) {
        this.displayReleaseVersion = displayReleaseVersion;
        return this;
    }
    public String getDisplayReleaseVersion() {
        return this.displayReleaseVersion;
    }

    public GetRayJobResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetRayJobResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetRayJobResponseBody setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }
    public String getEntrypoint() {
        return this.entrypoint;
    }

    public GetRayJobResponseBody setEntrypointMemory(String entrypointMemory) {
        this.entrypointMemory = entrypointMemory;
        return this;
    }
    public String getEntrypointMemory() {
        return this.entrypointMemory;
    }

    public GetRayJobResponseBody setEntrypointNumCpus(String entrypointNumCpus) {
        this.entrypointNumCpus = entrypointNumCpus;
        return this;
    }
    public String getEntrypointNumCpus() {
        return this.entrypointNumCpus;
    }

    public GetRayJobResponseBody setEntrypointNumGpus(String entrypointNumGpus) {
        this.entrypointNumGpus = entrypointNumGpus;
        return this;
    }
    public String getEntrypointNumGpus() {
        return this.entrypointNumGpus;
    }

    public GetRayJobResponseBody setEntrypointResources(String entrypointResources) {
        this.entrypointResources = entrypointResources;
        return this;
    }
    public String getEntrypointResources() {
        return this.entrypointResources;
    }

    public GetRayJobResponseBody setExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }
    public String getExtraParam() {
        return this.extraParam;
    }

    public GetRayJobResponseBody setGuHours(GetRayJobResponseBodyGuHours guHours) {
        this.guHours = guHours;
        return this;
    }
    public GetRayJobResponseBodyGuHours getGuHours() {
        return this.guHours;
    }

    public GetRayJobResponseBody setHeadSpec(GetRayJobResponseBodyHeadSpec headSpec) {
        this.headSpec = headSpec;
        return this;
    }
    public GetRayJobResponseBodyHeadSpec getHeadSpec() {
        return this.headSpec;
    }

    public GetRayJobResponseBody setLogBucketName(String logBucketName) {
        this.logBucketName = logBucketName;
        return this;
    }
    public String getLogBucketName() {
        return this.logBucketName;
    }

    public GetRayJobResponseBody setLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }
    public String getLogPath() {
        return this.logPath;
    }

    public GetRayJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRayJobResponseBody setMetadataJson(String metadataJson) {
        this.metadataJson = metadataJson;
        return this;
    }
    public String getMetadataJson() {
        return this.metadataJson;
    }

    public GetRayJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRayJobResponseBody setNetworkServiceName(String networkServiceName) {
        this.networkServiceName = networkServiceName;
        return this;
    }
    public String getNetworkServiceName() {
        return this.networkServiceName;
    }

    public GetRayJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRayJobResponseBody setRuntimeEnvJson(String runtimeEnvJson) {
        this.runtimeEnvJson = runtimeEnvJson;
        return this;
    }
    public String getRuntimeEnvJson() {
        return this.runtimeEnvJson;
    }

    public GetRayJobResponseBody setShutdownAfterJobFinishes(Boolean shutdownAfterJobFinishes) {
        this.shutdownAfterJobFinishes = shutdownAfterJobFinishes;
        return this;
    }
    public Boolean getShutdownAfterJobFinishes() {
        return this.shutdownAfterJobFinishes;
    }

    public GetRayJobResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetRayJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRayJobResponseBody setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public GetRayJobResponseBody setSubmissionMode(String submissionMode) {
        this.submissionMode = submissionMode;
        return this;
    }
    public String getSubmissionMode() {
        return this.submissionMode;
    }

    public GetRayJobResponseBody setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public Long getSubmitTime() {
        return this.submitTime;
    }

    public GetRayJobResponseBody setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public GetRayJobResponseBody setTaskBizId(String taskBizId) {
        this.taskBizId = taskBizId;
        return this;
    }
    public String getTaskBizId() {
        return this.taskBizId;
    }

    public GetRayJobResponseBody setTtlSecondsAfterFinished(Integer ttlSecondsAfterFinished) {
        this.ttlSecondsAfterFinished = ttlSecondsAfterFinished;
        return this;
    }
    public Integer getTtlSecondsAfterFinished() {
        return this.ttlSecondsAfterFinished;
    }

    public GetRayJobResponseBody setVolumeIds(java.util.List<String> volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }
    public java.util.List<String> getVolumeIds() {
        return this.volumeIds;
    }

    public GetRayJobResponseBody setWorkerSpecs(java.util.List<GetRayJobResponseBodyWorkerSpecs> workerSpecs) {
        this.workerSpecs = workerSpecs;
        return this;
    }
    public java.util.List<GetRayJobResponseBodyWorkerSpecs> getWorkerSpecs() {
        return this.workerSpecs;
    }

    public GetRayJobResponseBody setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class GetRayJobResponseBodyGuHours extends TeaModel {
        /**
         * <p>The consumed GPU hours.</p>
         * 
         * <strong>example:</strong>
         * <p>2.6</p>
         */
        @NameInMap("gpuHours")
        public Double gpuHours;

        /**
         * <p>The GPU type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn6i-c4g1.xlarge</p>
         */
        @NameInMap("gpuSpec")
        public String gpuSpec;

        public static GetRayJobResponseBodyGuHours build(java.util.Map<String, ?> map) throws Exception {
            GetRayJobResponseBodyGuHours self = new GetRayJobResponseBodyGuHours();
            return TeaModel.build(map, self);
        }

        public GetRayJobResponseBodyGuHours setGpuHours(Double gpuHours) {
            this.gpuHours = gpuHours;
            return this;
        }
        public Double getGpuHours() {
            return this.gpuHours;
        }

        public GetRayJobResponseBodyGuHours setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

    }

    public static class GetRayJobResponseBodyHeadSpec extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <p>Indicates whether auto scaling is enabled for worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableAutoScaling")
        public Boolean enableAutoScaling;

        /**
         * <p>The GPU type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn6i-c4g1.xlarge</p>
         */
        @NameInMap("gpuSpec")
        public String gpuSpec;

        /**
         * <p>The idle timeout in seconds for worker nodes when auto scaling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("idleTimeoutSeconds")
        public Integer idleTimeoutSeconds;

        /**
         * <p>The memory size, in GiB.</p>
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
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        public static GetRayJobResponseBodyHeadSpec build(java.util.Map<String, ?> map) throws Exception {
            GetRayJobResponseBodyHeadSpec self = new GetRayJobResponseBodyHeadSpec();
            return TeaModel.build(map, self);
        }

        public GetRayJobResponseBodyHeadSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public GetRayJobResponseBodyHeadSpec setEnableAutoScaling(Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        public GetRayJobResponseBodyHeadSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public GetRayJobResponseBodyHeadSpec setIdleTimeoutSeconds(Integer idleTimeoutSeconds) {
            this.idleTimeoutSeconds = idleTimeoutSeconds;
            return this;
        }
        public Integer getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        public GetRayJobResponseBodyHeadSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetRayJobResponseBodyHeadSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetRayJobResponseBodyHeadSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

    public static class GetRayJobResponseBodyWorkerSpecs extends TeaModel {
        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("cpu")
        public String cpu;

        /**
         * <p>The GPU type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn6i-c4g1.xlarge</p>
         */
        @NameInMap("gpuSpec")
        public String gpuSpec;

        /**
         * <p>The worker node group name.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkerGroup1</p>
         */
        @NameInMap("groupName")
        public String groupName;

        /**
         * <p>The maximum number of workers.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("maxReplica")
        public Integer maxReplica;

        /**
         * <p>The memory size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        @NameInMap("memory")
        public String memory;

        /**
         * <p>The minimum number of workers.</p>
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
         * <p>The number of worker nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        public static GetRayJobResponseBodyWorkerSpecs build(java.util.Map<String, ?> map) throws Exception {
            GetRayJobResponseBodyWorkerSpecs self = new GetRayJobResponseBodyWorkerSpecs();
            return TeaModel.build(map, self);
        }

        public GetRayJobResponseBodyWorkerSpecs setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public GetRayJobResponseBodyWorkerSpecs setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public GetRayJobResponseBodyWorkerSpecs setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetRayJobResponseBodyWorkerSpecs setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public GetRayJobResponseBodyWorkerSpecs setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetRayJobResponseBodyWorkerSpecs setMinReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }
        public Integer getMinReplica() {
            return this.minReplica;
        }

        public GetRayJobResponseBodyWorkerSpecs setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetRayJobResponseBodyWorkerSpecs setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

}
