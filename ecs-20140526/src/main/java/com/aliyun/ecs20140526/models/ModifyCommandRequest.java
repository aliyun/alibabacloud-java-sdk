// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCommandRequest extends TeaModel {
    /**
     * <p>>  This parameter is no longer used and does not take effect.</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The command ID. You can call the [DescribeCommands](https://help.aliyun.com/document_detail/64843.html) operation to query all available command IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The command description. The description supports all character sets and can be up to 512 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The command name. The name supports all character sets and can be up to 128 characters in length.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the command. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum timeout period for the command to be run on the instance. Unit: seconds. When a command cannot run within the specified time range, the command times out. Then, the command process is forcibly terminated by canceling the process ID (PID) of the command.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The working directory of the command. The value can be up to 200 characters in length.</p>
     */
    @NameInMap("WorkingDir")
    public String workingDir;

    public static ModifyCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommandRequest self = new ModifyCommandRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCommandRequest setCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }
    public String getCommandContent() {
        return this.commandContent;
    }

    public ModifyCommandRequest setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public ModifyCommandRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCommandRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCommandRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCommandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCommandRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCommandRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCommandRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public ModifyCommandRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

}
