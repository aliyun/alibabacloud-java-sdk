// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class ListImageCachesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImageCachesResponseBody body;

    public static ListImageCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImageCachesResponse self = new ListImageCachesResponse();
        return TeaModel.build(map, self);
    }

    public ListImageCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImageCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImageCachesResponse setBody(ListImageCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImageCachesResponseBody getBody() {
        return this.body;
    }

}
