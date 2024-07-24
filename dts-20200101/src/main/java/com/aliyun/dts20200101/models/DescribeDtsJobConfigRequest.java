// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsJobConfigRequest extends TeaModel {
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("ForAcceleration")
    public String forAcceleration;

    @NameInMap("Module")
    public String module;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeDtsJobConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsJobConfigRequest self = new DescribeDtsJobConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDtsJobConfigRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDtsJobConfigRequest setForAcceleration(String forAcceleration) {
        this.forAcceleration = forAcceleration;
        return this;
    }
    public String getForAcceleration() {
        return this.forAcceleration;
    }

    public DescribeDtsJobConfigRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribeDtsJobConfigRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeDtsJobConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDtsJobConfigRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
