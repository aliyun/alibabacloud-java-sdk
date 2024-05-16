// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationProcessRequest extends TeaModel {
    /**
     * <p>The ID of the migration package. You can call the CreateImportMigration operation to query the ID.</p>
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

    public static GetMigrationProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationProcessRequest self = new GetMigrationProcessRequest();
        return TeaModel.build(map, self);
    }

    public GetMigrationProcessRequest setMigrationId(Long migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Long getMigrationId() {
        return this.migrationId;
    }

    public GetMigrationProcessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
