// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupStrategyRequest extends TeaModel {
    /**
     * <p>The interval at which you want to perform incremental log backups. Unit: seconds.</p>
     * <blockquote>
     * <p>This parameter takes effect only when physical backups are performed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    /**
     * <p>The day of each week when the full backup task runs. Valid values:</p>
     * <ul>
     * <li>Monday</li>
     * <li>Tuesday</li>
     * <li>Wednesday</li>
     * <li>Thursday</li>
     * <li>Friday</li>
     * <li>Saturday</li>
     * <li>Sunday</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Monday</p>
     */
    @NameInMap("BackupPeriod")
    public String backupPeriod;

    /**
     * <p>The ID of the backup schedule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01XXXX</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The start time of the full backup task. Specify the time in the HH:mm format.</p>
     * 
     * <strong>example:</strong>
     * <p>14:22</p>
     */
    @NameInMap("BackupStartTime")
    public String backupStartTime;

    /**
     * <p>The backup method that you want to use for full backups. Valid values:</p>
     * <ul>
     * <li><strong>simple</strong>: scheduled backup. If you specify this value for the BackupStrategyType parameter, you must also specify the BackupPeriod and BackupStartTime parameters.</li>
     * <li><strong>Manual</strong>: manual backup.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: <strong>simple</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("BackupStrategyType")
    public String backupStrategyType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    public static ModifyBackupStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupStrategyRequest self = new ModifyBackupStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupStrategyRequest setBackupLogIntervalSeconds(Integer backupLogIntervalSeconds) {
        this.backupLogIntervalSeconds = backupLogIntervalSeconds;
        return this;
    }
    public Integer getBackupLogIntervalSeconds() {
        return this.backupLogIntervalSeconds;
    }

    public ModifyBackupStrategyRequest setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    public ModifyBackupStrategyRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public ModifyBackupStrategyRequest setBackupStartTime(String backupStartTime) {
        this.backupStartTime = backupStartTime;
        return this;
    }
    public String getBackupStartTime() {
        return this.backupStartTime;
    }

    public ModifyBackupStrategyRequest setBackupStrategyType(String backupStrategyType) {
        this.backupStrategyType = backupStrategyType;
        return this;
    }
    public String getBackupStrategyType() {
        return this.backupStrategyType;
    }

    public ModifyBackupStrategyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyBackupStrategyRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
