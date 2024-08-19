// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CopyServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyServiceConfigResponseBody body;

    public static CopyServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyServiceConfigResponse self = new CopyServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public CopyServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyServiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyServiceConfigResponse setBody(CopyServiceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyServiceConfigResponseBody getBody() {
        return this.body;
    }

}
