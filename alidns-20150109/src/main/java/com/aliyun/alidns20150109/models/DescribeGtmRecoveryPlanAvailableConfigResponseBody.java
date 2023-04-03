// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanAvailableConfigResponseBody extends TeaModel {
    /**
     * <p>The list of GTM instances involved in the disaster recovery plan.</p>
     */
    @NameInMap("Instances")
    public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances instances;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGtmRecoveryPlanAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanAvailableConfigResponseBody self = new DescribeGtmRecoveryPlanAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponseBody setInstances(DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool extends TeaModel {
        /**
         * <p>The ID of the address pool.</p>
         */
        @NameInMap("AddrPoolId")
        public String addrPoolId;

        /**
         * <p>The name of the address pool.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool self = new DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPools extends TeaModel {
        @NameInMap("AddrPool")
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool> addrPool;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPools self = new DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPools setAddrPool(java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool> addrPool) {
            this.addrPool = addrPool;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPoolsAddrPool> getAddrPool() {
            return this.addrPool;
        }

    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance extends TeaModel {
        /**
         * <p>The list of address pools for the GTM instance.</p>
         */
        @NameInMap("AddrPools")
        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPools addrPools;

        /**
         * <p>The ID of the GTM instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the GTM instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance self = new DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance setAddrPools(DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPools addrPools) {
            this.addrPools = addrPools;
            return this;
        }
        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstanceAddrPools getAddrPools() {
            return this.addrPools;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance> instance;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances self = new DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances setInstance(java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
