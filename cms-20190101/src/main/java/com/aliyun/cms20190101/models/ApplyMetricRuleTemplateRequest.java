// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ApplyMetricRuleTemplateRequest extends TeaModel {
    /**
     * <p>The application policy of the template. Valid values:</p>
     * <ul>
     * <li><p>all: deletes all rules created by using alert templates on the selected group and then creates new alert rules based on the template. This is the default value.</p>
     * </li>
     * <li><p>append: deletes the rules created by using the current alert template on the selected group and then creates new alert rules based on the current template.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("AppendMode")
    public String appendMode;

    /**
     * <p>The application mode of the template. Valid values:</p>
     * <ul>
     * <li><p>GROUP_INSTANCE_FIRST: application group instances take precedence. When the alert template is applied, the instances in the application group take precedence. If an instance specified in the template does not exist in the application group, the rule for the instance in the template is ignored.</p>
     * </li>
     * <li><p>ALARM_TEMPLATE_FIRST: alert template instances take precedence. When the alert template is applied, alert rules are created regardless of whether the instances exist in the application group.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GROUP_INSTANCE_FIRST</p>
     */
    @NameInMap("ApplyMode")
    public String applyMode;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run and does not bind a security group to the instance. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: performs a normal request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The end time of the effective period for the alert, in hours. The value is a two-digit string, such as &quot;00&quot;, &quot;18&quot;, or &quot;23&quot;. Valid values: 00 to 23. The value specifies the hour of the end time, and the actual effective period ends at the 59th minute of the hour. For example, &quot;23&quot; indicates that the effective period ends at 23:59. The default time zone is UTC+8.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("EnableEndTime")
    public Long enableEndTime;

    /**
     * <p>The start time of the effective period for the alert, in hours. The value is a two-digit string, such as &quot;00&quot;, &quot;09&quot;, or &quot;23&quot;. Valid values: 00 to 23, which represent 00:00 to 23:00. The default time zone is UTC+8.</p>
     * 
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("EnableStartTime")
    public Long enableStartTime;

    /**
     * <p>The ID of the application group.</p>
     * <p>For more information about how to obtain the ID of an application group, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The alert notification method. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;- 2: phone call, text message, mailbox, TradeManager, and DingTalk chatbot.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- 3: text message, mailbox, TradeManager, and DingTalk chatbot.</p>
     * <p>&lt;props=&quot;china&quot;&gt;- 4: TradeManager and DingTalk chatbot.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;4: TradeManager and DingTalk chatbot.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;4: TradeManager and DingTalk chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NotifyLevel")
    public Long notifyLevel;

    /**
     * <p>The mute for. Unit: seconds. Default value: 86400.</p>
     * <blockquote>
     * <p>If the monitoring data continuously exceeds the threshold of the alert rule, the system sends only one alert notification within each epoch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("SilenceTime")
    public Long silenceTime;

    /**
     * <p>The ID of the alert template.</p>
     * <p>For more information about how to obtain the ID of an alert template, see <a href="https://help.aliyun.com/document_detail/114982.html">DescribeMetricRuleTemplateList</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>700****</p>
     */
    @NameInMap("TemplateIds")
    public String templateIds;

    /**
     * <p>The webhook URL to which a POST request is sent when an alert is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("Webhook")
    public String webhook;

    public static ApplyMetricRuleTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyMetricRuleTemplateRequest self = new ApplyMetricRuleTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyMetricRuleTemplateRequest setAppendMode(String appendMode) {
        this.appendMode = appendMode;
        return this;
    }
    public String getAppendMode() {
        return this.appendMode;
    }

    public ApplyMetricRuleTemplateRequest setApplyMode(String applyMode) {
        this.applyMode = applyMode;
        return this;
    }
    public String getApplyMode() {
        return this.applyMode;
    }

    public ApplyMetricRuleTemplateRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
