// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeV2ResponseBody extends TeaModel {
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
     * <strong>example:</strong>
     * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public InitializeV2ResponseBodyResult result;

    public static InitializeV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeV2ResponseBody self = new InitializeV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitializeV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitializeV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitializeV2ResponseBody setResult(InitializeV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public InitializeV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class InitializeV2ResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ClientCfg")
        public String clientCfg;

        /**
         * <strong>example:</strong>
         * <p>hksb7ba1b28130d24e015d*********</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        /**
         * <strong>example:</strong>
         * <p>http****</p>
         */
        @NameInMap("TransactionUrl")
        public String transactionUrl;

        public static InitializeV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            InitializeV2ResponseBodyResult self = new InitializeV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public InitializeV2ResponseBodyResult setClientCfg(String clientCfg) {
            this.clientCfg = clientCfg;
            return this;
        }
        public String getClientCfg() {
            return this.clientCfg;
        }

        public InitializeV2ResponseBodyResult setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public InitializeV2ResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

        public InitializeV2ResponseBodyResult setTransactionUrl(String transactionUrl) {
            this.transactionUrl = transactionUrl;
            return this;
        }
        public String getTransactionUrl() {
            return this.transactionUrl;
        }

    }

}
