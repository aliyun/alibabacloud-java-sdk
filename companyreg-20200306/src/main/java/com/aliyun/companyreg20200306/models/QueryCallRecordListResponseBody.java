// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class QueryCallRecordListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryCallRecordListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>6A603AA0-73BA-52B3-AC7D-0F846ECF7A9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCallRecordListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallRecordListResponseBody self = new QueryCallRecordListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallRecordListResponseBody setData(java.util.List<QueryCallRecordListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCallRecordListResponseBodyData> getData() {
        return this.data;
    }

    public QueryCallRecordListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryCallRecordListResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryCallRecordListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCallRecordListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCallRecordListResponseBodyData extends TeaModel {
        @NameInMap("ContactDisposition")
        public String contactDisposition;

        /**
         * <strong>example:</strong>
         * <p>40140</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>UPLOADED/SCRIPT/74974566-2b69-4389-9bf9-5d7b432f06ad/fa92ce53-6b5f-4b3d-807c-a46417c08f66_a4cc3a16-e365-42cb-87d8-7776f8b110a1.json</p>
         */
        @NameInMap("SignatureUrl")
        public String signatureUrl;

        /**
         * <strong>example:</strong>
         * <p>2025-06-07T02:08:00Z</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("taskId")
        public String taskId;

        public static QueryCallRecordListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCallRecordListResponseBodyData self = new QueryCallRecordListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCallRecordListResponseBodyData setContactDisposition(String contactDisposition) {
            this.contactDisposition = contactDisposition;
            return this;
        }
        public String getContactDisposition() {
            return this.contactDisposition;
        }

        public QueryCallRecordListResponseBodyData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryCallRecordListResponseBodyData setSignatureUrl(String signatureUrl) {
            this.signatureUrl = signatureUrl;
            return this;
        }
        public String getSignatureUrl() {
            return this.signatureUrl;
        }

        public QueryCallRecordListResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryCallRecordListResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
