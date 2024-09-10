// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventHistogramResponseBody extends TeaModel {
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
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>486029C9-53E1-44B4-85A8-16A571A043FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true: The request was successful. false: The request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The information about the number of times the system event occurred during each interval of a time period.</p>
     */
    @NameInMap("SystemEventHistograms")
    public DescribeSystemEventHistogramResponseBodySystemEventHistograms systemEventHistograms;

    public static DescribeSystemEventHistogramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventHistogramResponseBody self = new DescribeSystemEventHistogramResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSystemEventHistogramResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSystemEventHistogramResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSystemEventHistogramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSystemEventHistogramResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSystemEventHistogramResponseBody setSystemEventHistograms(DescribeSystemEventHistogramResponseBodySystemEventHistograms systemEventHistograms) {
        this.systemEventHistograms = systemEventHistograms;
        return this;
    }
    public DescribeSystemEventHistogramResponseBodySystemEventHistograms getSystemEventHistograms() {
        return this.systemEventHistograms;
    }

    public static class DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram extends TeaModel {
        /**
         * <p>The number of times the system event occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The end time.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552225753000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552225770000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram self = new DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeSystemEventHistogramResponseBodySystemEventHistograms extends TeaModel {
        @NameInMap("SystemEventHistogram")
        public java.util.List<DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram> systemEventHistogram;

        public static DescribeSystemEventHistogramResponseBodySystemEventHistograms build(java.util.Map<String, ?> map) throws Exception {
            DescribeSystemEventHistogramResponseBodySystemEventHistograms self = new DescribeSystemEventHistogramResponseBodySystemEventHistograms();
            return TeaModel.build(map, self);
        }

        public DescribeSystemEventHistogramResponseBodySystemEventHistograms setSystemEventHistogram(java.util.List<DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram> systemEventHistogram) {
            this.systemEventHistogram = systemEventHistogram;
            return this;
        }
        public java.util.List<DescribeSystemEventHistogramResponseBodySystemEventHistogramsSystemEventHistogram> getSystemEventHistogram() {
            return this.systemEventHistogram;
        }

    }

}
