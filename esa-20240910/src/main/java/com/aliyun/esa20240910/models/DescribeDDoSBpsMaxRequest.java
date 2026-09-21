// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSBpsMaxRequest extends TeaModel {
    /**
     * <p>The protection region. If this parameter is not specified, the default value global is used. Valid values:</p>
     * <ul>
     * <li><p>domestic: the Chinese mainland.</p>
     * </li>
     * <li><p>overseas: global (excluding the Chinese mainland).</p>
     * </li>
     * <li><p>global: global.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>The end of the time range to query. Specify the time in ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-04-07T02:34:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="url">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>709662109****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The beginning of the time range to query. Specify the time in ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-02-14T17:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDDoSBpsMaxRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDoSBpsMaxRequest self = new DescribeDDoSBpsMaxRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDDoSBpsMaxRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public DescribeDDoSBpsMaxRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDDoSBpsMaxRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public DescribeDDoSBpsMaxRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
