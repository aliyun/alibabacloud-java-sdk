// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateFullBackupSetDownloadRequest extends TeaModel {
    @NameInMap("BackupSetDataFormat")
    public String backupSetDataFormat;

    @NameInMap("BackupSetId")
    public String backupSetId;

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
