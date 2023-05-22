// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaBpsDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * <br>
     * <p>Separate multiple domain names with commas (,). If you leave this parameter empty, all accelerated domain names are queried.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to implement padding with zeros. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("FixTimeGap")
    public String fixTimeGap;

    /**
     * <p>The time granularity of data entries. Unit: seconds.</p>
     * <br>
     * <p>The time granularity varies with the time range specified by **StartTime** and **EndTime**.</p>
     * <br>
     * <p>*   If the time range between StartTime and EndTime is less than 3 days, the valid values are **300**, **3600**, and **86400**. If you leave this parameter empty, **300** is used.</p>
     * <p>*   If the time range between StartTime and EndTime is greater than or equal to 3 days and less than 31 days, the valid values are **3600** and **86400**. Default value: **3600**.</p>
     * <p>*   If the time range between StartTime and EndTime is 31 days or longer, the valid value is **86400**. Default value: **86400**.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP).</p>
     * <br>
     * <p>You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query ISPs.</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region.</p>
     * <br>
     * <p>You can call the [DescribeDcdnRegionAndIsp](~~207199~~) operation to query regions.</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The beginning of the time range to query.</p>
     * <br>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Specifies whether to automatically set the interval. If you set **TimeMerge** to **1**, the value of the **Interval** parameter is automatically assigned based on the **startTime** and **endTime** parameters. You can specify either this parameter or the **Interval** parameter.</p>
     */
    @NameInMap("TimeMerge")
    public String timeMerge;

    public static DescribeDcdnDomainIpaBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainIpaBpsDataRequest self = new DescribeDcdnDomainIpaBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainIpaBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainIpaBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnDomainIpaBpsDataRequest setFixTimeGap(String fixTimeGap) {
        this.fixTimeGap = fixTimeGap;
        return this;
    }
    public String getFixTimeGap() {
        return this.fixTimeGap;
    }

    public DescribeDcdnDomainIpaBpsDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDcdnDomainIpaBpsDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeDcdnDomainIpaBpsDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeDcdnDomainIpaBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDcdnDomainIpaBpsDataRequest setTimeMerge(String timeMerge) {
        this.timeMerge = timeMerge;
        return this;
    }
    public String getTimeMerge() {
        return this.timeMerge;
    }

}
