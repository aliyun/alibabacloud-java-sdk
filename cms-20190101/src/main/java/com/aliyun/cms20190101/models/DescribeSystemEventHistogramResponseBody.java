// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventHistogramResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

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
        @NameInMap("Count")
        public Long count;

        @NameInMap("EndTime")
        public Long endTime;

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
