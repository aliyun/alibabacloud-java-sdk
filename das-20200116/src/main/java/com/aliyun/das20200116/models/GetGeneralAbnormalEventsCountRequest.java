// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetGeneralAbnormalEventsCountRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    public static GetGeneralAbnormalEventsCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralAbnormalEventsCountRequest self = new GetGeneralAbnormalEventsCountRequest();
        return TeaModel.build(map, self);
    }

    public GetGeneralAbnormalEventsCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetGeneralAbnormalEventsCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
