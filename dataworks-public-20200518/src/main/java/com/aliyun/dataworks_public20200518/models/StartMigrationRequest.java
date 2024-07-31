// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartMigrationRequest extends TeaModel {
    /**
     * <p>The migration package ID. You can call the <a href="https://help.aliyun.com/document_detail/206094.html">CreateImportMigration</a> operation to query the ID of the import package and call the <a href="https://help.aliyun.com/document_detail/349325.html">CreateExportMigration</a> operation to query the ID of the export package.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("MigrationId")
    public Long migrationId;

    /**
     * <p>The workspace ID. You can log on to the DataWorks console and go to the Workspace page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
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
