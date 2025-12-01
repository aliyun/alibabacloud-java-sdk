// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateFullBackupSetDownloadRequest extends TeaModel {
    /**
     * <p>The format in which the full backup set is downloaded. Valid values:</p>
     * <ul>
     * <li><strong>Native</strong></li>
     * <li><strong>SQL</strong></li>
     * <li><strong>CSV</strong>(Default value)</li>
     * <li><strong>JSON</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SQL</p>
     */
    @NameInMap("BackupSetDataFormat")
    public String backupSetDataFormat;

    /**
     * <p>The ID of the full backup set.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1hv****</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    public static CreateFullBackupSetDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFullBackupSetDownloadRequest self = new CreateFullBackupSetDownloadRequest();
        return TeaModel.build(map, self);
    }

    public CreateFullBackupSetDownloadRequest setBackupSetDataFormat(String backupSetDataFormat) {
        this.backupSetDataFormat = backupSetDataFormat;
        return this;
    }
    public String getBackupSetDataFormat() {
        return this.backupSetDataFormat;
    }

    public CreateFullBackupSetDownloadRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateFullBackupSetDownloadRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFullBackupSetDownloadRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
