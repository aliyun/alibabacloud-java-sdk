// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PhoneNumberAttribute")
    public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute phoneNumberAttribute;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAttributeResponseBody self = new DescribePhoneNumberAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberAttributeResponseBody setPhoneNumberAttribute(DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute phoneNumberAttribute) {
        this.phoneNumberAttribute = phoneNumberAttribute;
        return this;
    }
    public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute getPhoneNumberAttribute() {
        return this.phoneNumberAttribute;
    }

    public DescribePhoneNumberAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute extends TeaModel {
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

        public static DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute self = new DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute setIsNumberPortability(Boolean isNumberPortability) {
            this.isNumberPortability = isNumberPortability;
            return this;
        }
        public Boolean getIsNumberPortability() {
            return this.isNumberPortability;
        }

        public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute setNumberSegment(Long numberSegment) {
            this.numberSegment = numberSegment;
            return this;
        }
        public Long getNumberSegment() {
            return this.numberSegment;
        }

        public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
