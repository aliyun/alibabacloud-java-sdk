// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryMovieCommentsRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("MovieId")
    @Validation(required = true)
    public Long movieId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    public static QueryMovieCommentsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMovieCommentsRequest self = new QueryMovieCommentsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMovieCommentsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMovieCommentsRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public QueryMovieCommentsRequest setMovieId(Long movieId) {
        this.movieId = movieId;
        return this;
    }
    public Long getMovieId() {
        return this.movieId;
    }

    public QueryMovieCommentsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

}
