// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateRemindRequest extends TeaModel {
    /**
     * <p>The minimum interval at which alerts are reported. Unit: seconds. Minimum value: 1200. Default value: 1800.</p>
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
     * <li>SMS: Alert notifications are sent by text message. Alert notifications can be sent by text message only in the Singapore, Malaysia (Kuala Lumpur), and Germany (Frankfurt) regions.</li>
     * <li>WEBHOOKS (WeCom or Lark chatbot): Alert notifications are sent by WeCom or Lark message. If you want to use this notification method, you must configure the Webhooks parameter.</li>
     * </ul>
     * <p>You can specify multiple notification methods. Separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS,MAIL</p>
     */
    @NameInMap("AlertMethods")
    public String alertMethods;

    /**
     * <ul>
     * <li>If the AlertUnit parameter is set to OWNER, leave this parameter empty.</li>
     * <li>If the AlertUnit parameter is set to OTHER, set this parameter to the ID of the Alibaba Cloud account used by the specified user. You can specify multiple IDs. Separate multiple IDs with commas (,). You can specify a maximum of 10 IDs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9527952795279527</p>
     */
    @NameInMap("AlertTargets")
    public String alertTargets;

    /**
     * <p>The recipient of the alert. Valid values: OWNER and OTHER. The value OWNER indicates the node owner. The value OTHER indicates a specified user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OWNER</p>
     */
    @NameInMap("AlertUnit")
    public String alertUnit;

    /**
     * <p>The ID of the baseline to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to BASELINE. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of five baselines can be specified for a custom alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("BaselineIds")
    public String baselineIds;

    /**
     * <p>The ID of the workflow to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to BIZPROCESS. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of five workflows can be specified for a custom alert rule.</p>
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
     * <li>If the RemindType parameter is set to UNFINISHED, configure this parameter as key-value pairs. Example: {&quot;hour&quot;:23,&quot;minu&quot;:59}. Valid values of hour: [0,47]. Valid values of minu: [0,59].</li>
     * <li>If the RemindType parameter is set to ERROR, leave this parameter empty.</li>
     * <li>If the RemindType parameter is set to CYCLE_UNFINISHED, configure this parameter as key-value pairs. Example: {&quot;1&quot;:&quot;05:50&quot;,&quot;2&quot;:&quot;06:50&quot;,&quot;3&quot;:&quot;07:50&quot;,&quot;4&quot;:&quot;08:50&quot;,&quot;5&quot;:&quot;09:50&quot;,&quot;6&quot;:&quot;10:50&quot;,&quot;7&quot;:&quot;11:50&quot;,&quot;8&quot;:&quot;12:50&quot;,&quot;9&quot;:&quot;13:50&quot;,&quot;10&quot;:&quot;14:50&quot;,&quot;11&quot;:&quot;15:50&quot;,&quot;12&quot;:&quot;16:50&quot;,&quot;13&quot;:&quot;17:50&quot;,&quot;14&quot;:&quot;18:50&quot;,&quot;15&quot;:&quot;19:50&quot;,&quot;16&quot;:&quot;20:50&quot;,&quot;17&quot;:&quot;21:50&quot;,&quot;18&quot;:&quot;22:50&quot;,&quot;19&quot;:&quot;23:50&quot;,&quot;20&quot;:&quot;24:50&quot;,&quot;21&quot;:&quot;25:50&quot;}. The key indicates the ID of the cycle. Valid values: [1,288]. The value indicates the timeout period of the node that is running in the cycle. Specify the value in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</li>
     * <li>If the RemindType parameter is set to TIMEOUT, set this parameter to the timeout period. Unit: seconds. Example: 1800. This value indicates that an alert is reported if the node has run for more than 30 minutes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;hour&quot;:23,&quot;minu&quot;:59}</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The end time of the quiet hours. Specify the time in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
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
     * <p>2</p>
     */
    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    /**
     * <p>The ID of the node to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to NODE. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of 50 nodes can be specified for a custom alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The ID of the workspace to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to PROJECT. You can specify only one workspace for a custom alert rule.</p>
     * 
     * <strong>example:</strong>
     * <p>9527</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the custom alert rule. The name cannot exceed 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_error_remind</p>
     */
    @NameInMap("RemindName")
    public String remindName;

    /**
     * <p>The conditions that trigger an alert. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("RemindType")
    public String remindType;

    /**
     * <p>The type of the object to which the custom alert rule is applied. Valid values: NODE, BASELINE, PROJECT, and BIZPROCESS. The value NODE indicates a node. The value BASELINE indicates a baseline. The value PROJECT indicates a workspace. The value BIZPROCESS indicates a workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NODE</p>
     */
    @NameInMap("RemindUnit")
    public String remindUnit;

    /**
     * <p>The webhook URL of the DingTalk chatbot. You can specify multiple webhook URLs. Separate multiple webhook URLs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>******************************</p>
     */
    @NameInMap("RobotUrls")
    public String robotUrls;

    /**
     * <p>The webhook URL of the WeCom or Lark chatbot. You can specify multiple webhook URLs. Separate multiple webhook URLs with commas (,). You must specify WEBHOOKS for AlertMethods.</p>
     * <p>Only DataWorks Enterprise Edition supports this parameter. The webhook URL-based alerting feature is supported in the following regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), China (Hong Kong), Germany (Frankfurt), and Singapore.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://open.feishu.cn/open-apis/bot/v2/hook/">https://open.feishu.cn/open-apis/bot/v2/hook/</a>*******</p>
     */
    @NameInMap("Webhooks")
    public String webhooks;

    public static CreateRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRemindRequest self = new CreateRemindRequest();
        return TeaModel.build(map, self);
    }

    public CreateRemindRequest setAlertInterval(Integer alertInterval) {
        this.alertInterval = alertInterval;
        return this;
    }
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    public CreateRemindRequest setAlertMethods(String alertMethods) {
        this.alertMethods = alertMethods;
        return this;
    }
    public String getAlertMethods() {
        return this.alertMethods;
    }

    public CreateRemindRequest setAlertTargets(String alertTargets) {
        this.alertTargets = alertTargets;
        return this;
    }
    public String getAlertTargets() {
        return this.alertTargets;
    }

    public CreateRemindRequest setAlertUnit(String alertUnit) {
        this.alertUnit = alertUnit;
        return this;
    }
    public String getAlertUnit() {
        return this.alertUnit;
    }

    public CreateRemindRequest setBaselineIds(String baselineIds) {
        this.baselineIds = baselineIds;
        return this;
    }
    public String getBaselineIds() {
        return this.baselineIds;
    }

    public CreateRemindRequest setBizProcessIds(String bizProcessIds) {
        this.bizProcessIds = bizProcessIds;
        return this;
    }
    public String getBizProcessIds() {
        return this.bizProcessIds;
    }

    public CreateRemindRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public CreateRemindRequest setDndEnd(String dndEnd) {
        this.dndEnd = dndEnd;
        return this;
    }
    public String getDndEnd() {
        return this.dndEnd;
    }

    public CreateRemindRequest setMaxAlertTimes(Integer maxAlertTimes) {
        this.maxAlertTimes = maxAlertTimes;
        return this;
    }
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    public CreateRemindRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public CreateRemindRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateRemindRequest setRemindName(String remindName) {
        this.remindName = remindName;
        return this;
    }
    public String getRemindName() {
        return this.remindName;
    }

    public CreateRemindRequest setRemindType(String remindType) {
        this.remindType = remindType;
        return this;
    }
    public String getRemindType() {
        return this.remindType;
    }

    public CreateRemindRequest setRemindUnit(String remindUnit) {
        this.remindUnit = remindUnit;
        return this;
    }
    public String getRemindUnit() {
        return this.remindUnit;
    }

    public CreateRemindRequest setRobotUrls(String robotUrls) {
        this.robotUrls = robotUrls;
        return this;
    }
    public String getRobotUrls() {
        return this.robotUrls;
    }

    public CreateRemindRequest setWebhooks(String webhooks) {
        this.webhooks = webhooks;
        return this;
    }
    public String getWebhooks() {
        return this.webhooks;
    }

}
