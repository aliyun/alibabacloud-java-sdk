// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class BankMetaVerifyResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
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
     * <p>473469C7-A***B-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public BankMetaVerifyResponseBodyResultObject resultObject;

    public static BankMetaVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BankMetaVerifyResponseBody self = new BankMetaVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public BankMetaVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BankMetaVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BankMetaVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BankMetaVerifyResponseBody setResultObject(BankMetaVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public BankMetaVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class BankMetaVerifyResponseBodyResultObject extends TeaModel {
        /**
         * <p>Verification result.</p>
         * <ul>
         * <li>1: Consistent (billable)</li>
         * <li>2: Inconsistent (billable)</li>
         * <li>3: No record found (non-billable)</li>
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
         * <li><strong>202</strong>: Authentication information does not match, bank card has not enabled authentication payment.</li>
         * <li><strong>203</strong>: Authentication information does not match, bank card has expired.</li>
         * <li><strong>204</strong>: Authentication information does not match, bank card is a restricted card.</li>
         * <li><strong>205</strong>: Authentication information does not match, this card has been confiscated.</li>
         * <li><strong>206</strong>: Authentication information does not match, bank card is invalid.</li>
         * <li><strong>207</strong>: Authentication information does not match, this card has no corresponding issuing bank.</li>
         * <li><strong>208</strong>: Authentication information does not match, the card is uninitialized or a dormant card.</li>
         * <li><strong>209</strong>: Authentication information does not match, this card is a cheating card or swallowed card.</li>
         * <li><strong>210</strong>: Authentication information does not match, this card has been reported lost.</li>
         * <li><strong>211</strong>: Authentication information does not match, the number of password errors exceeds the limit.</li>
         * <li><strong>212</strong>: Authentication information does not match, the issuing bank does not support this transaction.</li>
         * <li><strong>213</strong>: Authentication information does not match, the card status is abnormal or the card is invalid.</li>
         * <li><strong>214</strong>: Authentication information does not match, no mobile phone number reserved.</li>
         * <li><strong>215</strong>: Authentication information does not match, the entered password, expiration date, or CVN2 is incorrect.</li>
         * <li><strong>216</strong>: Authentication information does not match, other card anomalies.</li>
         * <li><strong>301</strong>: Unable to verify, the bank card does not support this service.</li>
         * <li><strong>302</strong>: Unable to verify, verification failed or the bank refused to verify, please contact the issuing bank.</li>
         * <li><strong>303</strong>: Unable to verify, the bank card does not currently support mobile phone number verification.</li>
         * <li><strong>304</strong>: Unable to verify, the bank card number is incorrect.</li>
         * <li><strong>305</strong>: Unable to verify, other reasons.</li>
         * <li><strong>306</strong>: Unable to verify, the number of verifications exceeds the limit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static BankMetaVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            BankMetaVerifyResponseBodyResultObject self = new BankMetaVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public BankMetaVerifyResponseBodyResultObject setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public BankMetaVerifyResponseBodyResultObject setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
