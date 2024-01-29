// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetSearchCodePreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSearchCodePreviewResponseBody body;

    public static GetSearchCodePreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSearchCodePreviewResponse self = new GetSearchCodePreviewResponse();
        return TeaModel.build(map, self);
    }

    public GetSearchCodePreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSearchCodePreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSearchCodePreviewResponse setBody(GetSearchCodePreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSearchCodePreviewResponseBody getBody() {
        return this.body;
    }

}
