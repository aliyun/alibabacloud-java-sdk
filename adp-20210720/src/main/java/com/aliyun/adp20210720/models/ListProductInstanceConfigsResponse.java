// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstanceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductInstanceConfigsResponseBody body;

    public static ListProductInstanceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstanceConfigsResponse self = new ListProductInstanceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductInstanceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductInstanceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductInstanceConfigsResponse setBody(ListProductInstanceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductInstanceConfigsResponseBody getBody() {
        return this.body;
    }

}
