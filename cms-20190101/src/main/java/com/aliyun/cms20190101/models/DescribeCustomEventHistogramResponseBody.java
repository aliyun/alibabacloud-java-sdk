// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventHistogramResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("EventHistograms")
    public DescribeCustomEventHistogramResponseBodyEventHistograms eventHistograms;

    @NameInMap("Success")
    public String success;

    public static DescribeCustomEventHistogramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventHistogramResponseBody self = new DescribeCustomEventHistogramResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeCustomEventHistogramResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Count")
        public Long count;

        public static DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram self = new DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram();
            return TeaModel.build(map, self);
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

        public DescribeCustomEventHistogramResponseBodyEventHistogramsEventHistogram setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
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
