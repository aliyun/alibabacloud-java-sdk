// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class Logstash extends TeaModel {
    @NameInMap("config")
    public java.util.Map<String, String> config;

    /**
     * <strong>example:</strong>
     * <p>2018-07-13T03:58:07.253Z</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dataNode")
    public Boolean dataNode;

    /**
     * <strong>example:</strong>
     * <p>ls-cn-abc</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>4749897600000</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    @NameInMap("endpointList")
    public java.util.List<LogstashEndpointList> endpointList;

    /**
     * <strong>example:</strong>
     * <p>ls-cn-n6w1o5jq****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("networkConfig")
    public LogstashNetworkConfig networkConfig;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("nodeAmount")
    public Long nodeAmount;

    @NameInMap("nodeSpec")
    public LogstashNodeSpec nodeSpec;

    /**
     * <strong>example:</strong>
     * <p>postpaid</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm2h5vbzd****</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("status")
    public String status;

    @NameInMap("tags")
    public java.util.List<LogstashTags> tags;

    /**
     * <strong>example:</strong>
     * <p>2018-07-18T10:10:04.484Z</p>
     */
    @NameInMap("updatedAt")
    public String updatedAt;

    /**
     * <strong>example:</strong>
     * <p>6.7.0_with_X-Pack</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("zoneCount")
    public Long zoneCount;

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
        /**
         * <strong>example:</strong>
         * <p>172.16.xx.xx</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>9200</p>
         */
        @NameInMap("port")
        public Long port;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>vpc-abc</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-*</p>
         */
        @NameInMap("vsArea")
        public String vsArea;

        /**
         * <strong>example:</strong>
         * <p>vsw-def</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("disk")
        public Long disk;

        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>logstash.n4.small</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
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
