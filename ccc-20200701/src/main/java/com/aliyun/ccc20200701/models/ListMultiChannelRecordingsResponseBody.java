// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListMultiChannelRecordingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListMultiChannelRecordingsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListMultiChannelRecordingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMultiChannelRecordingsResponseBody self = new ListMultiChannelRecordingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMultiChannelRecordingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMultiChannelRecordingsResponseBody setData(java.util.List<ListMultiChannelRecordingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMultiChannelRecordingsResponseBodyData> getData() {
        return this.data;
    }

    public ListMultiChannelRecordingsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMultiChannelRecordingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMultiChannelRecordingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMultiChannelRecordingsResponseBodyData extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListMultiChannelRecordingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMultiChannelRecordingsResponseBodyData self = new ListMultiChannelRecordingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMultiChannelRecordingsResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListMultiChannelRecordingsResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListMultiChannelRecordingsResponseBodyData setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListMultiChannelRecordingsResponseBodyData setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMultiChannelRecordingsResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListMultiChannelRecordingsResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListMultiChannelRecordingsResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
