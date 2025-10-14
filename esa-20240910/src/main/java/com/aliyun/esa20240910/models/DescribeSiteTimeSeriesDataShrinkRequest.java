// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTimeSeriesDataShrinkRequest extends TeaModel {
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
    public String fieldsShrink;

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

    public static DescribeSiteTimeSeriesDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTimeSeriesDataShrinkRequest self = new DescribeSiteTimeSeriesDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTimeSeriesDataShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteTimeSeriesDataShrinkRequest setFieldsShrink(String fieldsShrink) {
        this.fieldsShrink = fieldsShrink;
        return this;
    }
    public String getFieldsShrink() {
        return this.fieldsShrink;
    }

    public DescribeSiteTimeSeriesDataShrinkRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeSiteTimeSeriesDataShrinkRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteTimeSeriesDataShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
