// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleTemplate extends TeaModel {
    /**
     * <p>The type of the alert.</p>
     */
    @NameInMap("alertType")
    public String alertType;

    /**
     * <p>The number of alert rules created from this template.</p>
     */
    @NameInMap("applyCount")
    public Long applyCount;

    /**
     * <p>The description of the template.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The creation time of the template, as a UNIX timestamp.</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>The time the template was last modified, as a UNIX timestamp.</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The ID of the alert rule template.</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Indicates whether the template is system-defined. Valid values: <code>0</code> (user-defined) and <code>1</code> (system-defined).</p>
     */
    @NameInMap("isSystem")
    public Integer isSystem;

    /**
     * <p>The labels associated with the template, formatted as a JSON string.</p>
     */
    @NameInMap("labels")
    public String labels;

    /**
     * <p>The rule configuration, formatted as a JSON string.</p>
     */
    @NameInMap("ruleConfigs")
    public String ruleConfigs;

    /**
     * <p>The status of the template.</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>The subtype of the alert.</p>
     */
    @NameInMap("subType")
    public String subType;

    /**
     * <p>The name of the alert rule template.</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The ID of the user who owns the template.</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The universally unique identifier (UUID) of the template.</p>
     */
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
