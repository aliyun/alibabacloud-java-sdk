// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationEcuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationEcuResponseBody body;

    public static ListApplicationEcuResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationEcuResponse self = new ListApplicationEcuResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationEcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationEcuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationEcuResponse setBody(ListApplicationEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationEcuResponseBody getBody() {
        return this.body;
    }

}
