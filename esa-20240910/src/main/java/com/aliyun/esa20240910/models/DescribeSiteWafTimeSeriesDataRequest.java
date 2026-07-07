// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteWafTimeSeriesDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
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
     * <p>The query metrics.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<DescribeSiteWafTimeSeriesDataRequestFields> fields;

    /**
     * <p>The time granularity of the queried data. Unit: seconds.</p>
     * <p>Based on the maximum time span of a single query, this parameter supports the values 60 (1 minute), 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see the <strong>supported time granularity</strong> section above.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>If this parameter is left empty, user-level data is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>11089268296****</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteWafTimeSeriesDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteWafTimeSeriesDataRequest self = new DescribeSiteWafTimeSeriesDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteWafTimeSeriesDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteWafTimeSeriesDataRequest setFields(java.util.List<DescribeSiteWafTimeSeriesDataRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DescribeSiteWafTimeSeriesDataRequestFields> getFields() {
        return this.fields;
    }

    public DescribeSiteWafTimeSeriesDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeSiteWafTimeSeriesDataRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteWafTimeSeriesDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSiteWafTimeSeriesDataRequestFields extends TeaModel {
        /**
         * <p>The query dimension.</p>
         */
        @NameInMap("Dimension")
        public java.util.List<String> dimension;

        /**
         * <p>The metric name.</p>
         * <blockquote>
         * <p>For more information about the available dimensions, see <a href="https://help.aliyun.com/document_detail/2878520.html">Data analytics field description</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Traffic</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteWafTimeSeriesDataRequestFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteWafTimeSeriesDataRequestFields self = new DescribeSiteWafTimeSeriesDataRequestFields();
            return TeaModel.build(map, self);
        }

        public DescribeSiteWafTimeSeriesDataRequestFields setDimension(java.util.List<String> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.List<String> getDimension() {
            return this.dimension;
        }

        public DescribeSiteWafTimeSeriesDataRequestFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

}
