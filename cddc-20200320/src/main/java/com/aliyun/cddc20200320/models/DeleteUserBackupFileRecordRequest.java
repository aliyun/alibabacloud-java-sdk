// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DeleteUserBackupFileRecordRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("OpsServiceVersion")
    public String opsServiceVersion;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteUserBackupFileRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserBackupFileRecordRequest self = new DeleteUserBackupFileRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserBackupFileRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteUserBackupFileRecordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteUserBackupFileRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteUserBackupFileRecordRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DeleteUserBackupFileRecordRequest setOpsServiceVersion(String opsServiceVersion) {
        this.opsServiceVersion = opsServiceVersion;
        return this;
    }
    public String getOpsServiceVersion() {
        return this.opsServiceVersion;
    }

    public DeleteUserBackupFileRecordRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DeleteUserBackupFileRecordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
