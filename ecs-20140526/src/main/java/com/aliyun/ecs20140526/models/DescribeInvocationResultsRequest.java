// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationResultsRequest extends TeaModel {
    /**
     * <p>The command ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz0jdfwcsr****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The encoding method of the <code>CommandContent</code> and <code>Output</code> fields in the response. Valid values:</p>
     * <ul>
     * <li>PlainText: Returns the original command content and output.</li>
     * <li>Base64: Returns the Base64-encoded command content and output.</li>
     * </ul>
     * <p>Default value: Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Specifies whether to return the execution history of scheduled commands. Valid values:</p>
     * <ul>
     * <li>true: Returns the execution results of scheduled commands. When this parameter is set to true, the InvokeId parameter is required and must be the execution ID of a scheduled command (RepeatMode is Period) or a command that runs at each system startup (RepeatMode is EveryReboot).</li>
     * <li>false: Does not return the execution history.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeHistory")
    public Boolean includeHistory;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1i7gg30r52z2em****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The command execution ID. You can call <a href="https://help.aliyun.com/document_detail/64840.html">DescribeInvocations</a> to query the InvokeId.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz0jdfwd9f****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The execution status of the command. Valid values:</p>
     * <ul>
     * <li>Running: The command is running.<ul>
     * <li>Scheduled execution: The execution status remains running until you manually stop the scheduled command.</li>
     * <li>One-time execution: The overall execution status is running as long as any command process is running.</li>
     * </ul>
     * </li>
     * <li>Finished: The command execution is complete.<ul>
     * <li>Scheduled execution: The command process cannot have a status of finished.</li>
     * <li>One-time execution: All instances have completed execution, or you manually stopped the command process on some instances and the remaining instances have completed execution.</li>
     * </ul>
     * </li>
     * <li>Success:<ul>
     * <li>One-time execution: The command execution is complete and the exit code is 0.</li>
     * <li>Scheduled execution: The last execution succeeded with an exit code of 0, and the specified execution time has ended.</li>
     * </ul>
     * </li>
     * <li>Failed: The command execution failed.<ul>
     * <li>Scheduled execution: The command process cannot have a status of failed.</li>
     * <li>One-time execution: The command execution failed on all instances.</li>
     * </ul>
     * </li>
     * <li>PartialFailed: The command execution partially failed.<ul>
     * <li>Scheduled execution: The command process cannot have a status of partially failed.</li>
     * <li>One-time execution: The command execution failed on some instances, so the overall execution status is partially failed.</li>
     * </ul>
     * </li>
     * <li>Stopped: The command execution has been stopped.</li>
     * <li>Stopping: The command execution is being stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("InvokeRecordStatus")
    public String invokeRecordStatus;

    /**
     * <p>The maximum number of entries per page in a paging query.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
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
     * <p>This parameter is about to go offline. Use NextToken and MaxResults to complete paging query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p>This parameter is about to go offline. Use NextToken and MaxResults to complete paging query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID of the command execution. After you specify this parameter, the resource group ID must also be specified when you run the command. This parameter filters the corresponding command execution results.</p>
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
     * <p>The tags.</p>
     */
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

    public DescribeInvocationResultsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInvocationResultsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <p>The tag key of the command execution. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the number of resources with this tag cannot exceed 1,000. If you use multiple tags to filter resources, the number of resources with all specified tags attached cannot exceed 1,000. If the number of resources exceeds 1,000, call <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> to execute the query.</p>
         * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command execution. Valid values of N: 1 to 20. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
