// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateHanaBackupPlanRequest extends TeaModel {
    /**
     * <p>The backup prefix.</p>
     */
    @NameInMap("BackupPrefix")
    public String backupPrefix;

    /**
     * <p>The backup type. Valid values:</p>
     * <br>
     * <p>*   COMPLETE: full backup</p>
     * <p>*   INCREMENTAL: incremental backup</p>
     * <p>*   DIFFERENTIAL: differential backup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The ID of the SAP HANA instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the database.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The name of the backup plan.</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The backup policy. Format: `I|{startTime}|{interval}`. The system runs the first backup job at a point in time that is specified in the {startTime} parameter and the subsequent backup jobs at an interval that is specified in the {interval} parameter. The system does not run a backup job before the specified point in time. Each backup job, except the first one, starts only after the previous backup job is completed. For example, `I|1631685600|P1D` specifies that the system runs the first backup job at 14:00:00 on September 15, 2021 and the subsequent backup jobs once a day.</p>
     * <br>
     * <p>*   startTime: the time at which the system starts to run a backup job. The time must follow the UNIX time format. Unit: seconds.</p>
     * <p>*   interval: the interval at which the system runs a backup job. The interval must follow the ISO 8601 standard. For example, PT1H specifies an interval of one hour. P1D specifies an interval of one day.</p>
     */
    @NameInMap("Schedule")
    public String schedule;

    /**
     * <p>The ID of the backup vault.</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateHanaBackupPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHanaBackupPlanRequest self = new CreateHanaBackupPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateHanaBackupPlanRequest setBackupPrefix(String backupPrefix) {
        this.backupPrefix = backupPrefix;
        return this;
    }
    public String getBackupPrefix() {
        return this.backupPrefix;
    }

    public CreateHanaBackupPlanRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CreateHanaBackupPlanRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateHanaBackupPlanRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public CreateHanaBackupPlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public CreateHanaBackupPlanRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateHanaBackupPlanRequest setSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }
    public String getSchedule() {
        return this.schedule;
    }

    public CreateHanaBackupPlanRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
