// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetOnCallSchedulesDetailRequest extends TeaModel {
    /**
     * <p>The date on which the shift ends. Format: `yyyy-MM-dd`.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the scheduling policy.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The date from which the shift starts. Format: `yyyy-MM-dd`.</p>
     */
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
