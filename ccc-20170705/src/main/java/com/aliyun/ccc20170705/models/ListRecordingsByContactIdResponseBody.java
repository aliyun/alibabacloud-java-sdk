// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingsByContactIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Recordings")
    public ListRecordingsByContactIdResponseBodyRecordings recordings;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRecordingsByContactIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingsByContactIdResponseBody self = new ListRecordingsByContactIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecordingsByContactIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRecordingsByContactIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRecordingsByContactIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecordingsByContactIdResponseBody setRecordings(ListRecordingsByContactIdResponseBodyRecordings recordings) {
        this.recordings = recordings;
        return this;
    }
    public ListRecordingsByContactIdResponseBodyRecordings getRecordings() {
        return this.recordings;
    }

    public ListRecordingsByContactIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecordingsByContactIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRecordingsByContactIdResponseBodyRecordingsRecording extends TeaModel {
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

        @NameInMap("QualityCheckTaskId")
        public String qualityCheckTaskId;

        @NameInMap("QualityCheckTid")
        public String qualityCheckTid;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListRecordingsByContactIdResponseBodyRecordingsRecording build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingsByContactIdResponseBodyRecordingsRecording self = new ListRecordingsByContactIdResponseBodyRecordingsRecording();
            return TeaModel.build(map, self);
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setQualityCheckTaskId(String qualityCheckTaskId) {
            this.qualityCheckTaskId = qualityCheckTaskId;
            return this;
        }
        public String getQualityCheckTaskId() {
            return this.qualityCheckTaskId;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setQualityCheckTid(String qualityCheckTid) {
            this.qualityCheckTid = qualityCheckTid;
            return this;
        }
        public String getQualityCheckTid() {
            return this.qualityCheckTid;
        }

        public ListRecordingsByContactIdResponseBodyRecordingsRecording setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListRecordingsByContactIdResponseBodyRecordings extends TeaModel {
        @NameInMap("Recording")
        public java.util.List<ListRecordingsByContactIdResponseBodyRecordingsRecording> recording;

        public static ListRecordingsByContactIdResponseBodyRecordings build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingsByContactIdResponseBodyRecordings self = new ListRecordingsByContactIdResponseBodyRecordings();
            return TeaModel.build(map, self);
        }

        public ListRecordingsByContactIdResponseBodyRecordings setRecording(java.util.List<ListRecordingsByContactIdResponseBodyRecordingsRecording> recording) {
            this.recording = recording;
            return this;
        }
        public java.util.List<ListRecordingsByContactIdResponseBodyRecordingsRecording> getRecording() {
            return this.recording;
        }

    }

}
