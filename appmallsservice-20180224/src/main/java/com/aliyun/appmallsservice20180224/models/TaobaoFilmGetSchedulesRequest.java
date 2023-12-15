// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSchedulesRequest extends TeaModel {
    @NameInMap("CinemaId")
    public Long cinemaId;

    @NameInMap("ParamsJson")
    public String paramsJson;

    public static TaobaoFilmGetSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSchedulesRequest self = new TaobaoFilmGetSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSchedulesRequest setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
        return this;
    }
    public Long getCinemaId() {
        return this.cinemaId;
    }

    public TaobaoFilmGetSchedulesRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
