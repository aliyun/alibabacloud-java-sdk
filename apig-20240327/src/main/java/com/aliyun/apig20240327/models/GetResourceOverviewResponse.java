// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetResourceOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceOverviewResponseBody body;

    public static GetResourceOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOverviewResponse self = new GetResourceOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceOverviewResponse setBody(GetResourceOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceOverviewResponseBody getBody() {
        return this.body;
    }

}
