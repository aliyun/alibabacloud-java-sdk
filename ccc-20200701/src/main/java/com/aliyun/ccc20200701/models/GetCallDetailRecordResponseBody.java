// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCallDetailRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCallDetailRecordResponseBodyData data;

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
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>Dialing</p>
         */
        @NameInMap("Event")
        public String event;

        /**
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
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEventsEventSequence> eventSequence;

        /**
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

    public static class GetCallDetailRecordResponseBodyDataCustomerEventsEventSequence extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Released</p>
         */
        @NameInMap("Event")
        public String event;

        /**
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
         * <strong>example:</strong>
         * <p>1332315****</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

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
         * <strong>example:</strong>
         * <p>Route2IVR</p>
         */
        @NameInMap("Event")
        public String event;

        /**
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
        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEventsEventSequence> eventSequence;

        /**
         * <strong>example:</strong>
         * <p>edaf2eaa-8f88-44ca-812e-41b3cd2b7a90</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
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
         * <strong>example:</strong>
         * <p>Enqueue</p>
         */
        @NameInMap("Event")
        public String event;

        /**
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
        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEventsEventSequence> eventSequence;

        /**
         * <strong>example:</strong>
         * <p>edaf2eaa-8f88-44ca-812e-41b3cd2b7a90</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("QueueId")
        public String queueId;

        @NameInMap("QueueName")
        public String queueName;

        /**
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
        @NameInMap("AgentEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEvents> agentEvents;

        /**
         * <strong>example:</strong>
         * <p>agent1@ccc-test,agent2@ccc-test</p>
         */
        @NameInMap("AgentIds")
        public String agentIds;

        /**
         * <strong>example:</strong>
         * <p>agent1,agent2</p>
         */
        @NameInMap("AgentNames")
        public String agentNames;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("CallDuration")
        public Long callDuration;

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

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ContactDisposition")
        public String contactDisposition;

        /**
         * <strong>example:</strong>
         * <p>job-10963442671187****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("CustomerEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataCustomerEvents> customerEvents;

        /**
         * <strong>example:</strong>
         * <p>NotConnected</p>
         */
        @NameInMap("EarlyMediaState")
        public String earlyMediaState;

        /**
         * <strong>example:</strong>
         * <p>1532458000000</p>
         */
        @NameInMap("EstablishedTime")
        public Long establishedTime;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IvrEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEvents> ivrEvents;

        @NameInMap("QueueEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEvents> queueEvents;

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
         * <p>200 - OK</p>
         */
        @NameInMap("ReleaseReason")
        public String releaseReason;

        /**
         * <strong>example:</strong>
         * <p>1532458000000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Satisfaction")
        public Integer satisfaction;

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
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        /**
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
