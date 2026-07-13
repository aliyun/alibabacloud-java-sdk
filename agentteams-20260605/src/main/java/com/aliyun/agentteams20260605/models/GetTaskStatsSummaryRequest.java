// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTaskStatsSummaryRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public String startTime;

    public static GetTaskStatsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatsSummaryRequest self = new GetTaskStatsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskStatsSummaryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTaskStatsSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTaskStatsSummaryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
