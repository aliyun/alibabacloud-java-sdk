// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class BankMetaVerifyIntlResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public BankMetaVerifyIntlResponseBodyResultObject resultObject;

    public static BankMetaVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BankMetaVerifyIntlResponseBody self = new BankMetaVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public BankMetaVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BankMetaVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BankMetaVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BankMetaVerifyIntlResponseBody setResultObject(BankMetaVerifyIntlResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public BankMetaVerifyIntlResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class BankMetaVerifyIntlResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result code.</p>
         * <ul>
         * <li>1: Consistent (charged)</li>
         * <li>2: Inconsistent (charged)</li>
         * <li>3: No record found (not charged)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>Verification details:</p>
         * <ul>
         * <li><strong>101</strong>: Verification passed.</li>
         * <li><strong>201</strong>: Authentication information does not match, cardholder information is incorrect.</li>
         * <li><strong>202</strong>: Authentication information does not match, bank card has not been activated for authenticated payments.</li>
         * <li><strong>203</strong>: Authentication information does not match, bank card has expired.</li>
         * <li><strong>204</strong>: Authentication information does not match, bank card is a restricted card.</li>
         * <li><strong>205</strong>: Authentication information does not match, this card has been confiscated.</li>
         * <li><strong>206</strong>: Authentication information does not match, bank card is invalid.</li>
         * <li><strong>207</strong>: Authentication information does not match, this card has no corresponding issuing bank.</li>
         * <li><strong>208</strong>: Authentication information does not match, this card is uninitialized or dormant.</li>
         * <li><strong>209</strong>: Authentication information does not match, this card is a cheating card or swallowed card.</li>
         * <li><strong>210</strong>: Authentication information does not match, this card has been reported lost.</li>
         * <li><strong>211</strong>: Authentication information does not match, password error limit exceeded.</li>
         * <li><strong>212</strong>: Authentication information does not match, issuing bank does not support this transaction.</li>
         * <li><strong>213</strong>: Authentication information does not match, card status is abnormal or card is invalid.</li>
         * <li><strong>214</strong>: Authentication information does not match, no phone number reserved.</li>
         * <li><strong>215</strong>: Authentication information does not match, entered password, expiration date, or CVN2 is incorrect.</li>
         * <li><strong>216</strong>: Authentication information does not match, other card anomalies.</li>
         * <li><strong>301</strong>: Unable to verify, bank card does not support this service.</li>
         * <li><strong>302</strong>: Unable to verify, verification failed or bank refused verification, please contact the issuing bank.</li>
         * <li><strong>303</strong>: Unable to verify, bank card does not currently support phone number verification.</li>
         * <li><strong>304</strong>: Unable to verify, bank card number is incorrect.</li>
         * <li><strong>305</strong>: Unable to verify, other reasons.</li>
         * <li><strong>306</strong>: Unable to verify, verification attempt limit exceeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static BankMetaVerifyIntlResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            BankMetaVerifyIntlResponseBodyResultObject self = new BankMetaVerifyIntlResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public BankMetaVerifyIntlResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public BankMetaVerifyIntlResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
