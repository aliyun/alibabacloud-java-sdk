// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeDDoSBpsMaxRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>global</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <strong>example:</strong>
     * <p>2023-04-07T02:34:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>709662109****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
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
