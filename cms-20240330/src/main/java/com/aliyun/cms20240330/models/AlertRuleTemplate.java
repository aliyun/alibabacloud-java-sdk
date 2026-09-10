// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleTemplate extends TeaModel {
    /**
     * <p>The alert type.</p>
     * 
     * <strong>example:</strong>
     * <p>METRIC_SET</p>
     */
    @NameInMap("alertType")
    public String alertType;

    /**
     * <p>The number of rules that have been applied from this template.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("applyCount")
    public Long applyCount;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>ALERT</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>The data source, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;SLS&quot;,&quot;project&quot;:&quot;my-project&quot;}</p>
     */
    @NameInMap("datasource")
    public String datasource;

    /**
     * <p>The template description.</p>
     * 
     * <strong>example:</strong>
     * <p>Triggers an alert when the CPU usage of an ECS instance exceeds the threshold</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The creation time, in UNIX millisecond timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000000</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>The last modified time, in UNIX millisecond timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000000</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>Indicates whether the template is a system template. Valid values: 1: yes. 0: no.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("isSystem")
    public Integer isSystem;

    /**
     * <p>The labels, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;env&quot;:&quot;prod&quot;,&quot;team&quot;:&quot;ops&quot;}</p>
     */
    @NameInMap("labels")
    public String labels;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The cloud service category.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("productCategory")
    public String productCategory;

    /**
     * <p>The rule configurations, in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;threshold&quot;:80,&quot;duration&quot;:60}</p>
     */
    @NameInMap("ruleConfigs")
    public String ruleConfigs;

    /**
     * <p>The applicable scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("scenes")
    public String scenes;

    /**
     * <p>The schema version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("schemaVersion")
    public String schemaVersion;

    /**
     * <p>The source type.</p>
     * 
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>The template status. Valid values: 1: enabled. 0: disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>The subtype.</p>
     * 
     * <strong>example:</strong>
     * <p>THRESHOLD</p>
     */
    @NameInMap("subType")
    public String subType;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS CPU Usage Alert Template</p>
     */
    @NameInMap("templateName")
    public String templateName;

    /**
     * <p>The ID of the user to whom the template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("userId")
    public String userId;

    /**
     * <p>The template UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>a1b2c3d4-e5f6-7890-abcd-ef1234567890</p>
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

    public AlertRuleTemplate setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AlertRuleTemplate setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }
    public String getProductCategory() {
        return this.productCategory;
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
