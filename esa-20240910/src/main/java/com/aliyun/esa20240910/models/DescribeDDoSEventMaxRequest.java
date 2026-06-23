// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSEventMaxRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * <p>The date is in ISO 8601 format. The time is displayed in UTC. The format is yyyy-MM-ddTHH:mm:ssZ. The maximum time span between the start time and end time is 31 days.</p>
     * <p>If you do not set this parameter, the current time is used as the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-10T02:10:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7096621098****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>The date is in ISO 8601 format. The time is displayed in UTC. The format is yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-18T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDDoSEventMaxRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSEventMaxRequest self = new DescribeDDoSEventMaxRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSEventMaxRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDDoSEventMaxRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribeDDoSEventMaxRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
