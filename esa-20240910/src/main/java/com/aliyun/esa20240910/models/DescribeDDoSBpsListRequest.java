// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSBpsListRequest extends TeaModel {
    /**
     * <p>Protection area, defaulting to global if not filled. When specified, the values are as follows:</p>
     * <ul>
     * <li><p>domestic: Mainland China.</p>
     * </li>
     * <li><p>overseas: Global (excluding Mainland China).</p>
     * </li>
     * <li><p>global: Global.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The end time for fetching data. In ISO8601 format, using UTC+0, formatted as: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>The end time must be later than the start time, and the span between start and end times should not exceed 31 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-18T06:19:42Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>70966210986912</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The start time for fetching data, in ISO8601 format, using UTC+0, formatted as: yyyy-MM-ddTHH:mm:ssZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-05-14T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDDoSBpsListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSBpsListRequest self = new DescribeDDoSBpsListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSBpsListRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public DescribeDDoSBpsListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDDoSBpsListRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribeDDoSBpsListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
