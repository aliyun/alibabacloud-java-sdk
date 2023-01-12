// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListApplicationMonitorDetectResultRequest extends TeaModel {
    /**
     * <p>The start time of the time range to be queried. The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end time of the time range to be queried. The time follows the UNIX time format. It is the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **100**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the origin probing task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListApplicationMonitorDetectResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationMonitorDetectResultRequest self = new ListApplicationMonitorDetectResultRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationMonitorDetectResultRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListApplicationMonitorDetectResultRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListApplicationMonitorDetectResultRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationMonitorDetectResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListApplicationMonitorDetectResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListApplicationMonitorDetectResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
