// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallInPoolTransferConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public QueryCallInPoolTransferConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryCallInPoolTransferConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallInPoolTransferConfigResponseBody self = new QueryCallInPoolTransferConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallInPoolTransferConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCallInPoolTransferConfigResponseBody setData(QueryCallInPoolTransferConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCallInPoolTransferConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryCallInPoolTransferConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCallInPoolTransferConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCallInPoolTransferConfigResponseBodyDataDetails extends TeaModel {
        /**
         * <p>The number used to transfer the call.</p>
         */
        @NameInMap("Called")
        public String called;

        public static QueryCallInPoolTransferConfigResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            QueryCallInPoolTransferConfigResponseBodyDataDetails self = new QueryCallInPoolTransferConfigResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public QueryCallInPoolTransferConfigResponseBodyDataDetails setCalled(String called) {
            this.called = called;
            return this;
        }
        public String getCalled() {
            return this.called;
        }

    }

    public static class QueryCallInPoolTransferConfigResponseBodyData extends TeaModel {
        /**
         * <p>The call mode. Valid values:</p>
         * <br>
         * <p>*   **roundRobin**</p>
         * <p>*   **random**</p>
         */
        @NameInMap("CalledRouteMode")
        public String calledRouteMode;

        /**
         * <p>The details of the response parameters.</p>
         */
        @NameInMap("Details")
        public java.util.List<QueryCallInPoolTransferConfigResponseBodyDataDetails> details;

        /**
         * <p>The time when the call transfer task was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The timeout period for transferring the call.</p>
         */
        @NameInMap("TransferTimeout")
        public String transferTimeout;

        public static QueryCallInPoolTransferConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCallInPoolTransferConfigResponseBodyData self = new QueryCallInPoolTransferConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCallInPoolTransferConfigResponseBodyData setCalledRouteMode(String calledRouteMode) {
            this.calledRouteMode = calledRouteMode;
            return this;
        }
        public String getCalledRouteMode() {
            return this.calledRouteMode;
        }

        public QueryCallInPoolTransferConfigResponseBodyData setDetails(java.util.List<QueryCallInPoolTransferConfigResponseBodyDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<QueryCallInPoolTransferConfigResponseBodyDataDetails> getDetails() {
            return this.details;
        }

        public QueryCallInPoolTransferConfigResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCallInPoolTransferConfigResponseBodyData setTransferTimeout(String transferTimeout) {
            this.transferTimeout = transferTimeout;
            return this;
        }
        public String getTransferTimeout() {
            return this.transferTimeout;
        }

    }

}
