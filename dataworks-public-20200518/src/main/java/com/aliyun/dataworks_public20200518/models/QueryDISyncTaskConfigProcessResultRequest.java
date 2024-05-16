// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultRequest extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   true: The request is successful.</p>
     * <p>*   false: The request fails.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AsyncProcessId")
    public Long asyncProcessId;

    /**
     * <p>The type of the object that you want to create or update in Data Integration in asynchronous mode. Valid values:</p>
     * <br>
     * <p>*   DI_REALTIME: real-time synchronization node</p>
     * <br>
     * <p>*   DI_SOLUTION: synchronization solution</p>
     * <br>
     * <p>    DataWorks allows you to create or update real-time synchronization nodes and synchronization solutions in Data Integration only in asynchronous mode.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the asynchronous thread. You can call the [GenerateDISyncTaskConfigForCreating](https://help.aliyun.com/document_detail/383463.html) or [GenerateDISyncTaskConfigForUpdating](https://help.aliyun.com/document_detail/383464.html) operation to generate the ID.</p>
     * <br>
     * <p>*   The GenerateDISyncTaskConfigForCreating operation is used to generate the ID of the asynchronous thread that is used to create a real-time synchronization node or a synchronization solution in Data Integration.</p>
     * <p>*   The GenerateDISyncTaskConfigForUpdating operation is used to generate the ID of the asynchronous thread that is used to update a real-time synchronization node or a synchronization solution in Data Integration.</p>
     * <br>
     * <p>This parameter is required.</p>
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
