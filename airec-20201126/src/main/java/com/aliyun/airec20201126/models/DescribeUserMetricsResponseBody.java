// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeUserMetricsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public java.util.List<DescribeUserMetricsResponseBodyResult> result;

    public static DescribeUserMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserMetricsResponseBody self = new DescribeUserMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserMetricsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

    public DescribeUserMetricsResponseBody setResult(java.util.List<DescribeUserMetricsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeUserMetricsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeUserMetricsResponseBodyResultDataPoints extends TeaModel {
        /**
         * <p>The end time. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1567152000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The start time. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1567152000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <p>The value of the corresponding metric.</p>
         * 
         * <strong>example:</strong>
         * <p>84.6</p>
         */
        @NameInMap("val")
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
        /**
         * <p>The returned metrics.</p>
         */
        @NameInMap("dataPoints")
        public java.util.List<DescribeUserMetricsResponseBodyResultDataPoints> dataPoints;

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("sceneId")
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
