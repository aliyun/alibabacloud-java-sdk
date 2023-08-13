// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. The value must be a positive integer. Default value: 1.</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page. The value must be a positive integer. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the stress testing task. Valid values:</p>
     * <br>
     * <p>*   **SUCCESS**: The task is successful.</p>
     * <p>*   **IGNORED**: The task is ignored.</p>
     * <p>*   **RUNNING**: The task is running.</p>
     * <p>*   **EXCEPTION**: The task is abnormal.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of the stress testing task. Valid values:</p>
     * <br>
     * <p>*   **pressure test** (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.</p>
     * <p>*   **smart pressure test**: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.</p>
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
