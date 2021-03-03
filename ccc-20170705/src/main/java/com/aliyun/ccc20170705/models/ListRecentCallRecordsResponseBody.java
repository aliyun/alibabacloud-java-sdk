// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecentCallRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("CallDetailRecords")
    public ListRecentCallRecordsResponseBodyCallDetailRecords callDetailRecords;

    public static ListRecentCallRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentCallRecordsResponseBody self = new ListRecentCallRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentCallRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecentCallRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRecentCallRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRecentCallRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecentCallRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRecentCallRecordsResponseBody setCallDetailRecords(ListRecentCallRecordsResponseBodyCallDetailRecords callDetailRecords) {
        this.callDetailRecords = callDetailRecords;
        return this;
    }
    public ListRecentCallRecordsResponseBodyCallDetailRecords getCallDetailRecords() {
        return this.callDetailRecords;
    }

    public static class ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("QueueTime")
        public Integer queueTime;

        @NameInMap("RingTime")
        public Integer ringTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TalkTime")
        public Integer talkTime;

        @NameInMap("HoldTime")
        public Integer holdTime;

        @NameInMap("WorkTime")
        public Integer workTime;

        @NameInMap("Satisfaction")
        public String satisfaction;

        @NameInMap("Feedback")
        public String feedback;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent self = new ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setQueueTime(Integer queueTime) {
            this.queueTime = queueTime;
            return this;
        }
        public Integer getQueueTime() {
            return this.queueTime;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setRingTime(Integer ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Integer getRingTime() {
            return this.ringTime;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setTalkTime(Integer talkTime) {
            this.talkTime = talkTime;
            return this;
        }
        public Integer getTalkTime() {
            return this.talkTime;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setHoldTime(Integer holdTime) {
            this.holdTime = holdTime;
            return this;
        }
        public Integer getHoldTime() {
            return this.holdTime;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setWorkTime(Integer workTime) {
            this.workTime = workTime;
            return this;
        }
        public Integer getWorkTime() {
            return this.workTime;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setSatisfaction(String satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public String getSatisfaction() {
            return this.satisfaction;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

    }

    public static class ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents extends TeaModel {
        @NameInMap("CallDetailAgent")
        public java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent> callDetailAgent;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents self = new ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents setCallDetailAgent(java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent> callDetailAgent) {
            this.callDetailAgent = callDetailAgent;
            return this;
        }
        public java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent> getCallDetailAgent() {
            return this.callDetailAgent;
        }

    }

    public static class ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FileDescription")
        public String fileDescription;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording self = new ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings extends TeaModel {
        @NameInMap("Recording")
        public java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording> recording;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings self = new ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings setRecording(java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording> recording) {
            this.recording = recording;
            return this;
        }
        public java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording> getRecording() {
            return this.recording;
        }

    }

    public static class ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord extends TeaModel {
        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Satisfaction")
        public Integer satisfaction;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("ContactDisposition")
        public String contactDisposition;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("AgentNames")
        public String agentNames;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ExtraAttr")
        public String extraAttr;

        @NameInMap("SatisfactionDesc")
        public String satisfactionDesc;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("Agents")
        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents agents;

        @NameInMap("Recordings")
        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings recordings;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord self = new ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSatisfaction(Integer satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public Integer getSatisfaction() {
            return this.satisfaction;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setAgentNames(String agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public String getAgentNames() {
            return this.agentNames;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setExtraAttr(String extraAttr) {
            this.extraAttr = extraAttr;
            return this;
        }
        public String getExtraAttr() {
            return this.extraAttr;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSatisfactionDesc(String satisfactionDesc) {
            this.satisfactionDesc = satisfactionDesc;
            return this;
        }
        public String getSatisfactionDesc() {
            return this.satisfactionDesc;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setAgents(ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents agents) {
            this.agents = agents;
            return this;
        }
        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents getAgents() {
            return this.agents;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setRecordings(ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings recordings) {
            this.recordings = recordings;
            return this;
        }
        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings getRecordings() {
            return this.recordings;
        }

    }

    public static class ListRecentCallRecordsResponseBodyCallDetailRecordsList extends TeaModel {
        @NameInMap("CallDetailRecord")
        public java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord> callDetailRecord;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsList build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsList self = new ListRecentCallRecordsResponseBodyCallDetailRecordsList();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsList setCallDetailRecord(java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord> callDetailRecord) {
            this.callDetailRecord = callDetailRecord;
            return this;
        }
        public java.util.List<ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord> getCallDetailRecord() {
            return this.callDetailRecord;
        }

    }

    public static class ListRecentCallRecordsResponseBodyCallDetailRecords extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("List")
        public ListRecentCallRecordsResponseBodyCallDetailRecordsList list;

        public static ListRecentCallRecordsResponseBodyCallDetailRecords build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecords self = new ListRecentCallRecordsResponseBodyCallDetailRecords();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecords setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecords setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecords setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecords setList(ListRecentCallRecordsResponseBodyCallDetailRecordsList list) {
            this.list = list;
            return this;
        }
        public ListRecentCallRecordsResponseBodyCallDetailRecordsList getList() {
            return this.list;
        }

    }

}
