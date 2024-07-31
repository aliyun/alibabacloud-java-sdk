// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationProcessRequest extends TeaModel {
    /**
     * <p>The migration package ID. You can call the CreateImportMigration operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("MigrationId")
    public Long migrationId;

    /**
     * <p>The workspace ID. You can log on to the DataWorks console and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
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
