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
     * <p>The billing type.
     * [_single.params.ChargeType.enum. PrePaid]subscription</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The list of instance group IDs.</p>
     */
    @NameInMap("InstanceGroupIds")
    public java.util.List<String> instanceGroupIds;

    /**
     * <p>The instance group name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud phone</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

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
     * <p>The maximum number of entries per page for a paged query. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that indicates the position from which to start reading. An empty value indicates reading from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy ID.</p>
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

    @NameInMap("SortKey")
    public String sortKey;

    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The instance group status.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the instance group. You can bind up to 20 tags to each instance.</p>
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
         * <p>Notice: The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
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
         * <p>Notice: The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
