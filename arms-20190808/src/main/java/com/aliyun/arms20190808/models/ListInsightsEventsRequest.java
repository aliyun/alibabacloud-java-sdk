// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListInsightsEventsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1480607940000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The types of the events that you want to query. Separate multiple event types with commas (,). If you do not specify this parameter, all events are queried.</p>
     * <ul>
     * <li>errorIncrease: API error-rate spike events. Examples: HTTP API error-rate spike events and Dubbo API error-rate spike events.</li>
     * <li>topErrorIncrease: the top five API error-rate spike events with the highest traffic.</li>
     * <li>topRtIncrease: API response-time spike events. Examples: HTTP API response-time spike events and Dubbo API response-time spike events.</li>
     * <li>rtIncrease: the top five API response-time spike events with the highest traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>errorIncrease,topErrorIncrease,topExceptionIncrease,topRtIncrease,rtIncrease</p>
     */
    @NameInMap("InsightsTypes")
    public String insightsTypes;

    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>aokcdqn3ly@a195c6d6421****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start of the time range to query. The value is a timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1595174400000</p>
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
