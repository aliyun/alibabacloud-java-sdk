// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeLogstashResponseBody extends TeaModel {
    /**
     * <p>Detailed information about the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>C9334241-4837-46C2-B24B-9BDC517318DE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations of the instance.</p>
     */
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
        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The information about the zones.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
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
        /**
         * <p>The zone ID of the new instance.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The configuration of cluster extension parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
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
        /**
         * <p>The tags added to the ALB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.**.**</p>
         */
        @NameInMap("host")
        public String host;

        /**
         * <p>The IP address of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>9600</p>
         */
        @NameInMap("port")
        public String port;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("zoneId")
        public String zoneId;

        public static DescribeLogstashResponseBodyResultEndpointList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogstashResponseBodyResultEndpointList self = new DescribeLogstashResponseBodyResultEndpointList();
            return TeaModel.build(map, self);
        }

        public DescribeLogstashResponseBodyResultEndpointList setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeLogstashResponseBodyResultEndpointList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeLogstashResponseBodyResultEndpointList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeLogstashResponseBodyResultNetworkConfig extends TeaModel {
        /**
         * <p>The ID of the vSwitch to which the instance is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The zone where the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtmagcva****</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>The network type of the instance. Valid values: Currently, only Virtual Private Cloud (VPC) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-*</p>
         */
        @NameInMap("vsArea")
        public String vsArea;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1k4ec6s7sjdbudw****</p>
         */
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
        /**
         * <p>Whether to use disk encryption:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The disk type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <p>The network configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The disk size of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn1ne.large</p>
         */
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
        /**
         * <p>The configuration information of the node.</p>
         */
        @NameInMap("ExtendConfigs")
        public java.util.List<java.util.Map<String, ?>> extendConfigs;

        /**
         * <p>The number of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzvowej3i****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeLogstashResponseBodyResultTags> tags;

        /**
         * <p>The status of the zone. Valid values:</p>
         * <ul>
         * <li>ISOLATION: offline</li>
         * <li>NORMAL</li>
         * </ul>
         */
        @NameInMap("ZoneInfos")
        public java.util.List<DescribeLogstashResponseBodyResultZoneInfos> zoneInfos;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>prepaid: subscription</li>
         * <li>postpaid: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;slowlog.threshold.warn&quot;: &quot;2s&quot;,&quot;slowlog.threshold.info&quot;: &quot;1s&quot;,&quot;slowlog.threshold.debug&quot;: &quot;500ms&quot;,&quot;slowlog.threshold.trace&quot;: &quot;100ms&quot; }</p>
         */
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The state of the instance. Four states are supported:</p>
         * <ul>
         * <li>Normal: active</li>
         * <li>Active: activating</li>
         * <li>Freeze: inactive</li>
         * <li>Invalid: invalid</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2020-02-06T14:12:03.672Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-abc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the zone where the node resides.</p>
         */
        @NameInMap("endpointList")
        public java.util.List<DescribeLogstashResponseBodyResultEndpointList> endpointList;

        /**
         * <p>The access information of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-abc</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("networkConfig")
        public DescribeLogstashResponseBodyResultNetworkConfig networkConfig;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The specifications of the node.</p>
         */
        @NameInMap("nodeSpec")
        public DescribeLogstashResponseBodyResultNodeSpec nodeSpec;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>prepaid</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the elastic container instances belong.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The edition of the dedicated KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-06T14:22:36.850Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>7.4.0_with_X-Pack</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtmagcva****</p>
         */
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
