// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class MiguLivePullToPushStatusRequest extends TeaModel {
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

    public static MiguLivePullToPushStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        MiguLivePullToPushStatusRequest self = new MiguLivePullToPushStatusRequest();
        return TeaModel.build(map, self);
    }

    public MiguLivePullToPushStatusRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public MiguLivePullToPushStatusRequest setMiguData(String miguData) {
        this.miguData = miguData;
        return this;
    }
    public String getMiguData() {
        return this.miguData;
    }

    public MiguLivePullToPushStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MiguLivePullToPushStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
