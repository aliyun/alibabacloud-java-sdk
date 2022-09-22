// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeVpcHavsInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpcHavsInstances")
    public VpcHavsInstances vpcHavsInstances;

    public static DescribeVpcHavsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHavsInstancesResponseBody self = new DescribeVpcHavsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHavsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcHavsInstancesResponseBody setVpcHavsInstances(VpcHavsInstances vpcHavsInstances) {
        this.vpcHavsInstances = vpcHavsInstances;
        return this;
    }
    public VpcHavsInstances getVpcHavsInstances() {
        return this.vpcHavsInstances;
    }

    public static class HavsInstance extends TeaModel {
        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("Reason")
        public String reason;

        public static HavsInstance build(java.util.Map<String, ?> map) throws Exception {
            HavsInstance self = new HavsInstance();
            return TeaModel.build(map, self);
        }

        public HavsInstance setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public HavsInstance setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class HavsInstances extends TeaModel {
        @NameInMap("HavsInstance")
        public java.util.List<HavsInstance> havsInstance;

        public static HavsInstances build(java.util.Map<String, ?> map) throws Exception {
            HavsInstances self = new HavsInstances();
            return TeaModel.build(map, self);
        }

        public HavsInstances setHavsInstance(java.util.List<HavsInstance> havsInstance) {
            this.havsInstance = havsInstance;
            return this;
        }
        public java.util.List<HavsInstance> getHavsInstance() {
            return this.havsInstance;
        }

    }

    public static class VpcHavsInstance extends TeaModel {
        @NameInMap("HavsInstances")
        public HavsInstances havsInstances;

        @NameInMap("VpcId")
        public String vpcId;

        public static VpcHavsInstance build(java.util.Map<String, ?> map) throws Exception {
            VpcHavsInstance self = new VpcHavsInstance();
            return TeaModel.build(map, self);
        }

        public VpcHavsInstance setHavsInstances(HavsInstances havsInstances) {
            this.havsInstances = havsInstances;
            return this;
        }
        public HavsInstances getHavsInstances() {
            return this.havsInstances;
        }

        public VpcHavsInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class VpcHavsInstances extends TeaModel {
        @NameInMap("VpcHavsInstance")
        public java.util.List<VpcHavsInstance> vpcHavsInstance;

        public static VpcHavsInstances build(java.util.Map<String, ?> map) throws Exception {
            VpcHavsInstances self = new VpcHavsInstances();
            return TeaModel.build(map, self);
        }

        public VpcHavsInstances setVpcHavsInstance(java.util.List<VpcHavsInstance> vpcHavsInstance) {
            this.vpcHavsInstance = vpcHavsInstance;
            return this;
        }
        public java.util.List<VpcHavsInstance> getVpcHavsInstance() {
            return this.vpcHavsInstance;
        }

    }

}
