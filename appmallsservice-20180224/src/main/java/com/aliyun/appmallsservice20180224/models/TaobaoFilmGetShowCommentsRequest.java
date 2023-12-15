// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224.models;

import com.aliyun.tea.*;

public class TaobaoFilmGetShowCommentsRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("ParamsJson")
    public String paramsJson;

    @NameInMap("ShowId")
    public Long showId;

    public static TaobaoFilmGetShowCommentsRequest build(java.util.Map<String, ?> map) throws Exception {
        TaobaoFilmGetShowCommentsRequest self = new TaobaoFilmGetShowCommentsRequest();
        return TeaModel.build(map, self);
    }

    public TaobaoFilmGetShowCommentsRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public TaobaoFilmGetShowCommentsRequest setParamsJson(String paramsJson) {
        this.paramsJson = paramsJson;
        return this;
    }
    public String getParamsJson() {
        return this.paramsJson;
    }

    public TaobaoFilmGetShowCommentsRequest setShowId(Long showId) {
        this.showId = showId;
        return this;
    }
    public Long getShowId() {
        return this.showId;
    }

}
