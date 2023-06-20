// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetPhoneNumberIdentificationUrlResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPhoneNumberIdentificationUrlResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("IdentificationUrl")
        public String identificationUrl;

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
