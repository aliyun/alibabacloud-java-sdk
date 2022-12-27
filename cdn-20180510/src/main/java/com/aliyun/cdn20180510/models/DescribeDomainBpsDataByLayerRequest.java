// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataByLayerRequest extends TeaModel {
    // You can specify multiple domain names and separate them with commas (,). You can specify at most 500 domain names in each call.
    // 
    // >  If you do not specify an accelerated domain name, the bandwidth data of all the accelerated domain names that belong to your Alibaba Cloud account is queried.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    // 
    // >  The end time must be later than the start time.
    @NameInMap("EndTime")
    public String endTime;

    // The time interval between the data entries. Unit: seconds.
    // 
    // The time granularity varies with the time range to query. Supported values: 300 (5 minutes), 3600 (1 hour), and 86400 (1 day). For more information, see **Usage notes**.
    @NameInMap("Interval")
    public String interval;

    // The name of the Internet service provider (ISP). You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent ISP list. If you do not specify an ISP, data of all ISPs is queried.
    @NameInMap("IspNameEn")
    public String ispNameEn;

    // The layers at which you want to query the bandwidth data. Valid values:
    // 
    // *   Network layer: **IPv4** and **IPv6**.
    // *   Application layer: **http**, **https**, and **quic**.
    // *   **all**: specifies that both the network and application layers are included.
    // 
    // Default value: **all**.
    @NameInMap("Layer")
    public String layer;

    // The name of the region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent region list. If you do not specify a region, data in all regions is queried.
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The beginning of the time range to query.
    // 
    // Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDomainBpsDataByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataByLayerRequest self = new DescribeDomainBpsDataByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataByLayerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainBpsDataByLayerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainBpsDataByLayerRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDomainBpsDataByLayerRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainBpsDataByLayerRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeDomainBpsDataByLayerRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainBpsDataByLayerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDomainBpsDataByLayerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
