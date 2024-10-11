// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCallDetailRecordsV2ResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
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
        @NameInMap("Confidence")
        public Integer confidence;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskId")
        public String taskId;

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
        @NameInMap("Problem")
        public String problem;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("Solved")
        public Boolean solved;

        @NameInMap("Success")
        public Boolean success;

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
        @NameInMap("Remark")
        public String remark;

        @NameInMap("SatisfactionDescription")
        public String satisfactionDescription;

        @NameInMap("Success")
        public Boolean success;

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
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskId")
        public String taskId;

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
        @NameInMap("Emotion")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportEmotion emotion;

        @NameInMap("ProblemSolving")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportProblemSolving problemSolving;

        @NameInMap("Satisfaction")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReportSatisfaction satisfaction;

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

    public static class ListCallDetailRecordsV2ResponseBodyDataList extends TeaModel {
        @NameInMap("AccessChannelName")
        public String accessChannelName;

        /**
         * <strong>example:</strong>
         * <p>Web</p>
         */
        @NameInMap("AccessChannelType")
        public String accessChannelType;

        /**
         * <strong>example:</strong>
         * <p>test-user-id</p>
         */
        @NameInMap("AccessChannelUserId")
        public String accessChannelUserId;

        @NameInMap("AccessChannelUserName")
        public String accessChannelUserName;

        /**
         * <strong>example:</strong>
         * <p>0533128****</p>
         */
        @NameInMap("AdditionalBroker")
        public String additionalBroker;

        /**
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentIds")
        public String agentIds;

        @NameInMap("AgentNames")
        public String agentNames;

        @NameInMap("AnalyticsReport")
        public ListCallDetailRecordsV2ResponseBodyDataListAnalyticsReport analyticsReport;

        @NameInMap("AnalyticsReportReady")
        public Boolean analyticsReportReady;

        /**
         * <strong>example:</strong>
         * <p>053xxxx3127</p>
         */
        @NameInMap("Broker")
        public String broker;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("CallDuration")
        public String callDuration;

        @NameInMap("CallIds")
        public String callIds;

        /**
         * <strong>example:</strong>
         * <p>1332315****</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CalleeLocation")
        public String calleeLocation;

        @NameInMap("CallerLocation")
        public String callerLocation;

        /**
         * <strong>example:</strong>
         * <p>0533128****</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("ClientAppName")
        public String clientAppName;

        /**
         * <strong>example:</strong>
         * <p>10.100.2.1</p>
         */
        @NameInMap("ClientIpAddress")
        public String clientIpAddress;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ClientLocation")
        public String clientLocation;

        /**
         * <strong>example:</strong>
         * <p>Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36</p>
         */
        @NameInMap("ClientUserAgent")
        public String clientUserAgent;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ContactDisposition")
        public String contactDisposition;

        /**
         * <strong>example:</strong>
         * <p>job-2255019651513856</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("ContactType")
        public String contactType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DialingTime")
        public Long dialingTime;

        /**
         * <strong>example:</strong>
         * <p>NotConnected</p>
         */
        @NameInMap("EarlyMediaState")
        public String earlyMediaState;

        @NameInMap("EarlyMediaText")
        public String earlyMediaText;

        /**
         * <strong>example:</strong>
         * <p>1532448000000</p>
         */
        @NameInMap("EstablishedTime")
        public Long establishedTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FirstResponseTime")
        public Long firstResponseTime;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("HeldTime")
        public Long heldTime;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("IvrTime")
        public Long ivrTime;

        /**
         * <strong>example:</strong>
         * <p>CHAT</p>
         */
        @NameInMap("MediaType")
        public String mediaType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MessagesSent")
        public Long messagesSent;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MessagesSentByAgent")
        public Long messagesSentByAgent;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MessagesSentByCustomer")
        public Long messagesSentByCustomer;

        /**
         * <strong>example:</strong>
         * <p>skg-default@ccc-test</p>
         */
        @NameInMap("OffSiteAgentIds")
        public String offSiteAgentIds;

        /**
         * <strong>example:</strong>
         * <p>80312348</p>
         */
        @NameInMap("OffsiteAgentDestinationNumbers")
        public String offsiteAgentDestinationNumbers;

        /**
         * <strong>example:</strong>
         * <p>0101257****</p>
         */
        @NameInMap("OffsiteAgentOriginatorNumbers")
        public String offsiteAgentOriginatorNumbers;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueueTime")
        public Long queueTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Long recordingDuration;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RecordingReady")
        public Boolean recordingReady;

        /**
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <strong>example:</strong>
         * <p>486:USER_BUSY</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <strong>example:</strong>
         * <p>1532707199000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RingTime")
        public Long ringTime;

        @NameInMap("SatisfactionDescription")
        public String satisfactionDescription;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SatisfactionIndex")
        public Integer satisfactionIndex;

        /**
         * <strong>example:</strong>
         * <p>IVR</p>
         */
        @NameInMap("SatisfactionSurveyChannel")
        public String satisfactionSurveyChannel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SatisfactionSurveyOffered")
        public Boolean satisfactionSurveyOffered;

        /**
         * <strong>example:</strong>
         * <p>skg-default@ccc-test</p>
         */
        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        /**
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TalkTime")
        public Long talkTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TransferCount")
        public Long transferCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("WaitTime")
        public Long waitTime;

        public static ListCallDetailRecordsV2ResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsV2ResponseBodyDataList self = new ListCallDetailRecordsV2ResponseBodyDataList();
            return TeaModel.build(map, self);
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

        public ListCallDetailRecordsV2ResponseBodyDataList setWaitTime(Long waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Long getWaitTime() {
            return this.waitTime;
        }

    }

    public static class ListCallDetailRecordsV2ResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCallDetailRecordsV2ResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
