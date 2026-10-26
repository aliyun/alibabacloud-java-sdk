// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AlertRuleTemplateApplyRecord extends TeaModel {
    /**
     * <p>The effective configuration for the rule application.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;workspace&quot;:&quot;ws-1&quot;,&quot;displayName&quot;:&quot;CPU alert&quot;}</p>
     */
    @NameInMap("applyConfig")
    public String applyConfig;

    /**
     * <p>The time when the record was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1680861352600</p>
     */
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    /**
     * <p>The time when the record was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>1680861352600</p>
     */
    @NameInMap("gmtModified")
    public Long gmtModified;

    /**
     * <p>The record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The UUID of the alert rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>template-prometheus-ack-node-cpu-usage-exceeds-85</p>
     */
    @NameInMap("templateUuid")
    public String templateUuid;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1654218965343050</p>
     */
    @NameInMap("userId")
    public String userId;

    public static AlertRuleTemplateApplyRecord build(java.util.Map<String, ?> map) throws Exception {
        AlertRuleTemplateApplyRecord self = new AlertRuleTemplateApplyRecord();
        return TeaModel.build(map, self);
    }

    public AlertRuleTemplateApplyRecord setApplyConfig(String applyConfig) {
        this.applyConfig = applyConfig;
        return this;
    }
    public String getApplyConfig() {
        return this.applyConfig;
    }

    public AlertRuleTemplateApplyRecord setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AlertRuleTemplateApplyRecord setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AlertRuleTemplateApplyRecord setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AlertRuleTemplateApplyRecord setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AlertRuleTemplateApplyRecord setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public AlertRuleTemplateApplyRecord setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AlertRuleTemplateApplyRecord setTemplateUuid(String templateUuid) {
        this.templateUuid = templateUuid;
        return this;
    }
    public String getTemplateUuid() {
        return this.templateUuid;
    }

    public AlertRuleTemplateApplyRecord setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
