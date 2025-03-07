// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
    @NameInMap("archives")
    public java.util.List<String> archives;

    @NameInMap("artifactUrl")
    public String artifactUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("bizId")
    public String bizId;

    @NameInMap("categoryBizId")
    public String categoryBizId;

    @NameInMap("content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("creator")
    public Long creator;

    @NameInMap("credential")
    public TaskCredential credential;

    @NameInMap("defaultCatalogId")
    public String defaultCatalogId;

    @NameInMap("defaultDatabase")
    public String defaultDatabase;

    @NameInMap("defaultResourceQueueId")
    public String defaultResourceQueueId;

    @NameInMap("defaultSqlComputeId")
    public String defaultSqlComputeId;

    @NameInMap("deploymentId")
    public String deploymentId;

    @NameInMap("environmentId")
    public String environmentId;

    @NameInMap("extraArtifactIds")
    public java.util.List<String> extraArtifactIds;

    @NameInMap("extraSparkSubmitParams")
    public String extraSparkSubmitParams;

    @NameInMap("files")
    public java.util.List<String> files;

    @NameInMap("fusion")
    public Boolean fusion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtCreated")
    public String gmtCreated;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("hasChanged")
    public Boolean hasChanged;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("hasCommited")
    public Boolean hasCommited;

    @NameInMap("isStreaming")
    public Boolean isStreaming;

    @NameInMap("jars")
    public java.util.List<String> jars;

    @NameInMap("kernelId")
    public String kernelId;

    @NameInMap("lastRunResourceQueueId")
    public String lastRunResourceQueueId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modifier")
    public Long modifier;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("pyFiles")
    public java.util.List<String> pyFiles;

    @NameInMap("sessionClusterId")
    public String sessionClusterId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("sparkArgs")
    public String sparkArgs;

    @NameInMap("sparkConf")
    public java.util.List<SparkConf> sparkConf;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkDriverCores")
    public Integer sparkDriverCores;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkDriverMemory")
    public Long sparkDriverMemory;

    @NameInMap("sparkEntrypoint")
    public String sparkEntrypoint;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkExecutorCores")
    public Integer sparkExecutorCores;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkExecutorMemory")
    public Long sparkExecutorMemory;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkLogLevel")
    public String sparkLogLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkLogPath")
    public String sparkLogPath;

    @NameInMap("sparkSubmitClause")
    public String sparkSubmitClause;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("sparkVersion")
    public String sparkVersion;

    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    @NameInMap("timeout")
    public Integer timeout;

    /**
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

    public Task setPyFiles(java.util.List<String> pyFiles) {
        this.pyFiles = pyFiles;
        return this;
    }
    public java.util.List<String> getPyFiles() {
        return this.pyFiles;
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
        @NameInMap("accessId")
        public String accessId;

        @NameInMap("accessUrl")
        public String accessUrl;

        @NameInMap("expire")
        public Long expire;

        @NameInMap("host")
        public String host;

        @NameInMap("path")
        public String path;

        @NameInMap("policy")
        public String policy;

        @NameInMap("securityToken")
        public String securityToken;

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

}
