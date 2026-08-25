// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTasksRequest extends TeaModel {
    /**
     * <p>The page number of the current page in paging. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The end point for filtering by task expiration time. The value is a UNIX timestamp in seconds. The value must be greater than StartTime.</p>
     * 
     * <strong>example:</strong>
     * <p>1762135466</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of entries per page in paging. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The collection of scan performance modes. Duplicate values are not allowed.</p>
     */
    @NameInMap("PerformanceModes")
    public java.util.List<String> performanceModes;

    /**
     * <p>The collection of scan path scopes. Duplicate values are not allowed.</p>
     */
    @NameInMap("ScanModes")
    public java.util.List<String> scanModes;

    /**
     * <p>The start point for filtering by task expiration time. The value is a UNIX timestamp in seconds. This parameter must be specified together with EndTime. Specifying this parameter alone does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>1754150421</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not canceled. This is the default value.</li>
     * <li><strong>1</strong>: Canceled.</li>
     * <li><strong>-1</strong>: No status filter. All tasks are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The collection of virus scan task IDs. Duplicate values are not allowed.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    /**
     * <p>The user group ID, used to filter tasks whose effective scope includes the specified user group. You can obtain the value from:</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: Lists user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>usergroup-9d4f2a7b3c1e****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListVirusScanTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTasksRequest self = new ListVirusScanTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTasksRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListVirusScanTasksRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListVirusScanTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVirusScanTasksRequest setPerformanceModes(java.util.List<String> performanceModes) {
        this.performanceModes = performanceModes;
        return this;
    }
    public java.util.List<String> getPerformanceModes() {
        return this.performanceModes;
    }

    public ListVirusScanTasksRequest setScanModes(java.util.List<String> scanModes) {
        this.scanModes = scanModes;
        return this;
    }
    public java.util.List<String> getScanModes() {
        return this.scanModes;
    }

    public ListVirusScanTasksRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListVirusScanTasksRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListVirusScanTasksRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public ListVirusScanTasksRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
