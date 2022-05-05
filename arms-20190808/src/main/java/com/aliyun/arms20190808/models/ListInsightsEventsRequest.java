// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListInsightsEventsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InsightsTypes")
    public String insightsTypes;

    @NameInMap("Pid")
    public String pid;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

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
