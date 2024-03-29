// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CopyCdsFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyCdsFileResponseBody body;

    public static CopyCdsFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyCdsFileResponse self = new CopyCdsFileResponse();
        return TeaModel.build(map, self);
    }

    public CopyCdsFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyCdsFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyCdsFileResponse setBody(CopyCdsFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyCdsFileResponseBody getBody() {
        return this.body;
    }

}
