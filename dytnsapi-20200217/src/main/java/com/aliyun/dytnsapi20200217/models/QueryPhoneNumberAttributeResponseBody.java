// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPhoneNumberAttributeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PhoneNumberAttribute")
    public QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute phoneNumberAttribute;

    @NameInMap("Code")
    public String code;

    public static QueryPhoneNumberAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNumberAttributeResponseBody self = new QueryPhoneNumberAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNumberAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPhoneNumberAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPhoneNumberAttributeResponseBody setPhoneNumberAttribute(QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute phoneNumberAttribute) {
        this.phoneNumberAttribute = phoneNumberAttribute;
        return this;
    }
    public QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute getPhoneNumberAttribute() {
        return this.phoneNumberAttribute;
    }

    public QueryPhoneNumberAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute extends TeaModel {
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        @NameInMap("Carrier")
        public String carrier;

        @NameInMap("IsNumberPortability")
        public Boolean isNumberPortability;

        @NameInMap("NumberSegment")
        public Long numberSegment;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute self = new QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute();
            return TeaModel.build(map, self);
        }

        public QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute setIsNumberPortability(Boolean isNumberPortability) {
            this.isNumberPortability = isNumberPortability;
            return this;
        }
        public Boolean getIsNumberPortability() {
            return this.isNumberPortability;
        }

        public QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute setNumberSegment(Long numberSegment) {
            this.numberSegment = numberSegment;
            return this;
        }
        public Long getNumberSegment() {
            return this.numberSegment;
        }

        public QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryPhoneNumberAttributeResponseBodyPhoneNumberAttribute setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
