// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class GetSummaryDataRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Group")
    public String group;

    @NameInMap("StartTime")
    public String startTime;

    public static GetSummaryDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryDataRequest self = new GetSummaryDataRequest();
        return TeaModel.build(map, self);
    }

    public GetSummaryDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetSummaryDataRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public GetSummaryDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
