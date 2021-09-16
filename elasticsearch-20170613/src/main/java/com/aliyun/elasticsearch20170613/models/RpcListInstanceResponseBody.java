// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RpcListInstanceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // es 列表
    @NameInMap("Result")
    public java.util.List<RpcListInstanceResponseBodyResult> result;

    public static RpcListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RpcListInstanceResponseBody self = new RpcListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RpcListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RpcListInstanceResponseBody setResult(java.util.List<RpcListInstanceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<RpcListInstanceResponseBodyResult> getResult() {
        return this.result;
    }

    public static class RpcListInstanceResponseBodyResult extends TeaModel {
        @NameInMap("AdvancedDedicateMaster")
        public Boolean advancedDedicateMaster;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DataNode")
        public Boolean dataNode;

        @NameInMap("DedicateMaster")
        public Boolean dedicateMaster;

        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EnableKibanaPrivateNetwork")
        public Boolean enableKibanaPrivateNetwork;

        @NameInMap("EnableKibanaPublicNetwork")
        public Boolean enableKibanaPublicNetwork;

        @NameInMap("EnablePublic")
        public Boolean enablePublic;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("EsVersion")
        public String esVersion;

        @NameInMap("HaveCerebro")
        public Boolean haveCerebro;

        @NameInMap("HaveClientNode")
        public Boolean haveClientNode;

        @NameInMap("HaveElasticDataNode")
        public Boolean haveElasticDataNode;

        @NameInMap("HaveGrafana")
        public Boolean haveGrafana;

        @NameInMap("HaveKibana")
        public Boolean haveKibana;

        @NameInMap("Inited")
        public Boolean inited;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IsNewDeployment")
        public Boolean isNewDeployment;

        @NameInMap("KibanaProtocol")
        public String kibanaProtocol;

        @NameInMap("NodeAmount")
        public Long nodeAmount;

        @NameInMap("PaymentType")
        public String paymentType;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Version")
        public String version;

        @NameInMap("WarmNode")
        public Boolean warmNode;

        @NameInMap("ZoneCount")
        public Long zoneCount;

        public static RpcListInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RpcListInstanceResponseBodyResult self = new RpcListInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RpcListInstanceResponseBodyResult setAdvancedDedicateMaster(Boolean advancedDedicateMaster) {
            this.advancedDedicateMaster = advancedDedicateMaster;
            return this;
        }
        public Boolean getAdvancedDedicateMaster() {
            return this.advancedDedicateMaster;
        }

        public RpcListInstanceResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public RpcListInstanceResponseBodyResult setDataNode(Boolean dataNode) {
            this.dataNode = dataNode;
            return this;
        }
        public Boolean getDataNode() {
            return this.dataNode;
        }

        public RpcListInstanceResponseBodyResult setDedicateMaster(Boolean dedicateMaster) {
            this.dedicateMaster = dedicateMaster;
            return this;
        }
        public Boolean getDedicateMaster() {
            return this.dedicateMaster;
        }

        public RpcListInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RpcListInstanceResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public RpcListInstanceResponseBodyResult setEnableKibanaPrivateNetwork(Boolean enableKibanaPrivateNetwork) {
            this.enableKibanaPrivateNetwork = enableKibanaPrivateNetwork;
            return this;
        }
        public Boolean getEnableKibanaPrivateNetwork() {
            return this.enableKibanaPrivateNetwork;
        }

        public RpcListInstanceResponseBodyResult setEnableKibanaPublicNetwork(Boolean enableKibanaPublicNetwork) {
            this.enableKibanaPublicNetwork = enableKibanaPublicNetwork;
            return this;
        }
        public Boolean getEnableKibanaPublicNetwork() {
            return this.enableKibanaPublicNetwork;
        }

        public RpcListInstanceResponseBodyResult setEnablePublic(Boolean enablePublic) {
            this.enablePublic = enablePublic;
            return this;
        }
        public Boolean getEnablePublic() {
            return this.enablePublic;
        }

        public RpcListInstanceResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RpcListInstanceResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public RpcListInstanceResponseBodyResult setHaveCerebro(Boolean haveCerebro) {
            this.haveCerebro = haveCerebro;
            return this;
        }
        public Boolean getHaveCerebro() {
            return this.haveCerebro;
        }

        public RpcListInstanceResponseBodyResult setHaveClientNode(Boolean haveClientNode) {
            this.haveClientNode = haveClientNode;
            return this;
        }
        public Boolean getHaveClientNode() {
            return this.haveClientNode;
        }

        public RpcListInstanceResponseBodyResult setHaveElasticDataNode(Boolean haveElasticDataNode) {
            this.haveElasticDataNode = haveElasticDataNode;
            return this;
        }
        public Boolean getHaveElasticDataNode() {
            return this.haveElasticDataNode;
        }

        public RpcListInstanceResponseBodyResult setHaveGrafana(Boolean haveGrafana) {
            this.haveGrafana = haveGrafana;
            return this;
        }
        public Boolean getHaveGrafana() {
            return this.haveGrafana;
        }

        public RpcListInstanceResponseBodyResult setHaveKibana(Boolean haveKibana) {
            this.haveKibana = haveKibana;
            return this;
        }
        public Boolean getHaveKibana() {
            return this.haveKibana;
        }

        public RpcListInstanceResponseBodyResult setInited(Boolean inited) {
            this.inited = inited;
            return this;
        }
        public Boolean getInited() {
            return this.inited;
        }

        public RpcListInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public RpcListInstanceResponseBodyResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public RpcListInstanceResponseBodyResult setIsNewDeployment(Boolean isNewDeployment) {
            this.isNewDeployment = isNewDeployment;
            return this;
        }
        public Boolean getIsNewDeployment() {
            return this.isNewDeployment;
        }

        public RpcListInstanceResponseBodyResult setKibanaProtocol(String kibanaProtocol) {
            this.kibanaProtocol = kibanaProtocol;
            return this;
        }
        public String getKibanaProtocol() {
            return this.kibanaProtocol;
        }

        public RpcListInstanceResponseBodyResult setNodeAmount(Long nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Long getNodeAmount() {
            return this.nodeAmount;
        }

        public RpcListInstanceResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public RpcListInstanceResponseBodyResult setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public RpcListInstanceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public RpcListInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public RpcListInstanceResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public RpcListInstanceResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public RpcListInstanceResponseBodyResult setWarmNode(Boolean warmNode) {
            this.warmNode = warmNode;
            return this;
        }
        public Boolean getWarmNode() {
            return this.warmNode;
        }

        public RpcListInstanceResponseBodyResult setZoneCount(Long zoneCount) {
            this.zoneCount = zoneCount;
            return this;
        }
        public Long getZoneCount() {
            return this.zoneCount;
        }

    }

}
