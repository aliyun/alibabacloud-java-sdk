// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCallDetailRecordsResponseBodyData data;

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
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ListCallDetailRecordsResponseBody setData(ListCallDetailRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCallDetailRecordsResponseBodyData getData() {
        return this.data;
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

    public static class ListCallDetailRecordsResponseBodyDataList extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>0533127****</p>
         */
        @NameInMap("Broker")
        public String broker;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CallDuration")
        public String callDuration;

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
         * <p>job-12515239414412****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <strong>example:</strong>
         * <p>Outbound</p>
         */
        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("DialingTime")
        public Long dialingTime;

        /**
         * <strong>example:</strong>
         * <p>NotConnected</p>
         */
        @NameInMap("EarlyMediaState")
        public String earlyMediaState;

        /**
         * <strong>example:</strong>
         * <p>1532448000000</p>
         */
        @NameInMap("EstablishedTime")
        public Long establishedTime;

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
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        /**
         * <strong>example:</strong>
         * <p>1532448000000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TalkTime")
        public Long talkTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("WaitTime")
        public Long waitTime;

        public static ListCallDetailRecordsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyDataList self = new ListCallDetailRecordsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyDataList setAdditionalBroker(String additionalBroker) {
            this.additionalBroker = additionalBroker;
            return this;
        }
        public String getAdditionalBroker() {
            return this.additionalBroker;
        }

        public ListCallDetailRecordsResponseBodyDataList setAgentIds(String agentIds) {
            this.agentIds = agentIds;
            return this;
        }
        public String getAgentIds() {
            return this.agentIds;
        }

        public ListCallDetailRecordsResponseBodyDataList setAgentNames(String agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public String getAgentNames() {
            return this.agentNames;
        }

        public ListCallDetailRecordsResponseBodyDataList setBroker(String broker) {
            this.broker = broker;
            return this;
        }
        public String getBroker() {
            return this.broker;
        }

        public ListCallDetailRecordsResponseBodyDataList setCallDuration(String callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public String getCallDuration() {
            return this.callDuration;
        }

        public ListCallDetailRecordsResponseBodyDataList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListCallDetailRecordsResponseBodyDataList setCalleeLocation(String calleeLocation) {
            this.calleeLocation = calleeLocation;
            return this;
        }
        public String getCalleeLocation() {
            return this.calleeLocation;
        }

        public ListCallDetailRecordsResponseBodyDataList setCallerLocation(String callerLocation) {
            this.callerLocation = callerLocation;
            return this;
        }
        public String getCallerLocation() {
            return this.callerLocation;
        }

        public ListCallDetailRecordsResponseBodyDataList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListCallDetailRecordsResponseBodyDataList setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public ListCallDetailRecordsResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListCallDetailRecordsResponseBodyDataList setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListCallDetailRecordsResponseBodyDataList setDialingTime(Long dialingTime) {
            this.dialingTime = dialingTime;
            return this;
        }
        public Long getDialingTime() {
            return this.dialingTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setEarlyMediaState(String earlyMediaState) {
            this.earlyMediaState = earlyMediaState;
            return this;
        }
        public String getEarlyMediaState() {
            return this.earlyMediaState;
        }

        public ListCallDetailRecordsResponseBodyDataList setEstablishedTime(Long establishedTime) {
            this.establishedTime = establishedTime;
            return this;
        }
        public Long getEstablishedTime() {
            return this.establishedTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setHeldTime(Long heldTime) {
            this.heldTime = heldTime;
            return this;
        }
        public Long getHeldTime() {
            return this.heldTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCallDetailRecordsResponseBodyDataList setIvrTime(Long ivrTime) {
            this.ivrTime = ivrTime;
            return this;
        }
        public Long getIvrTime() {
            return this.ivrTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setQueueTime(Long queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Long getQueueTime() {
            return this.queueTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setRecordingDuration(Long recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Long getRecordingDuration() {
            return this.recordingDuration;
        }

        public ListCallDetailRecordsResponseBodyDataList setRecordingReady(Boolean recordingReady) {
            this.recordingReady = recordingReady;
            return this;
        }
        public Boolean getRecordingReady() {
            return this.recordingReady;
        }

        public ListCallDetailRecordsResponseBodyDataList setReleaseInitiator(String releaseInitiator) {
            this.releaseInitiator = releaseInitiator;
            return this;
        }
        public String getReleaseInitiator() {
            return this.releaseInitiator;
        }

        public ListCallDetailRecordsResponseBodyDataList setReleaseReason(String releaseReason) {
            this.releaseReason = releaseReason;
            return this;
        }
        public String getReleaseReason() {
            return this.releaseReason;
        }

        public ListCallDetailRecordsResponseBodyDataList setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setRingTime(Long ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Long getRingTime() {
            return this.ringTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setSatisfactionDescription(String satisfactionDescription) {
            this.satisfactionDescription = satisfactionDescription;
            return this;
        }
        public String getSatisfactionDescription() {
            return this.satisfactionDescription;
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

        public ListCallDetailRecordsResponseBodyDataList setSatisfactionSurveyOffered(Boolean satisfactionSurveyOffered) {
            this.satisfactionSurveyOffered = satisfactionSurveyOffered;
            return this;
        }
        public Boolean getSatisfactionSurveyOffered() {
            return this.satisfactionSurveyOffered;
        }

        public ListCallDetailRecordsResponseBodyDataList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public ListCallDetailRecordsResponseBodyDataList setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListCallDetailRecordsResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setTalkTime(Long talkTime) {
            this.talkTime = talkTime;
            return this;
        }
        public Long getTalkTime() {
            return this.talkTime;
        }

        public ListCallDetailRecordsResponseBodyDataList setWaitTime(Long waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Long getWaitTime() {
            return this.waitTime;
        }

    }

    public static class ListCallDetailRecordsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCallDetailRecordsResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCallDetailRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCallDetailRecordsResponseBodyData self = new ListCallDetailRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCallDetailRecordsResponseBodyData setList(java.util.List<ListCallDetailRecordsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCallDetailRecordsResponseBodyDataList> getList() {
            return this.list;
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

    }

}
