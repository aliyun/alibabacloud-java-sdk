// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListRegionsRequest extends TeaModel {
    @NameInMap("ak")
    public String ak;

    @NameInMap("cloudType")
    public String cloudType;

    @NameInMap("region")
    public String region;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("sk")
    public String sk;

    @NameInMap("tenantId")
    public String tenantId;

    public static ListRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsRequest self = new ListRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionsRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public ListRegionsRequest setCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public String getCloudType() {
        return this.cloudType;
    }

    public ListRegionsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListRegionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListRegionsRequest setSk(String sk) {
        this.sk = sk;
        return this;
    }
    public String getSk() {
        return this.sk;
    }

    public ListRegionsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
