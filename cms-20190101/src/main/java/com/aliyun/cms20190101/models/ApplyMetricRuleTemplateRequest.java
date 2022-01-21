// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateRequest extends TeaModel {
    @NameInMap("ApplyMode")
    public String applyMode;

    @NameInMap("EnableEndTime")
    public Long enableEndTime;

    @NameInMap("EnableStartTime")
    public Long enableStartTime;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("NotifyLevel")
    public Long notifyLevel;

    @NameInMap("SilenceTime")
    public Long silenceTime;

    @NameInMap("TemplateIds")
    public String templateIds;

    @NameInMap("Webhook")
    public String webhook;

    public static ApplyMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyMetricRuleTemplateRequest self = new ApplyMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyMetricRuleTemplateRequest setApplyMode(String applyMode) {
        this.applyMode = applyMode;
        return this;
    }
    public String getApplyMode() {
        return this.applyMode;
    }

    public ApplyMetricRuleTemplateRequest setEnableEndTime(Long enableEndTime) {
        this.enableEndTime = enableEndTime;
        return this;
    }
    public Long getEnableEndTime() {
        return this.enableEndTime;
    }

    public ApplyMetricRuleTemplateRequest setEnableStartTime(Long enableStartTime) {
        this.enableStartTime = enableStartTime;
        return this;
    }
    public Long getEnableStartTime() {
        return this.enableStartTime;
    }

    public ApplyMetricRuleTemplateRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ApplyMetricRuleTemplateRequest setNotifyLevel(Long notifyLevel) {
        this.notifyLevel = notifyLevel;
        return this;
    }
    public Long getNotifyLevel() {
        return this.notifyLevel;
    }

    public ApplyMetricRuleTemplateRequest setSilenceTime(Long silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Long getSilenceTime() {
        return this.silenceTime;
    }

    public ApplyMetricRuleTemplateRequest setTemplateIds(String templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public String getTemplateIds() {
        return this.templateIds;
    }

    public ApplyMetricRuleTemplateRequest setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

}
