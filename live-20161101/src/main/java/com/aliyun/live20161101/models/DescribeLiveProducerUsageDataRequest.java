// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveProducerUsageDataRequest extends TeaModel {
    /**
     * <p>The streaming domain of the production studio.</p>
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
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2018-10-31T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The production studio instance that you want to query. You can specify one or more production studio instances. Separate multiple instances with commas (,).</p>
     * <blockquote>
     * <p> If you do not set this parameter, the usage data of all production studio instances is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a17d0184-462d-4630-b2a6-8c26dde2****</p>
     */
    @NameInMap("Instance")
    public String instance;

    /**
     * <p>The time granularity for a query. Valid values: 3600 and 86400. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region in which the domain name resides. If you leave this parameter empty, the data of all regions is returned. You can specify multiple regions by separating them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The key that is used to group data. You can specify one or more keys. Separate multiple keys with commas (,). Valid values: domain, region, instance, and type. The data for a key that you specify by using the SplitBy parameter is returned by group.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the aggregated data is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>type</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-09-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of the production studio. You can specify one or more production studio types. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>slidelive</strong>: playlist-mode studio.</li>
     * <li><strong>universal</strong>: general studio.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not set this parameter, the usage data of all types of production studios is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>slidelive</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The name of the application to which the live stream belongs.</p>
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
