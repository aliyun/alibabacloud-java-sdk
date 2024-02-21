// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDeprecatedTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeprecatedTemplatesResponseBody body;

    public static ListDeprecatedTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeprecatedTemplatesResponse self = new ListDeprecatedTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeprecatedTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeprecatedTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeprecatedTemplatesResponse setBody(ListDeprecatedTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeprecatedTemplatesResponseBody getBody() {
        return this.body;
    }

}
