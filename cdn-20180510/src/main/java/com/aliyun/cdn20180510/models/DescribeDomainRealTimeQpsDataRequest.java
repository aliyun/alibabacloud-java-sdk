// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeQpsDataRequest extends TeaModel {
    // The accelerated domain names. You can specify multiple accelerated domain names and separate them with commas (,).
    // 
    // >  You can specify at most 500 accelerated domain names in each call.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    // The name of the Internet service provider (ISP) for your Alibaba Cloud CDN service.
    // 
    // If you do not set this parameter, all ISPs are queried. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISP names.
    @NameInMap("IspNameEn")
    public String ispNameEn;

    // The name of the region.
    // 
    // If you do not set this parameter, all regions are queried. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent region list.
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The beginning of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainRealTimeQpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeQpsDataRequest self = new DescribeDomainRealTimeQpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeQpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainRealTimeQpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainRealTimeQpsDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainRealTimeQpsDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainRealTimeQpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainRealTimeQpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
