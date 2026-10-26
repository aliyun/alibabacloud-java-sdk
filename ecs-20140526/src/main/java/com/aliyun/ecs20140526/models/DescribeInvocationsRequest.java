// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    /**
     * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> operation to query all available command IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz0jdfwcsr****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The command name. This parameter does not take effect if the InstanceId parameter is also specified.</p>
     * 
     * <strong>example:</strong>
     * <p>CommandTestName</p>
     */
    @NameInMap("CommandName")
    public String commandName;

    /**
     * <p>The command type. Valid values:</p>
     * <ul>
     * <li>RunBatScript: The command is a batch script that runs on a Windows instance.</li>
     * <li>RunPowerShellScript: The command is a PowerShell script that runs on a Windows instance.</li>
     * <li>RunShellScript: The command is a shell script that runs on a Linux instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>The encoding method of the CommandContent and Output fields in the response. Valid values:</p>
     * <ul>
     * <li>PlainText: returns the original command content and output.</li>
     * <li>Base64: returns the Base64-encoded command content and output.</li>
     * </ul>
     * <p>Default value: Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Specifies whether to return the output of the command execution in the response. Valid values:</p>
     * <ul>
     * <li>true: The output is returned. In this case, you must specify at least the InvokeId or InstanceId parameter.</li>
     * <li>false: The output is not returned.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>The instance ID. If you specify this parameter, the system queries all command execution records of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1i7gg30r52z2em****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The execution ID of the command.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz0jdfwd9f****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The overall execution status of the command. The overall execution status depends on the combined execution status of one or more instances involved in the execution. Valid values: </p>
     * <ul>
     * <li>Running:<ul>
     * <li>Scheduled execution: The execution status remains Running until the scheduled command is manually stopped.</li>
     * <li>One-time execution: The overall execution status is Running as long as a command process is running.</li>
     * </ul>
     * </li>
     * <li>Finished:<ul>
     * <li>Scheduled execution: The command process cannot be finished.</li>
     * <li>One-time execution: All instances have completed the execution. Alternatively, the command processes on some instances are manually stopped, and the execution on the remaining instances is completed.</li>
     * </ul>
     * </li>
     * <li>Success: The command execution status on each instance is Stopped or Success, and the command execution status on at least one instance is Success.<ul>
     * <li>Immediately run tasks: The command execution is completed, and the exit code is 0.</li>
     * <li>Scheduled tasks: The most recent execution is successful, the exit code is 0, and the specified schedule has ended.</li>
     * </ul>
     * </li>
     * <li>Failed:<ul>
     * <li>Scheduled execution: The command process cannot fail.</li>
     * <li>One-time execution: The execution fails on all instances.</li>
     * </ul>
     * </li>
     * <li>Stopped: The command is stopped.</li>
     * <li>Stopping: The command is being stopped.</li>
     * <li>PartialFailed: The execution partially fails. This value does not take effect if the InstanceId parameter is also specified.</li>
     * <li>Pending: The system is verifying or sending the command. The overall execution status is Pending if the command execution status on at least one instance is Pending.</li>
     * <li>Scheduled: The scheduled command has been sent and is waiting to be run. The overall execution status is Scheduled if the command execution status on at least one instance is Scheduled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    /**
     * <p>The maximum number of entries per page for paging.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set the value to the NextToken value returned from the previous API call.</p>
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
     * <p>This parameter will soon be taken offline. We recommend that you use NextToken and MaxResults for paging and paged query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p>This parameter will soon be taken offline. We recommend that you use NextToken and MaxResults for paging and paged query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

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
     * <p>The execution mode of the command. This parameter does not take effect if the InstanceId parameter is also specified. Valid values:</p>
     * <ul>
     * <li>Once: runs the command immediately.</li>
     * <li>Period: runs the command on a schedule.</li>
     * <li>NextRebootOnly: automatically runs the command the next time the instance starts.</li>
     * <li>EveryReboot: automatically runs the command every time the instance starts.</li>
     * </ul>
     * <p>Default value: empty. An empty value indicates that all execution modes are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group to which the command execution belongs. If you specify this parameter, you must also specify ResourceGroupId when you run the command. This allows you to filter the corresponding command execution results.</p>
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
    public java.util.List<DescribeInvocationsRequestTag> tag;

    /**
     * <p>Specifies whether the queried command will be automatically run in the future. Valid values:</p>
     * <ul>
     * <li>true: Queries commands for which the RepeatMode parameter is set to Period, NextRebootOnly, or EveryReboot when you call RunCommand or InvokeCommand to run the commands.</li>
     * <li>false: Queries commands in the following states:<ul>
     * <li>Commands for which the RepeatMode parameter is set to Once when you call RunCommand or InvokeCommand to run the commands.</li>
     * <li>Commands that have been canceled, stopped, or completed.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Timed")
    public Boolean timed;

    public static DescribeInvocationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationsRequest self = new DescribeInvocationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationsRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public DescribeInvocationsRequest setCommandName(String commandName) {
        this.commandName = commandName;
        return this;
    }
    public String getCommandName() {
        return this.commandName;
    }

    public DescribeInvocationsRequest setCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }
    public String getCommandType() {
        return this.commandType;
    }

    public DescribeInvocationsRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public DescribeInvocationsRequest setIncludeOutput(Boolean includeOutput) {
        this.includeOutput = includeOutput;
        return this;
    }
    public Boolean getIncludeOutput() {
        return this.includeOutput;
    }

    public DescribeInvocationsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInvocationsRequest setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public DescribeInvocationsRequest setInvokeStatus(String invokeStatus) {
        this.invokeStatus = invokeStatus;
        return this;
    }
    public String getInvokeStatus() {
        return this.invokeStatus;
    }

    public DescribeInvocationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInvocationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInvocationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInvocationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInvocationsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInvocationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeInvocationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInvocationsRequest setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
        return this;
    }
    public String getRepeatMode() {
        return this.repeatMode;
    }

    public DescribeInvocationsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInvocationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInvocationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInvocationsRequest setTag(java.util.List<DescribeInvocationsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInvocationsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeInvocationsRequest setTimed(Boolean timed) {
        this.timed = timed;
        return this;
    }
    public Boolean getTimed() {
        return this.timed;
    }

    public static class DescribeInvocationsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the command to execute. Valid values of N: 1 to 20. The tag key cannot be an empty string.</p>
         * <p>If you use a single tag to filter resources, the resource count returned cannot exceed 1,000. If you use multiple tags to filter resources, the resource count of resources that have all the specified tags attached cannot exceed 1,000. If the resource count exceeds 1,000, use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation to query the resources.</p>
         * <p>The tag key can be up to 64 characters in length. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the command execution. Valid values of N: 1 to 20. The tag value can be an empty string.
         * The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInvocationsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationsRequestTag self = new DescribeInvocationsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInvocationsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
