// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataByLayerRequest extends TeaModel {
    /**
     * <p>The streaming domain. You can specify multiple domain names by separating them with commas (,). If you leave this parameter empty, the data of all domain names within your Alibaba Cloud account is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>pull.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-16T16:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><strong>300</strong></li>
     * <li><strong>3600</strong></li>
     * <li><strong>86400</strong></li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the time range specified by the StartTime and EndTime parameters is smaller than or equal to 3 days, the supported time granularities include 300, 3,600, and 86,400 seconds.</p>
     * </li>
     * <li><p>If the time range is larger than 3 days but smaller than or equal to 31 days, the supported time granularities include 3,600 and 86,400 seconds.</p>
     * </li>
     * <li><p>If the time range is larger than 31 days, the supported time granularity is 86,400 seconds.</p>
     * </li>
     * <li><p>If you specify an invalid value or do not specify this parameter, the default time granularity of 300 seconds is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP). If you do not specify this parameter, the data of all ISPs is returned.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeLiveRegionAndIsp</a> operation to query available regions and ISPs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tele***</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The layer at which you want to query the data. Valid values:</p>
     * <ul>
     * <li>IPv4 and IPv6 (network layer)</li>
     * <li>http, https, and quic (application layer)</li>
     * <li>all (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The name of the region. If you do not specify this parameter, the data of all regions is returned.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeLiveRegionAndIsp</a> operation to query available regions and ISPs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time must be displayed in UTC.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the data of the last 24 hours is returned by default. The minimum time granularity is 5 minutes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-03-15T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainBpsDataByLayerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainBpsDataByLayerRequest self = new DescribeLiveDomainBpsDataByLayerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainBpsDataByLayerRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainBpsDataByLayerRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainBpsDataByLayerRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeLiveDomainBpsDataByLayerRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeLiveDomainBpsDataByLayerRequest setLayer(String layer) {
        this.layer = layer;
        return this;
    }
    public String getLayer() {
        return this.layer;
    }

    public DescribeLiveDomainBpsDataByLayerRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeLiveDomainBpsDataByLayerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainBpsDataByLayerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDomainBpsDataByLayerRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
