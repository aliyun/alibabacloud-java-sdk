// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineCallActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotlineCallActionResponseBody body;

    public static GetHotlineCallActionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineCallActionResponse self = new GetHotlineCallActionResponse();
        return TeaModel.build(map, self);
    }

    public GetHotlineCallActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotlineCallActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotlineCallActionResponse setBody(GetHotlineCallActionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotlineCallActionResponseBody getBody() {
        return this.body;
    }

}
