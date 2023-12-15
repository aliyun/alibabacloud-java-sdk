// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSeatsRequest extends TeaModel {
    @NameInMap("ParamsJson")
    public String paramsJson;

    @NameInMap("ScheduleId")
    public Long scheduleId;

    public static TaobaoFilmGetSeatsRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSeatsRequest self = new TaobaoFilmGetSeatsRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSeatsRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

    public TaobaoFilmGetSeatsRequest setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public Long getScheduleId() {
        return this.scheduleId;
    }

}
