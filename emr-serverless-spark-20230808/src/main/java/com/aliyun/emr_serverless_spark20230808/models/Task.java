// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
    /**
     * <p>The --archives parameter.</p>
     */
    @NameInMap("archives")
    public java.util.List<String> archives;

    /**
     * <p>The temporary URL to access the resource file.</p>
     */
    @NameInMap("artifactUrl")
    public String artifactUrl;

    /**
     * <p>The business ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>The business ID of the folder.</p>
     */
    @NameInMap("categoryBizId")
    public String categoryBizId;

    /**
     * <p>The content of the Spark job.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The UID of the creator.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("creator")
    public Long creator;

    /**
     * <p>The information for directly uploading files to Object Storage Service (OSS).</p>
     */
    @NameInMap("credential")
    public TaskCredential credential;

    /**
     * <p>The default catalog ID.</p>
     */
    @NameInMap("defaultCatalogId")
    public String defaultCatalogId;

    /**
     * <p>The default database.</p>
     */
    @NameInMap("defaultDatabase")
    public String defaultDatabase;

    /**
     * <p>The default queue ID for the task.</p>
     */
    @NameInMap("defaultResourceQueueId")
    public String defaultResourceQueueId;

    /**
     * <p>The default SQL session ID.</p>
     */
    @NameInMap("defaultSqlComputeId")
    public String defaultSqlComputeId;

    /**
     * <p>The deployment ID of the streaming task.</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <p>The environment ID.</p>
     */
    @NameInMap("environmentId")
    public String environmentId;

    /**
     * <p>The IDs of extra Spark resources.</p>
     */
    @NameInMap("extraArtifactIds")
    public java.util.List<String> extraArtifactIds;

    /**
     * <p>The custom parameters for the spark-submit command.</p>
     */
    @NameInMap("extraSparkSubmitParams")
    public String extraSparkSubmitParams;

    /**
     * <p>The --files parameter.</p>
     */
    @NameInMap("files")
    public java.util.List<String> files;

    /**
     * <p>Indicates whether to enable fusion.</p>
     */
    @NameInMap("fusion")
    public Boolean fusion;

    /**
     * <p>The time when the task was created.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtCreated")
    public String gmtCreated;

    /**
     * <p>The time when the task was last modified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>Indicates whether the task has been changed since the last commit.</p>
     */
    @NameInMap("hasChanged")
    public Boolean hasChanged;

    /**
     * <p>Indicates whether the task has been committed.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("hasCommited")
    public Boolean hasCommited;

    /**
     * <p>Indicates whether the task is a streaming task.</p>
     */
    @NameInMap("isStreaming")
    public Boolean isStreaming;

    /**
     * <p>The --jars parameter.</p>
     */
    @NameInMap("jars")
    public java.util.List<String> jars;

    @NameInMap("kernelId")
    public String kernelId;

    /**
     * <p>The ID of the resource queue that was used for the last run.</p>
     */
    @NameInMap("lastRunResourceQueueId")
    public String lastRunResourceQueueId;

    /**
     * <p>The UID of the user who last updated the task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("modifier")
    public Long modifier;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("params")
    public java.util.Map<String, String> params;

    /**
     * <p>The PySpark dependency pyfiles.</p>
     */
    @NameInMap("pyFiles")
    public java.util.List<String> pyFiles;

    @NameInMap("rayActiveDeadlineSeconds")
    public Long rayActiveDeadlineSeconds;

    @NameInMap("rayBackoffLimit")
    public Integer rayBackoffLimit;

    @NameInMap("rayEntrypoint")
    public String rayEntrypoint;

    @NameInMap("rayEntrypointMemory")
    public String rayEntrypointMemory;

    @NameInMap("rayEntrypointNumCpus")
    public String rayEntrypointNumCpus;

    @NameInMap("rayEntrypointNumGpus")
    public String rayEntrypointNumGpus;

    @NameInMap("rayEntrypointResources")
    public String rayEntrypointResources;

    @NameInMap("rayExtraParam")
    public String rayExtraParam;

    @NameInMap("rayHeadSpec")
    public TaskRayHeadSpec rayHeadSpec;

    @NameInMap("rayMetadataJson")
    public String rayMetadataJson;

    @NameInMap("rayNetworkServiceName")
    public String rayNetworkServiceName;

    @NameInMap("rayRuntimeEnvJson")
    public String rayRuntimeEnvJson;

    @NameInMap("rayShutdownAfterJobFinishes")
    public Boolean rayShutdownAfterJobFinishes;

    @NameInMap("raySubmissionMode")
    public String raySubmissionMode;

    @NameInMap("rayTtlSecondsAfterFinished")
    public Long rayTtlSecondsAfterFinished;

    @NameInMap("rayVersion")
    public String rayVersion;

    @NameInMap("rayVolumeIds")
    public java.util.List<String> rayVolumeIds;

    @NameInMap("rayWorkerSpec")
    public java.util.List<TaskRayWorkerSpec> rayWorkerSpec;

    @NameInMap("rayWorkingDir")
    public String rayWorkingDir;

    @NameInMap("sessionClusterId")
    public String sessionClusterId;

    /**
     * <p>The Spark parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("sparkArgs")
    public String sparkArgs;

    /**
     * <p>The list of Spark configurations.</p>
     */
    @NameInMap("sparkConf")
    public java.util.List<SparkConf> sparkConf;

    /**
     * <p>The number of cores for the Spark driver.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkDriverCores")
    public Integer sparkDriverCores;

    /**
     * <p>The memory of the Spark driver.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkDriverMemory")
    public Long sparkDriverMemory;

    /**
     * <p>The entrypoint of the Spark main class.</p>
     */
    @NameInMap("sparkEntrypoint")
    public String sparkEntrypoint;

    /**
     * <p>The number of cores for the Spark executor.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkExecutorCores")
    public Integer sparkExecutorCores;

    /**
     * <p>The memory of the Spark executor.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkExecutorMemory")
    public Long sparkExecutorMemory;

    /**
     * <p>The log level for Spark.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkLogLevel")
    public String sparkLogLevel;

    /**
     * <p>The Spark log path.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkLogPath")
    public String sparkLogPath;

    /**
     * <p>The spark-submit statement.</p>
     */
    @NameInMap("sparkSubmitClause")
    public String sparkSubmitClause;

    /**
     * <p>The Spark version.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkVersion")
    public String sparkVersion;

    /**
     * <p>The task tags.</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    /**
     * <p>The task timeout duration.</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>The task type.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static Task build(java.util.Map<String, ?> map) throws Exception {
        Task self = new Task();
        return TeaModel.build(map, self);
    }

    public Task setArchives(java.util.List<String> archives) {
        this.archives = archives;
        return this;
    }
    public java.util.List<String> getArchives() {
        return this.archives;
    }

    public Task setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
        return this;
    }
    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    public Task setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public Task setCategoryBizId(String categoryBizId) {
        this.categoryBizId = categoryBizId;
        return this;
    }
    public String getCategoryBizId() {
        return this.categoryBizId;
    }

    public Task setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Task setCreator(Long creator) {
        this.creator = creator;
        return this;
    }
    public Long getCreator() {
        return this.creator;
    }

    public Task setCredential(TaskCredential credential) {
        this.credential = credential;
        return this;
    }
    public TaskCredential getCredential() {
        return this.credential;
    }

    public Task setDefaultCatalogId(String defaultCatalogId) {
        this.defaultCatalogId = defaultCatalogId;
        return this;
    }
    public String getDefaultCatalogId() {
        return this.defaultCatalogId;
    }

    public Task setDefaultDatabase(String defaultDatabase) {
        this.defaultDatabase = defaultDatabase;
        return this;
    }
    public String getDefaultDatabase() {
        return this.defaultDatabase;
    }

    public Task setDefaultResourceQueueId(String defaultResourceQueueId) {
        this.defaultResourceQueueId = defaultResourceQueueId;
        return this;
    }
    public String getDefaultResourceQueueId() {
        return this.defaultResourceQueueId;
    }

    public Task setDefaultSqlComputeId(String defaultSqlComputeId) {
        this.defaultSqlComputeId = defaultSqlComputeId;
        return this;
    }
    public String getDefaultSqlComputeId() {
        return this.defaultSqlComputeId;
    }

    public Task setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public Task setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public Task setExtraArtifactIds(java.util.List<String> extraArtifactIds) {
        this.extraArtifactIds = extraArtifactIds;
        return this;
    }
    public java.util.List<String> getExtraArtifactIds() {
        return this.extraArtifactIds;
    }

    public Task setExtraSparkSubmitParams(String extraSparkSubmitParams) {
        this.extraSparkSubmitParams = extraSparkSubmitParams;
        return this;
    }
    public String getExtraSparkSubmitParams() {
        return this.extraSparkSubmitParams;
    }

    public Task setFiles(java.util.List<String> files) {
        this.files = files;
        return this;
    }
    public java.util.List<String> getFiles() {
        return this.files;
    }

    public Task setFusion(Boolean fusion) {
        this.fusion = fusion;
        return this;
    }
    public Boolean getFusion() {
        return this.fusion;
    }

    public Task setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public Task setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Task setHasChanged(Boolean hasChanged) {
        this.hasChanged = hasChanged;
        return this;
    }
    public Boolean getHasChanged() {
        return this.hasChanged;
    }

    public Task setHasCommited(Boolean hasCommited) {
        this.hasCommited = hasCommited;
        return this;
    }
    public Boolean getHasCommited() {
        return this.hasCommited;
    }

    public Task setIsStreaming(Boolean isStreaming) {
        this.isStreaming = isStreaming;
        return this;
    }
    public Boolean getIsStreaming() {
        return this.isStreaming;
    }

    public Task setJars(java.util.List<String> jars) {
        this.jars = jars;
        return this;
    }
    public java.util.List<String> getJars() {
        return this.jars;
    }

    public Task setKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }
    public String getKernelId() {
        return this.kernelId;
    }

    public Task setLastRunResourceQueueId(String lastRunResourceQueueId) {
        this.lastRunResourceQueueId = lastRunResourceQueueId;
        return this;
    }
    public String getLastRunResourceQueueId() {
        return this.lastRunResourceQueueId;
    }

    public Task setModifier(Long modifier) {
        this.modifier = modifier;
        return this;
    }
    public Long getModifier() {
        return this.modifier;
    }

    public Task setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Task setParams(java.util.Map<String, String> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, String> getParams() {
        return this.params;
    }

    public Task setPyFiles(java.util.List<String> pyFiles) {
        this.pyFiles = pyFiles;
        return this;
    }
    public java.util.List<String> getPyFiles() {
        return this.pyFiles;
    }

    public Task setRayActiveDeadlineSeconds(Long rayActiveDeadlineSeconds) {
        this.rayActiveDeadlineSeconds = rayActiveDeadlineSeconds;
        return this;
    }
    public Long getRayActiveDeadlineSeconds() {
        return this.rayActiveDeadlineSeconds;
    }

    public Task setRayBackoffLimit(Integer rayBackoffLimit) {
        this.rayBackoffLimit = rayBackoffLimit;
        return this;
    }
    public Integer getRayBackoffLimit() {
        return this.rayBackoffLimit;
    }

    public Task setRayEntrypoint(String rayEntrypoint) {
        this.rayEntrypoint = rayEntrypoint;
        return this;
    }
    public String getRayEntrypoint() {
        return this.rayEntrypoint;
    }

    public Task setRayEntrypointMemory(String rayEntrypointMemory) {
        this.rayEntrypointMemory = rayEntrypointMemory;
        return this;
    }
    public String getRayEntrypointMemory() {
        return this.rayEntrypointMemory;
    }

    public Task setRayEntrypointNumCpus(String rayEntrypointNumCpus) {
        this.rayEntrypointNumCpus = rayEntrypointNumCpus;
        return this;
    }
    public String getRayEntrypointNumCpus() {
        return this.rayEntrypointNumCpus;
    }

    public Task setRayEntrypointNumGpus(String rayEntrypointNumGpus) {
        this.rayEntrypointNumGpus = rayEntrypointNumGpus;
        return this;
    }
    public String getRayEntrypointNumGpus() {
        return this.rayEntrypointNumGpus;
    }

    public Task setRayEntrypointResources(String rayEntrypointResources) {
        this.rayEntrypointResources = rayEntrypointResources;
        return this;
    }
    public String getRayEntrypointResources() {
        return this.rayEntrypointResources;
    }

    public Task setRayExtraParam(String rayExtraParam) {
        this.rayExtraParam = rayExtraParam;
        return this;
    }
    public String getRayExtraParam() {
        return this.rayExtraParam;
    }

    public Task setRayHeadSpec(TaskRayHeadSpec rayHeadSpec) {
        this.rayHeadSpec = rayHeadSpec;
        return this;
    }
    public TaskRayHeadSpec getRayHeadSpec() {
        return this.rayHeadSpec;
    }

    public Task setRayMetadataJson(String rayMetadataJson) {
        this.rayMetadataJson = rayMetadataJson;
        return this;
    }
    public String getRayMetadataJson() {
        return this.rayMetadataJson;
    }

    public Task setRayNetworkServiceName(String rayNetworkServiceName) {
        this.rayNetworkServiceName = rayNetworkServiceName;
        return this;
    }
    public String getRayNetworkServiceName() {
        return this.rayNetworkServiceName;
    }

    public Task setRayRuntimeEnvJson(String rayRuntimeEnvJson) {
        this.rayRuntimeEnvJson = rayRuntimeEnvJson;
        return this;
    }
    public String getRayRuntimeEnvJson() {
        return this.rayRuntimeEnvJson;
    }

    public Task setRayShutdownAfterJobFinishes(Boolean rayShutdownAfterJobFinishes) {
        this.rayShutdownAfterJobFinishes = rayShutdownAfterJobFinishes;
        return this;
    }
    public Boolean getRayShutdownAfterJobFinishes() {
        return this.rayShutdownAfterJobFinishes;
    }

    public Task setRaySubmissionMode(String raySubmissionMode) {
        this.raySubmissionMode = raySubmissionMode;
        return this;
    }
    public String getRaySubmissionMode() {
        return this.raySubmissionMode;
    }

    public Task setRayTtlSecondsAfterFinished(Long rayTtlSecondsAfterFinished) {
        this.rayTtlSecondsAfterFinished = rayTtlSecondsAfterFinished;
        return this;
    }
    public Long getRayTtlSecondsAfterFinished() {
        return this.rayTtlSecondsAfterFinished;
    }

    public Task setRayVersion(String rayVersion) {
        this.rayVersion = rayVersion;
        return this;
    }
    public String getRayVersion() {
        return this.rayVersion;
    }

    public Task setRayVolumeIds(java.util.List<String> rayVolumeIds) {
        this.rayVolumeIds = rayVolumeIds;
        return this;
    }
    public java.util.List<String> getRayVolumeIds() {
        return this.rayVolumeIds;
    }

    public Task setRayWorkerSpec(java.util.List<TaskRayWorkerSpec> rayWorkerSpec) {
        this.rayWorkerSpec = rayWorkerSpec;
        return this;
    }
    public java.util.List<TaskRayWorkerSpec> getRayWorkerSpec() {
        return this.rayWorkerSpec;
    }

    public Task setRayWorkingDir(String rayWorkingDir) {
        this.rayWorkingDir = rayWorkingDir;
        return this;
    }
    public String getRayWorkingDir() {
        return this.rayWorkingDir;
    }

    public Task setSessionClusterId(String sessionClusterId) {
        this.sessionClusterId = sessionClusterId;
        return this;
    }
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    public Task setSparkArgs(String sparkArgs) {
        this.sparkArgs = sparkArgs;
        return this;
    }
    public String getSparkArgs() {
        return this.sparkArgs;
    }

    public Task setSparkConf(java.util.List<SparkConf> sparkConf) {
        this.sparkConf = sparkConf;
        return this;
    }
    public java.util.List<SparkConf> getSparkConf() {
        return this.sparkConf;
    }

    public Task setSparkDriverCores(Integer sparkDriverCores) {
        this.sparkDriverCores = sparkDriverCores;
        return this;
    }
    public Integer getSparkDriverCores() {
        return this.sparkDriverCores;
    }

    public Task setSparkDriverMemory(Long sparkDriverMemory) {
        this.sparkDriverMemory = sparkDriverMemory;
        return this;
    }
    public Long getSparkDriverMemory() {
        return this.sparkDriverMemory;
    }

    public Task setSparkEntrypoint(String sparkEntrypoint) {
        this.sparkEntrypoint = sparkEntrypoint;
        return this;
    }
    public String getSparkEntrypoint() {
        return this.sparkEntrypoint;
    }

    public Task setSparkExecutorCores(Integer sparkExecutorCores) {
        this.sparkExecutorCores = sparkExecutorCores;
        return this;
    }
    public Integer getSparkExecutorCores() {
        return this.sparkExecutorCores;
    }

    public Task setSparkExecutorMemory(Long sparkExecutorMemory) {
        this.sparkExecutorMemory = sparkExecutorMemory;
        return this;
    }
    public Long getSparkExecutorMemory() {
        return this.sparkExecutorMemory;
    }

    public Task setSparkLogLevel(String sparkLogLevel) {
        this.sparkLogLevel = sparkLogLevel;
        return this;
    }
    public String getSparkLogLevel() {
        return this.sparkLogLevel;
    }

    public Task setSparkLogPath(String sparkLogPath) {
        this.sparkLogPath = sparkLogPath;
        return this;
    }
    public String getSparkLogPath() {
        return this.sparkLogPath;
    }

    public Task setSparkSubmitClause(String sparkSubmitClause) {
        this.sparkSubmitClause = sparkSubmitClause;
        return this;
    }
    public String getSparkSubmitClause() {
        return this.sparkSubmitClause;
    }

    public Task setSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }
    public String getSparkVersion() {
        return this.sparkVersion;
    }

    public Task setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public Task setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public Task setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class TaskCredential extends TeaModel {
        /**
         * <p>The AccessKey ID.</p>
         */
        @NameInMap("accessId")
        public String accessId;

        /**
         * <p>The access URL.</p>
         */
        @NameInMap("accessUrl")
        public String accessUrl;

        /**
         * <p>The expiration time.</p>
         */
        @NameInMap("expire")
        public Long expire;

        /**
         * <p>The domain name.</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The path.</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>The policy.</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <p>The security token.</p>
         */
        @NameInMap("securityToken")
        public String securityToken;

        /**
         * <p>The signature.</p>
         */
        @NameInMap("signature")
        public String signature;

        public static TaskCredential build(java.util.Map<String, ?> map) throws Exception {
            TaskCredential self = new TaskCredential();
            return TeaModel.build(map, self);
        }

        public TaskCredential setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public TaskCredential setAccessUrl(String accessUrl) {
            this.accessUrl = accessUrl;
            return this;
        }
        public String getAccessUrl() {
            return this.accessUrl;
        }

        public TaskCredential setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public TaskCredential setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public TaskCredential setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public TaskCredential setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public TaskCredential setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public TaskCredential setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

    }

    public static class TaskRayHeadSpec extends TeaModel {
        @NameInMap("cpu")
        public String cpu;

        @NameInMap("enableAutoScaling")
        public Boolean enableAutoScaling;

        @NameInMap("gpuSpec")
        public String gpuSpec;

        @NameInMap("idleTimeoutSeconds")
        public Long idleTimeoutSeconds;

        @NameInMap("memory")
        public String memory;

        @NameInMap("queueName")
        public String queueName;

        @NameInMap("replica")
        public Integer replica;

        public static TaskRayHeadSpec build(java.util.Map<String, ?> map) throws Exception {
            TaskRayHeadSpec self = new TaskRayHeadSpec();
            return TeaModel.build(map, self);
        }

        public TaskRayHeadSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public TaskRayHeadSpec setEnableAutoScaling(Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Boolean getEnableAutoScaling() {
            return this.enableAutoScaling;
        }

        public TaskRayHeadSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public TaskRayHeadSpec setIdleTimeoutSeconds(Long idleTimeoutSeconds) {
            this.idleTimeoutSeconds = idleTimeoutSeconds;
            return this;
        }
        public Long getIdleTimeoutSeconds() {
            return this.idleTimeoutSeconds;
        }

        public TaskRayHeadSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public TaskRayHeadSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public TaskRayHeadSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

    public static class TaskRayWorkerSpec extends TeaModel {
        @NameInMap("cpu")
        public String cpu;

        @NameInMap("gpuSpec")
        public String gpuSpec;

        @NameInMap("groupName")
        public String groupName;

        @NameInMap("maxReplica")
        public Integer maxReplica;

        @NameInMap("memory")
        public String memory;

        @NameInMap("minReplica")
        public Integer minReplica;

        @NameInMap("queueName")
        public String queueName;

        @NameInMap("replica")
        public Integer replica;

        public static TaskRayWorkerSpec build(java.util.Map<String, ?> map) throws Exception {
            TaskRayWorkerSpec self = new TaskRayWorkerSpec();
            return TeaModel.build(map, self);
        }

        public TaskRayWorkerSpec setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public TaskRayWorkerSpec setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public TaskRayWorkerSpec setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public TaskRayWorkerSpec setMaxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            return this;
        }
        public Integer getMaxReplica() {
            return this.maxReplica;
        }

        public TaskRayWorkerSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public TaskRayWorkerSpec setMinReplica(Integer minReplica) {
            this.minReplica = minReplica;
            return this;
        }
        public Integer getMinReplica() {
            return this.minReplica;
        }

        public TaskRayWorkerSpec setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public TaskRayWorkerSpec setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

    }

}
