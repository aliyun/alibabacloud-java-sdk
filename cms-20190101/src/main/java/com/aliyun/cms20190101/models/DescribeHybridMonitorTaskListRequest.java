// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorTaskListRequest extends TeaModel {
    /**
     * <p>The additional information of the instance.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The timestamp when the metric import task was created.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("IncludeAliyunTask")
    public Boolean includeAliyunTask;

    /**
     * <p>The conditions that are used to filter logs imported from Log Service.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The configuration file of the Alibaba Cloud service that you want to monitor by using Hybrid Cloud Monitoring.</p>
     * <br>
     * <p>*   namespace: the namespace of the Alibaba Cloud service.</p>
     * <p>*   metric_list: the metrics of the Alibaba Cloud service.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeHybridMonitorTaskList**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyword that is used to search for metric import tasks.</p>
     */
    @NameInMap("TargetUserId")
    public Long targetUserId;

    /**
     * <p>The type of the metric import task. Valid values:</p>
     * <br>
     * <p>*   aliyun_fc: metric import tasks for Alibaba Cloud services</p>
     * <p>*   aliyun_sls: metrics for logs imported from Log Service</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The interval at which the CloudMonitor agent collects host monitoring data. Valid values:</p>
     * <br>
     * <p>*   15</p>
     * <p>*   30</p>
     * <p>*   60</p>
     * <br>
     * <p>Unit: seconds.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeHybridMonitorTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorTaskListRequest self = new DescribeHybridMonitorTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorTaskListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeHybridMonitorTaskListRequest setIncludeAliyunTask(Boolean includeAliyunTask) {
        this.includeAliyunTask = includeAliyunTask;
        return this;
    }
    public Boolean getIncludeAliyunTask() {
        return this.includeAliyunTask;
    }

    public DescribeHybridMonitorTaskListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeHybridMonitorTaskListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeHybridMonitorTaskListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridMonitorTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridMonitorTaskListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridMonitorTaskListRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    public DescribeHybridMonitorTaskListRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeHybridMonitorTaskListRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
