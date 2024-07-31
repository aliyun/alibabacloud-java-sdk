// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateRemindRequest extends TeaModel {
    /**
     * <p>The intervals at which alert notifications are sent. Unit: seconds. Minimum value: 1200. Default value: 1800.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("AlertInterval")
    public Integer alertInterval;

    /**
     * <p>The notification method. Valid values:</p>
     * <ul>
     * <li>MAIL: Alert notifications are sent by email.</li>
     * <li>SMS: Alert notifications are sent by text message.</li>
     * <li>PHONE: Alert notifications are sent by phone call. You can use this notification method only in DataWorks Professional Edition or more advanced editions.</li>
     * <li>DINGROBOTS: Alert notifications are sent by DingTalk message. You can use this notification method only if the RobotUrls parameter is configured.</li>
     * <li>WEBHOOKS (WeCom or Lark chatbot): Alert notifications are sent by WeCom or Lark message. You can use this notification method only if the Webhooks parameter is configured.</li>
     * </ul>
     * <p>Multiple notification methods are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>SMS,MAIL</p>
     */
    @NameInMap("AlertMethods")
    public String alertMethods;

    /**
     * <p>The value format required by this parameter varies based on the value that you specify for the AlertUnit parameter. Take note of the following items:</p>
     * <ul>
     * <li>If the AlertUnit parameter is set to OWNER, leave this parameter empty.</li>
     * <li>If the AlertUnit parameter is set to OTHER, set this parameter to the unique ID (UID) of the specified user. You can specify multiple UIDs. Separate them with commas (,). A maximum of 10 UIDs can be specified for receiving alert notifications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9527952795279527</p>
     */
    @NameInMap("AlertTargets")
    public String alertTargets;

    /**
     * <p>The recipient to whom alert notifications are sent. Valid values: OWNER and OTHER. The value OWNER indicates that alert notifications are sent to the object owner. The value OTHER indicates that alert notifications are sent to a specified user.</p>
     * 
     * <strong>example:</strong>
     * <p>OWNER</p>
     */
    @NameInMap("AlertUnit")
    public String alertUnit;

    /**
     * <p>The ID of the baseline to which the custom alert rule is applied. A maximum of 5 baselines can be specified for a custom alert rule. You can specify multiple IDs. Separate multiple IDs with commas (,). This parameter takes effect when you set the RemindUnit parameter to BASELINE.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("BaselineIds")
    public String baselineIds;

    /**
     * <p>The ID of the workflow to which the custom alert rule is applied. A maximum of 5 workflows can be specified for a custom alert rule. You can specify multiple IDs. Separate multiple IDs with commas (,). This parameter takes effect when you set the RemindUnit parameter to BIZPROCESS.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("BizProcessIds")
    public String bizProcessIds;

    /**
     * <p>The details of the conditions that trigger an alert.</p>
     * <ul>
     * <li>If the RemindType parameter is set to FINISHED, leave this parameter empty.</li>
     * <li>If the RemindType parameter is set to UNFINISHED, set this parameter to key-value pairs. Example: {&quot;hour&quot;:23,&quot;minu&quot;:59}. Valid values of hour: [0,47]. Valid values of minu: [0,59].</li>
     * <li>If the RemindType parameter is set to ERROR, leave this parameter empty.</li>
     * <li>If the RemindType parameter is set to CYCLE_UNFINISHED, set this parameter to key-value pairs in the JSON format. Example: {&quot;1&quot;:&quot;05:50&quot;,&quot;2&quot;:&quot;06:50&quot;,&quot;3&quot;:&quot;07:50&quot;,&quot;4&quot;:&quot;08:50&quot;,&quot;5&quot;:&quot;09:50&quot;,&quot;6&quot;:&quot;10:50&quot;,&quot;7&quot;:&quot;11:50&quot;,&quot;8&quot;:&quot;12:50&quot;,&quot;9&quot;:&quot;13:50&quot;,&quot;10&quot;:&quot;14:50&quot;,&quot;11&quot;:&quot;15:50&quot;,&quot;12&quot;:&quot;16:50&quot;,&quot;13&quot;:&quot;17:50&quot;,&quot;14&quot;:&quot;18:50&quot;,&quot;15&quot;:&quot;19:50&quot;,&quot;16&quot;:&quot;20:50&quot;,&quot;17&quot;:&quot;21:50&quot;,&quot;18&quot;:&quot;22:50&quot;,&quot;19&quot;:&quot;23:50&quot;,&quot;20&quot;:&quot;24:50&quot;,&quot;21&quot;:&quot;25:50&quot;}. A key in the JSON string indicates the sequence number of a cycle. Valid values of keys: 1 to 288. A value in the JSON string indicates the time in point when a monitored instance times out in the relevant cycle. Values must be in the format of hh:mm. Valid values of hh: [0,47]. Valid values of mm: [0,59].</li>
     * <li>If the RemindType parameter is set to TIMEOUT, set this parameter to the timeout period. Unit: seconds. Example: 1800. This indicates that an alert notification is sent if the running duration of a monitored instance exceeds 30 minutes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;hour&quot;:23,&quot;minu&quot;:59}</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The end of the period during which no alert notifications are sent. Specify the time in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("DndEnd")
    public String dndEnd;

    /**
     * <p>The maximum number of alerts. Valid values: 1 to 10. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    /**
     * <p>The ID of the node to which the custom alert rule is applied. A maximum of 50 nodes can be specified for a custom alert rule. You can specify multiple IDs. Separate multiple IDs with commas (,). This parameter takes effect when you set the RemindUnit parameter to NODE.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The ID of the workspace to which the custom alert rule is applied. You can specify only one workspace for a custom alert rule. This parameter takes effect when you set the RemindUnit parameter to PROJECT.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The custom alert rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RemindId")
    public Long remindId;

    /**
     * <p>The name of the custom alert rule. The name cannot exceed 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>update_remindname</p>
     */
    @NameInMap("RemindName")
    public String remindName;

    /**
     * <p>The condition that triggers the alert rule. Valid values:</p>
     * <ul>
     * <li>FINISHED: The system monitors an instance when it starts to run and sends an alert notification after the running of the instance is complete.</li>
     * <li>UNFINISHED: The system monitors an instance when it starts to run and sends an alert notification if the instance is still running at the specified point in time.</li>
     * <li>ERROR: The system monitors an instance when it starts to run and sends an alert notification if an error occurs.</li>
     * <li>CYCLE_UNFINISHED: The system sends an alert notification if a monitored instance is still running at the end of the specified cycle. In most cases, you can configure this trigger condition for node instances that are scheduled to run by hour.</li>
     * <li>TIMEOUT: The system monitors an instance when it starts to run and sends an alert notification if the instance is still running after the specified period ends. In most cases, you can configure this trigger condition to monitor the running duration of node instances.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/138172.html">Manage custom alert rules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("RemindType")
    public String remindType;

    /**
     * <p>The type of the object to which the custom alert rule is applied. Valid values:</p>
     * <ul>
     * <li>NODE</li>
     * <li>BASELINE</li>
     * <li>PROJECT</li>
     * <li>BIZPROCESS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NODE</p>
     */
    @NameInMap("RemindUnit")
    public String remindUnit;

    /**
     * <p>The webhook URL of the DingTalk chatbot. You can specify multiple webhook URLs. Separate multiple webhook URLs with commas (,). If this parameter is set to undefined, the specified webhook URLs are cleared.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>******************************</p>
     */
    @NameInMap("RobotUrls")
    public String robotUrls;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseFlag")
    public Boolean useFlag;

    /**
     * <p>The webhook URL of the WeCom or Lark chatbot. You can specify multiple webhook URLs. Separate multiple webhook URLs with commas (,). The value of AlertMethods must include WEBHOOKS. If this parameter is set to undefined, the specified webhook URLs are cleared.</p>
     * <p>Only DataWorks Enterprise Edition supports this parameter. The webhook URL-based alerting feature is supported in the following regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), China (Hong Kong), Germany (Frankfurt), and Singapore.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://open.feishu.cn/open-apis/bot/v2/hook/">https://open.feishu.cn/open-apis/bot/v2/hook/</a>*******</p>
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
