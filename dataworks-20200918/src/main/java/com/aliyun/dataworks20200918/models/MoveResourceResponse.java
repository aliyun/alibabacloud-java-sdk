// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class MoveResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveResourceResponseBody body;

    public static MoveResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceResponse self = new MoveResourceResponse();
        return TeaModel.build(map, self);
    }

    public MoveResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveResourceResponse setBody(MoveResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveResourceResponseBody getBody() {
        return this.body;
    }

}
