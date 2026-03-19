// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateFullBackupSetDownloadRequest extends TeaModel {
    /**
     * <p>The format of the downloaded full backup set. Valid values:</p>
     * <ul>
     * <li><p><strong>Native</strong></p>
     * </li>
     * <li><p><strong>SQL</strong></p>
     * </li>
     * <li><p><strong>CSV</strong></p>
     * </li>
     * <li><p><strong>JSON</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The default value is CSV.</p>
     * </blockquote>
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
     * <p>dbs1hvXXXXX</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>A client token used to ensure the idempotence of the request. This prevents the same request from being sent multiple times.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
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
