// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeContainerGroupPriceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Cpu")
    public Double cpu;

    @NameInMap("Memory")
    public Double memory;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SpotPriceLimit")
    public Double spotPriceLimit;

    public static DescribeContainerGroupPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerGroupPriceRequest self = new DescribeContainerGroupPriceRequest();
        return TeaModel.build(map, self);
    }

}
