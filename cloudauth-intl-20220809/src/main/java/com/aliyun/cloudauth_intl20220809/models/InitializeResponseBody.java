// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("ClientCfg")
        public String clientCfg;

        @NameInMap("TransactionId")
        public String transactionId;

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

    }

}
