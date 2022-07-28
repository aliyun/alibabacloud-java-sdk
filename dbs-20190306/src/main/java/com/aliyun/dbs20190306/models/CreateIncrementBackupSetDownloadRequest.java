// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class CreateIncrementBackupSetDownloadRequest extends TeaModel {
    @NameInMap("BackupSetDataFormat")
    public String backupSetDataFormat;

    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("BackupSetName")
    public String backupSetName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    public static CreateIncrementBackupSetDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIncrementBackupSetDownloadRequest self = new CreateIncrementBackupSetDownloadRequest();
        return TeaModel.build(map, self);
    }

    public CreateIncrementBackupSetDownloadRequest setBackupSetDataFormat(String backupSetDataFormat) {
        this.backupSetDataFormat = backupSetDataFormat;
        return this;
    }
    public String getBackupSetDataFormat() {
        return this.backupSetDataFormat;
    }

    public CreateIncrementBackupSetDownloadRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CreateIncrementBackupSetDownloadRequest setBackupSetName(String backupSetName) {
        this.backupSetName = backupSetName;
        return this;
    }
    public String getBackupSetName() {
        return this.backupSetName;
    }

    public CreateIncrementBackupSetDownloadRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIncrementBackupSetDownloadRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
