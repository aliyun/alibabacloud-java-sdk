// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UpdateSlsStatusNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSlsStatusNewResponseBody body;

    public static UpdateSlsStatusNewResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlsStatusNewResponse self = new UpdateSlsStatusNewResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSlsStatusNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSlsStatusNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSlsStatusNewResponse setBody(UpdateSlsStatusNewResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSlsStatusNewResponseBody getBody() {
        return this.body;
    }

}
