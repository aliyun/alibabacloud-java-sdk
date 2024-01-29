// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetUrlUploadInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUrlUploadInfosResponseBody body;

    public static GetUrlUploadInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUrlUploadInfosResponse self = new GetUrlUploadInfosResponse();
        return TeaModel.build(map, self);
    }

    public GetUrlUploadInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUrlUploadInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUrlUploadInfosResponse setBody(GetUrlUploadInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUrlUploadInfosResponseBody getBody() {
        return this.body;
    }

}
