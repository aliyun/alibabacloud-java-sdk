// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSendFileResultsRequest extends TeaModel {
    /**
     * <p>The ID of the instance for which you want to query file sending records.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The overall sending state of the file. The overall sending state of the file depends on its sending state on all the destination instances. Valid values:</p>
     * <br>
     * <p>- Pending: The file is being verified or sent.</p>
     * <p>- Invalid: The file is invalid.</p>
     * <p>- Running: The file is being sent to the instances.</p>
     * <p>- Aborted: The file failed to be sent to the instances. To send a file to an instance, make sure that the instance is in the Running state and the file can be sent within 1 minute.</p>
     * <p>- Success: The file is sent.</p>
     * <p>- Failed: The file failed to be created on the instances.</p>
     * <p>- Error: An error occurs and interrupts the file sending task.</p>
     * <p>- Timeout: The file sending task times out.</p>
     * <p>- Cancelled: The file sending task is canceled.</p>
     * <p>- Stopping: The file sending task is being stopped.</p>
     * <p>- Terminated: The file sending task is terminated.</p>
     */
    @NameInMap("InvocationStatus")
    public String invocationStatus;

    /**
     * <p>The ID of the file sending task.</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The maximum number of entries per page. </p>
     * <br>
     * <p>Valid values: 1 to 50. </p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the file whose sending records you want to query.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Valid values: 1 to 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the ECS instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. After you set this parameter, file sending results in the specified resource group are queried.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags list.</p>
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
         * <p>The key of tag N of the file sending task. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags, call the [ListTagResources](~~110425~~) operation.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the file sending task. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.</p>
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
