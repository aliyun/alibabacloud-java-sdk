// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetOssUploadSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssUploadSignResponseBody body;

    public static GetOssUploadSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadSignResponse self = new GetOssUploadSignResponse();
        return TeaModel.build(map, self);
    }

    public GetOssUploadSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUploadSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssUploadSignResponse setBody(GetOssUploadSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssUploadSignResponseBody getBody() {
        return this.body;
    }

}
