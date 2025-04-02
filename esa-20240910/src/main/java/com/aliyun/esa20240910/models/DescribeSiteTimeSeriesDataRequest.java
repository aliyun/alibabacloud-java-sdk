// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTimeSeriesDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-04-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<DescribeSiteTimeSeriesDataRequestFields> fields;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <strong>example:</strong>
     * <p>1150376036*****</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteTimeSeriesDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTimeSeriesDataRequest self = new DescribeSiteTimeSeriesDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTimeSeriesDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteTimeSeriesDataRequest setFields(java.util.List<DescribeSiteTimeSeriesDataRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DescribeSiteTimeSeriesDataRequestFields> getFields() {
        return this.fields;
    }

    public DescribeSiteTimeSeriesDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeSiteTimeSeriesDataRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteTimeSeriesDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSiteTimeSeriesDataRequestFields extends TeaModel {
        @NameInMap("Dimension")
        public java.util.List<String> dimension;

        /**
         * <strong>example:</strong>
         * <p>Traffic</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteTimeSeriesDataRequestFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteTimeSeriesDataRequestFields self = new DescribeSiteTimeSeriesDataRequestFields();
            return TeaModel.build(map, self);
        }

        public DescribeSiteTimeSeriesDataRequestFields setDimension(java.util.List<String> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.List<String> getDimension() {
            return this.dimension;
        }

        public DescribeSiteTimeSeriesDataRequestFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

}
