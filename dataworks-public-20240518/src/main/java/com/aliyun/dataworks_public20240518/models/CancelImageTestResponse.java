// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CancelImageTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelImageTestResponseBody body;

    public static CancelImageTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelImageTestResponse self = new CancelImageTestResponse();
        return TeaModel.build(map, self);
    }

    public CancelImageTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelImageTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelImageTestResponse setBody(CancelImageTestResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelImageTestResponseBody getBody() {
        return this.body;
    }

}
