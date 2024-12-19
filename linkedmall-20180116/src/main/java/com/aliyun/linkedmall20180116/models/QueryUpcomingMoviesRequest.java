// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUpcomingMoviesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>110100</p>
     */
    @NameInMap("CityCode")
    public Long cityCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtJson")
    public java.util.Map<String, ?> extJson;

    public static QueryUpcomingMoviesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUpcomingMoviesRequest self = new QueryUpcomingMoviesRequest();
        return TeaModel.build(map, self);
    }

    public QueryUpcomingMoviesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUpcomingMoviesRequest setCityCode(Long cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Long getCityCode() {
        return this.cityCode;
    }

    public QueryUpcomingMoviesRequest setExtJson(java.util.Map<String, ?> extJson) {
        this.extJson = extJson;
        return this;
    }
    public java.util.Map<String, ?> getExtJson() {
        return this.extJson;
    }

}
