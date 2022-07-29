// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetOnCallSchedulesDetailRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("StartTime")
    public String startTime;

    public static GetOnCallSchedulesDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnCallSchedulesDetailRequest self = new GetOnCallSchedulesDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetOnCallSchedulesDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetOnCallSchedulesDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetOnCallSchedulesDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
