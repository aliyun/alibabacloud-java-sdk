// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class OpenAlimtServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenAlimtServiceResponseBody body;

    public static OpenAlimtServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenAlimtServiceResponse self = new OpenAlimtServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenAlimtServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenAlimtServiceResponse setBody(OpenAlimtServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenAlimtServiceResponseBody getBody() {
        return this.body;
    }

}
