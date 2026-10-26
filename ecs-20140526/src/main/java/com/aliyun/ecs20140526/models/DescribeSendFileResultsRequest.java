// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsRequest extends TeaModel {
    /**
     * <p>The instance ID. If you specify this parameter, all file delivery records of the instance are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>i-hz0jdfwd9f****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The overall delivery status of the file. The overall status depends on the combined execution status of all instances involved in the delivery task. Valid values:</p>
     * <ul>
     * <li>Pending: The system is verifying or delivering the file. If the file delivery status of at least one instance is Pending, the overall execution status is Pending.</li>
     * <li>Running: The file is being delivered to the instances. If the file delivery status of at least one instance is Running, the overall execution status is Running.</li>
     * <li>Success: The file is delivered successfully. If the file delivery status of all instances is Success, the overall execution status is Success.</li>
     * <li>Failed: The file fails to be delivered. If the file delivery status of all instances is Failed, the overall execution status is Failed.</li>
     * <li>PartialFailed: The file is delivered to some instances but fails to be delivered to others. If the file delivery status of all instances is either Success or Failed, the overall execution status is PartialFailed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("InvocationStatus")
    public String invocationStatus;

    /**
     * <p>The execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f-hz0jdfwd9f****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The maximum number of entries per page for a paged query.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the file. If you specify this parameter, all delivery records of the file with the specified name are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>test.txt</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The query token. Set the value to the NextToken value returned from the previous API call.</p>
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
     * <blockquote>
     * <p>This parameter will soon be deprecated. We recommend that you use NextToken and MaxResults for paging.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p>This parameter will soon be deprecated. We recommend that you use NextToken and MaxResults for paging.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the ECS instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the file delivery task belongs. If you specify this parameter, you must also specify ResourceGroupId when you deliver the file. This allows you to filter the corresponding file delivery results.</p>
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
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeSendFileResultsRequestTag> tag;

    public static DescribeSendFileResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSendFileResultsRequest self = new DescribeSendFileResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSendFileResultsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSendFileResultsRequest setInvocationStatus(String invocationStatus) {
        this.invocationStatus = invocationStatus;
        return this;
    }
    public String getInvocationStatus() {
        return this.invocationStatus;
    }

    public DescribeSendFileResultsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeSendFileResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSendFileResultsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSendFileResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSendFileResultsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSendFileResultsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSendFileResultsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSendFileResultsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSendFileResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSendFileResultsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSendFileResultsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSendFileResultsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSendFileResultsRequest setTag(java.util.List<DescribeSendFileResultsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSendFileResultsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeSendFileResultsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the file delivery task. Valid values of N: 1 to 20. If you specify this parameter, it cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count queried under the tag cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources attached with multiple tags at the same time cannot exceed 1,000. If the resource count exceeds 1,000, you must call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
         * <p>The tag key can be up to 64 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the file delivery task. Valid values of N: 1 to 20. This parameter can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSendFileResultsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSendFileResultsRequestTag self = new DescribeSendFileResultsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSendFileResultsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSendFileResultsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
