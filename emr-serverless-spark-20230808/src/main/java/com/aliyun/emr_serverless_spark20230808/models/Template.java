// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class Template extends TeaModel {
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>Creator UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>150978934701****</p>
     */
    @NameInMap("creator")
    public Long creator;

    /**
     * <p>Spark engine display version.</p>
     * 
     * <strong>example:</strong>
     * <p>esr-4.1.1</p>
     */
    @NameInMap("displaySparkVersion")
    public String displaySparkVersion;

    /**
     * <p>Whether to enable the fusion switch.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("fusion")
    public Boolean fusion;

    /**
     * <p>Creation time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-10T02:02:41.000+00:00</p>
     */
    @NameInMap("gmtCreated")
    public String gmtCreated;

    /**
     * <p>Last modified time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-10T02:02:41.000+00:00</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("isDefault")
    public Boolean isDefault;

    /**
     * <p>Last modifier UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>150978934701****</p>
     */
    @NameInMap("modifier")
    public Long modifier;

    @NameInMap("name")
    public String name;

    /**
     * <p>Spark Conf</p>
     */
    @NameInMap("sparkConf")
    public java.util.List<SparkConf> sparkConf;

    /**
     * <p>Spark Driver cores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sparkDriverCores")
    public Integer sparkDriverCores;

    /**
     * <p>Spark Driver memory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("sparkDriverMemory")
    public Long sparkDriverMemory;

    /**
     * <p>Spark Executor cores.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sparkExecutorCores")
    public Integer sparkExecutorCores;

    /**
     * <p>Spark Executor memory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1073741824</p>
     */
    @NameInMap("sparkExecutorMemory")
    public Long sparkExecutorMemory;

    /**
     * <p>Spark log level.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INFO</p>
     */
    @NameInMap("sparkLogLevel")
    public String sparkLogLevel;

    /**
     * <p>Spark log path.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://your_bucket/path/to/your/log</p>
     */
    @NameInMap("sparkLogPath")
    public String sparkLogPath;

    /**
     * <p>Spark internal release version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esr-4.1.1</p>
     */
    @NameInMap("sparkVersion")
    public String sparkVersion;

    /**
     * <p>Template type.</p>
     * 
     * <strong>example:</strong>
     * <p>TASK</p>
     */
    @NameInMap("templateType")
    public String templateType;

    public static Template build(java.util.Map<String, ?> map) throws Exception {
        Template self = new Template();
        return TeaModel.build(map, self);
    }

    public Template setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public Template setCreator(Long creator) {
        this.creator = creator;
        return this;
    }
    public Long getCreator() {
        return this.creator;
    }

    public Template setDisplaySparkVersion(String displaySparkVersion) {
        this.displaySparkVersion = displaySparkVersion;
        return this;
    }
    public String getDisplaySparkVersion() {
        return this.displaySparkVersion;
    }

    public Template setFusion(Boolean fusion) {
        this.fusion = fusion;
        return this;
    }
    public Boolean getFusion() {
        return this.fusion;
    }

    public Template setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public Template setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Template setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Template setModifier(Long modifier) {
        this.modifier = modifier;
        return this;
    }
    public Long getModifier() {
        return this.modifier;
    }

    public Template setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Template setSparkConf(java.util.List<SparkConf> sparkConf) {
        this.sparkConf = sparkConf;
        return this;
    }
    public java.util.List<SparkConf> getSparkConf() {
        return this.sparkConf;
    }

    public Template setSparkDriverCores(Integer sparkDriverCores) {
        this.sparkDriverCores = sparkDriverCores;
        return this;
    }
    public Integer getSparkDriverCores() {
        return this.sparkDriverCores;
    }

    public Template setSparkDriverMemory(Long sparkDriverMemory) {
        this.sparkDriverMemory = sparkDriverMemory;
        return this;
    }
    public Long getSparkDriverMemory() {
        return this.sparkDriverMemory;
    }

    public Template setSparkExecutorCores(Integer sparkExecutorCores) {
        this.sparkExecutorCores = sparkExecutorCores;
        return this;
    }
    public Integer getSparkExecutorCores() {
        return this.sparkExecutorCores;
    }

    public Template setSparkExecutorMemory(Long sparkExecutorMemory) {
        this.sparkExecutorMemory = sparkExecutorMemory;
        return this;
    }
    public Long getSparkExecutorMemory() {
        return this.sparkExecutorMemory;
    }

    public Template setSparkLogLevel(String sparkLogLevel) {
        this.sparkLogLevel = sparkLogLevel;
        return this;
    }
    public String getSparkLogLevel() {
        return this.sparkLogLevel;
    }

    public Template setSparkLogPath(String sparkLogPath) {
        this.sparkLogPath = sparkLogPath;
        return this;
    }
    public String getSparkLogPath() {
        return this.sparkLogPath;
    }

    public Template setSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }
    public String getSparkVersion() {
        return this.sparkVersion;
    }

    public Template setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
