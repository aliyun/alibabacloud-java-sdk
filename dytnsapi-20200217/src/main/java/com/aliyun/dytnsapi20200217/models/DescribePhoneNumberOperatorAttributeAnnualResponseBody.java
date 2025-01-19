// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeAnnualResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberOperatorAttributeAnnualResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribePhoneNumberOperatorAttributeAnnualResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeAnnualResponseBody self = new DescribePhoneNumberOperatorAttributeAnnualResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeAnnualResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberOperatorAttributeAnnualResponseBody setData(DescribePhoneNumberOperatorAttributeAnnualResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberOperatorAttributeAnnualResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberOperatorAttributeAnnualResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberOperatorAttributeAnnualResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhoneNumberOperatorAttributeAnnualResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePhoneNumberOperatorAttributeAnnualResponseBodyData extends TeaModel {
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("City")
        public String city;

        @NameInMap("Mts")
        public String mts;

        @NameInMap("NumberPortability")
        public Boolean numberPortability;

        @NameInMap("Province")
        public String province;

        public static DescribePhoneNumberOperatorAttributeAnnualResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberOperatorAttributeAnnualResponseBodyData self = new DescribePhoneNumberOperatorAttributeAnnualResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberOperatorAttributeAnnualResponseBodyData setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public DescribePhoneNumberOperatorAttributeAnnualResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribePhoneNumberOperatorAttributeAnnualResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribePhoneNumberOperatorAttributeAnnualResponseBodyData setMts(String mts) {
            this.mts = mts;
            return this;
        }
        public String getMts() {
            return this.mts;
        }

        public DescribePhoneNumberOperatorAttributeAnnualResponseBodyData setNumberPortability(Boolean numberPortability) {
            this.numberPortability = numberPortability;
            return this;
        }
        public Boolean getNumberPortability() {
            return this.numberPortability;
        }

        public DescribePhoneNumberOperatorAttributeAnnualResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
