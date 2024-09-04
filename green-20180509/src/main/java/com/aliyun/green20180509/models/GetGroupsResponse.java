// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGroupsResponseBody body;

    public static GetGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGroupsResponse self = new GetGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGroupsResponse setBody(GetGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGroupsResponseBody getBody() {
        return this.body;
    }

}
