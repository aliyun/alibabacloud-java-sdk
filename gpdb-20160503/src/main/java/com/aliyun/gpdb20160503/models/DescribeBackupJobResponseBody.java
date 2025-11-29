// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeBackupJobResponseBody extends TeaModel {
    /**
     * <p>The backup set ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the IDs of all backup sets in the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1111111111</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The backup job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("BackupJobId")
    public String backupJobId;

    /**
     * <p>The backup mode. Valid values:</p>
     * <ul>
     * <li><strong>Automated</strong></li>
     * <li><strong>Manual</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Automated</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The backup status. Valid values:</p>
     * <ul>
     * <li><strong>schedule</strong></li>
     * <li><strong>check</strong></li>
     * <li><strong>backup</strong></li>
     * <li><strong>finish</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>backup</p>
     */
    @NameInMap("BackupStatus")
    public String backupStatus;

    /**
     * <p>The progress of the backup job.</p>
     * 
     * <strong>example:</strong>
     * <p>50%</p>
     */
    @NameInMap("Process")
    public String process;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the backup job started. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-03T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeBackupJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupJobResponseBody self = new DescribeBackupJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupJobResponseBody setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public DescribeBackupJobResponseBody setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
        return this;
    }
    public String getBackupJobId() {
        return this.backupJobId;
    }

    public DescribeBackupJobResponseBody setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeBackupJobResponseBody setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }
    public String getBackupStatus() {
        return this.backupStatus;
    }

    public DescribeBackupJobResponseBody setProcess(String process) {
        this.process = process;
        return this;
    }
    public String getProcess() {
        return this.process;
    }

    public DescribeBackupJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupJobResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
