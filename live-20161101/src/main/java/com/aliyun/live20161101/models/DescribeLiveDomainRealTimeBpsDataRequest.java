// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeBpsDataRequest extends TeaModel {
    /**
     * <p>The streaming domain.</p>
     * <p>Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example1.aliyundoc.com,example2.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. It must be later than the start time. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z (UTC).</p>
     * <blockquote>
     * <p>If you do not specify this parameter, data within one hour of the start time is queried by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-11-30T05:40:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The English name of the carrier.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The English name of the region.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/91077.html">DescribeCdnRegionAndIsp</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>tianjin</p>
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
     * <p>The start time. The format is <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2015-11-30T05:39:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainRealTimeBpsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeBpsDataRequest self = new DescribeLiveDomainRealTimeBpsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeBpsDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeBpsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeBpsDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeLiveDomainRealTimeBpsDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeLiveDomainRealTimeBpsDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainRealTimeBpsDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDomainRealTimeBpsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
