// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartMigrationRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("MigrationId")
    public Long migrationId;

    public static StartMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMigrationRequest self = new StartMigrationRequest();
        return TeaModel.build(map, self);
    }

    public StartMigrationRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public StartMigrationRequest setMigrationId(Long migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Long getMigrationId() {
        return this.migrationId;
    }

}
