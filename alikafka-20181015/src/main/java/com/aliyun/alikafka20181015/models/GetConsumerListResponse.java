// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20181015.models;

import com.aliyun.tea.*;

public class GetConsumerListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerListResponseBody body;

    public static GetConsumerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerListResponse self = new GetConsumerListResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerListResponse setBody(GetConsumerListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerListResponseBody getBody() {
        return this.body;
    }

}
