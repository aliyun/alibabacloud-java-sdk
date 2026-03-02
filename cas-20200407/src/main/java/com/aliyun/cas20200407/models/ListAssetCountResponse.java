// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListAssetCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAssetCountResponseBody body;

    public static ListAssetCountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAssetCountResponse self = new ListAssetCountResponse();
        return TeaModel.build(map, self);
    }

    public ListAssetCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAssetCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAssetCountResponse setBody(ListAssetCountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAssetCountResponseBody getBody() {
        return this.body;
    }

}
