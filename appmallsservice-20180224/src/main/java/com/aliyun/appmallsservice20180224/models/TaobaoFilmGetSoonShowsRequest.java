// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetSoonShowsRequest extends TeaModel {
    @NameInMap("CityCode")
    public Long cityCode;

    @NameInMap("ParamsJson")
    public String paramsJson;

    public static TaobaoFilmGetSoonShowsRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetSoonShowsRequest self = new TaobaoFilmGetSoonShowsRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetSoonShowsRequest setCityCode(Long cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Long getCityCode() {
        return this.cityCode;
    }

    public TaobaoFilmGetSoonShowsRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
