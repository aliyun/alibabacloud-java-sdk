// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class QueryCarbonTrackRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Group")
    public String group;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryCarbonTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCarbonTrackRequest self = new QueryCarbonTrackRequest();
        return TeaModel.build(map, self);
    }

    public QueryCarbonTrackRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryCarbonTrackRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryCarbonTrackRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
