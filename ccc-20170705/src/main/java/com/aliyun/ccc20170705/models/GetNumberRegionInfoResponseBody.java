// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetNumberRegionInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PhoneNumber")
    public GetNumberRegionInfoResponseBodyPhoneNumber phoneNumber;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetNumberRegionInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNumberRegionInfoResponseBody self = new GetNumberRegionInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNumberRegionInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNumberRegionInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNumberRegionInfoResponseBody setPhoneNumber(GetNumberRegionInfoResponseBodyPhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public GetNumberRegionInfoResponseBodyPhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetNumberRegionInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNumberRegionInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNumberRegionInfoResponseBodyPhoneNumber extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static GetNumberRegionInfoResponseBodyPhoneNumber build(java.util.Map<String, ?> map) throws Exception {
            GetNumberRegionInfoResponseBodyPhoneNumber self = new GetNumberRegionInfoResponseBodyPhoneNumber();
            return TeaModel.build(map, self);
        }

        public GetNumberRegionInfoResponseBodyPhoneNumber setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public GetNumberRegionInfoResponseBodyPhoneNumber setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetNumberRegionInfoResponseBodyPhoneNumber setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
