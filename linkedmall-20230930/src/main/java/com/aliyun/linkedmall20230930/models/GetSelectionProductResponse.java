// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetSelectionProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Product body;

    public static GetSelectionProductResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSelectionProductResponse self = new GetSelectionProductResponse();
        return TeaModel.build(map, self);
    }

    public GetSelectionProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSelectionProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSelectionProductResponse setBody(Product body) {
        this.body = body;
        return this;
    }
    public Product getBody() {
        return this.body;
    }

}
