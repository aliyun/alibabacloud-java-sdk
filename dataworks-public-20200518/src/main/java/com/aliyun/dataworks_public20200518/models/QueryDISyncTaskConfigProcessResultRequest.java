// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDISyncTaskConfigProcessResultRequest extends TeaModel {
    /**
     * <p>The asynchronous thread ID. You can call the <a href="https://help.aliyun.com/document_detail/383463.html">GenerateDISyncTaskConfigForCreating</a> or <a href="https://help.aliyun.com/document_detail/383464.html">GenerateDISyncTaskConfigForUpdating</a> operation to obtain the ID.</p>
     * <ul>
     * <li>The GenerateDISyncTaskConfigForCreating operation is used to generate the ID of the asynchronous thread that is used to create a real-time synchronization task in Data Integration.</li>
     * <li>The GenerateDISyncTaskConfigForUpdating operation is used to generate the ID of the asynchronous thread that is used to update a real-time synchronization task in Data Integration.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AsyncProcessId")
    public Long asyncProcessId;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
     * <p>You must configure this parameter to specify the DataWorks workspace to which the API operation is applied.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The type of the object that you want to create or update in Data Integration in asynchronous mode. Valid values:</p>
     * <ul>
     * <li>DI_REALTIME: real-time synchronization task</li>
     * <li>DI_SOLUTION: synchronization solution DataWorks allows you to create or update real-time synchronization tasks and synchronization solutions in Data Integration only in asynchronous mode.</li>
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
