// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAllCinemasRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("CityCode")
    @Validation(required = true)
    public Long cityCode;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    public static QueryAllCinemasRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAllCinemasRequest self = new QueryAllCinemasRequest();
        return TeaModel.build(map, self);
    }

    public QueryAllCinemasRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryAllCinemasRequest setCityCode(Long cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public Long getCityCode() {
        return this.cityCode;
    }

    public QueryAllCinemasRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public QueryAllCinemasRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

}
