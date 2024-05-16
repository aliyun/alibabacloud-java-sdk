// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the request. You can locate logs and troubleshoot issues based on the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MigrationId")
    public Long migrationId;

    /**
     * <p>The ID of the migration task.</p>
     * <br>
     * <p>You can call the [CreateImportMigration](https://help.aliyun.com/document_detail/2809123.html) operation to obtain the ID of the import task and call the [CreateExportMigration](https://help.aliyun.com/document_detail/3241603.html) operation to obtain the ID of the export task.</p>
     * <br>
     * <p>This parameter is required.</p>
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
