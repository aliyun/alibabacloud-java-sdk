// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetTokenTrendRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public String startTime;

    public static GetTokenTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenTrendRequest self = new GetTokenTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenTrendRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTokenTrendRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetTokenTrendRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTokenTrendRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
