// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckFreezeResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssCheckFreezeResultResponseBody body;

    public static GetOssCheckFreezeResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckFreezeResultResponse self = new GetOssCheckFreezeResultResponse();
        return TeaModel.build(map, self);
    }

    public GetOssCheckFreezeResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssCheckFreezeResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssCheckFreezeResultResponse setBody(GetOssCheckFreezeResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssCheckFreezeResultResponseBody getBody() {
        return this.body;
    }

}
