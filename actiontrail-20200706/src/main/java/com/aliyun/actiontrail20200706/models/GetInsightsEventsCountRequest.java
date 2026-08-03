// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetInsightsEventsCountRequest extends TeaModel {
    /**
     * <p>The date to query. The format is <code>yyyy-MM-dd</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-07</p>
     */
    @NameInMap("Date")
    public String date;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><ul>
     * <li><p>If Date, StartTime, and EndTime are all left empty, the system queries the number of events in the last 24 hours.</p>
     * </li>
     * <li><p>If Date is specified, the StartTime and EndTime parameters are ignored. The system queries the number of events on the specified date.</p>
     * </li>
     * <li><p>If Date is left empty and both StartTime and EndTime are specified, the system queries the number of events in the specified time range.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2026-01-07T06:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
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
