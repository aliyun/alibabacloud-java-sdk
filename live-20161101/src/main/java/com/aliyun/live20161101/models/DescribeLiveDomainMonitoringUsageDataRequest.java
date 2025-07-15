// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMonitoringUsageDataRequest extends TeaModel {
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
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-10T22:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the monitoring session. If you leave this parameter empty, data of all monitoring sessions is queried by default. Separate multiple session IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>e62af24d-a354-3b0c-9f1f-da592c4b****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time granularity. Valid values: <strong>3600</strong> and <strong>86400</strong>. 3600 specifies that data is queried by hour and 86400 specifies that data is queried by day.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region of the live center. If you leave this parameter empty, data of all regions is queried by default. Separate multiple regions with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The key that is used to group data. Valid values: <strong>domain</strong>, <strong>region</strong>, <strong>instance</strong>, and <strong>resolution</strong>. Default value: <strong>resolution</strong>. resolution specifies that data is grouped by resolution. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>resolution</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
     * <ul>
     * <li>The time must be in UTC.</li>
     * <li>The minimum data granularity is 1 hour.</li>
     * <li>If you leave this parameter empty, data in the previous 24 hours is queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-12-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainMonitoringUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMonitoringUsageDataRequest self = new DescribeLiveDomainMonitoringUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeLiveDomainMonitoringUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
