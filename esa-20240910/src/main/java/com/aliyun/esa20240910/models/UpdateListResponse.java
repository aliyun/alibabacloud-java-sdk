// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateListResponseBody body;

    public static UpdateListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateListResponse self = new UpdateListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateListResponse setBody(UpdateListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateListResponseBody getBody() {
        return this.body;
    }

}
