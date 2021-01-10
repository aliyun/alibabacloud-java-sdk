// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieSchedulesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CinemaId")
    public Long cinemaId;

    @NameInMap("ExtJson")
    public String extJson;

    public static QueryMovieSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieSchedulesRequest self = new QueryMovieSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryMovieSchedulesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMovieSchedulesRequest setCinemaId(Long cinemaId) {
        this.cinemaId = cinemaId;
        return this;
    }
    public Long getCinemaId() {
        return this.cinemaId;
    }

    public QueryMovieSchedulesRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

}
