// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class QueryMultiAccountCarbonTrackRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryMultiAccountCarbonTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMultiAccountCarbonTrackRequest self = new QueryMultiAccountCarbonTrackRequest();
        return TeaModel.build(map, self);
    }

    public QueryMultiAccountCarbonTrackRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryMultiAccountCarbonTrackRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
