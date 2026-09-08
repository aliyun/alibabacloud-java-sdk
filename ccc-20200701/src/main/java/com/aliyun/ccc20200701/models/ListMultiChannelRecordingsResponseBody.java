// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListMultiChannelRecordingsResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Recording list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListMultiChannelRecordingsResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B19CD719-9F65-56A6-8B79-DA4282EA4797</p>
     */
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

    public static class ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments extends TeaModel {
        /**
         * <p>The end time of the call hold, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687860143925</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Call hold start time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1673255098049</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments build(java.util.Map<String, ?> map) throws Exception {
            ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments self = new ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments();
            return TeaModel.build(map, self);
        }

        public ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListMultiChannelRecordingsResponseBodyData extends TeaModel {
        /**
         * <p>Agent call channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ch-user-8526899****-8602****-1656926504363-job-25920271311543****</p>
         */
        @NameInMap("AgentChannelId")
        public String agentChannelId;

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>Agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>坐席小王</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>Call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-25920271311543****</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>Recording duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>56321</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>Recording file name.</p>
         * 
         * <strong>example:</strong>
         * <p>job-25920271311543****-798f1e90-1f82-42da-914c-46580c8f4c85-1656926518491.mkv</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>OSS download URL for the recording file. Note the time-to-live (TTL) of the download URL. The download URL is valid for 1 day.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ccc-v2-shanghai.oss-cn-shanghai.aliyuncs.com/ccc-test/job-25920271311543****-798f1e90-1f82-42da-914c-46580c8f4c85-1656926518491.mkv?Expires=1657014031&OSSAccessKeyId=****&Signature=">https://ccc-v2-shanghai.oss-cn-shanghai.aliyuncs.com/ccc-test/job-25920271311543****-798f1e90-1f82-42da-914c-46580c8f4c85-1656926518491.mkv?Expires=1657014031&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>List of call hold time segments.</p>
         */
        @NameInMap("HoldTimeSegments")
        public java.util.List<ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments> holdTimeSegments;

        /**
         * <p>RAM account ID for the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>22807673106369****</p>
         */
        @NameInMap("RamId")
        public String ramId;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>Recording start time, in UNIX timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1656926518491</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ListMultiChannelRecordingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMultiChannelRecordingsResponseBodyData self = new ListMultiChannelRecordingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMultiChannelRecordingsResponseBodyData setAgentChannelId(String agentChannelId) {
            this.agentChannelId = agentChannelId;
            return this;
        }
        public String getAgentChannelId() {
            return this.agentChannelId;
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

        public ListMultiChannelRecordingsResponseBodyData setHoldTimeSegments(java.util.List<ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments> holdTimeSegments) {
            this.holdTimeSegments = holdTimeSegments;
            return this;
        }
        public java.util.List<ListMultiChannelRecordingsResponseBodyDataHoldTimeSegments> getHoldTimeSegments() {
            return this.holdTimeSegments;
        }

        public ListMultiChannelRecordingsResponseBodyData setRamId(String ramId) {
            this.ramId = ramId;
            return this;
        }
        public String getRamId() {
            return this.ramId;
        }

        public ListMultiChannelRecordingsResponseBodyData setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
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
