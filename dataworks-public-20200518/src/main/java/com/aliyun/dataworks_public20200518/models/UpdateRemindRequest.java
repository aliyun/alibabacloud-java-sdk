// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateRemindRequest extends TeaModel {
    /**
     * <p>The recipient to whom alert notifications are sent. Valid values: OWNER and OTHER. The value OWNER indicates that alert notifications are sent to the object owner. The value OTHER indicates that alert notifications are sent to a specified user.</p>
     */
    @NameInMap("AlertInterval")
    public Integer alertInterval;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <br>
     * <p>*   true: enables the alert rule.</p>
     * <p>*   false: disables the alert rule.</p>
     */
    @NameInMap("AlertMethods")
    public String alertMethods;

    /**
     * <p>The webhook URL of the DingTalk chatbot. You can specify multiple webhook URLs. Separate them with commas (,).</p>
     * <br>
     * <p>If this parameter is set to undefined, the specified webhook URLs are cleared.</p>
     */
    @NameInMap("AlertTargets")
    public String alertTargets;

    /**
     * <p>The value format required by this parameter varies based on the value that you specify for the AlertUnit parameter. Take note of the following items:</p>
     * <br>
     * <p>*   If the AlertUnit parameter is set to OWNER, leave this parameter empty.</p>
     * <p>*   If the AlertUnit parameter is set to OTHER, set this parameter to the unique ID (UID) of the specified user. You can specify multiple IDs. Separate them with commas (,). You can specify a maximum of 10 IDs.</p>
     */
    @NameInMap("AlertUnit")
    public String alertUnit;

    /**
     * <p>The ID of the workflow to which the custom alert rule is applied.. An alert rule can monitor a maximum of five workflows. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>This parameter takes effect when you set the RemindUnit parameter to BIZPROCESS.</p>
     */
    @NameInMap("BaselineIds")
    public String baselineIds;

    /**
     * <p>The maximum number of alerts. Valid values: 1 to 10. Default value: 3.</p>
     */
    @NameInMap("BizProcessIds")
    public String bizProcessIds;

    /**
     * <p>The notification method. Valid values:</p>
     * <br>
     * <p>*   MAIL: Alert notifications are sent by emails.</p>
     * <p>*   SMS: Alert notifications are sent by text messages.</p>
     * <p>*   PHONE: Alert notifications are sent by phone calls. You can use this notification method only in DataWorks Professional Edition or more advanced editions.</p>
     * <p>*   DINGROBOTS: Alert notifications are sent by DingTalk messages. You can use this notification method only if the RobotUrls parameter is configured.</p>
     * <p>*   WEBHOOKS (WeCom or Lark chatbot): Alert notifications are sent by WeCom or Lark messages. If you want to use this notification method, you must configure the Webhooks parameter.</p>
     * <br>
     * <p>You can specify multiple notification methods. Separate the specified notification methods with commas (,).</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The ID of the node to which the custom alert rule is applied.. An alert rule can monitor a maximum of 50 nodes. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>This parameter takes effect when you set the RemindUnit parameter to NODE.</p>
     */
    @NameInMap("DndEnd")
    public String dndEnd;

    /**
     * <p>The details of the conditions that trigger an alert.</p>
     * <br>
     * <p>*   If the RemindType parameter is set to FINISHED, leave this parameter empty.</p>
     * <br>
     * <p>*   If the RemindType parameter is set to UNFINISHED, set this parameter to key-value pairs. Example: {"hour":23,"minu":59}. Valid values of hour: 0 to 47. Valid values of minu: 0 to 59.</p>
     * <br>
     * <p>*   If the RemindType parameter is set to ERROR, leave this parameter empty.</p>
     * <br>
     * <p>*   If the RemindType parameter is set to CYCLE_UNFINISHED, set this parameter to key-value pairs in the JSON format. Example: {"1":"05:50","2":"06:50","3":"07:50","4":"08:50","5":"09:50","6":"10:50","7":"11:50","8":"12:50","9":"13:50","10":"14:50","11":"15:50","12":"16:50","13":"17:50","14":"18:50","15":"19:50","16":"20:50","17":"21:50","18":"22:50","19":"23:50","20":"24:50","21":"25:50"}.</p>
     * <br>
     * <p>    A key in the JSON string indicates the sequence number of a cycle. Valid values of keys: 1 to 288. A value in the JSON string indicates the time in point when a monitored instance times out in the relevant cycle. Values must be in the format of hh:mm. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
     * <br>
     * <p>*   If the RemindType parameter is set to TIMEOUT, set this parameter to the timeout period. Unit: seconds. Example: 1800. This indicates that an alert notification is sent if the duration of a monitored instance exceeds 30 minutes.</p>
     */
    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    /**
     * <p>The ID of the workspace to which the custom alert rule is applied.. Only one workspace can be specified for a custom alert rule.</p>
     * <br>
     * <p>This parameter takes effect when you set the RemindUnit parameter to PROJECT.</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The condition that triggers the alert rule. Valid values:</p>
     * <br>
     * <p>*   FINISHED: The system monitors an instance when it starts to run and sends an alert notification after the running of the instance is complete.</p>
     * <p>*   UNFINISHED: The system monitors an instance when it starts to run and sends an alert notification if the instance is still running at the specified point in time.</p>
     * <p>*   ERROR: The system monitors an instance when it starts to run and sends an alert notification if an error occurs.</p>
     * <p>*   CYCLE_UNFINISHED: The system sends an alert notification if a monitored instance is still running at the end of the specified cycle. In most cases, you can configure this trigger condition for node instances that are scheduled to run by hour.</p>
     * <p>*   TIMEOUT: The system monitors an instance when it starts to run and sends an alert notification if the instance is still running after the specified period ends. In most cases, you can configure this trigger condition to monitor the duration of node instances.</p>
     * <br>
     * <p>For more information, see [Manage custom alert rules](~~138172~~).</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The end of the period during which no alert notifications are sent. Specify the time in the hh:mm format. Valid values of hh: 0 to 23. Valid values of mm: 0 to 59.</p>
     */
    @NameInMap("RemindId")
    public Long remindId;

    /**
     * <p>The type of the object to which the custom alert rule is applied.. Valid values:</p>
     * <br>
     * <p>*   NODE: node</p>
     * <p>*   BASELINE: baseline</p>
     * <p>*   PROJECT: workspace</p>
     * <p>*   BIZPROCESS: workflow</p>
     */
    @NameInMap("RemindName")
    public String remindName;

    /**
     * <p>The intervals at which alert notifications are sent. Unit: seconds. Minimum value: 1200. Default value: 1800.</p>
     */
    @NameInMap("RemindType")
    public String remindType;

    /**
     * <p>The ID of the baseline to which the custom alert rule is applied.. An alert rule can monitor a maximum of five baselines. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>This parameter takes effect when you set the RemindUnit parameter to BASELINE.</p>
     */
    @NameInMap("RemindUnit")
    public String remindUnit;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("RobotUrls")
    public String robotUrls;

    /**
     * <p>The webhook URL of the WeCom or Lark chatbot. You can specify multiple webhook URLs. Separate the specified webhook URLs with commas (,). The WEBHOOKS notification method must be specified for alertMethods. If this parameter is set to undefined, the specified webhook URLs are cleared.</p>
     * <br>
     * <p>Only DataWorks Enterprise Edition supports this parameter.</p>
     * <br>
     * <p>The webhook URL-based alerting feature is supported in the following regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), China (Hong Kong), Germany (Frankfurt), and Singapore.</p>
     */
    @NameInMap("UseFlag")
    public Boolean useFlag;

    /**
     * <p>Indicates whether the modification to the custom alert rule succeeds.</p>
     */
    @NameInMap("Webhooks")
    public String webhooks;

    public static UpdateRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRemindRequest self = new UpdateRemindRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRemindRequest setAlertInterval(Integer alertInterval) {
        this.alertInterval = alertInterval;
        return this;
    }
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    public UpdateRemindRequest setAlertMethods(String alertMethods) {
        this.alertMethods = alertMethods;
        return this;
    }
    public String getAlertMethods() {
        return this.alertMethods;
    }

    public UpdateRemindRequest setAlertTargets(String alertTargets) {
        this.alertTargets = alertTargets;
        return this;
    }
    public String getAlertTargets() {
        return this.alertTargets;
    }

    public UpdateRemindRequest setAlertUnit(String alertUnit) {
        this.alertUnit = alertUnit;
        return this;
    }
    public String getAlertUnit() {
        return this.alertUnit;
    }

    public UpdateRemindRequest setBaselineIds(String baselineIds) {
        this.baselineIds = baselineIds;
        return this;
    }
    public String getBaselineIds() {
        return this.baselineIds;
    }

    public UpdateRemindRequest setBizProcessIds(String bizProcessIds) {
        this.bizProcessIds = bizProcessIds;
        return this;
    }
    public String getBizProcessIds() {
        return this.bizProcessIds;
    }

    public UpdateRemindRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UpdateRemindRequest setDndEnd(String dndEnd) {
        this.dndEnd = dndEnd;
        return this;
    }
    public String getDndEnd() {
        return this.dndEnd;
    }

    public UpdateRemindRequest setMaxAlertTimes(Integer maxAlertTimes) {
        this.maxAlertTimes = maxAlertTimes;
        return this;
    }
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    public UpdateRemindRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public UpdateRemindRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateRemindRequest setRemindId(Long remindId) {
        this.remindId = remindId;
        return this;
    }
    public Long getRemindId() {
        return this.remindId;
    }

    public UpdateRemindRequest setRemindName(String remindName) {
        this.remindName = remindName;
        return this;
    }
    public String getRemindName() {
        return this.remindName;
    }

    public UpdateRemindRequest setRemindType(String remindType) {
        this.remindType = remindType;
        return this;
    }
    public String getRemindType() {
        return this.remindType;
    }

    public UpdateRemindRequest setRemindUnit(String remindUnit) {
        this.remindUnit = remindUnit;
        return this;
    }
    public String getRemindUnit() {
        return this.remindUnit;
    }

    public UpdateRemindRequest setRobotUrls(String robotUrls) {
        this.robotUrls = robotUrls;
        return this;
    }
    public String getRobotUrls() {
        return this.robotUrls;
    }

    public UpdateRemindRequest setUseFlag(Boolean useFlag) {
        this.useFlag = useFlag;
        return this;
    }
    public Boolean getUseFlag() {
        return this.useFlag;
    }

    public UpdateRemindRequest setWebhooks(String webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public String getWebhooks() {
        return this.webhooks;
    }

}
