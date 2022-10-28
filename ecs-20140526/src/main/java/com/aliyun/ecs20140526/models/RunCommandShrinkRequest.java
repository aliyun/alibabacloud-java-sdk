// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RunCommandShrinkRequest extends TeaModel {
    @NameInMap("CommandContent")
    public String commandContent;

    @NameInMap("ContainerId")
    public String containerId;

    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("ContentEncoding")
    public String contentEncoding;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnableParameter")
    public Boolean enableParameter;

    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("KeepCommand")
    public Boolean keepCommand;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Parameters")
    public String parametersShrink;

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
    public java.util.List<RunCommandShrinkRequestTag> tag;

    @NameInMap("Timed")
    public Boolean timed;

    @NameInMap("Timeout")
    public Long timeout;

    @NameInMap("Type")
    public String type;

    @NameInMap("Username")
    public String username;

    @NameInMap("WindowsPasswordName")
    public String windowsPasswordName;

    @NameInMap("WorkingDir")
    public String workingDir;

    public static RunCommandShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCommandShrinkRequest self = new RunCommandShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunCommandShrinkRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public RunCommandShrinkRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public RunCommandShrinkRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public RunCommandShrinkRequest setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public RunCommandShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunCommandShrinkRequest setEnableParameter(Boolean enableParameter) {
        this.enableParameter = enableParameter;
        return this;
    }
    public Boolean getEnableParameter() {
        return this.enableParameter;
    }

    public RunCommandShrinkRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public RunCommandShrinkRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public RunCommandShrinkRequest setKeepCommand(Boolean keepCommand) {
        this.keepCommand = keepCommand;
        return this;
    }
    public Boolean getKeepCommand() {
        return this.keepCommand;
    }

    public RunCommandShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCommandShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RunCommandShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RunCommandShrinkRequest setParametersShrink(String parametersShrink) {
        this.parametersShrink = parametersShrink;
        return this;
    }
    public String getParametersShrink() {
        return this.parametersShrink;
    }

    public RunCommandShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunCommandShrinkRequest setRepeatMode(String repeatMode) {
        this.repeatMode = repeatMode;
        return this;
    }
    public String getRepeatMode() {
        return this.repeatMode;
    }

    public RunCommandShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public RunCommandShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RunCommandShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RunCommandShrinkRequest setTag(java.util.List<RunCommandShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RunCommandShrinkRequestTag> getTag() {
        return this.tag;
    }

    public RunCommandShrinkRequest setTimed(Boolean timed) {
        this.timed = timed;
        return this;
    }
    public Boolean getTimed() {
        return this.timed;
    }

    public RunCommandShrinkRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public RunCommandShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RunCommandShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public RunCommandShrinkRequest setWindowsPasswordName(String windowsPasswordName) {
        this.windowsPasswordName = windowsPasswordName;
        return this;
    }
    public String getWindowsPasswordName() {
        return this.windowsPasswordName;
    }

    public RunCommandShrinkRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class RunCommandShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static RunCommandShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RunCommandShrinkRequestTag self = new RunCommandShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public RunCommandShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RunCommandShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
