// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetIndexCurrentValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexCurrentValueResponseBody body;

    public static GetIndexCurrentValueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexCurrentValueResponse self = new GetIndexCurrentValueResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexCurrentValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexCurrentValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexCurrentValueResponse setBody(GetIndexCurrentValueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexCurrentValueResponseBody getBody() {
        return this.body;
    }

}
