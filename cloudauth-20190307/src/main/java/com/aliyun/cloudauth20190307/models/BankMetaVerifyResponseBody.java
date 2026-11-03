// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class BankMetaVerifyResponseBody extends TeaModel {
    /**
     * <p>The response code. 200 indicates success. Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-A***B-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The verification result.</p>
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
         * <p>The verification result.</p>
         * <ul>
         * <li>1: verification passed (billed).</li>
         * <li>2: verification failed (billed).</li>
         * <li>3: no records found (not billed).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The verification details.</p>
         * <ul>
         * <li><strong>101</strong>: verification passed.</li>
         * <li><strong>201</strong>: verification failed. The cardholder information is incorrect.</li>
         * <li><strong>202</strong>: verification failed. Authentication payment is not enabled for the bank card.</li>
         * <li><strong>203</strong>: verification failed. The bank card has expired.</li>
         * <li><strong>204</strong>: verification failed. The bank card is restricted.</li>
         * <li><strong>205</strong>: verification failed. The card has been confiscated.</li>
         * <li><strong>206</strong>: verification failed. The bank card is invalid.</li>
         * <li><strong>207</strong>: verification failed. No matching issuing bank exists.</li>
         * <li><strong>208</strong>: verification failed. The card is not initialized or is a dormant card.</li>
         * <li><strong>209</strong>: verification failed. The card is fraudulent or has been retained.</li>
         * <li><strong>210</strong>: verification failed. The card has been reported lost.</li>
         * <li><strong>211</strong>: verification failed. The maximum number of password attempts has been exceeded.</li>
         * <li><strong>212</strong>: verification failed. The issuing bank does not support this transaction.</li>
         * <li><strong>213</strong>: verification failed. The card status is abnormal or the card is invalid.</li>
         * <li><strong>214</strong>: verification failed. No mobile phone number is registered.</li>
         * <li><strong>215</strong>: verification failed. The password, expiration date, or CVN2 is incorrect.</li>
         * <li><strong>216</strong>: verification failed. Other card exceptions.</li>
         * <li><strong>301</strong>: unable to verify. The bank card does not support this service.</li>
         * <li><strong>302</strong>: unable to verify. Verification failed or the bank refused verification. Contact the issuing bank.</li>
         * <li><strong>303</strong>: unable to verify. The bank card does not support mobile phone number verification.</li>
         * <li><strong>304</strong>: unable to verify. The bank card number is incorrect.</li>
         * <li><strong>305</strong>: unable to verify. Other reasons.</li>
         * <li><strong>306</strong>: unable to verify. The maximum number of verification attempts has been exceeded.</li>
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
