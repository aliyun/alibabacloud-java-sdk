// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeCustomizeRuleTestHistogramResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return value for the request.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeCustomizeRuleTestHistogramResponseBodyData> data;

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

    public static DescribeCustomizeRuleTestHistogramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeRuleTestHistogramResponseBody self = new DescribeCustomizeRuleTestHistogramResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeRuleTestHistogramResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeCustomizeRuleTestHistogramResponseBody setData(java.util.List<DescribeCustomizeRuleTestHistogramResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCustomizeRuleTestHistogramResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCustomizeRuleTestHistogramResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomizeRuleTestHistogramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizeRuleTestHistogramResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomizeRuleTestHistogramResponseBodyData extends TeaModel {
        /**
         * <p>The number of alerts that are generated in the query time range.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The start of the time range for querying alerts. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("From")
        public Long from;

        /**
         * <p>The end of the time range for querying alerts. The value is a UNIX timestamp. Unit: seconds.</p>
         */
        @NameInMap("To")
        public Long to;

        public static DescribeCustomizeRuleTestHistogramResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizeRuleTestHistogramResponseBodyData self = new DescribeCustomizeRuleTestHistogramResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizeRuleTestHistogramResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCustomizeRuleTestHistogramResponseBodyData setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public DescribeCustomizeRuleTestHistogramResponseBodyData setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

}
