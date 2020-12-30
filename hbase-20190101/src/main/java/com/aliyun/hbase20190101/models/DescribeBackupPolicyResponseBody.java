// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("PreferredBackupPeriod")
    public String preferredBackupPeriod;

    @NameInMap("PreferredBackupEndTimeUTC")
    public String preferredBackupEndTimeUTC;

    @NameInMap("PreferredBackupStartTimeUTC")
    public String preferredBackupStartTimeUTC;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PreferredBackupTime")
    public String preferredBackupTime;

    @NameInMap("BackupRetentionPeriod")
    public String backupRetentionPeriod;

    public static DescribeBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponseBody self = new DescribeBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupPeriod(String preferredBackupPeriod) {
        this.preferredBackupPeriod = preferredBackupPeriod;
        return this;
    }
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupEndTimeUTC(String preferredBackupEndTimeUTC) {
        this.preferredBackupEndTimeUTC = preferredBackupEndTimeUTC;
        return this;
    }
    public String getPreferredBackupEndTimeUTC() {
        return this.preferredBackupEndTimeUTC;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupStartTimeUTC(String preferredBackupStartTimeUTC) {
        this.preferredBackupStartTimeUTC = preferredBackupStartTimeUTC;
        return this;
    }
    public String getPreferredBackupStartTimeUTC() {
        return this.preferredBackupStartTimeUTC;
    }

    public DescribeBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupPolicyResponseBody setPreferredBackupTime(String preferredBackupTime) {
        this.preferredBackupTime = preferredBackupTime;
        return this;
    }
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public DescribeBackupPolicyResponseBody setBackupRetentionPeriod(String backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    public String getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

}
