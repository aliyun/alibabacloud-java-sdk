// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetResourceByVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceByVersionResponseBody body;

    public static GetResourceByVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceByVersionResponse self = new GetResourceByVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceByVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceByVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceByVersionResponse setBody(GetResourceByVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceByVersionResponseBody getBody() {
        return this.body;
    }

}
