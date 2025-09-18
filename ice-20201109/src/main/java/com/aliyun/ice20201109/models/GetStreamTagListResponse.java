// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetStreamTagListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStreamTagListResponseBody body;

    public static GetStreamTagListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStreamTagListResponse self = new GetStreamTagListResponse();
        return TeaModel.build(map, self);
    }

    public GetStreamTagListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStreamTagListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStreamTagListResponse setBody(GetStreamTagListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStreamTagListResponseBody getBody() {
        return this.body;
    }

}
