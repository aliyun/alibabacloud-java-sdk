// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotViewPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotViewPointsResponseBody body;

    public static ListHotViewPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotViewPointsResponse self = new ListHotViewPointsResponse();
        return TeaModel.build(map, self);
    }

    public ListHotViewPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotViewPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotViewPointsResponse setBody(ListHotViewPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotViewPointsResponseBody getBody() {
        return this.body;
    }

}
