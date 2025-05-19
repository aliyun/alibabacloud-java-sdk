// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetMyGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMyGroupsResponseBody body;

    public static GetMyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMyGroupsResponse self = new GetMyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetMyGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMyGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMyGroupsResponse setBody(GetMyGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMyGroupsResponseBody getBody() {
        return this.body;
    }

}
