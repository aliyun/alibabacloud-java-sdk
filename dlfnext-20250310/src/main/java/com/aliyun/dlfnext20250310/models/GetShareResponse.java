// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Share body;

    public static GetShareResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareResponse self = new GetShareResponse();
        return TeaModel.build(map, self);
    }

    public GetShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShareResponse setBody(Share body) {
        this.body = body;
        return this;
    }
    public Share getBody() {
        return this.body;
    }

}
