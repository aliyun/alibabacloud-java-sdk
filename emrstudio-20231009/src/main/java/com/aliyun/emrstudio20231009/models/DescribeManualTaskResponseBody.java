// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class DescribeManualTaskResponseBody extends TeaModel {
    /**
     * <p>代表创建时间的资源属性字段</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("ManualTaskId")
    public String manualTaskId;

    /**
     * <p>代表资源名称的资源属性字段</p>
     */
    @NameInMap("ManualTaskName")
    public String manualTaskName;

    /**
     * <p>目录ID</p>
     */
    @NameInMap("ParentDirectoryId")
    public String parentDirectoryId;

    /**
     * <p>项目ID</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>资源id列表</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>任务参数</p>
     */
    @NameInMap("TaskParams")
    public String taskParams;

    /**
     * <p>任务类型</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>更新时间</p>
     */
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
