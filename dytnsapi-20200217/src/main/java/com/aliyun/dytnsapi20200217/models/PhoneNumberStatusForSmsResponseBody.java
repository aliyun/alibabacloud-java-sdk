// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForSmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PhoneNumberStatusForSmsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForSmsResponseBody self = new PhoneNumberStatusForSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForSmsResponseBody setData(PhoneNumberStatusForSmsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForSmsResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForSmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForSmsResponseBodyData extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForSmsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForSmsResponseBodyData self = new PhoneNumberStatusForSmsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForSmsResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForSmsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
