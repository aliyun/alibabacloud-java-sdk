// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateGlobalResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGlobalResourceResponseBody body;

    public static CreateGlobalResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalResourceResponse self = new CreateGlobalResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGlobalResourceResponse setBody(CreateGlobalResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalResourceResponseBody getBody() {
        return this.body;
    }

}
