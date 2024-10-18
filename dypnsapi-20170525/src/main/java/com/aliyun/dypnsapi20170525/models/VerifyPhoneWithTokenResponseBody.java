// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyPhoneWithTokenResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</li>
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
    @NameInMap("GateVerify")
    public VerifyPhoneWithTokenResponseBodyGateVerify gateVerify;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8906582E-6722</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyPhoneWithTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyPhoneWithTokenResponseBody self = new VerifyPhoneWithTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyPhoneWithTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyPhoneWithTokenResponseBody setGateVerify(VerifyPhoneWithTokenResponseBodyGateVerify gateVerify) {
        this.gateVerify = gateVerify;
        return this;
    }
    public VerifyPhoneWithTokenResponseBodyGateVerify getGateVerify() {
        return this.gateVerify;
    }

    public VerifyPhoneWithTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyPhoneWithTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyPhoneWithTokenResponseBodyGateVerify extends TeaModel {
        /**
         * <p>The external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12134****</p>
         */
        @NameInMap("VerifyId")
        public String verifyId;

        /**
         * <p>The verification results. Valid values:</p>
         * <ul>
         * <li>PASS: The input phone number is consistent with the phone number used in HTML5 pages.</li>
         * <li>REJECT: The input phone number is different from the phone number used in HTML5 pages.</li>
         * <li>UNKNOWN: The system cannot judge whether the input phone number is consistent with the phone number used in HTML5 pages.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static VerifyPhoneWithTokenResponseBodyGateVerify build(java.util.Map<String, ?> map) throws Exception {
            VerifyPhoneWithTokenResponseBodyGateVerify self = new VerifyPhoneWithTokenResponseBodyGateVerify();
            return TeaModel.build(map, self);
        }

        public VerifyPhoneWithTokenResponseBodyGateVerify setVerifyId(String verifyId) {
            this.verifyId = verifyId;
            return this;
        }
        public String getVerifyId() {
            return this.verifyId;
        }

        public VerifyPhoneWithTokenResponseBodyGateVerify setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
