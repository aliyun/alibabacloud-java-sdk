// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetMenuDataStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMenuDataStatusResponseBody body;

    public static GetMenuDataStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMenuDataStatusResponse self = new GetMenuDataStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMenuDataStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMenuDataStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMenuDataStatusResponse setBody(GetMenuDataStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMenuDataStatusResponseBody getBody() {
        return this.body;
    }

}
