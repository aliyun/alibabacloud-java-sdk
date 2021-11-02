// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryHotMoviesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("CityCode")
    public Long cityCode;

    @NameInMap("ExtJson")
    public String extJson;

    public static QueryHotMoviesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotMoviesRequest self = new QueryHotMoviesRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotMoviesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryHotMoviesRequest setCityCode(Long cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Long getCityCode() {
        return this.cityCode;
    }

    public QueryHotMoviesRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

}
