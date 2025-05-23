// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the instances.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("AndroidInstanceName")
    public String androidInstanceName;

    @NameInMap("AppManagePolicyId")
    public String appManagePolicyId;

    @NameInMap("AuthorizedUserId")
    public String authorizedUserId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/2807298.html">DescribeRegions</a> operation to query the regions where Cloud Phone is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go.</li>
     * <li>PrePaid: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The ID of the instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>ag-25nt4kk9whjh****</p>
     */
    @NameInMap("InstanceGroupId")
    public String instanceGroupId;

    /**
     * <p>The IDs of the instance groups.</p>
     */
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    /**
     * <p>The name of the instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    /**
     * <p>The ID of the bound key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>kp-5hh431emkpuoi****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the parameter is left empty, the data is queried from the first entry.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>node_id</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The name of the node.</p>
     * 
     * <strong>example:</strong>
     * <p>node_name</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("OfficeSiteIds")
    public java.util.List<String> officeSiteIds;

    @NameInMap("QosRuleIds")
    public java.util.List<String> qosRuleIds;

    /**
     * <p>The sales mode.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Instance: the standard mode.</li>
     * <li>Node: the node mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    /**
     * <p>The state of the instance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>BACKUPING: The instance is being backed up.</li>
     * <li>STARTING: The instance is being started.</li>
     * <li>RUNNING: The instance group is available.</li>
     * <li>DELETING: The instance is being deleted.</li>
     * <li>BACKUP_FAILED: The backup operation failed.</li>
     * <li>DELETED: The instance is deleted.</li>
     * <li>FAILED: The instance failed to be created.</li>
     * <li>STOPPED: The instance is stopped.</li>
     * <li>RECOVERING: The instance has an ongoing file recovery task.</li>
     * <li>UNAVAILABLE: The instance has an exception.</li>
     * <li>REBOOTING: The instance is being restarted.</li>
     * <li>RESETTING: The instance is being reset.</li>
     * <li>STOPPING: The instance is being stopped.</li>
     * <li>RECOVER_FAILED: The file recovery task failed.</li>
     * <li>CREATING: The instance is being created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the resources.</p>
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
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
