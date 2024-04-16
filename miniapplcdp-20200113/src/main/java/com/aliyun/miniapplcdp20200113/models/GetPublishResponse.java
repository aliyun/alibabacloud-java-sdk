// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetPublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPublishResponseBody body;

    public static GetPublishResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishResponse self = new GetPublishResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPublishResponse setBody(GetPublishResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPublishResponseBody getBody() {
        return this.body;
    }

}
