// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetPageVisitDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPageVisitDataResponseBody body;

    public static GetPageVisitDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageVisitDataResponse self = new GetPageVisitDataResponse();
        return TeaModel.build(map, self);
    }

    public GetPageVisitDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageVisitDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPageVisitDataResponse setBody(GetPageVisitDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageVisitDataResponseBody getBody() {
        return this.body;
    }

}
