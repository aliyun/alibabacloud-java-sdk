// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallInPoolTransferConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
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
         * 
         * <strong>example:</strong>
         * <p>400****</p>
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
         * <ul>
         * <li><strong>roundRobin</strong></li>
         * <li><strong>random</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>random</p>
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
         * 
         * <strong>example:</strong>
         * <p>1623137002000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The timeout period for transferring the call.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
