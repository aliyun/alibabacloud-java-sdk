// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSyncStatusRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeSyncStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncStatusRequest self = new DescribeSyncStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncStatusRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeSyncStatusRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeSyncStatusRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeSyncStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSyncStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
