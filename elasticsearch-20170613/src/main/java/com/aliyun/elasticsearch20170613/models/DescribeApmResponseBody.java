// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeApmResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeApmResponseBodyResult result;

    public static DescribeApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApmResponseBody self = new DescribeApmResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApmResponseBody setResult(DescribeApmResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeApmResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeApmResponseBodyResult extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DeployedReplica")
        public Long deployedReplica;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NodeAmount")
        public Long nodeAmount;

        @NameInMap("OutputES")
        public String outputES;

        @NameInMap("OutputESUserName")
        public String outputESUserName;

        @NameInMap("OutputEsDescription")
        public String outputEsDescription;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("PaymentType")
        public String paymentType;

        @NameInMap("Region")
        public String region;

        @NameInMap("Replica")
        public Long replica;

        @NameInMap("ResourceSpec")
        public String resourceSpec;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VsArea")
        public String vsArea;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeApmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeApmResponseBodyResult self = new DescribeApmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeApmResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeApmResponseBodyResult setDeployedReplica(Long deployedReplica) {
            this.deployedReplica = deployedReplica;
            return this;
        }
        public Long getDeployedReplica() {
            return this.deployedReplica;
        }

        public DescribeApmResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeApmResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeApmResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeApmResponseBodyResult setNodeAmount(Long nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Long getNodeAmount() {
            return this.nodeAmount;
        }

        public DescribeApmResponseBodyResult setOutputES(String outputES) {
            this.outputES = outputES;
            return this;
        }
        public String getOutputES() {
            return this.outputES;
        }

        public DescribeApmResponseBodyResult setOutputESUserName(String outputESUserName) {
            this.outputESUserName = outputESUserName;
            return this;
        }
        public String getOutputESUserName() {
            return this.outputESUserName;
        }

        public DescribeApmResponseBodyResult setOutputEsDescription(String outputEsDescription) {
            this.outputEsDescription = outputEsDescription;
            return this;
        }
        public String getOutputEsDescription() {
            return this.outputEsDescription;
        }

        public DescribeApmResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeApmResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeApmResponseBodyResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeApmResponseBodyResult setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public DescribeApmResponseBodyResult setResourceSpec(String resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public String getResourceSpec() {
            return this.resourceSpec;
        }

        public DescribeApmResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeApmResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeApmResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeApmResponseBodyResult setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public DescribeApmResponseBodyResult setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
