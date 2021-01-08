// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeUserMetricsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<DescribeUserMetricsResponseBodyResult> result;

    public static DescribeUserMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserMetricsResponseBody self = new DescribeUserMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUserMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUserMetricsResponseBody setResult(java.util.List<DescribeUserMetricsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeUserMetricsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeUserMetricsResponseBodyResultDataPoints extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Val")
        public Float val;

        public static DescribeUserMetricsResponseBodyResultDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserMetricsResponseBodyResultDataPoints self = new DescribeUserMetricsResponseBodyResultDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeUserMetricsResponseBodyResultDataPoints setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeUserMetricsResponseBodyResultDataPoints setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeUserMetricsResponseBodyResultDataPoints setVal(Float val) {
            this.val = val;
            return this;
        }
        public Float getVal() {
            return this.val;
        }

    }

    public static class DescribeUserMetricsResponseBodyResult extends TeaModel {
        @NameInMap("DataPoints")
        public java.util.List<DescribeUserMetricsResponseBodyResultDataPoints> dataPoints;

        @NameInMap("SceneId")
        public String sceneId;

        public static DescribeUserMetricsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserMetricsResponseBodyResult self = new DescribeUserMetricsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeUserMetricsResponseBodyResult setDataPoints(java.util.List<DescribeUserMetricsResponseBodyResultDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<DescribeUserMetricsResponseBodyResultDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public DescribeUserMetricsResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

    }

}
