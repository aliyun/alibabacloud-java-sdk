// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetIndexCurrentValueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
