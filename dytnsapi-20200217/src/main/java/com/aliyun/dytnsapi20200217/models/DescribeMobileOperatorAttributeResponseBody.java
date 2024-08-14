// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeMobileOperatorAttributeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeMobileOperatorAttributeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMobileOperatorAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileOperatorAttributeResponseBody self = new DescribeMobileOperatorAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMobileOperatorAttributeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeMobileOperatorAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMobileOperatorAttributeResponseBody setData(DescribeMobileOperatorAttributeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMobileOperatorAttributeResponseBodyData getData() {
        return this.data;
    }

    public DescribeMobileOperatorAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMobileOperatorAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMobileOperatorAttributeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("BasicCarrier")
        public String basicCarrier;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsNumberPortability")
        public Boolean isNumberPortability;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("RealNumber")
        public String realNumber;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SegmentCarrier")
        public String segmentCarrier;

        public static DescribeMobileOperatorAttributeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMobileOperatorAttributeResponseBodyData self = new DescribeMobileOperatorAttributeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMobileOperatorAttributeResponseBodyData setBasicCarrier(String basicCarrier) {
            this.basicCarrier = basicCarrier;
            return this;
        }
        public String getBasicCarrier() {
            return this.basicCarrier;
        }

        public DescribeMobileOperatorAttributeResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribeMobileOperatorAttributeResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeMobileOperatorAttributeResponseBodyData setIsNumberPortability(Boolean isNumberPortability) {
            this.isNumberPortability = isNumberPortability;
            return this;
        }
        public Boolean getIsNumberPortability() {
            return this.isNumberPortability;
        }

        public DescribeMobileOperatorAttributeResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public DescribeMobileOperatorAttributeResponseBodyData setRealNumber(String realNumber) {
            this.realNumber = realNumber;
            return this;
        }
        public String getRealNumber() {
            return this.realNumber;
        }

        public DescribeMobileOperatorAttributeResponseBodyData setSegmentCarrier(String segmentCarrier) {
            this.segmentCarrier = segmentCarrier;
            return this;
        }
        public String getSegmentCarrier() {
            return this.segmentCarrier;
        }

    }

}
