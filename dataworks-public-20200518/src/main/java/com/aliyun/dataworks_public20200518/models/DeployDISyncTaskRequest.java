// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeployDISyncTaskRequest extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The type of the object that you want to deploy. Valid values:</p>
     * <br>
     * <p>*   DI_REALTIME: real-time synchronization node</p>
     * <p>*   DI_SOLUTION: data synchronization solution</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>*   If you set the TaskType parameter to DI_REALTIME, set the FileId parameter to the ID of the real-time synchronization node that you want to deploy.</p>
     * <p>*   If you set the TaskType parameter to DI_SOLUTION, set the FileId parameter to the ID of the data synchronization solution that you want to deploy.</p>
     * <br>
     * <p>You can call the [ListFiles](~~173942~~) operation to query the ID of the real-time synchronization node or data synchronization solution.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DeployDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployDISyncTaskRequest self = new DeployDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeployDISyncTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public DeployDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeployDISyncTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
