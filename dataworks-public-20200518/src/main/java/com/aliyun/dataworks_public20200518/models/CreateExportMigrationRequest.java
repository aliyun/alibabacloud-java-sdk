// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateExportMigrationRequest extends TeaModel {
    /**
     * <p>The description of the export task.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The export mode of the export task. Valid values:</p>
     * <br>
     * <p>*   FULL: The export task is used to export all data objects.</p>
     * <p>*   INCREMENTAL: The export task is used to export data objects that were modified since the specified point in time. If you set this parameter to INCREMENTAL, you must configure the IncrementalSince parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExportMode")
    public String exportMode;

    /**
     * <p>The status of the data objects that you want to export in the export task. The system exports data objects in the state that is specified by this parameter. Valid values:</p>
     * <br>
     * <p>*   SAVED: Data objects that are in the SAVED state are exported.</p>
     * <p>*   SUBMITTED: Data objects that are in the SUBMITTED state are exported.</p>
     * <p>*   DEPLOYED: Data objects that are in the DEPLOYED state are exported.</p>
     */
    @NameInMap("ExportObjectStatus")
    public String exportObjectStatus;

    /**
     * <p>The start time of the incremental export task.</p>
     * <br>
     * <p>The IncrementalSince parameter takes effect only when the ExportMode parameter is set to INCREMENTAL.</p>
     */
    @NameInMap("IncrementalSince")
    public Long incrementalSince;

    /**
     * <p>The name of the export task.</p>
     * <br>
     * <p>The name of each export task must be unique. You must ensure that no duplicate export task exists in the current workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
