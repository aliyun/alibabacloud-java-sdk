// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanAvailableConfigResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGtmRecoveryPlanAvailableConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanAvailableConfigResponseBody self = new DescribeGtmRecoveryPlanAvailableConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponseBody setInstances(java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeGtmRecoveryPlanAvailableConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools extends TeaModel {
        @NameInMap("AddrPoolId")
        public String addrPoolId;

        @NameInMap("Name")
        public String name;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools self = new DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools setAddrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances extends TeaModel {
        @NameInMap("AddrPools")
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools> addrPools;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances self = new DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances setAddrPools(java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools> addrPools) {
            this.addrPools = addrPools;
            return this;
        }
        public java.util.List<DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstancesAddrPools> getAddrPools() {
            return this.addrPools;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeGtmRecoveryPlanAvailableConfigResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
