// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeSrcHttpCodeDataRequest extends TeaModel {
    // You can specify multiple domain names and separate them with commas (,). You can specify at most 100 domain names in each call.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    // The name of the Internet Service Provider (ISP). You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISPs. If you do not set this parameter, all ISPs are queried.
    @NameInMap("IspNameEn")
    public String ispNameEn;

    // The name of the region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions. If you do not set this parameter, all regions are queried.
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The start of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainRealTimeSrcHttpCodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeSrcHttpCodeDataRequest self = new DescribeDomainRealTimeSrcHttpCodeDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeSrcHttpCodeDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainRealTimeSrcHttpCodeDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
