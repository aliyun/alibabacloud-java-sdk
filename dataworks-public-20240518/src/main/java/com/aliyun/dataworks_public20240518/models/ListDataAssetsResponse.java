// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAssetsResponseBody body;

    public static ListDataAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetsResponse self = new ListDataAssetsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAssetsResponse setBody(ListDataAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAssetsResponseBody getBody() {
        return this.body;
    }

}
