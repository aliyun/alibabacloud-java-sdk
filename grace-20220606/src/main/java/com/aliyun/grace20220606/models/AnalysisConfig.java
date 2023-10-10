// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class AnalysisConfig extends TeaModel {
    @NameInMap("badThroughputThreshold")
    public Double badThroughputThreshold;

    @NameInMap("fullGCFrequentIntervalThreshold")
    public Double fullGCFrequentIntervalThreshold;

    @NameInMap("highHeapUsageThreshold")
    public Double highHeapUsageThreshold;

    @NameInMap("highHumongousUsageThreshold")
    public Double highHumongousUsageThreshold;

    @NameInMap("highMetaspaceUsageThreshold")
    public Double highMetaspaceUsageThreshold;

    @NameInMap("highOldUsageThreshold")
    public Double highOldUsageThreshold;

    @NameInMap("highPromotionThreshold")
    public Double highPromotionThreshold;

    @NameInMap("highSysThreshold")
    public Double highSysThreshold;

    @NameInMap("longConcurrentThreshold")
    public Double longConcurrentThreshold;

    @NameInMap("longPauseThreshold")
    public Double longPauseThreshold;

    @NameInMap("lowUsrThreshold")
    public Double lowUsrThreshold;

    @NameInMap("oldGCFrequentIntervalThreshold")
    public Double oldGCFrequentIntervalThreshold;

    @NameInMap("smallGenerationThreshold")
    public Double smallGenerationThreshold;

    @NameInMap("timeRange")
    public AnalysisConfigTimeRange timeRange;

    @NameInMap("tooManyOldGCThreshold")
    public Double tooManyOldGCThreshold;

    @NameInMap("youngGCFrequentIntervalThreshold")
    public Double youngGCFrequentIntervalThreshold;

    public static AnalysisConfig build(java.util.Map<String, ?> map) throws Exception {
        AnalysisConfig self = new AnalysisConfig();
        return TeaModel.build(map, self);
    }

    public AnalysisConfig setBadThroughputThreshold(Double badThroughputThreshold) {
        this.badThroughputThreshold = badThroughputThreshold;
        return this;
    }
    public Double getBadThroughputThreshold() {
        return this.badThroughputThreshold;
    }

    public AnalysisConfig setFullGCFrequentIntervalThreshold(Double fullGCFrequentIntervalThreshold) {
        this.fullGCFrequentIntervalThreshold = fullGCFrequentIntervalThreshold;
        return this;
    }
    public Double getFullGCFrequentIntervalThreshold() {
        return this.fullGCFrequentIntervalThreshold;
    }

    public AnalysisConfig setHighHeapUsageThreshold(Double highHeapUsageThreshold) {
        this.highHeapUsageThreshold = highHeapUsageThreshold;
        return this;
    }
    public Double getHighHeapUsageThreshold() {
        return this.highHeapUsageThreshold;
    }

    public AnalysisConfig setHighHumongousUsageThreshold(Double highHumongousUsageThreshold) {
        this.highHumongousUsageThreshold = highHumongousUsageThreshold;
        return this;
    }
    public Double getHighHumongousUsageThreshold() {
        return this.highHumongousUsageThreshold;
    }

    public AnalysisConfig setHighMetaspaceUsageThreshold(Double highMetaspaceUsageThreshold) {
        this.highMetaspaceUsageThreshold = highMetaspaceUsageThreshold;
        return this;
    }
    public Double getHighMetaspaceUsageThreshold() {
        return this.highMetaspaceUsageThreshold;
    }

    public AnalysisConfig setHighOldUsageThreshold(Double highOldUsageThreshold) {
        this.highOldUsageThreshold = highOldUsageThreshold;
        return this;
    }
    public Double getHighOldUsageThreshold() {
        return this.highOldUsageThreshold;
    }

    public AnalysisConfig setHighPromotionThreshold(Double highPromotionThreshold) {
        this.highPromotionThreshold = highPromotionThreshold;
        return this;
    }
    public Double getHighPromotionThreshold() {
        return this.highPromotionThreshold;
    }

    public AnalysisConfig setHighSysThreshold(Double highSysThreshold) {
        this.highSysThreshold = highSysThreshold;
        return this;
    }
    public Double getHighSysThreshold() {
        return this.highSysThreshold;
    }

    public AnalysisConfig setLongConcurrentThreshold(Double longConcurrentThreshold) {
        this.longConcurrentThreshold = longConcurrentThreshold;
        return this;
    }
    public Double getLongConcurrentThreshold() {
        return this.longConcurrentThreshold;
    }

    public AnalysisConfig setLongPauseThreshold(Double longPauseThreshold) {
        this.longPauseThreshold = longPauseThreshold;
        return this;
    }
    public Double getLongPauseThreshold() {
        return this.longPauseThreshold;
    }

    public AnalysisConfig setLowUsrThreshold(Double lowUsrThreshold) {
        this.lowUsrThreshold = lowUsrThreshold;
        return this;
    }
    public Double getLowUsrThreshold() {
        return this.lowUsrThreshold;
    }

    public AnalysisConfig setOldGCFrequentIntervalThreshold(Double oldGCFrequentIntervalThreshold) {
        this.oldGCFrequentIntervalThreshold = oldGCFrequentIntervalThreshold;
        return this;
    }
    public Double getOldGCFrequentIntervalThreshold() {
        return this.oldGCFrequentIntervalThreshold;
    }

    public AnalysisConfig setSmallGenerationThreshold(Double smallGenerationThreshold) {
        this.smallGenerationThreshold = smallGenerationThreshold;
        return this;
    }
    public Double getSmallGenerationThreshold() {
        return this.smallGenerationThreshold;
    }

    public AnalysisConfig setTimeRange(AnalysisConfigTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public AnalysisConfigTimeRange getTimeRange() {
        return this.timeRange;
    }

    public AnalysisConfig setTooManyOldGCThreshold(Double tooManyOldGCThreshold) {
        this.tooManyOldGCThreshold = tooManyOldGCThreshold;
        return this;
    }
    public Double getTooManyOldGCThreshold() {
        return this.tooManyOldGCThreshold;
    }

    public AnalysisConfig setYoungGCFrequentIntervalThreshold(Double youngGCFrequentIntervalThreshold) {
        this.youngGCFrequentIntervalThreshold = youngGCFrequentIntervalThreshold;
        return this;
    }
    public Double getYoungGCFrequentIntervalThreshold() {
        return this.youngGCFrequentIntervalThreshold;
    }

    public static class AnalysisConfigTimeRange extends TeaModel {
        @NameInMap("end")
        public Double end;

        @NameInMap("start")
        public Double start;

        public static AnalysisConfigTimeRange build(java.util.Map<String, ?> map) throws Exception {
            AnalysisConfigTimeRange self = new AnalysisConfigTimeRange();
            return TeaModel.build(map, self);
        }

        public AnalysisConfigTimeRange setEnd(Double end) {
            this.end = end;
            return this;
        }
        public Double getEnd() {
            return this.end;
        }

        public AnalysisConfigTimeRange setStart(Double start) {
            this.start = start;
            return this;
        }
        public Double getStart() {
            return this.start;
        }

    }

}
