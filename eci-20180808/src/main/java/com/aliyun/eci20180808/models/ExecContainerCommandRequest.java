// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ExecContainerCommandRequest extends TeaModel {
    /**
     * <p>The commands to run in the container. You can specify up to 20 commands. Each command can be up to 256 characters in length.\</p>
     * <p>The strings must be in the JSON format. Example: `["/bin/sh", "-c", "ls -a"]`.</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The ID of the elastic container instance.</p>
     */
    @NameInMap("ContainerGroupId")
    public String containerGroupId;

    /**
     * <p>The name of the container.</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to read the commands from standard input (stdin). Default value: true.</p>
     */
    @NameInMap("Stdin")
    public Boolean stdin;

    /**
     * <p>Specifies whether to run the command immediately and return the result. Default value: false.\</p>
     * <p>If you set this parameter to true, set the value of TTY to false.</p>
     */
    @NameInMap("Sync")
    public Boolean sync;

    /**
     * <p>Specifies whether to enable interaction. Default value: false.\</p>
     * <p>If the command is a /bin/bash command, set the value to true.</p>
     */
    @NameInMap("TTY")
    public Boolean TTY;

    public static ExecContainerCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContainerCommandRequest self = new ExecContainerCommandRequest();
        return TeaModel.build(map, self);
    }

    public ExecContainerCommandRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public ExecContainerCommandRequest setContainerGroupId(String containerGroupId) {
        this.containerGroupId = containerGroupId;
        return this;
    }
    public String getContainerGroupId() {
        return this.containerGroupId;
    }

    public ExecContainerCommandRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public ExecContainerCommandRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ExecContainerCommandRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ExecContainerCommandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExecContainerCommandRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ExecContainerCommandRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ExecContainerCommandRequest setStdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }
    public Boolean getStdin() {
        return this.stdin;
    }

    public ExecContainerCommandRequest setSync(Boolean sync) {
        this.sync = sync;
        return this;
    }
    public Boolean getSync() {
        return this.sync;
    }

    public ExecContainerCommandRequest setTTY(Boolean TTY) {
        this.TTY = TTY;
        return this;
    }
    public Boolean getTTY() {
        return this.TTY;
    }

}
