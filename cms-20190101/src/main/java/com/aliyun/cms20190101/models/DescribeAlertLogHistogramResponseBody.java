// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeAlertLogHistogramResponseBody extends TeaModel {
    /**
     * <p>The end timestamp of queried alert logs in an interval. Unit: seconds.</p>
     */
    @NameInMap("AlertLogHistogramList")
    public java.util.List<DescribeAlertLogHistogramResponseBodyAlertLogHistogramList> alertLogHistogramList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The details about the number of alert logs that were generated during each interval of a time period.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start timestamp of queried alert logs in an interval. Unit: seconds.</p>
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
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The number of alert logs.</p>
         */
        @NameInMap("From")
        public Long from;

        /**
         * <p>This topic provides an example on how to query the number of alert logs of Elastic Compute Service (ECS) from the cloud service dimension.</p>
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
