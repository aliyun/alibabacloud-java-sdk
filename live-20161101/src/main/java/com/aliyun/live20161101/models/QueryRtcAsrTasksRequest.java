// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QueryRtcAsrTasksRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the task that you want to query. If you do not specify this parameter, all running tasks under your UID are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>asr-a6ac15e0-9118-4b4c-9e64-306163a0****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static QueryRtcAsrTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRtcAsrTasksRequest self = new QueryRtcAsrTasksRequest();
        return TeaModel.build(map, self);
    }

    public QueryRtcAsrTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryRtcAsrTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryRtcAsrTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
