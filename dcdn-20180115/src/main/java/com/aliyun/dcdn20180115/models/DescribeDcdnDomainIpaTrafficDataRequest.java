// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaTrafficDataRequest extends TeaModel {
    /**
     * <p>The name of the accelerated domain name.</p>
     * <br>
     * <p>You can specify one or more accelerated domain names. Separate them with commas (,). By default, all accelerated domain names that belong to your Alibaba Cloud account are queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specify whether to implement padding with zeros. Valid values:</p>
     * <br>
     * <p>*   **true**: Yes</p>
     * <p>*   **false**: No</p>
     */
    @NameInMap("FixTimeGap")
    public String fixTimeGap;

    /**
     * <p>The time interval between the data entries returned. Unit: seconds.</p>
     * <br>
     * <p>The valid values vary based on the values of the **StartTime** and **EndTime** parameters. Valid values:</p>
     * <br>
     * <p>*   If the time range between StartTime and EndTime is less than 3 days, valid values are **300**, **3600**, and **86400**. Default value: **300**.</p>
     * <p>*   If the time range between StartTime and EndTime is from 3 to 31 days (31 days excluded), valid values are **3600** and **86400**. Default value: **3600**.</p>
     * <p>*   If the time range between StartTime and EndTime is 31 days or longer, the valid value is **86400**. Default value: **86400**.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP) for Dynamic Route for CDN (DCDN).</p>
     * <br>
     * <p>You can call the [DescribeCdnRegionAndIsp](~~207199~~) operation to query the most recent ISP list. If you do not specify an ISP, all ISPs are queried.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region.</p>
     * <br>
     * <p>You can call the [DescribeCdnRegionAndIsp](~~207199~~) operation to query the most recent region list. If you do not specify a region, all regions are queried.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC+0.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Specify whether to automatically calculate the value of the **Interval** parameter. If you set the **TimeMerge** parameter to **1**, the value of the **Interval** parameter is automatically assigned based on the **StartTime** and **EndTime** parameters. You can set this parameter or the **Interval** parameter.</p>
     */
    @NameInMap("TimeMerge")
    public String timeMerge;

    public static DescribeDcdnDomainIpaTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaTrafficDataRequest self = new DescribeDcdnDomainIpaTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaTrafficDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIpaTrafficDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIpaTrafficDataRequest setFixTimeGap(String fixTimeGap) {
        this.fixTimeGap = fixTimeGap;
        return this;
    }
    public String getFixTimeGap() {
        return this.fixTimeGap;
    }

    public DescribeDcdnDomainIpaTrafficDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDcdnDomainIpaTrafficDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDcdnDomainIpaTrafficDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDcdnDomainIpaTrafficDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainIpaTrafficDataRequest setTimeMerge(String timeMerge) {
        this.timeMerge = timeMerge;
        return this;
    }
    public String getTimeMerge() {
        return this.timeMerge;
    }

}
