// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleoutApplicationWithNewInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ScaleoutApplicationWithNewInstancesResponseBody body;

    public static ScaleoutApplicationWithNewInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleoutApplicationWithNewInstancesResponse self = new ScaleoutApplicationWithNewInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ScaleoutApplicationWithNewInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleoutApplicationWithNewInstancesResponse setBody(ScaleoutApplicationWithNewInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleoutApplicationWithNewInstancesResponseBody getBody() {
        return this.body;
    }

}
