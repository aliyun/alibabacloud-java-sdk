// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateRealTimeProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRealTimeProcessResponseBody body;

    public static CreateRealTimeProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRealTimeProcessResponse self = new CreateRealTimeProcessResponse();
        return TeaModel.build(map, self);
    }

    public CreateRealTimeProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRealTimeProcessResponse setBody(CreateRealTimeProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRealTimeProcessResponseBody getBody() {
        return this.body;
    }

}
