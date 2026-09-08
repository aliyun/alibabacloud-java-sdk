// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListVoicemailsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public ListVoicemailsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVoicemailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVoicemailsResponseBody self = new ListVoicemailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVoicemailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVoicemailsResponseBody setData(ListVoicemailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVoicemailsResponseBodyData getData() {
        return this.data;
    }

    public ListVoicemailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVoicemailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVoicemailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVoicemailsResponseBodyDataList extends TeaModel {
        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>0533128****</p>
         */
        @NameInMap("Callee")
        public String callee;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>073xxxx7539</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <p>The start time of the call.</p>
         * 
         * <strong>example:</strong>
         * <p>1532448000000，已废弃，请使用StartTime。</p>
         */
        @NameInMap("CdrStartTime")
        public Long cdrStartTime;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-125152394144124921</p>
         */
        @NameInMap("ContactId")
        public String contactId;

        /**
         * <p>The duration of the voicemail message in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The ID of the CC instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the voicemail.</p>
         * 
         * <strong>example:</strong>
         * <p>voicemail-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The duration of the voicemail message in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10，已废弃，请使用Duration</p>
         */
        @NameInMap("RecordingDuration")
        public Long recordingDuration;

        /**
         * <p>The start time of the voicemail.</p>
         * 
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListVoicemailsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListVoicemailsResponseBodyDataList self = new ListVoicemailsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListVoicemailsResponseBodyDataList setCallee(String callee) {
            this.callee = callee;
            return this;
        }
        public String getCallee() {
            return this.callee;
        }

        public ListVoicemailsResponseBodyDataList setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListVoicemailsResponseBodyDataList setCdrStartTime(Long cdrStartTime) {
            this.cdrStartTime = cdrStartTime;
            return this;
        }
        public Long getCdrStartTime() {
            return this.cdrStartTime;
        }

        public ListVoicemailsResponseBodyDataList setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListVoicemailsResponseBodyDataList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListVoicemailsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVoicemailsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVoicemailsResponseBodyDataList setRecordingDuration(Long recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Long getRecordingDuration() {
            return this.recordingDuration;
        }

        public ListVoicemailsResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListVoicemailsResponseBodyData extends TeaModel {
        /**
         * <p>The list of voicemail records.</p>
         */
        @NameInMap("List")
        public java.util.List<ListVoicemailsResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries. This parameter is returned only when \<code>PageNumber\\</code> is set to 1. For other values of \<code>PageNumber\\</code>, this parameter returns 0.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListVoicemailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVoicemailsResponseBodyData self = new ListVoicemailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVoicemailsResponseBodyData setList(java.util.List<ListVoicemailsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListVoicemailsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListVoicemailsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVoicemailsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVoicemailsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
