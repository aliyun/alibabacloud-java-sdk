// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListPoolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPoolsResponseBody body;

    public static ListPoolsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPoolsResponse self = new ListPoolsResponse();
        return TeaModel.build(map, self);
    }

    public ListPoolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPoolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPoolsResponse setBody(ListPoolsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPoolsResponseBody getBody() {
        return this.body;
    }

}
