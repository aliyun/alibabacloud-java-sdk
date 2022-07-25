// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateSandboxInstanceRequest extends TeaModel {
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SandboxInstanceName")
    public String sandboxInstanceName;

    @NameInMap("SandboxPassword")
    public String sandboxPassword;

    @NameInMap("SandboxSpecification")
    public String sandboxSpecification;

    @NameInMap("SandboxType")
    public String sandboxType;

    @NameInMap("SandboxUser")
    public String sandboxUser;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpcSwitchId")
    public String vpcSwitchId;

    public static CreateSandboxInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSandboxInstanceRequest self = new CreateSandboxInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSandboxInstanceRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public CreateSandboxInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateSandboxInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CreateSandboxInstanceRequest setSandboxInstanceName(String sandboxInstanceName) {
        this.sandboxInstanceName = sandboxInstanceName;
        return this;
    }
    public String getSandboxInstanceName() {
        return this.sandboxInstanceName;
    }

    public CreateSandboxInstanceRequest setSandboxPassword(String sandboxPassword) {
        this.sandboxPassword = sandboxPassword;
        return this;
    }
    public String getSandboxPassword() {
        return this.sandboxPassword;
    }

    public CreateSandboxInstanceRequest setSandboxSpecification(String sandboxSpecification) {
        this.sandboxSpecification = sandboxSpecification;
        return this;
    }
    public String getSandboxSpecification() {
        return this.sandboxSpecification;
    }

    public CreateSandboxInstanceRequest setSandboxType(String sandboxType) {
        this.sandboxType = sandboxType;
        return this;
    }
    public String getSandboxType() {
        return this.sandboxType;
    }

    public CreateSandboxInstanceRequest setSandboxUser(String sandboxUser) {
        this.sandboxUser = sandboxUser;
        return this;
    }
    public String getSandboxUser() {
        return this.sandboxUser;
    }

    public CreateSandboxInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateSandboxInstanceRequest setVpcSwitchId(String vpcSwitchId) {
        this.vpcSwitchId = vpcSwitchId;
        return this;
    }
    public String getVpcSwitchId() {
        return this.vpcSwitchId;
    }

}
