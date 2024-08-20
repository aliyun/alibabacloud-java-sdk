// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainIpaTrafficDataRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     * <p>Separate multiple domain names with commas (,). If you do not specify a value for this parameter, data for all accelerated domain names is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specify whether to implement padding with zeros. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FixTimeGap")
    public String fixTimeGap;

    /**
     * <p>The time granularity of data entries. Unit: seconds.</p>
     * <p>The time granularity varies with the time range specified by <strong>StartTime</strong> and <strong>EndTime</strong>.</p>
     * <ul>
     * <li>If the time range between StartTime and EndTime is less than 3 days, the valid values are <strong>300</strong>, <strong>3600</strong>, and <strong>86400</strong>. If you do not specify a value for this parameter, <strong>300</strong> is used.</li>
     * <li>If the time range between StartTime and EndTime is greater than or equal to 3 days and less than 31 days, the valid values are <strong>3600</strong> and <strong>86400</strong>. Default value: <strong>3600</strong>.</li>
     * <li>If the time range between StartTime and EndTime is 31 days or longer, the valid value is <strong>86400</strong>. Default value: <strong>86400</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/207199.html">DescribeDcdnRegionAndIsp</a> operation to query ISPs.</p>
     * 
     * <strong>example:</strong>
     * <p>unicom</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/207199.html">DescribeDcdnRegionAndIsp</a> operation to query regions.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Specifies whether to automatically calculate the value of the <strong>interval</strong>. If the <strong>timeMerge</strong> parameter is set to <strong>1</strong>, the value of <strong>inteval</strong> is calculated based on <strong>StartTime</strong> and <strong>EndTime</strong>. You can set either this parameter or the <strong>interval</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
