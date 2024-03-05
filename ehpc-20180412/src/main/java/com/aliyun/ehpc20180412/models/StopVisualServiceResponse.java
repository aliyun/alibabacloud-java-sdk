// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopVisualServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StopVisualServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopVisualServiceResponse setBody(StopVisualServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public StopVisualServiceResponseBody getBody() {
        return this.body;
    }

}
