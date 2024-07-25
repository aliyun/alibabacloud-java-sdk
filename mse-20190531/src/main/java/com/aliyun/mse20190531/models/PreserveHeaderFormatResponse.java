// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class PreserveHeaderFormatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreserveHeaderFormatResponseBody body;

    public static PreserveHeaderFormatResponse build(java.util.Map<String, ?> map) throws Exception {
        PreserveHeaderFormatResponse self = new PreserveHeaderFormatResponse();
        return TeaModel.build(map, self);
    }

    public PreserveHeaderFormatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreserveHeaderFormatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreserveHeaderFormatResponse setBody(PreserveHeaderFormatResponseBody body) {
        this.body = body;
        return this;
    }
    public PreserveHeaderFormatResponseBody getBody() {
        return this.body;
    }

}
