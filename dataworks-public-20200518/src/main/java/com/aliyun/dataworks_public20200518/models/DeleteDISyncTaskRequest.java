// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDISyncTaskRequest extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The type of the synchronization node in Data Integration.</p>
     * <br>
     * <p>The parameter value is DI_REALTIME and cannot be changed. The value indicates a real-time synchronization node.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the real-time synchronization node. You can call the [ListFiles](~~173942~~) operation to query the ID of the node.</p>
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
