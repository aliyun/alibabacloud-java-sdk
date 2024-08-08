// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMultipartFileUploadInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultipartFileUploadInfosResponseBody body;

    public static GetMultipartFileUploadInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultipartFileUploadInfosResponse self = new GetMultipartFileUploadInfosResponse();
        return TeaModel.build(map, self);
    }

    public GetMultipartFileUploadInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultipartFileUploadInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultipartFileUploadInfosResponse setBody(GetMultipartFileUploadInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultipartFileUploadInfosResponseBody getBody() {
        return this.body;
    }

}
