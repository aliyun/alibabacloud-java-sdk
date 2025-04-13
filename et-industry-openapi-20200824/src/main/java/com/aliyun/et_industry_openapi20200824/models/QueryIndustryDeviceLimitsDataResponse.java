// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryIndustryDeviceLimitsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIndustryDeviceLimitsDataResponseBody body;

    public static QueryIndustryDeviceLimitsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryDeviceLimitsDataResponse self = new QueryIndustryDeviceLimitsDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndustryDeviceLimitsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIndustryDeviceLimitsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIndustryDeviceLimitsDataResponse setBody(QueryIndustryDeviceLimitsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIndustryDeviceLimitsDataResponseBody getBody() {
        return this.body;
    }

}
