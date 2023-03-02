// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultRequest extends TeaModel {
    /**
     * <p>The ID of the asynchronous thread. You can call the [GenerateDISyncTaskConfigForCreating](~~383463~~) or [GenerateDISyncTaskConfigForUpdating](~~383464~~) operation to generate the ID.</p>
     * <br>
     * <p>*   The GenerateDISyncTaskConfigForCreating operation is used to generate the ID of the asynchronous thread that is used to create a real-time synchronization node or a synchronization solution in Data Integration.</p>
     * <p>*   The GenerateDISyncTaskConfigForUpdating operation is used to generate the ID of the asynchronous thread that is used to update a real-time synchronization node or a synchronization solution in Data Integration.</p>
     */
    @NameInMap("AsyncProcessId")
    public Long asyncProcessId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter specifies the DataWorks workspace to which the operation is applied.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the object that you want to create or update in Data Integration in asynchronous mode. Valid values:</p>
     * <br>
     * <p>*   DI_REALTIME: real-time synchronization node</p>
     * <br>
     * <p>*   DI_SOLUTION: synchronization solution</p>
     * <br>
     * <p>    DataWorks allows you to create or update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static QueryDISyncTaskConfigProcessResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDISyncTaskConfigProcessResultRequest self = new QueryDISyncTaskConfigProcessResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryDISyncTaskConfigProcessResultRequest setAsyncProcessId(Long asyncProcessId) {
        this.asyncProcessId = asyncProcessId;
        return this;
    }
    public Long getAsyncProcessId() {
        return this.asyncProcessId;
    }

    public QueryDISyncTaskConfigProcessResultRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public QueryDISyncTaskConfigProcessResultRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
