// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsRequest extends TeaModel {
    // The ID of the command.
    @NameInMap("CommandId")
    public String commandId;

    // The encoding method of the `Output` response parameter. Valid values:
    // 
    // *   PlainText: returns the original command content and command output.
    // *   Base64: returns the Base64-encoded command content and command output.
    // 
    // Default value: Base64.
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    // Specifies whether to return the results of historical scheduled executions. Valid values:
    // 
    // *   true: returns the results of historical scheduled executions. When this parameter is set to true, the `InvokeId` parameter must be set to the ID of a scheduled task.
    // *   false: does not return the results of historical scheduled executions.
    // 
    // Default value: false.
    @NameInMap("IncludeHistory")
    public Boolean includeHistory;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the command task. You can call the [DescribeInvocations](~~64840~~) operation to query the command task IDs.
    @NameInMap("InvokeId")
    public String invokeId;

    // The state of the execution. Valid values:
    // 
    // *   Running
    // *   Finished
    // *   Failed
    // *   Stopped
    // 
    // >  To improve compatibility, we recommend that you use the `InvocationStatus` parameter instead of the InvokeRecordStatus parameter.
    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries to return on each page.
    // 
    // Maximum value: 50.
    // 
    // Default value: 10.
    @NameInMap("PageSize")
    public Long pageSize;

    // The region ID of the command. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.
    // 
    // >  Resources in the default resource group are displayed in the response regardless of how this parameter is set.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeInvocationResultsRequestTag> tag;

    public static DescribeInvocationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationResultsRequest self = new DescribeInvocationResultsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationResultsRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public DescribeInvocationResultsRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public DescribeInvocationResultsRequest setIncludeHistory(Boolean includeHistory) {
        this.includeHistory = includeHistory;
        return this;
    }
    public Boolean getIncludeHistory() {
        return this.includeHistory;
    }

    public DescribeInvocationResultsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInvocationResultsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeInvocationResultsRequest setInvokeRecordStatus(String invokeRecordStatus) {
        this.invokeRecordStatus = invokeRecordStatus;
        return this;
    }
    public String getInvokeRecordStatus() {
        return this.invokeRecordStatus;
    }

    public DescribeInvocationResultsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInvocationResultsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInvocationResultsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInvocationResultsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeInvocationResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInvocationResultsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInvocationResultsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInvocationResultsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInvocationResultsRequest setTag(java.util.List<DescribeInvocationResultsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInvocationResultsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeInvocationResultsRequestTag extends TeaModel {
        // The key of tag N of the command. Valid values of N: 1 to 20. The tag key cannot be an empty string.
        // 
        // If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.
        // 
        // The tag key can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the command. Valid values of N: 1 to 20. The tag value can be an empty string.
        // 
        // The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`.
        @NameInMap("Value")
        public String value;

        public static DescribeInvocationResultsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationResultsRequestTag self = new DescribeInvocationResultsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationResultsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInvocationResultsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
