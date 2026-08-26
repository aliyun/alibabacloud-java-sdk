// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRtcMPUTaskDetailRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <blockquote>
     * <p>The application ID consists of uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 64 characters.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yourAppId</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The page number.</p>
     * <blockquote>
     * <p>If you do not specify a task ID, you must specify the PageSize and PageNo parameters. In this case, the paged query results of all stream mixing and relaying tasks under the specified application ID are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of records per page. Valid values: 1 to 100.</p>
     * <blockquote>
     * <p>If you do not specify a task ID, you must specify the PageSize and PageNo parameters. In this case, the paged query results of all stream mixing and relaying tasks under the specified application ID are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The task ID.</p>
     * <blockquote>
     * <ul>
     * <li>The task ID consists of uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum of 55 characters.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you specify a task ID, the query is performed based on the task ID first, and the result contains the parameter details of the stream mixing and relaying task with the specified task ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yourTaskId</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListRtcMPUTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRtcMPUTaskDetailRequest self = new ListRtcMPUTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListRtcMPUTaskDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListRtcMPUTaskDetailRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListRtcMPUTaskDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRtcMPUTaskDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
