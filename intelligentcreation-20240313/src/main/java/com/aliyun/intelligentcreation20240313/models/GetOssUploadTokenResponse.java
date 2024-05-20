// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetOssUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssUploadTokenResult body;

    public static GetOssUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadTokenResponse self = new GetOssUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetOssUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUploadTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssUploadTokenResponse setBody(GetOssUploadTokenResult body) {
        this.body = body;
        return this;
    }
    public GetOssUploadTokenResult getBody() {
        return this.body;
    }

}
