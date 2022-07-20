// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeLiveSubExperienceMetricDataResponseBody extends TeaModel {
    @NameInMap("MetricList")
    public java.util.List<DescribeLiveSubExperienceMetricDataResponseBodyMetricList> metricList;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveSubExperienceMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveSubExperienceMetricDataResponseBody self = new DescribeLiveSubExperienceMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveSubExperienceMetricDataResponseBody setMetricList(java.util.List<DescribeLiveSubExperienceMetricDataResponseBodyMetricList> metricList) {
        this.metricList = metricList;
        return this;
    }
    public java.util.List<DescribeLiveSubExperienceMetricDataResponseBodyMetricList> getMetricList() {
        return this.metricList;
    }

    public DescribeLiveSubExperienceMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveSubExperienceMetricDataResponseBodyMetricList extends TeaModel {
        @NameInMap("AvgScore")
        public Float avgScore;

        @NameInMap("MaxScore")
        public Float maxScore;

        @NameInMap("MinScore")
        public Float minScore;

        public static DescribeLiveSubExperienceMetricDataResponseBodyMetricList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveSubExperienceMetricDataResponseBodyMetricList self = new DescribeLiveSubExperienceMetricDataResponseBodyMetricList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveSubExperienceMetricDataResponseBodyMetricList setAvgScore(Float avgScore) {
            this.avgScore = avgScore;
            return this;
        }
        public Float getAvgScore() {
            return this.avgScore;
        }

        public DescribeLiveSubExperienceMetricDataResponseBodyMetricList setMaxScore(Float maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public Float getMaxScore() {
            return this.maxScore;
        }

        public DescribeLiveSubExperienceMetricDataResponseBodyMetricList setMinScore(Float minScore) {
            this.minScore = minScore;
            return this;
        }
        public Float getMinScore() {
            return this.minScore;
        }

    }

}
