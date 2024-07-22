// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeApmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>97597D87-8066-5493-B692-5C50DA236D68</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>apm-cn-i7m2fuae****.apm.elasticsearch.aliyuncs.com:8200</p>
         */
        @NameInMap("apmServerDomain")
        public String apmServerDomain;

        /**
         * <strong>example:</strong>
         * <p>2021-11-16T07:15:51.967Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("deployedReplica")
        public Long deployedReplica;

        /**
         * <strong>example:</strong>
         * <p>APMtest</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>4792752000000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>apm-cn-i7m2fuae****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("nodeAmount")
        public Long nodeAmount;

        /**
         * <strong>example:</strong>
         * <p>es-cn-i7m2fsfhc001x****</p>
         */
        @NameInMap("outputES")
        public String outputES;

        /**
         * <strong>example:</strong>
         * <p>elastic</p>
         */
        @NameInMap("outputESUserName")
        public String outputESUserName;

        /**
         * <strong>example:</strong>
         * <p>133071096032****</p>
         */
        @NameInMap("ownerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("replica")
        public Integer replica;

        /**
         * <strong>example:</strong>
         * <p>C1M2</p>
         */
        @NameInMap("resourceSpec")
        public String resourceSpec;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>7.10.2</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1530vdhqkamm9s0****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("vsArea")
        public String vsArea;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1j1mql6r9g5vfb4****</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        public static DescribeApmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeApmResponseBodyResult self = new DescribeApmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeApmResponseBodyResult setApmServerDomain(String apmServerDomain) {
            this.apmServerDomain = apmServerDomain;
            return this;
        }
        public String getApmServerDomain() {
            return this.apmServerDomain;
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

        public DescribeApmResponseBodyResult setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
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
