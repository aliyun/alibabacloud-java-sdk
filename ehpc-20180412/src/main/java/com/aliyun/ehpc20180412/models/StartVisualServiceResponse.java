// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartVisualServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartVisualServiceResponseBody body;

    public static StartVisualServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartVisualServiceResponse self = new StartVisualServiceResponse();
        return TeaModel.build(map, self);
    }

    public StartVisualServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartVisualServiceResponse setBody(StartVisualServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartVisualServiceResponseBody getBody() {
        return this.body;
    }

}
