// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAuthCodeBindForExtResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAuthCodeBindForExtResponseBody body;

    public static CheckAuthCodeBindForExtResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAuthCodeBindForExtResponse self = new CheckAuthCodeBindForExtResponse();
        return TeaModel.build(map, self);
    }

    public CheckAuthCodeBindForExtResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAuthCodeBindForExtResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAuthCodeBindForExtResponse setBody(CheckAuthCodeBindForExtResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAuthCodeBindForExtResponseBody getBody() {
        return this.body;
    }

}
