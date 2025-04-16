// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeletePortRangeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePortRangeListResponseBody body;

    public static DeletePortRangeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePortRangeListResponse self = new DeletePortRangeListResponse();
        return TeaModel.build(map, self);
    }

    public DeletePortRangeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePortRangeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePortRangeListResponse setBody(DeletePortRangeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePortRangeListResponseBody getBody() {
        return this.body;
    }

}
