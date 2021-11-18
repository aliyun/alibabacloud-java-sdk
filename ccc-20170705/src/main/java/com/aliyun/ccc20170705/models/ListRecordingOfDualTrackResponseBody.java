// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingOfDualTrackResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Recordings")
    public ListRecordingOfDualTrackResponseBodyRecordings recordings;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListRecordingOfDualTrackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingOfDualTrackResponseBody self = new ListRecordingOfDualTrackResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecordingOfDualTrackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRecordingOfDualTrackResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRecordingOfDualTrackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecordingOfDualTrackResponseBody setRecordings(ListRecordingOfDualTrackResponseBodyRecordings recordings) {
        this.recordings = recordings;
        return this;
    }
    public ListRecordingOfDualTrackResponseBodyRecordings getRecordings() {
        return this.recordings;
    }

    public ListRecordingOfDualTrackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecordingOfDualTrackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRecordingOfDualTrackResponseBodyRecordingsListRecording extends TeaModel {
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

        public static ListRecordingOfDualTrackResponseBodyRecordingsListRecording build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingOfDualTrackResponseBodyRecordingsListRecording self = new ListRecordingOfDualTrackResponseBodyRecordingsListRecording();
            return TeaModel.build(map, self);
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsListRecording setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListRecordingOfDualTrackResponseBodyRecordingsList extends TeaModel {
        @NameInMap("Recording")
        public java.util.List<ListRecordingOfDualTrackResponseBodyRecordingsListRecording> recording;

        public static ListRecordingOfDualTrackResponseBodyRecordingsList build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingOfDualTrackResponseBodyRecordingsList self = new ListRecordingOfDualTrackResponseBodyRecordingsList();
            return TeaModel.build(map, self);
        }

        public ListRecordingOfDualTrackResponseBodyRecordingsList setRecording(java.util.List<ListRecordingOfDualTrackResponseBodyRecordingsListRecording> recording) {
            this.recording = recording;
            return this;
        }
        public java.util.List<ListRecordingOfDualTrackResponseBodyRecordingsListRecording> getRecording() {
            return this.recording;
        }

    }

    public static class ListRecordingOfDualTrackResponseBodyRecordings extends TeaModel {
        @NameInMap("List")
        public ListRecordingOfDualTrackResponseBodyRecordingsList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRecordingOfDualTrackResponseBodyRecordings build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingOfDualTrackResponseBodyRecordings self = new ListRecordingOfDualTrackResponseBodyRecordings();
            return TeaModel.build(map, self);
        }

        public ListRecordingOfDualTrackResponseBodyRecordings setList(ListRecordingOfDualTrackResponseBodyRecordingsList list) {
            this.list = list;
            return this;
        }
        public ListRecordingOfDualTrackResponseBodyRecordingsList getList() {
            return this.list;
        }

        public ListRecordingOfDualTrackResponseBodyRecordings setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRecordingOfDualTrackResponseBodyRecordings setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRecordingOfDualTrackResponseBodyRecordings setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
