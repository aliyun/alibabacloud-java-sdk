// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Instances")
    @Validation(required = true)
    public DescribeAutoProvisioningGroupInstancesResponseInstances instances;

    public static DescribeAutoProvisioningGroupInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupInstancesResponse self = new DescribeAutoProvisioningGroupInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAutoProvisioningGroupInstancesResponseInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("CPU")
        @Validation(required = true)
        public Integer CPU;

        @NameInMap("Memory")
        @Validation(required = true)
        public Integer memory;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("IsSpot")
        @Validation(required = true)
        public Boolean isSpot;

        @NameInMap("IoOptimized")
        @Validation(required = true)
        public Boolean ioOptimized;

        @NameInMap("NetworkType")
        @Validation(required = true)
        public String networkType;

        @NameInMap("OsType")
        @Validation(required = true)
        public String osType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DescribeAutoProvisioningGroupInstancesResponseInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupInstancesResponseInstancesInstance self = new DescribeAutoProvisioningGroupInstancesResponseInstancesInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAutoProvisioningGroupInstancesResponseInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeAutoProvisioningGroupInstancesResponseInstancesInstance> instance;

        public static DescribeAutoProvisioningGroupInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupInstancesResponseInstances self = new DescribeAutoProvisioningGroupInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

    }

}
