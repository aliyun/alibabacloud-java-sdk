// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCallDetailRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetCallDetailRecordResponseBodyData data;

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

    public GetCallDetailRecordResponseBody setData(GetCallDetailRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCallDetailRecordResponseBodyData getData() {
        return this.data;
    }

    public static class GetCallDetailRecordResponseBodyDataAgentEventsEventSequence extends TeaModel {
        @NameInMap("Event")
        public String event;

        @NameInMap("EventTime")
        public Long eventTime;

        public static GetCallDetailRecordResponseBodyDataAgentEventsEventSequence build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAgentEventsEventSequence self = new GetCallDetailRecordResponseBodyDataAgentEventsEventSequence();
            return TeaModel.build(map, self);
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
        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEventsEventSequence> eventSequence;

        public static GetCallDetailRecordResponseBodyDataAgentEvents build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataAgentEvents self = new GetCallDetailRecordResponseBodyDataAgentEvents();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataAgentEvents setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public GetCallDetailRecordResponseBodyDataAgentEvents setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetCallDetailRecordResponseBodyDataAgentEvents setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public GetCallDetailRecordResponseBodyDataAgentEvents setEventSequence(java.util.List<GetCallDetailRecordResponseBodyDataAgentEventsEventSequence> eventSequence) {
            this.eventSequence = eventSequence;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEventsEventSequence> getEventSequence() {
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
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEventsEventSequence> eventSequence;

        public static GetCallDetailRecordResponseBodyDataIvrEvents build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataIvrEvents self = new GetCallDetailRecordResponseBodyDataIvrEvents();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyDataIvrEvents setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetCallDetailRecordResponseBodyDataIvrEvents setEventSequence(java.util.List<GetCallDetailRecordResponseBodyDataIvrEventsEventSequence> eventSequence) {
            this.eventSequence = eventSequence;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEventsEventSequence> getEventSequence() {
            return this.eventSequence;
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
        @NameInMap("QueueId")
        public String queueId;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("QueueType")
        public Integer queueType;

        @NameInMap("EventSequence")
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEventsEventSequence> eventSequence;

        public static GetCallDetailRecordResponseBodyDataQueueEvents build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyDataQueueEvents self = new GetCallDetailRecordResponseBodyDataQueueEvents();
            return TeaModel.build(map, self);
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

        public GetCallDetailRecordResponseBodyDataQueueEvents setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetCallDetailRecordResponseBodyDataQueueEvents setQueueType(Integer queueType) {
            this.queueType = queueType;
            return this;
        }
        public Integer getQueueType() {
            return this.queueType;
        }

        public GetCallDetailRecordResponseBodyDataQueueEvents setEventSequence(java.util.List<GetCallDetailRecordResponseBodyDataQueueEventsEventSequence> eventSequence) {
            this.eventSequence = eventSequence;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEventsEventSequence> getEventSequence() {
            return this.eventSequence;
        }

    }

    public static class GetCallDetailRecordResponseBodyData extends TeaModel {
        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("ContactDisposition")
        public String contactDisposition;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("AgentIds")
        public String agentIds;

        @NameInMap("CallDuration")
        public Long callDuration;

        @NameInMap("RecordingReady")
        public Boolean recordingReady;

        @NameInMap("EstablishedTime")
        public Long establishedTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SatisfactionSurveyOffered")
        public Boolean satisfactionSurveyOffered;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("AgentNames")
        public String agentNames;

        @NameInMap("Satisfaction")
        public Integer satisfaction;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("SatisfactionSurveyChannel")
        public String satisfactionSurveyChannel;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("AgentEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEvents> agentEvents;

        @NameInMap("IvrEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataIvrEvents> ivrEvents;

        @NameInMap("QueueEvents")
        public java.util.List<GetCallDetailRecordResponseBodyDataQueueEvents> queueEvents;

        @NameInMap("CallerLocation")
        public String callerLocation;

        @NameInMap("CalleeLocation")
        public String calleeLocation;

        public static GetCallDetailRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCallDetailRecordResponseBodyData self = new GetCallDetailRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCallDetailRecordResponseBodyData setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public GetCallDetailRecordResponseBodyData setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public GetCallDetailRecordResponseBodyData setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public GetCallDetailRecordResponseBodyData setAgentIds(String agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public String getAgentIds() {
            return this.agentIds;
        }

        public GetCallDetailRecordResponseBodyData setCallDuration(Long callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public Long getCallDuration() {
            return this.callDuration;
        }

        public GetCallDetailRecordResponseBodyData setRecordingReady(Boolean recordingReady) {
            this.recordingReady = recordingReady;
            return this;
        }
        public Boolean getRecordingReady() {
            return this.recordingReady;
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

        public GetCallDetailRecordResponseBodyData setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
            this.satisfactionSurveyOffered = satisfactionSurveyOffered;
            return this;
        }
        public Boolean getSatisfactionSurveyOffered() {
            return this.satisfactionSurveyOffered;
        }

        public GetCallDetailRecordResponseBodyData setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public GetCallDetailRecordResponseBodyData setAgentNames(String agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public String getAgentNames() {
            return this.agentNames;
        }

        public GetCallDetailRecordResponseBodyData setSatisfaction(Integer satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public Integer getSatisfaction() {
            return this.satisfaction;
        }

        public GetCallDetailRecordResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetCallDetailRecordResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetCallDetailRecordResponseBodyData setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
            this.satisfactionSurveyChannel = satisfactionSurveyChannel;
            return this;
        }
        public String getSatisfactionSurveyChannel() {
            return this.satisfactionSurveyChannel;
        }

        public GetCallDetailRecordResponseBodyData setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public GetCallDetailRecordResponseBodyData setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public GetCallDetailRecordResponseBodyData setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public GetCallDetailRecordResponseBodyData setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public GetCallDetailRecordResponseBodyData setAgentEvents(java.util.List<GetCallDetailRecordResponseBodyDataAgentEvents> agentEvents) {
            this.agentEvents = agentEvents;
            return this;
        }
        public java.util.List<GetCallDetailRecordResponseBodyDataAgentEvents> getAgentEvents() {
            return this.agentEvents;
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

        public GetCallDetailRecordResponseBodyData setCallerLocation(String callerLocation) {
            this.callerLocation = callerLocation;
            return this;
        }
        public String getCallerLocation() {
            return this.callerLocation;
        }

        public GetCallDetailRecordResponseBodyData setCalleeLocation(String calleeLocation) {
            this.calleeLocation = calleeLocation;
            return this;
        }
        public String getCalleeLocation() {
            return this.calleeLocation;
        }

    }

}
