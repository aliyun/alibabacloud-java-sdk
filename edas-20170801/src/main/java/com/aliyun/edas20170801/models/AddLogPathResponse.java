// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AddLogPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLogPathResponseBody body;

    public static AddLogPathResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLogPathResponse self = new AddLogPathResponse();
        return TeaModel.build(map, self);
    }

    public AddLogPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLogPathResponse setBody(AddLogPathResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLogPathResponseBody getBody() {
        return this.body;
    }

}
