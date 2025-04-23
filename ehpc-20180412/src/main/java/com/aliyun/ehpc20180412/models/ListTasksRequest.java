// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether to display the response history of the asynchronous API operation. Valid values:</p>
     * <ul>
     * <li>true: displays the current response and response history of the asynchronous API operation.</li>
     * <li>false: displays only the current response of the asynchronous API operation. If no tasks are running, <code>[]</code> is returned.</li>
     * </ul>
     * <p>Default value: false.</p>
     * <blockquote>
     * <p> If you specify the TaskId parameter, the Archived parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Archived")
    public Boolean archived;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number. Pages start from page 1. Valid values: 1 to 999.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The task ID. You can call the following asynchronous API operations to obtain the task ID.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/87100.html">CreateCluster</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/200345.html">StartCluster</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/200346.html">StopCluster</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/87110.html">DeleteCluster</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/87147.html">AddNodes</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/87159.html">StartNodes</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/87158.html">ResetNodes</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/87160.html">StopNodes</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/87155.html">DeleteNodes</a></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
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
