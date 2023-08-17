// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPreValidatePhoneIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPreValidatePhoneIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPreValidatePhoneIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPreValidatePhoneIdResponseBody self = new GetPreValidatePhoneIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPreValidatePhoneIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPreValidatePhoneIdResponseBody setData(GetPreValidatePhoneIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPreValidatePhoneIdResponseBodyData getData() {
        return this.data;
    }

    public GetPreValidatePhoneIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPreValidatePhoneIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPreValidatePhoneIdResponseBodyData extends TeaModel {
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("PhoneNumberId")
        public String phoneNumberId;

        public static GetPreValidatePhoneIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPreValidatePhoneIdResponseBodyData self = new GetPreValidatePhoneIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPreValidatePhoneIdResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetPreValidatePhoneIdResponseBodyData setPhoneNumberId(String phoneNumberId) {
            this.phoneNumberId = phoneNumberId;
            return this;
        }
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

    }

}
