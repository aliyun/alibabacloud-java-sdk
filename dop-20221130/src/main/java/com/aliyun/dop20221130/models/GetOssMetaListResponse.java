// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class GetOssMetaListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssMetaListResponseBody body;

    public static GetOssMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssMetaListResponse self = new GetOssMetaListResponse();
        return TeaModel.build(map, self);
    }

    public GetOssMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssMetaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssMetaListResponse setBody(GetOssMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssMetaListResponseBody getBody() {
        return this.body;
    }

}
