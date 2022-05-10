// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetLatestNodeByTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLatestNodeByTypeResponseBody body;

    public static GetLatestNodeByTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLatestNodeByTypeResponse self = new GetLatestNodeByTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetLatestNodeByTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLatestNodeByTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLatestNodeByTypeResponse setBody(GetLatestNodeByTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLatestNodeByTypeResponseBody getBody() {
        return this.body;
    }

}
