// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time.</p>
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
     * <p>The number of entries per page. The value must be a positive integer. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the stress testing task. Valid values:</p>
     * <ul>
     * <li><strong>SUCCESS</strong>: The task is successful.</li>
     * <li><strong>IGNORED</strong>: The task is ignored.</li>
     * <li><strong>RUNNING</strong>: The task is running.</li>
     * <li><strong>EXCEPTION</strong>: The task is abnormal.</li>
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
     * <li><strong>pressure test</strong> (default): A task of this type replays the traffic that is captured from the source instance on the destination instance at the maximum playback rate that is supported by the destination instance.</li>
     * <li><strong>smart pressure test</strong>: A task of this type analyzes the traffic that is captured from the source instance over a short period of time and generates traffic on the destination instance for continuous stress testing. The business model based on which the traffic is generated on the destination instance and the traffic distribution are consistent with those on the source instance. Stress testing tasks of this type can help you reduce the amount of time that is consumed to collect data from the source instance and reduce storage costs and performance overheads.</li>
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
