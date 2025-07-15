// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MiguLivePullToPushStartRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MiguData")
    public String miguData;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static MiguLivePullToPushStartRequest build(java.util.Map<String, ?> map) throws Exception {
        MiguLivePullToPushStartRequest self = new MiguLivePullToPushStartRequest();
        return TeaModel.build(map, self);
    }

    public MiguLivePullToPushStartRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public MiguLivePullToPushStartRequest setMiguData(String miguData) {
        this.miguData = miguData;
        return this;
    }
    public String getMiguData() {
        return this.miguData;
    }

    public MiguLivePullToPushStartRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MiguLivePullToPushStartRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
