// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The request status code. OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("Data")
    public ListTaskDetailResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>186****0000</p>
         */
        @NameInMap("Called")
        public String called;

        /**
         * <p>The caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>136****0000</p>
         */
        @NameInMap("Caller")
        public String caller;

        /**
         * <p>The hangup direction. Valid values:</p>
         * <ul>
         * <li><strong>User</strong>.</li>
         * <li><strong>Robot</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The call duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The end time in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20 00:03:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The detail ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The current retry count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetryCurTimes")
        public Integer retryCurTimes;

        /**
         * <p>The total number of retries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RetryTimes")
        public Integer retryTimes;

        /**
         * <p>The start time in the YYYY-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The detail status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The call status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200100</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The description of the call status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Call succeeded</p>
         */
        @NameInMap("StatusCodeDesc")
        public String statusCodeDesc;

        /**
         * <p>The intent label.</p>
         * 
         * <strong>example:</strong>
         * <p>Affirmative</p>
         */
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
        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The list of task records.</p>
         */
        @NameInMap("Record")
        public java.util.List<ListTaskDetailResponseBodyDataRecord> record;

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
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
