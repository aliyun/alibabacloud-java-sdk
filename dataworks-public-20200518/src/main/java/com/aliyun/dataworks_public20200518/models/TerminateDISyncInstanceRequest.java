// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the real-time synchronization task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The value DI_REALTIME indicates that the task is a real-time synchronization task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DI_REALTIME</p>
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
