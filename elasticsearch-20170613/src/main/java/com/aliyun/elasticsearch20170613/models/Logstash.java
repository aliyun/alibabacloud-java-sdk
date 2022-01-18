// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class Logstash extends TeaModel {
    // Config
    @NameInMap("config")
    public java.util.Map<String, String> config;

    // CreatedAt
    @NameInMap("createdAt")
    public String createdAt;

    // DataNode
    @NameInMap("dataNode")
    public Boolean dataNode;

    // Description
    @NameInMap("description")
    public String description;

    // EndTime
    @NameInMap("endTime")
    public Long endTime;

    // EndpointList
    @NameInMap("endpointList")
    public java.util.List<LogstashEndpointList> endpointList;

    // InstanceId
    @NameInMap("instanceId")
    public String instanceId;

    // NetworkConfig
    @NameInMap("networkConfig")
    public LogstashNetworkConfig networkConfig;

    // NodeAmount
    @NameInMap("nodeAmount")
    public Long nodeAmount;

    // NodeSpec
    @NameInMap("nodeSpec")
    public LogstashNodeSpec nodeSpec;

    // PaymentType
    @NameInMap("paymentType")
    public String paymentType;

    // Protocol
    @NameInMap("protocol")
    public String protocol;

    // ResourceGroupId
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    // Status
    @NameInMap("status")
    public String status;

    // Tags
    @NameInMap("tags")
    public java.util.List<LogstashTags> tags;

    // UpdatedAt
    @NameInMap("updatedAt")
    public String updatedAt;

    // Version
    @NameInMap("version")
    public String version;

    // ZoneCount
    @NameInMap("zoneCount")
    public Long zoneCount;

    // ZoneInfos
    @NameInMap("zoneInfos")
    public java.util.List<LogstashZoneInfos> zoneInfos;

    public static Logstash build(java.util.Map<String, ?> map) throws Exception {
        Logstash self = new Logstash();
        return TeaModel.build(map, self);
    }

    public Logstash setConfig(java.util.Map<String, String> config) {
        this.config = config;
        return this;
    }
    public java.util.Map<String, String> getConfig() {
        return this.config;
    }

    public Logstash setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Logstash setDataNode(Boolean dataNode) {
        this.dataNode = dataNode;
        return this;
    }
    public Boolean getDataNode() {
        return this.dataNode;
    }

    public Logstash setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Logstash setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public Logstash setEndpointList(java.util.List<LogstashEndpointList> endpointList) {
        this.endpointList = endpointList;
        return this;
    }
    public java.util.List<LogstashEndpointList> getEndpointList() {
        return this.endpointList;
    }

    public Logstash setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Logstash setNetworkConfig(LogstashNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public LogstashNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public Logstash setNodeAmount(Long nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }
    public Long getNodeAmount() {
        return this.nodeAmount;
    }

    public Logstash setNodeSpec(LogstashNodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }
    public LogstashNodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    public Logstash setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public Logstash setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public Logstash setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public Logstash setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Logstash setTags(java.util.List<LogstashTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<LogstashTags> getTags() {
        return this.tags;
    }

    public Logstash setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public Logstash setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public Logstash setZoneCount(Long zoneCount) {
        this.zoneCount = zoneCount;
        return this;
    }
    public Long getZoneCount() {
        return this.zoneCount;
    }

    public Logstash setZoneInfos(java.util.List<LogstashZoneInfos> zoneInfos) {
        this.zoneInfos = zoneInfos;
        return this;
    }
    public java.util.List<LogstashZoneInfos> getZoneInfos() {
        return this.zoneInfos;
    }

    public static class LogstashEndpointList extends TeaModel {
        // Host
        @NameInMap("host")
        public String host;

        // Port
        @NameInMap("port")
        public Long port;

        // ZoneId
        @NameInMap("zoneId")
        public String zoneId;

        public static LogstashEndpointList build(java.util.Map<String, ?> map) throws Exception {
            LogstashEndpointList self = new LogstashEndpointList();
            return TeaModel.build(map, self);
        }

        public LogstashEndpointList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public LogstashEndpointList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public LogstashEndpointList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class LogstashNetworkConfig extends TeaModel {
        // Type
        @NameInMap("type")
        public String type;

        // VpcId
        @NameInMap("vpcId")
        public String vpcId;

        // VsArea
        @NameInMap("vsArea")
        public String vsArea;

        // VswitchId
        @NameInMap("vswitchId")
        public String vswitchId;

        public static LogstashNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            LogstashNetworkConfig self = new LogstashNetworkConfig();
            return TeaModel.build(map, self);
        }

        public LogstashNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public LogstashNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public LogstashNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public LogstashNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class LogstashNodeSpec extends TeaModel {
        // Disk
        @NameInMap("disk")
        public Long disk;

        // DiskType
        @NameInMap("diskType")
        public String diskType;

        // Spec
        @NameInMap("spec")
        public String spec;

        public static LogstashNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            LogstashNodeSpec self = new LogstashNodeSpec();
            return TeaModel.build(map, self);
        }

        public LogstashNodeSpec setDisk(Long disk) {
            this.disk = disk;
            return this;
        }
        public Long getDisk() {
            return this.disk;
        }

        public LogstashNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public LogstashNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class LogstashTags extends TeaModel {
        // TagKey
        @NameInMap("tagKey")
        public String tagKey;

        // TagValue
        @NameInMap("tagValue")
        public String tagValue;

        public static LogstashTags build(java.util.Map<String, ?> map) throws Exception {
            LogstashTags self = new LogstashTags();
            return TeaModel.build(map, self);
        }

        public LogstashTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public LogstashTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class LogstashZoneInfos extends TeaModel {
        // Status
        @NameInMap("status")
        public String status;

        // ZoneId
        @NameInMap("zoneId")
        public String zoneId;

        public static LogstashZoneInfos build(java.util.Map<String, ?> map) throws Exception {
            LogstashZoneInfos self = new LogstashZoneInfos();
            return TeaModel.build(map, self);
        }

        public LogstashZoneInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public LogstashZoneInfos setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
