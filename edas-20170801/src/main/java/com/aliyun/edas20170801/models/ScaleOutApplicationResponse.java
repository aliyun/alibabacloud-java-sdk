// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleOutApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleOutApplicationResponseBody body;

    public static ScaleOutApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutApplicationResponse self = new ScaleOutApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ScaleOutApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleOutApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleOutApplicationResponse setBody(ScaleOutApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleOutApplicationResponseBody getBody() {
        return this.body;
    }

}
