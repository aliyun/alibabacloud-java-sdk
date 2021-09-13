// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListCallDetailRecordsResponseBodyData data;

    public static ListCallDetailRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsResponseBody self = new ListCallDetailRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCallDetailRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCallDetailRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCallDetailRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCallDetailRecordsResponseBody setData(ListCallDetailRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCallDetailRecordsResponseBodyData getData() {
        return this.data;
    }

    public static class ListCallDetailRecordsResponseBodyDataList extends TeaModel {
        @NameInMap("ContactDisposition")
        public String contactDisposition;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("EstablishedTime")
        public Long establishedTime;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("AdditionalBroker")
        public String additionalBroker;

        @NameInMap("SatisfactionIndex")
        public Integer satisfactionIndex;

        @NameInMap("SatisfactionSurveyChannel")
        public String satisfactionSurveyChannel;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("WaitTime")
        public Long waitTime;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("IvrTime")
        public Long ivrTime;

        @NameInMap("SatisfactionDescription")
        public String satisfactionDescription;

        @NameInMap("ReleaseInitiator")
        public String releaseInitiator;

        @NameInMap("AgentIds")
        public String agentIds;

        @NameInMap("CallDuration")
        public String callDuration;

        @NameInMap("RecordingReady")
        public Boolean recordingReady;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RingTime")
        public Long ringTime;

        @NameInMap("SatisfactionSurveyOffered")
        public Boolean satisfactionSurveyOffered;

        @NameInMap("AgentNames")
        public String agentNames;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("RecordingDuration")
        public Long recordingDuration;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("QueueTime")
        public Long queueTime;

        @NameInMap("Broker")
        public String broker;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("CallerLocation")
        public String callerLocation;

        @NameInMap("CalleeLocation")
        public String calleeLocation;

        public static ListCallDetailRecordsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyDataList self = new ListCallDetailRecordsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyDataList setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public ListCallDetailRecordsResponseBodyDataList setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListCallDetailRecordsResponseBodyDataList setEstablishedTime(Long establishedTime) {
            this.establishedTime = establishedTime;
            return this;
        }
        public Long getEstablishedTime() {
            return this.establishedTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListCallDetailRecordsResponseBodyDataList setAdditionalBroker(String additionalBroker) {
            this.additionalBroker = additionalBroker;
            return this;
        }
        public String getAdditionalBroker() {
            return this.additionalBroker;
        }

        public ListCallDetailRecordsResponseBodyDataList setSatisfactionIndex(Integer satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Integer getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public ListCallDetailRecordsResponseBodyDataList setSatisfactionSurveyChannel(String satisfactionSurveyChannel) {
            this.satisfactionSurveyChannel = satisfactionSurveyChannel;
            return this;
        }
        public String getSatisfactionSurveyChannel() {
            return this.satisfactionSurveyChannel;
        }

        public ListCallDetailRecordsResponseBodyDataList setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setWaitTime(Long waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Long getWaitTime() {
            return this.waitTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListCallDetailRecordsResponseBodyDataList setIvrTime(Long ivrTime) {
            this.ivrTime = ivrTime;
            return this;
        }
        public Long getIvrTime() {
            return this.ivrTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setSatisfactionDescription(String satisfactionDescription) {
            this.satisfactionDescription = satisfactionDescription;
            return this;
        }
        public String getSatisfactionDescription() {
            return this.satisfactionDescription;
        }

        public ListCallDetailRecordsResponseBodyDataList setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public ListCallDetailRecordsResponseBodyDataList setAgentIds(String agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public String getAgentIds() {
            return this.agentIds;
        }

        public ListCallDetailRecordsResponseBodyDataList setCallDuration(String callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public String getCallDuration() {
            return this.callDuration;
        }

        public ListCallDetailRecordsResponseBodyDataList setRecordingReady(Boolean recordingReady) {
            this.recordingReady = recordingReady;
            return this;
        }
        public Boolean getRecordingReady() {
            return this.recordingReady;
        }

        public ListCallDetailRecordsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCallDetailRecordsResponseBodyDataList setRingTime(Long ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Long getRingTime() {
            return this.ringTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
            this.satisfactionSurveyOffered = satisfactionSurveyOffered;
            return this;
        }
        public Boolean getSatisfactionSurveyOffered() {
            return this.satisfactionSurveyOffered;
        }

        public ListCallDetailRecordsResponseBodyDataList setAgentNames(String agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public String getAgentNames() {
            return this.agentNames;
        }

        public ListCallDetailRecordsResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListCallDetailRecordsResponseBodyDataList setRecordingDuration(Long recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Long getRecordingDuration() {
            return this.recordingDuration;
        }

        public ListCallDetailRecordsResponseBodyDataList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListCallDetailRecordsResponseBodyDataList setQueueTime(Long queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Long getQueueTime() {
            return this.queueTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setBroker(String broker) {
            this.broker = broker;
            return this;
        }
        public String getBroker() {
            return this.broker;
        }

        public ListCallDetailRecordsResponseBodyDataList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListCallDetailRecordsResponseBodyDataList setCallerLocation(String callerLocation) {
            this.callerLocation = callerLocation;
            return this;
        }
        public String getCallerLocation() {
            return this.callerLocation;
        }

        public ListCallDetailRecordsResponseBodyDataList setCalleeLocation(String calleeLocation) {
            this.calleeLocation = calleeLocation;
            return this;
        }
        public String getCalleeLocation() {
            return this.calleeLocation;
        }

    }

    public static class ListCallDetailRecordsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListCallDetailRecordsResponseBodyDataList> list;

        public static ListCallDetailRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyData self = new ListCallDetailRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCallDetailRecordsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCallDetailRecordsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListCallDetailRecordsResponseBodyData setList(java.util.List<ListCallDetailRecordsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCallDetailRecordsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
