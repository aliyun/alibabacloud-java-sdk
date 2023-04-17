// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    /**
     * <p>This parameter will be removed in the future and is retained only to ensure compatibility. We recommend that you ignore this parameter.</p>
     */
    @NameInMap("ConfirmStop")
    public Boolean confirmStop;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   true: performs a dry run. The system checks the required parameters, the request format, service limits, and available ECS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   false: performs a dry run and the request is made if the request passes the dry run.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully stop the instance. Valid values:</p>
     * <br>
     * <p>*   true: forcefully stops the instance.</p>
     * <p>*   false: normally stops the instance.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>>  This parameter is in invitational preview and is not available for public use.</p>
     */
    @NameInMap("Hibernate")
    public Boolean hibernate;

    /**
     * <p>The ID of the instance.</p>
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

    /**
     * <p>The stop mode of the pay-as-you-go instance. Default value: Disabled. Valid values:</p>
     * <br>
     * <p>*   StopCharging: economical mode. For information about how `StopCharging` takes effect, see the "Prerequisites" section in [Economical mode](~~63353~~).</p>
     * <p>*   KeepCharging: standard mode. After the instance is stopped in standard mode, you continue to be charged for it.</p>
     * <br>
     * <p>Default value: If the prerequisites required for enabling economical mode are met and you have enabled this mode in the ECS console, the default value is `StopCharging`. For more information, see the "Enable economical mode" section in [Economical mode](~~63353#default~~). Otherwise, the default value is `KeepCharging`.</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    public static StopInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceRequest self = new StopInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopInstanceRequest setConfirmStop(Boolean confirmStop) {
        this.confirmStop = confirmStop;
        return this;
    }
    public Boolean getConfirmStop() {
        return this.confirmStop;
    }

    public StopInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StopInstanceRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public StopInstanceRequest setHibernate(Boolean hibernate) {
        this.hibernate = hibernate;
        return this;
    }
    public Boolean getHibernate() {
        return this.hibernate;
    }

    public StopInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StopInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StopInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StopInstanceRequest setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

}
