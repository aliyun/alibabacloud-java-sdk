// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QuerySignInRecordPopResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("Data")
    public java.util.List<QuerySignInRecordPopResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>1skladklasmda</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySignInRecordPopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySignInRecordPopResponseBody self = new QuerySignInRecordPopResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySignInRecordPopResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySignInRecordPopResponseBody setData(java.util.List<QuerySignInRecordPopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QuerySignInRecordPopResponseBodyData> getData() {
        return this.data;
    }

    public QuerySignInRecordPopResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QuerySignInRecordPopResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QuerySignInRecordPopResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySignInRecordPopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySignInRecordPopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySignInRecordPopResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>boarding</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>nfcid</p>
         * 
         * <strong>example:</strong>
         * <p>cshdsaodhoashd</p>
         */
        @NameInMap("Rfid")
        public String rfid;

        /**
         * <p>sessionId</p>
         * 
         * <strong>example:</strong>
         * <p>2001</p>
         */
        @NameInMap("SessionId")
        public Long sessionId;

        /**
         * <strong>example:</strong>
         * <p>2024-09-25 14:11</p>
         */
        @NameInMap("Time")
        public String time;

        public static QuerySignInRecordPopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySignInRecordPopResponseBodyData self = new QuerySignInRecordPopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySignInRecordPopResponseBodyData setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public QuerySignInRecordPopResponseBodyData setRfid(String rfid) {
            this.rfid = rfid;
            return this;
        }
        public String getRfid() {
            return this.rfid;
        }

        public QuerySignInRecordPopResponseBodyData setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public QuerySignInRecordPopResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
