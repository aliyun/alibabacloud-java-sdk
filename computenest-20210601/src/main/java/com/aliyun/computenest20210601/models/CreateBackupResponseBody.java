// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CreateBackupResponseBody extends TeaModel {
    /**
     * <p>The backup ID.</p>
     * 
     * <strong>example:</strong>
     * <p>backup-cad4a85ff5e340388b93</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>No description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8DC02957-A0FC-5AB2-8C54-496B636EAF12</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the backup.</p>
     * <ul>
     * <li><p>Creating: The backup is being created.</p>
     * </li>
     * <li><p>Created: The backup is created.</p>
     * </li>
     * <li><p>CreateFailed: The backup failed to be created.</p>
     * </li>
     * <li><p>Deleting: The backup is being deleted.</p>
     * </li>
     * <li><p>Deleted: The backup is deleted.</p>
     * </li>
     * <li><p>DeleteFailed: The backup failed to be deleted.</p>
     * </li>
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
