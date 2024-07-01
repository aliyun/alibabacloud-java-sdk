// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetViewDDLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetViewDDLResponseBody body;

    public static GetViewDDLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetViewDDLResponse self = new GetViewDDLResponse();
        return TeaModel.build(map, self);
    }

    public GetViewDDLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetViewDDLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetViewDDLResponse setBody(GetViewDDLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetViewDDLResponseBody getBody() {
        return this.body;
    }

}
