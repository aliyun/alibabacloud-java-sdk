// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ItemsMetricValuesValue extends TeaModel {
    /**
     * <p>The primary metric code, which matches the key in <code>MetricValues</code> and the <code>MetricType</code> request parameter. Valid values:</p>
     * <ul>
     * <li><code>QUERY_COUNT</code>: the number of query executions.</li>
     * <li><code>CPU_COST</code>: the CPU consumption.</li>
     * <li><code>SHUFFLE_SIZE</code>: the shuffle data volume.</li>
     * <li><code>PEAK_MEMORY</code>: the peak memory consumption.</li>
     * <li><code>SCAN_SIZE</code>: the scan data volume.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPU_COST</p>
     */
    @NameInMap("MetricCode")
    public String metricCode;

    /**
     * <p>The primary metric name. The mapping is as follows:</p>
     * <ul>
     * <li><code>QUERY_COUNT</code>: <code>QueryCount</code>.</li>
     * <li><code>CPU_COST</code>: <code>OperatorCost</code>.</li>
     * <li><code>SHUFFLE_SIZE</code>: <code>ShuffleSize</code>.</li>
     * <li><code>PEAK_MEMORY</code>: <code>PeakMemory</code>.</li>
     * <li><code>SCAN_SIZE</code>: <code>ScanSize</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OperatorCost</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>Indicates whether this is the primary metric for the current analysis dimension. The current value is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Primary")
    public Boolean primary;

    /**
     * <p>The aggregated result for Time 2 in the NEW report. This field is returned only for NEW reports.</p>
     */
    @NameInMap("Time2")
    public ItemsMetricValuesValueTime2 time2;

    /**
     * <p>The dual-window comparison of the average value across active query minute buckets for the CHANGED report. This field is returned only for CHANGED reports.</p>
     */
    @NameInMap("Avg")
    public ItemsMetricValuesValueAvg avg;

    /**
     * <p>The dual-window comparison of the sum of metric values across active query minute buckets for the CHANGED report. This field is returned only for CHANGED reports.</p>
     */
    @NameInMap("Sum")
    public ItemsMetricValuesValueSum sum;

    /**
     * <p>The dual-window comparison of the peak value in a single minute bucket for the CHANGED report. This field is returned only for CHANGED reports.</p>
     */
    @NameInMap("Max")
    public ItemsMetricValuesValueMax max;

    public static ItemsMetricValuesValue build(java.util.Map<String, ?> map) throws Exception {
        ItemsMetricValuesValue self = new ItemsMetricValuesValue();
        return TeaModel.build(map, self);
    }

    public ItemsMetricValuesValue setMetricCode(String metricCode) {
        this.metricCode = metricCode;
        return this;
    }
    public String getMetricCode() {
        return this.metricCode;
    }

    public ItemsMetricValuesValue setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ItemsMetricValuesValue setPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }
    public Boolean getPrimary() {
        return this.primary;
    }

    public ItemsMetricValuesValue setTime2(ItemsMetricValuesValueTime2 time2) {
        this.time2 = time2;
        return this;
    }
    public ItemsMetricValuesValueTime2 getTime2() {
        return this.time2;
    }

    public ItemsMetricValuesValue setAvg(ItemsMetricValuesValueAvg avg) {
        this.avg = avg;
        return this;
    }
    public ItemsMetricValuesValueAvg getAvg() {
        return this.avg;
    }

    public ItemsMetricValuesValue setSum(ItemsMetricValuesValueSum sum) {
        this.sum = sum;
        return this;
    }
    public ItemsMetricValuesValueSum getSum() {
        return this.sum;
    }

    public ItemsMetricValuesValue setMax(ItemsMetricValuesValueMax max) {
        this.max = max;
        return this;
    }
    public ItemsMetricValuesValueMax getMax() {
        return this.max;
    }

    public static class ItemsMetricValuesValueTime2 extends TeaModel {
        /**
         * <p>The sum of metric values across active query minute buckets for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("SumValue")
        public Double sumValue;

        /**
         * <p>The display string of the total sum for Time 2, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>180s</p>
         */
        @NameInMap("SumDisplayValue")
        public String sumDisplayValue;

        /**
         * <p>The average value across active query minute buckets for Time 2, calculated as the total sum divided by the number of minute buckets that contain queries for this Pattern. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AvgValue")
        public Double avgValue;

        /**
         * <p>The display string of the average value across active query minute buckets for Time 2, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>3s</p>
         */
        @NameInMap("AvgDisplayValue")
        public String avgDisplayValue;

        /**
         * <p>The maximum metric value in a single minute bucket for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("MaxValue")
        public Double maxValue;

        /**
         * <p>The display string of the peak value in a single minute bucket for Time 2, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>9s</p>
         */
        @NameInMap("MaxDisplayValue")
        public String maxDisplayValue;

        /**
         * <p>The percentage of this Pattern\&quot;s Time 2 total sum relative to the total sum of all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SumRatioPercent")
        public Double sumRatioPercent;

        /**
         * <p>The percentage of this Pattern\&quot;s Time 2 average value relative to the sum of average values across all Patterns before dimension filtering in the current report. A value of 10 indicates 10%.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgRatioPercent")
        public Double avgRatioPercent;

        public static ItemsMetricValuesValueTime2 build(java.util.Map<String, ?> map) throws Exception {
            ItemsMetricValuesValueTime2 self = new ItemsMetricValuesValueTime2();
            return TeaModel.build(map, self);
        }

        public ItemsMetricValuesValueTime2 setSumValue(Double sumValue) {
            this.sumValue = sumValue;
            return this;
        }
        public Double getSumValue() {
            return this.sumValue;
        }

        public ItemsMetricValuesValueTime2 setSumDisplayValue(String sumDisplayValue) {
            this.sumDisplayValue = sumDisplayValue;
            return this;
        }
        public String getSumDisplayValue() {
            return this.sumDisplayValue;
        }

        public ItemsMetricValuesValueTime2 setAvgValue(Double avgValue) {
            this.avgValue = avgValue;
            return this;
        }
        public Double getAvgValue() {
            return this.avgValue;
        }

        public ItemsMetricValuesValueTime2 setAvgDisplayValue(String avgDisplayValue) {
            this.avgDisplayValue = avgDisplayValue;
            return this;
        }
        public String getAvgDisplayValue() {
            return this.avgDisplayValue;
        }

        public ItemsMetricValuesValueTime2 setMaxValue(Double maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Double getMaxValue() {
            return this.maxValue;
        }

        public ItemsMetricValuesValueTime2 setMaxDisplayValue(String maxDisplayValue) {
            this.maxDisplayValue = maxDisplayValue;
            return this;
        }
        public String getMaxDisplayValue() {
            return this.maxDisplayValue;
        }

        public ItemsMetricValuesValueTime2 setSumRatioPercent(Double sumRatioPercent) {
            this.sumRatioPercent = sumRatioPercent;
            return this;
        }
        public Double getSumRatioPercent() {
            return this.sumRatioPercent;
        }

        public ItemsMetricValuesValueTime2 setAvgRatioPercent(Double avgRatioPercent) {
            this.avgRatioPercent = avgRatioPercent;
            return this;
        }
        public Double getAvgRatioPercent() {
            return this.avgRatioPercent;
        }

    }

    public static class ItemsMetricValuesValueAvg extends TeaModel {
        /**
         * <p>The change rate of the average value across active query minute buckets, calculated as (Time 2 value − Time 1 value) / Time 1 value × 100. A value of 200 indicates a 200% increase. When the Time 1 value is 0, a finite change rate cannot be calculated. This field may not be returned and must not be treated as 0%.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ChangeRatePercent")
        public Double changeRatePercent;

        /**
         * <p>The average value across active query minute buckets for Time 1. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Time1Value")
        public Double time1Value;

        /**
         * <p>The display string of the average value across active query minute buckets for Time 1, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>1s</p>
         */
        @NameInMap("Time1DisplayValue")
        public String time1DisplayValue;

        /**
         * <p>The percentage of this Pattern\&quot;s Time 1 average value across active query minute buckets relative to the sum of the corresponding statistics for all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Time1RatioPercent")
        public Double time1RatioPercent;

        /**
         * <p>The average value across active query minute buckets for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Time2Value")
        public Double time2Value;

        /**
         * <p>The display string of the average value across active query minute buckets for Time 2, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>3s</p>
         */
        @NameInMap("Time2DisplayValue")
        public String time2DisplayValue;

        /**
         * <p>The percentage of this Pattern\&quot;s Time 2 average value across active query minute buckets relative to the sum of the corresponding statistics for all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Time2RatioPercent")
        public Double time2RatioPercent;

        public static ItemsMetricValuesValueAvg build(java.util.Map<String, ?> map) throws Exception {
            ItemsMetricValuesValueAvg self = new ItemsMetricValuesValueAvg();
            return TeaModel.build(map, self);
        }

        public ItemsMetricValuesValueAvg setChangeRatePercent(Double changeRatePercent) {
            this.changeRatePercent = changeRatePercent;
            return this;
        }
        public Double getChangeRatePercent() {
            return this.changeRatePercent;
        }

        public ItemsMetricValuesValueAvg setTime1Value(Double time1Value) {
            this.time1Value = time1Value;
            return this;
        }
        public Double getTime1Value() {
            return this.time1Value;
        }

        public ItemsMetricValuesValueAvg setTime1DisplayValue(String time1DisplayValue) {
            this.time1DisplayValue = time1DisplayValue;
            return this;
        }
        public String getTime1DisplayValue() {
            return this.time1DisplayValue;
        }

        public ItemsMetricValuesValueAvg setTime1RatioPercent(Double time1RatioPercent) {
            this.time1RatioPercent = time1RatioPercent;
            return this;
        }
        public Double getTime1RatioPercent() {
            return this.time1RatioPercent;
        }

        public ItemsMetricValuesValueAvg setTime2Value(Double time2Value) {
            this.time2Value = time2Value;
            return this;
        }
        public Double getTime2Value() {
            return this.time2Value;
        }

        public ItemsMetricValuesValueAvg setTime2DisplayValue(String time2DisplayValue) {
            this.time2DisplayValue = time2DisplayValue;
            return this;
        }
        public String getTime2DisplayValue() {
            return this.time2DisplayValue;
        }

        public ItemsMetricValuesValueAvg setTime2RatioPercent(Double time2RatioPercent) {
            this.time2RatioPercent = time2RatioPercent;
            return this;
        }
        public Double getTime2RatioPercent() {
            return this.time2RatioPercent;
        }

    }

    public static class ItemsMetricValuesValueSum extends TeaModel {
        /**
         * <p>The change rate of the sum of metric values across active query minute buckets, calculated as (Time 2 value − Time 1 value) / Time 1 value × 100. A value of 200 indicates a 200% increase. When the Time 1 value is 0, a finite change rate cannot be calculated. This field may not be returned and must not be treated as 0%.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ChangeRatePercent")
        public Double changeRatePercent;

        /**
         * <p>The sum of metric values across active query minute buckets for Time 1. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Time1Value")
        public Double time1Value;

        /**
         * <p>The display string of the sum of metric values across active query minute buckets for Time 1, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("Time1DisplayValue")
        public String time1DisplayValue;

        /**
         * <p>The percentage of this Pattern\&quot;s Time 1 sum of metric values across active query minute buckets relative to the sum of the corresponding statistics for all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Time1RatioPercent")
        public Double time1RatioPercent;

        /**
         * <p>The sum of metric values across active query minute buckets for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Time2Value")
        public Double time2Value;

        /**
         * <p>The display string of the sum of metric values across active query minute buckets for Time 2, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>180s</p>
         */
        @NameInMap("Time2DisplayValue")
        public String time2DisplayValue;

        /**
         * <p>The percentage of this Pattern\&quot;s Time 2 sum of metric values across active query minute buckets relative to the sum of the corresponding statistics for all results before dimension filtering in the current report. A value of 10 indicates 10%.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Time2RatioPercent")
        public Double time2RatioPercent;

        public static ItemsMetricValuesValueSum build(java.util.Map<String, ?> map) throws Exception {
            ItemsMetricValuesValueSum self = new ItemsMetricValuesValueSum();
            return TeaModel.build(map, self);
        }

        public ItemsMetricValuesValueSum setChangeRatePercent(Double changeRatePercent) {
            this.changeRatePercent = changeRatePercent;
            return this;
        }
        public Double getChangeRatePercent() {
            return this.changeRatePercent;
        }

        public ItemsMetricValuesValueSum setTime1Value(Double time1Value) {
            this.time1Value = time1Value;
            return this;
        }
        public Double getTime1Value() {
            return this.time1Value;
        }

        public ItemsMetricValuesValueSum setTime1DisplayValue(String time1DisplayValue) {
            this.time1DisplayValue = time1DisplayValue;
            return this;
        }
        public String getTime1DisplayValue() {
            return this.time1DisplayValue;
        }

        public ItemsMetricValuesValueSum setTime1RatioPercent(Double time1RatioPercent) {
            this.time1RatioPercent = time1RatioPercent;
            return this;
        }
        public Double getTime1RatioPercent() {
            return this.time1RatioPercent;
        }

        public ItemsMetricValuesValueSum setTime2Value(Double time2Value) {
            this.time2Value = time2Value;
            return this;
        }
        public Double getTime2Value() {
            return this.time2Value;
        }

        public ItemsMetricValuesValueSum setTime2DisplayValue(String time2DisplayValue) {
            this.time2DisplayValue = time2DisplayValue;
            return this;
        }
        public String getTime2DisplayValue() {
            return this.time2DisplayValue;
        }

        public ItemsMetricValuesValueSum setTime2RatioPercent(Double time2RatioPercent) {
            this.time2RatioPercent = time2RatioPercent;
            return this;
        }
        public Double getTime2RatioPercent() {
            return this.time2RatioPercent;
        }

    }

    public static class ItemsMetricValuesValueMax extends TeaModel {
        /**
         * <p>The change rate of the peak value in a single minute bucket, calculated as (Time 2 value − Time 1 value) / Time 1 value × 100. A value of 200 indicates a 200% increase. When the Time 1 value is 0, a finite change rate cannot be calculated. This field may not be returned and must not be treated as 0%.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ChangeRatePercent")
        public Double changeRatePercent;

        /**
         * <p>The peak value in a single minute bucket for Time 1. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Time1Value")
        public Double time1Value;

        /**
         * <p>The display string of the peak value in a single minute bucket for Time 1, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>3s</p>
         */
        @NameInMap("Time1DisplayValue")
        public String time1DisplayValue;

        /**
         * <p>The peak value in a single minute bucket for Time 2. The unit depends on MetricCode: count for QUERY_COUNT, seconds for CPU_COST, and GB (1 GB = 1024³ bytes) for SHUFFLE_SIZE, PEAK_MEMORY, and SCAN_SIZE.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Time2Value")
        public Double time2Value;

        /**
         * <p>The display string of the peak value in a single minute bucket for Time 2, with the unit included.</p>
         * 
         * <strong>example:</strong>
         * <p>9s</p>
         */
        @NameInMap("Time2DisplayValue")
        public String time2DisplayValue;

        public static ItemsMetricValuesValueMax build(java.util.Map<String, ?> map) throws Exception {
            ItemsMetricValuesValueMax self = new ItemsMetricValuesValueMax();
            return TeaModel.build(map, self);
        }

        public ItemsMetricValuesValueMax setChangeRatePercent(Double changeRatePercent) {
            this.changeRatePercent = changeRatePercent;
            return this;
        }
        public Double getChangeRatePercent() {
            return this.changeRatePercent;
        }

        public ItemsMetricValuesValueMax setTime1Value(Double time1Value) {
            this.time1Value = time1Value;
            return this;
        }
        public Double getTime1Value() {
            return this.time1Value;
        }

        public ItemsMetricValuesValueMax setTime1DisplayValue(String time1DisplayValue) {
            this.time1DisplayValue = time1DisplayValue;
            return this;
        }
        public String getTime1DisplayValue() {
            return this.time1DisplayValue;
        }

        public ItemsMetricValuesValueMax setTime2Value(Double time2Value) {
            this.time2Value = time2Value;
            return this;
        }
        public Double getTime2Value() {
            return this.time2Value;
        }

        public ItemsMetricValuesValueMax setTime2DisplayValue(String time2DisplayValue) {
            this.time2DisplayValue = time2DisplayValue;
            return this;
        }
        public String getTime2DisplayValue() {
            return this.time2DisplayValue;
        }

    }

}
