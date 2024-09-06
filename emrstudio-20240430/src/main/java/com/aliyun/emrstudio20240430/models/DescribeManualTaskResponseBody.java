// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeManualTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>mt-3q9jo749ne5****</p>
     */
    @NameInMap("ManualTaskId")
    public String manualTaskId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ManualTaskName")
    public String manualTaskName;

    /**
     * <strong>example:</strong>
     * <p>mtd-oy98v7n43el****</p>
     */
    @NameInMap("ParentDirectoryId")
    public String parentDirectoryId;

    /**
     * <strong>example:</strong>
     * <p>p-3q9jo749ne5****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>r-oy98v7n43el****</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;yarnUser&quot;: &quot;&quot;,
     *     &quot;conditionResult&quot;: &quot;null&quot;,
     *     &quot;rawScript&quot;: &quot;sleep 300&quot;,
     *     &quot;submitOnYarnFlag&quot;: false,
     *     &quot;emrClusterId&quot;: &quot;&quot;,
     *     &quot;yarnPriority&quot;: &quot;&quot;,
     *     &quot;dependence&quot;: &quot;null&quot;,
     *     &quot;yarnMemory&quot;: &quot;&quot;,
     *     &quot;localParams&quot;: [],
     *     &quot;switchResult&quot;: &quot;null&quot;,
     *     &quot;resourceList&quot;: [],
     *     &quot;yarnQueue&quot;: &quot;&quot;,
     *     &quot;yarnVCores&quot;: &quot;&quot;,
     *     &quot;associateManualTaskFlag&quot;: false
     * }</p>
     */
    @NameInMap("TaskParams")
    public String taskParams;

    /**
     * <strong>example:</strong>
     * <p>SHELL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
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
