// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListProductAbilitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductAbilitiesResponseBody body;

    public static ListProductAbilitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductAbilitiesResponse self = new ListProductAbilitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListProductAbilitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductAbilitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductAbilitiesResponse setBody(ListProductAbilitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductAbilitiesResponseBody getBody() {
        return this.body;
    }

}
