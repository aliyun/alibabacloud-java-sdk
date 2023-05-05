// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ChangeAppshowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeAppshowResponseBody body;

    public static ChangeAppshowResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeAppshowResponse self = new ChangeAppshowResponse();
        return TeaModel.build(map, self);
    }

    public ChangeAppshowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeAppshowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeAppshowResponse setBody(ChangeAppshowResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeAppshowResponseBody getBody() {
        return this.body;
    }

}
