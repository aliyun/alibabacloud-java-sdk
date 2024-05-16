// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartMigrationRequest extends TeaModel {
    /**
     * <p>The ID of the migration package. You can call the [CreateImportMigration](https://help.aliyun.com/document_detail/206094.html) operation to obtain the ID of the import package and call the [CreateExportMigration](https://help.aliyun.com/document_detail/349325.html) operation to obtain the ID of the export package.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MigrationId")
    public Long migrationId;

    /**
     * <p>The ID of the workspace. You can go to the Workspace Management page of the DataWorks console to view the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static StartMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMigrationRequest self = new StartMigrationRequest();
        return TeaModel.build(map, self);
    }

    public StartMigrationRequest setMigrationId(Long migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Long getMigrationId() {
        return this.migrationId;
    }

    public StartMigrationRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
