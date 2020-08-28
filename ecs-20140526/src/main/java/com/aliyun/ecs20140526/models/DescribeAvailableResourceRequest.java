// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SpotDuration")
    public Integer spotDuration;

    @NameInMap("DestinationResource")
    @Validation(required = true)
    public String destinationResource;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("SystemDiskCategory")
    public String systemDiskCategory;

    @NameInMap("DataDiskCategory")
    public String dataDiskCategory;

    @NameInMap("NetworkCategory")
    public String networkCategory;

    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("Memory")
    public Double memory;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scope")
    public String scope;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

}
