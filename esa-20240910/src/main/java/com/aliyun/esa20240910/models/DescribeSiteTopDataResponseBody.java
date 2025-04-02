// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTopDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeSiteTopDataResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>2023-04-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>35C66C7B-671H-4297-9187-2C447724****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SamplingRate")
    public Float samplingRate;

    /**
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteTopDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTopDataResponseBody self = new DescribeSiteTopDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTopDataResponseBody setData(java.util.List<DescribeSiteTopDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSiteTopDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSiteTopDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteTopDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteTopDataResponseBody setSamplingRate(Float samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public Float getSamplingRate() {
        return this.samplingRate;
    }

    public DescribeSiteTopDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSiteTopDataResponseBodyDataDetailData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionValue")
        public String dimensionValue;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public Object value;

        public static DescribeSiteTopDataResponseBodyDataDetailData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteTopDataResponseBodyDataDetailData self = new DescribeSiteTopDataResponseBodyDataDetailData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteTopDataResponseBodyDataDetailData setDimensionValue(String dimensionValue) {
            this.dimensionValue = dimensionValue;
            return this;
        }
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public DescribeSiteTopDataResponseBodyDataDetailData setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class DescribeSiteTopDataResponseBodyData extends TeaModel {
        @NameInMap("DetailData")
        public java.util.List<DescribeSiteTopDataResponseBodyDataDetailData> detailData;

        /**
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DimensionName")
        public String dimensionName;

        /**
         * <strong>example:</strong>
         * <p>Traffic</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteTopDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteTopDataResponseBodyData self = new DescribeSiteTopDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSiteTopDataResponseBodyData setDetailData(java.util.List<DescribeSiteTopDataResponseBodyDataDetailData> detailData) {
            this.detailData = detailData;
            return this;
        }
        public java.util.List<DescribeSiteTopDataResponseBodyDataDetailData> getDetailData() {
            return this.detailData;
        }

        public DescribeSiteTopDataResponseBodyData setDimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            return this;
        }
        public String getDimensionName() {
            return this.dimensionName;
        }

        public DescribeSiteTopDataResponseBodyData setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

}
