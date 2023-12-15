// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetCinemasRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("ParamsJson")
    public String paramsJson;

    public static TaobaoFilmGetCinemasRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetCinemasRequest self = new TaobaoFilmGetCinemasRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetCinemasRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public TaobaoFilmGetCinemasRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

}
