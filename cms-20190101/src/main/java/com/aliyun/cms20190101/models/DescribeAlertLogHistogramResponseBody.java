// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogHistogramResponseBody extends TeaModel {
    /**
     * <p>The number of alert logs that were generated during each interval of a time period.</p>
     */
    @NameInMap("AlertLogHistogramList")
    public java.util.List<DescribeAlertLogHistogramResponseBodyAlertLogHistogramList> alertLogHistogramList;

    /**
     * <p>The response code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified resource is not found.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C4A3709-BF52-42EE-87B5-7435F0929585</p>
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

    public static DescribeAlertLogHistogramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertLogHistogramResponseBody self = new DescribeAlertLogHistogramResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertLogHistogramResponseBody setAlertLogHistogramList(java.util.List<DescribeAlertLogHistogramResponseBodyAlertLogHistogramList> alertLogHistogramList) {
        this.alertLogHistogramList = alertLogHistogramList;
        return this;
    }
    public java.util.List<DescribeAlertLogHistogramResponseBodyAlertLogHistogramList> getAlertLogHistogramList() {
        return this.alertLogHistogramList;
    }

    public DescribeAlertLogHistogramResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAlertLogHistogramResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertLogHistogramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertLogHistogramResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertLogHistogramResponseBodyAlertLogHistogramList extends TeaModel {
        /**
         * <p>The number of alert logs.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The start timestamp of the queried alert logs.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1610074791</p>
         */
        @NameInMap("From")
        public Long from;

        /**
         * <p>The end timestamp of the queried alert logs.</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1610074800</p>
         */
        @NameInMap("To")
        public Long to;

        public static DescribeAlertLogHistogramResponseBodyAlertLogHistogramList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertLogHistogramResponseBodyAlertLogHistogramList self = new DescribeAlertLogHistogramResponseBodyAlertLogHistogramList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertLogHistogramResponseBodyAlertLogHistogramList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAlertLogHistogramResponseBodyAlertLogHistogramList setFrom(Long from) {
            this.from = from;
            return this;
        }
        public Long getFrom() {
            return this.from;
        }

        public DescribeAlertLogHistogramResponseBodyAlertLogHistogramList setTo(Long to) {
            this.to = to;
            return this;
        }
        public Long getTo() {
            return this.to;
        }

    }

}
