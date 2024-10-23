// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetVerificationInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B182C041-8C64-5F2F-A07B-FC67FAF89CF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityEmailDevice")
    public GetVerificationInfoResponseBodySecurityEmailDevice securityEmailDevice;

    @NameInMap("SecurityPhoneDevice")
    public GetVerificationInfoResponseBodySecurityPhoneDevice securityPhoneDevice;

    public static GetVerificationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVerificationInfoResponseBody self = new GetVerificationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVerificationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVerificationInfoResponseBody setSecurityEmailDevice(GetVerificationInfoResponseBodySecurityEmailDevice securityEmailDevice) {
        this.securityEmailDevice = securityEmailDevice;
        return this;
    }
    public GetVerificationInfoResponseBodySecurityEmailDevice getSecurityEmailDevice() {
        return this.securityEmailDevice;
    }

    public GetVerificationInfoResponseBody setSecurityPhoneDevice(GetVerificationInfoResponseBodySecurityPhoneDevice securityPhoneDevice) {
        this.securityPhoneDevice = securityPhoneDevice;
        return this;
    }
    public GetVerificationInfoResponseBodySecurityPhoneDevice getSecurityPhoneDevice() {
        return this.securityPhoneDevice;
    }

    public static class GetVerificationInfoResponseBodySecurityEmailDevice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetVerificationInfoResponseBodySecurityEmailDevice build(java.util.Map<String, ?> map) throws Exception {
            GetVerificationInfoResponseBodySecurityEmailDevice self = new GetVerificationInfoResponseBodySecurityEmailDevice();
            return TeaModel.build(map, self);
        }

        public GetVerificationInfoResponseBodySecurityEmailDevice setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetVerificationInfoResponseBodySecurityEmailDevice setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetVerificationInfoResponseBodySecurityPhoneDevice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <strong>example:</strong>
         * <p>13900001234</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetVerificationInfoResponseBodySecurityPhoneDevice build(java.util.Map<String, ?> map) throws Exception {
            GetVerificationInfoResponseBodySecurityPhoneDevice self = new GetVerificationInfoResponseBodySecurityPhoneDevice();
            return TeaModel.build(map, self);
        }

        public GetVerificationInfoResponseBodySecurityPhoneDevice setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public GetVerificationInfoResponseBodySecurityPhoneDevice setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetVerificationInfoResponseBodySecurityPhoneDevice setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
