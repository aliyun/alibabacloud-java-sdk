// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSubscriptionDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public GetSubscriptionDetailResponseData data;

    public static GetSubscriptionDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionDetailResponse self = new GetSubscriptionDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionDetailResponse setData(GetSubscriptionDetailResponseData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionDetailResponseData getData() {
        return this.data;
    }

    public static class GetSubscriptionDetailResponseData extends TeaModel {
        @NameInMap("SubsId")
        @Validation(required = true)
        public Long subsId;

        @NameInMap("SecretNo")
        @Validation(required = true)
        public String secretNo;

        @NameInMap("PhoneNo")
        @Validation(required = true)
        public String phoneNo;

        @NameInMap("SwitchStatus")
        @Validation(required = true)
        public Integer switchStatus;

        @NameInMap("Province")
        @Validation(required = true)
        public String province;

        @NameInMap("City")
        @Validation(required = true)
        public String city;

        @NameInMap("Vendor")
        @Validation(required = true)
        public String vendor;

        public static GetSubscriptionDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionDetailResponseData self = new GetSubscriptionDetailResponseData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionDetailResponseData setSubsId(Long subsId) {
            this.subsId = subsId;
            return this;
        }
        public Long getSubsId() {
            return this.subsId;
        }

        public GetSubscriptionDetailResponseData setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public GetSubscriptionDetailResponseData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public GetSubscriptionDetailResponseData setSwitchStatus(Integer switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public Integer getSwitchStatus() {
            return this.switchStatus;
        }

        public GetSubscriptionDetailResponseData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetSubscriptionDetailResponseData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetSubscriptionDetailResponseData setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
