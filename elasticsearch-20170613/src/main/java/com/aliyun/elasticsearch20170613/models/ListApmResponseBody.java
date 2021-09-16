// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListApmResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Headers")
    public ListApmResponseBodyHeaders headers;

    @NameInMap("Result")
    public java.util.List<ListApmResponseBodyResult> result;

    public static ListApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApmResponseBody self = new ListApmResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApmResponseBody setHeaders(ListApmResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListApmResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListApmResponseBody setResult(java.util.List<ListApmResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListApmResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListApmResponseBodyHeaders extends TeaModel {
        @NameInMap("X-Total-Count")
        public Long xTotalCount;

        public static ListApmResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListApmResponseBodyHeaders self = new ListApmResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListApmResponseBodyHeaders setXTotalCount(Long xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Long getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListApmResponseBodyResult extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DeployedReplica")
        public Long deployedReplica;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NodeAmount")
        public Long nodeAmount;

        @NameInMap("OutputES")
        public String outputES;

        @NameInMap("OutputESUserName")
        public String outputESUserName;

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

        public static ListApmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListApmResponseBodyResult self = new ListApmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListApmResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListApmResponseBodyResult setDeployedReplica(Long deployedReplica) {
            this.deployedReplica = deployedReplica;
            return this;
        }
        public Long getDeployedReplica() {
            return this.deployedReplica;
        }

        public ListApmResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApmResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApmResponseBodyResult setNodeAmount(Long nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Long getNodeAmount() {
            return this.nodeAmount;
        }

        public ListApmResponseBodyResult setOutputES(String outputES) {
            this.outputES = outputES;
            return this;
        }
        public String getOutputES() {
            return this.outputES;
        }

        public ListApmResponseBodyResult setOutputESUserName(String outputESUserName) {
            this.outputESUserName = outputESUserName;
            return this;
        }
        public String getOutputESUserName() {
            return this.outputESUserName;
        }

        public ListApmResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListApmResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListApmResponseBodyResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListApmResponseBodyResult setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public ListApmResponseBodyResult setResourceSpec(String resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public String getResourceSpec() {
            return this.resourceSpec;
        }

        public ListApmResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApmResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListApmResponseBodyResult setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListApmResponseBodyResult setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public ListApmResponseBodyResult setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
