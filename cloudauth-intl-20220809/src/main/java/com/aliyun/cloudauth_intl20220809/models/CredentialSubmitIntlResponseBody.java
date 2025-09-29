// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialSubmitIntlResponseBody extends TeaModel {
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
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CredentialSubmitIntlResponseBodyResult result;

    public static CredentialSubmitIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialSubmitIntlResponseBody self = new CredentialSubmitIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialSubmitIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialSubmitIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialSubmitIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialSubmitIntlResponseBody setResult(CredentialSubmitIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CredentialSubmitIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class CredentialSubmitIntlResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static CredentialSubmitIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CredentialSubmitIntlResponseBodyResult self = new CredentialSubmitIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CredentialSubmitIntlResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
