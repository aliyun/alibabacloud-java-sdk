// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetBackupPolicyRequest extends TeaModel {
    /**
     * <p>The databases to be backed up. Separate multiple databases with commas (,).</p>
     * <blockquote>
     * <p> This parameter takes effect only when the backup level is database level.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test1,test2</p>
     */
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    /**
     * <p>The level of the backup. Valid values:</p>
     * <ul>
     * <li>db: The database type.</li>
     * <li>instance: instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("BackupLevel")
    public String backupLevel;

    /**
     * <p>Specifies whether to enable log Backup. Valid values:</p>
     * <ul>
     * <li>1: enabled.</li>
     * <li>0: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackupLog")
    public String backupLog;

    /**
     * <p>The backup mode. Valid values:</p>
     * <ul>
     * <li>**Logic **: logical backup</li>
     * <li><strong>phy</strong>: physical backup</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>phy</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The retention period of the backup data. Value range: 7 to 730.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("DataBackupRetentionPeriod")
    public String dataBackupRetentionPeriod;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds************</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The log retention period. Valid values: 7 to 730. This value must be less than or equal to the number of data backup days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    /**
     * <p>The end time of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>12:30:30</p>
     */
    @NameInMap("PreferredBackupEndTime")
    public String preferredBackupEndTime;

    /**
     * <p>The backup cycle. Valid values:</p>
     * <ul>
     * <li>0: Monday</li>
     * <li>1: Tuesday</li>
     * <li>2: Wednesday</li>
     * <li>3: Thursday</li>
     * <li>4: Friday</li>
     * <li>5: Saturday</li>
     * <li>6: Sunday</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The start time of the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>11:30:30</p>
     */
    @NameInMap("PreferredBackupStartTime")
    public String preferredBackupStartTime;

    public static SetBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBackupPolicyRequest self = new SetBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetBackupPolicyRequest setBackupDbNames(String backupDbNames) {
        this.backupDbNames = backupDbNames;
        return this;
    }
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    public SetBackupPolicyRequest setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }
    public String getBackupLevel() {
        return this.backupLevel;
    }

    public SetBackupPolicyRequest setBackupLog(String backupLog) {
        this.backupLog = backupLog;
        return this;
    }
    public String getBackupLog() {
        return this.backupLog;
    }

    public SetBackupPolicyRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public SetBackupPolicyRequest setDataBackupRetentionPeriod(String dataBackupRetentionPeriod) {
        this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
        return this;
    }
    public String getDataBackupRetentionPeriod() {
        return this.dataBackupRetentionPeriod;
    }

    public SetBackupPolicyRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetBackupPolicyRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public SetBackupPolicyRequest setPreferredBackupEndTime(String preferredBackupEndTime) {
        this.preferredBackupEndTime = preferredBackupEndTime;
        return this;
    }
    public String getPreferredBackupEndTime() {
        return this.preferredBackupEndTime;
    }

    public SetBackupPolicyRequest setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public SetBackupPolicyRequest setPreferredBackupStartTime(String preferredBackupStartTime) {
        this.preferredBackupStartTime = preferredBackupStartTime;
        return this;
    }
    public String getPreferredBackupStartTime() {
        return this.preferredBackupStartTime;
    }

}
