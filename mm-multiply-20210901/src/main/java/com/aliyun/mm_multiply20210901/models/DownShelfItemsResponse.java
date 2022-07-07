// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class DownShelfItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownShelfItemsResponseBody body;

    public static DownShelfItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownShelfItemsResponse self = new DownShelfItemsResponse();
        return TeaModel.build(map, self);
    }

    public DownShelfItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownShelfItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownShelfItemsResponse setBody(DownShelfItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownShelfItemsResponseBody getBody() {
        return this.body;
    }

}
