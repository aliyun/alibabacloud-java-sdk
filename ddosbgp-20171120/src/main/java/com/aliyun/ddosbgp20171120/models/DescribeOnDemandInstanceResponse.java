// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public String total;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<DescribeOnDemandInstanceResponseInstances> instances;

    public static DescribeOnDemandInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceResponse self = new DescribeOnDemandInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnDemandInstanceResponse setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public DescribeOnDemandInstanceResponse setInstances(java.util.List<DescribeOnDemandInstanceResponseInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeOnDemandInstanceResponseInstances> getInstances() {
        return this.instances;
    }

    public static class DescribeOnDemandInstanceResponseInstances extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("DefenseStatus")
        @Validation(required = true)
        public String defenseStatus;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Ipnet")
        @Validation(required = true)
        public java.util.List<String> ipnet;

        public static DescribeOnDemandInstanceResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnDemandInstanceResponseInstances self = new DescribeOnDemandInstanceResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeOnDemandInstanceResponseInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOnDemandInstanceResponseInstances setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeOnDemandInstanceResponseInstances setDefenseStatus(String defenseStatus) {
            this.defenseStatus = defenseStatus;
            return this;
        }
        public String getDefenseStatus() {
            return this.defenseStatus;
        }

        public DescribeOnDemandInstanceResponseInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOnDemandInstanceResponseInstances setIpnet(java.util.List<String> ipnet) {
            this.ipnet = ipnet;
            return this;
        }
        public java.util.List<String> getIpnet() {
            return this.ipnet;
        }

    }

}
