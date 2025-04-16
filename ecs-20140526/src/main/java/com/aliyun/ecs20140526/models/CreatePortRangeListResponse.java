// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePortRangeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePortRangeListResponseBody body;

    public static CreatePortRangeListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePortRangeListResponse self = new CreatePortRangeListResponse();
        return TeaModel.build(map, self);
    }

    public CreatePortRangeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePortRangeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePortRangeListResponse setBody(CreatePortRangeListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePortRangeListResponseBody getBody() {
        return this.body;
    }

}
