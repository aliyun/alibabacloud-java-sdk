// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryHotMoviesRequest extends TeaModel {
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
     * <p>310100</p>
     */
    @NameInMap("CityCode")
    public Long cityCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
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
