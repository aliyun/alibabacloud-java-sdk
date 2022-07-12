// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberOperatorAttributeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberOperatorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeResponseBody self = new DescribePhoneNumberOperatorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberOperatorAttributeResponseBody setData(DescribePhoneNumberOperatorAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberOperatorAttributeResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberOperatorAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberOperatorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberOperatorAttributeResponseBodyData extends TeaModel {
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("City")
        public String city;

        @NameInMap("IsNumberPortability")
        public Boolean isNumberPortability;

        @NameInMap("NumberSegment")
        public Long numberSegment;

        @NameInMap("Province")
        public String province;

        public static DescribePhoneNumberOperatorAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberOperatorAttributeResponseBodyData self = new DescribePhoneNumberOperatorAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberOperatorAttributeResponseBodyData setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public DescribePhoneNumberOperatorAttributeResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribePhoneNumberOperatorAttributeResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribePhoneNumberOperatorAttributeResponseBodyData setIsNumberPortability(Boolean isNumberPortability) {
            this.isNumberPortability = isNumberPortability;
            return this;
        }
        public Boolean getIsNumberPortability() {
            return this.isNumberPortability;
        }

        public DescribePhoneNumberOperatorAttributeResponseBodyData setNumberSegment(Long numberSegment) {
            this.numberSegment = numberSegment;
            return this;
        }
        public Long getNumberSegment() {
            return this.numberSegment;
        }

        public DescribePhoneNumberOperatorAttributeResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
