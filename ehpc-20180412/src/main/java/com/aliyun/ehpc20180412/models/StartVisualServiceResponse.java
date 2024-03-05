// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StartVisualServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StartVisualServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartVisualServiceResponse setBody(StartVisualServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StartVisualServiceResponseBody getBody() {
        return this.body;
    }

}
