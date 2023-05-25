// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCommandRequest extends TeaModel {
    /**
     * <p>The command description. The description supports all character sets and can be up to 512 characters in length.</p>
     */
    @NameInMap("CommandContent")
    public String commandContent;

    /**
     * <p>The region ID of the command. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("CommandId")
    public String commandId;

    /**
     * <p>The command name. The name supports all character sets and can be up to 128 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The command ID. You can call the [DescribeCommands](~~64843~~) operation to query all available command IDs.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>You can modify a command when it is run. After the command is modified, the new command content applies to subsequent executions.</p>
     * <br>
     * <p>You cannot modify the command type. For example, you cannot change a shell command (RunShellScript) to a batch command (RunBatScript).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The working directory of the command.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The command content. The command content can be plaintext or Base64-encoded. Take note of the following items:</p>
     * <br>
     * <p>*   The Base64-encoded command content can be up to 16 KB in size.</p>
     * <br>
     * <p>*   If the command content is Base64-encoded, set `ContentEncoding` to Base64.</p>
     * <br>
     * <p>*   If you set `EnableParameter` to true, the custom parameter feature is enabled and you can specify custom parameters based on the following rules:</p>
     * <br>
     * <p>    *   Specify custom parameters in the `{{}}` format. When parameter names are enclosed in `{{}}`, the spaces and line feeds before and after the parameter names are ignored.</p>
     * <p>    *   You can specify up to 20 custom parameters.</p>
     * <p>    *   A custom parameter name can contain only letters, digits, underscores (\_), and hyphens (-). The name is not case-sensitive.</p>
     * <p>    *   Each custom parameter name cannot exceed 64 bytes in length.</p>
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
