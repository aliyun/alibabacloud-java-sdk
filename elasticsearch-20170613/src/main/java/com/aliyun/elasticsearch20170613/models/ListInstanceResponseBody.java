// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li>active: normal</li>
     * <li>activating: taking effect</li>
     * <li>inactive: frozen</li>
     * <li>invalid: invalid</li>
     * </ul>
     */
    @NameInMap("Headers")
    public ListInstanceResponseBodyHeaders headers;

    /**
     * <p>The time when the node is created.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether it is a service VPC.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListInstanceResponseBodyResult> result;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setHeaders(ListInstanceResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListInstanceResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setResult(java.util.List<ListInstanceResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInstanceResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListInstanceResponseBodyHeaders extends TeaModel {
        /**
         * <p>Specifies whether to include dedicated master nodes (obsolete). Valid values:</p>
         * <ul>
         * <li>true: The files contain data that is dumped to the IA storage medium.</li>
         * <li>false: The files do not contain data that is dumped to the IA storage medium.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListInstanceResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyHeaders self = new ListInstanceResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListInstanceResponseBodyResultClientNodeConfiguration extends TeaModel {
        /**
         * <p>The size of the node storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>Specifies whether to enable disk encryption for the node. Valid values:</p>
         * <ul>
         * <li>true: enables instant image cache.</li>
         * <li>false: disables reuse of image cache layers.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node. Valid values:</p>
         * <ul>
         * <li>cloud_ssd: SSD.</li>
         * <li>cloud_essd: ESSD.</li>
         * <li>cloud_efficiency: ultra disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

        public static ListInstanceResponseBodyResultClientNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultClientNodeConfiguration self = new ListInstanceResponseBodyResultClientNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListInstanceResponseBodyResultClientNodeConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class ListInstanceResponseBodyResultElasticDataNodeConfiguration extends TeaModel {
        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The size of the node storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The storage type of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <p>The configuration of dedicated master nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The instance type of the node. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

        public static ListInstanceResponseBodyResultElasticDataNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultElasticDataNodeConfiguration self = new ListInstanceResponseBodyResultElasticDataNodeConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListInstanceResponseBodyResultElasticDataNodeConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class ListInstanceResponseBodyResultKibanaConfiguration extends TeaModel {
        /**
         * <p>The size of the node storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The storage type of the node. Only cloud_ssd(SSD cloud disk) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The network configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

        public static ListInstanceResponseBodyResultKibanaConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultKibanaConfiguration self = new ListInstanceResponseBodyResultKibanaConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListInstanceResponseBodyResultKibanaConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class ListInstanceResponseBodyResultMasterConfiguration extends TeaModel {
        /**
         * <p>The network type. Only Virtual Private Cloud (VPC) is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("amount")
        public Integer amount;

        /**
         * <p>The vSwitch ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <p>The configuration of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <p>The zone where the cluster resides.</p>
         * 
         * <strong>example:</strong>
         * <p>elasticsearch.sn2ne.large</p>
         */
        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

        public static ListInstanceResponseBodyResultMasterConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultMasterConfiguration self = new ListInstanceResponseBodyResultMasterConfiguration();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultMasterConfiguration setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public ListInstanceResponseBodyResultMasterConfiguration setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultMasterConfiguration setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultMasterConfiguration setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListInstanceResponseBodyResultMasterConfiguration setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        /**
         * <strong>example:</strong>
         * <p>PUBLIC_KIBANA</p>
         */
        @NameInMap("whiteIpType")
        public String whiteIpType;

        public static ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList self = new ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList setWhiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

    }

    public static class ListInstanceResponseBodyResultNetworkConfig extends TeaModel {
        /**
         * <p>The storage type of the node. Valid values:</p>
         * <ul>
         * <li>cloud_ssd: standard SSD</li>
         * <li>cloud_efficiency: ultra disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The storage space of the node. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-abc</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        /**
         * <p>Specifies whether to use disk encryption. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-e</p>
         */
        @NameInMap("vsArea")
        public String vsArea;

        /**
         * <p>The performance level of the ESSD. This parameter is required when the diskType parameter is set to cloud_essd. Valid values: PL1, PL2, and PL3.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-def</p>
         */
        @NameInMap("vswitchId")
        public String vswitchId;

        @NameInMap("whiteIpGroupList")
        public java.util.List<ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList;

        public static ListInstanceResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultNetworkConfig self = new ListInstanceResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInstanceResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListInstanceResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public ListInstanceResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListInstanceResponseBodyResultNetworkConfig setWhiteIpGroupList(java.util.List<ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList) {
            this.whiteIpGroupList = whiteIpGroupList;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyResultNetworkConfigWhiteIpGroupList> getWhiteIpGroupList() {
            return this.whiteIpGroupList;
        }

    }

    public static class ListInstanceResponseBodyResultNodeSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("disk")
        public Integer disk;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("diskEncryption")
        public Boolean diskEncryption;

        /**
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("diskType")
        public String diskType;

        /**
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("performanceLevel")
        public String performanceLevel;

        /**
         * <strong>example:</strong>
         * <p>elasticsearch.n4.small</p>
         */
        @NameInMap("spec")
        public String spec;

        @NameInMap("specInfo")
        public String specInfo;

        public static ListInstanceResponseBodyResultNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultNodeSpec self = new ListInstanceResponseBodyResultNodeSpec();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultNodeSpec setDisk(Integer disk) {
            this.disk = disk;
            return this;
        }
        public Integer getDisk() {
            return this.disk;
        }

        public ListInstanceResponseBodyResultNodeSpec setDiskEncryption(Boolean diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Boolean getDiskEncryption() {
            return this.diskEncryption;
        }

        public ListInstanceResponseBodyResultNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstanceResponseBodyResultNodeSpec setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ListInstanceResponseBodyResultNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListInstanceResponseBodyResultNodeSpec setSpecInfo(String specInfo) {
            this.specInfo = specInfo;
            return this;
        }
        public String getSpecInfo() {
            return this.specInfo;
        }

    }

    public static class ListInstanceResponseBodyResultTags extends TeaModel {
        /**
         * <p>The size of the node storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The storage type of the node. Only ultra disks (cloud_efficiency) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ListInstanceResponseBodyResultTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResultTags self = new ListInstanceResponseBodyResultTags();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResultTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListInstanceResponseBodyResultTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListInstanceResponseBodyResult extends TeaModel {
        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>prepaid</strong>: subscription</li>
         * <li><strong>postpaid</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("advancedDedicateMaster")
        public Boolean advancedDedicateMaster;

        @NameInMap("archType")
        public String archType;

        /**
         * <p>The instance type of the node. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Specifications</a>.</p>
         */
        @NameInMap("clientNodeConfiguration")
        public ListInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration;

        /**
         * <p>The status of the pay-as-you-go service that is overlaid on a subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>active</strong>: normal</li>
         * <li><strong>closed</strong>: Close</li>
         * <li><strong>indebt</strong>: Overdue payments are frozen</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2018-07-13T03:58:07.253Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The edition of the dedicated KMS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dedicateMaster")
        public Boolean dedicateMaster;

        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-abc</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("domain")
        public String domain;

        /**
         * <p>The configuration of Kibana nodes.</p>
         */
        @NameInMap("elasticDataNodeConfiguration")
        public ListInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration;

        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>6.7_with_X-Pack</p>
         */
        @NameInMap("esVersion")
        public String esVersion;

        /**
         * <p>The configurations of elastic data nodes.</p>
         */
        @NameInMap("extendConfigs")
        public java.util.List<java.util.Map<String, ?>> extendConfigs;

        /**
         * <p>The instance type of the node. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-v641a0ta3000g****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The configuration of cluster extension parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isNewDeployment")
        public String isNewDeployment;

        /**
         * <p>The instance type of the node. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Specifications</a>.</p>
         */
        @NameInMap("kibanaConfiguration")
        public ListInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration;

        @NameInMap("kibanaIPWhitelist")
        public java.util.List<String> kibanaIPWhitelist;

        @NameInMap("kibanaPrivateIPWhitelist")
        public java.util.List<String> kibanaPrivateIPWhitelist;

        /**
         * <p>The VPC ID of the cluster.</p>
         */
        @NameInMap("masterConfiguration")
        public ListInstanceResponseBodyResultMasterConfiguration masterConfiguration;

        /**
         * <p>The instance type of the node. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Specifications</a>.</p>
         */
        @NameInMap("networkConfig")
        public ListInstanceResponseBodyResultNetworkConfig networkConfig;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nodeAmount")
        public Integer nodeAmount;

        /**
         * <p>The VPC ID of the cluster.</p>
         */
        @NameInMap("nodeSpec")
        public ListInstanceResponseBodyResultNodeSpec nodeSpec;

        /**
         * <p>The time when the instance was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        @NameInMap("paymentType")
        public String paymentType;

        @NameInMap("port")
        public String port;

        /**
         * <p>The tags of the instance. Each tag is a key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("postpaidServiceStatus")
        public String postpaidServiceStatus;

        @NameInMap("privateNetworkIpWhiteList")
        public java.util.List<String> privateNetworkIpWhiteList;

        @NameInMap("protocol")
        public String protocol;

        @NameInMap("publicIpWhitelist")
        public java.util.List<String> publicIpWhitelist;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzvowej3i****</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Specifies whether to deploy the new architecture.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("serviceVpc")
        public Boolean serviceVpc;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The number of nodes.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListInstanceResponseBodyResultTags> tags;

        /**
         * <p>Coordination node configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-18T10:10:04.484Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1uag5jj38c****</p>
         */
        @NameInMap("vpcInstanceId")
        public String vpcInstanceId;

        public static ListInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyResult self = new ListInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyResult setAdvancedDedicateMaster(Boolean advancedDedicateMaster) {
            this.advancedDedicateMaster = advancedDedicateMaster;
            return this;
        }
        public Boolean getAdvancedDedicateMaster() {
            return this.advancedDedicateMaster;
        }

        public ListInstanceResponseBodyResult setArchType(String archType) {
            this.archType = archType;
            return this;
        }
        public String getArchType() {
            return this.archType;
        }

        public ListInstanceResponseBodyResult setClientNodeConfiguration(ListInstanceResponseBodyResultClientNodeConfiguration clientNodeConfiguration) {
            this.clientNodeConfiguration = clientNodeConfiguration;
            return this;
        }
        public ListInstanceResponseBodyResultClientNodeConfiguration getClientNodeConfiguration() {
            return this.clientNodeConfiguration;
        }

        public ListInstanceResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListInstanceResponseBodyResult setDedicateMaster(Boolean dedicateMaster) {
            this.dedicateMaster = dedicateMaster;
            return this;
        }
        public Boolean getDedicateMaster() {
            return this.dedicateMaster;
        }

        public ListInstanceResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstanceResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListInstanceResponseBodyResult setElasticDataNodeConfiguration(ListInstanceResponseBodyResultElasticDataNodeConfiguration elasticDataNodeConfiguration) {
            this.elasticDataNodeConfiguration = elasticDataNodeConfiguration;
            return this;
        }
        public ListInstanceResponseBodyResultElasticDataNodeConfiguration getElasticDataNodeConfiguration() {
            return this.elasticDataNodeConfiguration;
        }

        public ListInstanceResponseBodyResult setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListInstanceResponseBodyResult setEsVersion(String esVersion) {
            this.esVersion = esVersion;
            return this;
        }
        public String getEsVersion() {
            return this.esVersion;
        }

        public ListInstanceResponseBodyResult setExtendConfigs(java.util.List<java.util.Map<String, ?>> extendConfigs) {
            this.extendConfigs = extendConfigs;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getExtendConfigs() {
            return this.extendConfigs;
        }

        public ListInstanceResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceResponseBodyResult setIsNewDeployment(String isNewDeployment) {
            this.isNewDeployment = isNewDeployment;
            return this;
        }
        public String getIsNewDeployment() {
            return this.isNewDeployment;
        }

        public ListInstanceResponseBodyResult setKibanaConfiguration(ListInstanceResponseBodyResultKibanaConfiguration kibanaConfiguration) {
            this.kibanaConfiguration = kibanaConfiguration;
            return this;
        }
        public ListInstanceResponseBodyResultKibanaConfiguration getKibanaConfiguration() {
            return this.kibanaConfiguration;
        }

        public ListInstanceResponseBodyResult setKibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

        public ListInstanceResponseBodyResult setKibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
            this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        public ListInstanceResponseBodyResult setMasterConfiguration(ListInstanceResponseBodyResultMasterConfiguration masterConfiguration) {
            this.masterConfiguration = masterConfiguration;
            return this;
        }
        public ListInstanceResponseBodyResultMasterConfiguration getMasterConfiguration() {
            return this.masterConfiguration;
        }

        public ListInstanceResponseBodyResult setNetworkConfig(ListInstanceResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public ListInstanceResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public ListInstanceResponseBodyResult setNodeAmount(Integer nodeAmount) {
            this.nodeAmount = nodeAmount;
            return this;
        }
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        public ListInstanceResponseBodyResult setNodeSpec(ListInstanceResponseBodyResultNodeSpec nodeSpec) {
            this.nodeSpec = nodeSpec;
            return this;
        }
        public ListInstanceResponseBodyResultNodeSpec getNodeSpec() {
            return this.nodeSpec;
        }

        public ListInstanceResponseBodyResult setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public ListInstanceResponseBodyResult setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListInstanceResponseBodyResult setPostpaidServiceStatus(String postpaidServiceStatus) {
            this.postpaidServiceStatus = postpaidServiceStatus;
            return this;
        }
        public String getPostpaidServiceStatus() {
            return this.postpaidServiceStatus;
        }

        public ListInstanceResponseBodyResult setPrivateNetworkIpWhiteList(java.util.List<String> privateNetworkIpWhiteList) {
            this.privateNetworkIpWhiteList = privateNetworkIpWhiteList;
            return this;
        }
        public java.util.List<String> getPrivateNetworkIpWhiteList() {
            return this.privateNetworkIpWhiteList;
        }

        public ListInstanceResponseBodyResult setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListInstanceResponseBodyResult setPublicIpWhitelist(java.util.List<String> publicIpWhitelist) {
            this.publicIpWhitelist = publicIpWhitelist;
            return this;
        }
        public java.util.List<String> getPublicIpWhitelist() {
            return this.publicIpWhitelist;
        }

        public ListInstanceResponseBodyResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstanceResponseBodyResult setServiceVpc(Boolean serviceVpc) {
            this.serviceVpc = serviceVpc;
            return this;
        }
        public Boolean getServiceVpc() {
            return this.serviceVpc;
        }

        public ListInstanceResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceResponseBodyResult setTags(java.util.List<ListInstanceResponseBodyResultTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstanceResponseBodyResultTags> getTags() {
            return this.tags;
        }

        public ListInstanceResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListInstanceResponseBodyResult setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

}
