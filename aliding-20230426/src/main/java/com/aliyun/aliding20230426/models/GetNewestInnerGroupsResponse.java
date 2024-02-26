// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNewestInnerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNewestInnerGroupsResponseBody body;

    public static GetNewestInnerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNewestInnerGroupsResponse self = new GetNewestInnerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetNewestInnerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNewestInnerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNewestInnerGroupsResponse setBody(GetNewestInnerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNewestInnerGroupsResponseBody getBody() {
        return this.body;
    }

}
