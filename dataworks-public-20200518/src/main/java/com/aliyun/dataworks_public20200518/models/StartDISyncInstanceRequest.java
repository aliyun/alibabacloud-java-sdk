// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceRequest extends TeaModel {
    /**
     * <ul>
     * <li>If you set TaskType to DI_REALTIME, set this parameter to the ID of the real-time synchronization task that you want to start.</li>
     * <li>If you set TaskType to DI_SOLUTION, set this parameter to the ID of the data synchronization solution that you want to start.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID. You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <ul>
     * <li>If you set TaskType to DI_REALTIME, the StartParam parameter specifies the startup parameters for the real-time synchronization task. The startup parameters include failover-related parameters, the parameter that specifies the number of dirty data records allowed, and the parameters in the data definition language (DDL) statements.</li>
     * <li>If you set TaskType to DI_SOLUTION, the StartParam parameter does not take effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;failoverLimit&quot;:{&quot;count&quot;:10,&quot;interval&quot;:30},&quot;errorLimit&quot;:{&quot;record&quot;:0},&quot;ddlMarkMap&quot;:{&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;IGNORE&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;NORMAL&quot;,&quot;DROPCOLUMN&quot;:&quot;IGNORE&quot;,&quot;ADDCOLUMN&quot;:&quot;NORMAL&quot;,&quot;RENAMETABLE&quot;:&quot;CRITICAL&quot;}}</p>
     */
    @NameInMap("StartParam")
    public String startParam;

    /**
     * <p>The type of the object that you want to start. Valid values:</p>
     * <ul>
     * <li>DI_REALTIME: real-time synchronization task</li>
     * <li>DI_SOLUTION: data synchronization solution</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DI_REALTIME</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static StartDISyncInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDISyncInstanceRequest self = new StartDISyncInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartDISyncInstanceRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public StartDISyncInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public StartDISyncInstanceRequest setStartParam(String startParam) {
        this.startParam = startParam;
        return this;
    }
    public String getStartParam() {
        return this.startParam;
    }

    public StartDISyncInstanceRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
