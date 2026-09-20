// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateExportMigrationRequest extends TeaModel {
    /**
     * <p>The description of the export task.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The export mode of the task. Valid values:</p>
     * <ul>
     * <li>FULL: exports the target task in full.</li>
     * <li>INCREMENTAL: incrementally exports the target task from a specified point in time. If you select this mode, you must also configure the IncrementalSince parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL</p>
     */
    @NameInMap("ExportMode")
    public String exportMode;

    /**
     * <p>The status of the export task. The system exports tasks in the specified status. Valid values:</p>
     * <ul>
     * <li>SAVED: saved. Tasks that have been saved are exported.</li>
     * <li>SUBMITTED: submitted. Tasks that have been submitted are exported.</li>
     * <li>DEPLOYED: deployed. Tasks that have been deployed are exported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SAVED</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExportObjectStatus")
    public String exportObjectStatus;

    /**
     * <p>The start time for incrementally exporting the target node.</p>
     * <p>This parameter takes effect only when the ExportMode parameter settings is set to INCREMENTAL.</p>
     * 
     * <strong>example:</strong>
     * <p>1589904000000</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("IncrementalSince")
    public Long incrementalSince;

    /**
     * <p>The name of the export task.</p>
     * <p>The name must be unique. No duplicate export task names can exist in the current DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_export_01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
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
