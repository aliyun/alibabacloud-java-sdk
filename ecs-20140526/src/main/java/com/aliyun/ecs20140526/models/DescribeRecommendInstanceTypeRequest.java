// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRecommendInstanceTypeRequest extends TeaModel {
    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("Memory")
    public Double memory;

    @NameInMap("InstanceFamilyLevel")
    public String instanceFamilyLevel;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("NetworkType")
    @Validation(required = true)
    public String networkType;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("InstanceTypeFamily")
    public java.util.List<String> instanceTypeFamily;

    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    @NameInMap("MaxPrice")
    public Double maxPrice;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("Scene")
    public String scene;

    public static DescribeRecommendInstanceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecommendInstanceTypeRequest self = new DescribeRecommendInstanceTypeRequest();
        return TeaModel.build(map, self);
    }

}
