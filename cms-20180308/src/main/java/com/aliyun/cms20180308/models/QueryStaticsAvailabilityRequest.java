// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryStaticsAvailabilityRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TimeRange")
    public String timeRange;

    public static QueryStaticsAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStaticsAvailabilityRequest self = new QueryStaticsAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public QueryStaticsAvailabilityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryStaticsAvailabilityRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QueryStaticsAvailabilityRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

}
