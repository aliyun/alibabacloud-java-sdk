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
     * <p>The command name. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>CommandTestName</p>
     */
    @NameInMap("CommandName")
    public String commandName;

    /**
     * <p>The command type. Valid values:</p>
     * <ul>
     * <li>RunBatScript: batch command, applicable to Windows instances.</li>
     * <li>RunPowerShellScript: PowerShell command, applicable to Windows instances.</li>
     * <li>RunShellScript: shell command, applicable to Linux instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RunShellScript</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>The encoding mode of the <code>CommandContent</code> and <code>Output</code> response parameters. Valid values:</p>
     * <ul>
     * <li>PlainText: returns the original command content and command outputs.</li>
     * <li>Base64: returns the Base64-encoded command content and command outputs.</li>
     * </ul>
     * <p>Default value: Base64.</p>
     * 
     * <strong>example:</strong>
     * <p>PlainText</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Specifies whether to return the command outputs in the response.</p>
     * <ul>
     * <li>true: The command outputs are returned. When this parameter is set to true, you must specify <code>InvokeId</code>, <code>InstanceId</code>, or both.</li>
     * <li>false: The command outputs are not returned.</li>
     * </ul>
     * <p>Default value: false</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>The ID of instance N. When you specify this parameter, the system queries all the execution records of all the commands that run on the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1i7gg30r52z2em****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The command task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz0jdfwd9f****</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The overall execution status of the command task. The value of this parameter depends on the execution states of the command task on all involved instances. Valid values:</p>
     * <ul>
     * <li><p>Running:</p>
     * <ul>
     * <li>Scheduled task: Before you stop the scheduled execution of the command, the overall execution state is always Running.</li>
     * <li>One-time task: If the command is being run on instances, the overall execution state is Running.</li>
     * </ul>
     * </li>
     * <li><p>Finished:</p>
     * <ul>
     * <li>Scheduled task: The overall execution state can never be Finished.</li>
     * <li>One-time task: The execution is complete on all instances, or the execution is stopped on some instances and is complete on the other instances.</li>
     * </ul>
     * </li>
     * <li><p>Success: If the execution state on at least one instance is Success and the execution state on the other instances is Stopped or Success, the overall execution state is Success.</p>
     * <ul>
     * <li>One-time task: The execution is complete, and the exit code is 0.</li>
     * <li>Scheduled task: The last execution is complete, the exit code is 0, and the specified period ends.</li>
     * </ul>
     * </li>
     * <li><p>Failed:</p>
     * <ul>
     * <li>Scheduled task: The overall execution state can never be Failed.</li>
     * <li>One-time task: The execution failed on all instances.</li>
     * </ul>
     * </li>
     * <li><p>Stopped: The task is stopped.</p>
     * </li>
     * <li><p>Stopping: The task is being stopped.</p>
     * </li>
     * <li><p>PartialFailed: The task fails on some instances. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect.</p>
     * </li>
     * <li><p>Pending: The command is being verified or sent. If the execution state on at least one instance is Pending, the overall execution state is Pending.</p>
     * </li>
     * <li><p>Scheduled: The command that is set to run on a schedule is sent and waiting to be run. If the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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
     * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <blockquote>
     * <p> This parameter will be removed in the future. We recommend that you use NextToken and MaxResults for a paged query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The execution mode of the command. If you specify both this parameter and <code>InstanceId</code>, this parameter does not take effect. Valid values:</p>
     * <ul>
     * <li>Once: The command is immediately run.</li>
     * <li>Period: The command is run on a schedule.</li>
     * <li>NextRebootOnly: The command is run the next time the instances start.</li>
     * <li>EveryReboot: The command is run every time the instances start.</li>
     * </ul>
     * <p>This parameter is empty by default, which indicates that commands run in all modes are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Once</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group. After you set this parameter, command execution results in the specified resource group are queried.</p>
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
     * <p>The tags that are added to the command.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInvocationsRequestTag> tag;

    /**
     * <p>Specifies whether the command is to be automatically run. Valid values:</p>
     * <ul>
     * <li><p>true: The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Period</code>, <code>NextRebootOnly</code>, or <code>EveryReboot</code>.</p>
     * </li>
     * <li><p>false: The command meets one of the following requirements:</p>
     * <ul>
     * <li>The command is run by calling the <code>RunCommand</code> or <code>InvokeCommand</code> operation with <code>RepeatMode</code> set to <code>Once</code>.</li>
     * <li>The command task is canceled, stopped, or completed.</li>
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
         * <p>The key of tag N of the command. You can specify up to 20 tag keys for the command. The tag key cannot be an empty string.</p>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the command. You can specify up to 20 tag values for the command. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
