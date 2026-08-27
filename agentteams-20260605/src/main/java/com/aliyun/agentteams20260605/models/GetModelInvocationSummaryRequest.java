// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetModelInvocationSummaryRequest extends TeaModel {
    /**
     * <p>The end time of the query. Unit: milliseconds (UNIX timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1718086400000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The start time of the query. Unit: milliseconds (UNIX timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1718000000000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetModelInvocationSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelInvocationSummaryRequest self = new GetModelInvocationSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetModelInvocationSummaryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetModelInvocationSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetModelInvocationSummaryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
