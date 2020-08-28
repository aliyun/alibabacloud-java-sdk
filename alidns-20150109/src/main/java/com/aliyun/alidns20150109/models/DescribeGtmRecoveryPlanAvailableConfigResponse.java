// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanAvailableConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Instances")
    @Validation(required = true)
    public DescribeGtmRecoveryPlanAvailableConfigResponseInstances instances;

    public static DescribeGtmRecoveryPlanAvailableConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanAvailableConfigResponse self = new DescribeGtmRecoveryPlanAvailableConfigResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool extends TeaModel {
        @NameInMap("AddrPoolId")
        @Validation(required = true)
        public String addrPoolId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool self = new DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        @Validation(required = true)
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool> addrPool;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPools self = new DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPools();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("AddrPools")
        @Validation(required = true)
        public DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPools addrPools;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance self = new DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance> instance;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseInstances self = new DescribeGtmRecoveryPlanAvailableConfigResponseInstances();
            return TeaModel.build(map, self);
        }

    }

}
