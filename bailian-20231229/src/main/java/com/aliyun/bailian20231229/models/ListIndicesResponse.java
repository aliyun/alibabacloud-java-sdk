// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIndicesResponseBody body;

    public static ListIndicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndicesResponse self = new ListIndicesResponse();
        return TeaModel.build(map, self);
    }

    public ListIndicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIndicesResponse setBody(ListIndicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndicesResponseBody getBody() {
        return this.body;
    }

}
