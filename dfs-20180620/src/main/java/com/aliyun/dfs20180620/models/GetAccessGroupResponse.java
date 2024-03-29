// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetAccessGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccessGroupResponseBody body;

    public static GetAccessGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessGroupResponse self = new GetAccessGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccessGroupResponse setBody(GetAccessGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessGroupResponseBody getBody() {
        return this.body;
    }

}
