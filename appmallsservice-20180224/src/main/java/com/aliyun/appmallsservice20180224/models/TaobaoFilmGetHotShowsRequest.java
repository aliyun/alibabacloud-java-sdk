// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetHotShowsRequest extends TeaModel {
    @NameInMap("CityCode")
    public Long cityCode;

    @NameInMap("ParamsJson")
    public String paramsJson;

    public static TaobaoFilmGetHotShowsRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetHotShowsRequest self = new TaobaoFilmGetHotShowsRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetHotShowsRequest setCityCode(Long cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Long getCityCode() {
        return this.cityCode;
    }

    public TaobaoFilmGetHotShowsRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
