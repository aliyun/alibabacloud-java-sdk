// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Recordings")
    public ListRecordingsResponseBodyRecordings recordings;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListRecordingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingsResponseBody self = new ListRecordingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecordingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecordingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecordingsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRecordingsResponseBody setRecordings(ListRecordingsResponseBodyRecordings recordings) {
        this.recordings = recordings;
        return this;
    }
    public ListRecordingsResponseBodyRecordings getRecordings() {
        return this.recordings;
    }

    public ListRecordingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRecordingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRecordingsResponseBodyRecordingsListRecording extends TeaModel {
        @NameInMap("ContactType")
        public String contactType;

        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("FileDescription")
        public String fileDescription;

        public static ListRecordingsResponseBodyRecordingsListRecording build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingsResponseBodyRecordingsListRecording self = new ListRecordingsResponseBodyRecordingsListRecording();
            return TeaModel.build(map, self);
        }

        public ListRecordingsResponseBodyRecordingsListRecording setContactType(String contactType) {
            this.contactType = contactType;
            return this;
        }
        public String getContactType() {
            return this.contactType;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListRecordingsResponseBodyRecordingsListRecording setFileDescription(String fileDescription) {
            this.fileDescription = fileDescription;
            return this;
        }
        public String getFileDescription() {
            return this.fileDescription;
        }

    }

    public static class ListRecordingsResponseBodyRecordingsList extends TeaModel {
        @NameInMap("Recording")
        public java.util.List<ListRecordingsResponseBodyRecordingsListRecording> recording;

        public static ListRecordingsResponseBodyRecordingsList build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingsResponseBodyRecordingsList self = new ListRecordingsResponseBodyRecordingsList();
            return TeaModel.build(map, self);
        }

        public ListRecordingsResponseBodyRecordingsList setRecording(java.util.List<ListRecordingsResponseBodyRecordingsListRecording> recording) {
            this.recording = recording;
            return this;
        }
        public java.util.List<ListRecordingsResponseBodyRecordingsListRecording> getRecording() {
            return this.recording;
        }

    }

    public static class ListRecordingsResponseBodyRecordings extends TeaModel {
        @NameInMap("List")
        public ListRecordingsResponseBodyRecordingsList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRecordingsResponseBodyRecordings build(java.util.Map<String, ?> map) throws Exception {
            ListRecordingsResponseBodyRecordings self = new ListRecordingsResponseBodyRecordings();
            return TeaModel.build(map, self);
        }

        public ListRecordingsResponseBodyRecordings setList(ListRecordingsResponseBodyRecordingsList list) {
            this.list = list;
            return this;
        }
        public ListRecordingsResponseBodyRecordingsList getList() {
            return this.list;
        }

        public ListRecordingsResponseBodyRecordings setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRecordingsResponseBodyRecordings setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRecordingsResponseBodyRecordings setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
