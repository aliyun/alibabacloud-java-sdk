// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetWorkerStatsSummaryRequest extends TeaModel {
    /**
     * <p>The end time for statistics collection. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1720054400000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>inst-demo</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The start time for statistics collection. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1719504000000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetWorkerStatsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkerStatsSummaryRequest self = new GetWorkerStatsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkerStatsSummaryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetWorkerStatsSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetWorkerStatsSummaryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
