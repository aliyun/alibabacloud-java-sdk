// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   true: performs a dry run. The system checks your AccessKey pair, the permissions of the RAM user, and the required parameters. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * <p>*   false: performs a dry run and sends the request. If the request passes the dry run, a 2XX HTTP status code is returned and the request is made.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to restore the instance to its initial health state. This parameter is applicable to instances that are equipped with local disks, such as d1, i1, and i2 instances. If a local disk of a d1, i1, or i2 instance fails, you can use this parameter to specify whether to restore the instance to its initial health state on startup. Valid values:</p>
     * <br>
     * <p>*   true: restores the instance to its initial health state on startup. After the instance is restored to its initial health state, data stored on the local disks of the instance is lost.</p>
     * <p>*   false: does not perform operations and keeps the instance in the current state.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("InitLocalDisk")
    public Boolean initLocalDisk;

    /**
     * <p>The ID of the instance that you want to start.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static StartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRequest self = new StartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StartInstanceRequest setInitLocalDisk(Boolean initLocalDisk) {
        this.initLocalDisk = initLocalDisk;
        return this;
    }
    public Boolean getInitLocalDisk() {
        return this.initLocalDisk;
    }

    public StartInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StartInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
