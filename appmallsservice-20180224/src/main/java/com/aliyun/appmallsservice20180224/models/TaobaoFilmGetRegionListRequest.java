// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetRegionListRequest extends TeaModel {
    @NameInMap("ParamsJson")
    public String paramsJson;

    public static TaobaoFilmGetRegionListRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetRegionListRequest self = new TaobaoFilmGetRegionListRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetRegionListRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
