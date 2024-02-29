// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListAllProvincesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllProvincesResponseBody body;

    public static ListAllProvincesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllProvincesResponse self = new ListAllProvincesResponse();
        return TeaModel.build(map, self);
    }

    public ListAllProvincesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllProvincesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllProvincesResponse setBody(ListAllProvincesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllProvincesResponseBody getBody() {
        return this.body;
    }

}
