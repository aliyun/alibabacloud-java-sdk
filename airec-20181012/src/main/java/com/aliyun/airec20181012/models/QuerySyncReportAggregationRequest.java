// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class QuerySyncReportAggregationRequest extends TeaModel {
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static QuerySyncReportAggregationRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncReportAggregationRequest self = new QuerySyncReportAggregationRequest();
        return TeaModel.build(map, self);
    }

    public QuerySyncReportAggregationRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QuerySyncReportAggregationRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
