// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeletePrefixListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrefixListResponseBody body;

    public static DeletePrefixListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrefixListResponse self = new DeletePrefixListResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrefixListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrefixListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrefixListResponse setBody(DeletePrefixListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrefixListResponseBody getBody() {
        return this.body;
    }

}
