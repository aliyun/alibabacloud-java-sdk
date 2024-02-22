// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUsersByProdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsersByProdResponseBody body;

    public static ListUsersByProdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsersByProdResponse self = new ListUsersByProdResponse();
        return TeaModel.build(map, self);
    }

    public ListUsersByProdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsersByProdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsersByProdResponse setBody(ListUsersByProdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsersByProdResponseBody getBody() {
        return this.body;
    }

}
