// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainBpsDataByLayerRequest extends TeaModel {
    /**
     * <p>The streaming domain. You can specify multiple domain names separated by commas (,). If this parameter is left empty, the aggregated data of all domain names is returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>pull.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query, in the format of <i>yyyy-MM-ddTHH:mm:ssZ</i> (UTC). The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-03-16T16:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time granularity of the data to query. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p><strong>300</strong></p>
     * </li>
     * <li><p><strong>3600</strong></p>
     * </li>
     * <li><p><strong>86400</strong></p>
     * <blockquote>
     * <ul>
     * <li>Time range ≤ 3 days: Valid data timestamp granularity values are 300, 3600, and 86400.</li>
     * <li>3 days &lt; time range ≤ 31 days: Valid data timestamp granularity values are 3600 and 86400.</li>
     * <li>Time range &gt; 31 days: The only valid value is 86400.</li>
     * <li>If this parameter is not specified or the specified value is not supported, the default value 300 is used.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the Internet service provider (ISP) in English. If this parameter is not specified, data for all ISPs is returned.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeLiveRegionAndIsp</a> operation to query the English names of regions and ISPs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tele***</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The query dimension. Valid values:</p>
     * <ul>
     * <li><p>Network layer (IPv4, IPv6)</p>
     * </li>
     * <li><p>Application layer (http, https, quic)</p>
     * </li>
     * <li><p>all (default)</p>
     * </li>
     * </ul>
     * <p>Valid values: all | IPv4 | IPv6 | http | https | quic (case-sensitive).</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Layer")
    public String layer;

    /**
     * <p>The name of the region in English. If this parameter is not specified, data for all regions is returned.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/91077.html">DescribeLiveRegionAndIsp</a> operation to query the English names of regions and ISPs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hangzhou</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query, in the format of <i>yyyy-MM-ddTHH:mm:ssZ</i> (UTC).</p>
     * <blockquote>
     * <p>If this parameter is not specified, data for the last 24 hours is returned by default. The minimum data granularity is 5 minutes.</p>
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
