// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MigrationId")
    public Long migrationId;

    /**
     * <p>The operation that you want to perform.</p>
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
