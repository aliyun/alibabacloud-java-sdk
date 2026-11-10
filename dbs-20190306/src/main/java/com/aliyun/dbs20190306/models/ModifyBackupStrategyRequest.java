// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupStrategyRequest extends TeaModel {
    /**
     * <p>The incremental backup interval in seconds.</p>
     * <blockquote>
     * <p>Only physical backups are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BackupLogIntervalSeconds")
    public Integer backupLogIntervalSeconds;

    /**
     * <p>The full backup cycle. Valid values:</p>
     * <ul>
     * <li>Monday: Monday</li>
     * <li>Tuesday: Tuesday</li>
     * <li>Wednesday: Wednesday</li>
     * <li>Thursday: Thursday</li>
     * <li>Friday: Friday</li>
     * <li>Saturday: Saturday</li>
     * <li>Sunday: Sunday</li>
     * </ul>
     * <blockquote>
     * <p>You must specify at least two days of the week for BackupPeriod and separate the days with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Monday,Tuesday,Wednesday</p>
     */
    @NameInMap("BackupPeriod")
    public String backupPeriod;

    /**
     * <p>The ID of the backup plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbstooi01XXXX</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The start time of the full backup. Format: HH:mm.</p>
     * <blockquote>
     * <p>This parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>14:22</p>
     */
    @NameInMap("BackupStartTime")
    public String backupStartTime;

    /**
     * <p>The full backup epoch. Valid values:</p>
     * <ul>
     * <li><strong>simple</strong>: periodic backup. This value is used together with BackupPeriod and BackupStartTime.</li>
     * <li><strong>manual</strong>: manual backup.</li>
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
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions.</p>
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
