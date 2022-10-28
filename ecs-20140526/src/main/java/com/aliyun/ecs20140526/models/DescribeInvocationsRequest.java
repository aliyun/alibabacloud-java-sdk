// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInvocationsRequest extends TeaModel {
    @NameInMap("CommandId")
    public String commandId;

    @NameInMap("CommandName")
    public String commandName;

    @NameInMap("CommandType")
    public String commandType;

    @NameInMap("ContentEncoding")
    public String contentEncoding;

    @NameInMap("IncludeOutput")
    public Boolean includeOutput;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InvokeId")
    public String invokeId;

    @NameInMap("InvokeStatus")
    public String invokeStatus;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepeatMode")
    public String repeatMode;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeInvocationsRequestTag> tag;

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
        @NameInMap("Key")
        public String key;

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
