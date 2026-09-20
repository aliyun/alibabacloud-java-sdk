// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateRemindRequest extends TeaModel {
    /**
     * <p>The minimum alert interval, in seconds. Minimum value: 1200. Default value: 1800.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("AlertInterval")
    public Integer alertInterval;

    /**
     * <p>The alert method. Valid values:</p>
     * <ul>
     * <li>MAIL: email.</li>
     * <li>SMS: text message.
     * &lt;props=&quot;intl&quot;&gt;The regions that support SMS alerts are Singapore, Malaysia (Kuala Lumpur), and Germany (Frankfurt).
     * &lt;props=&quot;china&quot;&gt;- PHONE: phone call. Only DataWorks Professional Edition and higher editions are supported.</li>
     * <li>Webhooks (WeCom or Lark chatbot). This alert method takes effect only after the Webhooks parameter is configured.</li>
     * <li>DINGROBOTS: DingTalk chatbot.</li>
     * </ul>
     * <p>Separate multiple alert methods with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMS,MAIL</p>
     */
    @NameInMap("AlertMethods")
    public String alertMethods;

    /**
     * <ul>
     * <li><p>When AlertUnit (alert recipient) is set to OWNER (node owner), pass an empty value.</p>
     * </li>
     * <li><p>When AlertUnit (alert recipient) is set to OTHER (specified user), pass the Alibaba Cloud UIDs of the specified users. Separate multiple Alibaba Cloud UIDs with commas (,). A maximum of 10 UIDs are supported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9527952795279527</p>
     */
    @NameInMap("AlertTargets")
    public String alertTargets;

    /**
     * <p>The granularity of the alert recipient. Valid values: OWNER (node owner) and OTHER (specified user).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OWNER</p>
     */
    @NameInMap("AlertUnit")
    public String alertUnit;

    /**
     * <p>The IDs of the baselines to monitor when RemindUnit (object type) is set to BASELINE (baseline). Separate multiple IDs with commas (,). A maximum of 5 baselines can be monitored by a single rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("BaselineIds")
    public String baselineIds;

    /**
     * <p>The IDs of the business processes to monitor when RemindUnit (object type) is set to BIZPROCESS (business process). Separate multiple business process IDs with commas (,). A maximum of 5 business processes can be monitored by a single rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("BizProcessIds")
    public String bizProcessIds;

    /**
     * <p>The descriptions for different trigger conditions are as follows:</p>
     * <ul>
     * <li><p>When RemindType (trigger condition) is set to FINISHED (completed), pass an empty value.</p>
     * </li>
     * <li><p>When RemindType (trigger condition) is set to UNFINISHED (not completed), pass parameter in the format of {&quot;hour&quot;:23,&quot;minu&quot;:59}. Valid values of hour: [0,47\]. Valid values of minu: [0,59\].</p>
     * </li>
     * <li><p>When RemindType (trigger condition) is set to ERROR (error), pass an empty value.</p>
     * </li>
     * <li><p>When RemindType (trigger condition) is set to CYCLE_UNFINISHED (cycle not completed), pass parameter in the format of {&quot;1&quot;:&quot;05:50&quot;,&quot;2&quot;:&quot;06:50&quot;,&quot;3&quot;:&quot;07:50&quot;,&quot;4&quot;:&quot;08:50&quot;,&quot;5&quot;:&quot;09:50&quot;,&quot;6&quot;:&quot;10:50&quot;,&quot;7&quot;:&quot;11:50&quot;,&quot;8&quot;:&quot;12:50&quot;,&quot;9&quot;:&quot;13:50&quot;,&quot;10&quot;:&quot;14:50&quot;,&quot;11&quot;:&quot;15:50&quot;,&quot;12&quot;:&quot;16:50&quot;,&quot;13&quot;:&quot;17:50&quot;,&quot;14&quot;:&quot;18:50&quot;,&quot;15&quot;:&quot;19:50&quot;,&quot;16&quot;:&quot;20:50&quot;,&quot;17&quot;:&quot;21:50&quot;,&quot;18&quot;:&quot;22:50&quot;,&quot;19&quot;:&quot;23:50&quot;,&quot;20&quot;:&quot;24:50&quot;,&quot;21&quot;:&quot;25:50&quot;}. The key in the JSON character string is the cycle number. Valid values: [1,288\]. The value is the not-completed time for the corresponding cycle, in the hh:mm format. Valid values of hh: [0,47\]. Valid values of mm: [0,59\].</p>
     * </li>
     * <li><p>When RemindType (trigger condition) is set to TIMEOUT (running timeout), pass parameter as a value such as 1800, in seconds. This means that an alert is triggered if the running time exceeds 30 minutes from the start of execution.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;hour&quot;:&quot;23&quot;,&quot;minu&quot;:&quot;59&quot;}</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The end time of the do-not-disturb period, in the hh:mm format. Valid values of hh: [0,23\]. Valid values of mm: [0,59\].</p>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("DndEnd")
    public String dndEnd;

    /**
     * <p>The maximum number of alerts. Minimum value: 1. Maximum value: 10. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    /**
     * <p>The IDs of the nodes to monitor when RemindUnit (object type) is set to NODE (node). Separate multiple IDs with commas (,). A maximum of 50 nodes can be monitored by a single rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The ID of the workspace to monitor when RemindUnit (object type) is set to PROJECT (workspace). A single rule can monitor only one workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>9527</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the custom rule. The name can be up to 128 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_error_remind</p>
     */
    @NameInMap("RemindName")
    public String remindName;

    /**
     * <p>The trigger condition. Valid values: FINISHED (completed), UNFINISHED (not completed), ERROR (error), CYCLE_UNFINISHED (cycle not completed), and TIMEOUT (running timeout).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("RemindType")
    public String remindType;

    /**
     * <p>The type of the object. Valid values: NODE (node), BASELINE (baseline), PROJECT (workspace), and BIZPROCESS (business process).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NODE</p>
     */
    @NameInMap("RemindUnit")
    public String remindUnit;

    /**
     * <p>The webhook URLs of DingTalk chatbots. Separate multiple webhook URLs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>******************************</p>
     */
    @NameInMap("RobotUrls")
    public String robotUrls;

    /**
     * <p>The webhook URLs of WeCom or Lark chatbots. Separate multiple webhook URLs with commas (,). The alertMethods parameter must include the WEBHOOKS alert method.</p>
     * <p>Only DataWorks Enterprise Edition is supported.
     * Available regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), Hong Kong (China), Germany (Frankfurt), and Singapore.</p>
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
