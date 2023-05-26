// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListInsightsEventsRequest extends TeaModel {
    /**
     * <p>The details of the event.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Average response-time spikes of application services.</p>
     */
    @NameInMap("InsightsTypes")
    public String insightsTypes;

    /**
     * <p>The types of the events that you want to query. Separate multiple event types with commas (,). If you do not specify this parameter, all events are queried.</p>
     * <br>
     * <p>*   errorIncrease: API error-rate spike events. Examples: HTTP API error-rate spike events and Dubbo API error-rate spike events.</p>
     * <p>*   topErrorIncrease: the top five API error-rate spike events with the highest traffic.</p>
     * <p>*   topRtIncrease: API response-time spike events. Examples: HTTP API response-time spike events and Dubbo API response-time spike events.</p>
     * <p>*   rtIncrease: the top five API response-time spike events with the highest traffic.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The end of the time range to query. The value is a timestamp.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListInsightsEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInsightsEventsRequest self = new ListInsightsEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListInsightsEventsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListInsightsEventsRequest setInsightsTypes(String insightsTypes) {
        this.insightsTypes = insightsTypes;
        return this;
    }
    public String getInsightsTypes() {
        return this.insightsTypes;
    }

    public ListInsightsEventsRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public ListInsightsEventsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListInsightsEventsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
