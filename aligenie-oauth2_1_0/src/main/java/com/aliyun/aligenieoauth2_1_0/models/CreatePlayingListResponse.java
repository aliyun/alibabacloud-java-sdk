// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePlayingListResponseBody body;

    public static CreatePlayingListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListResponse self = new CreatePlayingListResponse();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePlayingListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePlayingListResponse setBody(CreatePlayingListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePlayingListResponseBody getBody() {
        return this.body;
    }

}
