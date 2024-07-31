// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRefDISyncTasksRequest extends TeaModel {
    /**
     * <p>The name of the data source. You can call the <a href="https://help.aliyun.com/document_detail/211431.html">ListDataSources</a> operation to query the name of the data source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql_datasource</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The page number. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The condition used to filter synchronization tasks. Valid values:</p>
     * <ul>
     * <li>from: queries the synchronization tasks that use the data source as the source.</li>
     * <li>to: queries the synchronization tasks that use the data source as the destination.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>from</p>
     */
    @NameInMap("RefType")
    public String refType;

    /**
     * <p>The type of the synchronization task that you want to query. Valid values:</p>
     * <ul>
     * <li>DI_OFFLINE: batch synchronization task</li>
     * <li>DI_REALTIME: real-time synchronization task</li>
     * </ul>
     * <p>You can call the ListRefDISyncTasks operation to query only one type of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DI_OFFLINE</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static ListRefDISyncTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRefDISyncTasksRequest self = new ListRefDISyncTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListRefDISyncTasksRequest setDatasourceName(String datasourceName) {
        this.datasourceName = datasourceName;
        return this;
    }
    public String getDatasourceName() {
        return this.datasourceName;
    }

    public ListRefDISyncTasksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRefDISyncTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRefDISyncTasksRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListRefDISyncTasksRequest setRefType(String refType) {
        this.refType = refType;
        return this;
    }
    public String getRefType() {
        return this.refType;
    }

    public ListRefDISyncTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
