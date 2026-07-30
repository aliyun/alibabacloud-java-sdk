// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1596177993001</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. The value must be a positive integer. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries to return on each page. The value must be a positive integer. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>SUCCESS</strong>: The task is successful.</p>
     * </li>
     * <li><p><strong>IGNORED</strong>: The task is ignored.</p>
     * </li>
     * <li><p><strong>RUNNING</strong>: The task is running.</p>
     * </li>
     * <li><p><strong>EXCEPTION</strong>: The task is abnormal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the stress testing task. Valid values:</p>
     * <ul>
     * <li><p><strong>pressure test</strong> (default): A stress testing task that replays the traffic captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.</p>
     * </li>
     * <li><p><strong>smart pressure test</strong>: A stress testing task that is generated to perform continuous stress testing. The task analyzes the traffic that is captured from a source instance in a short period of time and generates traffic that is similar to the traffic on the source instance in terms of business model and traffic distribution. This reduces the time that is required to collect data from the source instance and lowers the costs of storage and performance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pressure test</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeCloudBenchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudBenchTasksRequest self = new DescribeCloudBenchTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudBenchTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCloudBenchTasksRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeCloudBenchTasksRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudBenchTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCloudBenchTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCloudBenchTasksRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
