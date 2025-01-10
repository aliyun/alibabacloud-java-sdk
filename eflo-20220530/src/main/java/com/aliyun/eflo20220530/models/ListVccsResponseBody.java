// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListVccsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public ListVccsResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>28451248-7038-5184-B5D3-80F104654BE8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVccsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVccsResponseBody self = new ListVccsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVccsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListVccsResponseBody setContent(ListVccsResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListVccsResponseBodyContent getContent() {
        return this.content;
    }

    public ListVccsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVccsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVccsResponseBodyContentDataErInfos extends TeaModel {
        /**
         * <p>Connections</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>test_api_coverage</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Elastic Router ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-a7rqv1rq</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>ER instance name</p>
         * 
         * <strong>example:</strong>
         * <p>er-1</p>
         */
        @NameInMap("ErName")
        public String erName;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Primary Zone</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("MasterZoneId")
        public String masterZoneId;

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>ER region information</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Number of routing policy</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RouteMaps")
        public Long routeMaps;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static ListVccsResponseBodyContentDataErInfos build(java.util.Map<String, ?> map) throws Exception {
            ListVccsResponseBodyContentDataErInfos self = new ListVccsResponseBodyContentDataErInfos();
            return TeaModel.build(map, self);
        }

        public ListVccsResponseBodyContentDataErInfos setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public ListVccsResponseBodyContentDataErInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVccsResponseBodyContentDataErInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVccsResponseBodyContentDataErInfos setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public ListVccsResponseBodyContentDataErInfos setErName(String erName) {
            this.erName = erName;
            return this;
        }
        public String getErName() {
            return this.erName;
        }

        public ListVccsResponseBodyContentDataErInfos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVccsResponseBodyContentDataErInfos setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public ListVccsResponseBodyContentDataErInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVccsResponseBodyContentDataErInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVccsResponseBodyContentDataErInfos setRouteMaps(Long routeMaps) {
            this.routeMaps = routeMaps;
            return this;
        }
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        public ListVccsResponseBodyContentDataErInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVccsResponseBodyContentDataErInfos setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListVccsResponseBodyContentDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-vcc</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the resource.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-group-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static ListVccsResponseBodyContentDataTags build(java.util.Map<String, ?> map) throws Exception {
            ListVccsResponseBodyContentDataTags self = new ListVccsResponseBodyContentDataTags();
            return TeaModel.build(map, self);
        }

        public ListVccsResponseBodyContentDataTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListVccsResponseBodyContentDataTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class ListVccsResponseBodyContentDataVpdBaseInfo extends TeaModel {
        /**
         * <p>The CIDR block of the VPD.</p>
         * <ul>
         * <li>We recommend that you use an RFC private endpoint as the Lingjun CIDR block, such as 10.0.0.0/8,172.16.0.0/12,192.168.0.0/16. In scenarios where the Doringjun CIDR block is connected to each other or where the Lingjun CIDR block is connected to a VPC, make sure that the addresses do not conflict with each other.</li>
         * <li>You can also use a custom CIDR block other than 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets as the primary IPv4 CIDR block of the VPD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/13</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1668158213000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-9n7ioqrp</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>Lingjun CIDR block instance name</p>
         * 
         * <strong>example:</strong>
         * <p>yzp-rg-test3</p>
         */
        @NameInMap("VpdName")
        public String vpdName;

        public static ListVccsResponseBodyContentDataVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVccsResponseBodyContentDataVpdBaseInfo self = new ListVccsResponseBodyContentDataVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public ListVccsResponseBodyContentDataVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListVccsResponseBodyContentDataVpdBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVccsResponseBodyContentDataVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListVccsResponseBodyContentDataVpdBaseInfo setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class ListVccsResponseBodyContentData extends TeaModel {
        /**
         * <p>Express Connect circuit access point ID:</p>
         * <ul>
         * <li><strong>ap-cn-wulanchabu-jn-ts-A</strong>: Ulanqab-Jining-A</li>
         * <li><strong>ap-cn-heyuan-yc-ts-SA127</strong>: Heyuan-Yuancheng-A</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-wulanchabu-jn-ts-A</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The bandwidth of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BandwidthStr")
        public String bandwidthStr;

        /**
         * <p>bgp as number</p>
         * 
         * <strong>example:</strong>
         * <p>bgpAsn</p>
         */
        @NameInMap("BgpAsn")
        public String bgpAsn;

        /**
         * <p>bgp network segment</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.128.0/24</p>
         */
        @NameInMap("BgpCidr")
        public String bgpCidr;

        /**
         * <p>The ID of the CEN instance; <a href="https://help.aliyun.com/document_detail/181681.html">What is the CEN?</a></p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/468215.htm">DescribeCens</a> to query the information of CEN instances under the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-w15qot0pfvs83pkckj</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>Account to which cen belongs</p>
         * 
         * <strong>example:</strong>
         * <p>1238685214107736</p>
         */
        @NameInMap("CenOwnerId")
        public String cenOwnerId;

        /**
         * <p>Commodity code</p>
         * 
         * <strong>example:</strong>
         * <p>bccluster_cloudconnectionpre_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The connection mode. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>CENTR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CENTR</p>
         */
        @NameInMap("ConnectionType")
        public String connectionType;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Current process node</p>
         * 
         * <strong>example:</strong>
         * <p>test-xxxx-node-x</p>
         */
        @NameInMap("CurrentNode")
        public String currentNode;

        /**
         * <p>List of bound Lingjun HUB information</p>
         */
        @NameInMap("ErInfos")
        public java.util.List<ListVccsResponseBodyContentDataErInfos> erInfos;

        /**
         * <p>The time when the application expired.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("ExpirationDate")
        public String expirationDate;

        /**
         * <p>The time when the cluster was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1678273219000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CO</p>
         */
        @NameInMap("LineOperator")
        public String lineOperator;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>some message</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The port type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>100GBase-LR</strong>: 100,000 megabytes of single-mode optical port (10 km)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100GBase-LR</p>
         */
        @NameInMap("PortType")
        public String portType;

        /**
         * <p>Process progress; value returns 0 to 1; not started is null</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rate")
        public Double rate;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of your Alibaba Cloud resource group.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The compute specification.</p>
         * 
         * <strong>example:</strong>
         * <p>Large</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The state of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVccsResponseBodyContentDataTags> tags;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-cd544092-ed0a-49e9-83eb-e8c94770dccf</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166279</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        @NameInMap("VccId")
        public String vccId;

        /**
         * <p>The name of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-heyuan-backup</p>
         */
        @NameInMap("VccName")
        public String vccName;

        /**
         * <p>Virtual Private Cloud IDs; <a href="https://help.aliyun.com/document_detail/34217.html">What is Virtual Private Cloud</a></p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html#demo-0">DescribeVpcs</a> operation to query the specified VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-f8ziirfl9k25h2qn7y4f8</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Lingjun network segment information (applicable to the scene where the old version of Lingjun connection is directly bound to Lingjun network segment)</p>
         */
        @NameInMap("VpdBaseInfo")
        public ListVccsResponseBodyContentDataVpdBaseInfo vpdBaseInfo;

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-eoiy88ju</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListVccsResponseBodyContentData build(java.util.Map<String, ?> map) throws Exception {
            ListVccsResponseBodyContentData self = new ListVccsResponseBodyContentData();
            return TeaModel.build(map, self);
        }

        public ListVccsResponseBodyContentData setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public ListVccsResponseBodyContentData setBandwidthStr(String bandwidthStr) {
            this.bandwidthStr = bandwidthStr;
            return this;
        }
        public String getBandwidthStr() {
            return this.bandwidthStr;
        }

        public ListVccsResponseBodyContentData setBgpAsn(String bgpAsn) {
            this.bgpAsn = bgpAsn;
            return this;
        }
        public String getBgpAsn() {
            return this.bgpAsn;
        }

        public ListVccsResponseBodyContentData setBgpCidr(String bgpCidr) {
            this.bgpCidr = bgpCidr;
            return this;
        }
        public String getBgpCidr() {
            return this.bgpCidr;
        }

        public ListVccsResponseBodyContentData setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public ListVccsResponseBodyContentData setCenOwnerId(String cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public String getCenOwnerId() {
            return this.cenOwnerId;
        }

        public ListVccsResponseBodyContentData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListVccsResponseBodyContentData setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public ListVccsResponseBodyContentData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVccsResponseBodyContentData setCurrentNode(String currentNode) {
            this.currentNode = currentNode;
            return this;
        }
        public String getCurrentNode() {
            return this.currentNode;
        }

        public ListVccsResponseBodyContentData setErInfos(java.util.List<ListVccsResponseBodyContentDataErInfos> erInfos) {
            this.erInfos = erInfos;
            return this;
        }
        public java.util.List<ListVccsResponseBodyContentDataErInfos> getErInfos() {
            return this.erInfos;
        }

        public ListVccsResponseBodyContentData setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public ListVccsResponseBodyContentData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListVccsResponseBodyContentData setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public ListVccsResponseBodyContentData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListVccsResponseBodyContentData setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public ListVccsResponseBodyContentData setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ListVccsResponseBodyContentData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVccsResponseBodyContentData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVccsResponseBodyContentData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListVccsResponseBodyContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListVccsResponseBodyContentData setTags(java.util.List<ListVccsResponseBodyContentDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVccsResponseBodyContentDataTags> getTags() {
            return this.tags;
        }

        public ListVccsResponseBodyContentData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVccsResponseBodyContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVccsResponseBodyContentData setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

        public ListVccsResponseBodyContentData setVccName(String vccName) {
            this.vccName = vccName;
            return this;
        }
        public String getVccName() {
            return this.vccName;
        }

        public ListVccsResponseBodyContentData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVccsResponseBodyContentData setVpdBaseInfo(ListVccsResponseBodyContentDataVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public ListVccsResponseBodyContentDataVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public ListVccsResponseBodyContentData setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public ListVccsResponseBodyContentData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListVccsResponseBodyContent extends TeaModel {
        /**
         * <p>Lingjun Connection Information List</p>
         */
        @NameInMap("Data")
        public java.util.List<ListVccsResponseBodyContentData> data;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListVccsResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListVccsResponseBodyContent self = new ListVccsResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListVccsResponseBodyContent setData(java.util.List<ListVccsResponseBodyContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVccsResponseBodyContentData> getData() {
            return this.data;
        }

        public ListVccsResponseBodyContent setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
