// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialSubmitIntlV2ResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7F971622-38C0-5F56-B2EC-315367979B4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public CredentialSubmitIntlV2ResponseBodyResult result;

    public static CredentialSubmitIntlV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialSubmitIntlV2ResponseBody self = new CredentialSubmitIntlV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialSubmitIntlV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialSubmitIntlV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialSubmitIntlV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialSubmitIntlV2ResponseBody setResult(CredentialSubmitIntlV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CredentialSubmitIntlV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class CredentialSubmitIntlV2ResponseBodyResult extends TeaModel {
        /**
         * <p>The unique identifier of the verification request.</p>
         * 
         * <strong>example:</strong>
         * <p>hk573be80f944d95ac812e0*******a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static CredentialSubmitIntlV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CredentialSubmitIntlV2ResponseBodyResult self = new CredentialSubmitIntlV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CredentialSubmitIntlV2ResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
