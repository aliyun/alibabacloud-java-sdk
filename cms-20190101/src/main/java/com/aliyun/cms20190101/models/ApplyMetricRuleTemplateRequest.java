// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateRequest extends TeaModel {
    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ApplyMode")
    public String applyMode;

    /**
     * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.</p>
     */
    @NameInMap("EnableEndTime")
    public Long enableEndTime;

    /**
     * <p>The mode in which the alert template is applied. Valid values:</p>
     * <br>
     * <p>*   GROUP_INSTANCE_FIRST: The metrics in the application group take precedence. If a metric specified in the alert template does not exist in the application group, the system does not generate an alert rule for the metric based on the alert template.</p>
     * <p>*   ALARM_TEMPLATE_FIRST: The metrics specified in the alert template take precedence. If a metric specified in the alert template does not exist in the application group, the system still generates an alert rule for the metric based on the alert template.</p>
     */
    @NameInMap("EnableStartTime")
    public Long enableStartTime;

    /**
     * <p>The beginning of the time period during which the alert rule is effective. Valid values: 00 to 23. A value of 00 indicates 00:00 and a value of 23 indicates 23:00.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The response code.</p>
     * <br>
     * <p>>  The HTTP status code 200 indicates that the call succeeds.</p>
     */
    @NameInMap("NotifyLevel")
    public Long notifyLevel;

    /**
     * <p>The ID of the alert template.</p>
     * <br>
     * <p>For more information about how to query the IDs of alert templates, see [DescribeMetricRuleTemplateList](~~114982~~).</p>
     */
    @NameInMap("SilenceTime")
    public Long silenceTime;

    /**
     * <p>The alert notification method. Valid values:</p>
     * <br>
     * <p>Set the value to 4. A value of 4 indicates that alert notifications are sent by using TradeManager and DingTalk chatbots.</p>
     */
    @NameInMap("TemplateIds")
    public String templateIds;

    /**
     * <p>The ID of the request.</p>
     */
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
