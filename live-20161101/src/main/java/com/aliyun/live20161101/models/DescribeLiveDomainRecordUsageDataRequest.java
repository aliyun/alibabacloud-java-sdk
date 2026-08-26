// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRecordUsageDataRequest extends TeaModel {
    /**
     * <p>The streaming domain name to query.</p>
     * <ul>
     * <li>Supports single or batch domain queries. Separate multiple domain names with commas (,).</li>
     * <li>If this parameter is left empty, the merged data of all live streaming domain names is returned by default.</li>
     * <li>When you specify DomainName, make sure that the specified domain name is a live streaming domain name and that the caller has the required permissions on the domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format in UTC. Requirements:</p>
     * <ul>
     * <li>The end time must be later than the start time (StartTime).</li>
     * <li>The maximum time span between the end time and the start time is 31 days. Requests that exceed 31 days fail and return an error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2021-05-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the queried data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><ol start="60">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="300">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="3600">
     * <li></li>
     * </ol>
     * </li>
     * <li><ol start="86400">
     * <li></li>
     * </ol>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified or an unsupported value is specified, the default time granularity is 300 seconds for query spans within 31 days and 86400 seconds for query spans longer than 31 days.</p>
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
     * <p>The region. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-beijing</strong>: Beijing.</p>
     * </li>
     * <li><p><strong>cn-shanghai</strong>: Shanghai.</p>
     * </li>
     * <li><p><strong>cn-shenzhen</strong>: Shenzhen.</p>
     * </li>
     * <li><p><strong>cn-qingdao</strong>: Qingdao.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: Singapore.</p>
     * </li>
     * <li><p><strong>eu-central-1</strong>: Germany.</p>
     * </li>
     * <li><p><strong>ap-northeast-1</strong>: Tokyo.</p>
     * </li>
     * <li><p><strong>ap-southeast-5</strong>: Jakarta.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The grouping key. Valid values:</p>
     * <ul>
     * <li><strong>domain</strong>: groups query results by domain name.</li>
     * <li><strong>record_fmt</strong>: groups query results by recording type.</li>
     * </ul>
     * <blockquote>
     * <p>You can specify one or more values. Separate multiple values with commas (,). Default value: <code>domain,record_fmt</code>. If this parameter is set to empty or <code>null</code>, the results are not grouped by the preceding keys.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>domain,record_fmt</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format in UTC.</p>
     * <ul>
     * <li>The minimum data granularity is 5 minutes.</li>
     * <li>If this parameter is not specified, data of the last 24 hours is returned by default.</li>
     * </ul>
     * <blockquote>
     * <p>The start time can be set to a point in time within the last 90 days from the current time, accurate to the second.</p>
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
