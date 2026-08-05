// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CopyAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyAppConfigResponseBody body;

    public static CopyAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyAppConfigResponse self = new CopyAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public CopyAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyAppConfigResponse setBody(CopyAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyAppConfigResponseBody getBody() {
        return this.body;
    }

}
