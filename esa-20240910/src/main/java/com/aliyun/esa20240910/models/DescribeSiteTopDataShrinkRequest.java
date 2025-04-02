// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTopDataShrinkRequest extends TeaModel {
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
    public String fieldsShrink;

    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("Limit")
    public String limit;

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

    public static DescribeSiteTopDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTopDataShrinkRequest self = new DescribeSiteTopDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTopDataShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSiteTopDataShrinkRequest setFieldsShrink(String fieldsShrink) {
        this.fieldsShrink = fieldsShrink;
        return this;
    }
    public String getFieldsShrink() {
        return this.fieldsShrink;
    }

    public DescribeSiteTopDataShrinkRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeSiteTopDataShrinkRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeSiteTopDataShrinkRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public DescribeSiteTopDataShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
