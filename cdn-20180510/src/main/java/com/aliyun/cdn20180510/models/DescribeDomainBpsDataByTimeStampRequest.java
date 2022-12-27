// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByTimeStampRequest extends TeaModel {
    // The accelerated domain name. You can specify only one domain name in each query.
    @NameInMap("DomainName")
    public String domainName;

    // The names of the Internet service providers (ISPs). Separate multiple ISP names with commas (,).
    // 
    // You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.
    @NameInMap("IspNames")
    public String ispNames;

    // The names of the regions. Separate multiple regions with commas (,).
    // 
    // You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query regions.
    @NameInMap("LocationNames")
    public String locationNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The beginning of the time range that was queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    // 
    // The data is collected at an interval of five minutes.
    @NameInMap("TimePoint")
    public String timePoint;

    public static DescribeDomainBpsDataByTimeStampRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataByTimeStampRequest self = new DescribeDomainBpsDataByTimeStampRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataByTimeStampRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainBpsDataByTimeStampRequest setIspNames(String ispNames) {
        this.ispNames = ispNames;
        return this;
    }
    public String getIspNames() {
        return this.ispNames;
    }

    public DescribeDomainBpsDataByTimeStampRequest setLocationNames(String locationNames) {
        this.locationNames = locationNames;
        return this;
    }
    public String getLocationNames() {
        return this.locationNames;
    }

    public DescribeDomainBpsDataByTimeStampRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainBpsDataByTimeStampRequest setTimePoint(String timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public String getTimePoint() {
        return this.timePoint;
    }

}
