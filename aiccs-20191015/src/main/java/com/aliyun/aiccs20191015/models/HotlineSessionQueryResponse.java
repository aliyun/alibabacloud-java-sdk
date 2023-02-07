// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HotlineSessionQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HotlineSessionQueryResponseBody body;

    public static HotlineSessionQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        HotlineSessionQueryResponse self = new HotlineSessionQueryResponse();
        return TeaModel.build(map, self);
    }

    public HotlineSessionQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotlineSessionQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotlineSessionQueryResponse setBody(HotlineSessionQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public HotlineSessionQueryResponseBody getBody() {
        return this.body;
    }

}
