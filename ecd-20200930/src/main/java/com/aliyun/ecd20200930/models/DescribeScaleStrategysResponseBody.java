// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeScaleStrategysResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScaleStrategys")
    public java.util.List<DescribeScaleStrategysResponseBodyScaleStrategys> scaleStrategys;

    public static DescribeScaleStrategysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScaleStrategysResponseBody self = new DescribeScaleStrategysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScaleStrategysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeScaleStrategysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScaleStrategysResponseBody setScaleStrategys(java.util.List<DescribeScaleStrategysResponseBodyScaleStrategys> scaleStrategys) {
        this.scaleStrategys = scaleStrategys;
        return this;
    }
    public java.util.List<DescribeScaleStrategysResponseBodyScaleStrategys> getScaleStrategys() {
        return this.scaleStrategys;
    }

    public static class DescribeScaleStrategysResponseBodyScaleStrategys extends TeaModel {
        @NameInMap("ScaleStrategyId")
        public String scaleStrategyId;

        @NameInMap("MaxDesktopsCount")
        public Integer maxDesktopsCount;

        @NameInMap("MaxAvailableDesktopsCount")
        public Integer maxAvailableDesktopsCount;

        @NameInMap("ScaleStrategyName")
        public String scaleStrategyName;

        @NameInMap("ScaleStrategyType")
        public String scaleStrategyType;

        @NameInMap("MinDesktopsCount")
        public Integer minDesktopsCount;

        @NameInMap("MinAvailableDesktopsCount")
        public Integer minAvailableDesktopsCount;

        @NameInMap("ScaleStep")
        public Integer scaleStep;

        public static DescribeScaleStrategysResponseBodyScaleStrategys build(java.util.Map<String, ?> map) throws Exception {
            DescribeScaleStrategysResponseBodyScaleStrategys self = new DescribeScaleStrategysResponseBodyScaleStrategys();
            return TeaModel.build(map, self);
        }

        public DescribeScaleStrategysResponseBodyScaleStrategys setScaleStrategyId(String scaleStrategyId) {
            this.scaleStrategyId = scaleStrategyId;
            return this;
        }
        public String getScaleStrategyId() {
            return this.scaleStrategyId;
        }

        public DescribeScaleStrategysResponseBodyScaleStrategys setMaxDesktopsCount(Integer maxDesktopsCount) {
            this.maxDesktopsCount = maxDesktopsCount;
            return this;
        }
        public Integer getMaxDesktopsCount() {
            return this.maxDesktopsCount;
        }

        public DescribeScaleStrategysResponseBodyScaleStrategys setMaxAvailableDesktopsCount(Integer maxAvailableDesktopsCount) {
            this.maxAvailableDesktopsCount = maxAvailableDesktopsCount;
            return this;
        }
        public Integer getMaxAvailableDesktopsCount() {
            return this.maxAvailableDesktopsCount;
        }

        public DescribeScaleStrategysResponseBodyScaleStrategys setScaleStrategyName(String scaleStrategyName) {
            this.scaleStrategyName = scaleStrategyName;
            return this;
        }
        public String getScaleStrategyName() {
            return this.scaleStrategyName;
        }

        public DescribeScaleStrategysResponseBodyScaleStrategys setScaleStrategyType(String scaleStrategyType) {
            this.scaleStrategyType = scaleStrategyType;
            return this;
        }
        public String getScaleStrategyType() {
            return this.scaleStrategyType;
        }

        public DescribeScaleStrategysResponseBodyScaleStrategys setMinDesktopsCount(Integer minDesktopsCount) {
            this.minDesktopsCount = minDesktopsCount;
            return this;
        }
        public Integer getMinDesktopsCount() {
            return this.minDesktopsCount;
        }

        public DescribeScaleStrategysResponseBodyScaleStrategys setMinAvailableDesktopsCount(Integer minAvailableDesktopsCount) {
            this.minAvailableDesktopsCount = minAvailableDesktopsCount;
            return this;
        }
        public Integer getMinAvailableDesktopsCount() {
            return this.minAvailableDesktopsCount;
        }

        public DescribeScaleStrategysResponseBodyScaleStrategys setScaleStep(Integer scaleStep) {
            this.scaleStep = scaleStep;
            return this;
        }
        public Integer getScaleStep() {
            return this.scaleStep;
        }

    }

}
