// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecentCallRecordsResponseBody extends TeaModel {
    @NameInMap("CallDetailRecords")
    public ListRecentCallRecordsResponseBodyCallDetailRecords callDetailRecords;

    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRecentCallRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecentCallRecordsResponseBody self = new ListRecentCallRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecentCallRecordsResponseBody setCallDetailRecords(ListRecentCallRecordsResponseBodyCallDetailRecords callDetailRecords) {
        this.callDetailRecords = callDetailRecords;
        return this;
    }
    public ListRecentCallRecordsResponseBodyCallDetailRecords getCallDetailRecords() {
        return this.callDetailRecords;
    }

    public ListRecentCallRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRecentCallRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRecentCallRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("HoldTime")
        public Integer holdTime;

        @NameInMap("QueueTime")
        public Integer queueTime;

        @NameInMap("RingTime")
        public Integer ringTime;

        @NameInMap("Satisfaction")
        public String satisfaction;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("TalkTime")
        public Integer talkTime;

        @NameInMap("WorkTime")
        public Integer workTime;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent self = new ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent();
            return TeaModel.build(map, self);
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

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setHoldTime(Integer holdTime) {
            this.holdTime = holdTime;
            return this;
        }
        public Integer getHoldTime() {
            return this.holdTime;
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

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setSatisfaction(String satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public String getSatisfaction() {
            return this.satisfaction;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
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

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgentsCallDetailAgent setWorkTime(Integer workTime) {
            this.workTime = workTime;
            return this;
        }
        public Integer getWorkTime() {
            return this.workTime;
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
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("FileDescription")
        public String fileDescription;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording self = new ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording();
            return TeaModel.build(map, self);
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

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
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

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
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

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordingsRecording setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
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
        @NameInMap("AgentNames")
        public String agentNames;

        @NameInMap("Agents")
        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents agents;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("ContactDisposition")
        public String contactDisposition;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("ExtraAttr")
        public String extraAttr;

        @NameInMap("Feedback")
        public String feedback;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Recordings")
        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings recordings;

        @NameInMap("Satisfaction")
        public Integer satisfaction;

        @NameInMap("SatisfactionDesc")
        public String satisfactionDesc;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord self = new ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setAgentNames(String agentNames) {
            this.agentNames = agentNames;
            return this;
        }
        public String getAgentNames() {
            return this.agentNames;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setAgents(ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents agents) {
            this.agents = agents;
            return this;
        }
        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordAgents getAgents() {
            return this.agents;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setExtraAttr(String extraAttr) {
            this.extraAttr = extraAttr;
            return this;
        }
        public String getExtraAttr() {
            return this.extraAttr;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setFeedback(String feedback) {
            this.feedback = feedback;
            return this;
        }
        public String getFeedback() {
            return this.feedback;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setRecordings(ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings recordings) {
            this.recordings = recordings;
            return this;
        }
        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecordRecordings getRecordings() {
            return this.recordings;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSatisfaction(Integer satisfaction) {
            this.satisfaction = satisfaction;
            return this;
        }
        public Integer getSatisfaction() {
            return this.satisfaction;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSatisfactionDesc(String satisfactionDesc) {
            this.satisfactionDesc = satisfactionDesc;
            return this;
        }
        public String getSatisfactionDesc() {
            return this.satisfactionDesc;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecordsListCallDetailRecord setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
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
        @NameInMap("List")
        public ListRecentCallRecordsResponseBodyCallDetailRecordsList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRecentCallRecordsResponseBodyCallDetailRecords build(java.util.Map<String, ?> map) throws Exception {
            ListRecentCallRecordsResponseBodyCallDetailRecords self = new ListRecentCallRecordsResponseBodyCallDetailRecords();
            return TeaModel.build(map, self);
        }

        public ListRecentCallRecordsResponseBodyCallDetailRecords setList(ListRecentCallRecordsResponseBodyCallDetailRecordsList list) {
            this.list = list;
            return this;
        }
        public ListRecentCallRecordsResponseBodyCallDetailRecordsList getList() {
            return this.list;
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

        public ListRecentCallRecordsResponseBodyCallDetailRecords setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
