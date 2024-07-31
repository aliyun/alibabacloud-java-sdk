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
     * <p>The export mode of the export task. Valid values:</p>
     * <ul>
     * <li>FULL: The export task is used to export all data objects.</li>
     * <li>INCREMENTAL: The export task is used to export data objects that were modified since the specified point in time. If you set this parameter to INCREMENTAL, you must configure the IncrementalSince parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL</p>
     */
    @NameInMap("ExportMode")
    public String exportMode;

    /**
     * <p>The status of the data objects that you want to export in the export task. The system exports data objects in the state that is specified by this parameter. Valid values:</p>
     * <ul>
     * <li>SAVED</li>
     * <li>SUBMITTED</li>
     * <li>DEPLOYED</li>
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
     * <p>The start time of the incremental export task.</p>
     * <p>The IncrementalSince parameter takes effect only when the ExportMode parameter is set to INCREMENTAL.</p>
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
     * <p>The name of each export task must be unique. You must ensure that no duplicate export task exists in the current workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_export_01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
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
