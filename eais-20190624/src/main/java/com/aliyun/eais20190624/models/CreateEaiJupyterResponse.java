// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiJupyterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEaiJupyterResponseBody body;

    public static CreateEaiJupyterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiJupyterResponse self = new CreateEaiJupyterResponse();
        return TeaModel.build(map, self);
    }

    public CreateEaiJupyterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEaiJupyterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEaiJupyterResponse setBody(CreateEaiJupyterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEaiJupyterResponseBody getBody() {
        return this.body;
    }

}
