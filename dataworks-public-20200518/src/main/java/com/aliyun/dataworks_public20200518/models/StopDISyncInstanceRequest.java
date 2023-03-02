// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDISyncInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the synchronization node. You can call the [ListFiles](~~173942~~) operation to obtain the ID.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter specifies the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the synchronization node that you want to stop. Set the value to DI_REALTIME.</p>
     * <br>
     * <p>DI_REALTIME indicates a real-time synchronization node.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static StopDISyncInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDISyncInstanceRequest self = new StopDISyncInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopDISyncInstanceRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public StopDISyncInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public StopDISyncInstanceRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
