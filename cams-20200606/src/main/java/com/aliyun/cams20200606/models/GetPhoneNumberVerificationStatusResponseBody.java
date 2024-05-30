// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneNumberVerificationStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](https://help.aliyun.com/document_detail/196974.html).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetPhoneNumberVerificationStatusResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The verification status.</p>
         */
        @NameInMap("CodeVerificationStatus")
        public String codeVerificationStatus;

        /**
         * <p>The ID of the number.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The phone number.</p>
         */
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
