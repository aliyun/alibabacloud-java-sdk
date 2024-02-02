// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    /**
     * <p>The command ID. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The command name.</p>
     */
    @NameInMap("CommandName")
    public String commandName;

    /**
     * <p>The command type. If this parameter and `InstanceId` are both specified, this parameter does not take effect.</p>
     */
    @NameInMap("CommandType")
    public String commandType;

    /**
     * <p>The encoding mode of the `CommandContent` and `Output` response parameters. Valid values:</p>
     * <br>
     * <p>*   PlainText: returns the original command content and command outputs.</p>
     * <p>*   Base64: returns the Base64-encoded command content and command outputs.</p>
     * <br>
     * <p>Default value: Base64.</p>
     */
    @NameInMap("ContentEncoding")
    public String contentEncoding;

    /**
     * <p>Specifies whether to return the command outputs in the response.</p>
     * <br>
     * <p>*   true: The command outputs are returned. When this parameter is set to true, you must specify `InvokeId`, `InstanceId`, or both.</p>
     * <p>*   false: The command outputs are not returned.</p>
     * <br>
     * <p>Default value: false</p>
     */
    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    /**
     * <p>The ID of instance N. When you specify this parameter, the system queries all the execution records of all the commands that run on the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The command task ID.</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>The overall execution state of the command. The value of this parameter depends on the execution states on all involved instances. Valid values:</p>
     * <br>
     * <p>*   Running:</p>
     * <br>
     * <p>    *   Scheduled execution: Before you manually stop the execution of the command, the overall execution state is always Running.</p>
     * <p>    *   One-time execution: If the execution is in progress on one or more instances, the overall execution state is Running.</p>
     * <br>
     * <p>*   Finished:</p>
     * <br>
     * <p>    *   Scheduled execution: The overall execution state can never be Finished.</p>
     * <p>    *   One-time execution: The execution is complete on all instances, or the execution is manually stopped on some instances and is complete on other instances.</p>
     * <br>
     * <p>*   Failed:</p>
     * <br>
     * <p>    *   Scheduled execution: The overall execution state can never be Failed.</p>
     * <p>    *   One-time execution: The execution fails on all instances.</p>
     * <br>
     * <p>*   PartialFailed:</p>
     * <br>
     * <p>    *   Scheduled execution: The overall execution state can never be PartialFailed.</p>
     * <p>    *   One-time execution: The execution fails on some instances.</p>
     * <br>
     * <p>*   Stopped: The execution is stopped.</p>
     */
    @NameInMap("InvokeStatus")
    public String invokeStatus;

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
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the page to return.</p>
     * <br>
     * <p>Page numbers start from 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The execution mode of the command. Valid values:</p>
     * <br>
     * <p>*   Once: immediately runs the command.</p>
     * <p>*   Period: The command is run on a schedule.</p>
     * <p>*   NextRebootOnly: The command is automatically run the next time the instance starts.</p>
     * <p>*   EveryReboot: The command is automatically run every time the instance starts.</p>
     * <br>
     * <p>This parameter is empty by default, which indicates that commands run in all modes are queried.</p>
     */
    @NameInMap("RepeatMode")
    public String repeatMode;

    /**
     * <p>The ID of the resource group. After you set this parameter, command execution results in the specified resource group are queried.</p>
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
     * <p>Specifies whether to query commands that are to be automatically run. Valid values:</p>
     * <br>
     * <p>*   true: queries commands that meet the following requirements: The commands are run by calling the `RunCommand` or `InvokeCommand` operation with `RepeatMode` set to `Period`, `NextRebootOnly`, or `EveryReboot`. The executions of the commands are not canceled and not complete or are not stopped and not complete.</p>
     * <br>
     * <p>*   false: queries commands that meet the following requirements:</p>
     * <br>
     * <p>    *   The commands are run by calling the `RunCommand` or `InvokeCommand` operation with `RepeatMode` set to `Once`.</p>
     * <p>    *   The executions of the commands are canceled, stopped, or complete.</p>
     * <br>
     * <p>Default value: false.</p>
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
         * <br>
         * <p>If a single tag is specified to query resources, up to 1,000 resources that have this tag added can be displayed in the response. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added can be displayed in the response. To query more than 1,000 resources that have specified tags added, call the [ListTagResources](~~110425~~) operation.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the command. You can specify up to 20 tag values for the command. The tag value can be an empty string. It can be up to 128 characters in length and cannot contain `http://` or `https://`.</p>
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
