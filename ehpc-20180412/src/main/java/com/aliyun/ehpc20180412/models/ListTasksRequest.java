// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether to display the response history of the asynchronous API operation. Valid values:</p>
     * <br>
     * <p>*   true: displays the current response and response history of the asynchronous API operation.</p>
     * <p>*   false: displays only the current response of the asynchronous API operation. If no tasks are running, `[]` is returned.</p>
     * <br>
     * <p>Default value: false</p>
     * <br>
     * <p>>  If you specify the TaskId parameter, the Archived parameter is invalid.</p>
     */
    @NameInMap("Archived")
    public Boolean archived;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to obtain the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Valid values: 1 to 999.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     * <br>
     * <p>Default value: 10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the task. You can call the following asynchronous API operations to obtain the task ID.</p>
     * <br>
     * <p>*   [CreateCluster](~~87100~~)</p>
     * <p>*   [StartCluster](~~200345~~)</p>
     * <p>*   [StopCluster](~~200346~~)</p>
     * <p>*   [DeleteCluster](~~87110~~)</p>
     * <p>*   [AddNodes](~~87147~~)</p>
     * <p>*   [StartNodes](~~87159~~)</p>
     * <p>*   [ResetNodes](~~87158~~)</p>
     * <p>*   [StopNodes](~~87160~~)</p>
     * <p>*   [DeleteNodes](~~87155~~)</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
    public Boolean getArchived() {
        return this.archived;
    }

    public ListTasksRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
