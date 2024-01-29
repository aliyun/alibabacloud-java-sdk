// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetFileBlobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileBlobsResponseBody body;

    public static GetFileBlobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileBlobsResponse self = new GetFileBlobsResponse();
        return TeaModel.build(map, self);
    }

    public GetFileBlobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileBlobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileBlobsResponse setBody(GetFileBlobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileBlobsResponseBody getBody() {
        return this.body;
    }

}
