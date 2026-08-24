// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudBenchTasksRequest extends TeaModel {
    /**
     * <p>The end time of the query task. Specify the value as a UNIX timestamp. Unit: milliseconds.</p>
     * <blockquote>
     * <p>The end time of the query task must be later than the start time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1596177993001</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. The value must be greater than 0 and cannot exceed the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The maximum number of records per page. The value must be greater than 0 and cannot exceed the maximum value of the Integer data type. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The start time of the query task. Specify the value as a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The running status of the task. Valid values:</p>
     * <ul>
     * <li><strong>SUCCESS</strong>: Successful.</li>
     * <li><strong>IGNORED</strong>: Ignored.</li>
     * <li><strong>RUNNING</strong>: Running.</li>
     * <li><strong>EXCEPTION</strong>: Exception.</li>
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
     * <li><strong>pressure test</strong> (default): intelligent stress testing. Traffic captured from the target instance is replayed on the destination instance at the maximum speed supported by the destination instance specifications.</li>
     * <li><strong>smart pressure test</strong>: generated stress testing. By analyzing and learning from traffic captured from the target instance within a short period, traffic that is consistent with the business model and traffic distribution of the original traffic is generated for continuous stress testing. This reduces the time required to collect data from the target instance and lowers storage costs and performance overhead.</li>
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
