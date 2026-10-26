// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVscsRequest extends TeaModel {
    /**
     * <p>The instance ID to which the cloud disk or local disk is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return. Valid values: 10 to 500. Default value: 10. If you do not specify this parameter or specify a value less than 10, the default value is 10. If you specify a value greater than 500, the default value is 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. When you use this parameter to filter resources, the resource count cannot exceed 1,000. Note: Filtering by the default resource group is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the VSCs to be queried. If you do not specify this parameter, VSCs in all states are returned. Valid values:</p>
     * <ul>
     * <li>In_use: In use.</li>
     * <li>Attaching: Attaching.</li>
     * <li>Detaching: Detaching.</li>
     * <li>AttachFailed: Attachment failed.</li>
     * <li>DetachFailed: Detachment failed.</li>
     * <li>All (default): All states.</li>
     * </ul>
     * <p>Default value: All.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeVscsRequestTag> tag;

    /**
     * <p>The IDs of the VSCs to be queried.</p>
     * <p>We recommend that you specify no more than 100 VSC IDs.</p>
     */
    @NameInMap("VscIds")
    public java.util.List<String> vscIds;

    public static DescribeVscsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVscsRequest self = new DescribeVscsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVscsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeVscsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeVscsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVscsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVscsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVscsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVscsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVscsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVscsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVscsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVscsRequest setTag(java.util.List<DescribeVscsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeVscsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeVscsRequest setVscIds(java.util.List<String> vscIds) {
        this.vscIds = vscIds;
        return this;
    }
    public java.util.List<String> getVscIds() {
        return this.vscIds;
    }

    public static class DescribeVscsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the command. Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count returned cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources to which you attach multiple tags at the same time cannot exceed 1,000. If the resource count exceeds 1,000, you must call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
         * <p>The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Environment</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20. If you specify this parameter, it can be an empty string. The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVscsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVscsRequestTag self = new DescribeVscsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeVscsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVscsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
