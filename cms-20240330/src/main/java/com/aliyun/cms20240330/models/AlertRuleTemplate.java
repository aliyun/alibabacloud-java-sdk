// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleTemplate extends TeaModel {
    @NameInMap("alertType")
    public String alertType;

    @NameInMap("applyCount")
    public Long applyCount;

    @NameInMap("bizType")
    public String bizType;

    @NameInMap("datasource")
    public String datasource;

    @NameInMap("description")
    public String description;

    @NameInMap("gmtCreate")
    public Long gmtCreate;

    @NameInMap("gmtModified")
    public Long gmtModified;

    @NameInMap("id")
    public Long id;

    @NameInMap("isSystem")
    public Integer isSystem;

    @NameInMap("labels")
    public String labels;

    @NameInMap("ruleConfigs")
    public String ruleConfigs;

    @NameInMap("scenes")
    public String scenes;

    @NameInMap("schemaVersion")
    public String schemaVersion;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("status")
    public Integer status;

    @NameInMap("subType")
    public String subType;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("userId")
    public String userId;

    @NameInMap("uuid")
    public String uuid;

    public static AlertRuleTemplate build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleTemplate self = new AlertRuleTemplate();
        return TeaModel.build(map, self);
    }

    public AlertRuleTemplate setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public AlertRuleTemplate setApplyCount(Long applyCount) {
        this.applyCount = applyCount;
        return this;
    }
    public Long getApplyCount() {
        return this.applyCount;
    }

    public AlertRuleTemplate setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public AlertRuleTemplate setDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }
    public String getDatasource() {
        return this.datasource;
    }

    public AlertRuleTemplate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AlertRuleTemplate setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AlertRuleTemplate setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AlertRuleTemplate setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlertRuleTemplate setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
        return this;
    }
    public Integer getIsSystem() {
        return this.isSystem;
    }

    public AlertRuleTemplate setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public AlertRuleTemplate setRuleConfigs(String ruleConfigs) {
        this.ruleConfigs = ruleConfigs;
        return this;
    }
    public String getRuleConfigs() {
        return this.ruleConfigs;
    }

    public AlertRuleTemplate setScenes(String scenes) {
        this.scenes = scenes;
        return this;
    }
    public String getScenes() {
        return this.scenes;
    }

    public AlertRuleTemplate setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public AlertRuleTemplate setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public AlertRuleTemplate setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AlertRuleTemplate setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public AlertRuleTemplate setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AlertRuleTemplate setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AlertRuleTemplate setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
