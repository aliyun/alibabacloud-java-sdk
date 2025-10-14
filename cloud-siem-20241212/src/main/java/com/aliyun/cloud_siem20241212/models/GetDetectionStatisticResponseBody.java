// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDetectionStatisticResponseBody extends TeaModel {
    @NameInMap("DetectionStatistic")
    public GetDetectionStatisticResponseBodyDetectionStatistic detectionStatistic;

    /**
     * <strong>example:</strong>
     * <p>6FB890AC-90B2-5EEA-845B-F7C86FB2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDetectionStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDetectionStatisticResponseBody self = new GetDetectionStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDetectionStatisticResponseBody setDetectionStatistic(GetDetectionStatisticResponseBodyDetectionStatistic detectionStatistic) {
        this.detectionStatistic = detectionStatistic;
        return this;
    }
    public GetDetectionStatisticResponseBodyDetectionStatistic getDetectionStatistic() {
        return this.detectionStatistic;
    }

    public GetDetectionStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDetectionStatisticResponseBodyDetectionStatistic extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DetectionRuleOnlineCount")
        public Integer detectionRuleOnlineCount;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DetectionRuleTemplateCount")
        public Integer detectionRuleTemplateCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DetectionRuleTestCount")
        public Integer detectionRuleTestCount;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("GraphComputeRuleCount")
        public Integer graphComputeRuleCount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PassthroughRuleCount")
        public Integer passthroughRuleCount;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("WindowRuleCount")
        public Integer windowRuleCount;

        public static GetDetectionStatisticResponseBodyDetectionStatistic build(java.util.Map<String, ?> map) throws Exception {
            GetDetectionStatisticResponseBodyDetectionStatistic self = new GetDetectionStatisticResponseBodyDetectionStatistic();
            return TeaModel.build(map, self);
        }

        public GetDetectionStatisticResponseBodyDetectionStatistic setDetectionRuleOnlineCount(Integer detectionRuleOnlineCount) {
            this.detectionRuleOnlineCount = detectionRuleOnlineCount;
            return this;
        }
        public Integer getDetectionRuleOnlineCount() {
            return this.detectionRuleOnlineCount;
        }

        public GetDetectionStatisticResponseBodyDetectionStatistic setDetectionRuleTemplateCount(Integer detectionRuleTemplateCount) {
            this.detectionRuleTemplateCount = detectionRuleTemplateCount;
            return this;
        }
        public Integer getDetectionRuleTemplateCount() {
            return this.detectionRuleTemplateCount;
        }

        public GetDetectionStatisticResponseBodyDetectionStatistic setDetectionRuleTestCount(Integer detectionRuleTestCount) {
            this.detectionRuleTestCount = detectionRuleTestCount;
            return this;
        }
        public Integer getDetectionRuleTestCount() {
            return this.detectionRuleTestCount;
        }

        public GetDetectionStatisticResponseBodyDetectionStatistic setGraphComputeRuleCount(Integer graphComputeRuleCount) {
            this.graphComputeRuleCount = graphComputeRuleCount;
            return this;
        }
        public Integer getGraphComputeRuleCount() {
            return this.graphComputeRuleCount;
        }

        public GetDetectionStatisticResponseBodyDetectionStatistic setPassthroughRuleCount(Integer passthroughRuleCount) {
            this.passthroughRuleCount = passthroughRuleCount;
            return this;
        }
        public Integer getPassthroughRuleCount() {
            return this.passthroughRuleCount;
        }

        public GetDetectionStatisticResponseBodyDetectionStatistic setWindowRuleCount(Integer windowRuleCount) {
            this.windowRuleCount = windowRuleCount;
            return this;
        }
        public Integer getWindowRuleCount() {
            return this.windowRuleCount;
        }

    }

}
