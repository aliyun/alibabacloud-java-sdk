// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstanceGroupsRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method.
     * [_single.params.ChargeType.enum. PrePaid]Subscription.</p>
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
     * <p>The name of the instance group. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud Phone</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    /**
     * <p>The instance version. A value of basic indicates a Wuying Cloud Phone instance, and a value of EnterpriseAi indicates a JVS Mobile instance.</p>
     */
    @NameInMap("InstanceVersion")
    public String instanceVersion;

    /**
     * <p>The ID of the key pair.</p>
     * 
     * <strong>example:</strong>
     * <p>kp-5htf0ymsrnb7q****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The maximum number of entries to return on each page in a paging query. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that indicates the starting position for the query. If this parameter is left empty, the query starts from the beginning.</p>
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
     * <p>The purchase mode of the cloud phone.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    /**
     * <p>The sort field. A value of CreationTime indicates the creation time, and a value of ExpiredTime indicates the expiration time.</p>
     */
    @NameInMap("SortKey")
    public String sortKey;

    /**
     * <p>The sort order. A value of ASC indicates ascending order, and a value of DESC indicates descending order.</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The status of the instance group.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the instance group. You can add up to 20 tags to each instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeAndroidInstanceGroupsRequestTags> tags;

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

    public DescribeAndroidInstanceGroupsRequest setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }
    public String getInstanceVersion() {
        return this.instanceVersion;
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

    public DescribeAndroidInstanceGroupsRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public DescribeAndroidInstanceGroupsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeAndroidInstanceGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAndroidInstanceGroupsRequest setTags(java.util.List<DescribeAndroidInstanceGroupsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeAndroidInstanceGroupsRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeAndroidInstanceGroupsRequestTags extends TeaModel {
        /**
         * <p>The tag key. You can specify 1 to 20 tag keys.</p>
         * <blockquote>
         * <p>Notice: A tag key can be up to 128 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <blockquote>
         * <p>Notice: A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAndroidInstanceGroupsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstanceGroupsRequestTags self = new DescribeAndroidInstanceGroupsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstanceGroupsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAndroidInstanceGroupsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
