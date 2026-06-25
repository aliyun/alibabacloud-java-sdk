// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstancesRequest extends TeaModel {
    /**
     * <p>The list of instance IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("AndroidInstanceName")
    public String androidInstanceName;

    /**
     * <p>The application management policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amp-shigvudbyeuib****</p>
     */
    @NameInMap("AppManagePolicyId")
    public String appManagePolicyId;

    /**
     * <p>The user ID assigned to the instance, which is the China Wuying convenience account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("AuthorizedUserId")
    public String authorizedUserId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The region ID. You can call <a href="https://help.aliyun.com/document_detail/2807298.html">DescribeRegions</a> to query the list of regions that support purchasing cloud phones of different editions (Instance Edition/Matrix Edition).</p>
     * <p>&lt;props=&quot;intl&quot;&gt;The region ID. You can call <a href="https://help.aliyun.com/document_detail/2807298.html">DescribeRegions</a> to query the list of regions that support purchasing cloud phones..</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing type.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The instance group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-25nt4kk9whjh****</p>
     */
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    /**
     * <p>The list of instance group IDs.</p>
     */
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    /**
     * <p>The instance group name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    @NameInMap("InstanceVersion")
    public String instanceVersion;

    /**
     * <p>The ID of the bound key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>kp-5hh431emkpuoi****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The maximum number of entries per page for a paged query. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that indicates the position from which to start reading. Leave this parameter empty to start reading from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The matrix ID.
     * &lt;props=&quot;intl&quot;&gt;This parameter is not publicly available..</p>
     * 
     * <strong>example:</strong>
     * <p>node_id</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;The name of the matrix.
     * &lt;props=&quot;intl&quot;&gt;This parameter is not publicly available..</p>
     * 
     * <strong>example:</strong>
     * <p>node_name</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The cloud phone network ID.</p>
     */
    @NameInMap("OfficeSiteIds")
    public java.util.List<String> officeSiteIds;

    /**
     * <p>The private IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.162.136</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The public network rate limiting rule group ID. The rate limiting rule for instances in the basic shared network.</p>
     */
    @NameInMap("QosRuleIds")
    public java.util.List<String> qosRuleIds;

    /**
     * <p>The sales mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    @NameInMap("SortKey")
    public String sortKey;

    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeAndroidInstancesRequestTag> tag;

    public static DescribeAndroidInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAndroidInstancesRequest self = new DescribeAndroidInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAndroidInstancesRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public DescribeAndroidInstancesRequest setAndroidInstanceName(String androidInstanceName) {
        this.androidInstanceName = androidInstanceName;
        return this;
    }
    public String getAndroidInstanceName() {
        return this.androidInstanceName;
    }

    public DescribeAndroidInstancesRequest setAppManagePolicyId(String appManagePolicyId) {
        this.appManagePolicyId = appManagePolicyId;
        return this;
    }
    public String getAppManagePolicyId() {
        return this.appManagePolicyId;
    }

    public DescribeAndroidInstancesRequest setAuthorizedUserId(String authorizedUserId) {
        this.authorizedUserId = authorizedUserId;
        return this;
    }
    public String getAuthorizedUserId() {
        return this.authorizedUserId;
    }

    public DescribeAndroidInstancesRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeAndroidInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeAndroidInstancesRequest setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    public DescribeAndroidInstancesRequest setInstanceGroupIds(java.util.List<String> instanceGroupIds) {
        this.instanceGroupIds = instanceGroupIds;
        return this;
    }
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    public DescribeAndroidInstancesRequest setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
        return this;
    }
    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    public DescribeAndroidInstancesRequest setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    public DescribeAndroidInstancesRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public DescribeAndroidInstancesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAndroidInstancesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAndroidInstancesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeAndroidInstancesRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public DescribeAndroidInstancesRequest setOfficeSiteIds(java.util.List<String> officeSiteIds) {
        this.officeSiteIds = officeSiteIds;
        return this;
    }
    public java.util.List<String> getOfficeSiteIds() {
        return this.officeSiteIds;
    }

    public DescribeAndroidInstancesRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeAndroidInstancesRequest setQosRuleIds(java.util.List<String> qosRuleIds) {
        this.qosRuleIds = qosRuleIds;
        return this;
    }
    public java.util.List<String> getQosRuleIds() {
        return this.qosRuleIds;
    }

    public DescribeAndroidInstancesRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

    public DescribeAndroidInstancesRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public DescribeAndroidInstancesRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeAndroidInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAndroidInstancesRequest setTag(java.util.List<DescribeAndroidInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAndroidInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAndroidInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAndroidInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesRequestTag self = new DescribeAndroidInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAndroidInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
