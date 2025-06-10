// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListVideoProcessingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVideoProcessingsResponseBody body;

    public static ListVideoProcessingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVideoProcessingsResponse self = new ListVideoProcessingsResponse();
        return TeaModel.build(map, self);
    }

    public ListVideoProcessingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVideoProcessingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVideoProcessingsResponse setBody(ListVideoProcessingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVideoProcessingsResponseBody getBody() {
        return this.body;
    }

}
