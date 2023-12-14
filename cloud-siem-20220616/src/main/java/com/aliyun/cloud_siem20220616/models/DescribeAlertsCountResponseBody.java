// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsCountResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeAlertsCountResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
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
         */
        @NameInMap("All")
        public Long all;

        /**
         * <p>The number of high-risk alerts.</p>
         */
        @NameInMap("High")
        public Long high;

        /**
         * <p>The number of low-risk alerts.</p>
         */
        @NameInMap("Low")
        public Long low;

        /**
         * <p>The number of medium-risk alerts.</p>
         */
        @NameInMap("Medium")
        public Long medium;

        /**
         * <p>The number of connected services.</p>
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
