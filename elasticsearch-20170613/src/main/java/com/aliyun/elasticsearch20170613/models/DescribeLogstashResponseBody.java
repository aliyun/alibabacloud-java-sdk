// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeLogstashResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeLogstashResponseBodyResult result;

    public static DescribeLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstashResponseBody self = new DescribeLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogstashResponseBody setResult(DescribeLogstashResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeLogstashResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeLogstashResponseBodyResultTags extends TeaModel {
        @NameInMap("tagKey")
        public String tagKey;

        @NameInMap("tagValue")
        public String tagValue;

        public static DescribeLogstashResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogstashResponseBodyResultTags self = new DescribeLogstashResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public DescribeLogstashResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeLogstashResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeLogstashResponseBodyResultZoneInfos extends TeaModel {
        @NameInMap("status")
        public String status;

        @NameInMap("zoneId")
        public String zoneId;

        public static DescribeLogstashResponseBodyResultZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogstashResponseBodyResultZoneInfos self = new DescribeLogstashResponseBodyResultZoneInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLogstashResponseBodyResultZoneInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLogstashResponseBodyResultZoneInfos setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeLogstashResponseBodyResultEndpointList extends TeaModel {
        @NameInMap("zoneId")
        public String zoneId;

        @NameInMap("port")
        public String port;

        @NameInMap("host")
        public String host;

        public static DescribeLogstashResponseBodyResultEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogstashResponseBodyResultEndpointList self = new DescribeLogstashResponseBodyResultEndpointList();
            return TeaModel.build(map, self);
        }

        public DescribeLogstashResponseBodyResultEndpointList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeLogstashResponseBodyResultEndpointList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeLogstashResponseBodyResultEndpointList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

    }

    public static class DescribeLogstashResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("vswitchId")
        public String vswitchId;

        public static DescribeLogstashResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogstashResponseBodyResultNetworkConfig self = new DescribeLogstashResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLogstashResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLogstashResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeLogstashResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public DescribeLogstashResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeLogstashResponseBodyResultNodeSpec extends TeaModel {
        @NameInMap("disk")
        public Integer disk;

        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        public static DescribeLogstashResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogstashResponseBodyResultNodeSpec self = new DescribeLogstashResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public DescribeLogstashResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public DescribeLogstashResponseBodyResultNodeSpec setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public DescribeLogstashResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeLogstashResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class DescribeLogstashResponseBodyResult extends TeaModel {
        @NameInMap("ExtendConfigs")
        public java.util.List<java.util.Map<String, ?>> extendConfigs;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public java.util.List<DescribeLogstashResponseBodyResultTags> tags;

        @NameInMap("ZoneInfos")
        public java.util.List<DescribeLogstashResponseBodyResultZoneInfos> zoneInfos;

        @NameInMap("config")
        public java.util.Map<String, ?> config;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("endpointList")
        public java.util.List<DescribeLogstashResponseBodyResultEndpointList> endpointList;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("networkConfig")
        public DescribeLogstashResponseBodyResultNetworkConfig networkConfig;

        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        @NameInMap("nodeSpec")
        public DescribeLogstashResponseBodyResultNodeSpec nodeSpec;

        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("status")
        public String status;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("version")
        public String version;

        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        public static DescribeLogstashResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogstashResponseBodyResult self = new DescribeLogstashResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeLogstashResponseBodyResult setExtendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        public DescribeLogstashResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeLogstashResponseBodyResult setTags(java.util.List<DescribeLogstashResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeLogstashResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public DescribeLogstashResponseBodyResult setZoneInfos(java.util.List<DescribeLogstashResponseBodyResultZoneInfos> zoneInfos) {
            this.zoneInfos = zoneInfos;
            return this;
        }
        public java.util.List<DescribeLogstashResponseBodyResultZoneInfos> getZoneInfos() {
            return this.zoneInfos;
        }

        public DescribeLogstashResponseBodyResult setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public DescribeLogstashResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeLogstashResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLogstashResponseBodyResult setEndpointList(java.util.List<DescribeLogstashResponseBodyResultEndpointList> endpointList) {
            this.endpointList = endpointList;
            return this;
        }
        public java.util.List<DescribeLogstashResponseBodyResultEndpointList> getEndpointList() {
            return this.endpointList;
        }

        public DescribeLogstashResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLogstashResponseBodyResult setNetworkConfig(DescribeLogstashResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public DescribeLogstashResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public DescribeLogstashResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public DescribeLogstashResponseBodyResult setNodeSpec(DescribeLogstashResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public DescribeLogstashResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public DescribeLogstashResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeLogstashResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLogstashResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeLogstashResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeLogstashResponseBodyResult setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
