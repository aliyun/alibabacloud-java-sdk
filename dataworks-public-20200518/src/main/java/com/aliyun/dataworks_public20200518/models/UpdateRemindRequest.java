// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateRemindRequest extends TeaModel {
    /**
     * <p>The alert interval, in seconds. Minimum value: 1200. Default value: 1800.</p>
     * 
     * <strong>example:</strong>
     * <p>1800</p>
     */
    @NameInMap("AlertInterval")
    public Integer alertInterval;

    /**
     * <p>The alert notification method. Valid values:</p>
     * <ul>
     * <li>MAIL</li>
     * <li>SMS</li>
     * <li>PHONE. Only DataWorks Professional Edition and higher support phone alerts.</li>
     * <li>DINGROBOTS (DingTalk chatbot). This method takes effect only after the RobotUrls parameter is configured.</li>
     * <li>Webhooks (WeCom or Lark chatbot). This method takes effect only after the Webhooks parameter is configured.</li>
     * </ul>
     * <p>Separate multiple alert methods with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>SMS,MAIL</p>
     */
    @NameInMap("AlertMethods")
    public String alertMethods;

    /**
     * <p>The configuration details for different alert recipients:</p>
     * <ul>
     * <li>When AlertUnit is set to OWNER (node owner), the configuration is left empty.</li>
     * <li>When AlertUnit is set to OTHER (specified user), set this parameter to the Alibaba Cloud UIDs of the specified users. Separate multiple UIDs with commas (,). You can specify up to 10 users to receive alerts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9527952795279527</p>
     */
    @NameInMap("AlertTargets")
    public String alertTargets;

    /**
     * <p>The recipient of the alert. Valid values:</p>
     * <ul>
     * <li>OWNER: the node owner.</li>
     * <li>OTHER: a specified user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OWNER</p>
     */
    @NameInMap("AlertUnit")
    public String alertUnit;

    /**
     * <p>The baseline IDs when the monitored object is a baseline. A rule can monitor up to 5 baselines. Separate multiple baseline IDs with commas (,).
     * This parameter takes effect only when RemindUnit is set to BASELINE.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("BaselineIds")
    public String baselineIds;

    /**
     * <p>The business process IDs when the monitored object is a business process. A rule can monitor up to 5 business processes. Separate multiple business process IDs with commas (,).
     * This parameter takes effect only when RemindUnit is set to BIZPROCESS.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("BizProcessIds")
    public String bizProcessIds;

    /**
     * <p>The configuration details for different trigger conditions:</p>
     * <ul>
     * <li>When RemindType (trigger condition) is set to FINISHED, the configuration is left empty.</li>
     * <li>When RemindType (trigger condition) is set to UNFINISHED, the configuration format is {&quot;hour&quot;:23,&quot;minu&quot;:59}. Valid values of hour: [0,47\]. Valid values of minu: [0,59\].</li>
     * <li>When RemindType (trigger condition) is set to ERROR, the configuration is left empty.</li>
     * <li>When RemindType (trigger condition) is set to CYCLE_UNFINISHED (cycle unfinished), the configuration format is {&quot;1&quot;:&quot;05:50&quot;,&quot;2&quot;:&quot;06:50&quot;,&quot;3&quot;:&quot;07:50&quot;,&quot;4&quot;:&quot;08:50&quot;,&quot;5&quot;:&quot;09:50&quot;,&quot;6&quot;:&quot;10:50&quot;,&quot;7&quot;:&quot;11:50&quot;,&quot;8&quot;:&quot;12:50&quot;,&quot;9&quot;:&quot;13:50&quot;,&quot;10&quot;:&quot;14:50&quot;,&quot;11&quot;:&quot;15:50&quot;,&quot;12&quot;:&quot;16:50&quot;,&quot;13&quot;:&quot;17:50&quot;,&quot;14&quot;:&quot;18:50&quot;,&quot;15&quot;:&quot;19:50&quot;,&quot;16&quot;:&quot;20:50&quot;,&quot;17&quot;:&quot;21:50&quot;,&quot;18&quot;:&quot;22:50&quot;,&quot;19&quot;:&quot;23:50&quot;,&quot;20&quot;:&quot;24:50&quot;,&quot;21&quot;:&quot;25:50&quot;}.
     * The key in the JSON string is the cycle number. Valid values: [1,288\]. The value is the unfinished time for the corresponding cycle in the format hh:mm. Valid values of hh: [0,47\]. Valid values of mm: [0,59\].</li>
     * <li>When RemindType (trigger condition) is set to TIMEOUT, the configuration format is 1800, in seconds. This means an alert is triggered if the instance has been running for more than 30 minutes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;hour&quot;:23,&quot;minu&quot;:59}</p>
     */
    @NameInMap("Detail")
    public String detail;

    /**
     * <p>The end time of the do-not-disturb period. Alerts are not sent before this time. Format: hh:mm. Valid values of hh: [0,23\]. Valid values of mm: [0,59\].</p>
     * 
     * <strong>example:</strong>
     * <p>08:00</p>
     */
    @NameInMap("DndEnd")
    public String dndEnd;

    /**
     * <p>The maximum number of alerts. Valid values: [1,10\]. Default value: 3.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("MaxAlertTimes")
    public Integer maxAlertTimes;

    /**
     * <p>The node IDs when the monitored object is a node. A rule can monitor up to 50 nodes. Separate multiple node IDs with commas (,).
     * This parameter takes effect only when RemindUnit is set to NODE.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <p>The workspace ID when the monitored object is a workspace. A rule can monitor only one workspace.
     * This parameter takes effect only when RemindUnit is set to PROJECT.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the custom rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RemindId")
    public Long remindId;

    /**
     * <p>The name of the custom rule. The name cannot exceed 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>update_remindname</p>
     */
    @NameInMap("RemindName")
    public String remindName;

    /**
     * <p>The condition that triggers the alert rule. Valid values:</p>
     * <ul>
     * <li>FINISHED: The system monitors the instance from the start time and sends an alert when the node runs successfully.</li>
     * <li>UNFINISHED: The system monitors the instance from the start time and sends an alert if the node has not finished running by the specified target time.</li>
     * <li>ERROR: The system monitors the instance from the start time and sends an alert when the node encounters an error.</li>
     * <li>CYCLE_UNFINISHED: The system sends an alert if the instance has not finished running within the specified cycle. This is typically used to monitor instances that run on an hourly cycle.</li>
     * <li>TIMEOUT: The system monitors the instance from the start time and sends an alert if the node has not finished running after the specified duration. This is typically used to monitor the running duration of instances.</li>
     * </ul>
     * <p>For more information about alert trigger conditions, see <a href="https://help.aliyun.com/document_detail/138172.html">Custom rules</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("RemindType")
    public String remindType;

    /**
     * <p>The type of the monitored object. Valid values:</p>
     * <ul>
     * <li>NODE</li>
     * <li>BASELINE</li>
     * <li>PROJECT (workspace)</li>
     * <li>BIZPROCESS (business process)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NODE</p>
     */
    @NameInMap("RemindUnit")
    public String remindUnit;

    /**
     * <p>The webhook URLs of DingTalk group chatbots. Separate multiple webhook URLs with commas (,).
     * When the parameter settings are set to undefined, the system clears the DingTalk chatbot webhook URLs.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>******************************</p>
     */
    @NameInMap("RobotUrls")
    public String robotUrls;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseFlag")
    public Boolean useFlag;

    /**
     * <p>The webhook URLs of WeCom or Lark chatbots. Separate multiple webhook URLs with commas (,). The alertMethods parameter must include the WEBHOOKS alerting method. When the parameter is set to undefined, the system clears the webhook URLs.</p>
     * <p>Only DataWorks Enterprise Edition is supported.
     * Active regions: China (Shanghai), China (Chengdu), China (Zhangjiakou), China (Beijing), China (Hangzhou), China (Shenzhen), Hong Kong (China), Germany (Frankfurt), Asia-Pacific Southeast 1 (Singapore).</p>
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
