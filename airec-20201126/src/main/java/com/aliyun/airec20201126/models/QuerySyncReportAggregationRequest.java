// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class QuerySyncReportAggregationRequest extends TeaModel {
    /**
     * <p>The end time. The value is a timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start time. The value is a timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586673466</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static QuerySyncReportAggregationRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncReportAggregationRequest self = new QuerySyncReportAggregationRequest();
        return TeaModel.build(map, self);
    }

    public QuerySyncReportAggregationRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QuerySyncReportAggregationRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
