// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAllProdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllProdsResponseBody body;

    public static ListAllProdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllProdsResponse self = new ListAllProdsResponse();
        return TeaModel.build(map, self);
    }

    public ListAllProdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllProdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllProdsResponse setBody(ListAllProdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllProdsResponseBody getBody() {
        return this.body;
    }

}
