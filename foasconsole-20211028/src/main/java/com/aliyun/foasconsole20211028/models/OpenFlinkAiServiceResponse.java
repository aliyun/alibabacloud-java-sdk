// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class OpenFlinkAiServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenFlinkAiServiceResponseBody body;

    public static OpenFlinkAiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenFlinkAiServiceResponse self = new OpenFlinkAiServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenFlinkAiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenFlinkAiServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenFlinkAiServiceResponse setBody(OpenFlinkAiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenFlinkAiServiceResponseBody getBody() {
        return this.body;
    }

}
