// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerAccessOverviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerAccessOverviewResponseBody body;

    public static GetConsumerAccessOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerAccessOverviewResponse self = new GetConsumerAccessOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerAccessOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerAccessOverviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerAccessOverviewResponse setBody(GetConsumerAccessOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerAccessOverviewResponseBody getBody() {
        return this.body;
    }

}
