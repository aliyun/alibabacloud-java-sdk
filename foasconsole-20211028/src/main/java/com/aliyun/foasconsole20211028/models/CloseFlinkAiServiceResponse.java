// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CloseFlinkAiServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseFlinkAiServiceResponseBody body;

    public static CloseFlinkAiServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseFlinkAiServiceResponse self = new CloseFlinkAiServiceResponse();
        return TeaModel.build(map, self);
    }

    public CloseFlinkAiServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseFlinkAiServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseFlinkAiServiceResponse setBody(CloseFlinkAiServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseFlinkAiServiceResponseBody getBody() {
        return this.body;
    }

}
