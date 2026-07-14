// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneNumberVerificationStatusResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>A value of OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
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
    public GetPhoneNumberVerificationStatusResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPhoneNumberVerificationStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberVerificationStatusResponseBody self = new GetPhoneNumberVerificationStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberVerificationStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
         * 
         * <strong>example:</strong>
         * <p>VERIFIED</p>
         */
        @NameInMap("CodeVerificationStatus")
        public String codeVerificationStatus;

        /**
         * <p>The ID of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>222434****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>861390000****</p>
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
