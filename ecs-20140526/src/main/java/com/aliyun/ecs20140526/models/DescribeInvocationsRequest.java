// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    // The ID of the command. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.
    @NameInMap("CommandId")
    public String commandId;

    // The name of the command.
    @NameInMap("CommandName")
    public String commandName;

    // The type of the command. If this parameter and `InstanceId` are both specified, this parameter does not take effect.
    @NameInMap("CommandType")
    public String commandType;

    // The encoding mode of the `CommandContent` and `Output` response parameters. Valid values:
    // 
    // *   PlainText: returns the original command content and command outputs.
    // *   Base64: returns the Base64-encoded command content and command outputs.
    // 
    // Default value: Base64.
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    // Specifies whether to return the command outputs in the response.
    // 
    // *   true: The command outputs are returned. When this parameter is set to true, you must specify `InvokeId`, `InstanceId`, or both.
    // *   false: The command outputs are not returned.
    // 
    // Default value: false.
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    // The ID of the instance. When you specify this parameter, the system queries all the execution records of all the commands that run on the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The ID of the command task.
    @NameInMap("InvokeId")
    public String invokeId;

    // The overall execution state of the command. The value of this parameter depends on the execution states of all involved instances. Valid values:
    // 
    // *   Running:
    // 
    //     *   Scheduled execution: Before you manually stop the execution of the command, the overall execution state is always Running.
    //     *   One-time execution: If the execution is in progress on one or more instances, the overall execution state is Running.
    // 
    // *   Finished:
    // 
    //     *   Scheduled execution: The overall execution state can never be Finished.
    //     *   One-time execution: The execution is complete on all instances, or the execution is manually stopped on some instances and is complete on other instances.
    // 
    // *   Failed:
    // 
    //     *   Scheduled execution: The overall execution state can never be Failed.
    //     *   One-time execution: The execution fails on all instances.
    // 
    // *   PartialFailed:
    // 
    //     *   Scheduled execution: The overall execution state can never be PartialFailed.
    //     *   One-time execution: The execution fails on some instances.
    // 
    // *   Stopped: The execution is stopped.
    @NameInMap("InvokeStatus")
    public String invokeStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    // 
    // Page start from page 1.
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

    // The execution mode of the command. Valid values:
    // 
    // *   Once: The command is immediately run.
    // *   Period: The command is run on a schedule.
    // *   NextRebootOnly: The command is automatically run the next time the instance starts.
    // *   EveryReboot: The command is automatically run every time the instance starts.
    // 
    // This parameter is empty by default, which indicates that the commands in all the modes are queried.
    @NameInMap("RepeatMode")
    public String repeatMode;

    // The ID of the resource group to which the key pair belongs. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.
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
    public java.util.List<DescribeInvocationsRequestTag> tag;

    // Specifies whether to query the commands that are to be automatically run. Valid values:
    // 
    // *   true: queries the commands that meet the following requirements: The commands are run by calling the `RunCommand` or `InvokeCommand` operation with `RepeatMode` set to `Period`, `NextRebootOnly`, or `EveryReboot`. The executions of the commands are not canceled and not complete or are not stopped and not complete.
    // 
    // *   false: queries commands that meet the following requirements:
    // 
    //     *   The commands are run by calling the `RunCommand` or `InvokeCommand` operation with `RepeatMode` set to `Once`.
    //     *   The executions of the commands are canceled, stopped, or complete.
    // 
    // Default value: false.
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
