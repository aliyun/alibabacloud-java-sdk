// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class LiveUpstreamQosDataRequest extends TeaModel {
    @NameInMap("CdnDomains")
    public java.util.List<String> cdnDomains;

    @NameInMap("CdnIsps")
    public java.util.List<String> cdnIsps;

    @NameInMap("CdnProvinces")
    public java.util.List<String> cdnProvinces;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("KwaiSidcs")
    public java.util.List<String> kwaiSidcs;

    @NameInMap("KwaiTsc")
    public java.util.List<Integer> kwaiTsc;

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
    public java.util.List<String> upstreamDomains;

    public static LiveUpstreamQosDataRequest build(java.util.Map<String, ?> map) throws Exception {
        LiveUpstreamQosDataRequest self = new LiveUpstreamQosDataRequest();
        return TeaModel.build(map, self);
    }

    public LiveUpstreamQosDataRequest setCdnDomains(java.util.List<String> cdnDomains) {
        this.cdnDomains = cdnDomains;
        return this;
    }
    public java.util.List<String> getCdnDomains() {
        return this.cdnDomains;
    }

    public LiveUpstreamQosDataRequest setCdnIsps(java.util.List<String> cdnIsps) {
        this.cdnIsps = cdnIsps;
        return this;
    }
    public java.util.List<String> getCdnIsps() {
        return this.cdnIsps;
    }

    public LiveUpstreamQosDataRequest setCdnProvinces(java.util.List<String> cdnProvinces) {
        this.cdnProvinces = cdnProvinces;
        return this;
    }
    public java.util.List<String> getCdnProvinces() {
        return this.cdnProvinces;
    }

    public LiveUpstreamQosDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LiveUpstreamQosDataRequest setKwaiSidcs(java.util.List<String> kwaiSidcs) {
        this.kwaiSidcs = kwaiSidcs;
        return this;
    }
    public java.util.List<String> getKwaiSidcs() {
        return this.kwaiSidcs;
    }

    public LiveUpstreamQosDataRequest setKwaiTsc(java.util.List<Integer> kwaiTsc) {
        this.kwaiTsc = kwaiTsc;
        return this;
    }
    public java.util.List<Integer> getKwaiTsc() {
        return this.kwaiTsc;
    }

    public LiveUpstreamQosDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public LiveUpstreamQosDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public LiveUpstreamQosDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public LiveUpstreamQosDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public LiveUpstreamQosDataRequest setUpstreamDomains(java.util.List<String> upstreamDomains) {
        this.upstreamDomains = upstreamDomains;
        return this;
    }
    public java.util.List<String> getUpstreamDomains() {
        return this.upstreamDomains;
    }

}
