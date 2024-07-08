// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberOperatorAttributeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li><strong>OK</strong>: The request is successful.</li>
     * <li><strong>InvalidParameter</strong>: The specified phone number is invalid or the parameter format is invalid.</li>
     * <li><strong>PhoneNumberNotfound</strong>: No attribute information can be found for the specified phone number.</li>
     * <li><strong>isp.UNKNOWN</strong>: An unknown exception occurred.</li>
     * <li><strong>RequestFrequencyLimit</strong>: Repeated queries for the same phone number at a high frequency within a short period of time are prohibited due to restrictions that are set by carriers. If this error code is returned, please try again later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public DescribePhoneNumberOperatorAttributeResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD135850177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberOperatorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberOperatorAttributeResponseBody self = new DescribePhoneNumberOperatorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberOperatorAttributeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The basic carrier. Valid values:</p>
         * <ul>
         * <li><strong>China Mobile</strong></li>
         * <li><strong>China Unicom</strong></li>
         * <li><strong>China Telecom</strong></li>
         * <li><strong>China Broadnet</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>China Mobile</p>
         */
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        /**
         * <p>The actual carrier, including the virtual network operator (VNO). If the phone number involves mobile number portability, the value of this parameter is the carrier after mobile number portability.</p>
         * 
         * <strong>example:</strong>
         * <p>China Mobile</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <p>The city where the phone number is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>Indicates whether the phone number involves mobile number portability. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsNumberPortability")
        public Boolean isNumberPortability;

        /**
         * <p>The number segment to which the phone number belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>139</p>
         */
        @NameInMap("NumberSegment")
        public Long numberSegment;

        /**
         * <p>The province where the phone number is registered.</p>
         * 
         * <strong>example:</strong>
         * <p>zhejiang</p>
         */
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
