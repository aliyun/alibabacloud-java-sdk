// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateRemindRequest extends TeaModel {
    /**
     * <p>The recipient of the alert. Valid values: OWNER and OTHER. The value OWNER indicates the node owner. The value OTHER indicates a specified user.</p>
     */
    @NameInMap("AlertInterval")
    public Integer alertInterval;

    /**
     * <p>The webhook URL of the DingTalk chatbot. You can specify multiple webhook URLs. Separate the specified webhook URLs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertMethods")
    public String alertMethods;

    /**
     * <p>The webhook URL of the WeCom or Lark chatbot. You can specify multiple webhook URLs. Separate the specified webhook URLs with commas (,). The WEBHOOKS notification method must be specified for alertMethods.</p>
     * <br>
     * <p>Only DataWorks Enterprise Edition supports this parameter.</p>
     * <br>
     * <p>The webhook URL-based alerting feature is supported in the following regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), China (Hong Kong), Germany (Frankfurt), and Singapore.</p>
     */
    @NameInMap("AlertTargets")
    public String alertTargets;

    /**
     * <p>*   If the AlertUnit parameter is set to OWNER, leave this parameter empty.</p>
     * <p>*   If the AlertUnit parameter is set to OTHER, set this parameter to the ID of the Alibaba Cloud account used by a specific user. You can specify multiple IDs. Separate multiple IDs with commas (,). You can specify a maximum of 10 IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlertUnit")
    public String alertUnit;

    /**
     * <p>The ID of the workflow to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to BIZPROCESS. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of five workflows can be specified for a custom alert rule.</p>
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
     * <br>
     * <p>*   SMS: Alert notifications are sent by text messages.</p>
     * <br>
     * <p>    Alert notifications can be sent by text messages only in the Singapore, Malaysia (Kuala Lumpur), and Germany (Frankfurt) regions.</p>
     * <br>
     * <p>*   WEBHOOKS (WeCom or Lark chatbot): Alert notifications are sent by WeCom or Lark messages. If you want to use this notification method, you must configure the Webhooks parameter.</p>
     * <br>
     * <p>You can specify multiple notification methods. Separate them with commas (,).</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The ID of the node to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to NODE. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of 50 nodes can be specified for a custom alert rule.</p>
     */
    @NameInMap("DndEnd")
    public String dndEnd;

    /**
     * <p>The details of the conditions that trigger an alert.</p>
     * <br>
     * <p>*   If the RemindType parameter is set to FINISHED, leave this parameter empty.</p>
     * <p>*   If the RemindType parameter is set to UNFINISHED, specify this parameter as key-value pairs. Example: {"hour":23,"minu":59}. Valid values of hour: 0 to 47. Valid values of minu: 0 to 59.</p>
     * <p>*   If the RemindType parameter is set to ERROR, leave this parameter empty.</p>
     * <p>*   If the RemindType parameter is set to CYCLE_UNFINISHED, specify this parameter as key-value pairs. Example: {"1":"05:50","2":"06:50","3":"07:50","4":"08:50","5":"09:50","6":"10:50","7":"11:50","8":"12:50","9":"13:50","10":"14:50","11":"15:50","12":"16:50","13":"17:50","14":"18:50","15":"19:50","16":"20:50","17":"21:50","18":"22:50","19":"23:50","20":"24:50","21":"25:50"}. The key indicates the ID of the cycle. Valid values of the ID: 1 to 288. The value indicates the timeout period of the node that is running in the cycle. Specify the value in the hh:mm format. Valid values of hh: 0 to 47. Valid values of mm: 0 to 59.</p>
     * <p>*   If the RemindType parameter is set to TIMEOUT, set this parameter to the timeout period. Unit: seconds. Example: 1800. This value indicates that an alert is reported if the node has run for more than 30 minutes.</p>
     */
    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    /**
     * <p>The ID of the workspace to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to PROJECT. Only one workspace can be specified for a custom alert rule.</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The conditions that trigger an alert. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT. The value FINISHED indicates that the node is run. The value UNFINISHED indicates that the node is still running at the specified point in time. The value ERROR indicates that an error occurs when the node is running. The value CYCLE_UNFINISHED indicates that the node is still running in the specified cycle. The value TIMEOUT indicates that the node times out.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the object to which the custom alert rule is applied. Valid values: NODE, BASELINE, PROJECT, and BIZPROCESS. The value NODE indicates a node. The value BASELINE indicates a baseline. The value PROJECT indicates a workspace. The value BIZPROCESS indicates a workflow.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemindName")
    public String remindName;

    /**
     * <p>The minimum interval at which alerts are reported. Unit: seconds. Minimum value: 1200. Default value: 1800.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemindType")
    public String remindType;

    /**
     * <p>The ID of the baseline to which the custom alert rule is applied. This parameter takes effect when the RemindUnit parameter is set to BASELINE. You can specify multiple IDs. Separate multiple IDs with commas (,). A maximum of five baselines can be specified for a custom alert rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemindUnit")
    public String remindUnit;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("RobotUrls")
    public String robotUrls;

    /**
     * <p>The ID of the custom alert rule returned.</p>
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
