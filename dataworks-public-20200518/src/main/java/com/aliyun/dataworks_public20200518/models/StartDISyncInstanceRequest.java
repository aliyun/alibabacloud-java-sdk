// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class StartDISyncInstanceRequest extends TeaModel {
    /**
     * <p>*   If you set the TaskType parameter to DI_REALTIME, the StartParam parameter specifies the startup parameters for the real-time synchronization node. The startup parameters include failover-related parameters, the parameter that specifies the number of dirty data records allowed, and the parameters in the data definition language (DDL) statements.</p>
     * <p>*   If you set the TaskType parameter to DI_SOLUTION, the StartParam parameter does not take effect.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <p>The type of the Data Integration object that you want to start. Valid values:</p>
     * <br>
     * <p>*   DI_REALTIME: real-time synchronization node</p>
     * <p>*   DI_SOLUTION: data synchronization solution</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request succeeded.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("StartParam")
    public String startParam;

    /**
     * <p>*   If you set the TaskType parameter to DI_REALTIME, set the FileId parameter to the ID of the real-time synchronization node that you want to start.</p>
     * <p>*   If you set the TaskType parameter to DI_SOLUTION, set the FileId parameter to the ID of the data synchronization solution that you want to start.</p>
     * <br>
     * <p>This parameter is required.</p>
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
