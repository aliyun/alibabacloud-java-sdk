// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetSubscriptionDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetSubscriptionDetailResponseBodyData data;

    public static GetSubscriptionDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubscriptionDetailResponseBody self = new GetSubscriptionDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubscriptionDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubscriptionDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubscriptionDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubscriptionDetailResponseBody setData(GetSubscriptionDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubscriptionDetailResponseBodyData getData() {
        return this.data;
    }

    public static class GetSubscriptionDetailResponseBodyData extends TeaModel {
        @NameInMap("PhoneNo")
        public String phoneNo;

        @NameInMap("City")
        public String city;

        @NameInMap("SwitchStatus")
        public Integer switchStatus;

        @NameInMap("SubsId")
        public Long subsId;

        @NameInMap("SecretNo")
        public String secretNo;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("Province")
        public String province;

        public static GetSubscriptionDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubscriptionDetailResponseBodyData self = new GetSubscriptionDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubscriptionDetailResponseBodyData setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public String getPhoneNo() {
            return this.phoneNo;
        }

        public GetSubscriptionDetailResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetSubscriptionDetailResponseBodyData setSwitchStatus(Integer switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public Integer getSwitchStatus() {
            return this.switchStatus;
        }

        public GetSubscriptionDetailResponseBodyData setSubsId(Long subsId) {
            this.subsId = subsId;
            return this;
        }
        public Long getSubsId() {
            return this.subsId;
        }

        public GetSubscriptionDetailResponseBodyData setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public GetSubscriptionDetailResponseBodyData setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public GetSubscriptionDetailResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
