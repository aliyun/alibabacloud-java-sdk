// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LiveUpstreamQosDataShrinkRequest extends TeaModel {
    @NameInMap("CdnDomains")
    public String cdnDomainsShrink;

    @NameInMap("CdnIsps")
    public String cdnIspsShrink;

    @NameInMap("CdnProvinces")
    public String cdnProvincesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("KwaiSidcs")
    public String kwaiSidcsShrink;

    @NameInMap("KwaiTsc")
    public String kwaiTscShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Region")
    public String region;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("UpstreamDomains")
    public String upstreamDomainsShrink;

    public static LiveUpstreamQosDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        LiveUpstreamQosDataShrinkRequest self = new LiveUpstreamQosDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public LiveUpstreamQosDataShrinkRequest setCdnDomainsShrink(String cdnDomainsShrink) {
        this.cdnDomainsShrink = cdnDomainsShrink;
        return this;
    }
    public String getCdnDomainsShrink() {
        return this.cdnDomainsShrink;
    }

    public LiveUpstreamQosDataShrinkRequest setCdnIspsShrink(String cdnIspsShrink) {
        this.cdnIspsShrink = cdnIspsShrink;
        return this;
    }
    public String getCdnIspsShrink() {
        return this.cdnIspsShrink;
    }

    public LiveUpstreamQosDataShrinkRequest setCdnProvincesShrink(String cdnProvincesShrink) {
        this.cdnProvincesShrink = cdnProvincesShrink;
        return this;
    }
    public String getCdnProvincesShrink() {
        return this.cdnProvincesShrink;
    }

    public LiveUpstreamQosDataShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LiveUpstreamQosDataShrinkRequest setKwaiSidcsShrink(String kwaiSidcsShrink) {
        this.kwaiSidcsShrink = kwaiSidcsShrink;
        return this;
    }
    public String getKwaiSidcsShrink() {
        return this.kwaiSidcsShrink;
    }

    public LiveUpstreamQosDataShrinkRequest setKwaiTscShrink(String kwaiTscShrink) {
        this.kwaiTscShrink = kwaiTscShrink;
        return this;
    }
    public String getKwaiTscShrink() {
        return this.kwaiTscShrink;
    }

    public LiveUpstreamQosDataShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public LiveUpstreamQosDataShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public LiveUpstreamQosDataShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public LiveUpstreamQosDataShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public LiveUpstreamQosDataShrinkRequest setUpstreamDomainsShrink(String upstreamDomainsShrink) {
        this.upstreamDomainsShrink = upstreamDomainsShrink;
        return this;
    }
    public String getUpstreamDomainsShrink() {
        return this.upstreamDomainsShrink;
    }

}
