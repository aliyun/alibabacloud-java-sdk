// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainAverageResponseTimeRequest extends TeaModel {
    /**
     * <p>The name of the Internet service provider (ISP) for your Alibaba Cloud CDN service. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISPs. If you do not set this parameter, all ISPs are queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The time interval between the data entries. Unit: seconds. The value varies based on the values of the **StartTime** and **EndTime** parameters. Valid values:</p>
     * <br>
     * <p>*   If the time span between StartTime and EndTime is less than 3 days (3 days excluded), valid values are **300**, **3600**, and **86400**. Default value: **300**.</p>
     * <p>*   If the time span between StartTime and EndTime is from 3 to 31 days (31 days excluded), valid values are **3600** and **86400**. Default value: **3600**.</p>
     * <p>*   If the time range between StartTime and EndTime is 31 days or longer, the valid value is **86400**. Default value: **86400**.</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range during which data was queried.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The name of the region. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query the most recent region list. If you do not set this parameter, all regions are queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The end of the time range queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>The end time must be later than the start time.</p>
     */
    @NameInMap("TimeMerge")
    public String timeMerge;

    public static DescribeDomainAverageResponseTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAverageResponseTimeRequest self = new DescribeDomainAverageResponseTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAverageResponseTimeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainAverageResponseTimeRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDomainAverageResponseTimeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainAverageResponseTimeRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDomainAverageResponseTimeRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDomainAverageResponseTimeRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDomainAverageResponseTimeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainAverageResponseTimeRequest setTimeMerge(String timeMerge) {
        this.timeMerge = timeMerge;
        return this;
    }
    public String getTimeMerge() {
        return this.timeMerge;
    }

}
