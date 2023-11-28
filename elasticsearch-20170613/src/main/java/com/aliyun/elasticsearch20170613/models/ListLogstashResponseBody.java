// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashResponseBody extends TeaModel {
    /**
     * <p>The billing method of the instance. Supported: prepaid (subscription) and postpaid (pay-as-you-go).</p>
     */
    @NameInMap("Headers")
    public ListLogstashResponseBodyHeaders headers;

    /**
     * <p>Detailed information about the matching instances.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the VPC.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListLogstashResponseBodyResult> result;

    public static ListLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashResponseBody self = new ListLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogstashResponseBody setHeaders(ListLogstashResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListLogstashResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogstashResponseBody setResult(java.util.List<ListLogstashResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLogstashResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLogstashResponseBodyHeaders extends TeaModel {
        /**
         * <p>The number of data nodes.</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListLogstashResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashResponseBodyHeaders self = new ListLogstashResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListLogstashResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListLogstashResponseBodyResultTags extends TeaModel {
        /**
         * <p>The disk size of the node.</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The instance type of the ECS instance.</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListLogstashResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashResponseBodyResultTags self = new ListLogstashResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListLogstashResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListLogstashResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListLogstashResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("type")
        public String type;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("vswitchId")
        public String vswitchId;

        public static ListLogstashResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashResponseBodyResultNetworkConfig self = new ListLogstashResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public ListLogstashResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLogstashResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListLogstashResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public ListLogstashResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class ListLogstashResponseBodyResultNodeSpec extends TeaModel {
        /**
         * <p>The network configurations.</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <p>The zone where the cluster resides.</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The type of the disk.</p>
         */
        @NameInMap("spec")
        public String spec;

        public static ListLogstashResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashResponseBodyResultNodeSpec self = new ListLogstashResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public ListLogstashResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListLogstashResponseBodyResultNodeSpec setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public ListLogstashResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListLogstashResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class ListLogstashResponseBodyResult extends TeaModel {
        /**
         * <p>The configuration information of the data node.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListLogstashResponseBodyResultTags> tags;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The time when the instance was last updated.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The tag value of the cloud disk.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The network type. Currently, only Virtual Private Cloud (VPC) is supported.</p>
         */
        @NameInMap("networkConfig")
        public ListLogstashResponseBodyResultNetworkConfig networkConfig;

        /**
         * <p>The state of the instance. Valid values: Normal, Active, Inactive, and Invalid.</p>
         */
        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        /**
         * <p>Specifies whether to use disk encryption. Valid values:</p>
         * <br>
         * <p>*   true: Enables the concurrent query feature for queries other than aggregate queries.</p>
         * <p>*   false: Disables the concurrent query feature for queries other than aggregate queries.</p>
         */
        @NameInMap("nodeSpec")
        public ListLogstashResponseBodyResultNodeSpec nodeSpec;

        /**
         * <p>The time when the instance was created.</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The version of the instance. Currently, only 6.7.0\_with_X-Pack and 7.4.0\_with_X-Pack are supported.</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tag of the instance. Valid values:</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The tag key of the cloud disk.</p>
         */
        @NameInMap("version")
        public String version;

        public static ListLogstashResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashResponseBodyResult self = new ListLogstashResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLogstashResponseBodyResult setTags(java.util.List<ListLogstashResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListLogstashResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListLogstashResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListLogstashResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLogstashResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListLogstashResponseBodyResult setNetworkConfig(ListLogstashResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public ListLogstashResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public ListLogstashResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public ListLogstashResponseBodyResult setNodeSpec(ListLogstashResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public ListLogstashResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public ListLogstashResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListLogstashResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListLogstashResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListLogstashResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListLogstashResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
