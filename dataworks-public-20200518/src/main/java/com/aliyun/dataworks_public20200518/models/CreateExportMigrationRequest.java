// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateExportMigrationRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ExportMode")
    public String exportMode;

    @NameInMap("ExportObjectStatus")
    public String exportObjectStatus;

    @NameInMap("IncrementalSince")
    public Long incrementalSince;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectId")
    public Long projectId;

    public static CreateExportMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExportMigrationRequest self = new CreateExportMigrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateExportMigrationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateExportMigrationRequest setExportMode(String exportMode) {
        this.exportMode = exportMode;
        return this;
    }
    public String getExportMode() {
        return this.exportMode;
    }

    public CreateExportMigrationRequest setExportObjectStatus(String exportObjectStatus) {
        this.exportObjectStatus = exportObjectStatus;
        return this;
    }
    public String getExportObjectStatus() {
        return this.exportObjectStatus;
    }

    public CreateExportMigrationRequest setIncrementalSince(Long incrementalSince) {
        this.incrementalSince = incrementalSince;
        return this;
    }
    public Long getIncrementalSince() {
        return this.incrementalSince;
    }

    public CreateExportMigrationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateExportMigrationRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
