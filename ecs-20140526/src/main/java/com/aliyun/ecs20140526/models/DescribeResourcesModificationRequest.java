// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourcesModificationRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ResourceId")
    @Validation(required = true)
    public String resourceId;

    @NameInMap("MigrateAcrossZone")
    public Boolean migrateAcrossZone;

    @NameInMap("DestinationResource")
    @Validation(required = true)
    public String destinationResource;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("Memory")
    public Double memory;

    public static DescribeResourcesModificationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesModificationRequest self = new DescribeResourcesModificationRequest();
        return TeaModel.build(map, self);
    }

}
