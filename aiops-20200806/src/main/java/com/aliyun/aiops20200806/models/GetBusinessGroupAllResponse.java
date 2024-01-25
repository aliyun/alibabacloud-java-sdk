// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupAllResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBusinessGroupAllResponseBody body;

    public static GetBusinessGroupAllResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupAllResponse self = new GetBusinessGroupAllResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBusinessGroupAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBusinessGroupAllResponse setBody(GetBusinessGroupAllResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBusinessGroupAllResponseBody getBody() {
        return this.body;
    }

}
