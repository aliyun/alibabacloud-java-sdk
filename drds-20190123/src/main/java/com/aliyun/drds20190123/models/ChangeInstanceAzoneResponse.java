// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeInstanceAzoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeInstanceAzoneResponseBody body;

    public static ChangeInstanceAzoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeInstanceAzoneResponse self = new ChangeInstanceAzoneResponse();
        return TeaModel.build(map, self);
    }

    public ChangeInstanceAzoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeInstanceAzoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeInstanceAzoneResponse setBody(ChangeInstanceAzoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeInstanceAzoneResponseBody getBody() {
        return this.body;
    }

}
