// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForUpdatingRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. This parameter is used to prevent repeated operations that are caused by multiple calls.</p>
     * 
     * <strong>example:</strong>
     * <p>ABFUOEUOTRTRJKE</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The task ID.</p>
     * <ul>
     * <li>If you set the TaskType parameter to DI_REALTIME, set the TaskId parameter to the value of the FileId parameter for the real-time synchronization task.</li>
     * <li>If you set the TaskType parameter to DI_SOLUTION, set the TaskId parameter to the value of the FileId parameter for the synchronization solution.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The script for updating the real-time synchronization task in Data Integration. DataWorks allows you to add or remove tables for a real-time synchronization task in Data Integration only in asynchronous mode. The following types of real-time synchronization tasks are supported:</p>
     * <ul>
     * <li>Synchronization task that is used to synchronize data from MySQL to MaxCompute</li>
     * <li>Synchronization task that is used to synchronize data from MySQL data to Kafka</li>
     * <li>Synchronization task that is used to synchronize data from MySQL to Hologres</li>
     * </ul>
     * <p>The SelectedTables parameter is used to specify tables that you want to synchronize from multiple databases. The Tables parameter is used to specify tables that you want to synchronize from a single database.</p>
     * <ul>
     * <li>If the script contains the SelectedTables parameter, the system synchronizes data from the tables that you specify in the SelectedTables parameter.</li>
     * <li>If the script contains the Tables parameter, the system synchronizes data from the tables that you specify in the Tables parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{      &quot;steps&quot;: [         {             &quot;parameter&quot;: {                 &quot;connection&quot;: [                     {                         &quot;table&quot;: [                             &quot;xyx&quot;                         ]                     }                 ]             },             &quot;name&quot;: &quot;Reader&quot;,             &quot;category&quot;: &quot;reader&quot;         }     ] }</p>
     */
    @NameInMap("TaskParam")
    public String taskParam;

    /**
     * <p>The type of the object that you want to update in Data Integration in asynchronous mode. Valid values:</p>
     * <ul>
     * <li>DI_REALTIME: real-time synchronization task</li>
     * <li>DI_SOLUTION: synchronization solution DataWorks allows you to create or update real-time synchronization tasks in Data Integration only in asynchronous mode.</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>DI_OFFLINE</li>
     * <li>DI_REALTIME</li>
     * <li>DI_SOLUTION</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DI_REALTIME</p>
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
