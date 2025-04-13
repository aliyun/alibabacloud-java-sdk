// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryIndustryDeviceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIndustryDeviceDataResponseBody body;

    public static QueryIndustryDeviceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryDeviceDataResponse self = new QueryIndustryDeviceDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndustryDeviceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIndustryDeviceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIndustryDeviceDataResponse setBody(QueryIndustryDeviceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIndustryDeviceDataResponseBody getBody() {
        return this.body;
    }

}
