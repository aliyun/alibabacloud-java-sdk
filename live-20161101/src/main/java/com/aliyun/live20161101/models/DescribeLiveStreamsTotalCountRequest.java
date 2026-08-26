// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsTotalCountRequest extends TeaModel {
    /**
     * <p>The ingest domain or streaming domain. This parameter is required when you query domain-level data. You can specify up to 10 domain names in a batch query. Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. The end time must be later than the start time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * <blockquote>
     * <p>The interval between StartTime and EndTime must be within 15 days, and EndTime cannot be later than the current time. Data for the current day can be queried only on the next day.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-25T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * <blockquote>
     * <p>The maximum query range is the last 1.5 years.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-24T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>If you leave this parameter empty, domain-level data is queried by default. Set this parameter to aliuid to query UID-level data.</p>
     * 
     * <strong>example:</strong>
     * <p>aliuid</p>
     */
    @NameInMap("Typ")
    public String typ;

    public static DescribeLiveStreamsTotalCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsTotalCountRequest self = new DescribeLiveStreamsTotalCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsTotalCountRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamsTotalCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamsTotalCountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamsTotalCountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveStreamsTotalCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamsTotalCountRequest setTyp(String typ) {
        this.typ = typ;
        return this;
    }
    public String getTyp() {
        return this.typ;
    }

}
