// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TerminateDISyncInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateDISyncInstanceResponseBody body;

    public static TerminateDISyncInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateDISyncInstanceResponse self = new TerminateDISyncInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TerminateDISyncInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateDISyncInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateDISyncInstanceResponse setBody(TerminateDISyncInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateDISyncInstanceResponseBody getBody() {
        return this.body;
    }

}
