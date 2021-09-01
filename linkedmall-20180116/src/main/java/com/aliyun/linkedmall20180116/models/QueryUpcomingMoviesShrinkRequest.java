// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUpcomingMoviesShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CityCode")
    public Long cityCode;

    @NameInMap("ExtJson")
    public String extJsonShrink;

    public static QueryUpcomingMoviesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUpcomingMoviesShrinkRequest self = new QueryUpcomingMoviesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryUpcomingMoviesShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUpcomingMoviesShrinkRequest setCityCode(Long cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Long getCityCode() {
        return this.cityCode;
    }

    public QueryUpcomingMoviesShrinkRequest setExtJsonShrink(String extJsonShrink) {
        this.extJsonShrink = extJsonShrink;
        return this;
    }
    public String getExtJsonShrink() {
        return this.extJsonShrink;
    }

}
