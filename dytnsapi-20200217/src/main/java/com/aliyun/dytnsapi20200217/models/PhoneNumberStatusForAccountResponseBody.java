// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PhoneNumberStatusForAccountResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForAccountResponseBody self = new PhoneNumberStatusForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForAccountResponseBody setData(PhoneNumberStatusForAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForAccountResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForAccountResponseBodyData extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForAccountResponseBodyData self = new PhoneNumberStatusForAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForAccountResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForAccountResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
