// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventHistogramResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
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
     * <p>The information about the number of times that the custom event occurred during each interval of the specified time period.</p>
     */
    @NameInMap("EventHistograms")
    public DescribeCustomEventHistogramResponseBodyEventHistograms eventHistograms;

    /**
     * <p>The returned message. If the request was successful, a success message is returned. If the request failed, an error message is returned.</p>
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
     * <p>486029C9-53E1-44B4-85A8-16A571A043FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeCustomEventHistogramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventHistogramResponseBody self = new DescribeCustomEventHistogramResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomEventHistogramResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomEventHistogramResponseBody setEventHistograms(DescribeCustomEventHistogramResponseBodyEventHistograms eventHistograms) {
        this.eventHistograms = eventHistograms;
        return this;
    }
    public DescribeCustomEventHistogramResponseBodyEventHistograms getEventHistograms() {
        return this.eventHistograms;
    }

    public DescribeCustomEventHistogramResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomEventHistogramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomEventHistogramResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram extends TeaModel {
        /**
         * <p>The information about the number of times that the custom event occurred during an interval of the specified time period.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The end time.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552226750000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1552226740000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram self = new DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeCustomEventHistogramResponseBodyEventHistograms extends TeaModel {
        @NameInMap("EventHistogram")
        public java.util.List<DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram> eventHistogram;

        public static DescribeCustomEventHistogramResponseBodyEventHistograms build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventHistogramResponseBodyEventHistograms self = new DescribeCustomEventHistogramResponseBodyEventHistograms();
            return TeaModel.build(map, self);
        }

        public DescribeCustomEventHistogramResponseBodyEventHistograms setEventHistogram(java.util.List<DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram> eventHistogram) {
            this.eventHistogram = eventHistogram;
            return this;
        }
        public java.util.List<DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram> getEventHistogram() {
            return this.eventHistogram;
        }

    }

}
