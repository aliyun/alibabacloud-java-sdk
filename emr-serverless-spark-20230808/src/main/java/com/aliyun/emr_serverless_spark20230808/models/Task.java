// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
    @NameInMap("artifactUrl")
    public String artifactUrl;

    @NameInMap("bizId")
    public String bizId;

    @NameInMap("categoryBizId")
    public String categoryBizId;

    @NameInMap("content")
    public String content;

    @NameInMap("creator")
    public Long creator;

    @NameInMap("defaultCatalogId")
    public String defaultCatalogId;

    @NameInMap("defaultDatabase")
    public String defaultDatabase;

    @NameInMap("defaultResourceQueueId")
    public String defaultResourceQueueId;

    @NameInMap("defaultSqlComputeId")
    public String defaultSqlComputeId;

    @NameInMap("extraArtifactIds")
    public java.util.List<String> extraArtifactIds;

    @NameInMap("gmtCreated")
    public String gmtCreated;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("hasChanged")
    public Boolean hasChanged;

    @NameInMap("hasCommited")
    public Boolean hasCommited;

    @NameInMap("lastRunResourceQueueId")
    public String lastRunResourceQueueId;

    @NameInMap("modifier")
    public Long modifier;

    @NameInMap("name")
    public String name;

    @NameInMap("pyFiles")
    public java.util.List<String> pyFiles;

    @NameInMap("sparkArgs")
    public String sparkArgs;

    @NameInMap("sparkConf")
    public java.util.List<SparkConf> sparkConf;

    @NameInMap("sparkDriverCores")
    public Integer sparkDriverCores;

    @NameInMap("sparkDriverMemory")
    public Long sparkDriverMemory;

    @NameInMap("sparkEntrypoint")
    public String sparkEntrypoint;

    @NameInMap("sparkExecutorCores")
    public Integer sparkExecutorCores;

    @NameInMap("sparkExecutorMemory")
    public Long sparkExecutorMemory;

    @NameInMap("sparkLogLevel")
    public String sparkLogLevel;

    @NameInMap("sparkLogPath")
    public String sparkLogPath;

    @NameInMap("sparkVersion")
    public String sparkVersion;

    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    @NameInMap("type")
    public String type;

    public static Task build(java.util.Map<String, ?> map) throws Exception {
        Task self = new Task();
        return TeaModel.build(map, self);
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

    public Task setExtraArtifactIds(java.util.List<String> extraArtifactIds) {
        this.extraArtifactIds = extraArtifactIds;
        return this;
    }
    public java.util.List<String> getExtraArtifactIds() {
        return this.extraArtifactIds;
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

    public Task setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
