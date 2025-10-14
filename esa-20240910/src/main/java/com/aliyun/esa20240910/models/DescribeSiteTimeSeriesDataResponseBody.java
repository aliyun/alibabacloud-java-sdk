// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTimeSeriesDataResponseBody extends TeaModel {
    /**
     * <p>Returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSiteTimeSeriesDataResponseBodyData> data;

    /**
     * <p>The end time for fetching the data.</p>
     * <p>The date format follows ISO8601 notation and uses UTC+0, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The granularity of the data, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sampling rate, in %.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SamplingRate")
    public Float samplingRate;

    /**
     * <p>The start time for fetching the data.</p>
     * <p>The date format follows ISO8601 notation and uses UTC+0, formatted as yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Aggregated query data.</p>
     */
    @NameInMap("SummarizedData")
    public java.util.List<DescribeSiteTimeSeriesDataResponseBodySummarizedData> summarizedData;

    public static DescribeSiteTimeSeriesDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTimeSeriesDataResponseBody self = new DescribeSiteTimeSeriesDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTimeSeriesDataResponseBody setData(java.util.List<DescribeSiteTimeSeriesDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSiteTimeSeriesDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSiteTimeSeriesDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteTimeSeriesDataResponseBody setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeSiteTimeSeriesDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteTimeSeriesDataResponseBody setSamplingRate(Float samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public Float getSamplingRate() {
        return this.samplingRate;
    }

    public DescribeSiteTimeSeriesDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSiteTimeSeriesDataResponseBody setSummarizedData(java.util.List<DescribeSiteTimeSeriesDataResponseBodySummarizedData> summarizedData) {
        this.summarizedData = summarizedData;
        return this;
    }
    public java.util.List<DescribeSiteTimeSeriesDataResponseBodySummarizedData> getSummarizedData() {
        return this.summarizedData;
    }

    public static class DescribeSiteTimeSeriesDataResponseBodyDataDetailData extends TeaModel {
        /**
         * <p>Start timestamp of the time slice.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-08T16:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>Value.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSiteTimeSeriesDataResponseBodyDataDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteTimeSeriesDataResponseBodyDataDetailData self = new DescribeSiteTimeSeriesDataResponseBodyDataDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteTimeSeriesDataResponseBodyDataDetailData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeSiteTimeSeriesDataResponseBodyDataDetailData setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeSiteTimeSeriesDataResponseBodyData extends TeaModel {
        /**
         * <p>Returned data.</p>
         */
        @NameInMap("DetailData")
        public java.util.List<DescribeSiteTimeSeriesDataResponseBodyDataDetailData> detailData;

        /**
         * <p>Query dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionName")
        public String dimensionName;

        /**
         * <p>Query dimension value.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        /**
         * <p>Query metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>Traffic</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteTimeSeriesDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteTimeSeriesDataResponseBodyData self = new DescribeSiteTimeSeriesDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteTimeSeriesDataResponseBodyData setDetailData(java.util.List<DescribeSiteTimeSeriesDataResponseBodyDataDetailData> detailData) {
            this.detailData = detailData;
            return this;
        }
        public java.util.List<DescribeSiteTimeSeriesDataResponseBodyDataDetailData> getDetailData() {
            return this.detailData;
        }

        public DescribeSiteTimeSeriesDataResponseBodyData setDimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            return this;
        }
        public String getDimensionName() {
            return this.dimensionName;
        }

        public DescribeSiteTimeSeriesDataResponseBodyData setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public DescribeSiteTimeSeriesDataResponseBodyData setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

    public static class DescribeSiteTimeSeriesDataResponseBodySummarizedData extends TeaModel {
        /**
         * <p>The aggregation method used.</p>
         * 
         * <strong>example:</strong>
         * <p>sum</p>
         */
        @NameInMap("AggMethod")
        public String aggMethod;

        /**
         * <p>The dimension of the aggregated data being queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionName")
        public String dimensionName;

        /**
         * <p>The value of the aggregated dimension being queried.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        /**
         * <p>The value of the aggregated metric being queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Traffic</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The aggregated value.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSiteTimeSeriesDataResponseBodySummarizedData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteTimeSeriesDataResponseBodySummarizedData self = new DescribeSiteTimeSeriesDataResponseBodySummarizedData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteTimeSeriesDataResponseBodySummarizedData setAggMethod(String aggMethod) {
            this.aggMethod = aggMethod;
            return this;
        }
        public String getAggMethod() {
            return this.aggMethod;
        }

        public DescribeSiteTimeSeriesDataResponseBodySummarizedData setDimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            return this;
        }
        public String getDimensionName() {
            return this.dimensionName;
        }

        public DescribeSiteTimeSeriesDataResponseBodySummarizedData setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public DescribeSiteTimeSeriesDataResponseBodySummarizedData setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeSiteTimeSeriesDataResponseBodySummarizedData setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

}
