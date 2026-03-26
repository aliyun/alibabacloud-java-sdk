// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightsEventsCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-01-07</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <strong>example:</strong>
     * <p>2026-01-07T06:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>2025-12-01T02:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetInsightsEventsCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInsightsEventsCountRequest self = new GetInsightsEventsCountRequest();
        return TeaModel.build(map, self);
    }

    public GetInsightsEventsCountRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetInsightsEventsCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetInsightsEventsCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
