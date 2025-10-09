// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTopDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-04-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metrics to query.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Fields")
    public java.util.List<DescribeSiteTopDataRequestFields> fields;

    /**
     * <p>The time interval between the data entries to return. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The number of top-ranking data entries to query.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>If you do not specify this parameter, the system returns data by account.</p>
     * 
     * <strong>example:</strong>
     * <p>1150376036*****</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteTopDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTopDataRequest self = new DescribeSiteTopDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTopDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteTopDataRequest setFields(java.util.List<DescribeSiteTopDataRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DescribeSiteTopDataRequestFields> getFields() {
        return this.fields;
    }

    public DescribeSiteTopDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeSiteTopDataRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeSiteTopDataRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteTopDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSiteTopDataRequestFields extends TeaModel {
        /**
         * <p>The dimensions at which you want to query data.</p>
         */
        @NameInMap("Dimension")
        public java.util.List<String> dimension;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>Traffic</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteTopDataRequestFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteTopDataRequestFields self = new DescribeSiteTopDataRequestFields();
            return TeaModel.build(map, self);
        }

        public DescribeSiteTopDataRequestFields setDimension(java.util.List<String> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.List<String> getDimension() {
            return this.dimension;
        }

        public DescribeSiteTopDataRequestFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

}
