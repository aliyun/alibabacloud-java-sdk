// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationProcessRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("MigrationId")
    public Long migrationId;

    public static GetMigrationProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationProcessRequest self = new GetMigrationProcessRequest();
        return TeaModel.build(map, self);
    }

    public GetMigrationProcessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetMigrationProcessRequest setMigrationId(Long migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Long getMigrationId() {
        return this.migrationId;
    }

}
