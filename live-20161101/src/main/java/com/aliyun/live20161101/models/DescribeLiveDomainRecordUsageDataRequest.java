// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRecordUsageDataRequest extends TeaModel {
    /**
     * <p>The main streaming domain to query.</p>
     * <ul>
     * <li>You can query one or more domain names. If you specify multiple domain names, separate them with commas (,).</li>
     * <li>If you leave this parameter empty, the data of all domain names within your Alibaba Cloud account is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC. Value requirements:</p>
     * <ul>
     * <li>The end time is later than the start time.</li>
     * <li>The time range between the start time and end time is up to 31 days. If the time range is more than 31 days, the request fails and an error is reported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2021-05-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>60</li>
     * <li>300</li>
     * <li>3600</li>
     * <li>86400</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter or specify an invalid value: The time granularity of the query for a time range that is less than or equal to 31 days is 300 seconds by default. The time granularity of the query for a time range that is more than 31 days is 86400 seconds by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>cn-qingdao</strong>: China (Qingdao)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
     * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
     * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The key that is used to group data. Valid values:</p>
     * <ul>
     * <li><strong>domain</strong>: groups results by domain name.</li>
     * <li><strong>record_fmt</strong>: groups results by recording type.</li>
     * </ul>
     * <blockquote>
     * <p> You can select one option or both. If you want to select both options, separate them with a comma (,). The default value is <code>domain,record_fmt</code>. If you leave this parameter empty or set the value to <code>null</code>, this parameter is ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>domain,record_fmt</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <ul>
     * <li>The minimum data granularity is 5 minutes.</li>
     * <li>If you do not specify this parameter, the data in the last 24 hours is returned.</li>
     * </ul>
     * <blockquote>
     * <p>The earliest start time that you can specify is 90 days back from the current time, accurate to seconds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-05-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainRecordUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRecordUsageDataRequest self = new DescribeLiveDomainRecordUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRecordUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRecordUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRecordUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveDomainRecordUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainRecordUsageDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveDomainRecordUsageDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDomainRecordUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeLiveDomainRecordUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
