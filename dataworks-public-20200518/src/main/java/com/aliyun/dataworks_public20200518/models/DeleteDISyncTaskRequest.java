// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskRequest extends TeaModel {
    /**
     * <p>The ID of the real-time synchronization task. You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the task. Set the value to DI_REALTIME, which indicates a real-time synchronization task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DI_REALTIME</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DeleteDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDISyncTaskRequest self = new DeleteDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDISyncTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public DeleteDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteDISyncTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
