// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForPublicResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PhoneNumberStatusForPublicResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PhoneNumberStatusForPublicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForPublicResponseBody self = new PhoneNumberStatusForPublicResponseBody();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForPublicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PhoneNumberStatusForPublicResponseBody setData(PhoneNumberStatusForPublicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PhoneNumberStatusForPublicResponseBodyData getData() {
        return this.data;
    }

    public PhoneNumberStatusForPublicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PhoneNumberStatusForPublicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PhoneNumberStatusForPublicResponseBodyData extends TeaModel {
        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("Status")
        public String status;

        public static PhoneNumberStatusForPublicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PhoneNumberStatusForPublicResponseBodyData self = new PhoneNumberStatusForPublicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PhoneNumberStatusForPublicResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public PhoneNumberStatusForPublicResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
