// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QueryDBBackupCollectionsRequest extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("SpaceId")
    public String spaceId;

    public static QueryDBBackupCollectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDBBackupCollectionsRequest self = new QueryDBBackupCollectionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDBBackupCollectionsRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public QueryDBBackupCollectionsRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
