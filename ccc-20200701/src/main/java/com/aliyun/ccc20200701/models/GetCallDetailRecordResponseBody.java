// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCallDetailRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCallDetailRecordResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Event")
        public String event;

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
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEventsEventSequence> eventSequence;

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
        @NameInMap("Event")
        public String event;

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
        @NameInMap("Event")
        public String event;

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

        @NameInMap("FlowId")
        public String flowId;

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
        @NameInMap("Event")
        public String event;

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

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("QueueId")
        public String queueId;

        @NameInMap("QueueName")
        public String queueName;

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

        @NameInMap("AgentIds")
        public String agentIds;

        @NameInMap("AgentNames")
        public String agentNames;

        @NameInMap("CallDuration")
        public Long callDuration;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CalleeLocation")
        public String calleeLocation;

        @NameInMap("CallerLocation")
        public String callerLocation;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("ContactDisposition")
        public String contactDisposition;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("CustomerEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataCustomerEvents> customerEvents;

        @NameInMap("EarlyMediaState")
        public String earlyMediaState;

        @NameInMap("EstablishedTime")
        public Long establishedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IvrEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEvents> ivrEvents;

        @NameInMap("QueueEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEvents> queueEvents;

        @NameInMap("RecordingReady")
        public Boolean recordingReady;

        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("Satisfaction")
        public Integer satisfaction;

        @NameInMap("SatisfactionSurveyChannel")
        public String satisfactionSurveyChannel;

        @NameInMap("SatisfactionSurveyOffered")
        public Boolean satisfactionSurveyOffered;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

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
