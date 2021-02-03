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

    public DescribeGtmRecoveryPlanAvailableConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponse setInstances(DescribeGtmRecoveryPlanAvailableConfigResponseInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeGtmRecoveryPlanAvailableConfigResponseInstances getInstances() {
        return this.instances;
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

        public DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPools setAddrPool(java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool> addrPool) {
            this.addrPool = addrPool;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPoolsAddrPool> getAddrPool() {
            return this.addrPool;
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

        public DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance setAddrPools(DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPools addrPools) {
            this.addrPools = addrPools;
            return this;
        }
        public DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstanceAddrPools getAddrPools() {
            return this.addrPools;
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

        public DescribeGtmRecoveryPlanAvailableConfigResponseInstances setInstance(java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
