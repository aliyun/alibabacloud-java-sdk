// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class QueryIndustryDeviceStatusDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryIndustryDeviceStatusDataResponseBody body;

    public static QueryIndustryDeviceStatusDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryDeviceStatusDataResponse self = new QueryIndustryDeviceStatusDataResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndustryDeviceStatusDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIndustryDeviceStatusDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryIndustryDeviceStatusDataResponse setBody(QueryIndustryDeviceStatusDataResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIndustryDeviceStatusDataResponseBody getBody() {
        return this.body;
    }

}
