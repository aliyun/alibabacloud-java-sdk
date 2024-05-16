// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StopDISyncInstanceRequest extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The type of the synchronization node that you want to stop. Set the value to DI_REALTIME.</p>
     * <br>
     * <p>DI_REALTIME indicates a real-time synchronization node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the synchronization node. You can call the [ListFiles](https://help.aliyun.com/document_detail/173942.html) operation to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
