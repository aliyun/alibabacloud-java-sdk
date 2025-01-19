// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeAnnualUseResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberOperatorAttributeAnnualUseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeAnnualUseResponseBody self = new DescribePhoneNumberOperatorAttributeAnnualUseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBody setData(DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberOperatorAttributeAnnualUseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData extends TeaModel {
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

        public static DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData self = new DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData setIsNumberPortability(Boolean isNumberPortability) {
            this.isNumberPortability = isNumberPortability;
            return this;
        }
        public Boolean getIsNumberPortability() {
            return this.isNumberPortability;
        }

        public DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData setNumberSegment(Long numberSegment) {
            this.numberSegment = numberSegment;
            return this;
        }
        public Long getNumberSegment() {
            return this.numberSegment;
        }

        public DescribePhoneNumberOperatorAttributeAnnualUseResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
