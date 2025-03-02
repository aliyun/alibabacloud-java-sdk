// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetPhoneNumberIdentificationUrlResponseBody extends TeaModel {
    /**
     * <p>The return code. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The request is successful.</li>
     * <li><strong>IdentificationNotAvailable</strong>: The verification system does not support the phone number that corresponds to the IP address.</li>
     * <li><strong>MobileNumberIllegal</strong>: The format of the phone number is invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetPhoneNumberIdentificationUrlResponseBodyData data;

    /**
     * <p>The description of the return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD******177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPhoneNumberIdentificationUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberIdentificationUrlResponseBody self = new GetPhoneNumberIdentificationUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberIdentificationUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhoneNumberIdentificationUrlResponseBody setData(GetPhoneNumberIdentificationUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPhoneNumberIdentificationUrlResponseBodyData getData() {
        return this.data;
    }

    public GetPhoneNumberIdentificationUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhoneNumberIdentificationUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPhoneNumberIdentificationUrlResponseBodyData extends TeaModel {
        /**
         * <p>The verification URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://global-ip-auth.dycpaas.com/global/biz/ip_auth/start?ipa_s_c_c=IPF0000000000000******&ipa_s_i=8636b75e2fcb40c53ffecc2b59">https://global-ip-auth.dycpaas.com/global/biz/ip_auth/start?ipa_s_c_c=IPF0000000000000******&amp;ipa_s_i=8636b75e2fcb40c53ffecc2b59</a>******</p>
         */
        @NameInMap("IdentificationUrl")
        public String identificationUrl;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8636b75e2fcb40c53ffecc2b5947115c.149b03d2a7494e6e8f5b34c915245815.707c7f0d93f4409db0761aa5da94ce01.1686******041</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static GetPhoneNumberIdentificationUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneNumberIdentificationUrlResponseBodyData self = new GetPhoneNumberIdentificationUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPhoneNumberIdentificationUrlResponseBodyData setIdentificationUrl(String identificationUrl) {
            this.identificationUrl = identificationUrl;
            return this;
        }
        public String getIdentificationUrl() {
            return this.identificationUrl;
        }

        public GetPhoneNumberIdentificationUrlResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
