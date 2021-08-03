// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeModificationPriceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("RootDiskSizeGib")
    public Integer rootDiskSizeGib;

    @NameInMap("UserDiskSizeGib")
    public Integer userDiskSizeGib;

    public static DescribeModificationPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModificationPriceRequest self = new DescribeModificationPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModificationPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeModificationPriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeModificationPriceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeModificationPriceRequest setRootDiskSizeGib(Integer rootDiskSizeGib) {
        this.rootDiskSizeGib = rootDiskSizeGib;
        return this;
    }
    public Integer getRootDiskSizeGib() {
        return this.rootDiskSizeGib;
    }

    public DescribeModificationPriceRequest setUserDiskSizeGib(Integer userDiskSizeGib) {
        this.userDiskSizeGib = userDiskSizeGib;
        return this;
    }
    public Integer getUserDiskSizeGib() {
        return this.userDiskSizeGib;
    }

}
