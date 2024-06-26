// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstanceGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    /**
     * <strong>example:</strong>
     * <p>kp-5htf0ymsrnb7q****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>pg-1b77w6xrqfubi****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    /**
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
