// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetRemindResponseBody extends TeaModel {
    /**
     * <p>The details of the custom alert rule.</p>
     */
    @NameInMap("Data")
    public GetRemindResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>1031203110005</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameters are invalid.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFGH-IJKLMNOPQ</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRemindResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRemindResponseBody self = new GetRemindResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRemindResponseBody setData(GetRemindResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRemindResponseBodyData getData() {
        return this.data;
    }

    public GetRemindResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRemindResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRemindResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRemindResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRemindResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRemindResponseBodyDataBaselines extends TeaModel {
        /**
         * <p>The baseline ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("BaselineId")
        public Long baselineId;

        /**
         * <p>The name of the baseline.</p>
         */
        @NameInMap("BaselineName")
        public String baselineName;

        public static GetRemindResponseBodyDataBaselines build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataBaselines self = new GetRemindResponseBodyDataBaselines();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataBaselines setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetRemindResponseBodyDataBaselines setBaselineName(String baselineName) {
            this.baselineName = baselineName;
            return this;
        }
        public String getBaselineName() {
            return this.baselineName;
        }

    }

    public static class GetRemindResponseBodyDataBizProcesses extends TeaModel {
        /**
         * <p>The ID of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>9527</p>
         */
        @NameInMap("BizId")
        public Long bizId;

        /**
         * <p>The name of the workflow.</p>
         */
        @NameInMap("BizProcessName")
        public String bizProcessName;

        public static GetRemindResponseBodyDataBizProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataBizProcesses self = new GetRemindResponseBodyDataBizProcesses();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataBizProcesses setBizId(Long bizId) {
            this.bizId = bizId;
            return this;
        }
        public Long getBizId() {
            return this.bizId;
        }

        public GetRemindResponseBodyDataBizProcesses setBizProcessName(String bizProcessName) {
            this.bizProcessName = bizProcessName;
            return this;
        }
        public String getBizProcessName() {
            return this.bizProcessName;
        }

    }

    public static class GetRemindResponseBodyDataNodes extends TeaModel {
        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the node owner.</p>
         * 
         * <strong>example:</strong>
         * <p>9527951795****</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The ID of the workspace to which the node belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetRemindResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataNodes self = new GetRemindResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetRemindResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetRemindResponseBodyDataNodes setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetRemindResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetRemindResponseBodyDataProjects extends TeaModel {
        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetRemindResponseBodyDataProjects build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataProjects self = new GetRemindResponseBodyDataProjects();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataProjects setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class GetRemindResponseBodyDataReceivers extends TeaModel {
        @NameInMap("AlertTargets")
        public java.util.List<String> alertTargets;

        /**
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("AlertUnit")
        public String alertUnit;

        public static GetRemindResponseBodyDataReceivers build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataReceivers self = new GetRemindResponseBodyDataReceivers();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataReceivers setAlertTargets(java.util.List<String> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public java.util.List<String> getAlertTargets() {
            return this.alertTargets;
        }

        public GetRemindResponseBodyDataReceivers setAlertUnit(String alertUnit) {
            this.alertUnit = alertUnit;
            return this;
        }
        public String getAlertUnit() {
            return this.alertUnit;
        }

    }

    public static class GetRemindResponseBodyDataRobots extends TeaModel {
        /**
         * <p>Indicates whether all group members are notified when the alert notification is sent to a DingTalk group. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AtAll")
        public Boolean atAll;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>******************************</p>
         */
        @NameInMap("WebUrl")
        public String webUrl;

        public static GetRemindResponseBodyDataRobots build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyDataRobots self = new GetRemindResponseBodyDataRobots();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyDataRobots setAtAll(Boolean atAll) {
            this.atAll = atAll;
            return this;
        }
        public Boolean getAtAll() {
            return this.atAll;
        }

        public GetRemindResponseBodyDataRobots setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class GetRemindResponseBodyData extends TeaModel {
        /**
         * <p>The minimum interval at which alerts are reported. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("AlertInterval")
        public Integer alertInterval;

        /**
         * <p>The alert notification method.</p>
         */
        @NameInMap("AlertMethods")
        public java.util.List<String> alertMethods;

        /**
         * <p>The description of the alert recipient.</p>
         */
        @NameInMap("AlertTargets")
        public java.util.List<String> alertTargets;

        /**
         * <p>The recipient of the alert. Valid values: OWNER and OTHER. The value OWNER indicates the node owner. The value OTHER indicates a specified user.</p>
         * 
         * <strong>example:</strong>
         * <p>OWNER</p>
         */
        @NameInMap("AlertUnit")
        public String alertUnit;

        @NameInMap("AllowNodes")
        public java.util.List<Long> allowNodes;

        /**
         * <p>The baselines to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BASELINE.</p>
         */
        @NameInMap("Baselines")
        public java.util.List<GetRemindResponseBodyDataBaselines> baselines;

        /**
         * <p>The workflows to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BIZPROCESS.</p>
         */
        @NameInMap("BizProcesses")
        public java.util.List<GetRemindResponseBodyDataBizProcesses> bizProcesses;

        /**
         * <ul>
         * <li>If the value of the RemindType parameter is FINISHED, this parameter is left empty.</li>
         * <li>If the value of the RemindType parameter is UNFINISHED, the trigger conditions are returned as key-value pairs. Example: {&quot;hour&quot;:23,&quot;minu&quot;:59}. Valid values of hour: [0,47]. Valid values of minu: [0,59].</li>
         * <li>If the value of the RemindType parameter is ERROR, this parameter is left empty.</li>
         * <li>If the value of the RemindType parameter is CYCLE_UNFINISHED, the trigger conditions are returned as key-value pairs. Example: {&quot;1&quot;:&quot;05:50&quot;,&quot;2&quot;:&quot;06:50&quot;,&quot;3&quot;:&quot;07:50&quot;,&quot;4&quot;:&quot;08:50&quot;,&quot;5&quot;:&quot;09:50&quot;,&quot;6&quot;:&quot;10:50&quot;,&quot;7&quot;:&quot;11:50&quot;,&quot;8&quot;:&quot;12:50&quot;,&quot;9&quot;:&quot;13:50&quot;,&quot;10&quot;:&quot;14:50&quot;,&quot;11&quot;:&quot;15:50&quot;,&quot;12&quot;:&quot;16:50&quot;,&quot;13&quot;:&quot;17:50&quot;,&quot;14&quot;:&quot;18:50&quot;,&quot;15&quot;:&quot;19:50&quot;,&quot;16&quot;:&quot;20:50&quot;,&quot;17&quot;:&quot;21:50&quot;,&quot;18&quot;:&quot;22:50&quot;,&quot;19&quot;:&quot;23:50&quot;,&quot;20&quot;:&quot;24:50&quot;,&quot;21&quot;:&quot;25:50&quot;}. The key indicates the ID of the cycle. Valid values: [1,288]. The value indicates the timeout period of the node that is running in the cycle. Specify the value in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</li>
         * <li>If the value of the RemindType parameter is TIMEOUT, the timeout period is returned. Unit: seconds. Example: 1800. This value indicates that an alert is reported if the node has run for more than 30 minutes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;hour&quot;:23,&quot;minu&quot;:59}</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The end time of the quiet hours. The value is in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("DndEnd")
        public String dndEnd;

        /**
         * <p>The start time of the quiet hours. The value is in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("DndStart")
        public String dndStart;

        /**
         * <p>The ID of the Alibaba Cloud account used by the creator of the custom alert rule.</p>
         * 
         * <strong>example:</strong>
         * <p>9527951795****</p>
         */
        @NameInMap("Founder")
        public String founder;

        /**
         * <p>The maximum number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MaxAlertTimes")
        public Integer maxAlertTimes;

        /**
         * <p>The nodes to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is NODE.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<GetRemindResponseBodyDataNodes> nodes;

        /**
         * <p>The workspaces to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is PROJECT.</p>
         */
        @NameInMap("Projects")
        public java.util.List<GetRemindResponseBodyDataProjects> projects;

        @NameInMap("Receivers")
        public java.util.List<GetRemindResponseBodyDataReceivers> receivers;

        /**
         * <p>The custom alert rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("RemindId")
        public Long remindId;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RemindName")
        public String remindName;

        /**
         * <p>The conditions that trigger an alert. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("RemindType")
        public String remindType;

        /**
         * <p>The type of the object to which the custom alert rule is applied. Valid values: NODE, BASELINE, PROJECT, and BIZPROCESS. The value NODE indicates a node. The value BASELINE indicates a baseline. The value PROJECT indicates a workspace. The value BIZPROCESS indicates a workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>NODE</p>
         */
        @NameInMap("RemindUnit")
        public String remindUnit;

        /**
         * <p>The webhook URLs of the DingTalk chatbots.</p>
         */
        @NameInMap("Robots")
        public java.util.List<GetRemindResponseBodyDataRobots> robots;

        /**
         * <p>Indicates whether the custom alert rule is enabled. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Useflag")
        public Boolean useflag;

        /**
         * <p>The information about the webhook URL.</p>
         */
        @NameInMap("Webhooks")
        public java.util.List<String> webhooks;

        public static GetRemindResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRemindResponseBodyData self = new GetRemindResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRemindResponseBodyData setAlertInterval(Integer alertInterval) {
            this.alertInterval = alertInterval;
            return this;
        }
        public Integer getAlertInterval() {
            return this.alertInterval;
        }

        public GetRemindResponseBodyData setAlertMethods(java.util.List<String> alertMethods) {
            this.alertMethods = alertMethods;
            return this;
        }
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

        public GetRemindResponseBodyData setAlertTargets(java.util.List<String> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }
        public java.util.List<String> getAlertTargets() {
            return this.alertTargets;
        }

        public GetRemindResponseBodyData setAlertUnit(String alertUnit) {
            this.alertUnit = alertUnit;
            return this;
        }
        public String getAlertUnit() {
            return this.alertUnit;
        }

        public GetRemindResponseBodyData setAllowNodes(java.util.List<Long> allowNodes) {
            this.allowNodes = allowNodes;
            return this;
        }
        public java.util.List<Long> getAllowNodes() {
            return this.allowNodes;
        }

        public GetRemindResponseBodyData setBaselines(java.util.List<GetRemindResponseBodyDataBaselines> baselines) {
            this.baselines = baselines;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataBaselines> getBaselines() {
            return this.baselines;
        }

        public GetRemindResponseBodyData setBizProcesses(java.util.List<GetRemindResponseBodyDataBizProcesses> bizProcesses) {
            this.bizProcesses = bizProcesses;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataBizProcesses> getBizProcesses() {
            return this.bizProcesses;
        }

        public GetRemindResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetRemindResponseBodyData setDndEnd(String dndEnd) {
            this.dndEnd = dndEnd;
            return this;
        }
        public String getDndEnd() {
            return this.dndEnd;
        }

        public GetRemindResponseBodyData setDndStart(String dndStart) {
            this.dndStart = dndStart;
            return this;
        }
        public String getDndStart() {
            return this.dndStart;
        }

        public GetRemindResponseBodyData setFounder(String founder) {
            this.founder = founder;
            return this;
        }
        public String getFounder() {
            return this.founder;
        }

        public GetRemindResponseBodyData setMaxAlertTimes(Integer maxAlertTimes) {
            this.maxAlertTimes = maxAlertTimes;
            return this;
        }
        public Integer getMaxAlertTimes() {
            return this.maxAlertTimes;
        }

        public GetRemindResponseBodyData setNodes(java.util.List<GetRemindResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

        public GetRemindResponseBodyData setProjects(java.util.List<GetRemindResponseBodyDataProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataProjects> getProjects() {
            return this.projects;
        }

        public GetRemindResponseBodyData setReceivers(java.util.List<GetRemindResponseBodyDataReceivers> receivers) {
            this.receivers = receivers;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataReceivers> getReceivers() {
            return this.receivers;
        }

        public GetRemindResponseBodyData setRemindId(Long remindId) {
            this.remindId = remindId;
            return this;
        }
        public Long getRemindId() {
            return this.remindId;
        }

        public GetRemindResponseBodyData setRemindName(String remindName) {
            this.remindName = remindName;
            return this;
        }
        public String getRemindName() {
            return this.remindName;
        }

        public GetRemindResponseBodyData setRemindType(String remindType) {
            this.remindType = remindType;
            return this;
        }
        public String getRemindType() {
            return this.remindType;
        }

        public GetRemindResponseBodyData setRemindUnit(String remindUnit) {
            this.remindUnit = remindUnit;
            return this;
        }
        public String getRemindUnit() {
            return this.remindUnit;
        }

        public GetRemindResponseBodyData setRobots(java.util.List<GetRemindResponseBodyDataRobots> robots) {
            this.robots = robots;
            return this;
        }
        public java.util.List<GetRemindResponseBodyDataRobots> getRobots() {
            return this.robots;
        }

        public GetRemindResponseBodyData setUseflag(Boolean useflag) {
            this.useflag = useflag;
            return this;
        }
        public Boolean getUseflag() {
            return this.useflag;
        }

        public GetRemindResponseBodyData setWebhooks(java.util.List<String> webhooks) {
            this.webhooks = webhooks;
            return this;
        }
        public java.util.List<String> getWebhooks() {
            return this.webhooks;
        }

    }

}
