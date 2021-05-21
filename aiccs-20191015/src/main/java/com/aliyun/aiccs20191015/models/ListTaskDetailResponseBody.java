// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListTaskDetailResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListTaskDetailResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static ListTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskDetailResponseBody self = new ListTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskDetailResponseBody setData(ListTaskDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskDetailResponseBodyData getData() {
        return this.data;
    }

    public ListTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskDetailResponseBodyDataRecord extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("RetryCurTimes")
        public Integer retryCurTimes;

        @NameInMap("Called")
        public String called;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("Id")
        public Long id;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("StatusCodeDesc")
        public String statusCodeDesc;

        @NameInMap("RetryTimes")
        public Integer retryTimes;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("Tags")
        public String tags;

        public static ListTaskDetailResponseBodyDataRecord build(java.util.Map<String, ?> map) throws Exception {
            ListTaskDetailResponseBodyDataRecord self = new ListTaskDetailResponseBodyDataRecord();
            return TeaModel.build(map, self);
        }

        public ListTaskDetailResponseBodyDataRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskDetailResponseBodyDataRecord setRetryCurTimes(Integer retryCurTimes) {
            this.retryCurTimes = retryCurTimes;
            return this;
        }
        public Integer getRetryCurTimes() {
            return this.retryCurTimes;
        }

        public ListTaskDetailResponseBodyDataRecord setCalled(String called) {
            this.called = called;
            return this;
        }
        public String getCalled() {
            return this.called;
        }

        public ListTaskDetailResponseBodyDataRecord setCaller(String caller) {
            this.caller = caller;
            return this;
        }
        public String getCaller() {
            return this.caller;
        }

        public ListTaskDetailResponseBodyDataRecord setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListTaskDetailResponseBodyDataRecord setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskDetailResponseBodyDataRecord setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ListTaskDetailResponseBodyDataRecord setStatusCodeDesc(String statusCodeDesc) {
            this.statusCodeDesc = statusCodeDesc;
            return this;
        }
        public String getStatusCodeDesc() {
            return this.statusCodeDesc;
        }

        public ListTaskDetailResponseBodyDataRecord setRetryTimes(Integer retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }
        public Integer getRetryTimes() {
            return this.retryTimes;
        }

        public ListTaskDetailResponseBodyDataRecord setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTaskDetailResponseBodyDataRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTaskDetailResponseBodyDataRecord setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ListTaskDetailResponseBodyDataRecord setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

    public static class ListTaskDetailResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Record")
        public java.util.List<ListTaskDetailResponseBodyDataRecord> record;

        public static ListTaskDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskDetailResponseBodyData self = new ListTaskDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskDetailResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public ListTaskDetailResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTaskDetailResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListTaskDetailResponseBodyData setRecord(java.util.List<ListTaskDetailResponseBodyDataRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<ListTaskDetailResponseBodyDataRecord> getRecord() {
            return this.record;
        }

    }

}
