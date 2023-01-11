// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneNumberVerificationStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPhoneNumberVerificationStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPhoneNumberVerificationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberVerificationStatusResponseBody self = new GetPhoneNumberVerificationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberVerificationStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhoneNumberVerificationStatusResponseBody setData(GetPhoneNumberVerificationStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPhoneNumberVerificationStatusResponseBodyData getData() {
        return this.data;
    }

    public GetPhoneNumberVerificationStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhoneNumberVerificationStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPhoneNumberVerificationStatusResponseBodyData extends TeaModel {
        @NameInMap("CodeVerificationStatus")
        public String codeVerificationStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        public static GetPhoneNumberVerificationStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPhoneNumberVerificationStatusResponseBodyData self = new GetPhoneNumberVerificationStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPhoneNumberVerificationStatusResponseBodyData setCodeVerificationStatus(String codeVerificationStatus) {
            this.codeVerificationStatus = codeVerificationStatus;
            return this;
        }
        public String getCodeVerificationStatus() {
            return this.codeVerificationStatus;
        }

        public GetPhoneNumberVerificationStatusResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhoneNumberVerificationStatusResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

    }

}
