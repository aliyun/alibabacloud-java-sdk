// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListTaskDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTaskDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskDetailResponseBody self = new ListTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskDetailResponseBody setData(ListTaskDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskDetailResponseBodyData getData() {
        return this.data;
    }

    public ListTaskDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskDetailResponseBodyDataRecord extends TeaModel {
        @NameInMap("Called")
        public String called;

        @NameInMap("Caller")
        public String caller;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RetryCurTimes")
        public Integer retryCurTimes;

        @NameInMap("RetryTimes")
        public Integer retryTimes;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("StatusCodeDesc")
        public String statusCodeDesc;

        @NameInMap("Tags")
        public String tags;

        public static ListTaskDetailResponseBodyDataRecord build(java.util.Map<String, ?> map) throws Exception {
            ListTaskDetailResponseBodyDataRecord self = new ListTaskDetailResponseBodyDataRecord();
            return TeaModel.build(map, self);
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

        public ListTaskDetailResponseBodyDataRecord setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ListTaskDetailResponseBodyDataRecord setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListTaskDetailResponseBodyDataRecord setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTaskDetailResponseBodyDataRecord setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskDetailResponseBodyDataRecord setRetryCurTimes(Integer retryCurTimes) {
            this.retryCurTimes = retryCurTimes;
            return this;
        }
        public Integer getRetryCurTimes() {
            return this.retryCurTimes;
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

        public ListTaskDetailResponseBodyDataRecord setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        @NameInMap("Record")
        public java.util.List<ListTaskDetailResponseBodyDataRecord> record;

        @NameInMap("Total")
        public Long total;

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

        public ListTaskDetailResponseBodyData setRecord(java.util.List<ListTaskDetailResponseBodyDataRecord> record) {
            this.record = record;
            return this;
        }
        public java.util.List<ListTaskDetailResponseBodyDataRecord> getRecord() {
            return this.record;
        }

        public ListTaskDetailResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
