// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCallDetailRecordResponseBody extends TeaModel {
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
    public GetCallDetailRecordResponseBodyData data;

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
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCallDetailRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCallDetailRecordResponseBody self = new GetCallDetailRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCallDetailRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCallDetailRecordResponseBody setData(GetCallDetailRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCallDetailRecordResponseBodyData getData() {
        return this.data;
    }

    public GetCallDetailRecordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCallDetailRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCallDetailRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCallDetailRecordResponseBodyDataAgentEventsEventSequence extends TeaModel {
        /**
         * <p>The event duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>Dialing</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The time when the event occurred. The value is a UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1604639129000</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        public static GetCallDetailRecordResponseBodyDataAgentEventsEventSequence build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAgentEventsEventSequence self = new GetCallDetailRecordResponseBodyDataAgentEventsEventSequence();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataAgentEventsEventSequence setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetCallDetailRecordResponseBodyDataAgentEventsEventSequence setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetCallDetailRecordResponseBodyDataAgentEventsEventSequence setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataAgentEvents extends TeaModel {
        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>坐席小王</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>The sequence of events.</p>
         */
        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEventsEventSequence> eventSequence;

        /**
         * <p>The skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static GetCallDetailRecordResponseBodyDataAgentEvents build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAgentEvents self = new GetCallDetailRecordResponseBodyDataAgentEvents();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataAgentEvents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetCallDetailRecordResponseBodyDataAgentEvents setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public GetCallDetailRecordResponseBodyDataAgentEvents setEventSequence(java.util.List<GetCallDetailRecordResponseBodyDataAgentEventsEventSequence> eventSequence) {
            this.eventSequence = eventSequence;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        public GetCallDetailRecordResponseBodyDataAgentEvents setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion extends TeaModel {
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

        public static GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion self = new GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving extends TeaModel {
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

        public static GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving self = new GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving setProblem(String problem) {
            this.problem = problem;
            return this;
        }
        public String getProblem() {
            return this.problem;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving setSolved(Boolean solved) {
            this.solved = solved;
            return this;
        }
        public Boolean getSolved() {
            return this.solved;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("SatisfactionDescription")
        public String satisfactionDescription;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskId")
        public String taskId;

        public static GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction self = new GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction setSatisfactionDescription(String satisfactionDescription) {
            this.satisfactionDescription = satisfactionDescription;
            return this;
        }
        public String getSatisfactionDescription() {
            return this.satisfactionDescription;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        public static GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList self = new GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataAnalyticsReport extends TeaModel {
        @NameInMap("Emotion")
        public GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion emotion;

        @NameInMap("ProblemSolving")
        public GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving problemSolving;

        @NameInMap("Satisfaction")
        public GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction satisfaction;

        @NameInMap("TodoList")
        public GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList todoList;

        public static GetCallDetailRecordResponseBodyDataAnalyticsReport build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAnalyticsReport self = new GetCallDetailRecordResponseBodyDataAnalyticsReport();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReport setEmotion(GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion emotion) {
            this.emotion = emotion;
            return this;
        }
        public GetCallDetailRecordResponseBodyDataAnalyticsReportEmotion getEmotion() {
            return this.emotion;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReport setProblemSolving(GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving problemSolving) {
            this.problemSolving = problemSolving;
            return this;
        }
        public GetCallDetailRecordResponseBodyDataAnalyticsReportProblemSolving getProblemSolving() {
            return this.problemSolving;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReport setSatisfaction(GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public GetCallDetailRecordResponseBodyDataAnalyticsReportSatisfaction getSatisfaction() {
            return this.satisfaction;
        }

        public GetCallDetailRecordResponseBodyDataAnalyticsReport setTodoList(GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList todoList) {
            this.todoList = todoList;
            return this;
        }
        public GetCallDetailRecordResponseBodyDataAnalyticsReportTodoList getTodoList() {
            return this.todoList;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence extends TeaModel {
        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>Released</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The time when the event occurred. The value is a UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1532458000000</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        public static GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence self = new GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataCustomerEvents extends TeaModel {
        /**
         * <p>The customer ID. This is usually the customer\&quot;s phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1332315****</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <p>The sequence of events.</p>
         */
        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence> eventSequence;

        public static GetCallDetailRecordResponseBodyDataCustomerEvents build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataCustomerEvents self = new GetCallDetailRecordResponseBodyDataCustomerEvents();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataCustomerEvents setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetCallDetailRecordResponseBodyDataCustomerEvents setEventSequence(java.util.List<GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence> eventSequence) {
            this.eventSequence = eventSequence;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataIvrEventsEventSequence extends TeaModel {
        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>Route2IVR</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The time when the event occurred. The value is a UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1604639129000</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        public static GetCallDetailRecordResponseBodyDataIvrEventsEventSequence build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataIvrEventsEventSequence self = new GetCallDetailRecordResponseBodyDataIvrEventsEventSequence();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataIvrEventsEventSequence setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetCallDetailRecordResponseBodyDataIvrEventsEventSequence setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataIvrEvents extends TeaModel {
        /**
         * <p>The sequence of events.</p>
         */
        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEventsEventSequence> eventSequence;

        /**
         * <p>The ID of the IVR contact flow.</p>
         * 
         * <strong>example:</strong>
         * <p>edaf2eaa-8f88-44ca-812e-41b3cd2b7a90</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The type of the contact flow.</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN_FLOW</p>
         */
        @NameInMap("FlowType")
        public String flowType;

        public static GetCallDetailRecordResponseBodyDataIvrEvents build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataIvrEvents self = new GetCallDetailRecordResponseBodyDataIvrEvents();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataIvrEvents setEventSequence(java.util.List<GetCallDetailRecordResponseBodyDataIvrEventsEventSequence> eventSequence) {
            this.eventSequence = eventSequence;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        public GetCallDetailRecordResponseBodyDataIvrEvents setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetCallDetailRecordResponseBodyDataIvrEvents setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataQueueEventsEventSequence extends TeaModel {
        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>Enqueue</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The time when the event occurred. The value is a UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1604639129000</p>
         */
        @NameInMap("EventTime")
        public Long eventTime;

        public static GetCallDetailRecordResponseBodyDataQueueEventsEventSequence build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataQueueEventsEventSequence self = new GetCallDetailRecordResponseBodyDataQueueEventsEventSequence();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataQueueEventsEventSequence setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetCallDetailRecordResponseBodyDataQueueEventsEventSequence setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

    }

    public static class GetCallDetailRecordResponseBodyDataQueueEvents extends TeaModel {
        /**
         * <p>The sequence of events.</p>
         */
        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEventsEventSequence> eventSequence;

        /**
         * <p>The contact flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>edaf2eaa-8f88-44ca-812e-41b3cd2b7a90</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The queue ID. If the call is routed to a skill group, this is the skill group ID. If the call is routed to an agent, this is the agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试技能组</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The queue type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QueueType")
        public Integer queueType;

        public static GetCallDetailRecordResponseBodyDataQueueEvents build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataQueueEvents self = new GetCallDetailRecordResponseBodyDataQueueEvents();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataQueueEvents setEventSequence(java.util.List<GetCallDetailRecordResponseBodyDataQueueEventsEventSequence> eventSequence) {
            this.eventSequence = eventSequence;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

        public GetCallDetailRecordResponseBodyDataQueueEvents setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetCallDetailRecordResponseBodyDataQueueEvents setQueueId(String queueId) {
            this.queueId = queueId;
            return this;
        }
        public String getQueueId() {
            return this.queueId;
        }

        public GetCallDetailRecordResponseBodyDataQueueEvents setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetCallDetailRecordResponseBodyDataQueueEvents setQueueType(Integer queueType) {
            this.queueType = queueType;
            return this;
        }
        public Integer getQueueType() {
            return this.queueType;
        }

    }

    public static class GetCallDetailRecordResponseBodyData extends TeaModel {
        /**
         * <p>The list of agent events.</p>
         */
        @NameInMap("AgentEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEvents> agentEvents;

        /**
         * <p>The IDs of the agents who are involved in the call. Multiple IDs are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>agent1@ccc-test,agent2@ccc-test</p>
         */
        @NameInMap("AgentIds")
        public String agentIds;

        /**
         * <p>The names of the agents who are involved in the call. Multiple names are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>agent1,agent2</p>
         */
        @NameInMap("AgentNames")
        public String agentNames;

        @NameInMap("AnalyticsReport")
        public GetCallDetailRecordResponseBodyDataAnalyticsReport analyticsReport;

        @NameInMap("AnalyticsReportReady")
        public Boolean analyticsReportReady;

        /**
         * <p>The call duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CallDuration")
        public Long callDuration;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>1332315****</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The location of the called number.</p>
         * 
         * <strong>example:</strong>
         * <p>河北省-唐山</p>
         */
        @NameInMap("CalleeLocation")
        public String calleeLocation;

        /**
         * <p>The location of the calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>山东省-淄博</p>
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
         * <p>The reason why the call ended. Note: The \<code>Voicemail\\</code>, \<code>QueuingFailed\\</code>, \<code>QueuingTimeout\\</code>, \<code>QueuingOverflow\\</code>, and \<code>IVRException\\</code> reasons are returned only if you configure the hang-up reason node. If you do not configure this node and the IVR flow does not include a module to transfer the call to an agent, the default reason is \<code>AbandonedInIVR\\</code>.</p>
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
         * <p>job-10963442671187****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The call type.</p>
         * 
         * <strong>example:</strong>
         * <p>OUTBOUND</p>
         */
        @NameInMap("ContactType")
        public String contactType;

        /**
         * <p>The list of customer events.</p>
         */
        @NameInMap("CustomerEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataCustomerEvents> customerEvents;

        /**
         * <p>The state of the early media. An exception occurred during the early media phase, which is when the customer is being called. An exception at this stage can cause the call to fail. This parameter provides possible reasons for the connection failure based on an analysis of the early media state.</p>
         * 
         * <strong>example:</strong>
         * <p>NotConnected</p>
         */
        @NameInMap("EarlyMediaState")
        public String earlyMediaState;

        /**
         * <p>The time when the call was connected. This parameter is empty if the call was not connected. The value is a UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1532458000000</p>
         */
        @NameInMap("EstablishedTime")
        public Long establishedTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The list of IVR events.</p>
         */
        @NameInMap("IvrEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEvents> ivrEvents;

        @NameInMap("OutsideNumberReleaseReason")
        public String outsideNumberReleaseReason;

        /**
         * <p>The list of queue events.</p>
         */
        @NameInMap("QueueEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEvents> queueEvents;

        /**
         * <p>Indicates whether the recording was generated. A value of \<code>false\\</code> is returned if the call was not connected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RecordingReady")
        public Boolean recordingReady;

        /**
         * <p>The release initiator.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        /**
         * <p>The reason why the call ended. The value is usually the SIP code followed by a text description.</p>
         * 
         * <strong>example:</strong>
         * <p>200 - OK</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <p>The time when the call ended. This is the time when the last party of the call hangs up. The value is a UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1532458000000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The satisfaction score. The value and its meaning are defined by you.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Satisfaction")
        public Integer satisfaction;

        /**
         * <p>The channel through which the satisfaction survey was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>IVR</p>
         */
        @NameInMap("SatisfactionSurveyChannel")
        public String satisfactionSurveyChannel;

        /**
         * <p>Indicates whether a satisfaction survey was initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SatisfactionSurveyOffered")
        public Boolean satisfactionSurveyOffered;

        /**
         * <p>The IDs of the skill groups to which the agents involved in the call belong. Multiple IDs are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        /**
         * <p>The names of the skill groups to which the agents involved in the call belong. Multiple names are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>测试技能组</p>
         */
        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        /**
         * <p>The time when the call started. For an inbound call, this is the time when the call enters the IVR. For an outbound call, this is the time when the call is initiated. The value is a UNIX timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1532458000000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetCallDetailRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyData self = new GetCallDetailRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyData setAgentEvents(java.util.List<GetCallDetailRecordResponseBodyDataAgentEvents> agentEvents) {
            this.agentEvents = agentEvents;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEvents> getAgentEvents() {
            return this.agentEvents;
        }

        public GetCallDetailRecordResponseBodyData setAgentIds(String agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public String getAgentIds() {
            return this.agentIds;
        }

        public GetCallDetailRecordResponseBodyData setAgentNames(String agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public String getAgentNames() {
            return this.agentNames;
        }

        public GetCallDetailRecordResponseBodyData setAnalyticsReport(GetCallDetailRecordResponseBodyDataAnalyticsReport analyticsReport) {
            this.analyticsReport = analyticsReport;
            return this;
        }
        public GetCallDetailRecordResponseBodyDataAnalyticsReport getAnalyticsReport() {
            return this.analyticsReport;
        }

        public GetCallDetailRecordResponseBodyData setAnalyticsReportReady(Boolean analyticsReportReady) {
            this.analyticsReportReady = analyticsReportReady;
            return this;
        }
        public Boolean getAnalyticsReportReady() {
            return this.analyticsReportReady;
        }

        public GetCallDetailRecordResponseBodyData setCallDuration(Long callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public Long getCallDuration() {
            return this.callDuration;
        }

        public GetCallDetailRecordResponseBodyData setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public GetCallDetailRecordResponseBodyData setCalleeLocation(String calleeLocation) {
            this.calleeLocation = calleeLocation;
            return this;
        }
        public String getCalleeLocation() {
            return this.calleeLocation;
        }

        public GetCallDetailRecordResponseBodyData setCallerLocation(String callerLocation) {
            this.callerLocation = callerLocation;
            return this;
        }
        public String getCallerLocation() {
            return this.callerLocation;
        }

        public GetCallDetailRecordResponseBodyData setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public GetCallDetailRecordResponseBodyData setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public GetCallDetailRecordResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetCallDetailRecordResponseBodyData setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public GetCallDetailRecordResponseBodyData setCustomerEvents(java.util.List<GetCallDetailRecordResponseBodyDataCustomerEvents> customerEvents) {
            this.customerEvents = customerEvents;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataCustomerEvents> getCustomerEvents() {
            return this.customerEvents;
        }

        public GetCallDetailRecordResponseBodyData setEarlyMediaState(String earlyMediaState) {
            this.earlyMediaState = earlyMediaState;
            return this;
        }
        public String getEarlyMediaState() {
            return this.earlyMediaState;
        }

        public GetCallDetailRecordResponseBodyData setEstablishedTime(Long establishedTime) {
            this.establishedTime = establishedTime;
            return this;
        }
        public Long getEstablishedTime() {
            return this.establishedTime;
        }

        public GetCallDetailRecordResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCallDetailRecordResponseBodyData setIvrEvents(java.util.List<GetCallDetailRecordResponseBodyDataIvrEvents> ivrEvents) {
            this.ivrEvents = ivrEvents;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEvents> getIvrEvents() {
            return this.ivrEvents;
        }

        public GetCallDetailRecordResponseBodyData setOutsideNumberReleaseReason(String outsideNumberReleaseReason) {
            this.outsideNumberReleaseReason = outsideNumberReleaseReason;
            return this;
        }
        public String getOutsideNumberReleaseReason() {
            return this.outsideNumberReleaseReason;
        }

        public GetCallDetailRecordResponseBodyData setQueueEvents(java.util.List<GetCallDetailRecordResponseBodyDataQueueEvents> queueEvents) {
            this.queueEvents = queueEvents;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEvents> getQueueEvents() {
            return this.queueEvents;
        }

        public GetCallDetailRecordResponseBodyData setRecordingReady(Boolean recordingReady) {
            this.recordingReady = recordingReady;
            return this;
        }
        public Boolean getRecordingReady() {
            return this.recordingReady;
        }

        public GetCallDetailRecordResponseBodyData setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public GetCallDetailRecordResponseBodyData setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public GetCallDetailRecordResponseBodyData setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public GetCallDetailRecordResponseBodyData setSatisfaction(Integer satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public Integer getSatisfaction() {
            return this.satisfaction;
        }

        public GetCallDetailRecordResponseBodyData setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
            this.satisfactionSurveyChannel = satisfactionSurveyChannel;
            return this;
        }
        public String getSatisfactionSurveyChannel() {
            return this.satisfactionSurveyChannel;
        }

        public GetCallDetailRecordResponseBodyData setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
            this.satisfactionSurveyOffered = satisfactionSurveyOffered;
            return this;
        }
        public Boolean getSatisfactionSurveyOffered() {
            return this.satisfactionSurveyOffered;
        }

        public GetCallDetailRecordResponseBodyData setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public GetCallDetailRecordResponseBodyData setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public GetCallDetailRecordResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
