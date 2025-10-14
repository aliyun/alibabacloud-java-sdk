// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTimeSeriesDataRequest extends TeaModel {
    /**
     * <p>The end time for obtaining data.</p>
     * <p>The date format follows ISO8601 notation and uses UTC+0 time, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-04-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Query metrics.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<DescribeSiteTimeSeriesDataRequestFields> fields;

    /**
     * <p>The time granularity for querying data, in seconds.</p>
     * <p>Depending on the maximum time span of a single query, this parameter supports values of 60 (1 minute), 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For details, see the <strong>Supported Query Time Granularities</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>Site ID. Obtain the site ID by calling the <a href="~~ListSites~~">ListSites</a> interface.</p>
     * <p>If this parameter is empty, user-level data will be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1150376036*****</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>The start time for obtaining data.</p>
     * <p>The date format follows ISO8601 notation and uses UTC+0 time, in the format yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
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
        /**
         * <p>Query dimension.</p>
         */
        @NameInMap("Dimension")
        public java.util.List<String> dimension;

        /**
         * <p>Query metric value.</p>
         * <blockquote>
         * <p>For specific dimensions, see <a href="https://help.aliyun.com/document_detail/2878520.html">Data Analysis Field Description</a>.</p>
         * </blockquote>
         * 
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
