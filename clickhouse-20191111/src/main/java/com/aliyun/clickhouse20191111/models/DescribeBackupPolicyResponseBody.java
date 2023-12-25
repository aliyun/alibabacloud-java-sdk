// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <p>The retention period for the backup data. By default, the backup data is retained for seven days. Valid values: 7 to 730. Unit: day.</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public Integer backupRetentionPeriod;

    /**
     * <p>The size of the backup data. Unit: MB.</p>
     */
    @NameInMap("BackupSize")
    public String backupSize;

    /**
     * <p>The day of a week when the system regularly backs up data. Valid values:</p>
     * <br>
     * <p>*   **Monday**</p>
     * <p>*   **Tuesday**</p>
     * <p>*   **Wednesday**</p>
     * <p>*   **Thursday**</p>
     * <p>*   **Friday**</p>
     * <p>*   **Saturday**</p>
     * <p>*   **Sunday**</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <p>The backup window. The time is displayed in Coordinated Universal Time (UTC).</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the backup feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Switch")
    public String _switch;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setBackupSize(String backupSize) {
        this.backupSize = backupSize;
        return this;
    }
    public String getBackupSize() {
        return this.backupSize;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody set_switch(String _switch) {
        this._switch = _switch;
        return this;
    }
    public String get_switch() {
        return this._switch;
    }

}
