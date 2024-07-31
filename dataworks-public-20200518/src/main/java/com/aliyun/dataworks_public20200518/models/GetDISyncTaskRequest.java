// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDISyncTaskRequest extends TeaModel {
    /**
     * <ul>
     * <li>If you set TaskType to DI_REALTIME, set this parameter to the ID of the real-time synchronization task that you want to deploy.</li>
     * <li>If you set TaskType to DI_SOLUTION, set this parameter to the ID of the data synchronization solution that you want to deploy.</li>
     * </ul>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/173942.html">ListFiles</a> operation to query the ID of the real-time synchronization task or data synchronization solution.</p>
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
     * <p>The type of the object that you want to query. Valid values:</p>
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

    public static GetDISyncTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncTaskRequest self = new GetDISyncTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetDISyncTaskRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetDISyncTaskRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDISyncTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
