// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateEnterprisePauseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClinkCreateEnterprisePauseResponseBody body;

    public static ClinkCreateEnterprisePauseResponse build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateEnterprisePauseResponse self = new ClinkCreateEnterprisePauseResponse();
        return TeaModel.build(map, self);
    }

    public ClinkCreateEnterprisePauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClinkCreateEnterprisePauseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClinkCreateEnterprisePauseResponse setBody(ClinkCreateEnterprisePauseResponseBody body) {
        this.body = body;
        return this;
    }
    public ClinkCreateEnterprisePauseResponseBody getBody() {
        return this.body;
    }

}
