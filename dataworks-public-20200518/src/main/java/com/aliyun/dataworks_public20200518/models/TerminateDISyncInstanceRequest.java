// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the real-time synchronization node.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to view the workspace ID.</p>
     * <br>
     * <p>This parameter specifies the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the node. A value of DI_REALTIME indicates that the node is a real-time synchronization node.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static TerminateDISyncInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceRequest self = new TerminateDISyncInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public TerminateDISyncInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public TerminateDISyncInstanceRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
