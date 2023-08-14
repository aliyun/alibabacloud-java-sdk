// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListVoicemailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListVoicemailsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Callee")
        public String callee;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("CdrStartTime")
        public Long cdrStartTime;

        @NameInMap("ContactId")
        public String contactId;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("RecordingDuration")
        public Long recordingDuration;

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
        @NameInMap("List")
        public java.util.List<ListVoicemailsResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
