// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteWafTimeSeriesDataShrinkRequest extends TeaModel {
    /**
     * <p>The end time for the data query.</p>
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
    public String fieldsShrink;

    /**
     * <p>The time granularity of the queried data, in seconds.</p>
     * <p>Based on the maximum time span of a single query, this parameter supports the following values: 60 (1 minute), 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see the <strong>supported query time granularity</strong> section above.</p>
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
     * <p>The start time for the data query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeSiteWafTimeSeriesDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteWafTimeSeriesDataShrinkRequest self = new DescribeSiteWafTimeSeriesDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteWafTimeSeriesDataShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteWafTimeSeriesDataShrinkRequest setFieldsShrink(String fieldsShrink) {
        this.fieldsShrink = fieldsShrink;
        return this;
    }
    public String getFieldsShrink() {
        return this.fieldsShrink;
    }

    public DescribeSiteWafTimeSeriesDataShrinkRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeSiteWafTimeSeriesDataShrinkRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteWafTimeSeriesDataShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
