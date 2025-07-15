// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddShowIntoShowListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddShowIntoShowListResponseBody body;

    public static AddShowIntoShowListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddShowIntoShowListResponse self = new AddShowIntoShowListResponse();
        return TeaModel.build(map, self);
    }

    public AddShowIntoShowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddShowIntoShowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddShowIntoShowListResponse setBody(AddShowIntoShowListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddShowIntoShowListResponseBody getBody() {
        return this.body;
    }

}
