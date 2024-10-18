// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyMobileResponseBody extends TeaModel {
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
    @NameInMap("GateVerifyResultDTO")
    public VerifyMobileResponseBodyGateVerifyResultDTO gateVerifyResultDTO;

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

    public static VerifyMobileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyMobileResponseBody self = new VerifyMobileResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyMobileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyMobileResponseBody setGateVerifyResultDTO(VerifyMobileResponseBodyGateVerifyResultDTO gateVerifyResultDTO) {
        this.gateVerifyResultDTO = gateVerifyResultDTO;
        return this;
    }
    public VerifyMobileResponseBodyGateVerifyResultDTO getGateVerifyResultDTO() {
        return this.gateVerifyResultDTO;
    }

    public VerifyMobileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyMobileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyMobileResponseBodyGateVerifyResultDTO extends TeaModel {
        /**
         * <p>The verification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>121343241</p>
         */
        @NameInMap("VerifyId")
        public String verifyId;

        /**
         * <p>The verification results. Valid values:</p>
         * <ul>
         * <li><strong>PASS: The input phone number is consistent with the phone number that you use.</strong></li>
         * <li><strong>REJECT: The input phone number is different from the phone number that you use.</strong></li>
         * <li>**UNKNOWN: The system cannot judge whether the input phone number is consistent with the phone number that you use.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static VerifyMobileResponseBodyGateVerifyResultDTO build(java.util.Map<String, ?> map) throws Exception {
            VerifyMobileResponseBodyGateVerifyResultDTO self = new VerifyMobileResponseBodyGateVerifyResultDTO();
            return TeaModel.build(map, self);
        }

        public VerifyMobileResponseBodyGateVerifyResultDTO setVerifyId(String verifyId) {
            this.verifyId = verifyId;
            return this;
        }
        public String getVerifyId() {
            return this.verifyId;
        }

        public VerifyMobileResponseBodyGateVerifyResultDTO setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
