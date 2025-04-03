// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstanceGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription</li>
     * <li>PostPaid: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The IDs of the instance groups.</p>
     */
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    /**
     * <p>The name of the instance group. Instance groups support fuzzy search by name.</p>
     * 
     * <strong>example:</strong>
     * <p>defaultInstanceGroup</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    /**
     * <p>The ID of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>kp-5htf0ymsrnb7q****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The maximum number of entries per page. Value range: 0 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-1b77w6xrqfubi****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The purchase mode of cloud phone instances.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Instance (default): the instance group mode.</li>
     * <li>Node: the matrix mode [whitelisted].</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    /**
     * <p>The status of the instance group.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>UPDATING_FAILED: The image update for the instance group failed.</li>
     * <li>FAILED: The instance group failed to be created.</li>
     * <li>RUNNING: The instance group is available.</li>
     * <li>EXPIRED: The instance group expired.</li>
     * <li>DELETING: The instance group is being deleted.</li>
     * <li>DELETED: The instance group is deleted.</li>
     * <li>UPDATING: The instance group is undergoing an image update.</li>
     * <li>CREATING: The instance group is being created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeAndroidInstanceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAndroidInstanceGroupsRequest self = new DescribeAndroidInstanceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAndroidInstanceGroupsRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeAndroidInstanceGroupsRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeAndroidInstanceGroupsRequest setInstanceGroupIds(java.util.List<String> instanceGroupIds) {
        this.instanceGroupIds = instanceGroupIds;
        return this;
    }
    public java.util.List<String> getInstanceGroupIds() {
        return this.instanceGroupIds;
    }

    public DescribeAndroidInstanceGroupsRequest setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
        return this;
    }
    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    public DescribeAndroidInstanceGroupsRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public DescribeAndroidInstanceGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAndroidInstanceGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAndroidInstanceGroupsRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DescribeAndroidInstanceGroupsRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

    public DescribeAndroidInstanceGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
