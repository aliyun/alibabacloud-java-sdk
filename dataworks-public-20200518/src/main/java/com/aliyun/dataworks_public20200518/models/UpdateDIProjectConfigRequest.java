// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDIProjectConfigRequest extends TeaModel {
    /**
     * <p>The type of the destinations of the synchronization solutions. This parameter cannot be left empty. Valid values: analyticdb_for_mysql, odps, elasticsearch, holo, mysql, and polardb.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The new default global configuration of the synchronization solutions. The value indicates the processing rules of different types of DDL messages. The value must be in the JSON format. Example: {&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}.</p>
     * <p>Field description:</p>
     * <ul>
     * <li>RENAMECOLUMN: renames a column.</li>
     * <li>DROPTABLE: deletes a table.</li>
     * <li>CREATETABLE: creates a table.</li>
     * <li>MODIFYCOLUMN: changes the data type of a column.</li>
     * <li>TRUNCATETABLE: clears a table.</li>
     * <li>DROPCOLUMN: deletes a column.</li>
     * <li>ADDCOLUMN: creates a column.</li>
     * <li>RENAMETABLE: renames a table.</li>
     * </ul>
     * <p>DataWorks processes a DDL message of a specific type based on the following rules:</p>
     * <ul>
     * <li>WARNING: ignores the message and records an alert in real-time synchronization logs. The alert contains information about the situation that the message is ignored because of an execution error.</li>
     * <li>IGNORE: discards the message and does not send it to the destination.</li>
     * <li>CRITICAL: terminates the real-time synchronization task and sets the node status to Failed.</li>
     * <li>NORMAL: sends the message to the destination to process the message. Each destination processes DDL messages based on its own business logic. If DataWorks adopts the NORMAL policy, DataWorks only forwards DDL messages.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</p>
     */
    @NameInMap("ProjectConfig")
    public String projectConfig;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the sources of the synchronization solutions. Valid values: oracle, mysql, polardb, datahub, drds, and analyticdb_for_mysql. If you do not configure this parameter, DataWorks applies the default global configuration to all sources.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
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
