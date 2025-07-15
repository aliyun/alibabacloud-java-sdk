// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainRealTimeHttpCodeDataRequest extends TeaModel {
    /**
     * <p>The streaming domain.</p>
     * <p>Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> If you specify neither the StartTime parameter nor the EndTime parameter, the data of the last <strong>1</strong> hour is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-11-30T05:40:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the Internet service provider (ISP).</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/448109.html">DescribeCdnRegionAndIsp</a> operation to query a list of available ISPs.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba</p>
     */
    @NameInMap("IspNameEn")
    public String ispNameEn;

    /**
     * <p>The name of the region.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/448109.html">DescribeCdnRegionAndIsp</a> operation to query a list of available regions.</p>
     * 
     * <strong>example:</strong>
     * <p>tianjin</p>
     */
    @NameInMap("LocationNameEn")
    public String locationNameEn;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> If you specify neither the StartTime parameter nor the EndTime parameter, the data of the last <strong>1</strong> hour is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2015-11-30T05:39:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeLiveDomainRealTimeHttpCodeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainRealTimeHttpCodeDataRequest self = new DescribeLiveDomainRealTimeHttpCodeDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainRealTimeHttpCodeDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataRequest setIspNameEn(String ispNameEn) {
        this.ispNameEn = ispNameEn;
        return this;
    }
    public String getIspNameEn() {
        return this.ispNameEn;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataRequest setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn;
        return this;
    }
    public String getLocationNameEn() {
        return this.locationNameEn;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLiveDomainRealTimeHttpCodeDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
