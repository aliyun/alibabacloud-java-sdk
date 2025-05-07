// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxbBindFixedLineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAxbBindFixedLineResponseBody body;

    public static UpdateAxbBindFixedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxbBindFixedLineResponse self = new UpdateAxbBindFixedLineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAxbBindFixedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAxbBindFixedLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAxbBindFixedLineResponse setBody(UpdateAxbBindFixedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAxbBindFixedLineResponseBody getBody() {
        return this.body;
    }

}
