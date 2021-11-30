// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryRequest extends TeaModel {
    @NameInMap("MigrationId")
    public Long migrationId;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetMigrationSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationSummaryRequest self = new GetMigrationSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetMigrationSummaryRequest setMigrationId(Long migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Long getMigrationId() {
        return this.migrationId;
    }

    public GetMigrationSummaryRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
