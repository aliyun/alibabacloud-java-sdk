// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryRequest extends TeaModel {
    /**
     * <p>The migration task ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2780280.html">CreateImportMigration</a> operation to obtain the ID of the import task and call the <a href="https://help.aliyun.com/document_detail/2780281.html">CreateExportMigration</a> operation to obtain the ID of the export task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("MigrationId")
    public Long migrationId;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
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
