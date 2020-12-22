// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddBodyTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddBodyTraceResponseBody body;

    public static AddBodyTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBodyTraceResponse self = new AddBodyTraceResponse();
        return TeaModel.build(map, self);
    }

    public AddBodyTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBodyTraceResponse setBody(AddBodyTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBodyTraceResponseBody getBody() {
        return this.body;
    }

}
