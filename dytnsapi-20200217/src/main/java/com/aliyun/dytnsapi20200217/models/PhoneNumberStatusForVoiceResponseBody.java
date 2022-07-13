// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForVoiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PhoneNumberStatusForVoiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForVoiceResponseBody self = new PhoneNumberStatusForVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForVoiceResponseBody setData(PhoneNumberStatusForVoiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForVoiceResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForVoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForVoiceResponseBodyData extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForVoiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForVoiceResponseBodyData self = new PhoneNumberStatusForVoiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForVoiceResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForVoiceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
