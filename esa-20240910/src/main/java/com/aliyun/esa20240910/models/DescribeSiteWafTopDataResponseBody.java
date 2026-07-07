// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteWafTopDataResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSiteWafTopDataResponseBodyData> data;

    /**
     * <p>The end of the time range for the returned data.</p>
     * <p>The time is in ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64041D4F-B615-5DEB-AC94-F01EE433****</p>
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
     * <p>Specify the time in ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteWafTopDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteWafTopDataResponseBody self = new DescribeSiteWafTopDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteWafTopDataResponseBody setData(java.util.List<DescribeSiteWafTopDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSiteWafTopDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSiteWafTopDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteWafTopDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteWafTopDataResponseBody setSamplingRate(Float samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public Float getSamplingRate() {
        return this.samplingRate;
    }

    public DescribeSiteWafTopDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSiteWafTopDataResponseBodyDataDetailData extends TeaModel {
        /**
         * <p>The query dimension value.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSiteWafTopDataResponseBodyDataDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteWafTopDataResponseBodyDataDetailData self = new DescribeSiteWafTopDataResponseBodyDataDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteWafTopDataResponseBodyDataDetailData setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public DescribeSiteWafTopDataResponseBodyDataDetailData setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeSiteWafTopDataResponseBodyData extends TeaModel {
        /**
         * <p>The returned data.</p>
         */
        @NameInMap("DetailData")
        public java.util.List<DescribeSiteWafTopDataResponseBodyDataDetailData> detailData;

        /**
         * <p>The query dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionName")
        public String dimensionName;

        /**
         * <p>The query metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>Requests</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteWafTopDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteWafTopDataResponseBodyData self = new DescribeSiteWafTopDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteWafTopDataResponseBodyData setDetailData(java.util.List<DescribeSiteWafTopDataResponseBodyDataDetailData> detailData) {
            this.detailData = detailData;
            return this;
        }
        public java.util.List<DescribeSiteWafTopDataResponseBodyDataDetailData> getDetailData() {
            return this.detailData;
        }

        public DescribeSiteWafTopDataResponseBodyData setDimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            return this;
        }
        public String getDimensionName() {
            return this.dimensionName;
        }

        public DescribeSiteWafTopDataResponseBodyData setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

}
