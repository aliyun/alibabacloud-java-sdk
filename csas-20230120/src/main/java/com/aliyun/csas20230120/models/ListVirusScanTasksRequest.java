// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTasksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <strong>example:</strong>
     * <p>1762135466</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PerformanceModes")
    public java.util.List<String> performanceModes;

    @NameInMap("ScanModes")
    public java.util.List<String> scanModes;

    /**
     * <strong>example:</strong>
     * <p>1754150421</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    /**
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
