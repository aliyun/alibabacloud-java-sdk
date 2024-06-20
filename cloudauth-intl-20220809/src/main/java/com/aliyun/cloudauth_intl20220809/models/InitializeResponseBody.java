// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public InitializeResponseBodyResult result;

    public static InitializeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeResponseBody self = new InitializeResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitializeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitializeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitializeResponseBody setResult(InitializeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public InitializeResponseBodyResult getResult() {
        return this.result;
    }

    public static class InitializeResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ClientCfg")
        public String clientCfg;

        /**
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        /**
         * <strong>example:</strong>
         * <p>http****</p>
         */
        @NameInMap("TransactionUrl")
        public String transactionUrl;

        public static InitializeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            InitializeResponseBodyResult self = new InitializeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public InitializeResponseBodyResult setClientCfg(String clientCfg) {
            this.clientCfg = clientCfg;
            return this;
        }
        public String getClientCfg() {
            return this.clientCfg;
        }

        public InitializeResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

        public InitializeResponseBodyResult setTransactionUrl(String transactionUrl) {
            this.transactionUrl = transactionUrl;
            return this;
        }
        public String getTransactionUrl() {
            return this.transactionUrl;
        }

    }

}
