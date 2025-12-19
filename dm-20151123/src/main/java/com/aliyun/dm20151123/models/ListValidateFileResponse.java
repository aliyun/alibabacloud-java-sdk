// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListValidateFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListValidateFileResponseBody body;

    public static ListValidateFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListValidateFileResponse self = new ListValidateFileResponse();
        return TeaModel.build(map, self);
    }

    public ListValidateFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListValidateFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListValidateFileResponse setBody(ListValidateFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ListValidateFileResponseBody getBody() {
        return this.body;
    }

}
