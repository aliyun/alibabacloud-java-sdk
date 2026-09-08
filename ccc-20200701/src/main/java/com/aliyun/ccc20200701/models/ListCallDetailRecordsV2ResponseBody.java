// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsV2ResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public ListCallDetailRecordsV2ResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01B12EE4-6AF2-4730-8B78-EC15F4E5C025</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCallDetailRecordsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsV2ResponseBody self = new ListCallDetailRecordsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallDetailRecordsV2ResponseBody setData(ListCallDetailRecordsV2ResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCallDetailRecordsV2ResponseBodyData getData() {
        return this.data;
    }

    public ListCallDetailRecordsV2ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallDetailRecordsV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallDetailRecordsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion extends TeaModel {
        /**
         * <p>The confidence level.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Confidence")
        public Integer confidence;

        /**
         * <p>The detailed remark of the emotion analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>No emotional change from the customer</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ff07fe35670423089dbdf12766d962f</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The emotion type.</p>
         * 
         * <strong>example:</strong>
         * <p>Neutral</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion self = new ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving extends TeaModel {
        /**
         * <p>The problem description.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert issue</p>
         */
        @NameInMap("Problem")
        public String problem;

        /**
         * <p>The Solutions.</p>
         * 
         * <strong>example:</strong>
         * <p>The enrichment service automatically closes the original alert</p>
         */
        @NameInMap("Solution")
        public String solution;

        /**
         * <p>Indicates whether the problem is resolved.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Solved")
        public Boolean solved;

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8bf18b7a10064b29a75946a8d5b8469a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving self = new ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving setProblem(String problem) {
            this.problem = problem;
            return this;
        }
        public String getProblem() {
            return this.problem;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving setSolved(Boolean solved) {
            this.solved = solved;
            return this;
        }
        public Boolean getSolved() {
            return this.solved;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction extends TeaModel {
        /**
         * <p>The detailed remark of the satisfaction analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>The customer expressed satisfaction</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The satisfaction description.</p>
         * 
         * <strong>example:</strong>
         * <p>Satisfied</p>
         */
        @NameInMap("SatisfactionDescription")
        public String satisfactionDescription;

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cb67479ce28243b28ff39948feaa0806</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction self = new ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction setSatisfactionDescription(String satisfactionDescription) {
            this.satisfactionDescription = satisfactionDescription;
            return this;
        }
        public String getSatisfactionDescription() {
            return this.satisfactionDescription;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList extends TeaModel {
        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cb67479ce28243b28ff39948feaa0806</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The to-do items.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        public static ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList self = new ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

    public static class ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport extends TeaModel {
        /**
         * <p>The emotion analysis.</p>
         */
        @NameInMap("Emotion")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion emotion;

        /**
         * <p>The problem resolution status.</p>
         */
        @NameInMap("ProblemSolving")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving problemSolving;

        /**
         * <p>The satisfaction analysis.</p>
         */
        @NameInMap("Satisfaction")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction satisfaction;

        /**
         * <p>The to-do list.</p>
         */
        @NameInMap("TodoList")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList todoList;

        public static ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport self = new ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport setEmotion(ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion emotion) {
            this.emotion = emotion;
            return this;
        }
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion getEmotion() {
            return this.emotion;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport setProblemSolving(ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving problemSolving) {
            this.problemSolving = problemSolving;
            return this;
        }
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving getProblemSolving() {
            return this.problemSolving;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport setSatisfaction(ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction getSatisfaction() {
            return this.satisfaction;
        }

        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport setTodoList(ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList todoList) {
            this.todoList = todoList;
            return this;
        }
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportTodoList getTodoList() {
            return this.todoList;
        }

    }

    public static class ListCallDetailRecordsV2ResponseBodyDataListSummaryIndex extends TeaModel {
        /**
         * <p>The keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>CustomerService</p>
         */
        @NameInMap("Keywords")
        public String keywords;

        public static ListCallDetailRecordsV2ResponseBodyDataListSummaryIndex build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyDataListSummaryIndex self = new ListCallDetailRecordsV2ResponseBodyDataListSummaryIndex();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsV2ResponseBodyDataListSummaryIndex setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

    }

    public static class ListCallDetailRecordsV2ResponseBodyDataList extends TeaModel {
        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8f6bcbad-6e2d-4ca3-9b65-91cf0aafdf00</p>
         */
        @NameInMap("AccessChannelId")
        public String accessChannelId;

        /**
         * <p>The channel name. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>TestChannel</p>
         */
        @NameInMap("AccessChannelName")
        public String accessChannelName;

        /**
         * <p>The channel type. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        /**
         * <p>The visitor ID. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>test-user-id</p>
         */
        @NameInMap("AccessChannelUserId")
        public String accessChannelUserId;

        /**
         * <p>The visitor name. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>TestVisitor</p>
         */
        @NameInMap("AccessChannelUserName")
        public String accessChannelUserName;

        /**
         * <p>The additional intermediate number, which may be used in dual-call scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>0533128****</p>
         */
        @NameInMap("AdditionalBroker")
        public String additionalBroker;

        /**
         * <p>The list of agent IDs. Multiple values are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentIds")
        public String agentIds;

        /**
         * <p>The list of agent names involved in the call. Multiple agents are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudCallCenterTestAgent</p>
         */
        @NameInMap("AgentNames")
        public String agentNames;

        /**
         * <p>The post-call analytics report.</p>
         */
        @NameInMap("AnalyticsReport")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport analyticsReport;

        /**
         * <p>Indicates whether the AI post-call analytics report is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AnalyticsReportReady")
        public Boolean analyticsReportReady;

        /**
         * <p>The intermediate number.</p>
         * 
         * <strong>example:</strong>
         * <p>053xxxx3127</p>
         */
        @NameInMap("Broker")
        public String broker;

        /**
         * <p>The call duration. For inbound calls, timing starts when the call enters the IVR. For outbound calls, timing starts when the call is connected. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("CallDuration")
        public String callDuration;

        /**
         * <p>The list of SIP CallIds.</p>
         * 
         * <strong>example:</strong>
         * <p>dxxx1sdf,xkkwwwa</p>
         */
        @NameInMap("CallIds")
        public String callIds;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>1332315****</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The location of the callee.</p>
         * 
         * <strong>example:</strong>
         * <p>Shandong-Jinan</p>
         */
        @NameInMap("CalleeLocation")
        public String calleeLocation;

        /**
         * <p>The location of the caller.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing-Beijing</p>
         */
        @NameInMap("CallerLocation")
        public String callerLocation;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>0533128****</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>The visitor client application name. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>Unknown</p>
         */
        @NameInMap("ClientAppName")
        public String clientAppName;

        /**
         * <p>The visitor client IP address. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>10.100.2.1</p>
         */
        @NameInMap("ClientIpAddress")
        public String clientIpAddress;

        /**
         * <p>The visitor client location. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ClientLocation")
        public String clientLocation;

        /**
         * <p>The visitor client user agent information. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36</p>
         */
        @NameInMap("ClientUserAgent")
        public String clientUserAgent;

        /**
         * <p>The call end reason. For the enumeration list, refer to the ContactDispositionList query parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ContactDisposition")
        public String contactDisposition;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-2255019651513856</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The call type. For the enumeration list, refer to the ContactTypeList query parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("ContactType")
        public String contactType;

        /**
         * <p>The dialing duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DialingTime")
        public Long dialingTime;

        /**
         * <p>The early media state.</p>
         * 
         * <strong>example:</strong>
         * <p>NotConnected</p>
         */
        @NameInMap("EarlyMediaState")
        public String earlyMediaState;

        /**
         * <p>The early media text.</p>
         * 
         * <strong>example:</strong>
         * <p>Currently on a call</p>
         */
        @NameInMap("EarlyMediaText")
        public String earlyMediaText;

        /**
         * <p>The time when the call was established. If the call was not established, this value is empty. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1532448000000</p>
         */
        @NameInMap("EstablishedTime")
        public Long establishedTime;

        /**
         * <p>The time taken for the agent to first respond to the customer message. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FirstResponseTime")
        public Long firstResponseTime;

        /**
         * <p>The hold time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("HeldTime")
        public Long heldTime;

        /**
         * <p>The call center instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IVR duration, which is the time from when the call enters the IVR to when it starts entering the manual service queue (or the customer abandons the call). Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("IvrTime")
        public Long ivrTime;

        /**
         * <p>The media type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AUDIO: Voice.</li>
         * <li>CHAT: Message.</li>
         * <li>VIDEO: Video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CHAT</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <p>The total number of messages. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MessagesSent")
        public Long messagesSent;

        /**
         * <p>The total number of messages sent by the agent. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MessagesSentByAgent")
        public Long messagesSentByAgent;

        /**
         * <p>The total number of messages sent by the customer. This parameter has a value only when MediaType is CHAT.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MessagesSentByCustomer")
        public Long messagesSentByCustomer;

        /**
         * <p>The list of off-site agent IDs involved in the call. Multiple agents are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>skg-default@ccc-test</p>
         */
        @NameInMap("OffSiteAgentIds")
        public String offSiteAgentIds;

        /**
         * <p>The off-site agent number that is called when the assigned agent is an off-site agent.</p>
         * 
         * <strong>example:</strong>
         * <p>80312348</p>
         */
        @NameInMap("OffsiteAgentDestinationNumbers")
        public String offsiteAgentDestinationNumbers;

        /**
         * <p>The number that initiates the call to the off-site agent when the assigned agent is an off-site agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0101257****</p>
         */
        @NameInMap("OffsiteAgentOriginatorNumbers")
        public String offsiteAgentOriginatorNumbers;

        /**
         * <p>The hangup reason of the last assigned offsite agent.</p>
         * 
         * <strong>example:</strong>
         * <p>IVRException</p>
         */
        @NameInMap("OffsiteAgentReleaseReason")
        public String offsiteAgentReleaseReason;

        /**
         * <p>The called number when the call is transferred to an outside line.</p>
         * 
         * <strong>example:</strong>
         * <p>134xxxxxx</p>
         */
        @NameInMap("OutsideNumberDestinationNumber")
        public String outsideNumberDestinationNumber;

        /**
         * <p>The hangup reason when the call is transferred to an outside line.</p>
         * 
         * <strong>example:</strong>
         * <p>NoAnswer</p>
         */
        @NameInMap("OutsideNumberReleaseReason")
        public String outsideNumberReleaseReason;

        /**
         * <p>The queue duration, which is the time from when the call enters the manual service queue to when the agent starts ringing (or the customer abandons the call, the queue times out, or the queue overflows). Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueueTime")
        public Long queueTime;

        /**
         * <p>The recording duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Long recordingDuration;

        /**
         * <p>Indicates whether the recording has been generated. If the call was not established, false is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RecordingReady")
        public Boolean recordingReady;

        /**
         * <p>The party that hung up.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>agent: The agent.</li>
         * <li>customer: The customer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <p>The hangup reason of the call channel, indicating why the current call channel was hung up. The value is a response code defined in the SIP protocol. Refer to the SIP protocol to analyze the hangup reason.</p>
         * 
         * <strong>example:</strong>
         * <p>486:USER_BUSY</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <p>The time when the call ended, in Unix timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1532707199000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The ringing duration, which is the time from when the agent starts ringing to when the agent answers (or the customer abandons the call). Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RingTime")
        public Long ringTime;

        /**
         * <p>The satisfaction description, which corresponds to the configuration of the satisfaction module in the satisfaction IVR and is defined by the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>Satisfied</p>
         */
        @NameInMap("SatisfactionDescription")
        public String satisfactionDescription;

        /**
         * <p>The satisfaction rating, which is the value of the satisfaction key digit (a single digit).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SatisfactionIndex")
        public Integer satisfactionIndex;

        /**
         * <p>The satisfaction survey channel.</p>
         * 
         * <strong>example:</strong>
         * <p>IVR</p>
         */
        @NameInMap("SatisfactionSurveyChannel")
        public String satisfactionSurveyChannel;

        /**
         * <p>Indicates whether a satisfaction survey was sent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SatisfactionSurveyOffered")
        public Boolean satisfactionSurveyOffered;

        /**
         * <p>The skill group IDs of the agents who participated in the call. Multiple skill groups are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>skg-default@ccc-test</p>
         */
        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        /**
         * <p>The skill group names of the agents who participated in the call. Multiple skill groups are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>TestSkillGroup1,TestSkillGroup2</p>
         */
        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        /**
         * <p>The time when the call started. For inbound calls, this is counted from when the call enters the IVR. For outbound calls, this is counted from when dialing begins. The value is in Unix timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The summary index.</p>
         */
        @NameInMap("SummaryIndex")
        public ListCallDetailRecordsV2ResponseBodyDataListSummaryIndex summaryIndex;

        /**
         * <p>The talk time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TalkTime")
        public Long talkTime;

        /**
         * <p>The number of transfers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TransferCount")
        public Long transferCount;

        /**
         * <p>The outbound called number carried when the call is transferred from an intelligent outbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>134xxxxxx</p>
         */
        @NameInMap("VoicebotDestinationNumber")
        public String voicebotDestinationNumber;

        /**
         * <p>The outbound caller number carried when the call is transferred from an intelligent outbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>021xxxxxxx</p>
         */
        @NameInMap("VoicebotOriginatorNumber")
        public String voicebotOriginatorNumber;

        /**
         * <p>The customer wait time, which equals QueueTime + RingTime. If the customer abandons the call during the waiting period, the value is 0. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("WaitTime")
        public Long waitTime;

        public static ListCallDetailRecordsV2ResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyDataList self = new ListCallDetailRecordsV2ResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAccessChannelId(String accessChannelId) {
            this.accessChannelId = accessChannelId;
            return this;
        }
        public String getAccessChannelId() {
            return this.accessChannelId;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAccessChannelName(String accessChannelName) {
            this.accessChannelName = accessChannelName;
            return this;
        }
        public String getAccessChannelName() {
            return this.accessChannelName;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAccessChannelType(String accessChannelType) {
            this.accessChannelType = accessChannelType;
            return this;
        }
        public String getAccessChannelType() {
            return this.accessChannelType;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAccessChannelUserId(String accessChannelUserId) {
            this.accessChannelUserId = accessChannelUserId;
            return this;
        }
        public String getAccessChannelUserId() {
            return this.accessChannelUserId;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAccessChannelUserName(String accessChannelUserName) {
            this.accessChannelUserName = accessChannelUserName;
            return this;
        }
        public String getAccessChannelUserName() {
            return this.accessChannelUserName;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAdditionalBroker(String additionalBroker) {
            this.additionalBroker = additionalBroker;
            return this;
        }
        public String getAdditionalBroker() {
            return this.additionalBroker;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAgentIds(String agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public String getAgentIds() {
            return this.agentIds;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAgentNames(String agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public String getAgentNames() {
            return this.agentNames;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAnalyticsReport(ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport analyticsReport) {
            this.analyticsReport = analyticsReport;
            return this;
        }
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport getAnalyticsReport() {
            return this.analyticsReport;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setAnalyticsReportReady(Boolean analyticsReportReady) {
            this.analyticsReportReady = analyticsReportReady;
            return this;
        }
        public Boolean getAnalyticsReportReady() {
            return this.analyticsReportReady;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setBroker(String broker) {
            this.broker = broker;
            return this;
        }
        public String getBroker() {
            return this.broker;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setCallDuration(String callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public String getCallDuration() {
            return this.callDuration;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setCallIds(String callIds) {
            this.callIds = callIds;
            return this;
        }
        public String getCallIds() {
            return this.callIds;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setCalleeLocation(String calleeLocation) {
            this.calleeLocation = calleeLocation;
            return this;
        }
        public String getCalleeLocation() {
            return this.calleeLocation;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setCallerLocation(String callerLocation) {
            this.callerLocation = callerLocation;
            return this;
        }
        public String getCallerLocation() {
            return this.callerLocation;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setClientAppName(String clientAppName) {
            this.clientAppName = clientAppName;
            return this;
        }
        public String getClientAppName() {
            return this.clientAppName;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setClientIpAddress(String clientIpAddress) {
            this.clientIpAddress = clientIpAddress;
            return this;
        }
        public String getClientIpAddress() {
            return this.clientIpAddress;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setClientLocation(String clientLocation) {
            this.clientLocation = clientLocation;
            return this;
        }
        public String getClientLocation() {
            return this.clientLocation;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setClientUserAgent(String clientUserAgent) {
            this.clientUserAgent = clientUserAgent;
            return this;
        }
        public String getClientUserAgent() {
            return this.clientUserAgent;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setDialingTime(Long dialingTime) {
            this.dialingTime = dialingTime;
            return this;
        }
        public Long getDialingTime() {
            return this.dialingTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setEarlyMediaState(String earlyMediaState) {
            this.earlyMediaState = earlyMediaState;
            return this;
        }
        public String getEarlyMediaState() {
            return this.earlyMediaState;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setEarlyMediaText(String earlyMediaText) {
            this.earlyMediaText = earlyMediaText;
            return this;
        }
        public String getEarlyMediaText() {
            return this.earlyMediaText;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setEstablishedTime(Long establishedTime) {
            this.establishedTime = establishedTime;
            return this;
        }
        public Long getEstablishedTime() {
            return this.establishedTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setFirstResponseTime(Long firstResponseTime) {
            this.firstResponseTime = firstResponseTime;
            return this;
        }
        public Long getFirstResponseTime() {
            return this.firstResponseTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setHeldTime(Long heldTime) {
            this.heldTime = heldTime;
            return this;
        }
        public Long getHeldTime() {
            return this.heldTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setIvrTime(Long ivrTime) {
            this.ivrTime = ivrTime;
            return this;
        }
        public Long getIvrTime() {
            return this.ivrTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setMessagesSent(Long messagesSent) {
            this.messagesSent = messagesSent;
            return this;
        }
        public Long getMessagesSent() {
            return this.messagesSent;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setMessagesSentByAgent(Long messagesSentByAgent) {
            this.messagesSentByAgent = messagesSentByAgent;
            return this;
        }
        public Long getMessagesSentByAgent() {
            return this.messagesSentByAgent;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setMessagesSentByCustomer(Long messagesSentByCustomer) {
            this.messagesSentByCustomer = messagesSentByCustomer;
            return this;
        }
        public Long getMessagesSentByCustomer() {
            return this.messagesSentByCustomer;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setOffSiteAgentIds(String offSiteAgentIds) {
            this.offSiteAgentIds = offSiteAgentIds;
            return this;
        }
        public String getOffSiteAgentIds() {
            return this.offSiteAgentIds;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setOffsiteAgentDestinationNumbers(String offsiteAgentDestinationNumbers) {
            this.offsiteAgentDestinationNumbers = offsiteAgentDestinationNumbers;
            return this;
        }
        public String getOffsiteAgentDestinationNumbers() {
            return this.offsiteAgentDestinationNumbers;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setOffsiteAgentOriginatorNumbers(String offsiteAgentOriginatorNumbers) {
            this.offsiteAgentOriginatorNumbers = offsiteAgentOriginatorNumbers;
            return this;
        }
        public String getOffsiteAgentOriginatorNumbers() {
            return this.offsiteAgentOriginatorNumbers;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setOffsiteAgentReleaseReason(String offsiteAgentReleaseReason) {
            this.offsiteAgentReleaseReason = offsiteAgentReleaseReason;
            return this;
        }
        public String getOffsiteAgentReleaseReason() {
            return this.offsiteAgentReleaseReason;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setOutsideNumberDestinationNumber(String outsideNumberDestinationNumber) {
            this.outsideNumberDestinationNumber = outsideNumberDestinationNumber;
            return this;
        }
        public String getOutsideNumberDestinationNumber() {
            return this.outsideNumberDestinationNumber;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setOutsideNumberReleaseReason(String outsideNumberReleaseReason) {
            this.outsideNumberReleaseReason = outsideNumberReleaseReason;
            return this;
        }
        public String getOutsideNumberReleaseReason() {
            return this.outsideNumberReleaseReason;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setQueueTime(Long queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Long getQueueTime() {
            return this.queueTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setRecordingDuration(Long recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Long getRecordingDuration() {
            return this.recordingDuration;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setRecordingReady(Boolean recordingReady) {
            this.recordingReady = recordingReady;
            return this;
        }
        public Boolean getRecordingReady() {
            return this.recordingReady;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setRingTime(Long ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Long getRingTime() {
            return this.ringTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setSatisfactionDescription(String satisfactionDescription) {
            this.satisfactionDescription = satisfactionDescription;
            return this;
        }
        public String getSatisfactionDescription() {
            return this.satisfactionDescription;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setSatisfactionIndex(Integer satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Integer getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
            this.satisfactionSurveyChannel = satisfactionSurveyChannel;
            return this;
        }
        public String getSatisfactionSurveyChannel() {
            return this.satisfactionSurveyChannel;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
            this.satisfactionSurveyOffered = satisfactionSurveyOffered;
            return this;
        }
        public Boolean getSatisfactionSurveyOffered() {
            return this.satisfactionSurveyOffered;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setSummaryIndex(ListCallDetailRecordsV2ResponseBodyDataListSummaryIndex summaryIndex) {
            this.summaryIndex = summaryIndex;
            return this;
        }
        public ListCallDetailRecordsV2ResponseBodyDataListSummaryIndex getSummaryIndex() {
            return this.summaryIndex;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setTalkTime(Long talkTime) {
            this.talkTime = talkTime;
            return this;
        }
        public Long getTalkTime() {
            return this.talkTime;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setTransferCount(Long transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Long getTransferCount() {
            return this.transferCount;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setVoicebotDestinationNumber(String voicebotDestinationNumber) {
            this.voicebotDestinationNumber = voicebotDestinationNumber;
            return this;
        }
        public String getVoicebotDestinationNumber() {
            return this.voicebotDestinationNumber;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setVoicebotOriginatorNumber(String voicebotOriginatorNumber) {
            this.voicebotOriginatorNumber = voicebotOriginatorNumber;
            return this;
        }
        public String getVoicebotOriginatorNumber() {
            return this.voicebotOriginatorNumber;
        }

        public ListCallDetailRecordsV2ResponseBodyDataList setWaitTime(Long waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Long getWaitTime() {
            return this.waitTime;
        }

    }

    public static class ListCallDetailRecordsV2ResponseBodyData extends TeaModel {
        /**
         * <p>The list of call records.</p>
         */
        @NameInMap("List")
        public java.util.List<ListCallDetailRecordsV2ResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCallDetailRecordsV2ResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyData self = new ListCallDetailRecordsV2ResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsV2ResponseBodyData setList(java.util.List<ListCallDetailRecordsV2ResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCallDetailRecordsV2ResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCallDetailRecordsV2ResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCallDetailRecordsV2ResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCallDetailRecordsV2ResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
