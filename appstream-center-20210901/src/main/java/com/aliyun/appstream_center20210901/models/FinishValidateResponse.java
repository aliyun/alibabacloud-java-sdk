// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class FinishValidateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FinishValidateResponseBody body;

    public static FinishValidateResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishValidateResponse self = new FinishValidateResponse();
        return TeaModel.build(map, self);
    }

    public FinishValidateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishValidateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishValidateResponse setBody(FinishValidateResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishValidateResponseBody getBody() {
        return this.body;
    }

}
