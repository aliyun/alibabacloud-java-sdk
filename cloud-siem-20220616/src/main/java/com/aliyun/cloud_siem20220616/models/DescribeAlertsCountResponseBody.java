// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsCountResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public DescribeAlertsCountResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertsCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsCountResponseBody self = new DescribeAlertsCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsCountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertsCountResponseBody setData(DescribeAlertsCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAlertsCountResponseBodyData getData() {
        return this.data;
    }

    public DescribeAlertsCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertsCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertsCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertsCountResponseBodyData extends TeaModel {
        /**
         * <p>The total number of alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("All")
        public Long all;

        @NameInMap("CountMap")
        public java.util.Map<String, Long> countMap;

        /**
         * <p>The number of high-risk alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("High")
        public Long high;

        /**
         * <p>The number of low-risk alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Low")
        public Long low;

        /**
         * <p>The number of medium-risk alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Medium")
        public Long medium;

        /**
         * <p>The number of connected services.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProductNum")
        public Integer productNum;

        public static DescribeAlertsCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsCountResponseBodyData self = new DescribeAlertsCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsCountResponseBodyData setAll(Long all) {
            this.all = all;
            return this;
        }
        public Long getAll() {
            return this.all;
        }

        public DescribeAlertsCountResponseBodyData setCountMap(java.util.Map<String, Long> countMap) {
            this.countMap = countMap;
            return this;
        }
        public java.util.Map<String, Long> getCountMap() {
            return this.countMap;
        }

        public DescribeAlertsCountResponseBodyData setHigh(Long high) {
            this.high = high;
            return this;
        }
        public Long getHigh() {
            return this.high;
        }

        public DescribeAlertsCountResponseBodyData setLow(Long low) {
            this.low = low;
            return this;
        }
        public Long getLow() {
            return this.low;
        }

        public DescribeAlertsCountResponseBodyData setMedium(Long medium) {
            this.medium = medium;
            return this;
        }
        public Long getMedium() {
            return this.medium;
        }

        public DescribeAlertsCountResponseBodyData setProductNum(Integer productNum) {
            this.productNum = productNum;
            return this;
        }
        public Integer getProductNum() {
            return this.productNum;
        }

    }

}
