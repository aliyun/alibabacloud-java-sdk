// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVulScanTasksRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Filters by the matching mode of the effective scope. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: applies to all users under the current Alibaba Cloud account.</li>
     * <li><strong>UserGroupNormal</strong>: applies only to users within specified user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupNormal</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the vulnerability scheduled scan policy. This parameter is used to filter tasks triggered by the specified policy. Valid values are obtained from:</p>
     * <ul>
     * <li><a href="~~ListVulScanScheduledStrategies~~">ListVulScanScheduledStrategies</a>: lists vulnerability scheduled scan policies.</li>
     * <li><a href="~~CreateVulScanScheduledStrategy~~">CreateVulScanScheduledStrategy</a>: creates a vulnerability scheduled scan policy.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
     */
    @NameInMap("ScheduledStrategyId")
    public String scheduledStrategyId;

    /**
     * <p>Filters by task status. Valid values:</p>
     * <ul>
     * <li><strong>Running</strong>: the task is in progress and still within the validity period.</li>
     * <li><strong>Expired</strong>: the task has expired and exceeded the validity period.</li>
     * <li><strong>Canceled</strong>: the task has been canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The vulnerability scanning task IDs used for filtering. A maximum of 100 IDs can be specified. Duplicate IDs are not allowed.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    /**
     * <p>The task name. Fuzzy match is supported. The name can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D department vulnerability scanning</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Filters by task type. Valid values:</p>
     * <ul>
     * <li><strong>Instant</strong>: an instant task created by CreateVulScanTask.</li>
     * <li><strong>Scheduled</strong>: a scheduled task automatically created by a vulnerability scheduled scan policy on a periodic basis.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Instant</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The user group ID. This parameter is used to filter records whose effective scope includes the specified user group. Valid values are obtained from:</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: lists user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>usergroup-9d4f2a7b3c1e****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListVulScanTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVulScanTasksRequest self = new ListVulScanTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListVulScanTasksRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListVulScanTasksRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public ListVulScanTasksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVulScanTasksRequest setScheduledStrategyId(String scheduledStrategyId) {
        this.scheduledStrategyId = scheduledStrategyId;
        return this;
    }
    public String getScheduledStrategyId() {
        return this.scheduledStrategyId;
    }

    public ListVulScanTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListVulScanTasksRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public ListVulScanTasksRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ListVulScanTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public ListVulScanTasksRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
