// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeManualTaskResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("ManualTaskId")
    public String manualTaskId;

    @NameInMap("ManualTaskName")
    public String manualTaskName;

    @NameInMap("ParentDirectoryId")
    public String parentDirectoryId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ResourceIds")
    public String resourceIds;

    @NameInMap("TaskParams")
    public String taskParams;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeManualTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeManualTaskResponseBody self = new DescribeManualTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeManualTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeManualTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeManualTaskResponseBody setManualTaskId(String manualTaskId) {
        this.manualTaskId = manualTaskId;
        return this;
    }
    public String getManualTaskId() {
        return this.manualTaskId;
    }

    public DescribeManualTaskResponseBody setManualTaskName(String manualTaskName) {
        this.manualTaskName = manualTaskName;
        return this;
    }
    public String getManualTaskName() {
        return this.manualTaskName;
    }

    public DescribeManualTaskResponseBody setParentDirectoryId(String parentDirectoryId) {
        this.parentDirectoryId = parentDirectoryId;
        return this;
    }
    public String getParentDirectoryId() {
        return this.parentDirectoryId;
    }

    public DescribeManualTaskResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeManualTaskResponseBody setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public DescribeManualTaskResponseBody setTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public String getTaskParams() {
        return this.taskParams;
    }

    public DescribeManualTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeManualTaskResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeManualTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
