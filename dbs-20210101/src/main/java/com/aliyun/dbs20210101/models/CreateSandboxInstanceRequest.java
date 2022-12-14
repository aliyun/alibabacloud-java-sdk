// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class CreateSandboxInstanceRequest extends TeaModel {
    // The ID of the backup schedule. You can call the [DescribeBackupPlanList](~~437215~~) operation to obtain the ID of the backup schedule.
    // 
    // >  If your instance is an ApsaraDB RDS for MySQL instance, you can configure [automatic access to the instance](~~193091~~) to automatically add the instance to DBS and obtain the ID of the backup schedule.
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    // The ID of the backup set to be restored, which is the point in time when a snapshot was created. You can call the [DescribeSandboxBackupSets](~~437256~~) operation to obtain the ID.
    // 
    // >  You need to specify only one of the **BackupSetId** and **RestoreTime** parameters.
    @NameInMap("BackupSetId")
    public String backupSetId;

    // The point in time of the sandbox instance to be restored. You can call the [DescribeSandboxRecoveryTime](~~437258~~) operation to view the recoverable time range. Specify the time in the format of *yyyy-MM-ddTHH:mm:ssZ*. The time must be in UTC.
    @NameInMap("RestoreTime")
    public String restoreTime;

    // The name of the sandbox instance.
    @NameInMap("SandboxInstanceName")
    public String sandboxInstanceName;

    // The password of the privileged account created in the sandbox instance.
    @NameInMap("SandboxPassword")
    public String sandboxPassword;

    // The specifications of the sandbox instance. Valid values:
    // 
    // *   **MYSQL\_1C\_1M_SD**: 1 CPU core and 1 GB of memory.
    // *   **MYSQL\_1C\_2M_SD**: 1 CPU core and 2 GB of memory.
    // *   **MYSQL\_2C\_4M_SD**: 2 CPU cores and 4 GB of memory.
    // *   **MYSQL\_2C\_8M_SD**: 2 CPU cores and 8 GB of memory.
    // *   **MYSQL\_4C\_8M_SD**: 4 CPU cores and 8 GB of memory.
    // *   **MYSQL\_4C\_16M_SD**: 4 CPU cores and 16 GB of memory.
    // *   **MYSQL\_8C\_16M_SD**: 8 CPU cores and 16 GB of memory.
    // *   **MYSQL\_8C\_32M_SD**: 8 CPU cores and 32 GB of memory.
    // 
    // >  Different specifications have little impact on the recovery speed. High-specification instances provide better performance after restoration. For more information, see [Sandbox instance fees](~~201466~~).
    @NameInMap("SandboxSpecification")
    public String sandboxSpecification;

    // The type of the sandbox instance. You can call this operation only to create an instance of the **Sandbox** type. After the sandbox instance is created, the MySQL endpoint of the instance is provided.
    @NameInMap("SandboxType")
    public String sandboxType;

    // The privileged account created in the sandbox instance.
    // 
    // *   After you specify this parameter, the system creates a privileged account in the sandbox instance. The account has the permissions on all databases in the instance.
    // 
    // The account of the source database is retained in the sandbox instance.
    // 
    // *   If you do not specify this parameter, the database account is the same as that of the source database.
    @NameInMap("SandboxUser")
    public String sandboxUser;

    // The ID of the virtual private cloud (VPC) that is used to connect to the sandbox instance. If you want to connect to the sandbox instance by using Elastic Compute Service (ECS) instances, you must set this parameter to the VPC in which the ECS instances reside.
    // 
    // >  You can set this parameter if you want to use it in a recovery drill scenario.
    @NameInMap("VpcId")
    public String vpcId;

    // The ID of the VSwitch that is used to connect to the sandbox instance.
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
