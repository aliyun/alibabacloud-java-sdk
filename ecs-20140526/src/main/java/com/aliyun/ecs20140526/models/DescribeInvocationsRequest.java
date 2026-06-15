// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    /**
     * <p>The command ID. You can call the <a href="https://help.aliyun.com/document_detail/64843.html">DescribeCommands</a> API to query all available CommandId values.</p>
     * 
     * <strong>example:</strong>
     * <p>c-hz0jdfwcsr****</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The command name. If the <code>InstanceId</code> parameter is also specified, this parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>CommandTestName</p>
     */
    @NameInMap("CommandName")
    public String commandName;

    /**
     * <p>The command type. Valid values:</p>
     * <ul>
     * <li><p>RunBatScript: The command is a Bat script that runs on a Windows instance.</p>
     * </li>
     * <li><p>RunPowerShellScript: The command is a PowerShell script that runs on a Windows instance.</p>
     * </li>
     * <li><p>RunShellScript: The command is a Shell script that runs on a Linux instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>The codec for the <code>CommandContent</code> and <code>Output</code> fields in the returned data. Valid values:</p>
     * <ul>
     * <li><p>PlainText: Returns the original command content and output information.</p>
     * </li>
     * <li><p>Base64: Returns Base64-encoded command content and output information.</p>
     * </li>
     * </ul>
     * <p>Default value: Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Indicates whether to return the command execution output in the results.</p>
     * <ul>
     * <li><p>true: Returns the output. In this case, you must specify at least one of the <code>InvokeId</code> or <code>InstanceId</code> parameters.</p>
     * </li>
     * <li><p>false: Does not return the output.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>The instance ID. If you specify this parameter, all command execution records for this instance will be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1i7gg30r52z2em****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The command execution ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz0jdfwd9f****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The overall execution status of the command. The overall status depends on the combined execution statuses of one or more instances involved in the command execution. Valid values:</p>
     * <ul>
     * <li><p>Running:</p>
     * <ul>
     * <li><p>Periodic execution: The status remains Running until the periodic execution is manually stopped.</p>
     * </li>
     * <li><p>One-time execution: The overall status is Running as long as any instance has a running command process.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Finished:</p>
     * <ul>
     * <li><p>Periodic execution: The command process cannot reach a Finished state.</p>
     * </li>
     * <li><p>One-time execution: All instances have completed execution, or some instances were manually stopped while the rest completed execution.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Success: All instances have a command execution status of either Stopped or Success, and at least one instance has a status of Success. Specifically:</p>
     * <ul>
     * <li><p>For immediate jobs: The command completed successfully with an exit code of 0.</p>
     * </li>
     * <li><p>For scheduled jobs: The most recent execution succeeded with an exit code of 0, and all scheduled times have been completed.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Failed:</p>
     * <ul>
     * <li><p>Periodic execution: The command process cannot reach a Failed state.</p>
     * </li>
     * <li><p>One-time execution: All instances failed execution.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Stopped: The command was stopped.</p>
     * </li>
     * <li><p>Stopping: The command is being stopped.</p>
     * </li>
     * <li><p>PartialFailed: Partial failure. This value does not take effect if the <code>InstanceId</code> parameter is also specified.</p>
     * </li>
     * <li><p>Pending: The system is validating or sending the command. If at least one instance has a Pending execution status, the overall status is Pending.</p>
     * </li>
     * <li><p>Scheduled: The scheduled command has been sent and is waiting to run. If at least one instance has a Scheduled execution status, the overall status is Scheduled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    /**
     * <p>The maximum number of entries per page for paged queries.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query credential (Token). Set this parameter to the NextToken value returned by the previous API call.</p>
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
     * <p>This parameter will be unpublished soon. We recommend that you use NextToken and MaxResults to perform paged queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p>This parameter will be unpublished soon. We recommend that you use NextToken and MaxResults to perform paged query operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The Region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest Alibaba Cloud region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The execution mode of the command. This parameter does not take effect if the <code>InstanceId</code> parameter is also specified. Valid values:</p>
     * <ul>
     * <li><p>Once: Executes the command immediately.</p>
     * </li>
     * <li><p>Period: Executes the command periodically.</p>
     * </li>
     * <li><p>NextRebootOnly: Automatically executes the command the next time the instance starts.</p>
     * </li>
     * <li><p>EveryReboot: Automatically executes the command every time the instance starts.</p>
     * </li>
     * </ul>
     * <p>Default value: empty, which indicates that all modes are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The resource group ID of the command execution. After you specify this parameter, you must also specify ResourceGroupId when executing the command. This enables filtering to retrieve the corresponding command execution results.</p>
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
     * <p>The tag list.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInvocationsRequestTag> tag;

    /**
     * <p>Indicates whether the queried command will be automatically executed in the future. Valid values:</p>
     * <ul>
     * <li><p>true: The command is queried when the <code>RepeatMode</code> parameter is set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code> during a call to <code>RunCommand</code> or <code>InvokeCommand</code>.</p>
     * </li>
     * <li><p>false: The command is queried under either of the following conditions:</p>
     * <ul>
     * <li><p>The <code>RepeatMode</code> parameter is set to <code>Once</code> during a call to <code>RunCommand</code> or <code>InvokeCommand</code>.</p>
     * </li>
     * <li><p>The command has been canceled, stopped, or has finished execution.</p>
     * </li>
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
         * <p>The tag key for command execution. Valid values for N are 1 to 20. If this value is specified, it cannot be an empty string.</p>
         * <p>When you use one tag to filter resources, the number of resources under this tag cannot exceed 1,000. When you use multiple tags to filter resources, the number of resources bound to all specified tags simultaneously cannot exceed 1,000. If the number of resources exceeds 1,000, you must use the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> API to query them.</p>
         * <p>The key can contain up to 64 characters, must not start with <code>aliyun</code> or <code>acs:</code>, and must not contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value for command execution. Valid values for N are 1 to 20. This value can be an empty string.</p>
         * <p>The value can contain up to 128 characters and must not contain <code>http://</code> or <code>https://</code>.</p>
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
