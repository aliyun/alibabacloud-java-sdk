// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class QueryOrderSessionListPopResponseBody extends TeaModel {
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
    public java.util.List<QueryOrderSessionListPopResponseBodyData> data;

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

    public static QueryOrderSessionListPopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderSessionListPopResponseBody self = new QueryOrderSessionListPopResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderSessionListPopResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryOrderSessionListPopResponseBody setData(java.util.List<QueryOrderSessionListPopResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOrderSessionListPopResponseBodyData> getData() {
        return this.data;
    }

    public QueryOrderSessionListPopResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryOrderSessionListPopResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryOrderSessionListPopResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryOrderSessionListPopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderSessionListPopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrderSessionListPopResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SessionId")
        public Long sessionId;

        /**
         * <strong>example:</strong>
         * <p>2024-09-25 14:11</p>
         */
        @NameInMap("SignInDate")
        public String signInDate;

        public static QueryOrderSessionListPopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderSessionListPopResponseBodyData self = new QueryOrderSessionListPopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrderSessionListPopResponseBodyData setSessionId(Long sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public Long getSessionId() {
            return this.sessionId;
        }

        public QueryOrderSessionListPopResponseBodyData setSignInDate(String signInDate) {
            this.signInDate = signInDate;
            return this;
        }
        public String getSignInDate() {
            return this.signInDate;
        }

    }

}
