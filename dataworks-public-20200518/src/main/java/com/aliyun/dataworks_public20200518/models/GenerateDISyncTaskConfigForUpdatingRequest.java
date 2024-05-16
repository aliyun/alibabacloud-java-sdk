// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForUpdatingRequest extends TeaModel {
    /**
     * <p>The ID of the real-time synchronization node or synchronization solution.</p>
     * <br>
     * <p>*   If you set the TaskType parameter to DI_REALTIME, set the TaskId parameter to the value of the FileId parameter for the real-time synchronization node.</p>
     * <p>*   If you set the TaskType parameter to DI_SOLUTION, set the TaskId parameter to the value of the FileId parameter for the synchronization solution.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The type of the object that you want to update in Data Integration in asynchronous mode. Valid values:</p>
     * <br>
     * <p>*   DI_REALTIME: real-time synchronization node</p>
     * <br>
     * <p>*   DI_SOLUTION: synchronization solution</p>
     * <br>
     * <p>    DataWorks allows you to update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. This parameter is used to prevent repeated operations that are caused by multiple calls.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The script for updating the real-time synchronization node or synchronization solution in Data Integration.</p>
     * <br>
     * <p>DataWorks allows you to add or remove tables for a real-time synchronization node or a synchronization solution in Data Integration only in asynchronous mode. The following types of real-time synchronization nodes and synchronization solutions are supported:</p>
     * <br>
     * <p>*   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL to MaxCompute</p>
     * <p>*   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL data to Kafka</p>
     * <p>*   Real-time synchronization node or synchronization solution that is used to synchronize data from MySQL to Hologres</p>
     * <br>
     * <p>The SelectedTables parameter is used to specify tables that you want to synchronize from multiple databases. The Tables parameter is used to specify tables that you want to synchronize from a single database.</p>
     * <br>
     * <p>*   If the script contains the SelectedTables parameter, the system synchronizes the tables that you specify in the SelectedTables parameter.</p>
     * <p>*   If the script contains the Tables parameter, the system synchronizes the tables that you specify in the Tables parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static GenerateDISyncTaskConfigForUpdatingRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForUpdatingRequest self = new GenerateDISyncTaskConfigForUpdatingRequest();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setTaskParam(String taskParam) {
        this.taskParam = taskParam;
        return this;
    }
    public String getTaskParam() {
        return this.taskParam;
    }

    public GenerateDISyncTaskConfigForUpdatingRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
