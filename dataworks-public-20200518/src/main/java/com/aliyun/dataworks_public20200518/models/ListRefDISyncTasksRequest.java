// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRefDISyncTasksRequest extends TeaModel {
    /**
     * <p>The name of the data source. You can call the [ListDataSources](https://help.aliyun.com/document_detail/211431.html) operation to query the name of the data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasourceName")
    public String datasourceName;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The condition used to filter sync nodes. Valid values:</p>
     * <br>
     * <p>*   from: queries the sync nodes that use the data source as the source data source.</p>
     * <p>*   to: queries the sync nodes that use the data source as the destination data source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RefType")
    public String refType;

    /**
     * <p>The type of the sync node that you want to query. Valid values:</p>
     * <br>
     * <p>*   DI_OFFLINE: batch sync node</p>
     * <p>*   DI_REALTIME: real-time sync node</p>
     * <br>
     * <p>You can specify only one type. The sync solution type is not supported.</p>
     * <br>
     * <p>This parameter is required.</p>
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
