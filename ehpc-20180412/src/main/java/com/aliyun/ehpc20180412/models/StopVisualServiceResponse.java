// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopVisualServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopVisualServiceResponseBody body;

    public static StopVisualServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopVisualServiceResponse self = new StopVisualServiceResponse();
        return TeaModel.build(map, self);
    }

    public StopVisualServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopVisualServiceResponse setBody(StopVisualServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopVisualServiceResponseBody getBody() {
        return this.body;
    }

}
