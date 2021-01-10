// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateDBRestoreTaskRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("OriginCollections")
    public String originCollections;

    @NameInMap("NewCollections")
    public String newCollections;

    public static CreateDBRestoreTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBRestoreTaskRequest self = new CreateDBRestoreTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBRestoreTaskRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CreateDBRestoreTaskRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateDBRestoreTaskRequest setOriginCollections(String originCollections) {
        this.originCollections = originCollections;
        return this;
    }
    public String getOriginCollections() {
        return this.originCollections;
    }

    public CreateDBRestoreTaskRequest setNewCollections(String newCollections) {
        this.newCollections = newCollections;
        return this;
    }
    public String getNewCollections() {
        return this.newCollections;
    }

}
