// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIProjectConfigRequest extends TeaModel {
    /**
     * <p>The type of the destinations of the synchronization solutions. This parameter cannot be left empty.</p>
     * <br>
     * <p>Valid values: analyticdb_for_mysql, odps, elasticsearch, holo, mysql, and polardb.</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The new default global configuration of synchronization solutions. The value indicates the processing rules of different types of DDL messages. The value must be in the JSON format. Example:</p>
     * <br>
     * <p>{"RENAMECOLUMN":"WARNING","DROPTABLE":"WARNING","CREATETABLE":"WARNING","MODIFYCOLUMN":"WARNING","TRUNCATETABLE":"WARNING","DROPCOLUMN":"WARNING","ADDCOLUMN":"WARNING","RENAMETABLE":"WARNING"}</p>
     * <br>
     * <p>Field description:</p>
     * <br>
     * <p>*   RENAMECOLUMN: renames a column.</p>
     * <p>*   DROPTABLE: deletes a table.</p>
     * <p>*   CREATETABLE: creates a table.</p>
     * <p>*   MODIFYCOLUMN: changes the data type of a column.</p>
     * <p>*   TRUNCATETABLE: clears a table.</p>
     * <p>*   DROPCOLUMN: deletes a column.</p>
     * <p>*   ADDCOLUMN: creates a column.</p>
     * <p>*   RENAMETABLE: renames a table.</p>
     * <br>
     * <p>DataWorks processes a DDL message of a specific type based on the following rules:</p>
     * <br>
     * <p>*   WARNING: ignores the message and records an alert in real-time synchronization logs. The alert contains information about the situation that the message is ignored because of an execution error.</p>
     * <p>*   IGNORE: discards the message and does not send it to the destination.</p>
     * <p>*   CRITICAL: terminates the real-time synchronization node and sets the node status to Failed.</p>
     * <p>*   NORMAL: sends the message to the destination to process the message. Each destination processes DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.</p>
     */
    @NameInMap("ProjectConfig")
    public String projectConfig;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the sources of the synchronization solutions.</p>
     * <br>
     * <p>Valid values: oracle, mysql, polardb, datahub, drds, and analyticdb_for_mysql.</p>
     * <br>
     * <p>If you do not configure this parameter, DataWorks applies the default global configuration to all sources.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static UpdateDIProjectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDIProjectConfigRequest self = new UpdateDIProjectConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDIProjectConfigRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public UpdateDIProjectConfigRequest setProjectConfig(String projectConfig) {
        this.projectConfig = projectConfig;
        return this;
    }
    public String getProjectConfig() {
        return this.projectConfig;
    }

    public UpdateDIProjectConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDIProjectConfigRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
