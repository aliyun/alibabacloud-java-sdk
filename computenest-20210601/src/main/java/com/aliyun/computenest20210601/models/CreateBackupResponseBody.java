// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    /**
     * <p>Backup ID</p>
     * 
     * <strong>example:</strong>
     * <p>backup-cad4a85ff5e340388b93</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>Description</p>
     * 
     * <strong>example:</strong>
     * <p>No description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>8DC02957-A0FC-5AB2-8C54-496B636EAF12</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Backup status </p>
     * <ul>
     * <li>Creating: In progress </li>
     * <li>Created: Success </li>
     * <li>CreateFailed: Failed </li>
     * <li>Deleting: In progress </li>
     * <li>Deleted: Success </li>
     * <li>DeleteFailed: Failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Creating</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupResponseBody self = new CreateBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupResponseBody setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateBackupResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
