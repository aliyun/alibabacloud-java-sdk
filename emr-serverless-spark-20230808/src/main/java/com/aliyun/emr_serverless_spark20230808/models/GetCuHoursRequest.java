// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GetCuHoursRequest extends TeaModel {
    /**
     * <p>The end time of the query time range.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-08 00:00:00</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The start time of the query time range.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static GetCuHoursRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCuHoursRequest self = new GetCuHoursRequest();
        return TeaModel.build(map, self);
    }

    public GetCuHoursRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetCuHoursRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
