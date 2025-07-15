// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListRtcMPUTaskDetailRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <blockquote>
     * <p> The ID can be up to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
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
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <blockquote>
     * <p> If you do not specify TaskId, you must specify PageSize and PageNo. Then, the parameters of all stream relay tasks for the specified application are returned in pages.</p>
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
     * </blockquote>
     * <ul>
     * <li><p>The ID can be up to 55 characters in length and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * </li>
     * <li><p>If you specify TaskId, the parameters of the specified tasks are returned.</p>
     * </li>
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
