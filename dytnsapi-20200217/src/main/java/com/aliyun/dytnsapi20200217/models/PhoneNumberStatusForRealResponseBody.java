// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForRealResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PhoneNumberStatusForRealResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForRealResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForRealResponseBody self = new PhoneNumberStatusForRealResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForRealResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForRealResponseBody setData(PhoneNumberStatusForRealResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForRealResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForRealResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForRealResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForRealResponseBodyData extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForRealResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForRealResponseBodyData self = new PhoneNumberStatusForRealResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForRealResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForRealResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
