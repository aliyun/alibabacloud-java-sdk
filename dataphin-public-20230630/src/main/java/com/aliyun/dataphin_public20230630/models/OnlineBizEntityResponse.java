// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OnlineBizEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnlineBizEntityResponseBody body;

    public static OnlineBizEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineBizEntityResponse self = new OnlineBizEntityResponse();
        return TeaModel.build(map, self);
    }

    public OnlineBizEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineBizEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineBizEntityResponse setBody(OnlineBizEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineBizEntityResponseBody getBody() {
        return this.body;
    }

}
