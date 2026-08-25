// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetServerIdeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServerIdeInstanceResponseBody body;

    public static GetServerIdeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServerIdeInstanceResponse self = new GetServerIdeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetServerIdeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServerIdeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServerIdeInstanceResponse setBody(GetServerIdeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServerIdeInstanceResponseBody getBody() {
        return this.body;
    }

}
