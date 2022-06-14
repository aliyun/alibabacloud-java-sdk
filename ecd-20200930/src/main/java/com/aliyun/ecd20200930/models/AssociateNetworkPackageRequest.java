// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AssociateNetworkPackageRequest extends TeaModel {
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("RegionId")
    public String regionId;

    public static AssociateNetworkPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkPackageRequest self = new AssociateNetworkPackageRequest();
        return TeaModel.build(map, self);
    }

    public AssociateNetworkPackageRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public AssociateNetworkPackageRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public AssociateNetworkPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
