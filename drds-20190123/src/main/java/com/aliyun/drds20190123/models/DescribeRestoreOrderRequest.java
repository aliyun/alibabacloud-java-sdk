// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRestoreOrderRequest extends TeaModel {
    /**
     * <p>The name of the database involved in the backup.</p>
     * 
     * <strong>example:</strong>
     * <p>drds_flashback</p>
     */
    @NameInMap("BackupDbNames")
    public String backupDbNames;

    /**
     * <p>The ID of the backup set.</p>
     * 
     * <strong>example:</strong>
     * <p>1918df27-4563-11e9-8403-af4fbe******</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The level of the backup. Valid values:</p>
     * <ul>
     * <li><strong>DB</strong>: The database Level</li>
     * <li>**instance **: instance level</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>db</p>
     */
    @NameInMap("BackupLevel")
    public String backupLevel;

    /**
     * <p>The backup mode. Valid values: <strong>logic</strong> or <strong>phy</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>phy</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The ID of the instance for which to modify the backup policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds************</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The preferred backup time.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-16 15:12:53</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    public static DescribeRestoreOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreOrderRequest self = new DescribeRestoreOrderRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreOrderRequest setBackupDbNames(String backupDbNames) {
        this.backupDbNames = backupDbNames;
        return this;
    }
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    public DescribeRestoreOrderRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeRestoreOrderRequest setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }
    public String getBackupLevel() {
        return this.backupLevel;
    }

    public DescribeRestoreOrderRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeRestoreOrderRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRestoreOrderRequest setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

}
