// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ListSpecificAdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSpecificAdResponseBody body;

    public static ListSpecificAdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSpecificAdResponse self = new ListSpecificAdResponse();
        return TeaModel.build(map, self);
    }

    public ListSpecificAdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSpecificAdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSpecificAdResponse setBody(ListSpecificAdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSpecificAdResponseBody getBody() {
        return this.body;
    }

}
