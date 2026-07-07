// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteWafTopDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
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
    public java.util.List<DescribeSiteWafTopDataRequestFields> fields;

    /**
     * <p>The time granularity for querying data. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The number of top data entries to query.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the site ID.</p>
     * <p>If this parameter is left empty, user-level data is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1150376036*****</p>
     */
    @NameInMap("SiteId")
    public String siteId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteWafTopDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteWafTopDataRequest self = new DescribeSiteWafTopDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteWafTopDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteWafTopDataRequest setFields(java.util.List<DescribeSiteWafTopDataRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DescribeSiteWafTopDataRequestFields> getFields() {
        return this.fields;
    }

    public DescribeSiteWafTopDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeSiteWafTopDataRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeSiteWafTopDataRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteWafTopDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeSiteWafTopDataRequestFields extends TeaModel {
        /**
         * <p>The query dimension.</p>
         */
        @NameInMap("Dimension")
        public java.util.List<String> dimension;

        /**
         * <p>The query metric value.</p>
         * <blockquote>
         * <p>For specific dimensions, see <a href="https://help.aliyun.com/document_detail/2878520.html">Data analytics field description</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Requests</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        public static DescribeSiteWafTopDataRequestFields build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteWafTopDataRequestFields self = new DescribeSiteWafTopDataRequestFields();
            return TeaModel.build(map, self);
        }

        public DescribeSiteWafTopDataRequestFields setDimension(java.util.List<String> dimension) {
            this.dimension = dimension;
            return this;
        }
        public java.util.List<String> getDimension() {
            return this.dimension;
        }

        public DescribeSiteWafTopDataRequestFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

    }

}
