// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListConfigTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigTemplatesResponseBody body;

    public static ListConfigTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigTemplatesResponse self = new ListConfigTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigTemplatesResponse setBody(ListConfigTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigTemplatesResponseBody getBody() {
        return this.body;
    }

}
