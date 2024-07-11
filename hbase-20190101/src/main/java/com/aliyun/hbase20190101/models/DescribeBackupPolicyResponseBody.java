// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    /**
     * <strong>example:</strong>
     * <p>18:00Z</p>
     */
    @NameInMap("PreferredBackupEndTimeUTC")
    public String preferredBackupEndTimeUTC;

    /**
     * <strong>example:</strong>
     * <p>Friday</p>
     */
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    /**
     * <strong>example:</strong>
     * <p>17:00Z</p>
     */
    @NameInMap("PreferredBackupStartTimeUTC")
    public String preferredBackupStartTimeUTC;

    /**
     * <strong>example:</strong>
     * <p>01:00-02:00</p>
     */
    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    /**
     * <strong>example:</strong>
     * <p>94AC38B6-7C6D-45B2-BC03-B8750071A482</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupEndTimeUTC(String preferredBackupEndTimeUTC) {
        this.preferredBackupEndTimeUTC = preferredBackupEndTimeUTC;
        return this;
    }
    public String getPreferredBackupEndTimeUTC() {
        return this.preferredBackupEndTimeUTC;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupStartTimeUTC(String preferredBackupStartTimeUTC) {
        this.preferredBackupStartTimeUTC = preferredBackupStartTimeUTC;
        return this;
    }
    public String getPreferredBackupStartTimeUTC() {
        return this.preferredBackupStartTimeUTC;
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

}
