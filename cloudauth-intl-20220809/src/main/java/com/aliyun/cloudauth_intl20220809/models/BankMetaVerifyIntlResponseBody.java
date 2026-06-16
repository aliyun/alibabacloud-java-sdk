// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class BankMetaVerifyIntlResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success. Other values indicate failure.</p>
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
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information.</p>
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
         * <p>The verification result code. Valid values:</p>
         * <ul>
         * <li>1: Verification consistent (billable).</li>
         * <li>2: Verification inconsistent (billable).</li>
         * <li>3: No record found (not billable).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The verification details. Valid values:</p>
         * <ul>
         * <li><strong>101</strong>: Verification passed.</li>
         * <li><strong>201</strong>: Authentication information inconsistent. The cardholder information is incorrect.</li>
         * <li><strong>202</strong>: Authentication information inconsistent. The bank card has not enabled authenticated payment.</li>
         * <li><strong>203</strong>: Authentication information inconsistent. The bank card has expired.</li>
         * <li><strong>204</strong>: Authentication information inconsistent. The bank card is restricted.</li>
         * <li><strong>205</strong>: Authentication information inconsistent. The card has been confiscated.</li>
         * <li><strong>206</strong>: Authentication information inconsistent. The bank card is invalid.</li>
         * <li><strong>207</strong>: Authentication information inconsistent. No issuing bank found for this card.</li>
         * <li><strong>208</strong>: Authentication information inconsistent. The card is not initialized or is a dormant card.</li>
         * <li><strong>209</strong>: Authentication information inconsistent. The card is a fraudulent or retained card.</li>
         * <li><strong>210</strong>: Authentication information inconsistent. The card has been reported lost.</li>
         * <li><strong>211</strong>: Authentication information inconsistent. The number of incorrect password attempts has exceeded the limit.</li>
         * <li><strong>212</strong>: Authentication information inconsistent. The issuing bank does not support this transaction.</li>
         * <li><strong>213</strong>: Authentication information inconsistent. The card status is abnormal or the card is invalid.</li>
         * <li><strong>214</strong>: Authentication information inconsistent. No phone number is registered with the card.</li>
         * <li><strong>215</strong>: Authentication information inconsistent. The password, expiration date, or CVN2 is incorrect.</li>
         * <li><strong>216</strong>: Authentication information inconsistent. Other card exceptions.</li>
         * <li><strong>301</strong>: Verification unavailable. The bank card does not support this service.</li>
         * <li><strong>302</strong>: Verification unavailable. Verification failed or the bank rejected the verification. Contact the issuing bank.</li>
         * <li><strong>303</strong>: Verification unavailable. The bank card does not currently support phone number verification.</li>
         * <li><strong>304</strong>: Verification unavailable. The bank card number is incorrect.</li>
         * <li><strong>305</strong>: Verification unavailable. Other reasons.</li>
         * <li><strong>306</strong>: Verification unavailable. The number of verification attempts has exceeded the limit.</li>
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
