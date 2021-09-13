// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetHistoricalInstanceReportRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static GetHistoricalInstanceReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoricalInstanceReportRequest self = new GetHistoricalInstanceReportRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoricalInstanceReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHistoricalInstanceReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetHistoricalInstanceReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
