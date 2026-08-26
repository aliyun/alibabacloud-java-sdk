// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePushProxyUsageDataRequest extends TeaModel {
    /**
     * <p>The ingest domain name of the streamer to query.</p>
     * <ul>
     * <li>You can specify a single domain name or multiple domain names separated by commas (,).</li>
     * <li>If this parameter is left empty, the aggregated data of all live streaming domain names is returned by default.</li>
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
     * <p>2022-10-10T21:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The live center to query. You can specify multiple regions separated by commas (,). Valid values:</p>
     * <ul>
     * <li>cn-beijing: Beijing</li>
     * <li>cn-shanghai: Shanghai</li>
     * <li>cn-shenzhen: Shenzhen</li>
     * <li>cn-qingdao: Qingdao</li>
     * <li>ap-southeast-1: Singapore</li>
     * <li>eu-central-1: Germany</li>
     * <li>ap-northeast-1: Tokyo</li>
     * <li>ap-southeast-5: Jakarta</li>
     * </ul>
     * <p>If this parameter is left empty, the aggregated data of all regions is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
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
     * <p>The grouping key. If this parameter is left empty, the default value is region, and the aggregated data is returned. You can specify multiple values separated by commas (,). Valid values:</p>
     * <ul>
     * <li>domain: the domain name. If SplitBy is set to domain, the Domain field in the response takes effect.</li>
     * <li>region (default): the live center region. If SplitBy is set to region, the Region field in the response takes effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>region</p>
     */
    @NameInMap("SplitBy")
    public String splitBy;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC. By default, data from the last seven days is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-10T20:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLivePushProxyUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePushProxyUsageDataRequest self = new DescribeLivePushProxyUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLivePushProxyUsageDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLivePushProxyUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLivePushProxyUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLivePushProxyUsageDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLivePushProxyUsageDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLivePushProxyUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeLivePushProxyUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
