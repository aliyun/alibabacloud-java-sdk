// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the on-demand instance.</p>
     */
    @NameInMap("Instances")
    public java.util.List<DescribeOnDemandInstanceResponseBodyInstances> instances;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries that were returned.</p>
     */
    @NameInMap("Total")
    public String total;

    public static DescribeOnDemandInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceResponseBody self = new DescribeOnDemandInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceResponseBody setInstances(java.util.List<DescribeOnDemandInstanceResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeOnDemandInstanceResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeOnDemandInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnDemandInstanceResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class DescribeOnDemandInstanceResponseBodyInstances extends TeaModel {
        /**
         * <p>The protection status of the on-demand instance. Valid values:</p>
         * <br>
         * <p>- **Defense**: The on-demand instance is protecting your assets, which indicates that traffic is routed to the on-demand instance.</p>
         * <p>- **UnDefense**: The on-demand instance does not protect your assets.</p>
         */
        @NameInMap("DefenseStatus")
        public String defenseStatus;

        /**
         * <p>The ID of the on-demand instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The CIDR block of the on-demand instance.</p>
         */
        @NameInMap("Ipnet")
        public java.util.List<String> ipnet;

        /**
         * <p>The region ID of the on-demand instance.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The description of the on-demand instance.</p>
         */
        @NameInMap("Remark")
        public String remark;

        public static DescribeOnDemandInstanceResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnDemandInstanceResponseBodyInstances self = new DescribeOnDemandInstanceResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeOnDemandInstanceResponseBodyInstances setDefenseStatus(String defenseStatus) {
            this.defenseStatus = defenseStatus;
            return this;
        }
        public String getDefenseStatus() {
            return this.defenseStatus;
        }

        public DescribeOnDemandInstanceResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOnDemandInstanceResponseBodyInstances setIpnet(java.util.List<String> ipnet) {
            this.ipnet = ipnet;
            return this;
        }
        public java.util.List<String> getIpnet() {
            return this.ipnet;
        }

        public DescribeOnDemandInstanceResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOnDemandInstanceResponseBodyInstances setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
