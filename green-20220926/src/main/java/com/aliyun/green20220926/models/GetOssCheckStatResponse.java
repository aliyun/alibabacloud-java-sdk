// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckStatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssCheckStatResponseBody body;

    public static GetOssCheckStatResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckStatResponse self = new GetOssCheckStatResponse();
        return TeaModel.build(map, self);
    }

    public GetOssCheckStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssCheckStatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssCheckStatResponse setBody(GetOssCheckStatResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssCheckStatResponseBody getBody() {
        return this.body;
    }

}
