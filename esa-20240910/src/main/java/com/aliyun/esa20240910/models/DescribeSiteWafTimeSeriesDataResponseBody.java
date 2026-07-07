// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteWafTimeSeriesDataResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSiteWafTimeSeriesDataResponseBodyData> data;

    /**
     * <p>The end of the time range for the returned data.</p>
     * <p>The time is in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data granularity. Unit: seconds.</p>
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
     * <p>93652946-2687-5428-8254-533B1E6A***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sampling rate. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SamplingRate")
    public Float samplingRate;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The summarized data.</p>
     */
    @NameInMap("SummarizedData")
    public java.util.List<DescribeSiteWafTimeSeriesDataResponseBodySummarizedData> summarizedData;

    public static DescribeSiteWafTimeSeriesDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteWafTimeSeriesDataResponseBody self = new DescribeSiteWafTimeSeriesDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteWafTimeSeriesDataResponseBody setData(java.util.List<DescribeSiteWafTimeSeriesDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSiteWafTimeSeriesDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSiteWafTimeSeriesDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteWafTimeSeriesDataResponseBody setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public DescribeSiteWafTimeSeriesDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteWafTimeSeriesDataResponseBody setSamplingRate(Float samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public Float getSamplingRate() {
        return this.samplingRate;
    }

    public DescribeSiteWafTimeSeriesDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSiteWafTimeSeriesDataResponseBody setSummarizedData(java.util.List<DescribeSiteWafTimeSeriesDataResponseBodySummarizedData> summarizedData) {
        this.summarizedData = summarizedData;
        return this;
    }
    public java.util.List<DescribeSiteWafTimeSeriesDataResponseBodySummarizedData> getSummarizedData() {
        return this.summarizedData;
    }

    public static class DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData extends TeaModel {
        /**
         * <p>The start time of the time slice.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-08T16:00:00Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData self = new DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeSiteWafTimeSeriesDataResponseBodyData extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("DetailData")
        public java.util.List<DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData> detailData;

        /**
         * <p>The query dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionName")
        public String dimensionName;

        /**
         * <p>The dimension value.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>Traffic</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteWafTimeSeriesDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteWafTimeSeriesDataResponseBodyData self = new DescribeSiteWafTimeSeriesDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteWafTimeSeriesDataResponseBodyData setDetailData(java.util.List<DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData> detailData) {
            this.detailData = detailData;
            return this;
        }
        public java.util.List<DescribeSiteWafTimeSeriesDataResponseBodyDataDetailData> getDetailData() {
            return this.detailData;
        }

        public DescribeSiteWafTimeSeriesDataResponseBodyData setDimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            return this;
        }
        public String getDimensionName() {
            return this.dimensionName;
        }

        public DescribeSiteWafTimeSeriesDataResponseBodyData setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public DescribeSiteWafTimeSeriesDataResponseBodyData setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

    public static class DescribeSiteWafTimeSeriesDataResponseBodySummarizedData extends TeaModel {
        /**
         * <p>The aggregation method.</p>
         * 
         * <strong>example:</strong>
         * <p>sum</p>
         */
        @NameInMap("AggMethod")
        public String aggMethod;

        /**
         * <p>The summarized dimension name.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionName")
        public String dimensionName;

        /**
         * <p>The summarized dimension value.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        /**
         * <p>The summarized metric name.</p>
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
         * <p>123456</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSiteWafTimeSeriesDataResponseBodySummarizedData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteWafTimeSeriesDataResponseBodySummarizedData self = new DescribeSiteWafTimeSeriesDataResponseBodySummarizedData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteWafTimeSeriesDataResponseBodySummarizedData setAggMethod(String aggMethod) {
            this.aggMethod = aggMethod;
            return this;
        }
        public String getAggMethod() {
            return this.aggMethod;
        }

        public DescribeSiteWafTimeSeriesDataResponseBodySummarizedData setDimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            return this;
        }
        public String getDimensionName() {
            return this.dimensionName;
        }

        public DescribeSiteWafTimeSeriesDataResponseBodySummarizedData setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public DescribeSiteWafTimeSeriesDataResponseBodySummarizedData setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeSiteWafTimeSeriesDataResponseBodySummarizedData setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

}
