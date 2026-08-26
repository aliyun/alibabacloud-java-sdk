// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveProducerUsageDataRequest extends TeaModel {
    /**
     * <p>The streaming domain name of the cloud producer studio.</p>
     * <ul>
     * <li>Supports single or batch domain name queries. Separate multiple domain names with commas (,) for batch queries.</li>
     * <li>If this parameter is left empty, merged data of all live streaming domain names is returned by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-10-31T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance to query. Batch query is supported. Separate multiple instances with commas (,).</p>
     * <blockquote>
     * <p>If this parameter is left empty, merged data of all instances is returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a17d0184-462d-4630-b2a6-8c26dde2****</p>
     */
    @NameInMap("Instance")
    public String instance;

    /**
     * <p>The time granularity of the queried data. Valid values: 3600 (1 hour) and 86400 (1 day). Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region to which the domain name belongs. If this parameter is left empty, merged data of all regions is returned by default. Batch query is supported. Separate multiple regions with commas (,).</p>
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
     * <p>The grouping key. You can specify one or more of the following: domain, region, instance, or type. Separate multiple values with commas (,). The specified fields will be grouped in the output.</p>
     * <blockquote>
     * <p>If this parameter is left empty, only aggregated data is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The start time. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-09-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The producer type. Batch query is supported. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><p><strong>slidelive</strong>: playlist-based.</p>
     * </li>
     * <li><p><strong>universal</strong>: general-purpose.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is left empty, merged data of all producer types is returned by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>slidelive</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the application to which the stream belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("app")
    public String app;

    public static DescribeLiveProducerUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveProducerUsageDataRequest self = new DescribeLiveProducerUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveProducerUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveProducerUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveProducerUsageDataRequest setInstance(String instance) {
        this.instance = instance;
        return this;
    }
    public String getInstance() {
        return this.instance;
    }

    public DescribeLiveProducerUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveProducerUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveProducerUsageDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveProducerUsageDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveProducerUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeLiveProducerUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveProducerUsageDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeLiveProducerUsageDataRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

}
