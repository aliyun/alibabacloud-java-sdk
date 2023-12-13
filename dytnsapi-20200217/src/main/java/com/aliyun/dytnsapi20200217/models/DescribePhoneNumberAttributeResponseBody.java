// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAttributeResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   **OK**: The request is successful.</p>
     * <p>*   **InvalidParameter**: The specified phone number is invalid or the parameter format is invalid.</p>
     * <p>*   **PhoneNumberNotfound**: No attribute information can be found for the specified phone number.</p>
     * <p>*   **isp.UNKNOWN**: An unknown exception occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The attribute information about the phone number.</p>
     */
    @NameInMap("PhoneNumberAttribute")
    public DescribePhoneNumberAttributeResponseBodyPhoneNumberAttribute phoneNumberAttribute;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The basic carrier. Valid values:</p>
         * <br>
         * <p>*   **China Mobile**</p>
         * <p>*   **China Unicom**</p>
         * <p>*   **China Telecom**</p>
         */
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        /**
         * <p>The actual carrier, including the virtual network operator (VNO). If the phone number involves mobile number portability, the value of this parameter is the carrier after mobile number portability.</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The city where the phone number is registered.</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>Indicates whether the phone number involves mobile number portability. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsNumberPortability")
        public Boolean isNumberPortability;

        /**
         * <p>The number segment to which the phone number belongs.</p>
         */
        @NameInMap("NumberSegment")
        public Long numberSegment;

        /**
         * <p>The province where the phone number is registered.</p>
         */
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
