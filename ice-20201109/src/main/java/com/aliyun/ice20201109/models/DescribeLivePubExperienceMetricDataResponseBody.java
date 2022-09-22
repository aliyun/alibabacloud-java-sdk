// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLivePubExperienceMetricDataResponseBody extends TeaModel {
    @NameInMap("MetricList")
    public java.util.List<DescribeLivePubExperienceMetricDataResponseBodyMetricList> metricList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLivePubExperienceMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePubExperienceMetricDataResponseBody self = new DescribeLivePubExperienceMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLivePubExperienceMetricDataResponseBody setMetricList(java.util.List<DescribeLivePubExperienceMetricDataResponseBodyMetricList> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<DescribeLivePubExperienceMetricDataResponseBodyMetricList> getMetricList() {
        return this.metricList;
    }

    public DescribeLivePubExperienceMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLivePubExperienceMetricDataResponseBodyMetricList extends TeaModel {
        @NameInMap("AvgScore")
        public Float avgScore;

        @NameInMap("MaxScore")
        public Float maxScore;

        @NameInMap("MinScore")
        public Float minScore;

        public static DescribeLivePubExperienceMetricDataResponseBodyMetricList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLivePubExperienceMetricDataResponseBodyMetricList self = new DescribeLivePubExperienceMetricDataResponseBodyMetricList();
            return TeaModel.build(map, self);
        }

        public DescribeLivePubExperienceMetricDataResponseBodyMetricList setAvgScore(Float avgScore) {
            this.avgScore = avgScore;
            return this;
        }
        public Float getAvgScore() {
            return this.avgScore;
        }

        public DescribeLivePubExperienceMetricDataResponseBodyMetricList setMaxScore(Float maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public Float getMaxScore() {
            return this.maxScore;
        }

        public DescribeLivePubExperienceMetricDataResponseBodyMetricList setMinScore(Float minScore) {
            this.minScore = minScore;
            return this;
        }
        public Float getMinScore() {
            return this.minScore;
        }

    }

}
