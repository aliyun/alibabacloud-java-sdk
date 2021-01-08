// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetFileBlobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetFileBlobsResponse setBody(GetFileBlobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileBlobsResponseBody getBody() {
        return this.body;
    }

}
