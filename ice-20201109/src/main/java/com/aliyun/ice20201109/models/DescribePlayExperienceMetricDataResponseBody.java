// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayExperienceMetricDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribePlayExperienceMetricDataResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlayExperienceMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayExperienceMetricDataResponseBody self = new DescribePlayExperienceMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayExperienceMetricDataResponseBody setData(java.util.List<DescribePlayExperienceMetricDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePlayExperienceMetricDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribePlayExperienceMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlayExperienceMetricDataResponseBodyData extends TeaModel {
        @NameInMap("AvgScore")
        public Float avgScore;

        @NameInMap("MaxScore")
        public Float maxScore;

        @NameInMap("MinScore")
        public Float minScore;

        public static DescribePlayExperienceMetricDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayExperienceMetricDataResponseBodyData self = new DescribePlayExperienceMetricDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePlayExperienceMetricDataResponseBodyData setAvgScore(Float avgScore) {
            this.avgScore = avgScore;
            return this;
        }
        public Float getAvgScore() {
            return this.avgScore;
        }

        public DescribePlayExperienceMetricDataResponseBodyData setMaxScore(Float maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public Float getMaxScore() {
            return this.maxScore;
        }

        public DescribePlayExperienceMetricDataResponseBodyData setMinScore(Float minScore) {
            this.minScore = minScore;
            return this;
        }
        public Float getMinScore() {
            return this.minScore;
        }

    }

}
