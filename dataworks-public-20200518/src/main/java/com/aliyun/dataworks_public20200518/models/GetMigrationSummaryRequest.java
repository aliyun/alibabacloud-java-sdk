// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("MigrationId")
    public Long migrationId;

    /**
     * <p>The ID of the migration task.</p>
     * <br>
     * <p>You can call the [CreateImportMigration](~~2809123~~) operation to obtain the ID of the import task and call the [CreateExportMigration](~~3241603~~) operation to obtain the ID of the export task.</p>
     */
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
